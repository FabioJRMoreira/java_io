package br.com.fabio.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TesteEscrita2 {
	public static void main(String[] args) throws IOException {
			//padrao de projeto decorator
			//Fluxo de Saida com arquivo
//			OutputStream fos = new FileOutputStream("lorem2.txt");//binario
//			Writer osw = new OutputStreamWriter(fos);//trasforma os bytes em caracteres
//			BufferedWriter bw = new BufferedWriter(osw);//junta os varios caracteres que estoa em uma linha.
			
			//imprime um fluxo de dados 
			PrintStream ps = new PrintStream("lorem2.txt");
			
			//imprime um fluxo de caractres
			PrintWriter pw = new PrintWriter("lorem2.txt");
			
			ps.println("Fabio amo a karla");
			ps.println("Fabio amo a Arthur");
			ps.println("Fabio amo a Kowalski");
			
			pw.println("1");
			pw.println("2");
			pw.println("3");
			
//			bw.write("Fabio amo a karla");
//			bw.newLine();
//			bw.write("Fabio amo a Arthur");
//			bw.newLine();
//			bw.write("Fabio amo a Kowalski");
			
			ps.close();
			
		
	}
}
