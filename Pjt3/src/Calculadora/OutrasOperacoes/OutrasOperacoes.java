package OutrasOperacoes;

import OperacoesBasicas.OperacaoBasica;

public class OutrasOperacoes extends OperacaoBasica implements IOutrasOperacoes{
    double num1, num2, num3, num4;

    public OutrasOperacoes(float num1, float num2, float num3, float num4) {
        super(num1, num2);
        this.num3 = num3;
        this.num4 = num4;
    }

    @Override
    public double exponenciacao(){
        return Math.pow(num3, num4);
    }

    @Override
    public double raiz(){
        return Math.sqrt(num3);
    }
    @Override
    public double porcentagem(){
        return Multiplicar()/100;
    }
}
