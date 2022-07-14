package br.com.fabio.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {
	public static void main(String[] args) throws IOException {
			//padrao de projeto decorator
			//Fluxo de Saida com arquivo
			OutputStream fos = new FileOutputStream("lorem2.txt");//binario
			Writer osw = new OutputStreamWriter(fos);//trasforma os bytes em caracteres
			BufferedWriter bw = new BufferedWriter(osw);//junta os varios caracteres que estoa em uma linha.
			
			bw.write("Fabio amo a karla");
			bw.newLine();
			bw.write("Fabio amo a Arthur");
			bw.newLine();
			bw.write("Fabio amo a Kowalski");
			
			bw.close();
			
		
	}
}
