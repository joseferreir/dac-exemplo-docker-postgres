/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.dac.dac.print.clientes;

import br.edu.ifpb.dac.teste.docker.repositorio.ClienteRepositorio;

/**
 *
 * @author jose2
 */
public class App {
    public static void main(String[] args) {
        
        ClienteRepositorio repositorio = new ClienteRepositorio();
        for (Cliente c : repositorio.todos()) {
            System.out.println(" "+c);
            
        }
    }
    
}
