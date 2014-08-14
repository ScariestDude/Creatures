package org.scarydude.repository.impl;

import org.scarydude.container.impl.KnightContainer;
import org.scarydude.model.Knight;
import org.scarydude.repository.KnightRepository;

import java.util.ArrayList;
import java.util.List;

public class KnightRepositoryImpl implements KnightRepository {
   KnightContainer knightContainer = new KnightContainer();


    @Override
    public Knight save(Knight knight) {
        knightContainer.getKnightMap().put(knight.getId(), knight);
        System.out.println(knight.getName() + " was saved");
        return knight;
    }

    @Override
    public List<Knight> getAll() {
        List<Knight> knightList = new ArrayList<Knight>(knightContainer.getKnightMap().values());
        System.out.println("You get all dragons");
        return knightList;
    }

    @Override
    public Knight getOne(Integer id) {
        System.out.println("Your choose " + knightContainer.getKnightMap().get(id).getName());
        return knightContainer.getKnightMap().get(id);
    }

    @Override
    public Knight delete(Integer id) {
        System.out.println(knightContainer.getKnightMap().get(id) + " was deleted");
        knightContainer.getKnightMap().remove(id);
        return null;
    }
}
