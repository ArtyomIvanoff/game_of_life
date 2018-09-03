/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artyom.app.game_life.controller;

import com.artyom.app.game_life.cells.CellSet;
import com.artyom.app.game_life.cells.PairIndices;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author 122
 */
public class CellController {

    private CellSet cellSet;
    private Set<PairIndices> candidates;
    private final int minAlive = 2;
    private final int maxAlive = 3;
	private int generation = 0;
	
	public int getGeneration() { return generation; }
	public void setGeneration(int gen) { this.generation = gen; }

    public CellController(CellSet cellSet) {
        this.setCellSet(cellSet);
    }
    
    public void setCellSet(CellSet cellSet) {
        this.cellSet = cellSet;
        this.candidates = CellController.getCandSetFrom(cellSet);
    }
    
    /**
     * Updating the cell set and the set of candidates for the next generation
     *
     * @return updated cell set
     */
    public CellSet getNextGeneration() {
        // get the map when the key - cells which changed the state, the value - their neighbours
        Map<PairIndices, Set<PairIndices>> changedCells = getChangedCellsWithNeighbours();
        // the count of new candidates is it (8 neighbours + cell itself)
        candidates = new HashSet<>(changedCells.size()*9);
        changedCells.entrySet().stream().forEach((pair) -> {
            PairIndices pairIndices = pair.getKey();
            int row = pairIndices.row;
            int col = pairIndices.col;
            cellSet.invertCellState(row, col);
            // add changed cell itself
            candidates.add(pairIndices);
            // and set of 8 neighbours
            candidates.addAll(pair.getValue());
        });
		// increase the number of generation
		generation += 1;
		
        return cellSet;
    }

    /**
     * Getting the set of cells which are alived and their neighbours
     *
     * @param cellSet
     * @return set of pair of indices
     */
    public static Set<PairIndices> getCandSetFrom(CellSet cellSet) {
        int rows = cellSet.getRows();
        int columns = cellSet.getColumns();
        Set<PairIndices> cands = new HashSet<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (cellSet.isAlived(i, j)) {
                    cands.add(new PairIndices(i, j));
                    cands.addAll(cellSet.getNeighbourIndices(i, j));
                }
            }
        }

        return cands;
    }
    
    private Map<PairIndices, Set<PairIndices>> getChangedCellsWithNeighbours() {
        Map<PairIndices, Set<PairIndices>> changedCells = new HashMap<>();
        
        for (PairIndices pairInd : candidates) {
            Set<PairIndices> neighbourIndices = cellSet.getNeighbourIndices(pairInd.row, pairInd.col);
            long numAlived = neighbourIndices.stream()
                    .filter(ind -> cellSet.isAlived(ind.row, ind.col))
                    .count();
            boolean isAlive = cellSet.isAlived(pairInd.row, pairInd.col);

            if ((!isAlive && numAlived == maxAlive)
                    || (isAlive && (numAlived < minAlive || numAlived > maxAlive))) {
                   changedCells.put(pairInd, neighbourIndices);
            }
        }
        
        return changedCells;
    }
}
