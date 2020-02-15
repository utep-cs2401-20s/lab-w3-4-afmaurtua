
public class TorusGameOfLife extends GameOfLife {
    //default
    public TorusGameOfLife() {

    }
    //constructor
    public TorusGameOfLife(int size){
        board = new int[size][size];
        previous = new int[size][size];
        this.size = size;
    }
    //constructor
    public TorusGameOfLife(int[][] current) {
        size = current.length;
        board = current;
        previous = new int[size][size];

    }
    @Override
    public int neighbor(int row, int col){
        int count = 0;
        //top left
        if(board[(row-1) % size][(col -1) % size] == 1){
            count++;
        }
        //top right
        if(board[(row -1) % size][(col +1) % size] == 1){
            count++;
        }

        //top
        if(board[(row -1) % size][(col) % size] == 1){
            count++;
        }

        //bottom
        if(board[(row +1) % size][(col) % size] == 1){
            count++;
        }

        //left
        if(board[(row) % size][(col -1) % size] == 1){
            count++;
        }

        //right
        if(board[(row) % size][(col +1) % size] == 1){
            count++;
        }

        //left bottom
        if(board[(row +1) % size][(col -1) % size] == 1){
            count++;
        }

        //right bottom
        if(board[(row +1) % size][(col +1) % size] == 1){
            count++;
        }
        return count; 
    }


}
