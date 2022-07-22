package com.zerobase.convpay.dto; //dto 패키지는 외부와의 통신에 관련된 패키지

import com.zerobase.convpay.type.PayResult;

public class PayResponse {
    // 결제 결과
    PayResult payResult;

    // 결제 성공 금액
    Integer paidAmount;

    @Override
    public String toString() {
        return "PayResponse{" +
                "payResult=" + payResult +
                ", paidAmount=" + paidAmount +
                '}';
    }

    public PayResponse(PayResult payResult, Integer paidAmount) {
        this.payResult = payResult;
        this.paidAmount = paidAmount;
    }

    public PayResult getPayResult() {
        return payResult;
    }

    public void setPayResult(PayResult payResult) {
        this.payResult = payResult;
    }

    public Integer getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(Integer paidAmount) {
        this.paidAmount = paidAmount;
    }
}
