import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MatrizG extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MatrizG frame = new MatrizG();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MatrizG() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	public void paint(Graphics g){
	       Graphics2D g2 = (Graphics2D) g;	
	       Caracol m = new Caracol();	      
	       int x = 0;
	       int y = 0;
	       
	       for(int i=0; i < 4; i++) {  
	    	   for(int j=0; j < 4; j++) {  
	    		   g2.setColor(m.regresaColor(m.getMatrizP()[i][j]));
	    		   g2.fillRect(x, y, 100, 100);  
	    		   g2.setColor(Color.BLUE);
	    		   g2.drawRect(x, y, 100, 100);	    	 
	    		   g2.setColor(Color.YELLOW);
		    	   g2.drawString(String.valueOf(m.getMatrizP()[i][j]), x + 50, y + 50);
		    		
		    	   x = x + 100;
	    	   }
	    	   x =0;
	    	   y = y + 100;
	       }
	       
	      
	}

}
