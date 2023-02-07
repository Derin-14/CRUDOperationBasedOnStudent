package com.derin;

import java.sql.*;
import java.util.ArrayList;

public class Student 
{
	private static Connection con=null;
	private static Statement s=null;
	private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	
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
			String qry="create table student(sno int primary key auto_increment,"
					+ "sname varchar(50),sub varchar(14),email varchar(50))";
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
	public static void inserting(String name,String sub,String email) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, username, password);
			ps=con.prepareStatement("insert into student(sname,sub,email) values(?,?,?)");
			ps.setString(1,name);
			ps.setString(2, sub);
			ps.setString(3, email);
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
	public static void update(int sno,String email,String sub)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, username, password);
			ps=con.prepareStatement("update student set sub=?,email=? where sno=?");
			ps.setString(1, sub);
			ps.setString(2, email);
			ps.setInt(3,sno);
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
	public static void delete(int sno) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, username, password);
			ps=con.prepareStatement("delete from student where sno=?");
			ps.setInt(1,sno);
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
	public static void read() 
	{
		Student1 st=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, username, password);
			s=con.createStatement();
			rs=s.executeQuery("select * from student");
			while(rs.next())
			{
				System.out.println(rs.getString("sname"));
				/*int i=rs.getInt("sno");
				String n=rs.getString("sname");
				String s=rs.getString("sub");
				String e=rs.getString("email");
				
				st=new Student1(i, n, s, e);*/
			}
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
				if(rs!=null)
				{
					rs.close();
				}
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
		
		//return st;
	}
	public static ArrayList<Student1> getAllData()
	{
		ArrayList<Student1> stud=new ArrayList<Student1>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, username, password);
			s=con.createStatement();
			rs=s.executeQuery("select * from student");
			
			while(rs.next()) {
				int sn=rs.getInt("sno");
				String sna=rs.getString("sname");
				String su=rs.getString("sub");
				String em=rs.getString("email");
				
				Student1 st=new Student1(sn, sna, su, em);
				stud.add(st);
			}
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally{
			try 
			{
				if(rs!=null) {
					rs.close();
				}
				if(s!=null) {
					s.close();
				}
				if(con!=null) {
					con.close();
				}
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
		}
		return stud;
	}
}

