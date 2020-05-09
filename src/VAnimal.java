import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VAnimal {

	private JFrame frame;
	private ButtonGroup bg = new ButtonGroup();
	private JTextField Nombre;
	private JTextField Color;
	private JTextField Raza;
	private JTextField Trucos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VAnimal window = new VAnimal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VAnimal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 737, 513);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton radioPerro = new JRadioButton("Perro");
		radioPerro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Trucos.setEnabled(true);
				
			}
		});
		radioPerro.setSelected(true);
		radioPerro.setBounds(123, 44, 141, 23);
		frame.getContentPane().add(radioPerro);
		
		JRadioButton radioGato = new JRadioButton("Gato");
		radioGato.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Trucos.setEnabled(false);
				Trucos.setText("");
			}
		});
		radioGato.setBounds(123, 79, 141, 23);
		frame.getContentPane().add(radioGato);
		
		bg.add(radioGato);
		bg.add(radioPerro);
		
		Nombre = new JTextField();
		Nombre.setBounds(134, 132, 130, 26);
		frame.getContentPane().add(Nombre);
		Nombre.setColumns(10);
		JTextPane Panel = new JTextPane();
		Panel.setBounds(394, 79, 228, 260);
		frame.getContentPane().add(Panel);
		
		JButton MostrarFicha = new JButton("Mostrar Ficha");
		MostrarFicha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(radioGato.isSelected()) {
					Gato objg = new Gato(Nombre.getText(), Color.getText(), Raza.getText());
					Panel.setText(objg.Ficha());
					System.out.print(radioPerro.getText());
					System.out.println("En gato");
					
				}
				else if (radioPerro.isSelected()) {
					Perro objp = new Perro(Nombre.getText(), Color.getText(), Raza.getText(), Trucos.getText());
							Panel.setText(objp.Ficha());
							System.out.println("En perro");
				}
				System.out.print(radioPerro.getText());
			}
		});
		MostrarFicha.setBounds(122, 262, 117, 29);
		frame.getContentPane().add(MostrarFicha);
		
		
		
		Color = new JTextField();
		Color.setBounds(134, 159, 130, 26);
		frame.getContentPane().add(Color);
		Color.setColumns(10);
		
		Raza = new JTextField();
		Raza.setBounds(134, 185, 130, 26);
		frame.getContentPane().add(Raza);
		Raza.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(40, 137, 61, 16);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Color");
		lblNewLabel_1.setBounds(40, 164, 61, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Raza");
		lblNewLabel_2.setBounds(40, 190, 61, 16);
		frame.getContentPane().add(lblNewLabel_2);
		
		Trucos = new JTextField();
		Trucos.setBounds(134, 224, 130, 26);
		frame.getContentPane().add(Trucos);
		Trucos.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Trucos");
		lblNewLabel_3.setBounds(40, 229, 61, 16);
		frame.getContentPane().add(lblNewLabel_3);
	}
}
