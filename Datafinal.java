import java.util.*;
import javax.swing.*;
import javax.swing.JScrollPane; 
import javax.swing.JFrame;  
import javax.swing.JTextArea; 
import java.awt.FlowLayout;  
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.String;
import java.awt.*;  
import java.awt.event.*; 
public class Datafinal extends Frame implements ActionListener{
    Frame f=new Frame("Student_Database");

   
    
     
      Label l1 = new Label("Hallticket");
    Button b1=new Button("LOGIN_result");
    Button b2=new Button("LOGIN_personal_info");
    Button b3=new Button("Delete");
      Label l3=new Label();
     TextField t1=new TextField();
	 TextArea ta=new TextArea();
    
    Datafinal(){
        l1.setBounds(50,100,100,30);
        t1.setBounds(200, 100, 150, 30);
        
        b1.setBounds(250, 150, 100, 30);
        b2.setBounds(200,190,200,30);
        b3.setBounds(250,230,100,30);
		l3.setBounds(50, 280, 250, 40);
		ta.setBounds(20,320,550,200);

        
        f.add(l1);
       
        f.add(t1);
       
        f.add(l3);
        f.add(b1);
        f.add(b2);
         f.add(b3);
		 f.add(ta);
        b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
        f.setLayout(null);
        f.setVisible(true);
        f.setSize(600,600);
    }
public void actionPerformed(ActionEvent e)
	{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","shivaramakrishna","system");
			
			if(e.getSource()==b1)
			{
				String sql = "select * from markssheet where hall="+t1.getText()+"";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				ta.setText("");
				while(rs.next())
           			{           	   
					ta.append("\nDate: "+rs.getString(1)+", Amount Spent: "+rs.getString(2)+", Spent on: "+rs.getString(3)+", Mode Of Payment: "+rs.getString(4)+".");
            			}
				l3.setText("Your Transaction has Found in database");
			}
			if(e.getSource()==b3)
			{
				String sql="delete from project where Title=\'"+t1.getText()+"\'";
				ps=con.prepareStatement(sql);
				ps.executeUpdate();
				l3.setText("Your Transaction has been Deleted from database");
			}
			if(e.getSource()==b2)
			{
				String sql = "select * from project";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
				ta.setText("");
				while(rs.next())
           			{    	   
					ta.append("\nDate: "+rs.getString(1)+", Amount Spent: "+rs.getString(2)+", Spent on: "+rs.getString(3)+", Mode Of Payment: "+rs.getString(4)+".");
            			}
				l3.setText("Your Past Transaction are Displayed in TextArea");
			}
			
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
  
    public static void main(String ars[]){
        new Datafinal();
    }

}