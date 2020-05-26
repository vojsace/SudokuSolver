package com.example.sudokusolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.HashSet;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
private int num = 0;
private TextView selectedText;

private TextView t00, t01, t02, t03, t04, t05, t06, t07, t08,
                 t10, t11, t12, t13, t14, t15, t16, t17, t18,
                 t20, t21, t22, t23, t24, t25, t26, t27, t28,
                 t30, t31, t32, t33, t34, t35, t36, t37, t38,
                 t40, t41, t42, t43, t44, t45, t46, t47, t48,
                 t50, t51, t52, t53, t54, t55, t56, t57, t58,
                 t60, t61, t62, t63, t64, t65, t66, t67, t68,
                 t70, t71, t72, t73, t74, t75, t76, t77, t78,
                 t80, t81, t82, t83, t84, t85, t86, t87, t88;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        selectedText = (TextView) findViewById(R.id.selectedNum);
    }
    public void userInput(View view){
      int numId = view.getId();
       String name =  getResources().getResourceEntryName(numId);

       switch (name){
           case "one":
              num = 1;
              break;
           case "two":
               num = 2;
               break;
           case "three":
               num = 3;
               break;
           case "four":
               num = 4;
               break;
           case "five":
               num = 5;
               break;
           case "six":
               num = 6;
               break;
           case "seven":
               num = 7;
               break;
           case "eight":
               num = 8;
               break;
           case "nine":
               num = 9;
               break;
       }
        selectedText.setText("Selected: " + String.valueOf(num));
    }

    public void onSelect(View view){
        TextView textView = (TextView) findViewById(view.getId());
        if (textView.getText().equals(String.valueOf(num))){
            num = 0;
            selectedText.setText("Selected: NULL");
        }
        if(num != 0) {
            textView.setText(String.valueOf(num));
            textView.setBackgroundColor(Color.GRAY);
        }
        else {
            textView.setText("0");
           // textView.setBackgroundColor(0);
        }

    }

    public void resultFinal(View view){
        //define grid to solve. Grid is stored in 2D array.
        int[][] GRID_TO_SOLVE = {
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0}
        };

        //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-INPUT*-*--*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*

          String nula = "0";
        //-------------------FIRST ROW----------------------------------
        t00 = (TextView) findViewById(R.id.txt00);
        GRID_TO_SOLVE[0][0] = Integer.parseInt(String.valueOf((t00.getText().equals("")? nula : t00.getText())));
        t01 = (TextView) findViewById(R.id.txt01);
        GRID_TO_SOLVE[0][1] = Integer.parseInt(String.valueOf((t01.getText().equals("")? nula : t01.getText())));
        t02 = (TextView) findViewById(R.id.txt02);
        GRID_TO_SOLVE[0][2] = Integer.parseInt(String.valueOf((t02.getText().equals("")? nula : t02.getText())));
        t03 = (TextView) findViewById(R.id.txt03);
        GRID_TO_SOLVE[0][3] = Integer.parseInt(String.valueOf((t03.getText().equals("")? nula : t03.getText())));
        t04 = (TextView) findViewById(R.id.txt04);
        GRID_TO_SOLVE[0][4] = Integer.parseInt(String.valueOf((t04.getText().equals("")? nula : t04.getText())));
        t05 = (TextView) findViewById(R.id.txt05);
        GRID_TO_SOLVE[0][5] = Integer.parseInt(String.valueOf((t05.getText().equals("")? nula : t05.getText())));
        t06 = (TextView) findViewById(R.id.txt06);
        GRID_TO_SOLVE[0][6] = Integer.parseInt(String.valueOf((t06.getText().equals("")? nula : t06.getText())));
        t07 = (TextView) findViewById(R.id.txt07);
        GRID_TO_SOLVE[0][7] = Integer.parseInt(String.valueOf((t07.getText().equals("")? nula : t07.getText())));
        t08 = (TextView) findViewById(R.id.txt08);
        GRID_TO_SOLVE[0][8] = Integer.parseInt(String.valueOf((t08.getText().equals("")? nula : t08.getText())));
        //-------------------SECOND ROW----------------------------------
        t10 = (TextView) findViewById(R.id.txt10);
        GRID_TO_SOLVE[1][0] = Integer.parseInt(String.valueOf((t10.getText().equals("")? nula : t10.getText())));
        t11 = (TextView) findViewById(R.id.txt11);
        GRID_TO_SOLVE[1][1] = Integer.parseInt(String.valueOf((t11.getText().equals("")? nula : t11.getText())));
        t12 = (TextView) findViewById(R.id.txt12);
        GRID_TO_SOLVE[1][2] = Integer.parseInt(String.valueOf((t12.getText().equals("")? nula : t12.getText())));
        t13 = (TextView) findViewById(R.id.txt13);
        GRID_TO_SOLVE[1][3] = Integer.parseInt(String.valueOf((t13.getText().equals("")? nula : t13.getText())));
        t14 = (TextView) findViewById(R.id.txt14);
        GRID_TO_SOLVE[1][4] = Integer.parseInt(String.valueOf((t14.getText().equals("")? nula : t14.getText())));
        t15 = (TextView) findViewById(R.id.txt15);
        GRID_TO_SOLVE[1][5] = Integer.parseInt(String.valueOf((t15.getText().equals("")? nula : t15.getText())));
        t16 = (TextView) findViewById(R.id.txt16);
        GRID_TO_SOLVE[1][6] = Integer.parseInt(String.valueOf((t16.getText().equals("")? nula : t16.getText())));
        t17 = (TextView) findViewById(R.id.txt17);
        GRID_TO_SOLVE[1][7] = Integer.parseInt(String.valueOf((t17.getText().equals("")? nula : t17.getText())));
        t18 = (TextView) findViewById(R.id.txt18);
        GRID_TO_SOLVE[1][8] = Integer.parseInt(String.valueOf((t18.getText().equals("")? nula : t18.getText())));
        //-------------------THIRD ROW----------------------------------
        t20 = (TextView) findViewById(R.id.txt20);
        GRID_TO_SOLVE[2][0] = Integer.parseInt(String.valueOf(( t20.getText().equals("")? nula :  t20.getText())));
        t21 = (TextView) findViewById(R.id.txt21);
        GRID_TO_SOLVE[2][1] = Integer.parseInt(String.valueOf(( t21.getText().equals("")? nula :  t21.getText())));
        t22 = (TextView) findViewById(R.id.txt22);
        GRID_TO_SOLVE[2][2] = Integer.parseInt(String.valueOf(( t22.getText().equals("")? nula :  t22.getText())));
        t23 = (TextView) findViewById(R.id.txt23);
        GRID_TO_SOLVE[2][3] = Integer.parseInt(String.valueOf(( t23.getText().equals("")? nula :  t23.getText())));
        t24 = (TextView) findViewById(R.id.txt24);
        GRID_TO_SOLVE[2][4] = Integer.parseInt(String.valueOf(( t24.getText().equals("")? nula :  t24.getText())));
        t25 = (TextView) findViewById(R.id.txt25);
        GRID_TO_SOLVE[2][5] = Integer.parseInt(String.valueOf(( t25.getText().equals("")? nula :  t25.getText())));
        t26 = (TextView) findViewById(R.id.txt26);
        GRID_TO_SOLVE[2][6] = Integer.parseInt(String.valueOf(( t26.getText().equals("")? nula :  t26.getText())));
        t27 = (TextView) findViewById(R.id.txt27);
        GRID_TO_SOLVE[2][7] = Integer.parseInt(String.valueOf(( t27.getText().equals("")? nula :  t27.getText())));
        t28 = (TextView) findViewById(R.id.txt28);
        GRID_TO_SOLVE[2][8] = Integer.parseInt(String.valueOf(( t28.getText().equals("")? nula :  t28.getText())));
        //-------------------FOURTH ROW----------------------------------
        t30 = (TextView) findViewById(R.id.txt30);
        GRID_TO_SOLVE[3][0] = Integer.parseInt(String.valueOf((t30.getText().equals("")? nula : t30.getText())));
        t31 = (TextView) findViewById(R.id.txt31);
        GRID_TO_SOLVE[3][1] = Integer.parseInt(String.valueOf((t31.getText().equals("")? nula : t31.getText())));
        t32 = (TextView) findViewById(R.id.txt32);
        GRID_TO_SOLVE[3][2] = Integer.parseInt(String.valueOf((t32.getText().equals("")? nula : t32.getText())));
        t33 = (TextView) findViewById(R.id.txt33);
        GRID_TO_SOLVE[3][3] = Integer.parseInt(String.valueOf((t33.getText().equals("")? nula : t33.getText())));
        t34 = (TextView) findViewById(R.id.txt34);
        GRID_TO_SOLVE[3][4] = Integer.parseInt(String.valueOf((t34.getText().equals("")? nula : t34.getText())));
        t35 = (TextView) findViewById(R.id.txt35);
        GRID_TO_SOLVE[3][5] = Integer.parseInt(String.valueOf((t35.getText().equals("")? nula : t35.getText())));
        t36 = (TextView) findViewById(R.id.txt36);
        GRID_TO_SOLVE[3][6] = Integer.parseInt(String.valueOf((t36.getText().equals("")? nula : t36.getText())));
        t37 = (TextView) findViewById(R.id.txt37);
        GRID_TO_SOLVE[3][7] = Integer.parseInt(String.valueOf((t37.getText().equals("")? nula : t37.getText())));
        t38 = (TextView) findViewById(R.id.txt38);
        GRID_TO_SOLVE[3][8] = Integer.parseInt(String.valueOf((t38.getText().equals("")? nula : t38.getText())));
        //-------------------FIFTH ROW----------------------------------
        t40 = (TextView) findViewById(R.id.txt40);
        GRID_TO_SOLVE[4][0] = Integer.parseInt(String.valueOf((t40.getText().equals("")? nula : t40.getText())));
        t41 = (TextView) findViewById(R.id.txt41);
        GRID_TO_SOLVE[4][1] = Integer.parseInt(String.valueOf((t41.getText().equals("")? nula : t41.getText())));
        t42 = (TextView) findViewById(R.id.txt42);
        GRID_TO_SOLVE[4][2] = Integer.parseInt(String.valueOf((t42.getText().equals("")? nula : t42.getText())));
        t43 = (TextView) findViewById(R.id.txt43);
        GRID_TO_SOLVE[4][3] = Integer.parseInt(String.valueOf((t43.getText().equals("")? nula : t43.getText())));
        t44 = (TextView) findViewById(R.id.txt44);
        GRID_TO_SOLVE[4][4] = Integer.parseInt(String.valueOf((t44.getText().equals("")? nula : t44.getText())));
        t45 = (TextView) findViewById(R.id.txt45);
        GRID_TO_SOLVE[4][5] = Integer.parseInt(String.valueOf((t45.getText().equals("")? nula : t45.getText())));
        t46 = (TextView) findViewById(R.id.txt46);
        GRID_TO_SOLVE[4][6] = Integer.parseInt(String.valueOf((t46.getText().equals("")? nula : t46.getText())));
        t47 = (TextView) findViewById(R.id.txt47);
        GRID_TO_SOLVE[4][7] = Integer.parseInt(String.valueOf((t47.getText().equals("")? nula : t47.getText())));
        t48 = (TextView) findViewById(R.id.txt48);
        GRID_TO_SOLVE[4][8] = Integer.parseInt(String.valueOf((t48.getText().equals("")? nula : t48.getText())));
        //-------------------SIXTH ROW----------------------------------
        t50 = (TextView) findViewById(R.id.txt50);
        GRID_TO_SOLVE[5][0] = Integer.parseInt(String.valueOf((t50.getText().equals("")? nula : t50.getText())));
        t51 = (TextView) findViewById(R.id.txt51);
        GRID_TO_SOLVE[5][1] = Integer.parseInt(String.valueOf((t51.getText().equals("")? nula : t51.getText())));
        t52 = (TextView) findViewById(R.id.txt52);
        GRID_TO_SOLVE[5][2] = Integer.parseInt(String.valueOf((t52.getText().equals("")? nula : t52.getText())));
        t53 = (TextView) findViewById(R.id.txt53);
        GRID_TO_SOLVE[5][3] = Integer.parseInt(String.valueOf((t53.getText().equals("")? nula : t53.getText())));
        t54 = (TextView) findViewById(R.id.txt54);
        GRID_TO_SOLVE[5][4] = Integer.parseInt(String.valueOf((t54.getText().equals("")? nula : t54.getText())));
        t55 = (TextView) findViewById(R.id.txt55);
        GRID_TO_SOLVE[5][5] = Integer.parseInt(String.valueOf((t55.getText().equals("")? nula : t55.getText())));
        t56 = (TextView) findViewById(R.id.txt56);
        GRID_TO_SOLVE[5][6] = Integer.parseInt(String.valueOf((t56.getText().equals("")? nula : t56.getText())));
        t57 = (TextView) findViewById(R.id.txt57);
        GRID_TO_SOLVE[5][7] = Integer.parseInt(String.valueOf((t57.getText().equals("")? nula : t57.getText())));
        t58 = (TextView) findViewById(R.id.txt58);
        GRID_TO_SOLVE[5][8] = Integer.parseInt(String.valueOf((t58.getText().equals("")? nula : t58.getText())));
        //-------------------SEVENTH ROW----------------------------------
        t60 = (TextView) findViewById(R.id.txt60);
        GRID_TO_SOLVE[6][0] = Integer.parseInt(String.valueOf((t60.getText().equals("")? nula : t60.getText())));
        t61 = (TextView) findViewById(R.id.txt61);
        GRID_TO_SOLVE[6][1] = Integer.parseInt(String.valueOf((t61.getText().equals("")? nula : t61.getText())));
        t62 = (TextView) findViewById(R.id.txt62);
        GRID_TO_SOLVE[6][2] = Integer.parseInt(String.valueOf((t62.getText().equals("")? nula : t62.getText())));
        t63 = (TextView) findViewById(R.id.txt63);
        GRID_TO_SOLVE[6][3] = Integer.parseInt(String.valueOf((t63.getText().equals("")? nula : t63.getText())));
        t64 = (TextView) findViewById(R.id.txt64);
        GRID_TO_SOLVE[6][4] = Integer.parseInt(String.valueOf((t64.getText().equals("")? nula : t64.getText())));
        t65 = (TextView) findViewById(R.id.txt65);
        GRID_TO_SOLVE[6][5] = Integer.parseInt(String.valueOf((t65.getText().equals("")? nula : t65.getText())));
        t66 = (TextView) findViewById(R.id.txt66);
        GRID_TO_SOLVE[6][6] = Integer.parseInt(String.valueOf((t66.getText().equals("")? nula : t66.getText())));
        t67 = (TextView) findViewById(R.id.txt67);
        GRID_TO_SOLVE[6][7] = Integer.parseInt(String.valueOf((t67.getText().equals("")? nula : t67.getText())));
        t68 = (TextView) findViewById(R.id.txt68);
        GRID_TO_SOLVE[6][8] = Integer.parseInt(String.valueOf((t68.getText().equals("")? nula : t68.getText())));
        //-------------------EIGHTH ROW----------------------------------
        t70 = (TextView) findViewById(R.id.txt70);
        GRID_TO_SOLVE[7][0] = Integer.parseInt(String.valueOf((t70.getText().equals("")? nula : t70.getText())));
        t71 = (TextView) findViewById(R.id.txt71);
        GRID_TO_SOLVE[7][1] = Integer.parseInt(String.valueOf((t71.getText().equals("")? nula : t71.getText())));
        t72 = (TextView) findViewById(R.id.txt72);
        GRID_TO_SOLVE[7][2] = Integer.parseInt(String.valueOf((t72.getText().equals("")? nula : t72.getText())));
        t73 = (TextView) findViewById(R.id.txt73);
        GRID_TO_SOLVE[7][3] = Integer.parseInt(String.valueOf((t73.getText().equals("")? nula : t73.getText())));
        t74 = (TextView) findViewById(R.id.txt74);
        GRID_TO_SOLVE[7][4] = Integer.parseInt(String.valueOf((t74.getText().equals("")? nula : t74.getText())));
        t75 = (TextView) findViewById(R.id.txt75);
        GRID_TO_SOLVE[7][5] = Integer.parseInt(String.valueOf((t75.getText().equals("")? nula : t75.getText())));
        t76 = (TextView) findViewById(R.id.txt76);
        GRID_TO_SOLVE[7][6] = Integer.parseInt(String.valueOf((t76.getText().equals("")? nula : t76.getText())));
        t77 = (TextView) findViewById(R.id.txt77);
        GRID_TO_SOLVE[7][7] = Integer.parseInt(String.valueOf((t77.getText().equals("")? nula : t77.getText())));
        t78 = (TextView) findViewById(R.id.txt78);
        GRID_TO_SOLVE[7][8] = Integer.parseInt(String.valueOf((t78.getText().equals("")? nula : t78.getText())));
        //-------------------NINE ROW----------------------------------
        t80 = (TextView) findViewById(R.id.txt80);
        GRID_TO_SOLVE[8][0] = Integer.parseInt(String.valueOf((t80.getText().equals("")? nula : t80.getText())));
        t81 = (TextView) findViewById(R.id.txt81);
        GRID_TO_SOLVE[8][1] = Integer.parseInt(String.valueOf((t81.getText().equals("")? nula : t81.getText())));
        t82 = (TextView) findViewById(R.id.txt82);
        GRID_TO_SOLVE[8][2] = Integer.parseInt(String.valueOf((t82.getText().equals("")? nula : t82.getText())));
        t83 = (TextView) findViewById(R.id.txt83);
        GRID_TO_SOLVE[8][3] = Integer.parseInt(String.valueOf((t83.getText().equals("")? nula : t83.getText())));
        t84 = (TextView) findViewById(R.id.txt84);
        GRID_TO_SOLVE[8][4] = Integer.parseInt(String.valueOf((t84.getText().equals("")? nula : t84.getText())));
        t85 = (TextView) findViewById(R.id.txt85);
        GRID_TO_SOLVE[8][5] = Integer.parseInt(String.valueOf((t85.getText().equals("")? nula : t85.getText())));
        t86 = (TextView) findViewById(R.id.txt86);
        GRID_TO_SOLVE[8][6] = Integer.parseInt(String.valueOf((t86.getText().equals("")? nula : t86.getText())));
        t87 = (TextView) findViewById(R.id.txt87);
        GRID_TO_SOLVE[8][7] = Integer.parseInt(String.valueOf((t87.getText().equals("")? nula : t87.getText())));
        t88 = (TextView) findViewById(R.id.txt88);
        GRID_TO_SOLVE[8][8] = Integer.parseInt(String.valueOf((t88.getText().equals("")? nula : t88.getText())));

 //-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*END OF INPUT *-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-
        Sudoku sudoku = new Sudoku(GRID_TO_SOLVE);

