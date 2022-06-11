package ProjetoGestaoReparacoesFinal;

import java.util.ArrayList;


public class RunTeste extends Funcoes
{
    private static ArrayList<Cliente> listaCli = new ArrayList<>();
    private static int opcao;
    private static int idpes;

    public static void main(String[] args)
    {

        // menu principal
        int opcao;
        do
        {
            System.out.println("          MANGA RIVER, LDA          ");
            System.out.println("||********************************||");
            System.out.println("||==            MENU            ==||");
            System.out.println("||********************************||");
            System.out.println("|| 1 - Registar                   ||");
            System.out.println("|| 2 - Atualizar                  ||");
            System.out.println("|| 3 - Listagens                  ||");
            System.out.println("|| 4 - Apagar                     ||");
            System.out.println("|| 5 - Gravar File                ||");
            System.out.println("|| 6 - Consultar File             ||");
            System.out.println("|| 7 - Reset File                 ||");
            System.out.println("|| 0 - Sair                       ||");
            System.out.println("||********************************||");
            System.out.print(" Opção : ");
            opcao = IO.getInt();
            System.out.print("\n");
            switch (opcao)
            {
                case 1:
                {
                    int opcao1;

                    do
                    {

                        System.out.println("          MANGA RIVER, LDA          ");
                        System.out.println("||********************************||");
                        System.out.println("||==           REGISTO          ==||");
                        System.out.println("||********************************||");
                        System.out.println("|| 1 - Clientes                   ||");
                        System.out.println("|| 2 - Reparação                  ||");
                        System.out.println("|| 0 - Sair                       ||");
                        System.out.println("||********************************||");
                        System.out.print(" Opção : ");
                        opcao1 = IO.getInt();
                        System.out.print("\n");
                        switch (opcao1)
                        {
                            case 1:
                                adicionarCliente();
                                System.out.println("  ");
                                break;
                            case 2:
                                adicionarReparacao();
                                System.out.println("  ");
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }
                    } while (opcao1 != 0);
                    break;
                }
                case 2:
                {
                    int opcao2;
                    do
                    {
                        System.out.println("          MANGA RIVER, LDA          ");
                        System.out.println("||********************************||");
                        System.out.println("||==          ATUALIZAR         ==||");
                        System.out.println("||********************************||");
                        System.out.println("|| 1 - Clientes                   ||");
                        System.out.println("|| 2 - Reparação                  ||");
                        System.out.println("|| 0 - Sair                       ||");
                        System.out.println("||********************************||");
                        System.out.print(" Opção : ");
                        opcao2 = IO.getInt();
                        System.out.print("\n");
                        switch (opcao2)
                        {
                            case 1:
                                pesqClienteToStr();
                                updateCliente();
                                break;
                            case 2:
                                Cliente c = new Cliente();
                                upDateReparacao(c);
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }
                    } while (opcao2 != 0);
                    break;
                }
                case 3:
                {
                    int opcao3;
                    do
                    {
                        System.out.println("            MANGA RIVER, LDA          ");
                        System.out.println("||**********************************||");
                        System.out.println("||==           LISTAGENS          ==||");
                        System.out.println("||**********************************||");
                        System.out.println("|| 1 - Clientes  (Todos)            ||");
                        System.out.println("|| 2 - Clientes (ID)                ||");
                        System.out.println("|| 3 - Reparações (Todas)           ||");
                        System.out.println("|| 4 - Reparações (Estado)          ||");
                        System.out.println("|| 5 - Data                         ||");
                        System.out.println("|| 0 - Sair                         ||");
                        System.out.println("||**********************************||");
                        System.out.print(" Opção : ");
                        opcao3 = IO.getInt();
                        System.out.print("\n");
                        switch (opcao3)
                        {
                            case 1:
                                mostrarListasClientes();
                                break;
                            case 2:
                                System.out.println("Pesquisar por ID cliente : ");
                                int id = IO.getInt();
                                Reparacao reparac = pesquisaReparacaoCliente(id);
                                //Cliente clienteCli = pesquisaCliente(id);
                                if (reparac == null)
                                    System.out.println("Não existe");
                                break;
                            case 3:
                                mostrarListasReparacao();
                                //pesqReparacaoToStr();
                                break;
                            case 4:
                                System.out.println("Registado / Em Curso / Aguarda Peças / Pronto / Fechado");
                                System.out.print("Insira o estado........: ");
                                String estado = IO.getString();
                                Reparacao reparacao = pesquisaReparacaoEstado(estado);
                                if (reparacao == null)
                                    System.out.println("Não existe");
                                break;
                            case 5:
                                pesqEntreData();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }
                    } while (opcao3 != 0);
                    break;
                }
                case 4:
                {
                    int opcao4;
                    do
                    {
                        System.out.println("          MANGA RIVER, LDA          ");
                        System.out.println("||********************************||");
                        System.out.println("||==            APAGAR          ==||");
                        System.out.println("||********************************||");
                        System.out.println("|| 1 - Cliente                    ||");
                        System.out.println("|| 2 - Reparação                  ||");
                        System.out.println("||********************************||");
                        System.out.print(" Opção : ");
                        opcao4 = IO.getInt();
                        System.out.print("\n");
                        switch (opcao4)
                        {
                            case 1:
                                eliminarCliente();
                                break;
                            case 2:
                                eliminarReparacaoRegistado();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }
                    } while (opcao4 != 0);
                    break;
                }
                case 5:
                {
                    int opcao5;
                    do
                    {
                        System.out.println("          MANGA RIVER, LDA          ");
                        System.out.println("||********************************||");
                        System.out.println("||==            GRAVAR          ==||");
                        System.out.println("||********************************||");
                        System.out.println("|| 1 - Cliente                    ||");
                        System.out.println("|| 2 - Reparação                  ||");
                        System.out.println("||********************************||");
                        System.out.print(" Opção : ");
                        opcao5 = IO.getInt();
                        System.out.print("\n");
                        switch (opcao5)
                        {
                            case 1:
                                escreverFileCliente();
                                break;
                            case 2:
                                escreverFileReparacao();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }
                    } while (opcao5 != 0);
                    break;
                }

                case 6:
                {
                    int opcao6;
                    do
                    {
                        System.out.println("          MANGA RIVER, LDA          ");
                        System.out.println("||********************************||");
                        System.out.println("||==        CONSULTA FILE       ==||");
                        System.out.println("||********************************||");
                        System.out.println("|| 1 - Cliente                    ||");
                        System.out.println("|| 2 - Reparação                  ||");
                        System.out.println("||********************************||");
                        System.out.print(" Opção : ");
                        opcao6 = IO.getInt();
                        System.out.print("\n");
                        switch (opcao6)
                        {
                            case 1:
                                consultaFileCliente();
                                break;
                            case 2:
                                consultaFileReparacao();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }
                    } while (opcao6 != 0);
                    break;
                }
                case 7:
                {
                    int opcao7;
                    do
                    {
                        System.out.println("          MANGA RIVER, LDA          ");
                        System.out.println("||********************************||");
                        System.out.println("||==         DELETE FILE        ==||");
                        System.out.println("||********************************||");
                        System.out.println("|| 1 - Cliente                    ||");
                        System.out.println("|| 2 - Reparação                  ||");
                        System.out.println("||********************************||");
                        System.out.print(" Opção : ");
                        opcao7 = IO.getInt();
                        System.out.print("\n");
                        switch (opcao7)
                        {
                            case 1:
                                listaCli = resetCliente();
                                break;
                            case 2:
                                resetReparacao();
                                break;
                            case 0:
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                                break;
                        }
                    } while (opcao7 != 0);
                    break;
                }
                case 0:
                    break;
                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        } while (opcao != 0);

    }


}