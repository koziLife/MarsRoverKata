public class NasaLauncher {


    private MarsRover rover;
    private String instruction;

    public NasaLauncher(String command) {
        createRover(command);
    }

    private void createRover(String command) {
        String[] lines = command.split("\n");

        Grid grid = createGrid(lines[0]);
        Position position = createPosition(lines[1]);
        setInstruction(lines[2]);

        rover = new MarsRover(grid, position);
    }

    private Position createPosition(String positionCommand) {
        String[] parts = positionCommand.split(" ");
        int x = new Integer(parts[0]);
        int y =  new Integer(parts[1]);
        String direction = parts[2];
        return new Position(x, y, direction);
    }

    private Grid createGrid(String line) {
        int x = new Integer(line.split(" ")[0]);
        int y = new Integer(line.split(" ")[1]);
        return new Grid(x, y);
    }

    public String launch() {
        return rover.run(getInstruction());
    }

    private String getInstruction() {
        return instruction;
    }

    private void setInstruction(String instruction) {
        this.instruction = instruction;
    }

}
