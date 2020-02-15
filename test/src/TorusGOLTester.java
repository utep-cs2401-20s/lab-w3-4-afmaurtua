import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TorusGOLTester{
    @Test
    public void TestoneStep1(){
        int [][] A = {{0,0,0}, {0,0,0}, {0,0,0}};
        int [][] B = {{0,0,0}, {0,0,0}, {0,0,0}};
        TorusGameOfLife x = new TorusGameOfLife(A);
        x.oneStep();
        assertArrayEquals(B, x.getBoard());

    }
    //@Test
    //public void TestoneStep2(){
        //int [][] A = {{}}
    //}



    @Test
    public void Testneighbor1(){
        int [][] A = {{0,0,0}, {0,1,0}, {0,0,0}};
        int B =0;
        TorusGameOfLife x = new TorusGameOfLife(A);
        assertEquals(B, x.neighbor(1,1));
    }

    @Test
    public void Testneighbor2(){
        int [][] A = {{0,0,0}, {0,1,0}, {1,0,1}};
        int B = 2;
        TorusGameOfLife x = new TorusGameOfLife(A);
        assertEquals(B, x.neighbor(2, 2));
    }

    @Test
    public void Testnigbhor3(){
        int [][] A = {{0,0,0}, {0,1,1}, {1,1,1}};
        int B = 4;
        TorusGameOfLife x = new TorusGameOfLife(A);
        assertEquals(B,x.neighbor(2,1));
    }

    @Test
    public void Testnighbhor4(){
        int [][] A = {{1,0,0}, {0,1,0},{0,0,0}};
        int B = 1;
        TorusGameOfLife x = new TorusGameOfLife(A);
        assertEquals(B,x.neighbor(1,1));
    }

    @Test
    public void Testnighbor5(){
        int [][] A = {{1,0,0}, {0,1,0}, {0,0,1}};
        int B = 2;
        TorusGameOfLife x = new TorusGameOfLife(A);
        assertEquals(B,x.neighbor(1,1));
    }

    @Test
    public void evolution(){
        int [][] A = {{0,0,0}, {0,1,0}, {0,0,0}};
        int [][] B = {{0,0,0}, {0,0,0}, {0,0,0}};
        TorusGameOfLife x = new TorusGameOfLife();
        x.evolution(1);
        assertArrayEquals(B, x.getBoard());

;

    }







}
