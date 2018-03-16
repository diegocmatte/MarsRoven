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

    /**
     * Construtor da classe Rover
     */
    public Rover() {
    }

    /**
     * Método que aponta uma nova posição do rover
     * @param x
     * @param y
     * @param olhandoPara
     */
    public void setPosicao(int x, int y, int olhandoPara) {
        this.x = x;
        this.y = y;
        this.olhandoPara = olhandoPara;
    }

    /**
     * Método que mostra a para qual lado o rover está olhando
     */
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

    /**
     * Método que devolve a posição para o qual o rover está olhando
     * @return direcao
     */
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

    /**
     * Método que recebe uma String que irá realizar as movimentação e apontamento do rover
     * @param comandos
     */
    public void processaComando(String comandos) {
        for (int i = 0; i < comandos.length(); i++) {
            processaComando(comandos.charAt(i));
        }
    }

    /**
     * Método que altera a posição do rover conforme char informado
     * @param comando
     */
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

    /**
     * Método que faz com que o rover gire sem mudar de posição
     */
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

    /**
     * Método que faz com que o rover vire para a esquerda
     */
    private void virarEsquerda() {
        olhandoPara = (olhandoPara - 1) < NORTE ? OESTE : olhandoPara - 1;
    }

    /**
     * Método que faz com que o rover vire para a direita
     */
    private void virarDireita() {
        olhandoPara = (olhandoPara + 1) > OESTE ? NORTE : olhandoPara + 1;
    }

}
