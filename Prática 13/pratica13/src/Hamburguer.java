public class Hamburguer extends Ingredientes {
    
    public Hamburguer(Sanduiches sanduiche){
        super(sanduiche);
        setNome(sanduiche.getNome() + ", hamburguer");
    }

    @Override
    public double getPreco(){
        return 4.0+ getSanduiche().getPreco();
    }
}
