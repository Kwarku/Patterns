package pl.narodzinyprogramisty.CommandPattern;

public class DrawRectCommand implements Command {

    private Board board;

    public DrawRectCommand(Board board) {
        this.board = board;
    }

    @Override
    public void execute(int x, int y) {
        board.board[x][y] = 2;
    }
}
