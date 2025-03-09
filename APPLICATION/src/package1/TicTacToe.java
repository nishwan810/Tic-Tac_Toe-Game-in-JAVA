package package1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.MediaTracker;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Toolkit;

public class TicTacToe {

	private JFrame frame;
	private JFrame f1;
	private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnNewButton;

	
	int b1= 2;
	int b2= 2;
	int b3= 2;
	int b4= 2;
	int b5= 2;
	int b6= 2;
	int b7= 2;
	int b8= 2;
	int b9= 2;
	
	private String choice = "⛌";
	
	int xCount;
	int yCount;
	int btnCount = 0;
	private JTextField txtPlayerX;
	private JTextField txtPlayerO;
	
	
	
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		

		
		 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void resetGame() {
		choice = "⛌";
		btnCount = 0;
		
		

		
		
		
		btn1.setText(null);
		btn2.setText(null);
		btn3.setText(null);
		btn4.setText(null);
		btn5.setText(null);
		btn6.setText(null);
		btn7.setText(null);
		btn8.setText(null);
		btn9.setText(null);
		
		b1=b2=b3=b4=b5=b6=b7=b8=b9=2;
	}

	
	
	void switchPlayers() {
		if(choice.equalsIgnoreCase("⛌")){
			choice ="O";	
		}else {
			choice ="⛌";
		}
		
	}
	
