package Computador;

import java.io.Serializable;

public class Cliente implements Serializable {

    private int id;
    private  String primeironome;
    private  int nif;
    private  String apelido;
    private  int telemovel;
    private  String cidade;

    private  String email;
    private  String tipo;

   private String estado;


    public int getId() {return id; }

    public void setId(int id) { this.id = id; }

    public  String getPrimeironome() {
        return primeironome;
    }

    public  void setPrimeironome(String primeironome) {
        primeironome = primeironome;
    }

    public int getNif() {
        return nif;
    }

    public  void setNif(int nif) {
        nif = nif;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        apelido = apelido;
    }

    public int getTelemovel() {
        return telemovel;
    }

    public void setTelemovel(int telemovel) {
        telemovel = telemovel;
    }

    public String getEmail() {
        return email;
    }

    public  void setEmail(String email) {
        email = email;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public  String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
       cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", primeironome='" + primeironome + '\'' +
                ", nif=" + nif +
                ", apelido='" + apelido + '\'' +
                ", telemovel=" + telemovel +
                ", cidade='" + cidade + '\'' +
                ", email='" + email + '\'' +
                ", tipo='" + tipo + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
