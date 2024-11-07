/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class03.blocktwo;

import java.awt.Point;
import java.util.Scanner;

public class Block2Exercise01 {

  // EXERCISE - N - QUEENS / EJERCICIO - N - REINAS.
  // [EN] Implement a function that validates if a solution is valid
  // [ES] Implemente una función que valide si una solución es válida

  private static final int HEIGHT_WIDTH = 4;

  public static void main(String[] args) {
    nQueensExercise2();
    System.out.println("Good bye!");
  }

  private static void nQueensExercise2() {
    // dar bienvenida
    System.out.println("Welcome to the game N Queens:");
    System.out.println("Insert 4 queens");

    // tomar 4 valores ingresados n x n, y que no se repitan
    Scanner scanner = new Scanner(System.in);
    int[][] queens = new int[HEIGHT_WIDTH][HEIGHT_WIDTH];
    int insertedQueens = 0;

    while (insertedQueens < 4) {
      System.out.println(String.format("Insert the row of the Queen number: %d", insertedQueens));
      int row = scanner.nextInt();
      System.out.println(
          String.format("Insert the column of the Queen number: %d", insertedQueens));
      int column = scanner.nextInt();
      if (row > HEIGHT_WIDTH || column > HEIGHT_WIDTH) {
        System.out.println("The inserted values out of bounds. Please Try Again.");
        continue;
      } else if (row <= 0 || column <= 0) {
        System.out.println("Row and Column can't be zero or negative. Please Try Again.");
        continue;
      } else if (queens[row - 1][column - 1] == 1) {
        System.out.println("A Queen is in this position, Please Try Again");
        continue;
      } else {
        queens[row - 1][column - 1] = 1;
        insertedQueens++;
      }
    }
    SquareMatrixBordersV2 board = new SquareMatrixBordersV2(queens);
    System.out.println(board.getDisplayMatrix());

    // validar el N reinas
    nQueensValidation(queens);
  }

  private static void nQueensValidation(int[][] queens) {
    Point[] queensPositions = new Point[HEIGHT_WIDTH];
    int insertion = 0;
    for (int i = 0; i < queens.length; i++) {
      for (int j = 0; j < queens[i].length; j++) {
        if (queens[i][j] == 1) {
          queensPositions[insertion] = new Point(i, j);
        }
      }
    }
    
  }

  private static void nQueensExercise() {
    System.out.println("[[ N - QUEENS - GAME ]]");
    System.out.println(
        String.format(
            "Here we have a %d x %d board. \nInsert four Queens in the board.\n",
            HEIGHT_WIDTH, HEIGHT_WIDTH));

    String[][] board = new String[HEIGHT_WIDTH][HEIGHT_WIDTH];
    SquareMatrixBordersV2 boardPositions =
        new SquareMatrixBordersV2(createBoardPositions(HEIGHT_WIDTH));
    SquareMatrixBordersV2 boardDrawing = new SquareMatrixBordersV2();
    Scanner scanner = new Scanner(System.in);
    int insertedQueens = 0;

    System.out.println("Position names:");
    System.out.println(boardPositions.getDisplayMatrix());
    System.out.println(String.format("Inserted Queens: ", insertedQueens));
    boardDrawing.setOriginalMatrix(board);
    System.out.println(boardDrawing.getDisplayMatrix());

    System.out.println(
        String.format("Insert position for the queen number %d.", insertedQueens + 1));
    Point insertPos = getBoardPosition(scanner.nextLine().trim());

    /*
    String[][] matrix2 = new String[3][3];

    matrix2[0][1] = "1";
    matrix2[0][2] = "1";
    matrix2[1][0] = "1";
    matrix2[1][2] = "1";
    matrix2[2][0] = "1";
    matrix2[2][1] = "1";
    matrix2[2][2] = "1";

    SquareMatrixBordersV2 bordersMatrix = new SquareMatrixBordersV2(matrix2);
    System.out.println(bordersMatrix.getDisplayMatrix2());
    */
  }

  private static Point getBoardPosition(String trim) {
    // 65 es A que es el numero 1 y el indice 0.

  }

  private static String[][] userInputQueens(int size) {

    return null;

    /*
    while (count < size || !wellPositioned) {
      String position = "";
      boardDrawing.setOriginalMatrix(board);
      if (!wellPositioned && count != 0) {
        System.out.println("Is a not valid position\npPlease retry...");
      }
      System.out.println(boardDrawing.getDisplayMatrix2());
      System.out.println("Insert a new position, examples: A2, B4, C3 or D1");
    }
    return null;
    */
  }

  private static String[][] createBoardPositions(int size) {
    String[][] positions = new String[size][size];
    for (int i = 0; i < positions.length; i++) {
      int number = i + 1;
      for (int j = 0; j < positions[0].length; j++) {
        char letter = (char) (65 + j);
        positions[i][j] = String.format("%c%d", letter, number);
      }
    }
    return positions;
  }
}
