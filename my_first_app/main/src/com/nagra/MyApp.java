package com.nagra;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
//import org.alcibiade.asciiart.*;
import org.alcibiade.asciiart.coord.TextBoxSize;
import org.alcibiade.asciiart.image.rasterize.ShapeRasterizer;
import org.alcibiade.asciiart.raster.ExtensibleCharacterRaster;
import org.alcibiade.asciiart.raster.Raster;
import org.alcibiade.asciiart.raster.RasterContext;
import org.alcibiade.asciiart.widget.PictureWidget;
import org.alcibiade.asciiart.widget.TextWidget;

import javax.imageio.ImageIO;
//import org.alcibiade.asciiart.imageio.AsciiArtImageWriter;

public class MyApp{
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world! This is Faizan!!");
        File image = new File("67252756.jpg");
        BufferedImage circleImage = ImageIO.read(image);

        TextWidget widget = new PictureWidget(new TextBoxSize(80, 30),
                circleImage, new ShapeRasterizer());
        Raster raster = new ExtensibleCharacterRaster();

        widget.render(new RasterContext(raster));
        System.out.println(raster);



    }
}