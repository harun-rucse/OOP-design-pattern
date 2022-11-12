package adapter;

public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String filename) {

    }

    @Override
    public void playMp4(String filename) {
        System.out.println("Playing mp4 file. Name: " + filename);
    }
}
