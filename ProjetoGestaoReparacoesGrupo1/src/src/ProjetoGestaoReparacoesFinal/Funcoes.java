package ProjetoGestaoReparacoesFinal;

import java.io.*;
import java.io.File;
import java.io.IOException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Funcoes{
    private static ArrayList<Cliente> listaCliente=new ArrayList<>();
    private static ArrayList<Reparacao> listaReparacao=new ArrayList<>();
    private static int contadorReparacao = 0;
    private static int contadorCliente = 0;

    private static int idVerificaCliente;
    private static int incremId=1;
    private static int escolha;
    private static int escolhaEstado;
    private static int incremIdReg=1;
    private static final String sp="Registado";

    public static void limparEcran(){
        for(int i=0; i < 20;i++)
            System.out.println('\n');
    }
    public static int simNao()
    {
        String sn = IO.getString();
        if (sn.equalsIgnoreCase("S"))
        {
            return 1;
        }
        return 0;
    }
    public static void adicionarCliente()
    {
        do
        {
            System.out.println("  ");
            Cliente cliente = new Cliente();
            registarCliente(cliente);
            listaCliente.add(cliente);
            incremId ++;
            contadorCliente++;
            System.out.print("Pretende adicionar novo cliente S/N? ");

        }while (simNao() == 1);
    }
    public static void registarCliente(Cliente cliente) {
        System.out.print("Insira Tipo: 1- Final ; 2- Revendedor: ");
        Scanner s = new Scanner(System.in);
        escolha = s.nextInt();
        if (escolha == 1){
            //cliente.setTipo("Final");
            ClienteFinal cF= new ClienteFinal();
            cliente.setTipo(cF.getTipo());
        }
        if (escolha == 2){
            //cliente.setTipo("Revendedor");
            ClienteRevendedor cRev=new ClienteRevendedor();
            cliente.setTipo(cRev.getTipo());
        }
        System.out.print("ID Cliente n...............: "+cliente.setId(incremId) + "\n");
        System.out.print("Insira Nome................: ");
        cliente.setNome(IO.getString());
        System.out.print("Insira Contacto............: ");
        cliente.setContacto(IO.getString());

    }

    public static void mostrarCliente(Cliente j)
    {
        System.out.println("ID...............: " + j.getId());
        System.out.println("Tipo.............: " + j.getTipo());
        System.out.println("Nome:............: " + j.getNome());
        System.out.println("Contacto:........: " + j.getContacto());
        System.out.println("Saldo:...........: " + j.getSaldo() + "€");
        System.out.println("Estado:..........: " + j.getEstado());
        System.out.println("__________________________");
    }

    public static void mostrarListasClientes()
    {
        int i = 1;
        for (Cliente j : listaCliente)
        {
            //System.out.println("____________________");
            System.out.println("Contador de clientes nº " + i);
            mostrarCliente(j);
            i++;
        }

    }

    public static void eliminarCliente()
    {
        System.out.print("ID do cliente a eliminar........: ");
        int id = IO.getInt();
        Cliente j = pesquisaCliente(id);
        if (j != null && j.getEstado()==null)
        {
                System.out.print("Pretende ELIMINAR cliente (S/N)?  ");
                if (simNao() == 1)
                {
                    // o cliente só pode ser apagado se ainda não tiver registado com reparação
                    listaCliente.remove(j);
                    System.out.println("Cliente apagado com sucesso");
                    return;
                }
        }
        if (j != null && j.getEstado()!=null)
        {
            System.out.println("Não é possivel, tem reparações registadas");
        }
        if(j==null){
            System.out.println("Não existe ");
        }
    }

    public static Cliente pesquisaCliente(int id)
    {
        for (Cliente cliente : listaCliente)

            if (cliente.getId().intValue() == id)
            {
                mostrarCliente(cliente);
                return  cliente;
            }
        return null;
    }

    public static Cliente pesqClienteToStr()
    {
        for (Cliente cliente : listaCliente)
                System.out.println(cliente);
        return null;
    }

    public static void updateCliente()
    {
        System.out.print("ID Cliente......: ");
        int id = IO.getInt();
        Cliente cliente = pesquisaCliente(id);
        if (cliente == null)
            System.out.println("Não existe");
        else {
            System.out.print("Insira Tipo: 1- Final ; 2- Revendedor :");
            Scanner s = new Scanner(System.in);
            escolha = s.nextInt();
            if (escolha == 1) {

                ClienteFinal cF = new ClienteFinal();
                cliente.setTipo(cF.getTipo());
            }
            if (escolha == 2) {
                ClienteRevendedor cRev = new ClienteRevendedor();
                cliente.setTipo(cRev.getTipo());
            }
            System.out.print("Insira Nome: ");
            cliente.setNome(IO.getString());

            System.out.print("Insira Contacto: ");
            cliente.setContacto(IO.getString());
            System.out.println(" ");
            System.out.println("Cliente alterado com sucesso");
        }
    }

    public static void adicionarReparacao() {
        do {
            Reparacao reparacao = new Reparacao();
            //registarReparacao(reparacao);
            System.out.print("Insira o ID do cliente : ");
            reparacao.setId(IO.getInt());
            Cliente c = pesquisaCliente(reparacao.getId());
            if (c != null) {
                if (c.getId() == reparacao.getId()) {
                   System.out.print("Reparação nº.............: " + reparacao.setNumRegisto(incremIdReg) + "\n");
//                reparacao.setNumRegisto(IO.getInt());
                    System.out.print("Insira Descrição.........: ");
                    reparacao.setDescricao(IO.getString());

                    System.out.println(" ==== DATA =====  ");
                    //validateDate(reparacao.setData(IO.getString()));
                    System.out.print("Insira o dia (DD).....: ");
                    int dia = IO.getInt();
                    System.out.print("Insira o mês (MM).....: ");
                    int mes = IO.getInt();
                    System.out.print("Insira o ano (YYYY)...: ");
                    int ano = IO.getInt();
                    LocalDate data = LocalDate.of(ano, mes, dia);
                    reparacao.setDate(data);

                    reparacao.setEstado("Registado");
                    c.setEstado(reparacao.getEstado());
                    System.out.println("Operação registada com sucesso ");

                    listaReparacao.add(reparacao);
                    incremIdReg++;
                    contadorReparacao++;
                }
            }else {
                System.out.printf("Cliente não existe");
            }
        }while (simNao() == 1) ;
    }

    public static void mostrarReparacao(Reparacao reparacao)
    {
        System.out.println("Reparação nº......................." + reparacao.getNumRegisto());
        System.out.println("Id Cliente:.......................:" + reparacao.getId());
        System.out.println("Data............................. :" + reparacao.getDate());
        System.out.println("Descrição:........................:" + reparacao.getDescricao());
        System.out.println("Estado............................:" + reparacao.getEstado());
        System.out.println("Valor peças a aplicar:............:" + reparacao.getValorPecasAplicar() + "€");
        System.out.println("Valor serviço prestado::..........:" + reparacao.getValorSprestado() + "€");
        System.out.println("Total Reparação...................:" + reparacao.getSaldoRepara() + "€");
        System.out.println("___________________________________");
    }

    public static void mostrarListasReparacao()
    {
        int i = 1;
        for (Reparacao reparacao : listaReparacao)
        {
            System.out.println("______________");
           // System.out.println("Reparação nº " + i);
            mostrarReparacao(reparacao);
            i++;
        }
    }

    public static Reparacao pesquisaReparacaoEstado(String estado)
    {
        for (Reparacao reparacao : listaReparacao) {
            if (reparacao.getEstado().equals(estado)) {
                mostrarReparacao(reparacao);
                //return reparacao;
            }
        }
        return null;
    }
    public static Reparacao pesquisaReparacaoCliente(int idCliente)
    {
        for (Reparacao reparacao : listaReparacao) {
            if (reparacao.getId().equals(idCliente)) {
                mostrarReparacao(reparacao);
            }
        }
        return null;
    }

    public static void eliminarReparacaoRegistado()
    {
        System.out.print("Insira o numero de reparacão: ");
        int nR = IO.getInt();
        Reparacao reparacao;
        for (int i = 0; i < listaReparacao.size(); i++)
        {
            reparacao = listaReparacao.get(i);
            //if (reparacao.getId()==nR) {
            if (reparacao.getNumRegisto() == nR)
            {
                if (reparacao.getEstado() == sp)
                {
                    System.out.print("Pretende ELIMINAR reparacao? (S/N)......:  ");
                    if (simNao() == 1)
                    {
                        listaReparacao.remove(reparacao);
                        System.out.println("Apagado com sucesso");
                        return;
                    }
                }
                if (reparacao.getEstado() == sp)
                {
                    System.out.println("Não é possivel eliminar por desistência, o estado não é Registado");
                }
            }
            if (reparacao.getNumRegisto() != nR)
            {
                System.out.printf("Registo não existe");
            }
        }
    }

    public static int verificaEstado(Reparacao rp)
    {
      Scanner s = new Scanner(System.in);
        escolhaEstado = s.nextInt();
        //do {
        if (escolhaEstado == 1) {
            rp.setEstado("Registado");
        }
        if (escolhaEstado == 2) {

            rp.setEstado("Em Curso");
        }
        if (escolhaEstado == 3) {
            rp.setEstado("Aguarda Peças");
        }
        if (escolhaEstado == 4) {
            rp.setEstado("Pronto");
        }
        if (escolhaEstado == 5) {
            rp.setEstado("Fechado");
        }
        return 0;
    }
    public static void faturacaoClienteFinal(Reparacao reparacao) {
        ClienteFinal cFinal = new ClienteFinal();
        Cliente c= new Cliente();
                //ClienteRevendedor cRevend = new ClienteRevendedor();
        System.out.print("Insira Valor Serviço Prestado......: ");
        reparacao.setValorSprestado(IO.getFloat());

        System.out.print("Insira Valor peças a aplicar.......: ");
        reparacao.setValorPecasAplicar(IO.getFloat());
//       pesquisaClienteTipo(cFinal.getTipo());
        System.out.print("Deseja inserir desconto de 3% sobre os serviços S/N?.....  ");

        if (simNao() == 1) {
            //Saldo = (ValorServiços - (valorServiços *  0,03)) + (ValorPeças - (ValorPeças ))
            double somaD = (reparacao.getValorSprestado() - (reparacao.getValorSprestado() * cFinal.getDescontoCliente()))
                    + reparacao.getValorPecasAplicar();
            reparacao.setSaldoRepara(somaD);
            //cli.setSaldo(somaD);
            System.out.println("(CF)Operação registada com sucesso");
        } else {
            reparacao.setSaldoRepara((reparacao.getValorSprestado() + reparacao.getValorPecasAplicar()));
            System.out.println("(CF) Operação registada com sucesso ");
        }
    }

    public static void faturacaoClienteRevendedor(Reparacao reparacao) {
        System.out.print("Insira Valor Serviço Prestado....: ");
        reparacao.setValorSprestado(IO.getFloat());

        System.out.print("Insira Valor peças................: ");
        reparacao.setValorPecasAplicar(IO.getFloat());

        System.out.print("Deseja inserir descontos S/N?       ");
        if (simNao() == 1) {
            System.out.print("Insira valor do desconto sobre os Serviços..........:  ");
            Double valorDescServ = IO.getDouble();
            System.out.print("Insira valor do desconto sobre total reparação......:  ");
            Double valorDescTotal = IO.getDouble();

            // Com descontos

            reparacao.setSaldoRepara((reparacao.getValorSprestado() - (reparacao.getValorSprestado() * (valorDescServ / 100))
                    + ((reparacao.getValorPecasAplicar() + reparacao.getValorSprestado()
                    - ((reparacao.getValorPecasAplicar() - reparacao.getValorSprestado())* (valorDescTotal / 100))))));
            System.out.println("(CR) Operação registada com sucesso ");
        } else  {
            reparacao.setSaldoRepara((reparacao.getValorSprestado() + reparacao.getValorPecasAplicar()));
            System.out.println("(CR) Operação registada com sucesso ");
        }
    }
    public static Reparacao pesqEntreData(){
        System.out.print("Insira (YYYY)......: ");
        int ano = IO.getInt();
        System.out.print("Insira (MM)........: ");
        int mes = IO.getInt();
        System.out.print("Insira (DD)........: ");
        int dia = IO.getInt();
        LocalDate data = LocalDate.of(ano,mes,dia);
        System.out.print("insira (YYYY)......: ");
        int ano2 = IO.getInt();
        System.out.print("Insira (MM)........: ");
        int mes2 = IO.getInt();
        System.out.print("Insira (DD)........: ");
        int dia2 = IO.getInt();
        LocalDate data2 = LocalDate.of(ano2,mes2,dia2);
        for ( Reparacao reparacao: listaReparacao){
            if (comparaData2(reparacao.getDate(),data)>=0 && comparaData2(reparacao.getDate(),data2)<=0 ){
                mostrarReparacao(reparacao);
            }
        }
        return null;
    }

    public static int comparaData2(LocalDate data1, LocalDate data2){
        if (data1.isAfter(data2))
            return 1;
        if (data1.isBefore(data2))
            return -1;
        return 0;
    }

    public static void upDateReparacao(Cliente c){

        System.out.print("Insira o numero reparacão: ");
        int nR = IO.getInt();
        Reparacao reparacao ;
        for (int i = 0; i < listaReparacao.size(); i++) {
            reparacao=listaReparacao.get(i);
            //if (reparacao.getId()==nR)
            if (reparacao.getNumRegisto()==nR) {
                System.out.print("Insira opção: 2-Em Curso, 3-Aguarda Peças, 4-Pronto,5-Fechado ....: ");
                verificaEstado(reparacao);
                if (reparacao.getEstado().equals("Pronto"))
                {
// Vamos pedir de novo o CF ou CR para fazer os descontos!!!
                    System.out.print("1- Cliente Final; 2-Cliente Revendedor");
                    int escolha2 = IO.getInt();
                    if (escolha2 == 1) {
                        //System.out.print("Insira ID: ");
                        //int idss = IO.getInt();
                        for (Cliente cli : listaCliente) {
                            //cli=listaCliente.get(idss);
                            if (cli.getId().intValue() == reparacao.getId()) {
                                //pesquisaCliente(c.getId());
                                //if (c.getTipo().equals("Final"))
                                faturacaoClienteFinal(reparacao);
                                cli.setSaldo(cli.getSaldo() + reparacao.getSaldoRepara());
                                cli.setEstado(reparacao.getEstado());
                            }
                        }
                    }
                    if (escolha2 == 2) {
                        //System.out.print("Insira ID: ");
                        //int idss = IO.getInt();
                        for (Cliente cliente : listaCliente) {
                            //cli=listaCliente.get(idss);
                            if (cliente.getId().intValue() == reparacao.getId()) {
                                //pesquisaCliente(c.getId());
                                //if (c.getTipo().equals("Final"))
                                faturacaoClienteRevendedor(reparacao);
                                cliente.setSaldo(cliente.getSaldo() + reparacao.getSaldoRepara());
                                cliente.setEstado(reparacao.getEstado());
                            }
                        }
                    }
                }
                else {
                    System.out.println("O estado não é pronto....");
                }
            }else {
                System.out.println("Registo não existe");
            }
        }

    }
// ========================== FICHEIROS ===========================================
    public static void escreverFileCliente(){
        try{
            FileOutputStream file = new FileOutputStream("Clientes.dat");
            ObjectOutputStream fich = new ObjectOutputStream(file);
            fich.writeObject(listaCliente);
            fich.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void consultaFileCliente(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Clientes.dat"));
            ArrayList<Cliente> listaCliente= (ArrayList<Cliente>) in.readObject();
            System.out.printf("Clientes.dat"+ "\n");
            for (Cliente c :listaCliente)
                mostrarListasClientes();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.printf("Class not found");
            e.printStackTrace();
            return;
        }
    }
    public static ArrayList<Cliente> resetCliente(){
        File ficheiro = new File("Clientes.dat");
        if (ficheiro.exists()) {
            ObjectInputStream f;
            try {
                f = new ObjectInputStream(new FileInputStream("Clientes.dat"));
                ArrayList<Cliente> listaCliente = (ArrayList<Cliente>) f.readObject();
                f.close();
                return listaCliente;

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException ee) {
                ee.printStackTrace();
            }
        }
        return null;
    }
    public static void escreverFileReparacao(){
        try{
            FileOutputStream file = new FileOutputStream("Reparação.dat");
            ObjectOutputStream fich = new ObjectOutputStream(file);
            fich.writeObject(listaReparacao);
            fich.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void consultaFileReparacao(){
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Reparação.dat"));
            ArrayList<Reparacao> listaReparacao= (ArrayList<Reparacao>) in.readObject();
            System.out.printf("Reparação.dat"+ "\n");
            for (Reparacao reparacao :listaReparacao)
                mostrarListasReparacao();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.printf("Class not found");
            e.printStackTrace();
            return;
        }
    }
    public static ArrayList<Reparacao> resetReparacao(){
        File ficheiro = new File("Reparação.dat");
        if (ficheiro.exists()) {
            ObjectInputStream f;
            try {
                f = new ObjectInputStream(new FileInputStream("Reparação.dat"));
                ArrayList<Reparacao> listaReparacao = (ArrayList<Reparacao>) f.readObject();
                f.close();
                return listaReparacao;

            } catch (IOException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException ee) {
                ee.printStackTrace();
            }
        }
        return null;
    }
}



