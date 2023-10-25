//Name -
//Date -

import javax.swing.JFrame;

public class GraphicsRunner extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public GraphicsRunner()
	{
		super("Fun House");

		setSize(WIDTH,HEIGHT);

		getContentPane().add(new ScaryHouse());
		
		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main( String[] args )
	{
		GraphicsRunner run = new GraphicsRunner();
	}
}