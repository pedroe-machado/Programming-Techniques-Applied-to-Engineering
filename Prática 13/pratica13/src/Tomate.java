public class Tomate extends Ingredientes {
    
    public Tomate(Sanduiches sanduiche){
        super(sanduiche);
        setNome(sanduiche.getNome() + ", tomate");
    }

    @Override
    public double getPreco(){
        return 0.5 + getSanduiche().getPreco();
    }
}
