import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class EncryptorAndDecryptor extends JFrame implements ActionListener {

	private JButton encryptButton, decryptButton, generateKeyButton;
	private JLabel keyLabel, plaintextLabel, ciphertextLabel;
	private JTextField keyField, plaintextField, ciphertextField;
	protected static final String ALPHABET = "QRSTUVWXYZABCDEFGHIJKLMNOP";
	private String key;
	
	EncryptorAndDecryptor() {
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Encryptor/Decryptor");
		
		encryptButton = new JButton("Encrypt");
		encryptButton.addActionListener(this);
		decryptButton = new JButton("Decrypt");
		decryptButton.addActionListener(this);
		generateKeyButton = new JButton("Generate Key");
		generateKeyButton.addActionListener(this);
		
		keyLabel = new JLabel("Key");
		ciphertextLabel = new JLabel("Ciphertext");
		plaintextLabel = new JLabel("Plaintext");
	
		plaintextField = new JTextField(10);
		plaintextField.addActionListener(this);
		
		keyField = new JTextField(10);
		keyField.addActionListener(this);
		
		ciphertextField = new JTextField(10);
		ciphertextField.addActionListener(this);
		
		JPanel topPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		
		topPanel.setLayout(new GridLayout(3,2));
		topPanel.add(keyLabel);
		topPanel.add(keyField);
		topPanel.add(plaintextLabel);
		topPanel.add(plaintextField);
		topPanel.add(ciphertextLabel);
		topPanel.add(ciphertextField);
		
		bottomPanel.setLayout(new GridLayout(1,3));
		bottomPanel.add(encryptButton);
		bottomPanel.add(decryptButton);
		bottomPanel.add(generateKeyButton);
		
		setLayout(new GridLayout(2,1));
		add(topPanel);
		add(bottomPanel);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Encrypt")) {
			String s = plaintextField.getText();
			key = "";
			s = s.toUpperCase();
			for(int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if(s.indexOf(ch) == -1) 
					s += ch;
				}
			for(int i = 25; i >= 0; i--) {
				char ch = ALPHABET.charAt(i);
				if(s.indexOf(ch) == -1) {
					s += ch;
				}
			
			plaintextField.setText("");
			ciphertextField.setText(s);
			}
		}
		else if(e.getActionCommand().equals("Decrypt")) {
			String t = ciphertextField.getText();
			key = "";
			t = t.toUpperCase();
			
			plaintextField.setText(t);
			ciphertextField.setText("");
			}
		else {
			keyField.setText(ALPHABET);
			ciphertextField.setText("");
			plaintextField.setText("");
		}
	}
	
	public static void main(String[] args) {
		EncryptorAndDecryptor app = new EncryptorAndDecryptor();
		app.setVisible(true);
	}
}

