package pl.narodzinyprogramisty.CommandPattern;

public class DrawCircleCommand implements Command {

    private Board board;

    public DrawCircleCommand(Board board) {
        this.board = board;
    }

    @Override
    public void execute(int x, int y) {
        board.board[x][y] = 1;
    }
}
