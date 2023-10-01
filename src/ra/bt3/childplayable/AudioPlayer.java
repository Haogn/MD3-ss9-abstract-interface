package ra.bt3.childplayable;

import ra.bt3.playable.Playable;

public class AudioPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Đang phát Audio ......");
    }
}
