package aps.Model;

public class MetaESG {
    private double consumoAgua;
    private double materiaisSustentaveis;
    private double emissoesGEE;
    private double tfat;
    private double empregosLocais;

    public MetaESG(double consumoAgua, double materiaisSustentaveis, double emissoesGEE, double tfat, double empregosLocais) {
        this.consumoAgua = consumoAgua;
        this.materiaisSustentaveis = materiaisSustentaveis;
        this.emissoesGEE = emissoesGEE;
        this.tfat = tfat;
        this.empregosLocais = empregosLocais;
    }


    public double getConsumoAgua() {
        return consumoAgua;
    }

    public void setConsumoAgua(double consumoAgua) {
        this.consumoAgua = consumoAgua;
    }

    public double getMateriaisSustentaveis() {
        return materiaisSustentaveis;
    }

    public void setMateriaisSustentaveis(double materiaisSustentaveis) {
        this.materiaisSustentaveis = materiaisSustentaveis;
    }

    public double getEmissoesGEE() {
        return emissoesGEE;
    }

    public void setEmissoesGEE(double emissoesGEE) {
        this.emissoesGEE = emissoesGEE;
    }

    public double getTfat() {
        return tfat;
    }

    public void setTfat(double tfat) {
        this.tfat = tfat;
    }

    public double getEmpregosLocais() {
        return empregosLocais;
    }

    public void setEmpregosLocais(double empregosLocais) {
        this.empregosLocais = empregosLocais;
    }

    @Override
    public String toString() {
        return "MetaESG [Consumo de Água=" + consumoAgua + " litros/m², Materiais Sustentáveis=" + materiaisSustentaveis + 
               "%, Emissões GEE=" + emissoesGEE + " ton CO2/m², TFAT=" + tfat + ", Empregos Locais=" + empregosLocais + "]";
    }
}
