import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CalculadoraDatas implements ICalculadoraDatas{

    long diferencaMS, diferencaSegundos, diferencaMinutos, diferencaHoras, diferencaDias;
    Date dataBase, vencimento;

    @Override
    public long diferencaMS() {
        return vencimento.getTime() - dataBase.getTime();
    }

    @Override
    public long diferencaSegundos() {
        return diferencaMS / 1000;
    }

    @Override
    public long diferencaMinutos() {
        return diferencaSegundos / 60;
    }

    @Override
    public long diferencaHoras() {
        return diferencaMinutos / 60;
    }

    @Override
    public long diferencaDias() {
        return diferencaHoras / 24;
    }

    public long getDiferencaMS() {
        return diferencaMS;
    }

    public void setDiferencaMS(long diferencaMS) {
        this.diferencaMS = diferencaMS;
    }

    public long getDiferencaSegundos() {
        return diferencaSegundos;
    }

    public void setDiferencaSegundos(long diferencaSegundos) {
        this.diferencaSegundos = diferencaSegundos;
    }

    public long getDiferencaMinutos() {
        return diferencaMinutos;
    }

    public void setDiferencaMinutos(long diferencaMinutos) {
        this.diferencaMinutos = diferencaMinutos;
    }

    public long getDiferencaHoras() {
        return diferencaHoras;
    }

    public void setDiferencaHoras(long diferencaHoras) {
        this.diferencaHoras = diferencaHoras;
    }

    public long getDiferencaDias() {
        return diferencaDias;
    }

    public void setDiferencaDias(long diferencaDias) {
        this.diferencaDias = diferencaDias;
    }

    public Date getDataBase() {
        return dataBase;
    }

    public void setDataBase(Date dataBase) {
        this.dataBase = dataBase;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public CalculadoraDatas(long diferencaMS, long diferencaSegundos, long diferencaMinutos, long diferencaHoras, long diferencaDias, Date dataBase, Date vencimento) {
        this.diferencaMS = diferencaMS;
        this.diferencaSegundos = diferencaSegundos;
        this.diferencaMinutos = diferencaMinutos;
        this.diferencaHoras = diferencaHoras;
        this.diferencaDias = diferencaDias;
        this.dataBase = dataBase;
        this.vencimento = vencimento;
    }

    /*SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    Date dataBase = null;
    Date vencimento = null;
      try {
        dataBase = sdf.parse(sc.next());
        vencimento = sdf.parse(.next());
    } catch (java.text.ParseException e) { return; }


      System.out.println(diferencaMS);
      System.out.println(diferencaSegundos);
      System.out.println(diferencaMinutos);
      System.out.println(diferencaHoras);
      System.out.println(diferencaDias);*/

}
