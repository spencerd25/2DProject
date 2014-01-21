package Controller;

import model.Hipster;
import view.GridView;

public class Controller
{
	private int[][] FavoriteNumbers;
	private String[][] Names;
	private GridView ConsoleView;
	private Hipster [][] myHipsters;

	public Controller()
	{
		FavoriteNumbers = new int[4][4];
		Names = new String[4][4];
		ConsoleView = new GridView();
		myHipsters = new Hipster[2][2];
		fillNumbers();
		fillNames();
	}

	public String[][] getFavoriteNumbers()
	{
		return getFavoriteNumbers();
	}

	public void setMyFavoriteNumbers(int[][] myFavoriteNumbers)
	{
		this.FavoriteNumbers = myFavoriteNumbers;
	}
	
	public String[][] getNames()
	{
		return getNames();
	}

	public void setNames(String[][] myNames)
	{
		this.Names = myNames;
	}

	private void fillHipsters()
	{
		myHipsters[0][0] = new Hipster();
		myHipsters[0][1] = new Hipster();
		myHipsters[1][0] = new Hipster();
		myHipsters[1][1] = new Hipster();
	}
	
	public void fillNumbers()
	{
		FavoriteNumbers[0][0] = 25;
		FavoriteNumbers[0][1] = 2;
		FavoriteNumbers[0][2] = 12;
		FavoriteNumbers[0][3] = 5;

		FavoriteNumbers[1][0] = 10;
		FavoriteNumbers[1][1] = 13;
		FavoriteNumbers[1][2] = 24;
		FavoriteNumbers[1][3] = 66;

		FavoriteNumbers[2][0] = 88;
		FavoriteNumbers[2][1] = 75;
		FavoriteNumbers[2][2] = 82;
		FavoriteNumbers[2][3] = 96;

		FavoriteNumbers[3][0] = 30;
		FavoriteNumbers[3][1] = 33;
		FavoriteNumbers[3][2] = 1;
		FavoriteNumbers[3][3] = 99;
	}
	
	public void fillNames()
	{
		Names[0][0] = "spencer";
		Names[0][1] = "sam";
		Names[0][2] = "kara";
		Names[0][3] = "matt";

		Names[1][0] = "jon";
		Names[1][1] = "daniel";
		Names[1][2] = "bobby";
		Names[1][3] = "jamie";

		Names[2][0] = "rob";
		Names[2][1] = "cody";
		Names[2][2] = "joe";
		Names[2][3] = "billy";

		Names[3][0] = "bob";
		Names[3][1] = "jak";
		Names[3][2] = "dillion";
		Names[3][3] = "james";
	}

	public void start()
	{
		ConsoleView.printIntInformation(FavoriteNumbers);
		ConsoleView.printStringInformation(Names);

	}
}