import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;

import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JRadioButton;

import java.awt.Color;
import java.util.Stack;

import javax.swing.SwingConstants;

public class Torres {
	Stack torre1 = new Stack();	
	Stack torre2 = new Stack();	
	Stack torre3 = new Stack();	
	int a=0;
	int b;
	int c=0;
	private ButtonGroup grupo;
	private JFrame frame;
	private JTextField textField;
	private JLabel lblIngreseNombre;
	private JLabel label;
	String nombre;
	String discos;
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField obtener1;
	private JTextField obtener2;


	/**
	 * Launch the application.
	 */
	
	
	
	
	
	
	public static void main(String[] args) {
			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Torres window = new Torres();
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
	public Torres() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Mi_Juego");
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setForeground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 899, 463);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(new Color(0, 0, 0));
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setIcon(new ImageIcon("C:\\Users\\Angel\\Pictures\\D1.png"));
		label_1.setBounds(42, 236, 103, 20);
		frame.getContentPane().add(label_1);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("C:\\Users\\Angel\\Pictures\\D3.png"));
		label_3.setBounds(43, 277, 103, 20);
		frame.getContentPane().add(label_3);
		
		textField = new JTextField();
		textField.setBounds(611, 259, 78, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblIngreseNombre = new JLabel("Ingrese Nombre");
		lblIngreseNombre.setBounds(484, 255, 117, 29);
		frame.getContentPane().add(lblIngreseNombre);
		
		label = new JLabel("Numeros de Discos");
		label.setBounds(484, 286, 117, 29);
		frame.getContentPane().add(label);
		
		
				
		JLabel label_2 = new JLabel("discos");
		label_2.setIcon(new ImageIcon("C:\\Users\\Angel\\Pictures\\D2.png"));
		label_2.setBounds(42, 256, 103, 20);
		frame.getContentPane().add(label_2);
				
		//DISCOS
			JRadioButton rdbtnDiscos = new JRadioButton("3 Discos");
			
			
			rdbtnDiscos.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					a=3;					
				}
			});
			
			
			
			buttonGroup_1.add(rdbtnDiscos);
			rdbtnDiscos.setBounds(611, 293, 109, 23);
			frame.getContentPane().add(rdbtnDiscos);
			
			JRadioButton rdbtnDiscos_1 = new JRadioButton("4 Discos");
			rdbtnDiscos_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=4;
				}
			});
			buttonGroup_1.add(rdbtnDiscos_1);
			rdbtnDiscos_1.setBounds(611, 314, 109, 23);
			frame.getContentPane().add(rdbtnDiscos_1);	
			
			JRadioButton rdbtnDiscos_2 = new JRadioButton("5 Discos");
			rdbtnDiscos_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=5;
				}
			});
			buttonGroup_1.add(rdbtnDiscos_2);
			rdbtnDiscos_2.setBounds(611, 335, 109, 23);
			frame.getContentPane().add(rdbtnDiscos_2);
			
			JRadioButton rdbtnDiscos_3 = new JRadioButton("6 Discos");
			rdbtnDiscos_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=6;
				}
			});
			buttonGroup_1.add(rdbtnDiscos_3);
			rdbtnDiscos_3.setBounds(611, 355, 109, 23);
			frame.getContentPane().add(rdbtnDiscos_3);
			
			JRadioButton rdbtnDiscos_4 = new JRadioButton("7 Discos");
			rdbtnDiscos_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=7;
				}
			});
			buttonGroup_1.add(rdbtnDiscos_4);
			rdbtnDiscos_4.setBounds(611, 375, 109, 23);
			frame.getContentPane().add(rdbtnDiscos_4);
			
			JRadioButton rdbtnDiscos_5 = new JRadioButton("8 Discos");
			rdbtnDiscos_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					a=8;
				}
			});
			buttonGroup_1.add(rdbtnDiscos_5);
			rdbtnDiscos_5.setBounds(611, 395, 109, 23);
			frame.getContentPane().add(rdbtnDiscos_5);
			grupo = new ButtonGroup();
		
			JButton btnNewButton = new JButton("JUGAR");
			
			btnNewButton.addActionListener(new ActionListener() {			
				public void actionPerformed(ActionEvent e) {
					rdbtnDiscos.setVisible(false);
					rdbtnDiscos_1.setVisible(false);
					rdbtnDiscos_2.setVisible(false);
					rdbtnDiscos_3.setVisible(false);
					rdbtnDiscos_4.setVisible(false);
					rdbtnDiscos_5.setVisible(false);					
					textField.setVisible(false);				
					label.setVisible(false);
					lblIngreseNombre.setVisible(false);
				    nombre = textField.getText();
				    if(a==3){
				    	torre1.push(3);
						torre1.push(2);
						torre1.push(1);
				    	JOptionPane.showMessageDialog(null, a+" Discos");
				    }else if(a==4){
				    	torre1.push(4);
				    	torre1.push(3);
						torre1.push(2);
						torre1.push(1);
				    	JOptionPane.showMessageDialog(null, a+" Discos");
				    }else if(a==5){
				    	torre1.push(5);
				    	torre1.push(4);
				    	torre1.push(3);
						torre1.push(2);
						torre1.push(1);
				    	JOptionPane.showMessageDialog(null, a+" Discos");
				    }else if(a==6){
				    	torre1.push(6);
				    	torre1.push(5);
				    	torre1.push(4);
				    	torre1.push(3);
						torre1.push(2);
						torre1.push(1);
				    	JOptionPane.showMessageDialog(null, a+" Discos");
				    }else if(a==7){
				    	torre1.push(7);
				    	torre1.push(6);
				    	torre1.push(5);
				    	torre1.push(4);
				    	torre1.push(3);
						torre1.push(2);
						torre1.push(1);
				    	JOptionPane.showMessageDialog(null, a+" Discos");
				    }else if(a==8){
				    	torre1.push(8);
				    	torre1.push(7);
				    	torre1.push(6);
				    	torre1.push(5);
				    	torre1.push(4);
				    	torre1.push(3);
						torre1.push(2);
						torre1.push(1);
						JOptionPane.showMessageDialog(null, a+" Discos");
				    }	
				    
				    
				    }
			});
			btnNewButton.setBounds(764, 255, 109, 29);
			frame.getContentPane().add(btnNewButton);
			
			JButton btnMoverATorre = new JButton("Mover a Torre 2");
			btnMoverATorre.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					obtener1.getText();
					if(torre2.isEmpty()==true){
					label_1.setBounds(188, 277, 103, 20); 
					
					}//else if(obtener1 > obtener2){}
					
					
				}
			});
			btnMoverATorre.setBounds(29, 303, 131, 23);
			frame.getContentPane().add(btnMoverATorre);
			
			JButton btnMoverATorre_1 = new JButton("Mover a Torre 3");
			btnMoverATorre_1.setBounds(29, 335, 131, 23);
			frame.getContentPane().add(btnMoverATorre_1);
			
			JButton btnMoverATorre_3 = new JButton("Mover a Torre 3");
			btnMoverATorre_3.setBounds(170, 335, 138, 23);
			frame.getContentPane().add(btnMoverATorre_3);
			
			JButton btnMoverATorre_2 = new JButton("Mover a Torre 1");
			btnMoverATorre_2.setBounds(170, 303, 138, 23);
			frame.getContentPane().add(btnMoverATorre_2);
			
			JButton btnMoverATorre_4 = new JButton("Mover a Torre 1");
			btnMoverATorre_4.setBounds(330, 303, 131, 23);
			frame.getContentPane().add(btnMoverATorre_4);
			
			JButton button_3 = new JButton("Mover a Torre 2");
			button_3.setBounds(330, 335, 131, 23);
			frame.getContentPane().add(button_3);
			
			obtener1 = new JTextField();
			obtener1.setColumns(10);
			obtener1.setBounds(598, 11, 78, 20);
			frame.getContentPane().add(obtener1);
			
			obtener2 = new JTextField();
			obtener2.setColumns(10);
			obtener2.setBounds(578, 40, 78, 20);
			frame.getContentPane().add(obtener2);
			
			
			
			
	}
	}

