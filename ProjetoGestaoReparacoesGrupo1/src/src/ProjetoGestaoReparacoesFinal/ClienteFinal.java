package ProjetoGestaoReparacoesFinal;

public class ClienteFinal extends Cliente{
    private final String tipo = "Final";
    private float descServ;
    private final double descontoServicos= 0.03;
    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public double getDescontoCliente() {
        return descontoServicos;
    }


}
