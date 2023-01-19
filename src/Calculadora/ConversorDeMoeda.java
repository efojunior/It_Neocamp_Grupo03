import java.lang.Math;

public class ConversorDeMoeda {
    private  double Reais;
    private  double valor;
    private  double valor2;

    public ConversorDeMoeda(double reais, double valor, double valor2) {
        this.Reais = reais;
        this.valor = valor;
        this.valor2 = valor2;
    }

    public double ConverterDolar(){

        final double TaxaDolar = 5.16;
        valor = Reais * TaxaDolar;
        return valor;
    }
    public double ConverterEuro(){
        final double TaxaEuro = 5.57;
        valor2 = Reais * TaxaEuro;
        return valor2;
    }
    public double ConverterReaisDolar(){
        final double TaxaEuro = 5.16;
        valor2 = Reais / TaxaEuro;
        return valor2;
    }
    public double ConverterReaisEuro(){
        final double TaxaEuro = 5.57;
        valor2 = Reais / TaxaEuro;
        return valor2;
    }

    double getReais() {return Reais;}
    void  setReais(double Reais){this.Reais = Reais;
    }
    double getValor() {return valor;
    }
    void  setTValor(double valor){this.valor = valor;
    }
    double getValor2() {return valor2;}
    void  setValor2(double valor2){this.valor2 = valor2;
    }




}
