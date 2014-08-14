package org.scarydude.web;

import org.scarydude.model.Dragon;
import org.scarydude.model.Knight;
import org.scarydude.model.Wizard;
import org.scarydude.service.DragonService;
import org.scarydude.service.KnightService;
import org.scarydude.service.WizardService;
import org.scarydude.service.impl.DragonServiceImpl;
import org.scarydude.service.impl.KnightServiceImpl;
import org.scarydude.service.impl.WizardServiceImpl;

import java.awt.*;
import java.util.List;

public class RootController {

    public static void main(String[] args) {

        DragonService dragonService = new DragonServiceImpl();
        KnightService knightService = new KnightServiceImpl();
        WizardService wizardService = new WizardServiceImpl();


        Dragon agronom = new Dragon(1, "Agronom", 100, 2000, Color.black, 3);
        Dragon matumba = new Dragon(2, "Matumba", 12022, 53110, Color.blue, 111);
        Dragon pixie = new Dragon(3, "Pixie", 1, 2, Color.white, 2);
        Dragon homer = new Dragon(4, "Homer", 12, 200, Color.yellow, 1);

        Knight ronal = new Knight(1, "Ronal", 19, 1.21f, 3, 1);
        Knight artur = new Knight(2, "Artur", 23, 2.02f, 8, 2);

        Wizard gandalf = new Wizard(1, "Mithrandir", 2000, 1.94, 23);

        wizardService.save(gandalf);

        knightService.save(ronal);
        knightService.save(artur);

        dragonService.save(agronom);
        dragonService.save(matumba);
        dragonService.save(pixie);
        dragonService.save(homer);


        dragonService.getAll();

        dragonService.getOne(3);

        dragonService.delete(2);
        List<Dragon> list = dragonService.getAll();
        System.out.println(list.get(0).getName());





    }


}
