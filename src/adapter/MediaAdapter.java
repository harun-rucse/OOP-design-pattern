package adapter;

public class MediaAdapter implements MediaPlayer{
    AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String audioType) {
        if(audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer = new Mp4Player();
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp4")) {
            advanceMediaPlayer.playMp4(filename);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            advanceMediaPlayer.playVlc(filename);
        }
    }
}
