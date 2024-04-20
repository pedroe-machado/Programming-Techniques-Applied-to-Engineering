import java.util.ArrayList;

public class FolhaPagamento {
    private ArrayList<Beneficiario> bens;

    public FolhaPagamento(){
        bens = new ArrayList<Beneficiario>();
    }

    public void cadastrarBeneficiario(Beneficiario ben){
        bens.add(ben);
    }

    public void gerarFolhaPagamento(){
        for (Beneficiario beneficiario : bens) {
            System.out.println(beneficiario + "\n");
        }
    }
}
