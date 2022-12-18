package Server;

import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.*;

import java.net.Socket;
public class server {


		public static void main(String[] args) {
			
			// TODO Auto-generated method 
			try
			{
		ServerSocket socketServeur = new ServerSocket(1234);	
		System.out.println("Serveur en attente");
		while(true) {	
			Socket socket = socketServeur.accept();
			System.out.println("accept");
			InputStream is = socket.getInputStream();
			InputStreamReader isr= new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			String s= br.readLine();
			String result="";
			switch (s) {
				case "1":{ result="1 plat escalope + 1 soda = 20 TND";break;}
			
				case "2":{ result="2 plat ice cream = 18 TND";break;}
			
				case "3":{ result="3 pizza XL + 3 soda = 100 TND";break;}
					
				case "4": {result="4 plat escalope + 4 soda = 80 TND";break;}
			
				default :{result="You didn't order yet";break;}
			}
							



			System.out.println(result);
	
				OutputStream os=socket.getOutputStream();
			PrintWriter pw=new PrintWriter(os,true);
			pw.println(""+result);
			
			socket.close();
	
			}
		}catch(Exception ex) {
				System.out.println("eror");
			} 

		}

		private static void clientstring(int result) {
			// TODO Auto-generated method stub
			
		}

	}

