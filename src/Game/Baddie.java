package Game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Baddie 
{
    int dx,dy;
    ImageView ivBaddie;
    
    Baddie()
    {
        int dx = 10;
        int dy = 10;
        Image imgBaddie = new Image (getClass().getResourceAsStream("Baddie.png"));
        ivBaddie = new ImageView (imgBaddie);
        ivBaddie.setLayoutX(dx);
        ivBaddie.setLayoutY(dy);
    }
    
     public ImageView getImageView()
    {
        return ivBaddie;
    }
}
