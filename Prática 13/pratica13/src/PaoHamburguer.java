public class PaoHamburguer extends Sanduiches {
    
    public PaoHamburguer(String nome){
        setNome(nome);
    }

    @Override
    public double getPreco(){
        return 2.5;
    }
}
