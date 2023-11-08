// Media player is the Interface define main functionality
interface MediaPlay{
    public void play(String playMode);
}

// Television play only HDMI input format
class Television {
    public void play() {
        System.out.println("Play video in Television with HDMI input.");
    }
}

// Laptop play itself or play in TV through the Adapter
class Laptop implements MediaPlay{
    AvToHDMIAdapter avToHDMIAdapter;
    @Override
    public void play(String playMode) {
        if (playMode.equals("Laptop")) {
            System.out.println("Play video in the Laptop.");
        }
        // Need to use the HDMI adapter to play and convert Av to HDMI
        else if (playMode.equals("TV")) {
            avToHDMIAdapter= new AvToHDMIAdapter();
            avToHDMIAdapter.play("TV");
        }
    }
}

// Adapter play and convert video to HDMI
class AvToHDMIAdapter implements MediaPlay{
    private Television television;
    public AvToHDMIAdapter() {
        television= new Television();
    }
    public void play(String playMode) {
        // Adapter play video in TV
        if(playMode.equals("TV")){
            television.play();
        }

    }
}

public class AdapterClient {
    public static void main(String[] args) {
        MediaPlay mediaPlay=new Laptop();
        // Play only in Laptop
        mediaPlay.play("Laptop");
        // Play with TV
        mediaPlay.play("TV");
    }
}