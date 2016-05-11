package ttt;

import java.util.Scanner;


public class cui {
	public static  String[] Array;
	
	public static void main(String[] args) {

	System.out.println("*** Triple T ***");
	System.out.println("Playes 1 ( O )");
	System.out.println("Player 2 ( X )");
	System.out.println(" ");
   /////////

	///////////////
    Array = new String [10];
	
	Array[1] = " ";
	Array[2] = " ";
	Array[3] = " ";
	Array[4] = " ";
	Array[5] = " ";
	Array[6] = " ";
	Array[7] = " ";
	Array[8] = " ";
	Array[9] = " ";
	player_count();
	}//end of main
 	
	public static void display_grid(){
     System.out.println(Array[1] +"  | "+ Array[2] + "  | " +Array[3]);
     System.out.println(" --  --  --");
     System.out.println(Array[4] +"  | "+ Array[5] + "  |" +Array[6]);
     System.out.println(" --  --  --");
     System.out.println(Array[7] +"  | "+ Array[8] + "  |" +Array[9]);
	}	//end of display_grid
	
	
	public static void player_count(){
     for (int player_seq=1;player_seq<10;player_seq++){
     if ((player_seq & 1) == 0)
    	 Player2_move(player_seq);
     else
    	 Player1_move(player_seq);
     }			//end of for loop
     
}//end of player_count
    
	
	
	
	
	
	public static void Player1_move (int player_seq) {
		display_grid();
		System.out.println(" "); 
		System.out.println("Player 1");
		System.out.println("Enter choice (1,2,3,4,5,6,7,8,9) ");
		 int choice;
		 Scanner input=new Scanner(System.in);
		 choice=input.nextInt();
		
		 if (choice==0||choice>9||Array[choice]!=" "){
			 System.out.println("INVALID MOVE");
			 Player1_move(player_seq);	 
		 }
		 

		 
		 Array[choice]="O";
		 if (player_seq>=5)//check condition
			 logic();
		 
	}			//end of player1
	
	
	public static void Player2_move (int player_seq) {
		 display_grid(); 
		 System.out.println(" "); 
		 System.out.println("Player 2");
		 System.out.println("Enter choice (1,2,3,4,5,6,7,8,9) ");
		 int choice;
		 Scanner input=new Scanner(System.in);
		 choice=input.nextInt();
		 
		 if (choice==0||choice>9||Array[choice]!=" "){
			 System.out.println("INVALID MOVE");
			 Player2_move(player_seq);	
			 }
		 
		 Array[choice]="X";
		 if (player_seq>=5)//check condition
		 logic();
		 
	}			//end of player2

    
     
     
public static void logic () 
{
	if((Array[1]=="O"&& Array[4]=="O"&&Array[7] == "O")||(Array[2]=="O"&&Array[5]=="O"&&Array[8]=="O")||(Array[3]=="O" && Array[6]=="O"&& Array[9]=="O"))			//vertical check PLAYER 1
		 {System.out.println("*** PLAYER 1 IS WINNER ***");
		 java.awt.Toolkit.getDefaultToolkit().beep();
		 display_grid();
		 System.exit(0);}
	if((Array[1]=="X"&& Array[4]=="X"&&Array[7] == "X")||(Array[2]=="X"&&Array[5]=="X"&&Array[8]=="X")||(Array[3]=="X" && Array[6]=="X"&& Array[9]=="X"))			//vertical check PLAYER 2
		{System.out.println("*** PLAYER 2 IS WINNER ***");
		java.awt.Toolkit.getDefaultToolkit().beep();
		display_grid();
		System.exit(0);}
	
	
	if((Array[1]=="O"&& Array[2]=="O"&&Array[3] == "O")||(Array[4]=="O"&&Array[5]=="O"&&Array[6]=="O")||(Array[7]=="O" && Array[8]=="O"&& Array[9]=="O"))			////horizontal check PLAYER 1
		{System.out.println("*** PLAYER 1 IS WINNER ***");
		java.awt.Toolkit.getDefaultToolkit().beep();
		display_grid();
		System.exit(0);}
	if((Array[1]=="X"&& Array[2]=="X"&&Array[3] == "X")||(Array[4]=="X"&&Array[5]=="X"&&Array[6]=="X")||(Array[7]=="X" && Array[8]=="X"&& Array[9]=="X"))			//horizontal check PLAYER 2
		{System.out.println("*** PLAYER 2 IS WINNER ***");
		java.awt.Toolkit.getDefaultToolkit().beep();
		display_grid();
		System.exit(0);}
	
	
	if((Array[1]=="O"&& Array[5]=="O"&&Array[9] == "O")||(Array[3]=="O"&&Array[5]=="O"&&Array[7]=="O"))			//diagonal check PLAYER 1
		{System.out.println("*** PLAYER 1 IS WINNER ***");
		java.awt.Toolkit.getDefaultToolkit().beep();
		display_grid();
		System.exit(0);}
	if((Array[1]=="X"&& Array[5]=="X"&&Array[9] == "X")||(Array[3]=="X"&&Array[5]=="X"&&Array[7]=="X"))			//diagonal check PLAYER 2
		{System.out.println("*** PLAYER 2 IS WINNER ***");
		java.awt.Toolkit.getDefaultToolkit().beep();
		display_grid();
		System.exit(0);}
	
	if (Array[1]!=" "&&Array[2]!=" "&&Array[3]!=" "&&Array[4]!=" "&&Array[5]!=" "&&Array[6]!=" "&&Array[7]!=" "&&Array[8]!=" "&&Array[9]!=" ") //check draw
		{System.out.println("*** Match Draw ***");
		java.awt.Toolkit.getDefaultToolkit().beep();
		display_grid();
		System.exit(0);}

} //end of logic



}		//end of class cui
	    









