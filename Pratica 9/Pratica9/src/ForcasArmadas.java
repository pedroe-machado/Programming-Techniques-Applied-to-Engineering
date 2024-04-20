public class ForcasArmadas extends Beneficiario implements ContribuinteINSS {
    private double ultimoSalario;

    public ForcasArmadas(String nome, String cpf, double salario){
        super(nome, cpf);
        ultimoSalario = salario;
    }

    @Override
    public double calculaAposentadoria(){
        return 0.9*ultimoSalario;
    }

    @Override
    public String toString(){
        return super.toString() + ("\nContribuicao INSS: " + String.format("%.2f", calculaContribuicao()));
    }

    @Override
    public double calculaContribuicao(){
        return 0.11*ultimoSalario;
    }
}
