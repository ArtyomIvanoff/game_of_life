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
    
    private final Random random = new Random();

    public CellSetFactory(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;

        random.setSeed(System.currentTimeMillis());
    }

    public CellSet newInstance(int percent_Alived) {
        boolean[][] cellField = new boolean[rows][columns];
        CellSet cellSet = new CellSet(cellField);

        // how many % cells will be alived in the 1st generation
        int numAlived = rows * columns * percent_Alived / 100;

        for (int i = 0; i < numAlived; i++) {
            int x = random.nextInt(rows);
            int y = random.nextInt(columns);

            cellSet.setCellStatus(x, y, true);
        }

        return cellSet;
    }

    public CellSet invertCell(CellSet cellSet, int row, int column) {
        cellSet.invertCellState(row, column);

        return cellSet;
    }
    
    public CellSet newInstance() {
        return new CellSet(new boolean[rows][columns]);
    }
}
