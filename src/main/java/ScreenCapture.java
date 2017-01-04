import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ScreenCapture {
    public static void main(String[] args) throws AWTException, IOException {
        Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage captured = new Robot().createScreenCapture(screenRect);
        ImageIO.write(captured, "bmp", new File("/home/ilya/Pictures/new.bmp"));
    }
}
