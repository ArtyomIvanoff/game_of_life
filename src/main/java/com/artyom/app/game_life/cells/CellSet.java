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
    private int numRows;
    private int numColumns;
	
    public boolean[][] getCells() {
        return cells;
    }
 
    public CellSet(int rows) {
        cells = new boolean[rows][rows];
        numRows = cells.length;
        numColumns = numRows;
    }
    
    CellSet(boolean[][] cells) {
        this.cells = cells;
        numRows = cells.length;
        numColumns = cells[0].length;
    }
    
    public int getRows() {
        return numRows;
    }

    public int getColumns() {
        return numColumns;
    }
    
    public void setCellStatus(int row, int col, boolean value) {
        row = normalizeRow(row);
        col = normalizeColumn(col);
        
        cells[row][col] = value;
    }
    
    /**
     * Get a state of the specified cell
     * @param row Row of the specified cell
     * @param col Column of the specified cell
     * @return true if this cell is alive, false if it' dead
     */
    public boolean isAlived(int row, int col) {
        row = normalizeRow(row);
        col = normalizeColumn(col);
        
        return cells[row][col];
    }
    
    /**
     * Changed a state of the specified cell to opposite
     * @param row Row of the specified cell
     * @param col Column of the specified cell
     */
    public void invertCellState(int row, int col) {
        row = normalizeRow(row);
        col = normalizeColumn(col);
        
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
        
        int leftCol = normalizeColumn(col-1);
        int rightCol = normalizeColumn(col+1);
        int upperRow = normalizeRow(row-1);
        int downRow = normalizeRow(row+1);
        
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
    
    public void addGlider(int row, int column) {
        // set the center of glider
        setCellStatus(row, column, true);
        // set upper wing
        setCellStatus(row - 1, column - 1, true);
        // set down wing
        setCellStatus(row + 1, column, true);
        setCellStatus(row + 1, column - 1, true);
        // set head part
        setCellStatus(row, column + 1, true);
    }
    
    public void addNine(int row, int column) {
        // set the center line of nine
        setCellStatus(row, column, true);
        setCellStatus(row, column-1, true);
        setCellStatus(row, column+1, true);
        
        // set the upper arc
        setCellStatus(row-2, column, true);
        setCellStatus(row-2, column-1, true);
        setCellStatus(row-2, column+1, true);
        setCellStatus(row-1, column-1, true);
        setCellStatus(row-1, column+1, true);
        
        // set the down hook
        setCellStatus(row+2, column, true);
        setCellStatus(row+2, column-1, true);
        setCellStatus(row+2, column+1, true);
        setCellStatus(row+1, column+1, true);
    }
    
    public void addEight(int row, int column) {
        // just draw 9 and activate one cell more
        this.addNine(row, column);
        setCellStatus(row+1, column-1, true);
    }
    
    public void addCorn(int row, int column) {
        /* corn is like: 
           * *
         * *   *
           * *
       */
        
        setCellStatus(row, column, true);
        setCellStatus(row, column-1, true);
        setCellStatus(row-1, column, true);
        setCellStatus(row-1, column+1, true);
        setCellStatus(row+1, column, true);
        setCellStatus(row+1, column+1, true);
        setCellStatus(row, column+2, true);
    }
    
    public enum Mode {
        ADD_GLIDER, INVERT_CELL, ADD_NINE, ADD_EIGHT, ADD_CORN
    }
    
    private int normalizeRow(int row) {
       return (row + numRows) % numRows; 
    }
    
    private int normalizeColumn(int column) {
        return (column + numColumns) % numColumns;
    }
}
