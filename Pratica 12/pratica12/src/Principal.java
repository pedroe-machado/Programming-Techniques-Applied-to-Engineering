public class Principal {
    public static void main(String[] args) throws Exception {
        
        String saidaMG, saidaRJ;

        saidaMG = "Salario líquido em MG = "+ new FilialMG().calcularSalarioLiquido(3000);
        saidaRJ = "Salario líquido em RJ = "+ new FilialRJ().calcularSalarioLiquido(3000);
        
        System.out.println(saidaMG);
        System.out.println(saidaRJ);
    }
}
