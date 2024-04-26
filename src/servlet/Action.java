package servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;


public interface Action {
	
	String execute(HttpServletRequest request) 
			 throws ServletException, IOException, SQLException;
			 
}
