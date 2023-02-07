package com.palle;

import java.sql.*;

public class Employee 
{
	private static Connection con=null;
	private static Statement s=null;
	private static PreparedStatement ps=null;
	
	private static final String url="jdbc:mysql://localhost:3306/palle"; 
	private static final String username="root";
	private static final String password="admin";
	
	public static void creating() 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, username, password);
			s=con.createStatement();
			String qry="create table employee(eno int primary key auto_increment,"
					+ "ename varchar(50),esal int)";
			s.executeUpdate(qry);
			
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if(s!=null) 
				{
					s.close();
				}
				if(con!=null) 
				{
					con.close();
				}
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void insert(String ename,int esal) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, username, password);
			ps=con.prepareStatement("insert into employee(ename,esal) values(?,?)");
			ps.setString(1, ename);
			ps.setInt(2, esal);
			ps.executeUpdate();
			
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if(ps!=null) 
				{
					ps.close();
				}
				if(con!=null) 
				{
					con.close();
				}
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void update(int eno,String ename,int esal)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, username, password);
			ps=con.prepareStatement("update employee set ename=?,esal=? where eno=?");
			ps.setString(1, ename);
			ps.setInt(2, esal);
			ps.setInt(3, eno);
			ps.executeUpdate();
			
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if(ps!=null) 
				{
					ps.close();
				}
				if(con!=null) 
				{
					con.close();
				}
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public static void delete(int eno) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, username, password);
			ps=con.prepareStatement("delete from employee where eno=?");
			ps.setInt(1, eno);
			ps.executeUpdate();
			
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				if(ps!=null) 
				{
					ps.close();
				}
				if(con!=null) 
				{
					con.close();
				}
			} 
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
}
