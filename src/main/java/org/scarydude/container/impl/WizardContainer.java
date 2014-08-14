package org.scarydude.container.impl;

import org.scarydude.container.CreatureContainer;
import org.scarydude.model.Wizard;

import java.util.Map;

public class WizardContainer extends CreatureContainer {
    public Map<Integer, Wizard> getWizardMap(){
        return wizardMap;
    }
}