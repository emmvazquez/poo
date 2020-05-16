import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Circulos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Circulos frame = new Circulos();
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
	public Circulos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	 public void paint(Graphics g){
         g.drawOval(50, 50, 100, 150); //Dibuja un circulo
         
         ArregloFiguras obj = new ArregloFiguras();
         obj.regresaArreglo();
         
         for(int i =0; i < obj.regresaArreglo().length ; i ++) {
        	 g.drawOval(obj.regresaArreglo()[i].getPosX(), obj.regresaArreglo()[i].getPosY(),obj.regresaArreglo()[i].getLargo(),obj.regresaArreglo()[i].getAncho());
         }
    }

}
