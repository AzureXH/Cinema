package com.example.cinema.blImpl.management.refund;

import com.example.cinema.bl.management.RefundService;
import com.example.cinema.data.management.RefundMapper;
import com.example.cinema.po.RefundStrategy;
import com.example.cinema.vo.RefundForm;
import com.example.cinema.vo.ResponseVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AzureXH on 2019/6/8
 */
@Service
public class RefundServiceImpl implements RefundService {
    @Autowired
    private RefundMapper refundMapper;
    @Override
    public ResponseVO addRefundStrategy(RefundForm refundForm) {
        List<RefundStrategy> refundStrategies = new RefundStrategy().convert2List(refundForm);
        System.out.println("准备插入");
        refundMapper.insertRefundStrategy(refundStrategies);
        return ResponseVO.buildSuccess();
    }
}
