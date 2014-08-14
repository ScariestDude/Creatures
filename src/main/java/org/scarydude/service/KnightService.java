package org.scarydude.service;

import org.scarydude.model.Knight;

import java.util.List;

public interface KnightService {
    Knight save(Knight dragon);
    List<Knight> getAll();
    Knight getOne(Integer id);
    Knight delete(Integer id);
}
