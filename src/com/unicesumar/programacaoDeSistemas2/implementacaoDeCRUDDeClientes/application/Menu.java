package com.unicesumar.programacaoDeSistemas2.implementacaoDeCRUDDeClientes.application;

import com.unicesumar.programacaoDeSistemas2.implementacaoDeCRUDDeClientes.model.entities.Cliente;
import com.unicesumar.programacaoDeSistemas2.implementacaoDeCRUDDeClientes.model.entities.GerenciarClientes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static void menu(){
        Scanner sc = new Scanner(System.in);
        GerenciarClientes gerenciarClientes = new GerenciarClientes();

        try {
            boolean continuar = true;
            while (continuar) {
                System.out.print("1 - Cadastrar\n2 - Listar clientes\n3 - Atualizar cliente\n4 - Remover\n5 - Buscar\n" +
                        "6 - Sair\n");
                System.out.print("Escolha uma das opções: ");
                int opcao = sc.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Insira o código: ");
                        int codigo = sc.nextInt();

                        System.out.print("Insira o nome do cliente: ");
                        String nome = sc.next();

                        System.out.print("Insira o email: ");
                        String email = sc.next();

                        System.out.print("Insira o Telefone: ");
                        String telefone = sc.next();

                        Cliente cliente = new Cliente(nome, codigo, email, telefone);
                        gerenciarClientes.adicionarClientes(cliente);
                        break;
                    case 2:
                        System.out.println("Listar Clientes: ");
                        gerenciarClientes.listarClientes();
                        break;
                    case 3:
                        System.out.println("Atualizar clientes: ");
                        System.out.println("\nAtualizar cliente:");
                        System.out.print("Código: ");
                        int codigoAtualizar = sc.nextInt();
                        sc.nextLine(); // Consumir a nova linha pendente
                        System.out.print("Novo nome: ");
                        String novoNome = sc.nextLine();
                        System.out.print("Novo email: ");
                        String novoEmail = sc.nextLine();
                        System.out.print("Novo telefone: ");
                        String novoTelefone = sc.nextLine();

                        gerenciarClientes.atualizarCliente(codigoAtualizar, novoNome, novoEmail, novoTelefone);
                        break;
                    case 4:
                        System.out.println("Remover Clientes: ");
                        System.out.print("Digite o código: ");
                        int removerClientePorCodigo = sc.nextInt();
                        gerenciarClientes.removerCliente(removerClientePorCodigo);
                        break;
                    case 5:
                        System.out.println("Buscar clientes: ");
                        System.out.print("Digite o código: ");
                        int buscarClientePorCodigo = sc.nextInt();
                        gerenciarClientes.buscarCliente(buscarClientePorCodigo);
                        break;
                    case 6:
                        System.out.println("Saindo...");
                        continuar = false;
                    default:
                        System.out.println("Opção inválida!");
                }
            }
        }catch (InputMismatchException e){
            System.out.println("Insira um número inteiro positivo!");
        }
        sc.close();
    }

}
