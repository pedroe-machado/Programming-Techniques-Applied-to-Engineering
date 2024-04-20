public class ServicoPublico extends Beneficiario implements ContribuinteINSS{
    private double mediaSalarial;

    public ServicoPublico(String cpf, String nome, double media){
        super(nome, cpf);
        mediaSalarial = media;
    }

    @Override
    public double calculaAposentadoria(){
        return 0.8*mediaSalarial;
    }

    @Override
    public String toString(){
        return super.toString() + ("\nContribuicao INSS: " + String.format("%.2f", calculaContribuicao()));
    }

    @Override
    public double calculaContribuicao(){
        return 0.14*mediaSalarial;
    }
}
