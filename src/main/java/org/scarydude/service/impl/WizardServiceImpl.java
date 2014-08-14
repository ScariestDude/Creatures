package org.scarydude.service.impl;

import org.scarydude.model.Wizard;
import org.scarydude.repository.WizardRepository;
import org.scarydude.repository.impl.WizardRepositoryImpl;
import org.scarydude.service.WizardService;

import java.util.List;

public class WizardServiceImpl implements WizardService {
    WizardRepository wizardRepository = new WizardRepositoryImpl();

    @Override
    public Wizard save(Wizard dragon) {
        return wizardRepository.save(dragon);
    }

    @Override
    public List<Wizard> getAll() {
        return wizardRepository.getAll();
    }

    @Override
    public Wizard getOne(Integer id) {
        return wizardRepository.getOne(id);
    }

    @Override
    public Wizard delete(Integer id) {
        return wizardRepository.delete(id);
    }
}
