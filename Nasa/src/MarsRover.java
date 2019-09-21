
public class MarsRover {
	private int posX;
	private int posY;
	private char virado;

	public MarsRover() {
		this.posX = 0;
		this.posY = 0;
		this.virado = 'n';
	}

	public void setPosicao(int x, int y, char z) {
		this.posX = x;
		this.posY = y;
		this.virado = z;
	}

	public void moveRover(String x) {
		for (int i = 0; i < x.length(); ++i) {
			this.moveRover(Character.toLowerCase(x.charAt(i)));// desmembrando a string para gerar um char e colocando em caixa baixa
		}
	}

	public void moveRover(char x) {
		
		if(x == 'l')
		{
			viraRoverL();
		}
		if(x == 'r')
		{
			viraRoverR();
		}
		if(x == 'm')
		{
			moveRoverM();
		}
	}

	public void moveRoverM()
	{
		if(virado == 'n')
		{
			posY ++;
		}
		if(virado == 'e')
		{
			posX ++;
		}
		if(virado == 's')
		{
			if(posY == 0 )
			{
				throw new IllegalArgumentException("Limite do terreno alcançado");
			}
			else
			{
				posY --;
			}
		}
		if(virado == 'w')
		{
			if(posX == 0 )
			{
				throw new IllegalArgumentException("Limite do terreno alcançado");
			}
			else
			{
				posX --;
			}
		}
	}
	
	public void viraRoverL()
	{
		switch(virado)
		{
		case 'n':
			virado = 'w';
			break;
		case 'w':
			virado = 's';
			break;
		case 's':
			virado = 'e';
			break;
		default:
			virado = 'n';
			break;
		}
	}
	
	public void viraRoverR()
	{
		switch(virado)
		{
		case 'n':
			virado = 'e';
			break;
		case 'e':
			virado = 's';
			break;
		case 's':
			virado = 'w';
			break;
		default:
			virado = 'n';
			break;
		}
	}
	
	public String posicaoRover() {
		final String aux = this.posX + " " + this.posY + " " + this.virado;
		return aux;
	}
}
