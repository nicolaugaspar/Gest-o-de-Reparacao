package ProjetoGestaoReparacoesFinal;

import java.io.Serializable;

public class  Cliente implements Serializable {
    private Integer id;
    private String nome;
    private String contacto;
    private String tipo;
    private double saldo;
    private double descontoCliente;
    private String estado;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    //alterei void para int
    public int setId(Integer id) {
       return this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getContacto() {
        return contacto;
    }
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public String getTipo() {
        return tipo;
    }
    public String setTipo(String tipo) {
        return this.tipo = tipo;
    }

    public double getSaldo() {
        return saldo;
    }

    public double setSaldo(double saldo) {
        return  this.saldo = saldo;
    }

    @Override
    public String toString()
    {
        return id + "   ->  " + nome +   " -> Tipo: " + tipo + " -> Saldo: " + saldo;
    }

    public double getDescontoCliente() {
        return descontoCliente;
    }

    public void setDescontoCliente(double descontoCliente) {
        this.descontoCliente = descontoCliente;
    }



}
