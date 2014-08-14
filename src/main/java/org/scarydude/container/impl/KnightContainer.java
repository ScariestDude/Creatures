package org.scarydude.container.impl;

import org.scarydude.container.CreatureContainer;
import org.scarydude.model.Knight;

import java.util.Map;

public class KnightContainer extends CreatureContainer {
    public Map<Integer, Knight> getKnightMap(){
        return knightMap;
    }
}
