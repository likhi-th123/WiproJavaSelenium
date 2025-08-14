package newpack;

public class MainInterface {
    public static void main(String[] args) {

        // AudioPlayer
        Playable audioPlayable = new AudioPlayer();
        Recordable audioRecordable = (Recordable) audioPlayable;
        audioPlayable.play();
        audioRecordable.record();
        System.out.println("-------------------------------");

        // VideoPlayer
        Playable videoPlayable = new VideoPlayer();
        Streamable videoStreamable = (Streamable) videoPlayable;
        videoPlayable.play();
        videoStreamable.stream();
        System.out.println("-------------------------------");

        // Camera
        Recordable cameraRecordable = new Camera();
        Streamable cameraStreamable = (Streamable) cameraRecordable;
        cameraRecordable.record();
        cameraStreamable.stream();
    }
}
