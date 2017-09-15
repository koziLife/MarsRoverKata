public class MarsRover {

    private Position position = new Position(0, 0, "N");
    private final static int MAX_X = 5;
    private final static int MAX_Y = 5;

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
            position.setY(Math.min(position.getY() + 1, MAX_Y));
        if(position.getDirection().equals("S"))
            position.setY(Math.max(position.getY() - 1, 0));
        if(position.getDirection().equals("E"))
            position.setX(Math.min(position.getX() + 1, MAX_X));
        if(position.getDirection().equals("W"))
            position.setX(Math.max(position.getX() - 1, 0));

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
