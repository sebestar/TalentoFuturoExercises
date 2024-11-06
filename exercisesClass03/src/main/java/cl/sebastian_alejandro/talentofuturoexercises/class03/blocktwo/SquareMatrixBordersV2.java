/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class03.blocktwo;

public class SquareMatrixBordersV2 {

  private final String UP_LEFT_BORDER = "╭";
  private final String UP_RIGHT_BORDER = "╮";
  private final String DOWN_LEFT_BORDER = "╰";
  private final String DOWN_RIGHT_BORDER = "╯";
  private final String HORIZONTAL_LINE = "─";
  private final String VERTICAL_LINE = "│";
  private final String UP_ELBOW = "┬";
  private final String DOWN_ELBOW = "┴";
  private final String LEFT_ELBOW = "├";
  private final String RIGHT_ELBOW = "┤";
  private final String CROSS = "┼";

  private String[][] originalMatrix;
  private int[] lengthCols;
  private String baseRowDrawing;
  private String topSeparator;
  private String middleSeparator;
  private String bottomSeparator;

  public SquareMatrixBordersV2() {
    super();
  }

  public SquareMatrixBordersV2(String[][] originalMatrix) {
    super();
    setOriginalMatrix(originalMatrix);
  }

  public SquareMatrixBordersV2(int[][] originalMatrix) {
    super();
    setOriginalMatrix(originalMatrix);
  }

  public String[][] getOriginalMatrix() {
    return this.originalMatrix;
  }

  public void setOriginalMatrix(String[][] originalMatrix) {
    this.originalMatrix = originalMatrix;
    computeRequiredValues();
  }

  public void setOriginalMatrix(int[][] originalMatrix) {
    String[][] matrix = new String[originalMatrix.length][originalMatrix[0].length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        matrix[i][j] = String.valueOf(originalMatrix[i][j]);
      }
    }
    this.originalMatrix = matrix;
    computeRequiredValues();
  }

  private void computeRequiredValues() {
    this.lengthCols = computeLengthByCol();
    computeBaseDrawings();
  }

  private int[] computeLengthByCol() {
    int[] lengthCols = new int[this.originalMatrix[0].length];
    int lengthCol;
    for (int j = 0; j < this.originalMatrix[0].length; j++) {
      lengthCol = 0;
      for (int i = 0; i < this.originalMatrix.length; i++) {
        int length = this.originalMatrix[i][j] == null ? 1 : this.originalMatrix[i][j].length();
    	  if (lengthCol < length)
          lengthCol = length;
      }
      lengthCols[j] = lengthCol;
    }
    return lengthCols;
  }

  private void computeBaseDrawings() {
    this.baseRowDrawing = drawBaseRow2();
    this.topSeparator = drawTopSeparator();
    this.middleSeparator = drawMiddleSeparator();
    this.bottomSeparator = drawBottomSeparator();
  }

  public String getDisplayMatrix() {
    StringBuilder displayMatrix = new StringBuilder();
    for (int row = 0; row < originalMatrix.length; row++) {
      if (row == 0) {
        displayMatrix.append(this.topSeparator);
      }
      for (int col = 0; col < lengthCols.length; col++) {
        if (col == 0) {
          displayMatrix.append(VERTICAL_LINE);
        }
        int emptySpaces = lengthCols[col] - (this.originalMatrix[row][col] == null ? 1 : this.originalMatrix[row][col].length());
        displayMatrix
            .append(" ".repeat(emptySpaces))
            .append(this.originalMatrix[row][col] == null ? " " : this.originalMatrix[row][col])
            .append(VERTICAL_LINE);
        if (col == lengthCols.length - 1) {
          displayMatrix.append("\n");
        }
      }
      if (row == lengthCols.length - 1) {
        displayMatrix.append(this.bottomSeparator);
      } else {
        displayMatrix.append(this.middleSeparator);
      }
    }
    return displayMatrix.toString();
  }

  private String drawBaseRow2() {
    StringBuilder baseRowBuilder = new StringBuilder();
    for (int i = 0; i < this.lengthCols.length; i++) {
      baseRowBuilder.append(HORIZONTAL_LINE.repeat(this.lengthCols[i]));
      if (i != this.lengthCols.length - 1) baseRowBuilder.append(CROSS);
    }
    return baseRowBuilder.toString();
  }

  private String drawTopSeparator() {
    return new StringBuilder()
        .append(UP_LEFT_BORDER)
        .append(baseRowDrawing.replace(CROSS, UP_ELBOW))
        .append(UP_RIGHT_BORDER)
        .append("\n")
        .toString();
  }

  private String drawMiddleSeparator() {
    return new StringBuilder()
        .append(LEFT_ELBOW)
        .append(baseRowDrawing)
        .append(RIGHT_ELBOW)
        .append("\n")
        .toString();
  }

  private String drawBottomSeparator() {
    return new StringBuilder()
        .append(DOWN_LEFT_BORDER)
        .append(baseRowDrawing.replace(CROSS, DOWN_ELBOW))
        .append(DOWN_RIGHT_BORDER)
        .append("\n")
        .toString();
  }
}
