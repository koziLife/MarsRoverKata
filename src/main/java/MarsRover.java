public class MarsRover {

    private Grid grid;
    private Position position;

    public MarsRover(Grid grid, Position position) {
        this.grid = grid;
        this.position = position;
    }

    public String run(String s) {
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                turnRight();
            }else if(c == 'L'){
                turnLeft();
            }else if(c == 'M'){
                move();
            }
        }
        return position.toString();
    }

    private void move() {
        switch (position.getDirection()){
            case "N":
                position.setY(Math.min(position.getY() + 1, grid.getMaxY()));
                break;
            case "S":
                position.setY(Math.max(position.getY() - 1, grid.getMinY()));
                break;
            case "E":
                position.setX(Math.min(position.getX() + 1, grid.getMaxX()));
                break;
            case "W":
                position.setX(Math.max(position.getX() - 1, grid.getMinX()));
                break;
        }
    }

    private void turnLeft() {
        switch (position.getDirection()){
            case "N":
                position.setDirection("W");
                break;
            case "W":
                position.setDirection("S");
                break;
            case "S":
                position.setDirection("E");
                break;
            case "E":
                position.setDirection("N");
                break;
        }
    }

    private void turnRight() {
        switch (position.getDirection()){
            case "N":
                position.setDirection("E");
                break;
            case "E":
                position.setDirection("S");
                break;
            case "S":
                position.setDirection("W");
                break;
            case "W":
                position.setDirection("N");
                break;
        }
    }
}