	void checkWins() {
		if(b1==1 && b2==1 && b3==1) {
			JOptionPane.showMessageDialog(f1, "Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
			resetGame();
			
			
		}else if(b4==1 && b5==1 && b6==1) {
			JOptionPane.showMessageDialog(f1, "Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
			resetGame();
			
		}else if(b7==1 && b8==1 && b9==1) {
			JOptionPane.showMessageDialog(f1, "Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
			resetGame();
			
			
		}else if(b1==1 && b4==1 && b7==1) {
			JOptionPane.showMessageDialog(f1, "Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
			resetGame();
			
		}else if(b2==1 && b5==1 && b8==1) {
			JOptionPane.showMessageDialog(f1, "Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
			resetGame();
			
		}else if(b3==1 && b6==1 && b9==1) {
			JOptionPane.showMessageDialog(f1, "Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
			resetGame();
			
		}else if(b1==1 && b5==1 && b9==1) {
			JOptionPane.showMessageDialog(f1, "Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
			resetGame();
			
		}else if(b3==1 && b5==1 && b7==1) {
			JOptionPane.showMessageDialog(f1, "Player X Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			xCount++;
			txtPlayerX.setText(String.valueOf(xCount));
			resetGame();
			
		}else if(b1==0 && b2==0 && b3==0) {
			JOptionPane.showMessageDialog(f1, "Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			txtPlayerO.setText(String.valueOf(yCount));
			resetGame();
			
		}else if(b4==0 && b5==0 && b6==0) {
			JOptionPane.showMessageDialog(f1, "Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			txtPlayerO.setText(String.valueOf(yCount));
			resetGame();
			
		}else if(b7==0 && b8==0 && b9==0) {
			JOptionPane.showMessageDialog(f1, "Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			txtPlayerO.setText(String.valueOf(yCount));
			resetGame();
			
		}else if(b1==0 && b4==0 && b7==0) {
			JOptionPane.showMessageDialog(f1, "Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			txtPlayerO.setText(String.valueOf(yCount));
			resetGame();
			
		}else if(b2==0 && b5==0 && b8==0) {
			JOptionPane.showMessageDialog(f1, "Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			txtPlayerO.setText(String.valueOf(yCount));
			resetGame();
			
		}else if(b3==0 && b6==0 && b9==0) {
			JOptionPane.showMessageDialog(f1, "Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			txtPlayerO.setText(String.valueOf(yCount));
			resetGame();
			
		}else if(b1==0 && b5==0 && b9==0) {
			JOptionPane.showMessageDialog(f1, "Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			txtPlayerO.setText(String.valueOf(yCount));
			resetGame();
			
		}else if(b3==0 && b5==0 && b7==0) {
			JOptionPane.showMessageDialog(f1, "Player O Wins","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			yCount++;
			txtPlayerO.setText(String.valueOf(yCount));
			resetGame();
			
		}else if(btnCount==9) {
			JOptionPane.showMessageDialog(f1, "It's a Tie.","Tic-Tac-Toe",JOptionPane.INFORMATION_MESSAGE);
			resetGame();
		}
	}

	
	
	/**
	 * Create the application.
	 */
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setTitle("Tic-Tac-Toe");
		frame.setSize(471, 721);
		
		
		
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage("/Users/nishantwankhade/eclipse/infinity/APPLICATION/bin/package1/xox.png"));
        
        

     
        
		
		frame.setLocationRelativeTo(null);
		//frame.setBounds(100, 100, 450, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		 JFrame f1 = new JFrame("Tic-Tac-Toe");
	        f1.setSize(300, 200);
	        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f1.setLayout(new FlowLayout());

	        // Customize the JOptionPane style
//	        UIManager.put("OptionPane.background", new Color(96, 96,96)); // Light Lavender
//	        UIManager.put("Panel.background", new Color(96, 96,96));
//	        UIManager.put("OptionPane.messageFont", new Font("Arial", Font.BOLD, 16));
//	        UIManager.put("OptionPane.messageForeground", Color.WHITE);
//	        
//	        UIManager.put("OptionPane.Button.background", new Color(96,96,96));
//	        UIManager.put("OptionPane.Button.foreground", new Color(96,96,96));
	        

	        // Display a styled JOptionPane
//	        JOptionPane.showMessageDialog(f1, "Player O Wins", "Tic-Tac-Toe", JOptionPane.INFORMATION_MESSAGE);

	        

		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(6, 6, 459, 459);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.WHITE);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(150, -11, 100, 522);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(Color.WHITE);
		separator_1.setBounds(303, -11, 100, 522);
		panel.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.WHITE);
		separator_2.setBounds(-13, 154, 499, 78);
		panel.add(separator_2);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(Color.WHITE);
		separator_2_1.setBounds(-13, 309, 499, 78);
		panel.add(separator_2_1);
		
		 btn1 = new JButton("");
		btn1.setOpaque(true);
		btn1.setFocusPainted(false);
		btn1.setBorderPainted(false);
		btn1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 99));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnCount++;
				btn1.setText(choice);
				
				
				
				if(choice.equalsIgnoreCase("⛌")) {
					 b1= 1;
				}else {
					b1=0;
				}
				
				
				switchPlayers();
				checkWins();
			}
		});
		btn1.setForeground(Color.WHITE);
		btn1.setBackground(Color.BLACK);
		btn1.setBounds(6, 10, 140, 140);
		panel.add(btn1);
		
		btn2 = new JButton("");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                btn2.setText(choice);
                btnCount++;
				if(choice.equalsIgnoreCase("⛌")) {
					 b2= 1;
				}else {
					b2=0;
				}
				
				
				switchPlayers();
				checkWins();
			}
		});
		btn2.setOpaque(true);
		btn2.setForeground(Color.WHITE);
		btn2.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 99));
		btn2.setFocusPainted(false);
		btn2.setBorderPainted(false);
		btn2.setBackground(Color.BLACK);
		btn2.setBounds(162, 10, 140, 140);
		panel.add(btn2);
		
		 btn3 = new JButton("");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
btn3.setText(choice);
btnCount++;
				if(choice.equalsIgnoreCase("⛌")) {
					 b3= 1;
				}else {
					b3=0;
				}
				
				
				switchPlayers();
				checkWins();
			}
		});
		btn3.setOpaque(true);
		btn3.setForeground(Color.WHITE);
		btn3.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 99));
		btn3.setFocusPainted(false);
		btn3.setBorderPainted(false);
		btn3.setBackground(Color.BLACK);
		btn3.setBounds(313, 10, 140, 140);
		panel.add(btn3);
		
		 btn4 = new JButton("");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {btn4.setText(choice);
			btnCount++;
			if(choice.equalsIgnoreCase("⛌")) {
				 b4= 1;
			}else {
				b4=0;
			}
			
			
			switchPlayers();
			checkWins();
			}
		});
		btn4.setOpaque(true);
		btn4.setForeground(Color.WHITE);
		btn4.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 99));
		btn4.setFocusPainted(false);
		btn4.setBorderPainted(false);
		btn4.setBackground(Color.BLACK);
		btn4.setBounds(8, 167, 140, 140);
		panel.add(btn4);
		
		 btn5 = new JButton("");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {btn5.setText(choice);
			btnCount++;
			if(choice.equalsIgnoreCase("⛌")) {
				 b5= 1;
			}else {
				b5=0;
			}
			
			
			switchPlayers();
			checkWins();
			}
		});
		btn5.setOpaque(true);
		btn5.setForeground(Color.WHITE);
		btn5.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 99));
		btn5.setFocusPainted(false);
		btn5.setBorderPainted(false);
		btn5.setBackground(Color.BLACK);
		btn5.setBounds(161, 166, 140, 140);
		panel.add(btn5);
		
		btn6 = new JButton("");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {btn6.setText(choice);
			btnCount++;
			if(choice.equalsIgnoreCase("⛌")) {
				 b6= 1;
			}else {
				b6=0;
			}
			
			
			switchPlayers();
			checkWins();
			}
		});
		btn6.setOpaque(true);
		btn6.setForeground(Color.WHITE);
		btn6.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 99));
		btn6.setFocusPainted(false);
		btn6.setBorderPainted(false);
		btn6.setBackground(Color.BLACK);
		btn6.setBounds(315, 168, 140, 140);
		panel.add(btn6);
		
		 btn7 = new JButton("");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {btn7.setText(choice);
			btnCount++;
			if(choice.equalsIgnoreCase("⛌")) {
				 b7= 1;
			}else {
				b7=0;
			}
			
			
			switchPlayers();
			checkWins();
			}
		});
		btn7.setOpaque(true);
		btn7.setForeground(Color.WHITE);
		btn7.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 99));
		btn7.setFocusPainted(false);
		btn7.setBorderPainted(false);
		btn7.setBackground(Color.BLACK);
		btn7.setBounds(9, 320, 140, 140);
		panel.add(btn7);
		
		btn8 = new JButton("");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {btn8.setText(choice);
			btnCount++;
			if(choice.equalsIgnoreCase("⛌")) {
				 b8= 1;
			}else {
				b8=0;
			}
			
			
			switchPlayers();
			checkWins();
			}
		});
		btn8.setOpaque(true);
		btn8.setForeground(Color.WHITE);
		btn8.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 99));
		btn8.setFocusPainted(false);
		btn8.setBorderPainted(false);
		btn8.setBackground(Color.BLACK);
		btn8.setBounds(162, 320, 140, 140);
		panel.add(btn8);
		
		btn9 = new JButton("");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {btn9.setText(choice);
			btnCount++;
			if(choice.equalsIgnoreCase("⛌")) {
				 b9= 1;
			}else {
				b9=0;
			}
			
			
			switchPlayers();
			checkWins();
			}
		});
		btn9.setOpaque(true);
		btn9.setForeground(Color.WHITE);
		btn9.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 99));
		btn9.setFocusPainted(false);
		btn9.setBorderPainted(false);
		btn9.setBackground(Color.BLACK);
		btn9.setBounds(313, 320, 140, 140);
		panel.add(btn9);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(6, 477, 459, 210);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Player ( X )");
		lblNewLabel_9.setBounds(119, 23, 76, 24);
		lblNewLabel_9.setFont(new Font("Apple SD Gothic Neo", Font.ITALIC, 15));
		lblNewLabel_9.setForeground(Color.WHITE);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_9_1 = new JLabel("Player ( 0 )");
		lblNewLabel_9_1.setForeground(Color.WHITE);
		lblNewLabel_9_1.setFont(new Font("Apple SD Gothic Neo", Font.ITALIC, 15));
		lblNewLabel_9_1.setBounds(272, 23, 76, 24);
		panel_1.add(lblNewLabel_9_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.WHITE);
		separator_3.setOrientation(SwingConstants.VERTICAL);
		separator_3.setBounds(221, 154, 33, 35);
		panel_1.add(separator_3);
		
		JButton btnNewButton = new JButton("Reset");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				resetGame();
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(94, 154, 120, 35);
		panel_1.add(btnNewButton);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(Color.DARK_GRAY);
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(JOptionPane.showConfirmDialog(f1,"Do you want to exit?","Tic-Tac-Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
				
				
			}
		});
		btnExit.setForeground(Color.BLACK);
		btnExit.setBounds(240, 154, 120, 35);
		panel_1.add(btnExit);
		
		JLabel label = new JLabel("New label");
		label.setBounds(202, 59, 61, 16);
		panel_1.add(label);
		
		JLabel lblNewLabel_9_2_1_1_1 = new JLabel("-");
		lblNewLabel_9_2_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_9_2_1_1_1.setFont(new Font("Apple SD Gothic Neo", Font.ITALIC, 40));
		lblNewLabel_9_2_1_1_1.setBounds(170, 59, 111, 39);
		panel_1.add(lblNewLabel_9_2_1_1_1);
		
		txtPlayerX = new JTextField();
		txtPlayerX.setEditable(false);
		txtPlayerX.setFont(new Font("Apple SD Gothic Neo", Font.ITALIC, 40));
		txtPlayerX.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlayerX.setText("0");
		txtPlayerX.setBackground(Color.BLACK);
		txtPlayerX.setForeground(Color.WHITE);
		txtPlayerX.setBounds(85, 59, 110, 39);
		panel_1.add(txtPlayerX);
		txtPlayerX.setColumns(10);
		
		txtPlayerO = new JTextField();
		txtPlayerO.setEditable(false);
		txtPlayerO.setText("0");
		txtPlayerO.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlayerO.setForeground(Color.WHITE);
		txtPlayerO.setFont(new Font("Apple SD Gothic Neo", Font.ITALIC, 40));
		txtPlayerO.setColumns(10);
		txtPlayerO.setBackground(Color.BLACK);
		txtPlayerO.setBounds(250, 59, 110, 39);
		panel_1.add(txtPlayerO);
		
		
	}
}
