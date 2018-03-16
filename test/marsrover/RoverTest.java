/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrover;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Diego Cansi Matte <diego.cansi at ibm.com>
 */
public class RoverTest {

    public RoverTest() {

    }

    /**
     * Test of setPosicao method, of class Rover.
     */
    @Test
    public void testSetPosicao() {
        System.out.println("setPosicao");
        int x = 1;
        int y = 1;
        int olhandoPara = 1;
        Rover instance = new Rover();
        instance.setPosicao(x, y, olhandoPara);
        assertEquals(x, y, olhandoPara);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of mostraPosicao method, of class Rover.
     */
    @Test
    public void testMostraPosicao() {
        System.out.println("mostraPosicao");
        Rover instance = new Rover();
        instance.setPosicao(1, 1, 1);
        instance.mostraPosicao();
        assertEquals(instance.getPosicao(), instance.getPosicao());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of processaComando method, of class Rover.
     */
    @Test
    public void testProcessaComando_String() {
        System.out.println("processaComando");
        String comandos = "LRM";
        Rover instance = new Rover();
        instance.processaComando(comandos);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of processaComando method, of class Rover.
     */
    @Test
    public void testProcessaComando_Character() {
        System.out.println("processaComando");
        Character comando = 'L';
        Rover instance = new Rover();
        instance.processaComando(comando);
        assertEquals('L', 'L');
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPosicao method, of class Rover
     */
    @Test
    public void testGetPosicao() {
        System.out.println("getPosicao");
        Rover instance = new Rover();
        instance.setPosicao(0, 0, 0);
        assertEquals(instance.getPosicao(), instance.getPosicao());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");

    }

}
