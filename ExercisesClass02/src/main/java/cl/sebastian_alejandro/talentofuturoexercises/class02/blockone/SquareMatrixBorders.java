/*
 * This file is part of TalentoFuturoExercises.
 *
 * Copyright 2024 Sebestar
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * See the LICENSE file for more information.
 */

package cl.sebastian_alejandro.talentofuturoexercises.class02.blockone;

public class SquareMatrixBorders {

  final String UP_LEFT_BORDER = "╭";
  final String UP_RIGHT_BORDER = "╮";
  final String DOWN_LEFT_BORDER = "╰";
  final String DOWN_RIGHT_BORDER = "╯";
  final String HORIZONTAL_LINE = "─";
  final String VERTICAL_LINE = "│";
  final String UP_ELBOW = "┬";
  final String DOWN_ELBOW = "┴";
  final String LEFT_ELBOW = "├";
  final String RIGHT_ELBOW = "┤";
  final String CROSS = "┼";

  private int[][] originalMatrix;
  private int[] lengthCols;
  private String baseRowDrawing;
  private String topSeparator;
  private String middleSeparator;
  private String bottomSeparator;

  public SquareMatrixBorders(int[][] originalMatrix) {
    super();
    this.originalMatrix = originalMatrix;
    computeRequiredValues();
    computeBaseDrawings();
  }

  public int[][] getOriginalMatrix() {
    return originalMatrix;
  }

  public void setOriginalMatrix(int[][] originalMatrix) {
    this.originalMatrix = originalMatrix;
  }

  private void computeRequiredValues() {
    this.lengthCols = computeLengthByCol();
  }

  private void computeBaseDrawings() {
    this.baseRowDrawing = drawBaseRow();
    this.topSeparator = drawTopSeparator();
    this.middleSeparator = drawMiddleSeparator();
    this.bottomSeparator = drawBottomSeparator();
  }

  public String getDisplayMatrix() {
    StringBuilder displayMatrix = new StringBuilder();
    for (int row = 0; row < lengthCols.length; row++) {
      if (row == 0) {
        displayMatrix.append(this.topSeparator);
      }
      for (int col = 0; col < lengthCols.length; col++) {
        if (col == 0) {
          displayMatrix.append(VERTICAL_LINE);
        }
        int emptySpaces = lengthCols[col] - Integer.toString(this.originalMatrix[row][col]).length();
        displayMatrix.append(" ".repeat(emptySpaces)).append(this.originalMatrix[row][col]).append(VERTICAL_LINE);
        if (col == lengthCols.length -1) {
        	displayMatrix.append("\n");
        }
      }
      if(row == lengthCols.length-1) {
    	  displayMatrix.append(this.bottomSeparator);
      } else {
    	  displayMatrix.append(this.middleSeparator);
      }
    }
    return displayMatrix.toString();
  }

  private int[] computeLengthByCol() {
    int[] lengthCols = new int[originalMatrix[0].length];
    for (int col = 0; col < originalMatrix.length; col++) {
      int largestLength = 0;
      for (int row = 0; row < originalMatrix.length; row++) {
        int colLength = Integer.toString(originalMatrix[row][col]).length();
        if (colLength > largestLength) largestLength = colLength;
      }
      lengthCols[col] = largestLength;
    }
    return lengthCols;
  }

  private String drawBaseRow() {
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
