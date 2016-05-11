package ttt;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class gui_ttt {
	//***global variables***//
	static int player_seq;									//set as '0' if want to start with 'X' else with '1' for starting with 'O'
	public static  String[] Array;							//initialize array
	public static String Player1_Name,Player2_Name;			//	initialize name of player
	private static JFrame frame;
	///private final Action action = new SwingAction();
	public static final String[] choice = { "X", "O" };
	private JTextField txtSs;
	
	
	
	Date dNow = new Date( );								//time at starting
    SimpleDateFormat ft = 
    new SimpleDateFormat ("yyyy/MM/dd 'at' hh:mm");
	
	public static void main(String[] args) {
	    Array = new String [10];							//initialize array
		Array[1] = "";
		Array[2] = "";
		Array[3] = "";
		Array[4] = "";
		Array[5] = "";
		Array[6] = "";
		Array[7] = "";
		Array[8] = "";
		Array[9] = "";
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui_ttt window = new gui_ttt();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	         }								//end of main 

	public gui_ttt() {
		initialize();
	}										//end of gui_ttt

	public void initialize() {
		player_name();
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 528, 454);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton Button_1 = new JButton("");													//button 1
		Button_1.setFont(new Font("Bradley Hand ITC", Font.BOLD, 35));
		Button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					Button_1.setEnabled(false);
				if ((player_seq & 1) != 1){ 
					Button_1.setText("X");
					player_seq=player_seq+1;
					Array[1]="X";
					if (player_seq>=5)
						logic();
					}
			     else{
			    	 Button_1.setText("O");
			    	 player_seq=player_seq+1;
			    	 Array[1]="O";
			    	 if (player_seq>=5)
						logic();
			    	 }
			}
		});
		Button_1.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	if(Array[1]==""){
		    	if ((player_seq & 1) != 1){		    		
		    		Button_1.setText("X");}
					else{
						Button_1.setText("O");}
		    }}
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	Button_1.setText(Array[1]);
		    }
		});
		Button_1.setBounds(92, 61, 89, 69);
		frame.getContentPane().add(Button_1);
		
		
		JButton Button_4 = new JButton("");														//button 4
		Button_4.setFont(new Font("Bradley Hand ITC", Font.BOLD, 35));
		Button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_4.setEnabled(false);
				if ((player_seq & 1) != 1){ 
					Button_4.setText("X");
					player_seq=player_seq+1;
					Array[4]="X";
					if (player_seq>=5)
					logic();
					}
			     else{
			    	 Button_4.setText("O");
			    	 player_seq=player_seq+1;
			    	 Array[4]="O";
			    	 if (player_seq>=5)
						logic();
			    	 }
			}
		});
		Button_4.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	if(Array[4]==""){
		    	if ((player_seq & 1) != 1)
		    		Button_4.setText("X");
					else
						Button_4.setText("O");
		    }}
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    		Button_4.setText(Array[4]);
		    }
		});
		Button_4.setBounds(92, 132, 89, 69);
		frame.getContentPane().add(Button_4);
		
		JButton Button_7 = new JButton("");																//button 7
		Button_7.setFont(new Font("Bradley Hand ITC", Font.BOLD, 35));
		Button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_7.setEnabled(false);
				if ((player_seq & 1) != 1){ 
					Button_7.setText("X");
					player_seq=player_seq+1;
					Array[7]="X";
					if (player_seq>=5)
					logic();
					}
			     else{
			    	 Button_7.setText("O");
			    	 player_seq=player_seq+1;
			    	 Array[7]="O";
			    	 if (player_seq>=5)
						logic();
			    	 }
			}
		});		
		Button_7.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	if(Array[7]==""){
		    	if ((player_seq & 1) != 1)
		    		Button_7.setText("X");
					else
						Button_7.setText("O");
		    }}
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    		Button_7.setText(Array[7]);
		    }
		});
		Button_7.setBounds(92, 202, 89, 69);
		frame.getContentPane().add(Button_7);
		
		JButton Button_2 = new JButton("");															//button 2
		Button_2.setFont(new Font("Bradley Hand ITC", Font.BOLD, 35));
		Button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_2.setEnabled(false);
				if ((player_seq & 1) != 1){ 
					Button_2.setText("X");
					player_seq=player_seq+1;
					Array[2]="X";
					if (player_seq>=5)
					logic();
					}
			     else{
			    	 Button_2.setText("O");
			    	 player_seq=player_seq+1;
			    	 Array[2]="O";
			    	 if (player_seq>=5)
						logic();
			    	 }
			}
		});
		Button_2.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	if(Array[2]==""){
		    	if ((player_seq & 1) != 1)
		    		Button_2.setText("X");
					else
						Button_2.setText("O");
		    }}
		    public void mouseExited(java.awt.event.MouseEvent evt) {	
		    		Button_2.setText(Array[2]);
		    }
		});
		Button_2.setFont(new Font("Bradley Hand ITC", Font.BOLD, 35));
		Button_2.setBounds(180, 61, 89, 69);
		frame.getContentPane().add(Button_2);
		
		JButton Button_5 = new JButton("");																//button 5
		Button_5.setFont(new Font("Bradley Hand ITC", Font.BOLD, 35));
		Button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_5.setEnabled(false);
				if ((player_seq & 1) != 1){ 
					Button_5.setText("X");
					player_seq=player_seq+1;
					Array[5]="X";
					if (player_seq>=5)
					logic();
					}
			     else{
			    	 Button_5.setText("O");
			    	 player_seq=player_seq+1;
			    	 Array[5]="O";
			    	 if (player_seq>=5)
						logic();
			    	 }
			}
		});
		Button_5.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	if(Array[5]==""){
		    	if ((player_seq & 1) != 1)
		    		Button_5.setText("X");
					else
						Button_5.setText("O");
		    }}
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    		Button_5.setText(Array[5]);
		    }
		});
		Button_5.setBounds(180, 132, 89, 69);
		frame.getContentPane().add(Button_5);

		
		JButton Button_8 = new JButton("");																	//button 8
		Button_8.setFont(new Font("Bradley Hand ITC", Font.BOLD, 35));
		Button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_8.setEnabled(false);
				if ((player_seq & 1) != 1){ 
					Button_8.setText("X");
					player_seq=player_seq+1;
					Array[8]="X";
					if (player_seq>=5)
					logic();
					}
			     else{
			    	 Button_8.setText("O");
			    	 player_seq=player_seq+1;
			    	 Array[8]="O";
			    	 if (player_seq>=5)
						logic();
			    	 }
			}
		});
		Button_8.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	if(Array[8]==""){
		    	if ((player_seq & 1) != 1)
		    		Button_8.setText("X");
					else
						Button_8.setText("O");
		    }}
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    		Button_8.setText(Array[8]);
		    }
		});
		Button_8.setBounds(180, 202, 89, 69);
		frame.getContentPane().add(Button_8);
		
		JButton Button_3 = new JButton("");																//button 3
		Button_3.setFont(new Font("Bradley Hand ITC", Font.BOLD, 35));
		Button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_3.setEnabled(false);
				if ((player_seq & 1) != 1){ 
					Button_3.setText("X");
					player_seq=player_seq+1;
					Array[3]="X";
					if (player_seq>=5)
					logic();
					}
			     else{
			    	 Button_3.setText("O");
			    	 player_seq=player_seq+1;
			    	 Array[3]="O";
			    	 if (player_seq>=5)
						logic();
			    	 }
			}
		});
		Button_3.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	if(Array[3]==""){
		    	if ((player_seq & 1) != 1)
		    		Button_3.setText("X");
					else
						Button_3.setText("O");
		    }}
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    		Button_3.setText(Array[3]);
		    }
		});
		Button_3.setBounds(270, 61, 89, 69);
		frame.getContentPane().add(Button_3);
		
		JButton Button_6 = new JButton("");																	//button 6
		Button_6.setFont(new Font("Bradley Hand ITC", Font.BOLD, 35));
		Button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_6.setEnabled(false);
				if ((player_seq & 1) != 1){ 
					Button_6.setText("X");
					player_seq=player_seq+1;
					Array[6]="X";
					if (player_seq>=5)
					logic();
					}
			     else{
			    	 Button_6.setText("O");
			    	 player_seq=player_seq+1;
			    	 Array[6]="O";
			    	 if (player_seq>=5)
						logic();
			    	 }
			}
		});
		Button_6.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	if(Array[6]==""){
		    	if ((player_seq & 1) != 1)
		    		Button_6.setText("X");
					else
						Button_6.setText("O");
		    }}
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    		Button_6.setText(Array[6]);
		    }
		});
		Button_6.setBounds(270, 132, 89, 69);
		frame.getContentPane().add(Button_6);
		
		JButton Button_9 = new JButton("");																		//button 9
		Button_9.setFont(new Font("Bradley Hand ITC", Font.BOLD, 35));
		Button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_9.setEnabled(false);
				if ((player_seq & 1) != 1){ 
					Button_9.setText("X");
					player_seq=player_seq+1;
					Array[9]="X";
					if (player_seq>=5)
					logic();
					}
			     else{
			    	 Button_9.setText("O");
			    	 player_seq=player_seq+1;
			    	 Array[9]="O";
			    	 if (player_seq>=5)
						logic();
			    	 }
			}
		});
		Button_9.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {
		    	if(Array[9]==""){
		    	if ((player_seq & 1) != 1)
		    		Button_9.setText("X");
					else
						Button_9.setText("O");
		    }}
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    		Button_9.setText(Array[9]);
		    }
		});
		Button_9.setBounds(270, 202, 89, 69);
		frame.getContentPane().add(Button_9);
		
		
		
		JButton Button_help = new JButton("Help");															//button help
		Button_help.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "***Game Rules***");
			}
		});
		Button_help.setBounds(413, 318, 89, 23);
		frame.getContentPane().add(Button_help);
		
		JButton Button_reset = new JButton("Reset");														//button reset
		Button_reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Button_1.setEnabled(true);
				Array[1]="";
				Button_1.setText(Array[1]);
				Button_2.setEnabled(true);
				Array[2]="";
				Button_2.setText(Array[2]);
				Button_3.setEnabled(true);
				Array[3]="";
				Button_3.setText(Array[3]);
				Button_4.setEnabled(true);
				Array[4]="";
				Button_4.setText(Array[4]);
				Button_5.setEnabled(true);
				Array[5]="";
				Button_5.setText(Array[5]);
				Button_6.setEnabled(true);
				Array[6]="";
				Button_6.setText(Array[6]);
				Button_7.setEnabled(true);
				Array[7]="";
				Button_7.setText(Array[7]);
				Button_8.setEnabled(true);
				Array[8]="";
				Button_8.setText(Array[8]);	
				Button_9.setEnabled(true);
				Array[9]="";
				Button_9.setText(Array[9]);
			}
		});
		Button_reset.setBounds(24, 362, 199, 23);
		frame.getContentPane().add(Button_reset);
		
		
		JButton Button_credit = new JButton("Credits");														//button credit
		Button_credit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Button_credit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "*** Developed by Team Triple-T ***");
			}
		});
		Button_credit.setBounds(413, 276, 89, 31);
		frame.getContentPane().add(Button_credit);
		
		JButton Button_exit = new JButton("Exit");															//button exit
		Button_exit.setBackground(Color.RED);
		Button_exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				java.awt.Toolkit.getDefaultToolkit().beep();
				int exit_option = JOptionPane.showConfirmDialog(null, 
                        "Are You Sure?", 
                        "Choose", 
                        JOptionPane.YES_NO_OPTION); 
						if (exit_option == JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(frame, "Thanks For Playing!!!");
							System.exit(0);
							}
			}
		});
		Button_exit.setBounds(397, 362, 89, 23);
		frame.getContentPane().add(Button_exit);
		
		JButton Button_highscore = new JButton("High Scores"); 												//button high score
		Button_highscore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(frame, "***ADD DETAIL***");
			}
		});
		Button_highscore.setBounds(369, 158, 117, 23);
		frame.getContentPane().add(Button_highscore);
		
		JLabel player1_info = new JLabel(Player1_Name+"- \"O\" ");											//player 1 info gui
		player1_info.setFont(new Font("Tahoma", Font.BOLD, 13));
		player1_info.setBounds(389, 87, 83, 18);
		frame.getContentPane().add(player1_info);
		
		JLabel player2_info = new JLabel(Player2_Name+"- \"X\"");											//player 2 info gui
		player2_info.setForeground(new Color(0, 0, 0));
		player2_info.setFont(new Font("Tahoma", Font.BOLD, 13));
		player2_info.setBounds(389, 116, 83, 14);
		frame.getContentPane().add(player2_info);
		
		JLabel lblTicTacToe = new JLabel("TIC-TAC-TOE");													//main title
		lblTicTacToe.setFont(new Font("Viner Hand ITC", Font.BOLD, 35));
		lblTicTacToe.setBounds(104, 26, 345, 39);
		frame.getContentPane().add(lblTicTacToe);
	
		JPanel status_bar = new JPanel();																	//status bar
		status_bar.setBackground(Color.ORANGE);
		status_bar.setBounds(369, 87, 133, 43);
		
		frame.getContentPane().add(status_bar);
		txtSs = new JTextField();
		txtSs.setText("Started At "+ft.format(dNow)+" PM");
		txtSs.setBackground(Color.ORANGE);
		txtSs.setBounds(0, 393, 512, 23);
		frame.getContentPane().add(txtSs);
		txtSs.setColumns(10);
	}
	  
	  
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Tic-Tac-Toe");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	public static void logic () //extends initialize
	{
		if((Array[1]=="O"&& Array[4]=="O"&&Array[7] == "O")||(Array[2]=="O"&&Array[5]=="O"&&Array[8]=="O")||(Array[3]=="O" && Array[6]=="O"&& Array[9]=="O"))			//vertical check PLAYER 1
			 {java.awt.Toolkit.getDefaultToolkit().beep();
			 JOptionPane.showMessageDialog(frame, Player1_Name+" Is Winner");
			 play_again();
			 }
		if((Array[1]=="X"&& Array[4]=="X"&&Array[7] == "X")||(Array[2]=="X"&&Array[5]=="X"&&Array[8]=="X")||(Array[3]=="X" && Array[6]=="X"&& Array[9]=="X"))			//vertical check PLAYER 2
			{java.awt.Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, Player2_Name+" Is Winner");
			play_again();
			}
		
		
		if((Array[1]=="O"&& Array[2]=="O"&&Array[3] == "O")||(Array[4]=="O"&&Array[5]=="O"&&Array[6]=="O")||(Array[7]=="O" && Array[8]=="O"&& Array[9]=="O"))			////horizontal check PLAYER 1
			{java.awt.Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, Player1_Name+" Is Winner");
			play_again();
			}
		if((Array[1]=="X"&& Array[2]=="X"&&Array[3] == "X")||(Array[4]=="X"&&Array[5]=="X"&&Array[6]=="X")||(Array[7]=="X" && Array[8]=="X"&& Array[9]=="X"))			//horizontal check PLAYER 2
			{
			java.awt.Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, Player2_Name+" Is Winner");
			play_again();
			}
		
		
		if((Array[1]=="O"&& Array[5]=="O"&&Array[9] == "O")||(Array[3]=="O"&&Array[5]=="O"&&Array[7]=="O"))			//diagonal check PLAYER 1
			{java.awt.Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, Player1_Name+" Is Winner");
			play_again();
			}
		
		if((Array[1]=="X"&& Array[5]=="X"&&Array[9] == "X")||(Array[3]=="X"&&Array[5]=="X"&&Array[7]=="X"))			//diagonal check PLAYER 2
			{
			java.awt.Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, Player2_Name+" Is Winner");
			play_again();
			}
		
		
		if (Array[1]!=""&&Array[2]!=""&&Array[3]!=""&&Array[4]!=""&&Array[5]!=""&&Array[6]!=""&&Array[7]!=""&&Array[8]!=""&&Array[9]!="") //check draw
			{
			java.awt.Toolkit.getDefaultToolkit().beep();
			JOptionPane.showMessageDialog(frame, "*** MATCH DRAW ***");
			play_again();
			}
}
	
	public static void play_again () 
	{
		int Draw_Match_option = JOptionPane.showConfirmDialog(null, "Do You Want To Play A New Game?", "Choose", JOptionPane.YES_NO_OPTION); 
				if (Draw_Match_option == JOptionPane.YES_OPTION) 
					main(null);
					else 
						{JOptionPane.showMessageDialog(frame, "Thanks For Playing!!!");
						System.exit(0);}
	}//end of play_again
	
	public static void player_name(){
		Player1_Name= JOptionPane.showInputDialog("Please input Name of Player 1 ");			//names of player
		String choice_select = (String) JOptionPane.showInputDialog(frame, "Which Sign Do You Prefer?","Choice Selection",JOptionPane.QUESTION_MESSAGE, null, choice, choice[0]);
		if(choice_select=="X")												//set as '0' if want to start with 'X' else with '1' for starting with 'O'
			player_seq=0;
			else
				player_seq=1;

		Player2_Name= JOptionPane.showInputDialog("Please input Name of Player 2 ");
		if (Player1_Name==null&&Player1_Name==null){
			Player1_Name="Player 1";
			Player2_Name="Player 2";
		}
		
		try(PrintWriter out = new PrintWriter( "players.txt" )  ){						//player log writer
		    out.println( "Player1=" + Player1_Name );
		    out.println( "Player2=" + Player2_Name );
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
				
		
	}
}//end of class




