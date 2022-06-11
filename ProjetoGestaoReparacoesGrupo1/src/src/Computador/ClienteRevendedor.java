package Computador;

public class ClienteRevendedor extends Cliente{
    private float desconto_cliente_revendedor = 10;

    public float getDesconto_cliente_revendedor() {
        return desconto_cliente_revendedor;
    }

    public void setDesconto_cliente_revendedor(float desconto_cliente_revendedor) {
        this.desconto_cliente_revendedor = desconto_cliente_revendedor;
    }

    @Override
    public String toString() {
        return "ClienteRevendedor{" +
                "desconto_cliente_revendedor=" + desconto_cliente_revendedor +
                '}';
    }
}
