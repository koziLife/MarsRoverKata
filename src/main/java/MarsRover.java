public class MarsRover {

    private String direction = "N";

    public String run(String s) {
        for (char c : s.toCharArray()) {
            if (c == 'R') {
                turnRight();
            }
        }
        return direction;
    }

    public String turnRight() {
        if (direction.equals("N"))
            direction = "E";
        else if (direction.equals("E"))
            direction = "S";
        else if (direction.equals("S"))
            direction = "W";
        else if (direction.equals("W"))
            direction = "N";
        return direction;
    }
}
