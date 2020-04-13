/**
 * Status: not finished.
 *
 * Notes:
 *
 *      1) Everything works properly, however, when AI wins it doesn't really
 *      show the row of 'O'. Instead it simply proceeds to next round. Every
 *      round after the first always starts with 'O' and this is not desirable.
 *
 * Future Work:
 *
 *      1)Possibly call winning path method here in the future.
 *          a) take increment of moveCount_O into consideration.
 *          b) do research into CSS, see if winning path can be highlighted.
 *
 *
 * */
package TicTacToePackage;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Random;

public class TicTacToeController {

    //Program Variables.

    char [][] ticTacGrid = new char[3][3]; //Grid

    private final static char NOUGHT = 'O';
    private final static char CROSS = 'X';
    private final static char BLANK = ' ';


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    //BUTTON LABELS
    ////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    private Button buttonONE_LABEL;

    @FXML
    private Button buttonTWO_LABEL;

    @FXML
    private Button buttonTHREE_LABEL;

    @FXML
    private Button buttonFOUR_LABEL;

    @FXML
    private Button buttonFIVE_LABEL;

    @FXML
    private Button buttonSIX_LABEL;

    @FXML
    private Button buttonSEVEN_LABEL;

    @FXML
    private Button buttonEIGHT_LABEL;

    @FXML
    private Button buttonNINE_LABEL;



    //BUTTON ACTION EVENTS
    ////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    void buttonONE(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[0][0] != 'X' && ticTacGrid[0][0] != 'O'){

            buttonONE_LABEL.setText("X");
            ticTacGrid[0][0] = 'X'; //Adjust grid.
            System.out.println("2");

