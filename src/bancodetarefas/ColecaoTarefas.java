/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodetarefas;

import java.util.ArrayList;
import java.util.List;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 *
 * @author leope
 */
public class ColecaoTarefas {

    private List<Tarefa> colecaoTarefas;

    public ColecaoTarefas() {
        this.colecaoTarefas = new ArrayList();
    }

    public void importarTarefa(String caminhoArquivo) throws IOException {
        File arquivo = new File(caminhoArquivo);
        FileReader reader = new FileReader(arquivo);
        BufferedReader buff = new BufferedReader(reader);

        String caminho;
        String nome;
        String descricao;
        String genero;

        while ((caminho = buff.readLine()) != null) {

            nome = buff.readLine();
            descricao = buff.readLine();
            genero = buff.readLine();

            colecaoTarefas.add(new Tarefa(nome, descricao, genero, caminho));

            buff.readLine();
        }

        buff.close();
        reader.close();

    }

    public void exportarMidias(String nomeArquivo) throws IOException {
        FileOutputStream outFile;
        BufferedWriter buff;

        outFile = new FileOutputStream(new File(nomeArquivo));
        buff = new BufferedWriter(new OutputStreamWriter(outFile, "UTF-8"));

        for (Tarefa tarefa : colecaoTarefas) {

            buff.write(tarefa.toString());
            buff.write("\r\n");
        }

        buff.close();
        outFile.close();
    }

    public void addTarefa(Tarefa tarefa) throws Exception {
        if (!this.colecaoTarefas.add(tarefa)) {
            throw new Exception("Falha ao adicionar uma tarefa!");
        }
    }

    public boolean removeTarefa(Tarefa tarefa) {
        for (Tarefa tarefadacolecao : colecaoTarefas) {
            if (tarefadacolecao.equals(tarefa)) {
                colecaoTarefas.remove(tarefa);
                return true;
            }
        }
        return false;
    }
}
