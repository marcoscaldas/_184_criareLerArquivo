package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		
		/*CRIANDO O ARQUIVO */
		String[] lines = new String[] {"Good morning", "Good afternoon","Good night"};
		String path =  "C:\\Users\\G-Fire\\Documents\\Curso Java\\Secoes\\17 Trabalhando com arquivos\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // colocar patch,true ele escreve em cima
			for(String line : lines) { //PARA CADA 	STRING LINE CONTIDA NO MEU VETOR LINES
				bw.write(line);
				bw.newLine(); // quebra de linha
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
		
		/* LENDO O ARQUIVO */		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {						
			String line = br.readLine();
			
			while(line != null)
			{
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		
	}

}
