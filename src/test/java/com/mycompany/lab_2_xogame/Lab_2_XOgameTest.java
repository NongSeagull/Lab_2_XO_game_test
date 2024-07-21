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
 * @author tsuna
 */
public class Lab_2_XOgameTest {
    
    public Lab_2_XOgameTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setUpBoard method, of class Lab_2_XOgame.
     */
    @Test
    public void testSetUpBoard() {
        System.out.println("setUpBoard");
        char[][] board = null;
        Lab_2_XOgame.setUpBoard(board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printBoard method, of class Lab_2_XOgame.
     */
    @Test
    public void testPrintBoard() {
        System.out.println("printBoard");
        char[][] board = null;
        Lab_2_XOgame.printBoard(board);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPlayerTurn method, of class Lab_2_XOgame.
     */
    @Test
    public void testCheckPlayerTurn() {
        System.out.println("checkPlayerTurn");
        char player = ' ';
        Lab_2_XOgame.checkPlayerTurn(player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of currentPlayer method, of class Lab_2_XOgame.
     */
    @Test
    public void testCurrentPlayer() {
        System.out.println("currentPlayer");
        boolean checkPlayer = false;
        char expResult = ' ';
        char result = Lab_2_XOgame.currentPlayer(checkPlayer);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of switchPlayer method, of class Lab_2_XOgame.
     */
    @Test
    public void testSwitchPlayer() {
        System.out.println("switchPlayer");
        char player = ' ';
        boolean expResult = false;
        boolean result = Lab_2_XOgame.switchPlayer(player);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addMovePlayerToBoard method, of class Lab_2_XOgame.
     */
    @Test
    public void testAddMovePlayerToBoard() {
        System.out.println("addMovePlayerToBoard");
        char[][] board = null;
        int position1 = 0;
        int position2 = 0;
        char player = ' ';
        Lab_2_XOgame.addMovePlayerToBoard(board, position1, position2, player);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkBoardFull method, of class Lab_2_XOgame.
     */
    @Test
    public void testCheckBoardFull() {
        System.out.println("checkBoardFull");
        char[][] board = null;
        String expResult = "";
        String result = Lab_2_XOgame.checkBoardFull(board);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPositionOutOfBounds method, of class Lab_2_XOgame.
     */
    @Test
    public void testCheckPositionOutOfBounds() {
        System.out.println("checkPositionOutOfBounds");
        char[][] board = null;
        int position1 = 0;
        int position2 = 0;
        boolean expResult = false;
        boolean result = Lab_2_XOgame.checkPositionOutOfBounds(board, position1, position2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        boolean result = Lab_2_XOgame.checkExitPosition(board, position1, position2);
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
        boolean result = Lab_2_XOgame.checkRowWinner(board, player);
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
        boolean result = Lab_2_XOgame.checkColWinner(board, player);
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
        boolean result = Lab_2_XOgame.checkDiagonalWinner(board, player);
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
        Lab_2_XOgame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
