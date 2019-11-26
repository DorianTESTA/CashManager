package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import classes.*;

public class Validation extends HttpServlet {
    ObjectMapper mapper = new ObjectMapper();
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Banque bank = new Banque();
		Transaction trans = mapper.readValue(request.getInputStream(),Transaction.class);
		PrintWriter out = response.getWriter();
		out.println(bank.validation(trans));
	}

}
