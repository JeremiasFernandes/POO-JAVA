package tppoo;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        
        BibliotecasInterface biblioInter = new BibliotecasInterface();
        Bibliotecas bibliotecas = new Bibliotecas();
        GerenciamentoArq.lerArquivoBibliotecas(bibliotecas);
        GerenciamentoArq.lerArquivoLivros(bibliotecas.getBibliotecas());
        biblioInter.interfaceMenu(bibliotecas);
        //Biblioteca biblioteca = new Biblioteca();
        //GerenciamentoArq.lerArquivo(biblioteca);
        //inter.interfaceMenu(biblioteca);        
    }
}
