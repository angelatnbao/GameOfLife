import java.lang.Integer; 
import java.util.Scanner; 

public class GameOfLife{ 
    private static Board board; 
    private static int rows; 
    private static int cols; 

    public static void main(String args[]){ 
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Please type the size of your Game of Life"); 
        GameOfLife gol = new GameOfLife(Integer.parseInt(scanner.nextLine())); 

        StdDraw.enableDoubleBuffering(); 
        while(true){ 
            StdDraw.clear(StdDraw.BLACK); 
            gol.draw(); 
            StdDraw.show(); 
            StdDraw.pause(100); 
            gol.next(); 
            if(StdDraw.isMousePressed())
                board.set((int) StdDraw.mouseX(), (int) StdDraw.mouseY(), true); 
        } 
    } 

    /** 
     * Constructor generating a random Board of the game 
     * @param N the size of the game board 
     */
    public GameOfLife(int N){ 
        board = new Board(N, N); 
        rows = N; 
        cols = N; 
        for(int i = 0; i < rows; i++){ 
            for(int j = 0; j < cols; j++){ 
                if ( (int) (Math.random() * 3) == 0) 
                    board.set(i, j, true); 
            } 
        } 
    } 

    /**
     * Constructor generating a the game of the given board as its initial 
     * status 
     */
    public GameOfLife(Board board){ 
        this.board = board; 
        rows = board.numOfRows(); 
        cols = board.numOfCols(); 
    } 

    /**
     * Construct the next status of the board according to the Conaway's game 
     * of life rules 
     */
    public void next(){ 
        Board copyBoard = new Board(board); 
        for(int i = 0; i < rows; i++){ 
            for(int j = 0; j < cols; j++){ 
                int alive = numOfAlivedNeighbor(i, j); 
                if(board.get(i, j) == true && (alive == 2 || alive == 3)) {} 
                else if(board.get(i, j) == false && alive == 3) { 
                    copyBoard.set(i, j, true); 
                } 
                else{ 
                    copyBoard.set(i, j, false); 
                } 
            } 
        } 
        board = copyBoard; 
    } 

    /** 
     * return how many alive neighbors out of all 8 neighbors for the current 
     * cell indicated by the row and col 
     * @param row the row of the cell 
     * @param col the col of the cell we are looking at
     */
    private int numOfAlivedNeighbor(int row, int col){ 
        int count = 0; 
        for(int i = row - 1; i <= row + 1; i++ ) { 
            for(int j = col - 1; j <= col + 1; j++ ) { 
                if(i >= 0 && j >= 0 && i < rows && j < cols &&!(i == row && j == col) && board.get(i, j)) 
                    count ++; 
            } 
        } 
        return count; 
    } 

    /**
     * draw the current game of life board status Black square represent dead cell, while white 
     * square represents live cell 
     */
    public void draw(){ 
        StdDraw.setPenColor(StdDraw.BLACK); 
        StdDraw.filledSquare(0.5 , 0.5 , 0.5); 
        StdDraw.setXscale(0, rows); 
        StdDraw.setYscale(0, cols); 
        for(int i = 0; i < rows; i++) { 
            for(int j = 0; j < cols; j++) { 
                if(!board.get(i, j)) { 
                    StdDraw.setPenColor(StdDraw.BLACK); 
                    StdDraw.filledSquare(0.5 + i, 0.5 + j, 0.5); 
                }
                if(board.get(i, j)) {
                    StdDraw.setPenColor(StdDraw.WHITE); 
                    StdDraw.filledSquare(0.5 + i, 0.5 + j, 0.5);  
                }
            } 
        }
    } 
} 