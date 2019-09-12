
public class App {
	public static void main (String [] Args)
	{
		
		MarsRover rover = new MarsRover();
		
		rover.setPosicao(1, 2, 'n');
		
		rover.moveRover("LMLMLMLMM");
		
		MarsRover rover2 = new MarsRover();
		
		rover2.setPosicao(3, 3, 'e');
		
		rover2.moveRover("MMRMMRMRRM");
		
		System.out.println(rover.toString());
		System.out.println(rover2.toString());
	}
}
