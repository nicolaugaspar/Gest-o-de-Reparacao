package Computador;

import ProjetoGestaoReparacoesFinal.IO;

import java.io.Serializable;


public class Runteste extends Funcao implements Serializable {

    private static int opcao;

    public static void main(String[] args) {

        int opcao, opcao1;
        do {
            System.out.println("                MENU                ");
            System.out.println("||********************************||");
            System.out.println("||==           CLIENTE          ==||");
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


                    do {
                        System.out.println("          MENU                      ");
                        System.out.println("||********************************||");
                        System.out.println("||==          ATUALIZAR         ==||");
                        System.out.println("||********************************||");
                        System.out.println("|| 1 - Clientes                   ||");
                        System.out.println("|| 2 - Compra                     ||");
                        System.out.println("|| 0 - Sair                       ||");
                        System.out.println("||********************************||");
                        System.out.print(" Opção : ");
                        opcao1 = IO.getInt();
                        switch (opcao1) {
                            case 1:
                                adicionar();
                                break;
                            case 2:
                                Cliente m = new Cliente();
                                mostrarCliente(m);
                                break;
                            default:
                                System.out.println("Não há registo");
                        }
                    } while (opcao1 != 0);


                }
            }


        }while (opcao != 0);

    }
}
