/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artyom.app.game_life.cells;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author 122
 */
public class CellSet {
    // the set of cells, every of them can be dead (false) or alive (true)
    private boolean[][] cells;

    public boolean[][] getCells() {
        return cells;
    }

    public void setCells(boolean[][] cells) {
        this.cells = cells;
    }

    public CellSet(int rows) {
        cells = new boolean[rows][rows];
    }
    
    public CellSet(boolean[][] cells) {
        this.cells = cells;
    }
    
    public void setCellStatus(int row, int col, boolean value) {
        row = row % cells.length;
        col = col % cells[0].length;
        
        cells[row][col] = value;
    }
    
    /**
     * Get a state of the specified cell
     * @param row Row of the specified cell
     * @param col Column of the specified cell
     * @return true if this cell is alive, false if it' dead
     */
    public boolean isAlived(int row, int col) {
        row = row % cells.length;
        col = col % cells[0].length;
        
        return cells[row][col];
    }
    
    /**
     * Changed a state of the specified cell to opposite
     * @param row Row of the specified cell
     * @param col Column of the specified cell
     */
    public void invertCellState(int row, int col) {
        row = row % cells.length;
        col = col % cells[0].length;
        
        cells[row][col] = !cells[row][col];
    }
    
    /**
     * Get a set of indices of the cell's neighbours 
     * @param row row of the cell
     * @param col column of the cell
     * @return set of indices
     */
    public Set<PairIndices> getNeighbourIndices(int row, int col) {
        Set<PairIndices> neigSet = new HashSet<>(8);
        
        int leftCol = getLowerBound(col);
        int rightCol = getUpperBound(col);
        int upperRow = getLowerBound(row);
        int downRow = getUpperBound(row);
        
        neigSet.add(new PairIndices(upperRow, leftCol));
        neigSet.add(new PairIndices(row, leftCol));
        neigSet.add(new PairIndices(downRow, leftCol));
        
        neigSet.add(new PairIndices(upperRow, rightCol));
        neigSet.add(new PairIndices(row, rightCol));
        neigSet.add(new PairIndices(downRow, rightCol));
        
        neigSet.add(new PairIndices(upperRow, col));
        neigSet.add(new PairIndices(downRow, col));
        
        return neigSet;
    }
    
    private int getLowerBound(int ind) {
        int n = cells.length;
        
        if(ind == 0)
            return n-1;
        else
            return ind-1;
    }
    
    private int getUpperBound(int ind) {
        int n = cells.length;
        
        if(ind == n-1)
            return 0;
        else
            return ind+1;
    }

    public int getRows() {
        return cells.length;
    }

    public int getColumns() {
        return cells[0].length;
    }
    
}
