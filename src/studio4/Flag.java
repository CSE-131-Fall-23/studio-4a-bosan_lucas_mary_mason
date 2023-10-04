package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		// irish flag
		//JFileChooser chooser = new JFileChooser("resources");
		//chooser.showOpenDialog(null);
		//File f = new File(chooser.getSelectedFile().getPath());
		//Scanner in = new Scanner(f); //making Scanner with a File
		
		Color gold= new Color(89, 203, 8);
		StdDraw.setPenColor(gold);
		StdDraw.filledRectangle(0, 1, 0.3, 1);
		
		Color orange= new Color(246, 167, 51);
		StdDraw.setPenColor(orange);
		StdDraw.filledRectangle(1, 1, 0.3, 1);

	}
}