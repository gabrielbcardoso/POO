
package com.mycompany.cervejaria;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class ArquivoUtils {
    
        public static String abrirArquivo() {
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            try {
                return lerArquivo(fileChooser.getSelectedFile());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Erro ao abrir o arquivo", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
        return null;
    }

    public static void salvarArquivo(java.io.File file, String conteudo) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(conteudo);
        }
    }

    public static String lerArquivo(java.io.File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            StringBuilder sb = new StringBuilder();
            String linha;
            while ((linha = br.readLine()) != null) {
                sb.append(linha).append("\n");
            }
            return sb.toString();
        }
    }
    
}
