package br.com.exemplo.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.TextArea;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextPane;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtCodLeitor;
	private JTextField txtNomeLeitor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
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
	public TelaPrincipal() {
		setTitle("Manuten\u00E7\u00E3o Leitor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1103, 672);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo do Leitor");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(34, 61, 314, 70);
		contentPane.add(lblNewLabel);
		
		JLabel lblNomeDoLeitor = new JLabel("Nome do Leitor");
		lblNomeDoLeitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNomeDoLeitor.setBounds(34, 146, 314, 70);
		contentPane.add(lblNomeDoLeitor);
		
		JLabel lblTipoDoLeitor = new JLabel("Tipo do Leitor");
		lblTipoDoLeitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTipoDoLeitor.setBounds(34, 226, 194, 70);
		contentPane.add(lblTipoDoLeitor);
		
		JLabel lmlMensagem = new JLabel("");
		lmlMensagem.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.GRAY, Color.BLACK, null));
		lmlMensagem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lmlMensagem.setBounds(34, 533, 1040, 70);
		contentPane.add(lmlMensagem);
		
		txtCodLeitor = new JTextField();
		txtCodLeitor.setBounds(290, 76, 399, 40);
		contentPane.add(txtCodLeitor);
		txtCodLeitor.setColumns(10);
		
		txtNomeLeitor = new JTextField();
		txtNomeLeitor.setColumns(10);
		txtNomeLeitor.setBounds(290, 161, 399, 40);
		contentPane.add(txtNomeLeitor);
		
		JComboBox cmbTipoLeitor = new JComboBox();
		cmbTipoLeitor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cmbTipoLeitor.setModel(new DefaultComboBoxModel(new String[] {"Selecione uma op\u00E7\u00E3o", "Aluno", "Professor", "Administrativo"}));
		cmbTipoLeitor.setSelectedIndex(0);
		cmbTipoLeitor.setBounds(290, 243, 399, 42);
		contentPane.add(cmbTipoLeitor);
		
		JButton blnNovo = new JButton("Novo");
		blnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtCodLeitor.setText(null);
				txtNomeLeitor.setText(null);
				cmbTipoLeitor.setSelectedIndex(0);
				
			}
		});
		blnNovo.setBounds(31, 318, 146, 40);
		contentPane.add(blnNovo);
		
		JButton blnConsultar = new JButton("Consultar");
		blnConsultar.setBounds(204, 318, 146, 40);
		contentPane.add(blnConsultar);
		
		JButton btnNewButton_2 = new JButton("Novo");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(382, 318, 146, 40);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Novo");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(563, 318, 146, 40);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Novo");
		btnNewButton_4.setBounds(741, 318, 146, 40);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Novo");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(928, 318, 146, 40);
		contentPane.add(btnNewButton_5);
		
		TextArea txtListar = new TextArea();
		txtListar.setBounds(41, 362, 440, 150);
		contentPane.add(txtListar);
		
		JPanel panel = new JPanel();
		panel.setBounds(660, 447, 194, 10);
		contentPane.add(panel);
	}
}
