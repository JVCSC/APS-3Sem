package Aps;

import aps.View.MetaESGView;
import aps.Controller.MetaESGController;

public class Aps {
    public static void main(String[] args) {
        // Cria a instância da View
        MetaESGView view = new MetaESGView();
        
        // Cria a instância do Controller passando a View
        MetaESGController controller = new MetaESGController(view);
        
        // Torna a View visível
        view.setVisible(true);
    }
}
