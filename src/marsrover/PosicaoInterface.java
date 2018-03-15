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
public interface PosicaoInterface {

    public static final class Eixo {

        int eixo = 0;

        public Eixo(int eixo) {
            this.eixo = eixo;
        }

        protected void incrementa() {
            eixo++;
        }

        protected void decrementa() {
            eixo--;
        }

        public int getEixo() {
            return eixo;
        }
    }

    public enum Direcao {
        NORTE {
            @Override
            public Direcao direita() {
                return LESTE;
            }

            @Override
            public Direcao esquerda() {
                return OESTE;
            }
        },
        LESTE {
            @Override
            public Direcao direita() {
                return SUL;
            }

            @Override
            public Direcao esquerda() {
                return NORTE;
            }
        },
        OESTE {
            public Direcao direita() {
                return NORTE;
            }

            @Override
            public Direcao esquerda() {
                return SUL;
            }
        },
        SUL {
            public Direcao direita() {
                return OESTE;
            }

            @Override
            public Direcao esquerda() {
                return LESTE;
            }
        }
    };

    public abstract Direcao direita();
    public abstract Direcao esquerda();
    public Eixo getX();
    public Eixo getY();
    public Direcao getDirecao();
    
    @Override
    public String toString();

}
