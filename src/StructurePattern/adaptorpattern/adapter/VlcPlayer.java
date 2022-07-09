package StructurePattern.adaptorpattern.adapter;

/**
 * @ author PanLong
 * @ since  2021-07-04 12:42
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc filename:"+fileName);
    }

    @Override
    public void playMp4(String fileName) {
    }
}
