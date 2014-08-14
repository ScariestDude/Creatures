package org.scarydude.repository.impl;

import org.scarydude.container.impl.DragonContainer;
import org.scarydude.model.Dragon;
import org.scarydude.repository.DragonRepository;

import java.util.ArrayList;
import java.util.List;

public class DragonRepositoryImpl implements DragonRepository {
    DragonContainer dragonContainer = new DragonContainer();


    @Override
    public Dragon save(Dragon dragon) {
        dragonContainer.getDragonsMap().put(dragon.getId(), dragon);
        System.out.println(dragon.getName() + " was saved");
        return dragon;
    }

    @Override
    public List<Dragon> getAll() {
        List<Dragon> dragonList = new ArrayList<Dragon>(dragonContainer.getDragonsMap().values());
        System.out.println("You get all dragons");
        return dragonList;
    }

    @Override
    public Dragon getOne(Integer id) {
        System.out.println("Your choose " + dragonContainer.getDragonsMap().get(id).getName());
        return dragonContainer.getDragonsMap().get(id);
    }

    @Override
    public Dragon delete(Integer id) {
        System.out.println(dragonContainer.getDragonsMap().get(id) + " was deleted");
        dragonContainer.getDragonsMap().remove(id);
        return null;
    }
}
