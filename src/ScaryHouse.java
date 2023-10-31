//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ScaryHouse extends JPanel {
   private int ghostX = 400;
   private int ghostDirection = 1; // 1 for right, -1 for left
   private Color backgroundColor = new Color(0, 0, 51); // Default background is dark blue
   private int moonX = 100;
   private int moonY = 100;
   private int moonSize = 40;
   private int groundY = 500;

   public ScaryHouse() {
      Timer timer = new Timer(30, new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            ghostX += 2 * ghostDirection;
            if (ghostX <= 300 || ghostX >= 500) {
               ghostDirection *= -1;
            }
            repaint();
         }
      });
      timer.start();
   }

   @Override
   protected void paintComponent(Graphics window) {
      super.paintComponent(window);

      // Draw the background
      window.setColor(backgroundColor);
      window.fillRect(0, 0, getWidth(), getHeight());

      // Draw the moon
      window.setColor(Color.WHITE);
      window.fillOval(moonX, moonY, moonSize, moonSize);

      // Draw the ground
      window.setColor(new Color(0, 102, 0)); // Dark green for the ground
      window.fillRect(0, groundY, getWidth(), getHeight() - groundY);

      // Draw the spooky and realistic haunted house
      drawHouse(window);

      // Draw the moving ghost
      window.setColor(Color.WHITE);
      window.fillOval(ghostX, 450, 40, 60);
      window.setColor(Color.BLACK);
      window.fillOval(ghostX + 15, 460, 10, 10);

      // Draw a detailed pumpkin
      drawPumpkin(window, 250, 500);
   }

   private void drawHouse(Graphics window) {
      // Draw the house structure
      window.setColor(new Color(77, 77, 77)); // Dark gray for the house
      window.fillRect(300, 300, 200, 200);

      // Draw the roof
      int[] roofX = {300, 400, 500};
      int[] roofY = {300, 200, 300};
      window.setColor(new Color(102, 102, 102)); // Gray for the roof
      window.fillPolygon(roofX, roofY, 3);

      // Draw the door
      window.setColor(new Color(139, 69, 19)); // SaddleBrown for the door
      window.fillRect(375, 420, 50, 80);

      // Draw the windows
      window.setColor(new Color(0, 0, 0)); // Black for the windows
      window.fillRect(325, 350, 50, 50);
      window.fillRect(425, 350, 50, 50);
   }

   private void drawPumpkin(Graphics window, int x, int y) {
      // Draw the pumpkin body
      window.setColor(new Color(255, 102, 0)); // Orange for the pumpkin
      window.fillOval(x - 40, y - 15, 60, 40);

      // Draw the pumpkin eyes
      window.setColor(Color.BLACK);
      window.fillOval(x - 30, y - 5, 10, 10);
      window.fillOval(x, y - 5, 10, 10);

      // Draw the pumpkin mouth
      window.fillArc(x - 25, y + 5, 30, 15, 45, 90);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> {
         JFrame frame = new JFrame("Scary House");
         ScaryHouse scaryHouse = new ScaryHouse();
         frame.add(scaryHouse);
         frame.setSize(800, 600);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
      });
   }
}














