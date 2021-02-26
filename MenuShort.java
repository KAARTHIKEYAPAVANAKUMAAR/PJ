import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;
public class MenuShort extends JFrame implements ActionListener {
	MenuShort() { 
		JMenuBar mb=new JMenuBar(); 
		JMenu draw=new JMenu("draw"); 
		mb.add(draw); 
		JMenuItem rect=new JMenuItem("rect");
 		rect.addActionListener(this); 
		draw.add(rect); 
		JMenuItem oval=new JMenuItem("oval"); 
		oval.addActionListener(this); 
		draw.add(oval); 
		setJMenuBar(mb);   //->IMPORTANT LINE 
	} 
	public void actionPerformed(ActionEvent ae) { 
		String str=ae.getActionCommand(); 
		Graphics g=getGraphics(); 
		if(str=="rect") 
			g.drawRect(100,100,100,100); 
		if(str=="oval") 												
			g.drawOval(200,200,50,100); 
	} 
	public static void main(String args[]) { 									
		MenuShort f=new MenuShort();									
		f.setTitle("my frame"); 
		f.setSize(500,500); 
		f.setVisible(true); 							   		               	            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 	}
 } 
