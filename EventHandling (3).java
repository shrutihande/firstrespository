import java.awt.*;  
import java.awt.event.*;

import javax.swing.JFrame;  

public class EventHandling implements ActionListener{  
	 final TextField tf=new TextField();  
	 Button b=new Button("Button1");  
	 Button c=new Button("Button2");  
	 public EventHandling()
	 {
		 
		    JFrame f=new JFrame("ActionListener Example");  
		   
		    tf.setBounds(50,50, 150,20);  
		    
		    b.setBounds(50,100,100,30); 
		    b.addActionListener(this);
		      
		  	  
		    c.setBounds(130,100,100,30);  
		    c.addActionListener(this);
		    
		    
		    f.add(b);f.add(tf);f.add(c);  


		    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    f.setSize(400,400);  
		    f.setLayout(null);  
		    f.setVisible(true); 
	 }
	 
	 public void actionPerformed(ActionEvent e){  
		 
		 if(e.getSource()==b)
		 {
			 tf.setText("Button1 Clicked");  
		 }
		 else
		 {

			 tf.setText("Button2 Clicked"); 
		 }
        
}  
	 
	 
public static void main(String[] args) {  
	
	
	new EventHandling();
}
      
}  





