import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MarsRoverTest {
	
	@Test
	public void testeToString() {
		MarsRover rover = new MarsRover();
		rover.setPosicao(1, 2, 'n');
		Assert.assertEquals("1 2 n", rover.posicaoRover());
	}
	
	@Test
	public void testMoveRoverChar() {
		MarsRover rover = new MarsRover();
		rover.setPosicao(4, 4, 'w');
		rover.moveRover('l');
		Assert.assertEquals("4 4 s", rover.posicaoRover());
	}
	
	@Test
	public void testeMoveRoverString(){
		MarsRover rover = new MarsRover();
		rover.setPosicao(4, 4, 'w');
		rover.moveRover("lll");
		Assert.assertEquals("4 4 n", rover.posicaoRover());
	}
	
	@Test
	public void testeMoveRoverStringLRM() {
		MarsRover rover = new MarsRover();
		rover.setPosicao(4, 4, 'w');
		rover.moveRover("LLRM");
		Assert.assertEquals("4 3 s", rover.posicaoRover());
	}
	
	@Test
	public void testeMoveRoverM() {
		MarsRover rover = new MarsRover();
		rover.setPosicao(0, 0, 'n');
		rover.moveRover("mrmrmrm");
		Assert.assertEquals("0 0 w", rover.posicaoRover());
	}
	
	@Test
	public void testeViraRoverL() {
		MarsRover rover = new MarsRover();
		rover.setPosicao(0, 0, 'n');
		rover.moveRover("llll");
		Assert.assertEquals("0 0 n", rover.posicaoRover());
	}
	
	@Test
	public void testeViraRoverR() {
		MarsRover rover = new MarsRover();
		rover.setPosicao(0, 0, 'n');
		rover.moveRover("rrrr");
		Assert.assertEquals("0 0 n", rover.posicaoRover());
	}
	
	@Test
	public void testeMoveRoverMExcS()
	{
		MarsRover rover = new MarsRover();
		rover.setPosicao(0, 0, 's');
		assertThrows(IllegalArgumentException.class, () ->  rover.moveRover("m"));
	}
	
	@Test
	public void testeMoveRoverMExcW()
	{
		MarsRover rover = new MarsRover();
		rover.setPosicao(0, 0, 'w');
		assertThrows(IllegalArgumentException.class, () ->  rover.moveRover("m"));
	}
}
teste
