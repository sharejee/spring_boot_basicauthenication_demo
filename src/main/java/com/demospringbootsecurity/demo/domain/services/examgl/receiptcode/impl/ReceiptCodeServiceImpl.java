package com.demospringbootsecurity.demo.domain.services.examgl.receiptcode.impl;

import com.demospringbootsecurity.demo.domain.models.examgl.Area;
import com.demospringbootsecurity.demo.domain.models.examgl.ReceiptCode;
import com.demospringbootsecurity.demo.domain.repositories.examgl.ReceiptCodeRepository;
import com.demospringbootsecurity.demo.domain.services.examgl.area.AreaService;
import com.demospringbootsecurity.demo.domain.services.examgl.receiptcode.ReceiptCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
Create By: Ron Rith
Create Date: 2/27/2018
*/
@Service
public class ReceiptCodeServiceImpl implements ReceiptCodeService{
    @Autowired
    private ReceiptCodeRepository receiptCodeRepository;

    @Autowired
    private AreaService areaService;

    @Override
    public List<ReceiptCode> getAllReceiptCodes() {
        List<ReceiptCode> receiptCodes =  (List<ReceiptCode>) receiptCodeRepository.findAll();
        Area area = getAAreaObject();
        if (receiptCodes == null || receiptCodes.size() < 3) {
            for (int i = 0; i < 3; i++) {
                ReceiptCode receiptCode = new ReceiptCode();
                receiptCode.setArea(area);
                receiptCode.setCode("ReceiptCode - " + i);
                receiptCode.setDes("ReceiptCode Des - " + i);
                receiptCodeRepository.save(receiptCode);
            }
        }
        return receiptCodes;
    }

    @Override
    public ReceiptCode getById(Long id) {
        return (ReceiptCode) receiptCodeRepository.findOne(id);
    }

    @Override
    public void createReceiptCode(ReceiptCode receiptCode) {
        receiptCodeRepository.save(receiptCode);
    }

    @Override
    public void updateReceiptCode(ReceiptCode receiptCode, Long id) {
        if (id != null) {
            receiptCode.setId(id);
            receiptCodeRepository.save(receiptCode);
        }
    }

    @Override
    public void deleteReceiptCode(Long id) {
        receiptCodeRepository.delete(id);
    }

    private Area getAAreaObject() {
        List<Area> areas = areaService.getAllArea();
        Area area = new Area();
        if (areas == null || areas.size()<=0) {
            area.setAreaDec("Area Des1");
            area.setAreaName("Area Name");
            areaService.saveArea(area);
            return area;
        } else {
            if (areas.get(0) != null) {
                area.setId(areas.get(0).getId());
            }
            return area;
        }
    }
}
