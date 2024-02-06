package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.CompoundOrdering;
import p040o.DebitCardResetOtpActivity;
import p040o.createSegment;
import p040o.namesAndValuesToQueryString;
import p040o.parse;
import p040o.pathSegmentsToString;
import p040o.percentDecode;
import p040o.safeContains;
import p040o.segmentFor;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface BondService {
    @POST("/v1/bonds/purchase/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<namesAndValuesToQueryString>> confirmPurchaseBond(@Body safeContains safecontains);

    @POST("/v2/bonds/purchase/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<namesAndValuesToQueryString>> confirmPurchaseBondV2(@Body safeContains safecontains);

    @POST("/v1/bonds/accounts/summary")
    DebitCardResetOtpActivity<SingleDataEntity<pathSegmentsToString>> getBondAccountSummary(@Body createSegment createsegment);

    @POST("/v1/bonds/eligiblebonds/inquiry")
    DebitCardResetOtpActivity<SingleDataEntity<parse>> getBondSelectionList(@Body CompoundOrdering compoundOrdering);

    @POST("/v1/bonds/purchase/verification")
    DebitCardResetOtpActivity<SingleDataEntity<percentDecode>> verifyPurchaseBond(@Body segmentFor segmentfor);

    @POST("/v2/bonds/purchase/verification")
    DebitCardResetOtpActivity<SingleDataEntity<percentDecode>> verifyPurchaseBondV2(@Body segmentFor segmentfor);
}
