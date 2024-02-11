package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.border.EmptyBorder;

import control.ImcController;

import java.awt.Color;

public class MainViewer {

	private JFrame appFrame;
	private JTextField alturaTextField;
	private JTextField pesoTextField;
	private JTextPane resultPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainViewer window = new MainViewer();
					window.appFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainViewer() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		appFrame = new JFrame();
		appFrame.setAlwaysOnTop(true);
		appFrame.getContentPane().setBackground(Color.LIGHT_GRAY);
		appFrame.getContentPane().setForeground(Color.GRAY);
		appFrame.setTitle("IMC APP");
		appFrame.setBounds(100, 100, 300, 400);
		appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		appFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Calculadora IMC");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(77, 11, 150, 56);
		appFrame.getContentPane().add(lblNewLabel);
		
		JLabel pesoLabel = new JLabel("Peso");
		pesoLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pesoLabel.setBounds(21, 63, 46, 56);
		appFrame.getContentPane().add(pesoLabel);
		
		alturaTextField = new JTextField();
		alturaTextField.setHorizontalAlignment(SwingConstants.CENTER);
		alturaTextField.setText("0.0");
		alturaTextField.setBounds(77, 133, 133, 30);
		appFrame.getContentPane().add(alturaTextField);
		alturaTextField.setColumns(10);
		
		JLabel alturaLabel = new JLabel("Altura");
		alturaLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		alturaLabel.setBounds(21, 139, 46, 14);
		appFrame.getContentPane().add(alturaLabel);
		
		pesoTextField = new JTextField();
		pesoTextField.setText("0.0");
		pesoTextField.setHorizontalAlignment(SwingConstants.CENTER);
		pesoTextField.setColumns(10);
		pesoTextField.setBounds(77, 78, 133, 30);
		appFrame.getContentPane().add(pesoTextField);
		
		JButton calcularBotton = new JButton("Calcular");
		calcularBotton.setBackground(Color.GRAY);
		calcularBotton.setBounds(21, 191, 141, 40);
		calcularBotton.addActionListener(new ImcController(this));
		appFrame.getContentPane().add(calcularBotton);
		
		resultPane = new JTextPane();
		resultPane.setBorder(new EmptyBorder(8, 8, 8, 8));
		resultPane.setText("Result");
		resultPane.setBounds(21, 247, 241, 86);
		appFrame.getContentPane().add(resultPane);
	}

	public JFrame getAppFrame() {
		return appFrame;
	}

	public void setAppFrame(JFrame appFrame) {
		this.appFrame = appFrame;
	}

	public JTextField getAlturaTextField() {
		return alturaTextField;
	}

	public void setAlturaTextField(JTextField alturaTextField) {
		this.alturaTextField = alturaTextField;
	}

	public JTextField getPesoTextField() {
		return pesoTextField;
	}

	public void setPesoTextField(JTextField pesoTextField) {
		this.pesoTextField = pesoTextField;
	}

	public JTextPane getResultPane() {
		return resultPane;
	}

	public void setResultPane(JTextPane resultPane) {
		this.resultPane = resultPane;
	}
	
}
