package org.scarydude.container;

import org.scarydude.model.Dragon;
import org.scarydude.model.Knight;
import org.scarydude.model.Wizard;

import java.util.HashMap;
import java.util.Map;

public class CreatureContainer {
    protected static Map<Integer, Dragon> dragonsMap = new HashMap<Integer, Dragon>();
    protected static Map<Integer, Knight> knightMap = new HashMap<Integer, Knight>();
    protected static Map<Integer, Wizard> wizardMap = new HashMap<Integer, Wizard>();
}
