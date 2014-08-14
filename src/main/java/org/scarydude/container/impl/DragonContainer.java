package org.scarydude.container.impl;

import org.scarydude.container.CreatureContainer;
import org.scarydude.model.Dragon;

import java.util.Map;

public class DragonContainer extends CreatureContainer {

    public Map<Integer, Dragon> getDragonsMap(){
        return dragonsMap;
    }
}
