package Computador;

import java.util.ArrayList;
import Computador.ClienteRevendedor;



public class Funcao {
static int escolha;
private static ArrayList<Cliente>listacliente = new ArrayList<>();
private static ArrayList<Venda>listavenda = new ArrayList<>();
private static ArrayList<Compra>listacompra = new ArrayList<>();
private static ArrayList<Fornecedores>listafornecedores = new ArrayList<>();
private static ArrayList<Produto>listaprodutos = new ArrayList<>();

public static void adicionar()
{
    Cliente cliente = new Cliente();
      listacliente.add(cliente);
    registocliente(cliente);
}
public static void registocliente( Cliente j){

    System.out.println("1-ClienteFinal   2-ClienteRevendedor   ");
    escolha = IO.getInt();

    if (escolha ==  1)
    {
        ClienteFinal cf = new ClienteFinal();
        j.setTipo(cf.getTipo());
    }
    if (escolha == 2) {
        ClienteRevendedor cr = new ClienteRevendedor();
        j.setTipo(cr.getTipo());
    }

    System.out.println("ID");
    j.setId((IO.getInt()));
    System.out.println("digita o nome");
    j.setPrimeironome(IO.getString());
    System.out.println("digita apelido");
    j.setApelido(IO.getString());
    System.out.println("digita o nif");
    j.setNif(IO.getInt());
    System.out.println("digita o telemovel");
    j.setTelemovel(IO.getInt());
    System.out.println("digita a cidade");

}

    public static void mostrarCliente( Cliente m)
    {

        System.out.println("ID"+m.getId());
        System.out.println("digita o nome" +m.getPrimeironome());
        System.out.println("digita apelido" +m.getApelido());
        System.out.println("digita o nif"+m.getNif());
        System.out.println("digita o telemovel"+m.getTelemovel());
        System.out.println("digita a cidade"+m.getCidade());

    }

    public static void listaCliente()
    {
        for (Cliente cliente:listacliente) {
            mostrarCliente(cliente);
        }
    }

    public static void eliminarCliente( )
    {
        int id = IO.getInt();
       Cliente j = pesquisaCliente(id);
        if (j != null && j.getEstado()==null){
            System.out.println("Eliminar cliente pelo ID");
            listacliente.remove(j);
        }
    }

    public static Cliente pesquisaCliente(int id)
    {
        for (Cliente cliente : listacliente)
            if (cliente.getId() == id)
            {
                mostrarCliente(cliente);
                return cliente;
            }
        return null;
    }

    public static void addFornecedores()
    {
        Fornecedores f = new Fornecedores();
        listafornecedores.add(f);
        registoFornecedores(f);
    }
    public static void registoFornecedores( Cliente f)
    {
        System.out.println("ID");
        f.setId((IO.getInt()));
        System.out.println("digita o nome");
        f.setPrimeironome(IO.getString());
        System.out.println("digita apelido");
       f.setApelido(IO.getString());
        System.out.println("digita o nif");
       f.setNif(IO.getInt());
        System.out.println("digita o telemovel");
        f.setTelemovel(IO.getInt());
        System.out.println("digita a cidade");
        f.setCidade(IO.getString());
    }

    public static void mostrarFornecedores(Cliente f)
    {
        System.out.println("ID"+f.getId());
        System.out.println("digita o nome" +f.getPrimeironome());
        System.out.println("digita apelido" +f.getApelido());
        System.out.println("digita o nif"+f.getNif());
        System.out.println("digita o telemovel"+f.getTelemovel());
        System.out.println("digita a cidade"+f.getCidade());
    }
    public static void removerFornecedores()
    {
        try {
            System.out.println("digita fornecedores a remover");
            int id = IO.getInt();
            Fornecedores f=  pesquisarFornecedores(id);
            if (id == f.getId()) {
            System.out.println("removido com sucesso");
            listafornecedores.remove(f);
            }


        } catch(Exception e) {
            System.out.println(e);
        }
    }
    public static Fornecedores pesquisarFornecedores(int id)
    {
        for (Fornecedores f:listafornecedores) {
            if (f.getId() == id) {
                mostrarFornecedores(f);
               return f;
            }
        }
        return null;
    }

}
