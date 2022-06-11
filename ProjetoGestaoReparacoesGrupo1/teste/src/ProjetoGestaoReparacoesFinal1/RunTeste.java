package ProjetoGestaoReparacoesFinal1;

import ProjetoGestaoReparacoesFinal1.Cliente;
import ProjetoGestaoReparacoesFinal1.Funcoes;
import ProjetoGestaoReparacoesFinal1.IO;
import ProjetoGestaoReparacoesFinal1.Reparacao;

import java.util.ArrayList;




public class RunTeste extends Funcoes
{
    private static ArrayList<ProjetoGestaoReparacoesFinal1.Cliente> listaCli = new ArrayList<>();
    private static int opcao;
    private static int idpes;

    public static void main(String[] args)
    {

        // menu principal
        int opcao;
        do {
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
            switch (opcao) {
                case 1: {
                    int opcao1;
                    do {
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
                        switch (opcao1) {
                            case 1:
                                adicionarCliente();
                                break;
                        }
                    } while (opcao1 != 0);
                    break;

                }
                case 2: {
                    int opcao2 = 0;
                    do {
                        System.out.println("          MANGA RIVER, LDA          ");
                        System.out.println("||********************************||");
                        System.out.println("||==           Atualizar         ==||");
                        System.out.println("||********************************||");
                        System.out.println("|| 1 - Clientes                   ||");
                        System.out.println("|| 2 - Reparação                  ||");
                        System.out.println("|| 0 - Sair                       ||");
                        System.out.println("||********************************||");
                        System.out.print(" Opção : ");
                        opcao2 = IO.getInt();
                        System.out.print("\n");
                        switch (opcao2) {

                        }
                    } while (opcao2 != 0);
                }

            }
        }while (opcao != 0) ;

    }
}