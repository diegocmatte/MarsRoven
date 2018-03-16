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
public class Rover {

    private static final int NORTE = 1;
    private static final int LESTE = 2;
    private static final int SUL = 3;
    private static final int OESTE = 4;

    private int x = 0;
    private int y = 0;
    private int olhandoPara = NORTE;

    public Rover() {
    }

    public void setPosicao(int x, int y, int olhandoPara) {
        this.x = x;
        this.y = y;
        this.olhandoPara = olhandoPara;
    }

    public void mostraPosicao() {
        char direcao = 'N';
        switch (olhandoPara) {
            case 1:
                direcao = 'N';
                break;
            case 2:
                direcao = 'L';
                break;
            case 3:
                direcao = 'S';
                break;
            case 4:
                direcao = 'O';
                break;
            default:
                break;
        }

        System.out.println(x + " " + y + " " + direcao);

    }

    public char getPosicao() {
        char direcao = 'N';
        switch (olhandoPara) {
            case 1:
                direcao = 'N';
                break;
            case 2:
                direcao = 'L';
                break;
            case 3:
                direcao = 'S';
                break;
            case 4:
                direcao = 'O';
                break;
            default:
                break;
        }
        return direcao;
    }

    public void processaComando(String comandos) {
        for (int i = 0; i < comandos.length(); i++) {
            processaComando(comandos.charAt(i));
        }
    }

    public void processaComando(Character comando) {
        switch (comando) {
            case 'L':
                virarEsquerda();
                break;
            case 'R':
                virarDireita();
                break;
            case 'M':
                mover();
                break;
            default:
                break;
        }
    }

    private void mover() {
        switch (olhandoPara) {
            case NORTE:
                this.y++;
                break;
            case LESTE:
                this.x++;
                break;
            case SUL:
                this.y--;
                break;
            case OESTE:
                this.x--;
                break;
            default:
                break;
        }
    }

    private void virarEsquerda() {
        olhandoPara = (olhandoPara - 1) < NORTE ? OESTE : olhandoPara - 1;
    }

    private void virarDireita() {
        olhandoPara = (olhandoPara + 1) > OESTE ? NORTE : olhandoPara + 1;
    }

}
