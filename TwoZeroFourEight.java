import java.util.*;

public class TwoZeroFourEight {

	public static int[][] right(int[][] board) {
		int temp = -1;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if ((board[i][j] > 0 && board[i][j + 1] == 0)) {
					temp = board[i][j];
					board[i][j] = board[i][j + 1];
					board[i][j + 1] = temp;

				}
			}
		}
		for (int i = 3; i >= 0; i--) {
			for (int j = 3; j > 0; j--) {
				if ((board[i][j]) == board[i][j - 1]) {
					board[i][j] *= 2;
					board[i][j - 1] = 0;

				}
			}
		}
		int temp1 = -1;
		for (int t = 0; t < 5; t++) {
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					if ((board[i][j] > 0 && board[i][j + 1] == 0)) {
						temp1 = board[i][j];
						board[i][j] = board[i][j + 1];
						board[i][j + 1] = temp1;

					}
				}
			}
		}
		return board;
	}

	public static int[][] down(int[][] board) {
		int temp1 = -1;
		for (int i = 3; i > 0; i--) {
			for (int j = 3; j >= 0; j--) {
				if ((board[i][j] == 0 && board[i - 1][j] > 0)) {
					temp1 = board[i][j];
					board[i][j] = board[i - 1][j];
					board[i - 1][j] = temp1;

				}
			}
		}
		for (int i = 3; i > 0; i--) {
			for (int j = 3; j >= 0; j--) {
				if ((board[i][j]) == board[i - 1][j]) {
					board[i][j] *= 2;
					board[i - 1][j] = 0;

				}
			}
		}
		int temp = -1;
		for (int t = 0; t < 5; t++) {
			for (int i = 3; i > 0; i--) {
				for (int j = 3; j >= 0; j--) {
					if ((board[i][j] == 0 && board[i - 1][j] > 0)) {
						temp = board[i][j];
						board[i][j] = board[i - 1][j];
						board[i - 1][j] = temp;

					}
				}
			}
		}
		return board;
	}

	public static int[][] up(int[][] board) {
		int temp = -1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if ((board[i][j] == 0 && board[i + 1][j] > 0)) {
					temp = board[i][j];
					board[i][j] = board[i + 1][j];
					board[i + 1][j] = temp;

				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if ((board[i][j]) == board[i + 1][j]) {
					board[i][j] *= 2;
					board[i + 1][j] = 0;

				}
			}
		}
		int temp1 = -1;
		for (int t = 0; t < 5; t++) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 4; j++) {
					if ((board[i][j] == 0 && board[i + 1][j] > 0)) {
						temp1 = board[i][j];
						board[i][j] = board[i + 1][j];
						board[i + 1][j] = temp1;

					}
				}
			}
		}
		return board;
	}

	public static int[][] left(int[][] board) {
		int temp = -1;
		for (int i = 3; i >= 0; i--) {
			for (int j = 2; j >= 0; j--) {
				if ((board[i][j] == 0 && board[i][j + 1] > 0)) {
					temp = board[i][j];
					board[i][j] = board[i][j + 1];
					board[i][j + 1] = temp;

				}
			}
		}
		/*
		 * for(int i = 0; i < 4; i++) { for(int j = 0; j < 4; j++) {
		 * System.out.print(board[i][j] + " "); } System.out.println(); }
		 */

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				if ((board[i][j]) == board[i][j + 1]) {
					board[i][j] *= 2;
					board[i][j + 1] = 0;

				}
			}
		}
		/*
		 * for(int i = 0; i < 4; i++) { for(int j = 0; j < 4; j++) {
		 * System.out.print(board[i][j] + " "); } System.out.println(); }
		 */
		int temp1 = -1;
		for (int t = 0; t < 5; t++) {
			for (int i = 3; i >= 0; i--) {
				for (int j = 2; j >= 0; j--) {
					if ((board[i][j] == 0 && board[i][j + 1] > 0)) {
						temp1 = board[i][j];
						board[i][j] = board[i][j + 1];
						board[i][j + 1] = temp1;
					}
				}
			}
		}
		return board;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int[][] board = new int[4][4];
		String[] parts = new String[4];
		for (int i = 0; i < 4; i++) {

			String theRow = sc.nextLine();
			for (int j = 0; j < 4; j++) {

				parts = theRow.split(" ");
				board[i][j] = Integer.parseInt(parts[j]);
			}
		}

		int direction = sc.nextInt();
		if (direction == 0) {
			left(board);
		} else if (direction == 1) {
			up(board);
		} else if (direction == 2) {
			right(board);
		} else if (direction == 3) {
			down(board);
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(board[i][j] + " ");

			}
			System.out.println();
		}
	}
}
