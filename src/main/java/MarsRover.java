public class MarsRover {

    private Position position = new Position(0, 0, "N");

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
            position.setY(position.getY() + 1);
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
