package com.example.cinema.bl.management;

import com.example.cinema.vo.RefundForm;
import com.example.cinema.vo.ResponseVO;

/**
 * Created by AzureXH on 2019/6/8
 */
public interface RefundService {
    ResponseVO addRefundStrategy(RefundForm refundForm);
}
