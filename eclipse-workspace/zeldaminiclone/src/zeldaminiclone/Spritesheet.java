package zeldaminiclone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
	
	public static BufferedImage spritesheet;
	
	
	
	public static BufferedImage[] player_front;
	
	public static BufferedImage tilewall;
	
	public static BufferedImage[] inimigo_front;
	
	public Spritesheet() {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		} catch (IOException e) {
			
			
			e.printStackTrace();
		}
		
		 player_front= new BufferedImage[2];
		 inimigo_front= new BufferedImage[2];
		 
		 player_front[0] = Spritesheet.getSprite(0, 11, 16, 16);
		 player_front[1] = Spritesheet.getSprite(16, 11, 16, 16);
		 
		 inimigo_front[0] = Spritesheet.getSprite(67, 94, 16, 16);
		 inimigo_front[1] = Spritesheet.getSprite(83, 94, 16, 16);
		 
		 tilewall = Spritesheet.getSprite(280, 220, 16, 16);
	}
	
	
	public static BufferedImage getSprite(int x, int y, int widht, int height) {
		return spritesheet.getSubimage(x, y, widht, height);
	}

}
