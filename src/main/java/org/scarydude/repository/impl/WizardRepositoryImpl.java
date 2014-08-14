package org.scarydude.repository.impl;

import org.scarydude.container.impl.WizardContainer;
import org.scarydude.model.Wizard;
import org.scarydude.repository.WizardRepository;

import java.util.ArrayList;
import java.util.List;

public class WizardRepositoryImpl implements WizardRepository {
    WizardContainer wizardContainer = new WizardContainer();


    @Override
    public Wizard save(Wizard wizard) {
        wizardContainer.getWizardMap().put(wizard.getId(), wizard);
        System.out.println(wizard.getName() + " was saved");
        return wizard;
    }

    @Override
    public List<Wizard> getAll() {
        List<Wizard> wizardList = new ArrayList<Wizard>(wizardContainer.getWizardMap().values());
        System.out.println("You get all dragons");
        return wizardList;
    }

    @Override
    public Wizard getOne(Integer id) {
        System.out.println("Your choose " + wizardContainer.getWizardMap().get(id).getName());
        return wizardContainer.getWizardMap().get(id);
    }

    @Override
    public Wizard delete(Integer id) {
        System.out.println(wizardContainer.getWizardMap().get(id) + " was deleted");
        wizardContainer.getWizardMap().remove(id);
        return null;
    }
}
