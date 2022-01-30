/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author hassan nasir
 */
public class SQL {
    
    protected String url="jdbc:sqlserver://DESKTOP-HFO76MB\\MSSQLSERVER;"+"databaseName=proj;integratedSecurity=true;";

    public ResultSet GetHistory(){
        ResultSet rs=null;
        try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql="Select * from [history]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet GetReview(){
        ResultSet rs=null;
        try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql="Select * from [review]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet GetPrescription(){
        ResultSet rs=null;
        try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql="Select * from [prescription]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet GetPatient(){
        ResultSet rs=null;
        try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql="Select * from [patient]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet GetDoctor(){
        ResultSet rs=null;
        try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql="Select * from [doctor]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
//            while(rs.next())
//            {
//                // System.out.println(rs.getString("dname"));
//            }
           
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet GetSchedule(){
        ResultSet rs=null;
        try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql="Select * from [Schedule]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet GetDepartment(){
        ResultSet rs=null;
        try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql="Select * from [department]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet GetApointments(){
        ResultSet rs=null;
        try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql="Select * from [appointment]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }
    public ResultSet GetBills(){
        ResultSet rs=null;
        try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String sql="Select * from [bills]";
            PreparedStatement pst;
            pst = con.prepareStatement(sql);
            rs=pst.executeQuery();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return rs;
    }


     public int Login(String email, char[] password)
     {
        int found=0;
      try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String SQL = "{call [ULogin](?,?,?)}"; // for Microsoft SQL Server
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("email",email);  
            Cmt.setString("password",String.valueOf(password));
            Cmt.registerOutParameter("found", java.sql.Types.INTEGER);
            Cmt.execute();
            found=Cmt.getInt("found");

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return found;
     }
     
     public int appoint(int pid,String dname)
     {
         int found=0;
         try
         {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String SQL = "{call [appoint](?,?,?)}"; // for Microsoft SQL Server
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("docname",dname);
            Cmt.setInt("pid", pid);
            Cmt.registerOutParameter("found", java.sql.Types.INTEGER);
            Cmt.execute();
            found=Cmt.getInt("found");
           /// System.out.println(found);
         }
         catch(Exception e)  
         {
             e.printStackTrace();
         }
         return found;
     }
        public void deleteApp(int pid,String dname)
     {
         //int found=0;
         try
         {
            //System.out.println("SQL DNAME AND PID");
            //System.out.println(dname);
            //System.out.println(pid);
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String SQL = "{call [deleteApp](?,?)}"; // for Microsoft SQL Server
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("docname",dname);
            Cmt.setInt("pid", pid);
            Cmt.execute();
          //System.out.println(dname);
         }
         catch(Exception e)  
         {
             e.printStackTrace();
         }
         
     }
     public void addReview(String pname ,String dname, String rev)
     {
      
         try
         {

            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String SQL = "{call [EnterRev](?,?,?)}"; // for Microsoft SQL Server
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("docn",dname);
            Cmt.setString("patn",pname);
            Cmt.setString("rev", rev);
            Cmt.execute();
          //System.out.println(dname);
         }
         catch(Exception e)  
         {
             e.printStackTrace();
         }
         
     }
     
     
     public int enrollDoc(String email,String pass,String phno,String dept,String specialisation,String name)
     {
        int found=0;
      try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String SQL = "{call [enrollDoctor](?,?,?,?,?,?,?)}"; // for Microsoft SQL Server
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("email",email);  
            Cmt.setString("pin",String.valueOf(pass)); 
            Cmt.setString("dept",dept); 
            Cmt.setString("spec",specialisation);
            Cmt.setString("name",name);
            Cmt.setString("phoneNum",phno);  
            Cmt.registerOutParameter("Found", java.sql.Types.INTEGER);
            Cmt.execute();
            found=Cmt.getInt("Found");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return found;
     }
     
     public int SignUp(String email, char[] password, String Phone, String gen, int age,String name, String bio, String FamHis, 
             String allerg, String drug, String socioEco)
     {
        int found=0;
      try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String SQL = "{call [SignUp](?,?,?,?,?,?,?,?,?,?,?,?)}"; // for Microsoft SQL Server
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("email",email);  
            Cmt.setString("pin",String.valueOf(password));
            Cmt.setString("gender",gen); 
            Cmt.setInt("age",age); 
            Cmt.setString("famHis",FamHis); 
            Cmt.setString("drugHis",drug); 
            Cmt.setString("socioEco",socioEco); 
            Cmt.setString("allergies",allerg); 
            Cmt.setString("name",name); 
            Cmt.setString("phoneNum",Phone); 
            Cmt.setString("bioData",bio);
            
            Cmt.registerOutParameter("Found", java.sql.Types.INTEGER);
            Cmt.execute();
            found=Cmt.getInt("Found");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return found;
     }
     
     public void changeStatus(int id)
     {
         try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String SQL = "{call [changeStatus](?)}"; // for Microsoft SQL Server
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setInt("schId",id);
            Cmt.execute();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     }
     public void setToken(String dname, int pId,int tokennum,String time)
     {
         try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String SQL = "{call [setToken](?,?,?,?)}"; // for Microsoft SQL Server
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("dname", dname);
            Cmt.setString("time", time);
            Cmt.setInt("pId", pId);
            Cmt.setInt("token", tokennum);
            Cmt.execute();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     }
     public void setPresc(int pid,String med,String amount,String test,String dname)
     {
         try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String SQL = "{call [setPresc](?,?,?,?,?)}"; // for Microsoft SQL Server
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("med", med);
            Cmt.setString("test", test);
            Cmt.setString("dname", dname);
            Cmt.setInt("pid", pid);
            Cmt.setString("amount", amount);
            Cmt.execute();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     }
     
     public void setAmount(String amount,int pid)
     {
         try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String SQL = "{call [setAmount](?,?)}"; // for Microsoft SQL Server
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("amount", amount);
            Cmt.setInt("pid", pid);
            Cmt.execute();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     }
     //billId,add,crc,pin
     public void setPayment(int bid,String add,String crc,int pin )
     {
         try
        {
            Connection con = DriverManager.getConnection(url);
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String SQL = "{call [setPayment](?,?,?,?)}"; // for Microsoft SQL Server
            CallableStatement Cmt = con.prepareCall(SQL);
            Cmt.setString("add", add);
            Cmt.setString("crc", crc);
            Cmt.setInt("bid", bid);
            Cmt.setInt("pin", pin);
            Cmt.execute();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     }
}
