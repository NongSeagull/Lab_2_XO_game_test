/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.lab_2_xogame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 65160230 Piyapong
 */
public class Lab_2_XO_Game_Test {

    @Test
    public void testCurrentPlayer_InputIsTrue_PlayerIsX() {

        boolean checkPlayer = true;

        char expected = 'X';
        char result = Lab_2_XO_game.currentPlayer(checkPlayer);

        assertEquals(expected, result);
    }

    @Test
    public void testCurrentPlayer_InputIsFalse_PlayerIsO() {

        boolean checkPlayer = false;

        char expected = 'O';
        char result = Lab_2_XO_game.currentPlayer(checkPlayer);

        assertEquals(expected, result);
    }

    @Test
    public void testSwitchPlayer_InputIsX_ResultIsFalse() {

        char player = 'X';

        boolean expected = false;
        boolean result = Lab_2_XO_game.switchPlayer(player);

        assertEquals(expected, result);
    }

    @Test
    public void testSwitchPlayer_InputIsO_ResultIsTrue() {

        char player = 'O';

        boolean expected = true;
        boolean result = Lab_2_XO_game.switchPlayer(player);

        assertEquals(expected, result);
    }

    @Test
    public void testCheckBoardFull_AllPositionHaveElement_IsFull() {

        char[][] board = {{'X', 'O', 'X'}, {'O', 'O', 'X'}, {'X', 'X', 'O'}};

        String expected = "full";
        String result = Lab_2_XO_game.checkBoardFull(board);

        assertEquals(expected, result);
    }

    @Test
    public void testCheckBoardFull_SomePositionHaveElement_IsNotFull() {

        char[][] board = {{'-', 'O', 'X'}, {'O', '-', 'X'}, {'X', 'X', '-'}};

        String expected = "not full";
        String result = Lab_2_XO_game.checkBoardFull(board);

        assertEquals(expected, result);
    }

    @Test
    public void testCheckPositionOutOfBounds_PositionIsNot1to3_IsTrue() {

        char[][] board = {{'-', '-', 'X'}, {'O', '-', 'X'}, {'O', 'X', 'O'}};
        int position1 = 0;
        int position2 = 4;

        boolean expected = true;
        boolean result = Lab_2_XO_game.checkPositionOutOfBounds(board, position1, position2);

        assertEquals(expected, result);
    }

    @Test
    public void testCheckPositionOutOfBounds_PositionIs1to3_IsFalse() {

        char[][] board = {{'-', '-', 'X'}, {'O', '-', 'X'}, {'O', 'X', 'O'}};
        int position1 = 1;
        int position2 = 1;

        boolean expected = false;
        boolean result = Lab_2_XO_game.checkPositionOutOfBounds(board, position1, position2);

        assertEquals(expected, result);
    }

    /**
     * Test of checkExitPosition method, of class Lab_2_XOgame.
     */
    @Test
    public void testCheckExitPosition() {
        System.out.println("checkExitPosition");
        char[][] board = null;
        int position1 = 0;
        int position2 = 0;
        boolean expResult = false;
        boolean result = Lab_2_XO_game.checkExitPosition(board, position1, position2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkRowWinner method, of class Lab_2_XOgame.
     */
    @Test
    public void testCheckRowWinner() {
        System.out.println("checkRowWinner");
        char[][] board = null;
        char player = ' ';
        boolean expResult = false;
        boolean result = Lab_2_XO_game.checkRowWinner(board, player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkColWinner method, of class Lab_2_XOgame.
     */
    @Test
    public void testCheckColWinner() {
        System.out.println("checkColWinner");
        char[][] board = null;
        char player = ' ';
        boolean expResult = false;
        boolean result = Lab_2_XO_game.checkColWinner(board, player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkDiagonalWinner method, of class Lab_2_XOgame.
     */
    @Test
    public void testCheckDiagonalWinner() {
        System.out.println("checkDiagonalWinner");
        char[][] board = null;
        char player = ' ';
        boolean expResult = false;
        boolean result = Lab_2_XO_game.checkDiagonalWinner(board, player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Lab_2_XOgame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Lab_2_XO_game.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
