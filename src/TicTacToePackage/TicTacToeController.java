/**
 * Status: not finished.
 *
 * To Do List:
 *
 *      1) Check logic for within generateRandom(), look at how clearTicTac()
 *         is being called. When it clears board, players must take turns.
 *         This does not happen properly. Initially player X goes first,
 *         afterwards the first player is always O. Must alternate them.
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
    int moveCount_X;
    int moveCount_O;
    final int maxMoves = 5; //max moves possible.


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
            moveCount_X++;
            generateRandom(ticTacGrid);
            moveCount_O++;
           // debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonTWO(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[0][1] != 'X' && ticTacGrid[0][1] != 'O'){

            buttonTWO_LABEL.setText("X");
            ticTacGrid[0][1] = 'X'; //Adjust grid.
            moveCount_X++;
            generateRandom(ticTacGrid);
            moveCount_O++;
           // debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonTHREE(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[0][2] != 'X' && ticTacGrid[0][2] != 'O'){

            buttonTHREE_LABEL.setText("X");
            ticTacGrid[0][2] = 'X'; //Adjust grid.
            moveCount_X++;
            generateRandom(ticTacGrid);
            moveCount_O++;
          //  debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonFOUR(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[1][0] != 'X' && ticTacGrid[1][0] != 'O'){

            buttonFOUR_LABEL.setText("X");
            ticTacGrid[1][0] = 'X'; //Adjust grid.
            moveCount_X++;
            generateRandom(ticTacGrid);
            moveCount_O++;
           // debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonFIVE(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[1][1] != 'X' && ticTacGrid[1][1] != 'O'){

            buttonFIVE_LABEL.setText("X");
            ticTacGrid[1][1] = 'X'; //Adjust grid.
            moveCount_X++;
            generateRandom(ticTacGrid);
            moveCount_O++;
          //  debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonSIX(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[1][2] != 'X' && ticTacGrid[1][2] != 'O'){

            buttonSIX_LABEL.setText("X");
            ticTacGrid[1][2] = 'X'; //Adjust grid.
            moveCount_X++;
            generateRandom(ticTacGrid);
            moveCount_O++;
           // debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonSEVEN(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[2][0] != 'X' && ticTacGrid[2][0] != 'O'){

            buttonSEVEN_LABEL.setText("X");
            ticTacGrid[2][0] = 'X'; //Adjust grid.
            moveCount_X++;
            generateRandom(ticTacGrid);
            moveCount_O++;
           // debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonEIGHT(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[2][1] != 'X' && ticTacGrid[2][1] != 'O'){

            buttonEIGHT_LABEL.setText("X");
            ticTacGrid[2][1] = 'X'; //Adjust grid.
            moveCount_X++;
            generateRandom(ticTacGrid);
            moveCount_O++;
           // debugTicTac(ticTacGrid);
        }
    }

    @FXML
    void buttonNINE(ActionEvent event) {

        //If button empty, place X.
        if(ticTacGrid[2][2] != 'X' && ticTacGrid[2][2] != 'O'){

            buttonNINE_LABEL.setText("X");
            ticTacGrid[2][2] = 'X'; //Adjust grid.
            moveCount_X++;
            generateRandom(ticTacGrid);
            moveCount_O++;
            //debugTicTac(ticTacGrid);
        }
    }



    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

    }

    //GAME METHODS
    ////////////////////////////////////////////////////////////////////////////////////////////

    private char[][] generateRandom(char[][] ticTacGrid){

        //GENERATE RANDOM
		/*
			Generate x,y int variables and assign random number to them.
			Establish x,y coordinate, if coordinate is 'empty', assign char 'O' there.
			Set Text as letter 'O' on the appropriate buttonLabel for user.
		*/

		//Check if there are moves left.
		if(moveCount_X == maxMoves || moveCount_O == maxMoves){
		    clearTicTac(ticTacGrid);
		    moveCount_O++; //increment for opponent's next move. Opponent goes first next round. //<- PROBLEM.


            /**
             * FUTURE WORK:
             *  1)Possibly call winning path method here in the future.
             *      a) take increment of moveCount_O into consideration.
             *      b) do research into CSS, see if winning path can be highlighted.
             * */
        }

        boolean generated = false;
        do
        {
            int x,y;

            Random random = new Random();

            y = random.nextInt(3);
            x = random.nextInt(3);

            //DEBUG coordinates.
            //System.out.println("coordinates = x : " + x + " y : " + y);

            //If graph point is empty.
            if(ticTacGrid[x][y] != 'X' && ticTacGrid[x][y] != 'O')
            {

                    //SetText for specific grid point (i.e. BUTTON).

                    //ONE
                    if(x == 0 && y == 0){

                        buttonONE_LABEL.setText("O");
                        ticTacGrid[x][y] = 'O';
                       // moveCount_O++;
                    }
                    //TWO
                    else if(x == 0 && y == 1){

                        buttonTWO_LABEL.setText("O");
                        ticTacGrid[x][y] = 'O';
                      //  moveCount_O++;
                    }
                    //THREE
                    else if(x == 0 && y == 2){

                        buttonTHREE_LABEL.setText("O");
                        ticTacGrid[x][y] = 'O';
                     //   moveCount_O++;
                    }
                    //FOUR
                    else if(x == 1 && y == 0){

                        buttonFOUR_LABEL.setText("O");
                        ticTacGrid[x][y] = 'O';
                     //   moveCount_O++;
                    }
                    //FIVE
                    else if(x == 1 && y == 1){

                        buttonFIVE_LABEL.setText("O");
                        ticTacGrid[x][y] = 'O';
                     //   moveCount_O++;
                    }
                    //SIX
                    else if(x == 1 && y == 2){

                        buttonSIX_LABEL.setText("O");
                        ticTacGrid[x][y] = 'O';
                     //   moveCount_O++;
                    }
                    //SEVEN
                    else if(x == 2 && y == 0){

                        buttonSEVEN_LABEL.setText("O");
                        ticTacGrid[x][y] = 'O';
                     //   moveCount_O++;
                    }
                    //EIGHT
                    else if(x == 2 && y == 1){

                        buttonEIGHT_LABEL.setText("O");
                        ticTacGrid[x][y] = 'O';
                     //   moveCount_O++;
                    }
                    //NINE
                    else if(x == 2 && y == 2){ //If button NINE

                        buttonNINE_LABEL.setText("O");
                        ticTacGrid[x][y] = 'O';
                     //   moveCount_O++;
                    }

                //Exit Loop
                generated = true;
            }

        }while(!generated);

       return ticTacGrid;
    }

   private char [][] clearTicTac(char[][] ticTacToe){

        //Clear board.
       for (int i = 0; i < 3; i++){
           for (int j = 0; j < 3; j++){
               ticTacGrid[i][j] = ' ';
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

       //Reset moves
       moveCount_X = 0;
       moveCount_O = 0;

        return ticTacGrid;
   }


   private void debugTicTac(char[][] ticTacToe){

        //DEBUG TIC TAC
        //Prints tic tac grid to see value of each coordinate.

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(ticTacToe[i][j]);
            }
        }
    }
}
