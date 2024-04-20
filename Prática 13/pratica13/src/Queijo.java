public class Queijo extends Ingredientes {
    
    public Queijo(Sanduiches sanduiche){
        super(sanduiche);
        setNome(sanduiche.getNome() + ", queijo");
    }

    @Override
    public double getPreco(){
        return 2.3+ getSanduiche().getPreco();
    }
}
