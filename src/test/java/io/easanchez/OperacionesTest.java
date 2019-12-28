package io.easanchez;

import io.easanchez.test.Operaciones;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OperacionesTest {

    private Operaciones op;

    @Before
    public void setup(){
       op= new Operaciones();

    }


    @Test
    public void sumaTest(){

        Assert.assertEquals("La suma es igual",11,op.sumar(5,6));

    }

    @Test
    public void podriaHacerRestaTest(){

        Assert.assertEquals("La resta es igual",1,op.restar(7,6));

    }

    @Test
    public void podriaHacerMultiplicacionTest(){

        Assert.assertEquals("La multiplicacion es igual",8,op.multiplicar(4,2));

    }

    @Test
    public void podriaHacerDivisionTest(){

        Assert.assertEquals("La division es igual",2,op.dividir(4,2));

    }
}
