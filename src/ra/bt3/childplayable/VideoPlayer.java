package ra.bt3.childplayable;

import ra.bt3.playable.Playable;

public class VideoPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Đang phát Video ....");
    }
}
