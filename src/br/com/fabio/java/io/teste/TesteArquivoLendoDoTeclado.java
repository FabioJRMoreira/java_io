package br.com.fabio.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class TesteArquivoLendoDoTeclado {
	public static void main(String[] args) {
		
		try {
			
			//padrao de projeto decorator
			//Fluxo de Entrada com arquivo
			InputStream fis = System.in;//--> system.in ler do teclado
			//ler um InputStream
			Reader isr = new InputStreamReader(fis);//trasforma os bytes em caracteres
			BufferedReader br = new BufferedReader(isr);//junta os varios caracteres que estoa em uma linha.
			//Fluxo de Saida com arquivo
			OutputStream fos = new FileOutputStream("lorem2.txt");//binario
			Writer osw = new OutputStreamWriter(fos);//trasforma os bytes em caracteres
			BufferedWriter bw = new BufferedWriter(osw);//junta os varios caracteres que estoa em uma linha.
			
			String readLine = br.readLine();
			while(readLine!=null && !readLine.isEmpty()) {
				bw.write(readLine);
				bw.newLine();
				readLine=br.readLine();
			}
	
			br.close();
			bw.close();
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
