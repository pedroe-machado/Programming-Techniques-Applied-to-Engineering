public class IniciativaPrivada extends Beneficiario {
    private int percentual;
    private final static double TETOINSS = 7507.49;

    public IniciativaPrivada(String nome, String cpf, int percentual){
        super(nome, cpf);
        this.percentual = percentual;
    }

    @Override
    public double calculaAposentadoria(){
        return percentual*TETOINSS/100;
    }

}
