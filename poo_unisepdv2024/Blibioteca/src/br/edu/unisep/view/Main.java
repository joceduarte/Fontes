package br.edu.unisep.view;

import br.edu.unisep.model.Autor;
import br.edu.unisep.model.Emprestomo;
import br.edu.unisep.model.Livro;
import br.edu.unisep.model.Usuario;

import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        Usuario pessoa = new Usuario("Jocemar",1,"Jocemar156@gmail.com");
        Autor autor = new Autor("Luis Matos",1);
        Livro livro = new Livro(1,"Mentes extraordinarias", autor);
        Emprestomo emprestomo = new Emprestomo(1, livro, pessoa);

        JOptionPane.showMessageDialog(null, emprestomo.toString());
    }
}