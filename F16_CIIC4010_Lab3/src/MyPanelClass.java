	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.Insets;
	import java.awt.Polygon;
	import javax.swing.JPanel;
	
	public class MyPanelClass extends JPanel {
	            /**
		 * 
		 */ 
		private static final long serialVersionUID = 1L;
				public void paintComponent(Graphics g) {
	                        super.paintComponent(g);
	 
	                        //Compute interior coordinates
	                        Insets myInsets = this.getInsets();
	                        int x1 = myInsets.left;
	                        int y1 = myInsets.top;
	                        int x2 = getWidth() - myInsets.right - 1;
	                        int y2 = getHeight() - myInsets.bottom - 1;
	                        int width = x2 - x1;
	                        int height = y2 - y1;
	 
	                        //Paint the background
	                        g.setColor(Color.BLACK);
	                        g.fillRect(x1, y1, width+1, height+1);
	                        //Draw a border
	                        //g.setColor(Color.YELLOW);
	                        //g.drawRect(x1, y1, width, height);
	                        //Second Border 
	                        //g.setColor(Color.BLUE);
	                        //g.drawRect(x1+5, y1+5, width-10, height-10);
	                        //White Line
	                        //g.setColor(Color.WHITE);
	                        //g.drawLine(x1, y1, x2, y2);
	                        //Black Line
	                        //g.setColor(Color.BLACK);
	                        //g.drawLine(x2, y1, x1, y2);
	                        //g.setColor(Color.BLUE);
	                        //g.fillOval((width-55)/2, (height-55)/2, 55, 55);
	                       /* Polygon p = new Polygon();
	                        p.addPoint(x1 + 5, y1 + 25);
	                        p.addPoint(x1 + 20, y1 + 10);
	                        p.addPoint(x1 + 35, y1 + 25);
	                        p.addPoint(x1 + 25, y1 + 25);
	                        p.addPoint(x1 + 25, y1 + 45);
	                        p.addPoint(x1 + 15, y1 + 45);
	                        p.addPoint(x1 + 15, y1 + 25);
	                        g.setColor(Color.YELLOW);
	                        g.fillPolygon(p);*/
	                        //Draw Rectangle
	                        Polygon p3 = new Polygon();
	                        p3.addPoint(x1+10, y1+10);
	                        p3.addPoint(x1+210, y1+10);
	                        p3.addPoint(x1+210, y1+150);
	                        p3.addPoint(x1+10, y1+150);
	                        g.setColor(Color.RED);
	                        g.fillPolygon(p3);
	                        //Rectangle White
	                        Polygon p5 = new Polygon();
	                        p5.addPoint(x1+11, y1+35);
	                        p5.addPoint(x1+209, y1+35);
	                        p5.addPoint(x1+209, y1+60);
	                        p5.addPoint(x1+11, y1+60);
	                        g.setColor(Color.WHITE);
	                        g.fillPolygon(p5);
	                        // Another  rectangle White
	                        Polygon p6 = new Polygon();
	                        p6.addPoint(x1+11, y1+120);
	                        p6.addPoint(x1+209, y1+120);
	                        p6.addPoint(x1+209, y1+90);
	                        p6.addPoint(x1+11, y1+90);
	                        g.setColor(Color.WHITE);
	                        g.fillPolygon(p6);
	                        
	                        //Draw Triangle
	                        Polygon p4 = new Polygon();
	                        p4.addPoint(x1+10, y1+10);
	                        p4.addPoint(x1+115, y1+75);
	                        p4.addPoint(x1+10, y1+150);
	                        g.setColor(Color.BLUE);
	                        g.fillPolygon(p4);
	                        
	                        Polygon p2 = new Polygon();
	                        p2.addPoint(x1 + 25, y1 + 73);
	                        p2.addPoint(x1 + 41, y1 + 73);
	                        p2.addPoint(x1 + 47, y1 + 58);
	                        p2.addPoint(x1 + 53, y1 + 73);
	                        p2.addPoint(x1 + 69, y1 + 73);
	                        p2.addPoint(x1 + 56, y1 + 83);
	                        p2.addPoint(x1 + 61, y1 + 98);
	                        p2.addPoint(x1 + 47, y1 + 88);
	                        p2.addPoint(x1 + 34, y1 + 98);
	                        p2.addPoint(x1 + 38, y1 + 83);
	                        g.setColor(Color.WHITE);
	                        g.fillPolygon(p2);
	                        
	           
	                        
	            }
				
	            
	}

	
