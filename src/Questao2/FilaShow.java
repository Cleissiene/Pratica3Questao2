package Questao2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class FilaShow {

    public static void main(String[] args) {

            List<String> fila = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\11513288\\Desktop\\ListaPessoasIngresso.txt"))) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    fila.add(linha);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        // Mostrar os 10 primeiros ingressos VIP
            System.out.println("Ingressos VIP (primeiros 10):");
            for (int i = 0; i < Math.min(10, fila.size()); i++) {
                System.out.println(fila.get(i));
            }

            // Sortear uma pessoa de sorte
            if (!fila.isEmpty()) {
                Collections.shuffle(fila);
                String pessoaSorteada = fila.get(0);
                System.out.println("\nPessoa sorteada para conhecer a banda: " + pessoaSorteada);
                fila.remove(0);
            } else {
                System.out.println("\nNão há ingressos na fila para sortear.");
            }
        }
    }

