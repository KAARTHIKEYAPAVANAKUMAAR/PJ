package javalab;
import java.awt.*; 
import javax.swing.*; 
public class addTable extends JFrame{ 
	JTable table; 
	public addTable(){ 
		setLayout(new FlowLayout()); 
		String [] columnNames = { "First name", "Last name", "Header"}; 
		Object [][] data = {{ "Bill", "George", "Male"}, {"Marry", "Anna", "Female"},{"Rick", "Bernard", "Male"}}; 
		table = new JTable(data, columnNames); 
		table.setPreferredScrollableViewportSize(new Dimension(650, 75) ); 				
		table.setFillsViewportHeight(true); 
		JScrollPane scrollPane = new JScrollPane(table); 
		add(scrollPane); 
	} 
	public static void main(String args[]){ 
		addTable t = new addTable(); 
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		t.setSize(800, 400); 
		t.setTitle("My Table"); 
		t.setLocationRelativeTo(null); 
		t.setVisible(true); 
	} 
} 
