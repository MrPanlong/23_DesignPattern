package StructurePattern.adaptorpattern.adapter;

/**
 * @ author PanLong
 * @ since  2021-07-04 12:44
 */
public class MediaAdaper implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdaper(String audioType) {
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer = new VlcPlayer();
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
