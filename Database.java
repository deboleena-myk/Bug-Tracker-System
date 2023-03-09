package bgs;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.*;

import java.sql.Connection;

public class Database {
	Connection con=null;
	 public static Connection dbconnect() {
	 try {
	 Class.forName("org.sqlite.JDBC");
	 Connection con=DriverManager.getConnection("jdbc:sqlite:Database.db");
	   
	 JOptionPane.showMessageDialog(null,"DATABASE CONNECTED SUCCESSFULLY");
	 return con;
	   
	 }catch(Exception ex) {
	  JOptionPane.showMessageDialog(null,"DATABASE NOT CONNECTED");
	  return null;
	 }
	 	   
	 }

}
