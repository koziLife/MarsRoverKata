A robotic rover is to be landed by NASA on a plateau on Mars.
This plateau, which is curiously rectangular, must be navigated by the rover so that its on board cameras can get a complete view of the surrounding terrain to send back to Earth.
A rover's position is represented by a combination of an x and y co-ordinates and a letter representing one of the four cardinal compass points. The plateau is divided up into a grid to simplify navigation. An example position might be 0, 0, N, which means the rover is in the bottom left corner and facing North.
In order to control the rover, NASA sends a simple string of letters. The possible letters are 'L', 'R' and 'M'. 'L' and 'R' makes the rover spin 90 degrees left or right respectively, without moving from its current spot.
'M' means move forward one grid point, and maintains the same heading.
Assume that the square directly North from (x, y) is (x, y+1).
Input:
The first line of input is the upper-right coordinates of the plateau, the lower-left coordinates are assumed to be 0,0.
The rest of the input is information pertaining to the rover that have been deployed. The rover has two lines of input. The first line gives the rover's position, and the second line is a series of instructions.
Example input:
Test Input:
“5 5\n1 2 N\nLMLMLMLMM” Expected Output:
“1 3 N”
You cannot change the input, from a single string to anything else, this is representing a single radio message sent from earth to the rover in Mars.