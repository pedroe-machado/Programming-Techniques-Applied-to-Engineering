public class App {
    public static void main(String[] args) throws Exception {
        Sanduiches sanduba = new PaoHamburguer("X-Burguer"); 
        
        sanduba = new Hamburguer(sanduba);
        sanduba = new Queijo(sanduba);
        sanduba = new Queijo(sanduba);
        
        System.out.println(sanduba.getNome());
        System.out.println(sanduba.getPreco());
    }
}
