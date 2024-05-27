package Aps;

import aps.View.MetaESGView;
import aps.Controller.MetaESGController;

public class Aps {
    public static void main(String[] args) {
        MetaESGView view = new MetaESGView();
        
        MetaESGController controller = new MetaESGController(view);
        
        view.setVisible(true);
    }
}
