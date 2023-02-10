
public class Bingo {
	
	private int[][] bingoCard = new int [5][5];
	private static final int XED_OUT = -1;
	
	public Bingo() {
		for(int row = 0; row < 4; row++) {
			for(int col = 0; col < 4; col++)	{
		}
		bingoCard[2][2] = XED_OUT;
	}
	}
	
	void CalledNumber(int n) {
		System.out.println("Number " + n + " called");
	}
	 
	 boolean checkForBingo() {
		 System.out.println("Checking for a bingo");
		 if(bingoCard[0][0]==0&&bingoCard[0][1]==0&&bingoCard[0][2]==0&&bingoCard[0][3]==0&&bingoCard[0][4]==-1)	{ 
				return true;
		 }
		 else if(bingoCard[1][0]==0&&bingoCard[1][1]==0&&bingoCard[1][2]==0&&bingoCard[1][3]==0&&bingoCard[1][4]==-1){
				return true;
		 }
		 else if(bingoCard[2][0]==0&&bingoCard[2][1]==0&&bingoCard[2][2]==0&&bingoCard[2][3]==0&&bingoCard[2][4]==-1){
				return true;
		 }
		 else if(bingoCard[3][0]==0&&bingoCard[3][1]==0&&bingoCard[3][2]==0&&bingoCard[3][3]==0&&bingoCard[3][4]==-1){
				return true;
		 }
		 else if(bingoCard[4][0]==0&&bingoCard[4][1]==0&&bingoCard[4][2]==0&&bingoCard[4][3]==0&&bingoCard[4][4]==-1){
				return true;
		 }
		 else if(bingoCard[0][0]==0&&bingoCard[1][0]==0&&bingoCard[2][0]==0&&bingoCard[3][0]==0&&bingoCard[4][0]==-1){
				return true;
		 }
		 else if(bingoCard[0][1]==0&&bingoCard[1][1]==0&&bingoCard[2][1]==0&&bingoCard[3][1]==0&&bingoCard[4][1]==-1){
				return true;
		 }
		 else if(bingoCard[0][2]==0&&bingoCard[1][2]==0&&bingoCard[2][2]==0&&bingoCard[3][2]==0&&bingoCard[4][2]==-1){
				return true;
		 }
		 else if(bingoCard[0][3]==0&&bingoCard[1][3]==0&&bingoCard[2][3]==0&&bingoCard[3][3]==0&&bingoCard[4][3]==-1){
				return true;
		 }
		 else if(bingoCard[0][4]==0&&bingoCard[1][4]==0&&bingoCard[2][4]==0&&bingoCard[3][4]==0&&bingoCard[4][4]==-1){
				return true;
		 }
		 else if(bingoCard[0][0]==0&&bingoCard[1][1]==0&&bingoCard[2][2]==0&&bingoCard[3][3]==0&&bingoCard[4][4]==-1){
				return true;
		 }
		 else if(bingoCard[4][4]==0&&bingoCard[3][3]==0&&bingoCard[2][2]==0&&bingoCard[1][1]==0&&bingoCard[0][0]==-1){
				return true;
		 }
		 else	{
			 return false;
		 }
	 }
	 
	 void printCard() {
		 String title[] = {"  B  ","  I  ","  N  ","  G  ","  O  "};
		 for(int i = 0; i < title.length; i++)	{
			 System.out.print(title[i]);
		 }
		 System.out.println();
		 
		 for(int row = 0; row < bingoCard.length; row++)	{
			 System.out.print("|");
			 for(int col = 0; col < bingoCard[row].length; col++)	{
				 System.out.print(bingoCard[row][col] + "\t|");
			 }
			 System.out.println("\n-----------------------------------------");
		 }
	 }
	 
	 void calledNumber(String s) {
		 System.out.println("Number " + s + " called");
	 }
	 
	 void generateCard() {
		 System.out.println("Generate a random bingo card");
	 }

	 public static void main(String [] args)
		{
			Bingo card = new Bingo();
			card.printCard();
			card.CalledNumber(16);
			card.printCard();
			if (card.checkForBingo())
				System.out.println("Bingo!");
			else
				System.out.println("No bingo yet, keep playing");
			card.calledNumber("I16");
			card.printCard();
			card.generateCard();
			card.printCard();
		}
	}
