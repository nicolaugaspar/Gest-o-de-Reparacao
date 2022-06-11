package Computador;

public class Fornecedores extends  Cliente{
private float desconto_fornecedor = 5;

    public float getdesconto_cliente_fornecedor() {
        return desconto_fornecedor;
    }

    public void setdesconto_cliente_fornecedor(float desconto_fornecedor) {
        this.desconto_fornecedor = desconto_fornecedor;
    }

    @Override
    public String toString() {
        return "Fornecedores{" +
                "desconto_cliente_fornecedor=" + desconto_fornecedor +
                '}';
    }
}
