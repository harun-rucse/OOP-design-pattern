package adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "Let me down slowly");
        audioPlayer.play("mp4", "Stay with me");
        audioPlayer.play("vlc", "Loser");
        audioPlayer.play("mkv", "Toxic");
    }
}
