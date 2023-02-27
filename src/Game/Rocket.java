package Game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Rocket {

    int x, y, dx, dy;
    ImageView ivRocket;

    Rocket() {
        x = 400;
        y = 400;
        dx = 10;
        dy = 10;
        Image imgRocket = new Image(getClass().getResourceAsStream("/Game/rocket.png"));
        ivRocket = new ImageView(imgRocket);
        ivRocket.setLayoutX(x);
        ivRocket.setLayoutY(y);
    }

    public ImageView getImageView() {
        return ivRocket;
    }

    void moveLeft() {
        if (x > 50) {
            x = x - dx;
            ivRocket.setLayoutX(x);
        }
    }

    void moveRight() {
        if (x < 700) {
            x = x + dx;
            ivRocket.setLayoutX(x);
        }
    }
}
