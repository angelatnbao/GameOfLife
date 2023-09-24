/******************************************************************************
 *  Name:     Angela Bao 
 *
 *  Partner Name:        none 
 * 
 *  Note: StdDraw.java copied from Princeton University Standard Library 
 *  (https://introcs.cs.princeton.edu/java/stdlib/) 
 ******************************************************************************/

Final Project Name: GameOfLife_AB 

/******************************************************************************
 *  Describe how decided to implement this project. Is it original? or a spin-off
 *  a similar project? If it is the latter, submit a link or documentation to it. 
 *  
 *  I find Conway's Game of Life video and think it is a fun cell automaton. This 
 *  does not spin-off a similar project. The project is just to creat a random 
 *  game of life with a slight modification of allowing user to interrupt the 
 *  development of the generations by making clicked cells alive. 
 *****************************************************************************/

/******************************************************************************
 *  Describe step by step how to execute your project successfully.
 * If multiple conditions result in different outputs, describe the steps 
 * to achieve the different outcomes.
 * 
 * 1. Run the program by calling main in GameOfLife. 
 * 2. Follow the instruction to type the size of the board you would like to 
 * create, which gives different resolution. 
 * 3. A random game of life will be generated, and user may click on cells to 
 * bring them into life. 
******************************************************************************/

 

/******************************************************************************
 *  Describe the data types you used to implement  your project
 *  
 *  I created two data types: GameOfLife and Baord. Board is the board of the 
 *  game which is basically a two dimensional grid of cells. The grid is stored 
 *  as a boolean 2D array. Each cell can be either dead, false, or alive, true. 
 *  The GameOfLife has the main method to start the game and it uses Board to 
 *  hold the game and controls the flow of the generations. 
 *****************************************************************************/

 
/******************************************************************************
 *  Describe the methods used in your ADTs 
 *  
 *  Board has methods: 
 *  - getBaord that returns the board stored in a boolean 
 *  2D array, which will allow the program to make deep copies when trying 
 *  to generate the next generation 
 *  - get that return the value at the specified row and column 
 *  - set that set a cell as dead or alive - the specified value 
 *  - numOfRows that return the number of rows 
 *  - numOfCols that return the number of columns 
 *  
 *  GameOfLife has methods: 
 *  - next() that generates the next generation of the game board 
 *  - a private numOfAlivedNeighbor(int row, int col) method that returns how 
 *  many alive neighbors are there surrounding the given cell 
 *  - draw that draws the board on the canvas 
 *  
 *  StdDraw library is used. 
 *****************************************************************************/

 


/******************************************************************************
 *  Describe the data needed for your project.
 *  Submit data file(s) to run your project. What is the name of the data file(s)?
 *  Describe the purpose of the data.
 *  Describe the multiple testing done to demonstrate a successful implementation. 
 *  
 *  There is an input of the size of the board of the game, which is read in through 
 *  the Scanner. No data file is needed to run the project as the initial state 
 *  of the board is randomly generated. User will be able to click on the board 
 *  to turn the clicked cells into alive. 
 *****************************************************************************/

 

/******************************************************************************
 *  Known bugs/limitations. 
 *  
 *  A limitation: 
 *  Only one click can be clicked for each generation, meaning that if the click 
 *  is surrounded by all dead cells, the click is useless as it will be dead in 
 *  the next generation. 
 *****************************************************************************/


/******************************************************************************
 *  Describe whatever help (if any) that you received.
 *  Don't include readings, lectures, and precepts, but do
 *  include any help from people (including course classmates, and friends)
 *  and attribute them by name. 
 *  
 *  None 
 *****************************************************************************/


/******************************************************************************
 *  Describe any serious problems you encountered.                    
 *  
 *  None 
 *****************************************************************************/


/***************************************************************************************
* Collaboration with a partner.  Both students must work together and discuss, write,
* debug, test, analyze, document, and submit all elements of the assignment together.
* Both partners are responsible for understanding all parts of the submitted assignment
* and receive the same grade. If two students begin working on an assignment as partners
* and cannot complete it together, (at least) one student must contact me to request a 
* partnership dissolution. 
* 
* No partner
 **************************************************************************************/

 


/******************************************************************************
 *  List any other comments here. Feel free to provide any feedback   
 *  on  how helpful the class meeting was and on how much you learned 
 * from doing the assignment, and whether you enjoyed doing it.
 *****************************************************************************/