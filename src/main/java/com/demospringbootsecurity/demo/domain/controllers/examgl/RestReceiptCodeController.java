package com.demospringbootsecurity.demo.domain.controllers.examgl;

import com.demospringbootsecurity.demo.domain.models.examgl.ReceiptCode;
import com.demospringbootsecurity.demo.domain.services.examgl.receiptcode.ReceiptCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/*
Create By: Ron Rith
Create Date: 2/27/2018
*/
@RestController
@RequestMapping(value = "/api/receipt")
public class RestReceiptCodeController {
    @Autowired
    private ReceiptCodeService receiptCodeService;

    @RequestMapping(method = RequestMethod.GET)
    private List<ReceiptCode> getAllReceiptCode() {
        return (List<ReceiptCode>) receiptCodeService.getAllReceiptCodes();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    private ReceiptCode getById(@PathVariable("id") Long id) {
        return receiptCodeService.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    private void createReceiptCode(@RequestBody @Valid ReceiptCode receiptCode) {
        receiptCodeService.createReceiptCode(receiptCode);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    private void updateReceiptCode(@RequestBody @Valid ReceiptCode receiptCode, @PathVariable("id") Long id) {
        receiptCodeService.updateReceiptCode(receiptCode, id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    private void deleteReceiptCode(@PathVariable("id") Long id) {
        receiptCodeService.deleteReceiptCode(id);
    }
}
