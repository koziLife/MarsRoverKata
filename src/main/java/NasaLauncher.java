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

    private Position createPosition(String line) {
        return new Position(new Integer(line.split(" ")[0]),
                    new Integer(line.split(" ")[1]),
                    line.split(" ")[2]);
    }

    private Grid createGrid(String line) {
        return new Grid(new Integer(line.split(" ")[0]),
                    new Integer(line.split(" ")[1]));
    }

    public String launch() {
        return rover.run(getInstruction());
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
