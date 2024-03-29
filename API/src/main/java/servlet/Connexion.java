package servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import classes.Parametres;

public class Connexion extends HttpServlet {
	ObjectMapper mapper = new ObjectMapper();
    Parametres server_param;
    
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Route du fichier � changer !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	File file = new File("c:\\Users\\Dorian\\CashManager\\Parametres.json");
	// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Route du fichier � changer !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		server_param = mapper.readValue(file, Parametres.class);
		Parametres params = mapper.readValue(request.getInputStream(),Parametres.class);
		PrintWriter out = response.getWriter();
		 
		 if(params.getPassword().equals(server_param.getPassword()))
			 out.println("{ \"conn_delay\" : "+server_param.getConnDelay()+", \"num_attempts\" : "+server_param.getNumAttempts()+", \"num_wrong\" : "+server_param.getNumWrong()+"}");
		 else 
			 out.println("\""+params.getPassword()+"\""+" is not the password to the server.");
	}
}