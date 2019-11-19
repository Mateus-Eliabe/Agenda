package Agenda;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FmContatos extends JFrame {

	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtFone; 
	
	public ArrayList<Pessoa> Lista = new ArrayList<Pessoa>();
	//private JTextField txtMatricula;
	private JTextField txtMatricula;
	private JTextField textEmail;
	private JTextField textEndereco;
	private JTextField textBairro;
	private JTextField textCidade;
	private JTextField textUF;
	private JTextField textCEP;
	
	public String inserirPessoa() {
		try {
		Pessoa p = new Pessoa();
		p.setNome(txtNome.getText());
		p.setTelefone(txtFone.getText());
		p.setMatricula(Integer.parseInt(txtMatricula.getText()));
		p.setEmail(textEmail.getText());
		p.setEndereco(textEndereco.getText());
		p.setBairro(textBairro.getText());
		p.setCidade(textCidade.getText());
		p.setUf(textUF.getText());
		p.setCep(Integer.parseInt(textCEP.getText()));
		Lista.add(p);
		
		limparCampos();
		return "pessoa inserida com sucesso";
	} catch (Exception e) {
		return "Erro ao inserir Favor Digitar apenas números na Matricula";
	}
	}
	public String ListarPessoas() {
		String dados = "";
		for(Pessoa p : Lista) {
			dados = dados + "\nNome: "+ p.getNome() 
			+ "\nTelefone: "+ p.getTelefone() 
		    + "\nMatricula: " + p.getMatricula() 
		    + "\nEmail: " + p.getEmail()
		    + "\nEndereço: " + p.getEndereco() 
		    + "\nBairro: " +  p.getBairro() 
		    + "\nCidade: " +  p.getCidade()
		    + "\nUF: " + p.getUf() 
		    + "\nCEP: " + p.getCep() + "\n";
			
		}
		return dados;
			
	}
	
	    public void limparCampos() {
	    	txtFone.setText("");
	    	txtMatricula.setText("");
	    	txtNome.setText("");
	    	textEmail.setText("");
	    	textEndereco.setText("");
	    	textBairro.setText("");
	    	textCidade.setText("");
	    	textUF.setText("");
	    	textCEP.setText("");
	    }

		public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FmContatos frame = new FmContatos();
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
	public FmContatos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNome = new JTextField();
		txtNome.setBounds(114, 30, 211, 20);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblNome = new JLabel("Nome: ");
		lblNome.setBounds(24, 33, 46, 14);
		contentPane.add(lblNome);
		
		JLabel lblNewLabel = new JLabel("Telefone: ");
		lblNewLabel.setBounds(24, 64, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtFone = new JTextField();
		txtFone.setBounds(114, 61, 126, 20);
		contentPane.add(txtFone);
		txtFone.setColumns(10);
		
		JButton btnInserir = new JButton("Inserir");
		btnInserir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String mens = inserirPessoa();
				JOptionPane.showMessageDialog(null, mens);
			}
		});
		btnInserir.setBounds(94, 355, 89, 23);
		contentPane.add(btnInserir);
		
		JButton btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Dados = ListarPessoas();
				JOptionPane.showMessageDialog(null, Dados);
			}
		});
		btnListar.setBounds(205, 355, 89, 23);
		contentPane.add(btnListar);
		
		JLabel lblMatricula = new JLabel("Matricula:");
		lblMatricula.setBounds(24, 95, 57, 14);
		contentPane.add(lblMatricula);
		
		txtMatricula = new JTextField();
		txtMatricula.setBounds(114, 92, 126, 20);
		contentPane.add(txtMatricula);
		txtMatricula.setColumns(10);
		
		textEmail = new JTextField();
		textEmail.setBounds(114, 123, 126, 20);
		contentPane.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(24, 126, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o");
		lblEndereo.setBounds(24, 157, 46, 14);
		contentPane.add(lblEndereo);
		
		textEndereco = new JTextField();
		textEndereco.setBounds(114, 154, 211, 20);
		contentPane.add(textEndereco);
		textEndereco.setColumns(10);
		
		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(24, 188, 46, 14);
		contentPane.add(lblBairro);
		
		textBairro = new JTextField();
		textBairro.setBounds(114, 185, 126, 20);
		contentPane.add(textBairro);
		textBairro.setColumns(10);
		
		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(24, 219, 46, 14);
		contentPane.add(lblCidade);
		
		JLabel lblUf = new JLabel("UF");
		lblUf.setBounds(24, 244, 46, 14);
		contentPane.add(lblUf);
		
		JLabel lblCep = new JLabel("CEP");
		lblCep.setBounds(24, 275, 46, 14);
		contentPane.add(lblCep);
		
		textCidade = new JTextField();
		textCidade.setBounds(114, 216, 126, 20);
		contentPane.add(textCidade);
		textCidade.setColumns(10);
		
		textUF = new JTextField();
		textUF.setColumns(10);
		textUF.setBounds(114, 241, 126, 20);
		contentPane.add(textUF);
		
		textCEP = new JTextField();
		textCEP.setColumns(10);
		textCEP.setBounds(114, 272, 126, 20);
		contentPane.add(textCEP);
		
	}
}
