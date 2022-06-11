package ProjetoGestaoReparacoesFinal1;

import ProjetoGestaoReparacoesFinal1.Cliente;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Reparacao extends ProjetoGestaoReparacoesFinal1.Cliente {
    private String descricao;
    private LocalDate date;
    private ProjetoGestaoReparacoesFinal1.Cliente c;
    private float valorSprestado;
    private float valorPecasAplicar;
    private String estado;
    private double saldoRepara;
    private Integer numRegisto;

    public Reparacao(){

    }
    public Reparacao(String descricao, ProjetoGestaoReparacoesFinal1.Cliente c, float valorSprestado, float valorPecasAplicar, String estado, double saldoRepara) {
        this.descricao = descricao;
        this.c = c;
        this.valorSprestado = valorSprestado;
        this.valorPecasAplicar = valorPecasAplicar;
        this.estado = estado;
        this.saldoRepara = saldoRepara;
    }

    public Integer getNumRegisto() {
        return numRegisto;
    }

    public Integer setNumRegisto(Integer numRegisto) {
        return this.numRegisto = numRegisto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValorSprestado() {
        return valorSprestado;
    }

    public void setValorSprestado(float valorSprestado) {
        this.valorSprestado = valorSprestado;
    }

    public float getValorPecasAplicar() {
        return valorPecasAplicar;
    }

    public void setValorPecasAplicar(float valorPecasAplicar) {
        this.valorPecasAplicar = valorPecasAplicar;
    }

    public Cliente getCli() {
        return c;
    }

    public void setCli() {
        c.getId();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getSaldoRepara() {
        return saldoRepara;
    }

    public void setSaldoRepara(double saldoRepara) {
        this.saldoRepara = saldoRepara;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Cliente ID = " + getCli() +  " -> Descrição Reparação: " + descricao + " -> Serviços prestados = " + valorSprestado + " ->Peças Aplicar = " + valorPecasAplicar + "-> Estado = " + estado;
    }
}
