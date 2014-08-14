package org.scarydude.repository;

import org.scarydude.model.Wizard;

import java.util.List;

public interface WizardRepository {
    Wizard save(Wizard dragon);
    List<Wizard> getAll();
    Wizard getOne(Integer id);
    Wizard delete(Integer id);
}
