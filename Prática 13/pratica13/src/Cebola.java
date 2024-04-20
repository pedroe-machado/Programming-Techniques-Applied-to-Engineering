public class Cebola extends Ingredientes {
    
    public Cebola(Sanduiches sanduiche){
        super(sanduiche);
        setNome(sanduiche.getNome() + ", cebola");
    }

    @Override
    public double getPreco(){
        return 1.3+getSanduiche().getPreco();
    }
}
