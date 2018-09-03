/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.artyom.app.game_life.cells;

import java.util.Random;

/**
 *
 * @author 122
 */
public class CellSetFactory {
    private int rows;
    private int columns;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
    private Random random = new Random();
    
    public CellSetFactory(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        
        random.setSeed(System.currentTimeMillis());
    }
    
    public CellSet newInstance(int numAlived) {
        boolean[][] cellField = new boolean[rows][columns];
        CellSet cellSet = new CellSet(cellField);
        for(int i = 0; i < numAlived; i++) {
            int x = random.nextInt(rows);
            int y = random.nextInt(columns);
            
            cellSet.setCellStatus(x, y, true);
        }
        
        return cellSet;
    }
    
    public CellSet addGlider(CellSet cellSet, int row, int column) {
     // set the center of glider
        cellSet.setCellStatus(row, column, true);
        // set upper wing
        cellSet.setCellStatus(row-1, column-1, true);
        // set down wing
        cellSet.setCellStatus(row+1, column, true);
        cellSet.setCellStatus(row+1, column-1, true);
        // set head part
        cellSet.setCellStatus(row, column+1, true);
        
        return cellSet;
    }
    
    public CellSet newGlider(int row, int column) {
        boolean[][] cellField = new boolean[rows][columns];
        
        CellSet cellSet = new CellSet(cellField);
        
        return addGlider(cellSet, row, column);
    }
    
    public CellSet invertCell(CellSet cellSet, int row, int column) {
        cellSet.invertCellState(row, column);
        
        return cellSet;
    }
    
    public CellSet newInstance() {
        return new CellSet(new boolean[rows][columns]);
    }
    
    public enum Mode {
       ADD_GLIDER, INVERT_CELL
    }
}
