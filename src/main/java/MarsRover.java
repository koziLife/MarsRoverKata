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
        if(position.getDirection().equals("N"))
            position.setY(Math.min(position.getY() + 1, grid.getMaxY()));
        if(position.getDirection().equals("S"))
            position.setY(Math.max(position.getY() - 1, grid.getMinY()));
        if(position.getDirection().equals("E"))
            position.setX(Math.min(position.getX() + 1, grid.getMaxX()));
        if(position.getDirection().equals("W"))
            position.setX(Math.max(position.getX() - 1, grid.getMinX()));

    }

    private void turnLeft() {
        if (position.getDirection().equals("N"))
            position.setDirection("W");
        else if (position.getDirection().equals("W"))
            position.setDirection("S");
        else if (position.getDirection().equals("S"))
            position.setDirection("E");
        else if (position.getDirection().equals("E"))
            position.setDirection("N");
    }

    private void turnRight() {
        if (position.getDirection().equals("N")) {
            position.setDirection("E");
        }
        else if (position.getDirection().equals("E")){
            position.setDirection("S");
        }
        else if (position.getDirection().equals("S")) {
            position.setDirection("W");
        }
        else if (position.getDirection().equals("W")) {
            position.setDirection("N");
        }
    }
}
