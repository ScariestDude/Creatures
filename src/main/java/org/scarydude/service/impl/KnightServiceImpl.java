package org.scarydude.service.impl;

import org.scarydude.model.Knight;
import org.scarydude.repository.KnightRepository;
import org.scarydude.repository.impl.KnightRepositoryImpl;
import org.scarydude.service.KnightService;

import java.util.List;

public class KnightServiceImpl implements KnightService {
    KnightRepository knightRepository = new KnightRepositoryImpl();

    @Override
    public Knight save(Knight dragon) {
        return knightRepository.save(dragon);
    }

    @Override
    public List<Knight> getAll() {
        return knightRepository.getAll();
    }

    @Override
    public Knight getOne(Integer id) {
        return knightRepository.getOne(id);
    }

    @Override
    public Knight delete(Integer id) {
        return knightRepository.delete(id);
    }
}
