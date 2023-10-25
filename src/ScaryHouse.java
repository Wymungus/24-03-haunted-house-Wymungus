//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class ScaryHouse extends Canvas
{
   public ScaryHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call theHouse
   }

   public void theHouse( Graphics window )
   {
      window.setColor(Color.ORANGE);

      window.drawString( "HAPPY HALLOWEEN!!", 50, 50 );

      window.setColor(Color.ORANGE);

      window.fillRect( 200, 200, 400, 400 );

   }
}