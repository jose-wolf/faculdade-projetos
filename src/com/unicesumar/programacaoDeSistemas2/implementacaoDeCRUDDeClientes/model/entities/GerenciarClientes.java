package com.unicesumar.programacaoDeSistemas2.implementacaoDeCRUDDeClientes.model.entities;

import java.util.ArrayList;
import java.util.List;

public class GerenciarClientes {

    private List<Cliente> clienteList = new ArrayList<>();

    public void adicionarClientes(Cliente cliente){
        clienteList.add(cliente);
    }

    public void removerCliente(int codigo){
        for (Cliente cliente : clienteList){
            if(cliente.getCodigo() == codigo){
                System.out.println("Cliente removido!");
                clienteList.remove(cliente);
                break;
            }else {
                System.out.println("Código não encontrado!");
            }
        }
    }

    public void listarClientes(){
        for (Cliente cliente : clienteList){
            System.out.print(cliente.getCodigo() + " - " + cliente.getNome() + " - " + cliente.getEmail() + " - " +
                    cliente.getTelefone() + "\n");
            System.out.println("----------------");
        }
    }

    public void buscarCliente(int codigo){
        for (Cliente cliente : clienteList){
            if (cliente.getCodigo() == codigo){
                System.out.print(cliente.getCodigo() + " - " + cliente.getNome() + " - " + cliente.getEmail() + " - " +
                        cliente.getTelefone() + "\n");
                System.out.println("----------------");
            }
        }
    }

    public void atualizarCliente(int codigo, String novoNome, String novoEmail, String novoTelefone){
        for (Cliente cliente : clienteList){
            if (cliente.getCodigo() == codigo){
                cliente.setNome(novoNome);
                cliente.setEmail(novoEmail);
                cliente.setTelefone(novoTelefone);
                System.out.println("Cliente atualizado!");
            }
        }
    }

}
