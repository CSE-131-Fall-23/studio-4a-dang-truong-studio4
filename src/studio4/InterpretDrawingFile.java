package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape= in.next();
		int red= in.nextInt();
		int green= in.nextInt();
		int blue= in.nextInt();
		boolean filled= in.nextBoolean();
		double p1= in.nextDouble();
		double p2 = in.nextDouble();
		double p3= in.nextDouble();
		double p4= in.nextDouble();
		
	if (shape.equals("rectangle"))
	{
		if (filled== true)
			{
			StdDraw.setPenColor(red, green, blue);
			StdDraw.filledRectangle(p1, p2, p3, p4);
			}
			
			
		else
		{
			StdDraw.setPenColor(red, green, blue);
			StdDraw.rectangle(p1, p2, p3, p4);
			
		}
	}
	else if (shape.equals("ellipse"))
	{
		if (filled== true)
		{
		StdDraw.setPenColor(red, green, blue);
		StdDraw.filledEllipse(p1, p2, p3, p4);
		}
		
		
	else
	{
		StdDraw.setPenColor(red, green, blue);
		StdDraw.ellipse(p1, p2, p3, p4);
		
	}
	}
	else
	{
		if (filled== true)
		{
		double p5= in.nextDouble();
		double p6=in.nextDouble();
		StdDraw.setPenColor(red, green, blue);
		double [] x = {p1, p3, p5};
		double [] y = {p2, p4, p6};
		StdDraw.filledPolygon(x, y);
		
		}
		
		
	else
	{
		double p5= in.nextDouble();
		double p6=in.nextDouble();
		StdDraw.setPenColor(red, green, blue);
		StdDraw.line(p1, p2, p3, p4);
		StdDraw.line(p3, p4, p5, p6);
		StdDraw.line(p5, p6, p1, p2);
	}
	}
	}
	}
	

