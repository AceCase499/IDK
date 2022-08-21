package TH;

public class MazeSolver {
	
	public static void printGrid(Boolean grid[][], int row, int col) {
		
		for (int l = 0; l < col; l++) {
			System.out.print("+-------");
		}
		System.out.print("+\n");
		for (int p = 0; p < row; p++) {
			for (int q = 0; q < col; q++) {
				
				if (grid[p][q]) {
					System.out.printf("|%6s ", " ");
				} 
				if (grid[p][q] == false) {
					System.out.printf("|%6s ", grid[p][q]);
				} 
			}
			System.out.print("|\n");
			for (int l = 0; l < col; l++) {
				System.out.print("+-------");
			}
			System.out.print("+\n");
		}
		
	}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public static String solveMaze(Boolean maze[][], int row, int col) {
		int posA = 0;
		int posB = 0;
		char[] DIR = new char[row*col];
		String directions = "";
		String lastMove = "Down"; //Left, Right, Up, Down
		
		if (posA == row && posB == col) {
			return "Emtpy Maze!";
		}
		
		for(int i = 0; i < DIR.length; i++) {
		    DIR[i] = ' ';
		}
		
		while (true) {
			if (posA == row && posB == col) {
				System.out.println("Escaped!");
				break;
			}
			//System.out.println("("+posA+","+posB+")");
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			if(lastMove == "Down") {
				if(posA+1 == col) {
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'D';
							break;
						}
					}
					System.out.println("Escaped!");
					break;
				}
				if (maze[posA+1][posB]) {
					posA++;
					lastMove = "Down";
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'D';
							break;
						}
					}
					continue;
				}
				if(maze[posA][posB+1]) {
					posB++;
					lastMove = "Right";
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'R';
							break;
						}
					}
					continue;
				}
				if(maze[posA][posB-1]) {
					posB--;
					lastMove = "Left";
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'L';
							break;
						}
					}
					continue;
					} else {
						//BEGIN BACKTRACKING
						while (true) {
							if(posA == 0 && posB == 0) {
								return "STUCK! This maze is not solvable.";
							}
							//System.out.println("Backtracking: ("+posA+","+posB+")");
							int openings = 0;
							if(maze[posA][posB+1]) {
								openings++;
							}
							if(maze[posA][posB-1]) {
								openings++;
							}
							if(maze[posA+1][posB]) {
								openings++;
							}
							if(maze[posA-1][posB]) {
								openings++;
							}
							if(openings >= 2) {
								for(int i = 0; i < DIR.length; i++) {
									if (DIR[i] == ' ') {
										if(DIR[i-1] == 'D') {
											lastMove = "Down";
										}
										if(DIR[i-1] == 'U') {
											lastMove = "Up";
										}
										if(DIR[i-1] == 'R') {
											lastMove = "Right";
										}
										if(DIR[i-1] == 'L') {
											lastMove = "Left";
										}
									}
								}
								break;
							}
							for(int i = 0; i < DIR.length; i++) {
								if (DIR[i+1] == ' ') {
									if(DIR[i] == 'D') {
										maze[posA][posB] = false;
										posA--;
										DIR[i] = ' ';
										break;
									}
									if(DIR[i] == 'U') {
										maze[posA][posB] = false;
										posA++;
										DIR[i] = ' ';
										break;
									}
									if(DIR[i] == 'L') {
										maze[posA][posB] = false;
										posB++;
										DIR[i] = ' ';
										break;
									}
									if(DIR[i] == 'R') {
										maze[posA][posB] = false;
										posB--;
										DIR[i] = ' ';
										break;
									}
								}
							}
						}
					}
				}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			if(lastMove == "Up") {
				if (maze[posA-1][posB]) {
					posA--;
					lastMove = "Up";
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'U';
							break;
						}
					}
					continue;
				}
				if(maze[posA][posB+1]) {
					posB++;
					lastMove = "Right";
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'R';
							break;
						}
					}
					continue;
				}
				if(maze[posA][posB-1]) {
					posB--;
					lastMove = "Left";
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'L';
							break;
						}
					}
					continue;
					} else {
						//BEGIN BACKTRACKING
						while (true) {
							if(posA == 0 && posB == 0) {
								return "STUCK! This maze is not solvable.";
							}
							//System.out.println("Backtracking: ("+posA+","+posB+")");
							int openings = 0;
							if(maze[posA][posB+1]) {
								openings++;
							}
							if(maze[posA][posB-1]) {
								openings++;
							}
							if(maze[posA+1][posB]) {
								openings++;
							}
							if(maze[posA-1][posB]) {
								openings++;
							}
							if(openings >= 2) {
								for(int i = 0; i < DIR.length; i++) {
									if (DIR[i] == ' ') {
										if(DIR[i-1] == 'D') {
											lastMove = "Down";
										}
										if(DIR[i-1] == 'U') {
											lastMove = "Up";
										}
										if(DIR[i-1] == 'R') {
											lastMove = "Right";
										}
										if(DIR[i-1] == 'L') {
											lastMove = "Left";
										}
									}
								}
								break;
							}
							for(int i = 0; i < DIR.length; i++) {
								if (DIR[i+1] == ' ') {
									if(DIR[i] == 'D') {
										maze[posA][posB] = false;
										posA--;
										DIR[i] = ' ';
										break;
									}
									if(DIR[i] == 'U') {
										maze[posA][posB] = false;
										posA++;
										DIR[i] = ' ';
										break;
									}
									if(DIR[i] == 'L') {
										maze[posA][posB] = false;
										posB++;
										DIR[i] = ' ';
										break;
									}
									if(DIR[i] == 'R') {
										maze[posA][posB] = false;
										posB--;
										DIR[i] = ' ';
										break;
									}
								}
							}
						}
					}
				}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			if(lastMove == "Right") {
				if(posB+1 == row) {
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'D';
							break;
						}
					}
					System.out.println("Escaped!");
					break;
				}
				if (maze[posA][posB+1]) {
					posB++;
					lastMove = "Right";
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'R';
							break;
						}
					}
					continue;
				}
				if(maze[posA+1][posB]) {
					posA++;
					lastMove = "Down";
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'D';
							break;
						}
					}
					continue;
				}
				if(maze[posA-1][posB]) {
					posA--;
					lastMove = "Up";
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'U';
							break;
						}
					}
					continue;
					} else {
						//BEGIN BACKTRACKING
						while (true) {
							//System.out.println("Backtracking: ("+posA+","+posB+")");
							if(posA == 0 && posB == 0) {
								return "STUCK! This maze is not solvable.";
							}
							int openings = 0;
							if(maze[posA][posB+1]) {
								openings++;
							}
							if(maze[posA][posB-1]) {
								openings++;
							}
							if(maze[posA+1][posB]) {
								openings++;
							}
							if(maze[posA-1][posB]) {
								openings++;
							}
							if(openings >= 2) {
								for(int i = 0; i < DIR.length; i++) {
									if (DIR[i] == ' ') {
										if(DIR[i-1] == 'D') {
											lastMove = "Down";
										}
										if(DIR[i-1] == 'U') {
											lastMove = "Up";
										}
										if(DIR[i-1] == 'R') {
											lastMove = "Right";
										}
										if(DIR[i-1] == 'L') {
											lastMove = "Left";
										}
									}
								}
								break;
							}
							for(int i = 0; i < DIR.length; i++) {
								if (DIR[i+1] == ' ') {
									if(DIR[i] == 'D') {
										maze[posA][posB] = false;
										posA--;
										DIR[i] = ' ';
										break;
									}
									if(DIR[i] == 'U') {
										maze[posA][posB] = false;
										posA++;
										DIR[i] = ' ';
										break;
									}
									if(DIR[i] == 'L') {
										maze[posA][posB] = false;
										posB++;
										DIR[i] = ' ';
										break;
									}
									if(DIR[i] == 'R') {
										maze[posA][posB] = false;
										posB--;
										DIR[i] = ' ';
										break;
									}
								}
							}
						}
					}
				}
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			if(lastMove == "Left") {
				if (maze[posA][posB-1]) {
					posB--;
					lastMove = "Left";
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'L';
							break;
						}
					}
					continue;
				}
				if(maze[posA+1][posB]) {
					posA++;
					lastMove = "Down";
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'D';
							break;
						}
					}
					continue;
				}
				if(maze[posA-1][posB]) {
					posA--;
					lastMove = "Up";
					for(int i = 0; i < DIR.length; i++) {
						if (DIR[i] == ' ') {
							DIR[i] = 'U';
							break;
						}
					}
					continue;
					} else {
						//BEGIN BACKTRACKING
						while (true) {
							//System.out.println("Backtracking: ("+posA+","+posB+")");
							if(posA == 0 && posB == 0) {
								return "STUCK! This maze is not solvable.";
							}
							int openings = 0;
							if(maze[posA][posB+1]) {
								openings++;
							}
							if(maze[posA][posB-1]) {
								openings++;
							}
							if(maze[posA+1][posB]) {
								openings++;
							}
							if(maze[posA-1][posB]) {
								openings++;
							}
							if(openings >= 2) {
								for(int i = 0; i < DIR.length; i++) {
									if (DIR[i] == ' ') {
										if(DIR[i-1] == 'D') {
											lastMove = "Down";
										}
										if(DIR[i-1] == 'U') {
											lastMove = "Up";
										}
										if(DIR[i-1] == 'R') {
											lastMove = "Right";
										}
										if(DIR[i-1] == 'L') {
											lastMove = "Left";
										}
									}
								}
								break;
							}
							for(int i = 0; i < DIR.length; i++) {
								if (DIR[i+1] == ' ') {
									if(DIR[i] == 'D') {
										maze[posA][posB] = false;
										posA--;
										DIR[i] = ' ';
										break;
									}
									if(DIR[i] == 'U') {
										maze[posA][posB] = false;
										posA++;
										DIR[i] = ' ';
										break;
									}
									if(DIR[i] == 'L') {
										maze[posA][posB] = false;
										posB++;
										DIR[i] = ' ';
										break;
									}
									if(DIR[i] == 'R') {
										maze[posA][posB] = false;
										posB--;
										DIR[i] = ' ';
										break;
									}
								}
							}
						}
					}
				}
			}
		
		
		for(char j : DIR){
			directions += j;
		}
		return directions;
	}
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
	public static void main (String[] args){
		Boolean[][] tester = new Boolean[10][10];
		
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				tester[x][y] = true;
			}
		}
		for(int x = 1; x < 10; x++) {
			tester[x][0] = false;
		}
		for(int x = 1; x < 4; x++) {
			tester[x][4] = false;
		}
		for(int x = 0; x < 7; x++) {
			tester[x][5] = false;
		}
		for(int x = 5; x < 9; x++) {
			tester[x][7] = false;
		}
		for(int x = 0; x < 8; x++) {
			tester[x][9] = false;
		}
		
		for(int x = 2; x < 10; x++) {
			tester[0][x] = false;
		}
		for(int x = 0; x < 9; x++) {
			tester[9][x] = false;
		}
		tester[5][1] = false;
		tester[7][2] = false;
		tester[7][3] = false;
		tester[6][3] = false;
		tester[5][3] = false;
		tester[6][4] = false;
		tester[2][8] = false;
		tester[2][7] = false;
		tester[8][5] = false;
		tester[3][3] = false;
		tester[3][2] = false;
		tester[2][2] = false;
		
		printGrid(tester, 10, 10);
		System.out.println(solveMaze(tester, 10, 10));
		
	}
}