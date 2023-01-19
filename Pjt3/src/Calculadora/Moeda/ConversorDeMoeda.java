package Moeda;

import java.lang.Math;

public class ConversorDeMoeda {
    private double moeda;

    public ConversorDeMoeda(double reais) {
        this.moeda = reais;
    }

    public double ConverterDolar(){

        final double TaxaDolar = 5.16;
        return moeda * TaxaDolar;
    }
    public double ConverterEuro(){
        final double TaxaEuro = 5.57;
        return moeda * TaxaEuro;
    }
    public double ConverterReaisDolar(){
        final double TaxaEuro = 5.16;
        return moeda / TaxaEuro;
    }
    public double ConverterReaisEuro(){
        final double TaxaEuro = 5.57;
        return moeda / TaxaEuro;
    }

    double getMoeda() {return moeda;}
    void  setReais(double moeda){this.moeda = moeda;
    }
}
