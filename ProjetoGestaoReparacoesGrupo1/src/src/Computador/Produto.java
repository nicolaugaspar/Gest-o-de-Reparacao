package Computador;

public class Produto {

    private float precoCompra;
    private float precoVenda;
    private int quantidade;

    public float getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(float precoCompra) {
        this.precoCompra = precoCompra;
    }

    public float getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "precoCompra=" + precoCompra +
                ", precoVenda=" + precoVenda +
                ", quantidade=" + quantidade +
                '}';
    }
}
