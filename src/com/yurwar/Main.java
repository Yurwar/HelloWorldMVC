package com.yurwar;

import com.yurwar.controller.Controller;
import com.yurwar.model.Model;
import com.yurwar.view.View;

public class Main {

    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        controller.processUser();
    }
}
