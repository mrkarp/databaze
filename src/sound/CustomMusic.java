package sound;

import java.io.IOException;

import org.newdawn.slick.openal.Audio;
import org.newdawn.slick.openal.AudioLoader;
import org.newdawn.slick.util.ResourceLoader;

public class CustomMusic {
	
	public static Audio menuMusic;
	public static Audio karpCodeLogo;

	
	public static void init() {
		try {
			menuMusic = AudioLoader.getAudio("WAV", ResourceLoader.getResourceAsStream("res/menuMusic.wav"));
			karpCodeLogo = AudioLoader.getAudio("OGG", ResourceLoader.getResourceAsStream("res/karpcode.ogg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