            if(checkWin(ticTacGrid)){
                System.out.println("3");
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else if(checkDraw(ticTacGrid)){
                System.out.println("4");
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else{
                System.out.println("5");
                generateRandom(ticTacGrid);
            }
            //debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonTWO(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[0][1] != 'X' && ticTacGrid[0][1] != 'O'){

            buttonTWO_LABEL.setText("X");
            ticTacGrid[0][1] = 'X'; //Adjust grid.

            if(checkWin(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else if(checkDraw(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else{
                generateRandom(ticTacGrid);
            }
           // debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonTHREE(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[0][2] != 'X' && ticTacGrid[0][2] != 'O'){

            buttonTHREE_LABEL.setText("X");
            ticTacGrid[0][2] = 'X'; //Adjust grid.

            if(checkWin(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else if(checkDraw(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else{
                generateRandom(ticTacGrid);
            }
          //  debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonFOUR(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[1][0] != 'X' && ticTacGrid[1][0] != 'O'){

            buttonFOUR_LABEL.setText("X");
            ticTacGrid[1][0] = 'X'; //Adjust grid.

            if(checkWin(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else if(checkDraw(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else{
                generateRandom(ticTacGrid);
            }
           // debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonFIVE(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[1][1] != 'X' && ticTacGrid[1][1] != 'O'){

            buttonFIVE_LABEL.setText("X");
            ticTacGrid[1][1] = 'X'; //Adjust grid.

            if(checkWin(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else if(checkDraw(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else{
                generateRandom(ticTacGrid);
            }
          //  debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonSIX(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[1][2] != 'X' && ticTacGrid[1][2] != 'O'){

            buttonSIX_LABEL.setText("X");
            ticTacGrid[1][2] = 'X'; //Adjust grid.

            if(checkWin(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else if(checkDraw(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else{
                generateRandom(ticTacGrid);
            }
           // debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonSEVEN(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[2][0] != 'X' && ticTacGrid[2][0] != 'O'){

            buttonSEVEN_LABEL.setText("X");
            ticTacGrid[2][0] = 'X'; //Adjust grid.

            if(checkWin(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else if(checkDraw(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else{
                generateRandom(ticTacGrid);
            }
           // debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonEIGHT(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[2][1] != 'X' && ticTacGrid[2][1] != 'O'){

            buttonEIGHT_LABEL.setText("X");
            ticTacGrid[2][1] = 'X'; //Adjust grid.

            if(checkWin(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else if(checkDraw(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else{
                generateRandom(ticTacGrid);
            }
           // debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonNINE(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[2][2] != 'X' && ticTacGrid[2][2] != 'O'){

            buttonNINE_LABEL.setText("X");
            ticTacGrid[2][2] = 'X'; //Adjust grid.

            if(checkWin(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else if(checkDraw(ticTacGrid)){
                clearTicTac(ticTacGrid);
                generateRandom(ticTacGrid);
            }
            else{
                generateRandom(ticTacGrid);
            }
            //debugTicTac(ticTacGrid);
        }
    }



    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

        //Initialize the grid
        ticTacGrid[0][0] = BLANK;
        ticTacGrid[0][1] = BLANK;
        ticTacGrid[0][2] = BLANK;
        ticTacGrid[1][0] = BLANK;
        ticTacGrid[1][1] = BLANK;
        ticTacGrid[1][2] = BLANK;
        ticTacGrid[2][0] = BLANK;
        ticTacGrid[2][1] = BLANK;
        ticTacGrid[2][2] = BLANK;

    }

    //GAME METHODS
    ////////////////////////////////////////////////////////////////////////////////////////////

    private char[][] generateRandom(char[][] ticTacGrid){

        //GENERATE RANDOM
		/*
		 *	Generate x,y int variables and assign random number to them.
		 *	Establish x,y coordinate, if coordinate is 'empty', assign char 'O' there.
		 *	Set Text as letter 'O' on the appropriate buttonLabel for user.
		 */


        boolean generated = false;
        do
        {
            int x,y;

            Random random = new Random();

            y = random.nextInt(3);
            x = random.nextInt(3);

            //DEBUG coordinates.
            //System.out.println("coordinates = x : " + x + " y : " + y);

            // Each cell is indexed as follows:
            // 1 2 3
            // 4 5 6
            // 7 8 9

            //If graph point is empty.
            if(ticTacGrid[x][y] != CROSS && ticTacGrid[x][y] != NOUGHT)
            {

                    //SetText for specific grid point (i.e. BUTTON).

                    //ONE
                    if(x == 0 && y == 0){

                        buttonONE_LABEL.setText("O");
                        ticTacGrid[x][y] = NOUGHT;
                       // moveCount_O++;
                    }
                    //TWO
                    else if(x == 0 && y == 1){

                        buttonTWO_LABEL.setText("O");
                        ticTacGrid[x][y] = NOUGHT;
                      //  moveCount_O++;
                    }
                    //THREE
                    else if(x == 0 && y == 2){

                        buttonTHREE_LABEL.setText("O");
                        ticTacGrid[x][y] = NOUGHT;
                     //   moveCount_O++;
                    }
                    //FOUR
                    else if(x == 1 && y == 0){

                        buttonFOUR_LABEL.setText("O");
                        ticTacGrid[x][y] = NOUGHT;
                     //   moveCount_O++;
                    }
                    //FIVE
                    else if(x == 1 && y == 1){

                        buttonFIVE_LABEL.setText("O");
                        ticTacGrid[x][y] = NOUGHT;
                     //   moveCount_O++;
                    }
                    //SIX
                    else if(x == 1 && y == 2){

                        buttonSIX_LABEL.setText("O");
                        ticTacGrid[x][y] = NOUGHT;
                     //   moveCount_O++;
                    }
                    //SEVEN
                    else if(x == 2 && y == 0){

                        buttonSEVEN_LABEL.setText("O");
                        ticTacGrid[x][y] = NOUGHT;
                     //   moveCount_O++;
                    }
                    //EIGHT
                    else if(x == 2 && y == 1){

                        buttonEIGHT_LABEL.setText("O");
                        ticTacGrid[x][y] = NOUGHT;
                     //   moveCount_O++;
                    }
                    //NINE
                    else if(x == 2 && y == 2){ //If button NINE

                        buttonNINE_LABEL.setText("O");
                        ticTacGrid[x][y] = NOUGHT;
                     //   moveCount_O++;
                    }

                //Exit Loop
                generated = true;
            }

        }while(!generated);


        //After generating random, check if there is either a
        //win or draw, and reset round. For example, if the
        //last move being played is by AI 'O'.
        if(checkDraw(ticTacGrid)){
            clearTicTac(ticTacGrid);
        }
        if(checkWin(ticTacGrid)){
            clearTicTac(ticTacGrid);
        }

       return ticTacGrid;
    }

   //Clear Grid
   private char [][] clearTicTac(char[][] ticTacToe){

        //Clear board.
       for (int i = 0; i < 3; i++){
           for (int j = 0; j < 3; j++){
               ticTacGrid[i][j] = BLANK;
           }
       }


       //Clear board.
       buttonONE_LABEL.setText("");
       buttonTWO_LABEL.setText("");
       buttonTHREE_LABEL.setText("");
       buttonFOUR_LABEL.setText("");
       buttonFIVE_LABEL.setText("");
       buttonSIX_LABEL.setText("");
       buttonSEVEN_LABEL.setText("");
       buttonEIGHT_LABEL.setText("");
       buttonNINE_LABEL.setText("");


       return ticTacGrid;
   }

   //Check Win
   private boolean checkWin(char[][] ticTacGrid){
        /*
        * Method check to see if a winning path exists, either from the player or
        * from the computer.
        * */
        boolean win = false;

            //Check winning paths and scenarios.

            //Grid
            //0 1 2
            //1
            //2

                //Check top row for either 'O' or 'X'
                if( (ticTacGrid[0][0]== NOUGHT && ticTacGrid[0][1] == NOUGHT && ticTacGrid[0][2] == NOUGHT)
                        || (ticTacGrid[0][0] == CROSS && ticTacGrid[0][1] == CROSS && ticTacGrid[0][2] == CROSS) ){

                    win = true;
                }

                //Check middle row for either 'O' or 'X'
                if( (ticTacGrid[1][0]== NOUGHT && ticTacGrid[1][1] == NOUGHT && ticTacGrid[1][2] == NOUGHT)
                        || (ticTacGrid[1][0] == CROSS && ticTacGrid[1][1] == CROSS && ticTacGrid[1][2] == CROSS) ){

                    win = true;
                }

                //Check bottom row for either 'O' or 'X'
                if( (ticTacGrid[2][0]== NOUGHT && ticTacGrid[2][1] == NOUGHT && ticTacGrid[2][2] == NOUGHT)
                        || (ticTacGrid[2][0] == CROSS && ticTacGrid[2][1] == CROSS && ticTacGrid[2][2] == CROSS) ){

                    win = true;
                }

                //Check left column for either 'O' or 'X'
                if( (ticTacGrid[0][0]== NOUGHT && ticTacGrid[1][0] == NOUGHT && ticTacGrid[2][0] == NOUGHT)
                        || (ticTacGrid[0][0] == CROSS && ticTacGrid[1][0] == CROSS && ticTacGrid[2][0] == CROSS) ){

                    win = true;
                }

                //Check middle column for either 'O' or 'X'
                if( (ticTacGrid[0][1]== NOUGHT && ticTacGrid[1][1] == NOUGHT && ticTacGrid[2][1] == NOUGHT)
                        || (ticTacGrid[0][1] == CROSS && ticTacGrid[1][1] == CROSS && ticTacGrid[2][1] == CROSS) ){

                    win = true;
                }

                //Check right column for either 'O' or 'X'
                if( (ticTacGrid[0][2]== NOUGHT && ticTacGrid[1][2] == NOUGHT && ticTacGrid[2][2] == NOUGHT)
                        || (ticTacGrid[0][2] == CROSS && ticTacGrid[1][2] == CROSS && ticTacGrid[2][2] == CROSS) ){

                    win = true;
                }

                //Check diagonal for either 'O' or 'X'
                if( (ticTacGrid[0][0] == NOUGHT && ticTacGrid[1][1] == NOUGHT && ticTacGrid[2][2] == NOUGHT)
                    || (ticTacGrid[0][0] == CROSS && ticTacGrid[1][1] == CROSS && ticTacGrid[2][2] == CROSS) ){

                    win = true;
                }

                //Check diagonal for either 'O' or 'X'
                if( (ticTacGrid[0][2] == NOUGHT && ticTacGrid[1][1] == NOUGHT && ticTacGrid[2][0] == NOUGHT)
                        || (ticTacGrid[0][2] == CROSS && ticTacGrid[1][1] == CROSS && ticTacGrid[2][0] == CROSS) ){

                    win = true;
                }


        //DEBUG
        //System.out.println("X moves: " + moveCount_X + " O moves: " + moveCount_O);
        return win;
   }

    private boolean checkDraw(char[][] ticTacGrid){
        /*
         * Check every index to see if the grid is a draw. Check whether
         * every index is not blank.
         */

        //Local Variables
        boolean draw = false;

        //If entire grid is not blank (if no spaces left!)
        if(ticTacGrid[0][0] != BLANK && ticTacGrid[0][1] != BLANK && ticTacGrid[0][2] != BLANK &&
                ticTacGrid[1][0] != BLANK && ticTacGrid[1][1] != BLANK && ticTacGrid[1][2] != BLANK &&
                ticTacGrid[2][0] != BLANK && ticTacGrid[2][1] != BLANK && ticTacGrid[2][2] != BLANK){

            draw = true;
        }

        return draw;
    }


   //Debug Method
   private void debugTicTac(char[][] ticTacGrid){

        //DEBUG TIC TAC
        //Prints tic tac grid to see value of each coordinate.

       System.out.println("**Debug the grid**");
/*
       for(short i = 0; i < 9; i++){

           //Indent row.
           if(i % 3 == 0){
               System.out.println();
           }

           System.out.print(ticTacGrid[i]);
       }
*/
       // System.out.println("**Debug the moves**");
       // System.out.println("Player X moves: "+ moveCount_X);
       // System.out.println("Player O moves: "+ moveCount_O);
    }
}
