package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileReader:  sequencia de leitura de caracteres de determinado arquivo
		
		//BufferedReader: � instanciado do fileReader e implementa otimiza��es atrav�s do buffer de mem�ria
		
		String path = "src\\Texto\\exemplo.txt";
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
		
			
			String line = br.readLine();
			
			while(line!=null) {
				
				System.out.println(line);
				line= br.readLine();
			}
			
		}catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		

	}

}
