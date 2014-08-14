package org.scarydude.repository;

import org.scarydude.model.Knight;

import java.util.List;

public interface KnightRepository {
    Knight save(Knight dragon);
    List<Knight> getAll();
    Knight getOne(Integer id);
    Knight delete(Integer id);
}
