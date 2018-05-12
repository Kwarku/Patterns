package pl.narodzinyprogramisty.CommandPattern;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Paint paint = new Paint();
        Board board = new Board(new int[3][3]);
        Command drawCircle = new DrawCircleCommand(board);
        Command drawRect = new DrawRectCommand(board);
        paint.setCommand(drawCircle);
        paint.executeCommand(0,0);
        paint.setCommand(drawRect);
        paint.executeCommand(2,2);
        System.out.println(Arrays.deepToString(board.board));
    }
}
