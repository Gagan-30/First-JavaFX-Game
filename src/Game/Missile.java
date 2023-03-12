package Game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Missile 
{
    public boolean STILL_FIRING;
    int x, y, dx , dy;
    ImageView ivView;
    
    Missile()
    {
        STILL_FIRING = false;
        dy = 10;
        y = 400;
        Image imgMissile = new Image (getClass().getResourceAsStream("missile.png"));
        ivView = new ImageView (imgMissile);
        ivView.setLayoutY(y);
    }
    
    public ImageView getImageView()
    {
        return ivView;
    }
    
    public void move()
    {
        y = y - dy;
        ivView.setLayoutY(y);
        if(y < 0)
        {
            STILL_FIRING = false;
        }
    }
    
    public void fire(int rocketX)
    {
        x = rocketX;
        ivView.setLayoutX(x);
        STILL_FIRING = true;
    }
    
}
