/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastroclientes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Aluno
 */
public class GravarArquivo {

    private String nomeArquivo;

    public GravarArquivo(String nome) {

        this.nomeArquivo = nome;
    }

    public void gravar(String conteudo) throws IOException {
        FileWriter arquivoCsv = new FileWriter(this.nomeArquivo, true);
        PrintWriter gravarArq = new PrintWriter(arquivoCsv);
        gravarArq.print(conteudo);
        arquivoCsv.close();

    }

   
    public void sobreEscrever(String conteudo) throws IOException {
        FileWriter arquivoCsv = new FileWriter(this.nomeArquivo);
        PrintWriter gravarArq = new PrintWriter(arquivoCsv);
        gravarArq.print(conteudo);
        arquivoCsv.close();

    }
}
