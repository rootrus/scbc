package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingMapEntry;
import p040o.JsonReader;
import p040o.isLiteral;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface MerchantService {
    @POST("/v1/merchants/sweeptransactions")
    DebitCardResetOtpActivity<SingleDataEntity<isLiteral>> inquiryMerchantSweepTransactions(@Body ForwardingMapEntry forwardingMapEntry);

    @POST("/v1/merchants/transactions")
    DebitCardResetOtpActivity<SingleDataEntity<JsonReader.Token>> inquiryMerchantTransactions(@Body ForwardingMapEntry forwardingMapEntry);
}
