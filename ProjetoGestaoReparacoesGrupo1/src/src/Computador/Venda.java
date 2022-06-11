package Computador;

import java.util.Date;

public class Venda {
    private  int idProduto;
    private  String nomeProduto;
    private  String dataProduto;
    private  String descricao;
    private  String estado;
    private  Date dataVenda;
    private  float valorTotal;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDataProduto() {
        return dataProduto;
    }

    public void setDataProduto(String dataProduto) {
        this.dataProduto = dataProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "idProduto=" + idProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", dataProduto='" + dataProduto + '\'' +
                ", descricao='" + descricao + '\'' +
                ", estado='" + estado + '\'' +
                ", dataVenda=" + dataVenda +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
