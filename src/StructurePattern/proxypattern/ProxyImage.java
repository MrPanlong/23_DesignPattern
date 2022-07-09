package StructurePattern.proxypattern;

import java.net.Proxy;

/**
 * @ author PanLong
 * @ since  2021-07-04 19:05
 */
public class ProxyImage implements Image{
    private RealImage realImage;
    private String filename;
    public ProxyImage(String filename){
        this.filename = filename;
    }
    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
