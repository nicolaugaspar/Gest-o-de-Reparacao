package Computador;

import java.util.Date;

public class Compra {
    private Date dataCompra;
    private float valorTotal;

    public Date getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "dataCompra=" + dataCompra +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
