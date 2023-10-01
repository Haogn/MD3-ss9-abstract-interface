package ra.bt3.run;

import ra.bt3.childplayable.AudioPlayer;
import ra.bt3.childplayable.VideoPlayer;

public class Main {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();

        audioPlayer.play();
        videoPlayer.play();
    }
}
