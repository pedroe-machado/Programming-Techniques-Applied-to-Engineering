public abstract class Salario {
    private final static double SALARIO_MINIMO = 1000;

    public double calcularSalarioLiquido(double salarioBruto){
        return salarioBruto-descINSS(salarioBruto)-descIRRF(salarioBruto)-descVT(salarioBruto)-descPS(salarioBruto);
    }

    private double descINSS(double salarioBruto){
        if(salarioBruto == SALARIO_MINIMO){
            return salarioBruto * 0.07;
        }else if(salarioBruto < 2 * SALARIO_MINIMO ){
            return salarioBruto * 0.1;
        }else if(salarioBruto < 3 * SALARIO_MINIMO){
            return salarioBruto * 0.12;
        }else if(salarioBruto < 4 * SALARIO_MINIMO){
            return salarioBruto * 0.14;
        }else{
            return salarioBruto * 0.2;
        }   
    }

    private double descIRRF(double salarioBruto){
        if(salarioBruto == SALARIO_MINIMO){
            return 0;
        }else if(salarioBruto < 2 * SALARIO_MINIMO ){
            return salarioBruto * 0.075;
        }else if(salarioBruto < 3 * SALARIO_MINIMO){
            return salarioBruto * 0.15;
        }else if(salarioBruto < 4 * SALARIO_MINIMO){
            return salarioBruto * 0.225;
        }else{
            return salarioBruto * 0.275;
        }
    }

    public abstract double descVT(double salarioBruto);
    public abstract double descPS(double salarioBruto);

}
