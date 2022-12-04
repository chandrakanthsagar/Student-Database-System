import java.util.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.lang.String;
import java.awt.*;  
import java.awt.event.*; 
public class ProEmp1 implements ActionListener
{
	Frame f=new Frame("STUDENT PERSONAL INFO");
	Label l0=new Label("Name");
	Label l1=new Label("Hallticket");
	Label l2=new Label("ssc_marks");
	Label l3=new Label("phone_number");
    Label l4=new Label();
	TextField t0=new TextField();
	TextField t1=new TextField();
	TextField t2=new TextField();
	TextField t3=new TextField();
	
	Button b1=new Button("Insert");
	Button b2=new Button("Delete");
	ProEmp1()
	{
		l0.setBounds(50,60,100,20);
		l1.setBounds(50,80,100,20);
		l2.setBounds(50,100,100,20);
		l3.setBounds(50,120,100,20);
        l4.setBounds(300, 300, 100, 40);
		t0.setBounds(200,60,100,20);
		t1.setBounds(200,80,100,20);
		t2.setBounds(200,100,100,20);

		t3.setBounds(200,120,100,20);
		b1.setBounds(50,160,50,50);
		b2.setBounds(110,160,50,50);
		
		f.add(l0);
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t0);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
        f.add(l4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(500,500);
	}
	public void actionPerformed(ActionEvent e)
	{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try
		{
			if(e.getSource()==b1)
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Allen","Allen0209");
				String sql = "insert into Projectd8 values(\'"+t0.getText()+"\',"+t1.getText()+",\'"+t2.getText()+"\',\'"+t3.getText()+"\')";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
                l3.setText("data suceesfully inserted");

			}
			if(e.getSource()==b2)
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Allen","Allen0209");
				String sql = "delete from Projectd8 where Emp_Id = "+t1.getText()+"";
				ps=con.prepareStatement(sql);
				rs=ps.executeQuery();
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
	public static void main(String args[])
	{
		new ProEmp1();			
	}
}