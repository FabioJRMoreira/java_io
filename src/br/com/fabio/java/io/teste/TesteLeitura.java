package br.com.fabio.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
	public static void main(String[] args) {
		
		try {
			
			//padrao de projeto decorator
			//Fluxo de Entrada com arquivo
			FileInputStream fis = new FileInputStream("lorem.txt");//binario
			//ler um InputStream
			InputStreamReader isr = new InputStreamReader(fis);//trasforma os bytes em caracteres
			BufferedReader br = new BufferedReader(isr);//junta os varios caracteres que estoa em uma linha.
			
			String readLine = br.readLine();
			while(readLine!=null) {
				System.out.println(readLine);
				readLine=br.readLine();
			}
		
			
			br.close();
			
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
