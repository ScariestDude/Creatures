package org.scarydude.service;

import org.scarydude.model.Dragon;

import java.util.List;

public interface DragonService {
    Dragon save(Dragon dragon);
    List<Dragon> getAll();
    Dragon getOne(Integer id);
    Dragon delete(Integer id);
}
