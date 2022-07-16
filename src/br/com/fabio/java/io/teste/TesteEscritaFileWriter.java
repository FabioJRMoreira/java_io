package br.com.fabio.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {
	public static void main(String[] args) throws IOException {
			//padrao de projeto decorator
			//Fluxo de Saida com arquivo
			//OutputStream fos = new FileOutputStream("lorem2.txt");//binario
			//Writer osw = new OutputStreamWriter(fos);//trasforma os bytes em caracteres
			//BufferedWriter bw = new BufferedWriter(osw);//junta os varios caracteres que estoa em uma linha.
			//uso da classe filewrite para simplificar o codigo.
			BufferedWriter bw = new BufferedWriter(new FileWriter("lorem2.txt"));
			bw.write("Fabio ama a karla");
			bw.newLine();
			bw.write("Fabio ama a Arthur");
			bw.newLine();
			bw.write("Fabio ama a Kowalski");
			
			bw.close();
			
		
	}
}