if(isValid(GRID_TO_SOLVE) == -1){
    Toast.makeText(this,"Invalid Value",Toast.LENGTH_SHORT).show();
}else if(isValid(GRID_TO_SOLVE) == 0){
    Toast.makeText(this,"You have Repeated Values",Toast.LENGTH_SHORT).show();
}else if (sudoku.solve()){
            Toast.makeText(this,"Solved",Toast.LENGTH_SHORT).show();
            sudoku.display();
        }else
            Toast.makeText(this,"Unsolvable",Toast.LENGTH_SHORT).show();

    }

    public class Sudoku {

        private int[][] board;
        public static final int EMPTY = 0; // empty cell
        public static final int SIZE = 9; // size of our grids

        public Sudoku(int[][] board) {
            this.board = new int[SIZE][SIZE];

            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    this.board[i][j] = board[i][j];
                }
            }
        }

        //checks if a possible number is already in a row
        private boolean isInRow(int row, int number) {
            for (int i = 0; i < SIZE; i++) {
                if (board[row][i] == number)
                    return true;
            }
            return false;
        }

        //checks if a possible number is already in a column
        private boolean isInCol(int col, int number) {
            for (int i = 0; i < SIZE; i++) {
                if (board[i][col] == number)
                    return true;
            }
            return false;
        }

        //we check if a possible number is in its 3x3 box(grid)
        private boolean isInBox(int row, int col, int number) {
            int r = row - row % 3;
            int c = col - col % 3;

            for (int i = r; i < r + 3; i++) {
                for (int j = c; j < c + 3; j++) {
                    if (board[i][j] == number)
                        return true;
                }
            }
            return false;
        }

        //combined method to check if a number possible to a row, column position is OK
        boolean isOk(int row, int col, int number) {
            return !isInRow(row, number) && !isInCol(col, number) && !isInBox(row, col, number);
        }

        //Solve method. Using Recursive BackTracking Algorithm
        public boolean solve() {
            for (int row = 0; row < SIZE; row++) {
                for (int col = 0; col < SIZE; col++) {
                    //we search empty cell
                    //if is empty we try possible numbers
                    if (board[row][col] == EMPTY) {
                        for (int number = 1; number <= SIZE; number++) {
                            if (isOk(row, col, number)) {
                                //number OK, it respects sudoku contrains
                                board[row][col] = number;

                                if (solve()) { // we start backtrack recursively
                                    return true;
                                } else { //if NOT a solution, we empty the cell and we continue
                                    board[row][col] = EMPTY;
                                }
                            }
                        }
                        return false; //not solved, we continue
                    }
                }
            }
            return true; // sudoku solved
        }

        public void display() {
            t00.setText(String.valueOf(board[0][0]));
            t00.setTextColor(Color.BLUE);
            t01.setText(String.valueOf(board[0][1]));
            t01.setTextColor(Color.BLUE);
            t02.setText(String.valueOf(board[0][2]));
            t02.setTextColor(Color.BLUE);
            t03.setText(String.valueOf(board[0][3]));
            t03.setTextColor(Color.BLUE);
            t04.setText(String.valueOf(board[0][4]));
            t04.setTextColor(Color.BLUE);
            t05.setText(String.valueOf(board[0][5]));
            t05.setTextColor(Color.BLUE);
            t06.setText(String.valueOf(board[0][6]));
            t06.setTextColor(Color.BLUE);
            t07.setText(String.valueOf(board[0][7]));
            t07.setTextColor(Color.BLUE);
            t08.setText(String.valueOf(board[0][8]));
            t08.setTextColor(Color.BLUE);
            t10.setText(String.valueOf(board[1][0]));
            t10.setTextColor(Color.BLUE);
            t11.setText(String.valueOf(board[1][1]));
            t11.setTextColor(Color.BLUE);
            t12.setText(String.valueOf(board[1][2]));
            t12.setTextColor(Color.BLUE);
            t13.setText(String.valueOf(board[1][3]));
            t13.setTextColor(Color.BLUE);
            t14.setText(String.valueOf(board[1][4]));
            t14.setTextColor(Color.BLUE);
            t15.setText(String.valueOf(board[1][5]));
            t15.setTextColor(Color.BLUE);
            t16.setText(String.valueOf(board[1][6]));
            t16.setTextColor(Color.BLUE);
            t17.setText(String.valueOf(board[1][7]));
            t17.setTextColor(Color.BLUE);
            t18.setText(String.valueOf(board[1][8]));
            t18.setTextColor(Color.BLUE);
            t20.setText(String.valueOf(board[2][0]));
            t20.setTextColor(Color.BLUE);
            t21.setText(String.valueOf(board[2][1]));
            t21.setTextColor(Color.BLUE);
            t22.setText(String.valueOf(board[2][2]));
            t22.setTextColor(Color.BLUE);
            t23.setText(String.valueOf(board[2][3]));
            t23.setTextColor(Color.BLUE);
            t24.setText(String.valueOf(board[2][4]));
            t24.setTextColor(Color.BLUE);
            t25.setText(String.valueOf(board[2][5]));
            t25.setTextColor(Color.BLUE);
            t26.setText(String.valueOf(board[2][6]));
            t26.setTextColor(Color.BLUE);
            t27.setText(String.valueOf(board[2][7]));
            t27.setTextColor(Color.BLUE);
            t28.setText(String.valueOf(board[2][8]));
            t28.setTextColor(Color.BLUE);
            t30.setText(String.valueOf(board[3][0]));
            t30.setTextColor(Color.BLUE);
            t31.setText(String.valueOf(board[3][1]));
            t31.setTextColor(Color.BLUE);
            t32.setText(String.valueOf(board[3][2]));
            t32.setTextColor(Color.BLUE);
            t33.setText(String.valueOf(board[3][3]));
            t33.setTextColor(Color.BLUE);
            t34.setText(String.valueOf(board[3][4]));
            t34.setTextColor(Color.BLUE);
            t35.setText(String.valueOf(board[3][5]));
            t35.setTextColor(Color.BLUE);
            t36.setText(String.valueOf(board[3][6]));
            t36.setTextColor(Color.BLUE);
            t37.setText(String.valueOf(board[3][7]));
            t37.setTextColor(Color.BLUE);
            t38.setText(String.valueOf(board[3][8]));
            t38.setTextColor(Color.BLUE);
            t40.setText(String.valueOf(board[4][0]));
            t40.setTextColor(Color.BLUE);
            t41.setText(String.valueOf(board[4][1]));
            t41.setTextColor(Color.BLUE);
            t42.setText(String.valueOf(board[4][2]));
            t42.setTextColor(Color.BLUE);
            t43.setText(String.valueOf(board[4][3]));
            t43.setTextColor(Color.BLUE);
            t44.setText(String.valueOf(board[4][4]));
            t44.setTextColor(Color.BLUE);
            t45.setText(String.valueOf(board[4][5]));
            t45.setTextColor(Color.BLUE);
            t46.setText(String.valueOf(board[4][6]));
            t46.setTextColor(Color.BLUE);
            t47.setText(String.valueOf(board[4][7]));
            t47.setTextColor(Color.BLUE);
            t48.setText(String.valueOf(board[4][8]));
            t48.setTextColor(Color.BLUE);
            t50.setText(String.valueOf(board[5][0]));
            t50.setTextColor(Color.BLUE);
            t51.setText(String.valueOf(board[5][1]));
            t51.setTextColor(Color.BLUE);
            t52.setText(String.valueOf(board[5][2]));
            t52.setTextColor(Color.BLUE);
            t53.setText(String.valueOf(board[5][3]));
            t53.setTextColor(Color.BLUE);
            t54.setText(String.valueOf(board[5][4]));
            t54.setTextColor(Color.BLUE);
            t55.setText(String.valueOf(board[5][5]));
            t55.setTextColor(Color.BLUE);
            t56.setText(String.valueOf(board[5][6]));
            t56.setTextColor(Color.BLUE);
            t57.setText(String.valueOf(board[5][7]));
            t57.setTextColor(Color.BLUE);
            t58.setText(String.valueOf(board[5][8]));
            t58.setTextColor(Color.BLUE);
            t60.setText(String.valueOf(board[6][0]));
            t60.setTextColor(Color.BLUE);
            t61.setText(String.valueOf(board[6][1]));
            t61.setTextColor(Color.BLUE);
            t62.setText(String.valueOf(board[6][2]));
            t62.setTextColor(Color.BLUE);
            t63.setText(String.valueOf(board[6][3]));
            t63.setTextColor(Color.BLUE);
            t64.setText(String.valueOf(board[6][4]));
            t64.setTextColor(Color.BLUE);
            t65.setText(String.valueOf(board[6][5]));
            t65.setTextColor(Color.BLUE);
            t66.setText(String.valueOf(board[6][6]));
            t66.setTextColor(Color.BLUE);
            t67.setText(String.valueOf(board[6][7]));
            t67.setTextColor(Color.BLUE);
            t68.setText(String.valueOf(board[6][8]));
            t68.setTextColor(Color.BLUE);
            t70.setText(String.valueOf(board[7][0]));
            t70.setTextColor(Color.BLUE);
            t71.setText(String.valueOf(board[7][1]));
            t71.setTextColor(Color.BLUE);
            t72.setText(String.valueOf(board[7][2]));
            t72.setTextColor(Color.BLUE);
            t73.setText(String.valueOf(board[7][3]));
            t73.setTextColor(Color.BLUE);
            t74.setText(String.valueOf(board[7][4]));
            t74.setTextColor(Color.BLUE);
            t75.setText(String.valueOf(board[7][5]));
            t75.setTextColor(Color.BLUE);
            t76.setText(String.valueOf(board[7][6]));
            t76.setTextColor(Color.BLUE);
            t77.setText(String.valueOf(board[7][7]));
            t77.setTextColor(Color.BLUE);
            t78.setText(String.valueOf(board[7][8]));
            t78.setTextColor(Color.BLUE);
            t80.setText(String.valueOf(board[8][0]));
            t80.setTextColor(Color.BLUE);
            t81.setText(String.valueOf(board[8][1]));
            t81.setTextColor(Color.BLUE);
            t82.setText(String.valueOf(board[8][2]));
            t82.setTextColor(Color.BLUE);
            t83.setText(String.valueOf(board[8][3]));
            t83.setTextColor(Color.BLUE);
            t84.setText(String.valueOf(board[8][4]));
            t84.setTextColor(Color.BLUE);
            t85.setText(String.valueOf(board[8][5]));
            t85.setTextColor(Color.BLUE);
            t86.setText(String.valueOf(board[8][6]));
            t86.setTextColor(Color.BLUE);
            t87.setText(String.valueOf(board[8][7]));
            t87.setTextColor(Color.BLUE);
            t88.setText(String.valueOf(board[8][8]));
            t88.setTextColor(Color.BLUE);

        }
    }

    // Function to check if all the subsquares are valid. It will return:
// -1 if a subsquare contains an invalid value
// 0 if a subsquare contains repeated values
// 1 if the subsquares are valid.
    public static int isValid(int [][] grid){
        for (int row = 0 ; row < 9; row = row + 3) {
            for (int col = 0; col < 9; col = col + 3) {
                Set<Integer> set = new HashSet<Integer>();
                for(int r = row; r < row+3; r++) {
                    for(int c= col; c < col+3; c++){
                        // Checking for values outside 0 and 9;
                        // 0 is considered valid because it
                        // denotes an empty cell.
                        // Removing zeros and the checking for values and
                        // outside 1 and 9 is another way of doing
                        // the same thing.
                        if (grid[r][c] < 0 || grid[r][c] > 9){
                            System.out.println( "Invalid value" );
                            return -1;
                        }
                        // Checking for repeated values.
                        else if (grid[r][c] != 0){
                            if (set.add(grid[r][c]) == false) {
                                System.out.println("repeated value");
                                return 0;
                            }
                        }
                    }
                }
            }
        }
        return 1;
    }
}
