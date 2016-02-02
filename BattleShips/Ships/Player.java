package Ships;

public class Player {

    private Board playerBoard;
    private Boat boat;
    private OceanLiner liner;
    private Submarine sub;
    private Player opponent;


    Player() {
        playerBoard = new Board();
        boat = new Boat();
        liner = new OceanLiner();
        sub = new Submarine();
    }

    void printPlayerBoard() {
        this.playerBoard.printBoard();
    }

    int getPlayerBoardElement(int row, int col) {
        return this.playerBoard.getBoardElement(row, col);
    }

    void setPlayerBoardElement(int row, int col, int val) {
        this.playerBoard.setBoardElement(row, col, val);
    }

    private void destroyShip(int shipIdentifier) {
        for (int row = 0; row < this.playerBoard.BOARD_SIZE; row++) {
            for (int col = 0; col < this.playerBoard.BOARD_SIZE; col++) {
                if (opponent.getPlayerBoardElement(row, col) == shipIdentifier) {
                    opponent.setPlayerBoardElement(row, col, 0);
                }
            }
        }
    }


    private void initHorizontal(int row, int col, int counter, int shipIdentifier) {


        if (shipIdentifier == this.boat.getLength()) {
            if (counter >= this.boat.getLength()) {
                for (int i = col; i < col + this.boat.getLength(); i++) {
                    this.playerBoard.setBoardElement(row, i, shipIdentifier);
                }
            } else {
                System.out.println("Can't place the ship here !");
            }
        }
        if (shipIdentifier == this.liner.getLength()) {
            if (counter >= this.liner.getLength()) {
                for (int i = col; i < col + this.liner.getLength(); i++) {
                    this.playerBoard.setBoardElement(row, i, shipIdentifier);
                }
            } else {
                System.out.println("Can't place the ship here !");
            }
        }

        if (shipIdentifier == this.sub.getLength()) {
            if (counter >= this.sub.getLength()) {
                for (int i = col; i < col + this.sub.getLength(); i++) {
                    this.playerBoard.setBoardElement(row, i, shipIdentifier);
                }
            } else {
                System.out.println("Can't place the ship here !");
            }
        }

    }

    private void initVertical(int row, int col, int counter, int shipIdentifier) {

        if (shipIdentifier == this.boat.getLength()) {
            if (counter >= this.boat.getLength()) {
                for (int i = row; i < row + this.boat.getLength(); i++) {
                    this.playerBoard.setBoardElement(i, col, shipIdentifier);
                }
            } else {
                System.out.println("Can't place the ship here !");

            }
        }

        if (shipIdentifier == this.liner.getLength()) {
            if (counter >= this.liner.getLength()) {
                for (int i = row; i < row + this.liner.getLength(); i++) {
                    this.playerBoard.setBoardElement(i, col, shipIdentifier);
                }
            } else {
                System.out.println("Can't place the ship here !");

            }
        }

        if (shipIdentifier == this.sub.getLength()) {
            if (counter >= this.sub.getLength()) {
                for (int i = row; i < row + this.sub.getLength(); i++) {
                    this.playerBoard.setBoardElement(i, col, shipIdentifier);
                }
            } else {
                System.out.println("Can't place the ship here !");

            }
        }

    }


    void addHorizontalShip(Ship ship, int row, int col) {

        int counter = 0;

        for (int i = col; i < this.playerBoard.BOARD_SIZE; i++) {
            if (this.playerBoard.getBoard()[row][i] == 0) {
                counter++;
            } else {
                break;
            }
        }

        if (ship instanceof Boat) {
            initHorizontal(row, col, counter, this.boat.getLength());

        }
        if (ship instanceof OceanLiner) {
            initHorizontal(row, col, counter, this.liner.getLength());

        }
        if (ship instanceof Submarine) {
            initHorizontal(row, col, counter, this.sub.getLength());

        }

    }

    void addVerticalShip(Ship ship, int row, int col) {

        int counter = 0;

        for (int i = row; i < this.playerBoard.BOARD_SIZE; i++) {
            if (this.playerBoard.getBoard()[i][col] == 0) {
                counter++;
            } else {
                break;
            }
        }

        if (ship instanceof Boat) {
            initVertical(row, col, counter, this.boat.getLength());

        }
        if (ship instanceof OceanLiner) {
            initVertical(row, col, counter, this.liner.getLength());

        }
        if (ship instanceof Submarine) {
            initVertical(row, col, counter, this.sub.getLength());
        }
    }

    void shoot(int row, int col) {
        if (row >= 0 && row < this.playerBoard.BOARD_SIZE && col >= 0 && col < this.playerBoard.BOARD_SIZE) {
            if (opponent.getPlayerBoardElement(row, col) == 0) {
                System.out.println("You missed !");
            }
            if (opponent.getPlayerBoardElement(row, col) == this.boat.getLength()) {
                System.out.println("You hit a boat !");
                destroyShip(this.boat.getLength());
            }
            if (opponent.getPlayerBoardElement(row, col) == this.liner.getLength()) {
                System.out.println("You hit an Ocean Liner!");
                destroyShip(this.liner.getLength());
            }
            if (opponent.getPlayerBoardElement(row, col) == this.sub.getLength()) {
                System.out.println("You hit a Submarine! ");
                destroyShip(this.sub.getLength());
            }
        } else {
            System.out.println("Invalid coordinates try again!");
        }

    }

    public void setOpponent(Player opponent) {
        this.opponent = opponent;
    }

    public Boat getBoat() {
        return boat;
    }

    public OceanLiner getLiner() {
        return liner;
    }

    public Submarine getSub() {
        return sub;
    }
}
