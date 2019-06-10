package com.example.cinema.controller.management;

import com.example.cinema.bl.management.RefundService;
import com.example.cinema.vo.RefundForm;
import com.example.cinema.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AzureXH on 2019/6/8
 */
@RestController
public class RefundController {
    @Autowired
    private RefundService refundService;
    @RequestMapping(value="/refund/add",method = RequestMethod.POST)
    public ResponseVO addRefundStrategy(@RequestBody RefundForm refundForm){
        System.out.println(refundForm);
        return refundService.addRefundStrategy(refundForm);
    }
}
