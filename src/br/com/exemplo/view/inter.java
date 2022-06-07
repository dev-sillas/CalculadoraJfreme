package br.com.exemplo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextPane;
import java.awt.Button;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ButtonGroup;
import java.awt.Color;

public class inter extends JFrame {

	private JPanel contentPane;
	private JTextField v1;
	private JTextField v2;
	private JTextField resultado;
	private JRadioButton soma;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inter frame = new inter();
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
	public inter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 746, 455);
		contentPane = new JPanel();
		contentPane.setBackground(Color.MAGENTA);
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		v1 = new JTextField();
		v1.setBounds(164, 44, 392, 38);
		contentPane.add(v1);
		v1.setColumns(10);
		
		v2 = new JTextField();
		v2.setColumns(10);
		v2.setBounds(164, 101, 392, 45);
		contentPane.add(v2);
		
		JRadioButton soma = new JRadioButton("soma");
		buttonGroup.add(soma);
		soma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		soma.setFont(new Font("Arial", Font.PLAIN, 20));
		soma.setBounds(30, 181, 194, 38);
		contentPane.add(soma);
		
		JRadioButton media = new JRadioButton("Media");
		buttonGroup.add(media);
		media.setFont(new Font("Arial", Font.PLAIN, 20));
		media.setBounds(30, 237, 182, 31);
		contentPane.add(media);
		
		JButton ca = new JButton("Calcular");
		ca.setFont(new Font("Arial", Font.PLAIN, 20));
		ca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(soma.isSelected()) {
					double re= Float.parseFloat(v1.getText()) + Float.parseFloat(v2.getText());
				resultado.setText(String.valueOf(re));}
				else if(media.isSelected()) {	
					double re2= (Float.parseFloat(v1.getText()) + Float.parseFloat(v2.getText()))/ 2;
					resultado.setText(String.valueOf(re2));}
				else {resultado.setText("escolhe a operação");}
			}
		});
		ca.setBounds(37, 285, 117, 38);
		contentPane.add(ca);
		
		JLabel lblNewLabel = new JLabel("1\u00BA Valor");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(30, 38, 182, 43);
		contentPane.add(lblNewLabel);
		
		JLabel lblValor = new JLabel("2\u00BA Valor");
		lblValor.setFont(new Font("Arial", Font.PLAIN, 20));
		lblValor.setBounds(30, 99, 182, 43);
		contentPane.add(lblValor);
		
		resultado = new JTextField();
		resultado.setColumns(10);
		resultado.setBounds(164, 340, 392, 38);
		contentPane.add(resultado);
		
		JLabel lblResultado = new JLabel("Resultado:");
		lblResultado.setFont(new Font("Arial", Font.PLAIN, 20));
		lblResultado.setBounds(30, 334, 182, 43);
		contentPane.add(lblResultado);
	}
}
