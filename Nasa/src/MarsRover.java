
public class MarsRover {
	private final int n = 1;
	private final int e = 2;
	private final int s = 3;
	private final int w = 4;
	private int posX;
	private int posY;
	private char virado;

	public MarsRover() {
		this.posX = 0;
		this.posY = 0;
		this.virado = 'n';
	}

	public void setPosicao(final int x, final int y, final char z) {
		this.posX = x;
		this.posY = y;
		this.virado = z;
	}

	public void moveRover(final String x) {
		for (int i = 0; i < x.length(); ++i) {
			this.moveRover(x.charAt(i));
		}
	}

	public void moveRover(final char x) {
	}

	public String mostraPosicaoRover() {
		final String aux = "X: " + this.posX + " Y: " + this.posY + " Virado para o " + this.virado;
		return aux;
	}

}
