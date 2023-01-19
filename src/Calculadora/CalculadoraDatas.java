import java.util.Date;

public class CalculadoraDatas implements ICalculadoraDatas{
    Date dataBase, vencimento;

    @Override
    public long diferencaMS() {
        return vencimento.getTime() - dataBase.getTime();
    }

    @Override
    public long diferencaSegundos() {
        return diferencaMS() / 1000;
    }

    @Override
    public long diferencaMinutos() {
        return diferencaSegundos() / 60;
    }

    @Override
    public long diferencaHoras() {
        return diferencaMinutos() / 60;
    }

    @Override
    public long diferencaDias() {
        return diferencaHoras() / 24;
    }

    public CalculadoraDatas(Date dataBase, Date vencimento) {
        this.dataBase = dataBase;
        this.vencimento = vencimento;
    }
}
