import java.util.Arrays;
public class GameOfLife{
    int size;
    int[][] board;
    int[][] previous;

    //default
    public GameOfLife() {

    }
    //constructor
    public GameOfLife(int size){
        board = new int[size][size];
        previous = new int[size][size];
        this.size = size;
    }
    //constructor
    public GameOfLife(int[][] current) {
        size = current.length;
        board = current;
        previous = new int[size][size];

    }
    //getter
    public int[][] getBoard(){
        return board;
    }

    public void oneStep(){ //The rules of the game
        int neighbor;
        for(int i = 0; i < board.length; i++){ //For loop to take a count for the current board and previous board
            for(int j = 0; j < board[i].length; j++){
                previous[i][j] = board[i][j];
                board[i][j] = previous[i][j];
            }
        }
        for(int i = 0; i < previous.length; i++){ //rules of the game are being applied here
            for(int j = 0; j < previous[i].length; j++){
               neighbor = this.neighbor(i,j);
               if(board[i][j] == 1){
                   if(neighbor < 2){
                       board[i][j] = 0;
                   }
                   if(neighbor > 3){
                       board[i][j] = 0;
                   }
               }
               else{
                   if(board[i][j] == 0){
                       if(neighbor == 3){
                           board[i][j] = 1;
                       }
                   }
               }
            }
        }
    }

    public int neighbor(int row, int col){
        int count = 0;
        //top left
        if((row -1) >= 0 && (col -1) >= 0 && (row -1) < size && (col -1) < size && board[row-1][col-1] == 1){
            count ++;
        }
        //top right
        if((row -1) >= 0 && (col +1) >= 0 && (row -1) < size && (col +1) < size && board[row-1][col+1] == 1){
            count ++;
        }
        //top
        if((row -1) >= 0 && (col) >= 0 && (row -1) < size && (col) < size && board[row-1][col] == 1){
            count ++;
        }
        //bottom
        if((row +1) >= 0 && (col) >= 0 && (row +1) < size && (col) < size && board[row+1][col] == 1){
            count ++;
        }
        //left
        if((row) >= 0 && (col -1) >= 0 && (row) < size && (col-1) < size && board[row][col-1] == 1){
            count ++;
        }
        //right
        if((row) >= 0 && (col +1) >= 0 && (row) < size && (col +1) < size && board[row][col+1] == 1){
            count ++;
        }
        //left bottom
        if((row +1) >= 0 && (col -1) >= 0 && (row +1) < size && (col -1) < size && board[row+1][col-1] == 1){
            count ++;
        }
        //right bottom
        if((row +1) >= 0 && (col +1) >= 0 && (row +1) < size && (col +1) < size && board[row+1][col+1] == 1){
            count ++;
        }
        return count;

    }

    public void evolution(int n){ //calling one step n times
        while(n != 0){ 
            n--;
            oneStep();
        }
    }
}
