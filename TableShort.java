package javalab;
import java.awt.*; 
import javax.swing.*; 
public class TableShort extends JFrame{ 
	public TableShort(){ 
		String [] columnNames = { "Name","RollNo"}; 
		Object [][] data = {{"Kaarthikeya","3"},{"Pavana","7"},{"Kumaar","11"}}; 
		JTable table = new JTable(data, columnNames);        //->IMPORTANT LINE
		JScrollPane scrollPane = new JScrollPane(table);    //->IMPORTANT LINE 
		add(scrollPane); 
	} 
	public static void main(String args[]){ 
		TableShort t = new TableShort(); 
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		t.setSize(800, 400); 
		t.setTitle("My Table"); 
		t.setVisible(true); 
	} 
} 
