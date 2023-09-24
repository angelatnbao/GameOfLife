
/**
 * Write a description of class Board here.
 *
 * @author Angela Bao 
 * @version (a version number or a date)
 */
public class Board
{
    private boolean[][] b; 
    private int N; // number of rows 
    private int M; // number of cols 

    /**
     * Constructor for objects of class Board 
     * Initialize a board with all dead cells 
     * @param row the number of rows 
     * @param col the number of columns 
     */
    public Board(int N, int M) {
        // initialise instance variables
        b = new boolean[N][M]; 
        this.N = N; 
        this.M = M; 
    } 
    
    /**
     * Constructor for objects of class Board 
     * Initialize a board by copying the parameter board 
     * @param board the board being copied 
     */
    public Board(Board board){ 
        this.N = board.numOfRows(); 
        this.M = board.numOfCols(); 
        this.b = new boolean[N][M]; 
        for (int i = 0; i < N; i++){ 
            for (int j = 0; j < M; j++){
                b[i][j] = board.get(i, j); 
            }
        } 
    } 

    public boolean[][] getBoard(){ 
        return b; 
    } 
    
    /**
     * return the value at the specified row and column 
     * @return whether the sepecified cell is alive (true = alive; false = dead) 
     */
    public boolean get(int row, int col) { 
        return b[row][col]; 
    } 
    
    /**
     * Set a cell as dead or alive - the specified value
     * @param value is whether to set the cell as alive 
     */ 
    public void set(int row, int col, boolean value) { 
        b[row][col] = value; 
    } 
    
    /**
     * numOfRows return the number of rows 
     * @return the number of row 
     */
    public int numOfRows() {
        return N; 
    } 
    
    /**
     * numOfCols return the number of columns 
     * @return the number of columns 
     */
    public int numOfCols() {
        return M; 
    } 
} 