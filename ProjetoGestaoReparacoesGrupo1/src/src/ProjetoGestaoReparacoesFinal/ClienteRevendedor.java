package ProjetoGestaoReparacoesFinal;

public class ClienteRevendedor extends Cliente{
    private final String tipo="Revendedor";
    private final double descontoPecas = 0;

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public double getDescontoCliente() {
        return descontoPecas;
    }

}
