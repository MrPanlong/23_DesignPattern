package StructurePattern.adaptorpattern.adapter;

/**
 * @ author PanLong
 * @ since  2021-07-04 12:43
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing mp4 filename:"+fileName);
    }
}
