package org.scarydude.service;

import org.scarydude.model.Wizard;

import java.util.List;

public interface WizardService {
    Wizard save(Wizard dragon);
    List<Wizard> getAll();
    Wizard getOne(Integer id);
    Wizard delete(Integer id);
}
