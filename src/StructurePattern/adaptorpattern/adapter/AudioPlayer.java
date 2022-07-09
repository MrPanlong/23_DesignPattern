package StructurePattern.adaptorpattern.adapter;

/**
 * @ author PanLong
 * @ since  2021-07-04 12:49
 */
public class AudioPlayer implements MediaPlayer{
    private MediaAdaper mediaAdaper;
    @Override
    public void play(String audioType, String fileName) {
        //播放 MP3 音乐文件内置支持
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 filename"+fileName);
        }
        //mediaAdaper 提供了播放其他格式文件格式的支持
        else if(audioType.equalsIgnoreCase("vlc")
    || audioType.equalsIgnoreCase("mp4")){
            mediaAdaper = new MediaAdaper(audioType);
            mediaAdaper.play(audioType, fileName);
        }else {
            System.out.println("Invalid media "+audioType+"format not supported");
        }
    }
}
