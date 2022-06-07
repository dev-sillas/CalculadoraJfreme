package br.com.exemplo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.TextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import javax.swing.JDesktopPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pizzaria extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pizzaria frame = new pizzaria();
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
	public pizzaria() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1240, 660);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Recebe");
		btnNewButton.setBounds(620, 30, 91, 74);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Fechar");
		btnNewButton_1.setBounds(741, 30, 91, 74);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Fun\u00E7oes");
		btnNewButton_2.setBounds(857, 30, 91, 74);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Mapa");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(958, 30, 91, 74);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Confer\u00EAcia");
		btnNewButton_4.setBounds(1070, 30, 91, 74);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_6 = new JButton("Cancela tudo");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(741, 136, 91, 74);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Cancela Item");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(857, 136, 91, 74);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Desc do item");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setBounds(963, 136, 91, 74);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("Troca Item");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setBounds(1070, 136, 91, 74);
		contentPane.add(btnNewButton_9);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 343, 582, 246);
		contentPane.add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 579, 312);
		contentPane.add(panel);
		
		textField = new JTextField();
		textField.setBounds(599, 237, 91, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Pedido");
		tglbtnNewToggleButton.setBounds(620, 136, 91, 74);
		contentPane.add(tglbtnNewToggleButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(703, 237, 91, 33);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(804, 237, 91, 33);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(905, 237, 91, 33);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(1006, 237, 91, 33);
		contentPane.add(textField_4);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(620, 186, 1, 1);
		contentPane.add(desktopPane);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(1107, 237, 91, 33);
		contentPane.add(textField_5);
	}
}
