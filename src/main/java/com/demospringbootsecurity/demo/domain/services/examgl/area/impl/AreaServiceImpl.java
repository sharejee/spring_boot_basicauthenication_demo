package com.demospringbootsecurity.demo.domain.services.examgl.area.impl;

import com.demospringbootsecurity.demo.domain.models.examgl.Area;
import com.demospringbootsecurity.demo.domain.repositories.examgl.AreaRepository;
import com.demospringbootsecurity.demo.domain.services.examgl.area.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 2/27/2018
*/
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaRepository areaRepository;

    @Override
    public List<Area> getAllArea() {
        return (List<Area>) areaRepository.findAll();
    }

    @Override
    public void saveArea(Area area) {
        areaRepository.save(area);
    }

    @Override
    public Area getAreaBayId(Long id) {
        return (Area) areaRepository.findOne(id);
    }
}
