/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marsrover;

/**
 *
 * @author 08104810
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rover rover = new Rover();
        rover.setPosicao(1, 2, 1);
        rover.processaComando("LMLMLMLMM");
        rover.mostraPosicao();//  1 3 N
        rover.setPosicao(3, 3, 2);
        rover.processaComando("MMRMMRMRRM");
        rover.mostraPosicao(); // 5 1 L
    }

}
