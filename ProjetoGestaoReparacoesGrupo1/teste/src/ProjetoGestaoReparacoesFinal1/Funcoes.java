package ProjetoGestaoReparacoesFinal1;

import ProjetoGestaoReparacoesFinal1.Reparacao;

import java.util.ArrayList;

public class Funcoes{
    private static ArrayList<ProjetoGestaoReparacoesFinal1.Cliente> listaCliente=new ArrayList<>();
    private static ArrayList<ProjetoGestaoReparacoesFinal1.Reparacao> listaReparacao=new ArrayList<>();


    public static void adicionarCliente(){

        Cliente c = new Cliente();
        listaCliente.add(c);
        registar(c);

    }

    public static void registar(Cliente j)
    {
       int escolha=0;


        System.out.println("1-cliente final 2-cliente revendedor");
        escolha = IO.getInt();
        if (escolha == 1) {
            Cliente cf = new ClienteFinal();
            j.setTipo(cf.getTipo());
        }
        if (escolha == 2) {
           Cliente  cr = new ClienteRevendedor();
           j.setTipo(cr.getTipo());
        }
    }

    public static void mostraCliente(Cliente m)
    {
        System.out.println("ID...............: " + m.getId());
        System.out.println("Tipo.............: " + m.getTipo());
        System.out.println("Nome:............: " + m.getNome());
        System.out.println("Contacto:........: " + m.getContacto());
        System.out.println("Saldo:...........: " + m.getSaldo() + "€");
        System.out.println("Estado:..........: " + m.getEstado());
        System.out.println("__________________________");
    }
    public static void listaCliente()
    {
int i =0;
        for (Cliente d :listaCliente ) {
            System.out.println( "   Cliente         "+i+1);
            mostraCliente(d);
        }
        i++;
    }

    public static void eliminarCliente()
    {
        System.out.println("Insera ID cliente para eleminar :");
       int id =IO.getInt();
        Cliente el = pesquisaCliente(id);
        if (el == null && el.getEstado()== null) {
            listaCliente.remove(el);
            System.out.println("eliminado com sucesso");
        }
        if (el != null && el.getEstado() != null) {
            System.out.println("Não é possivel, tem reparações a registadas");
        }
    }


    public static Cliente pesquisaCliente(int id)
    {
        for (Cliente cliente:listaCliente )
            if (cliente.getId().intValue() == id) {
                mostraCliente(cliente);
                return cliente;
            }
       return null;
    }

    public static Cliente mostrarPesquisa()
    {
        for (Cliente cliente: listaCliente) {
            System.out.println(cliente);

        }
        return null;
    }


}



