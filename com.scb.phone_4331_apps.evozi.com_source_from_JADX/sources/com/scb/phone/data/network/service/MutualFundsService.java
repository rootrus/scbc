package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.ResponseBody;
import p040o.BaseLayer;
import p040o.Collections2;
import p040o.CustomConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.EmptyImmutableList;
import p040o.EmptyImmutableMap;
import p040o.EmptyImmutableMultiset;
import p040o.EmptyImmutableSet;
import p040o.EmptyImmutableSetMultimap;
import p040o.EnumBiMap;
import p040o.ForwardingMultimap;
import p040o.ForwardingMultiset;
import p040o.ImageLayer;
import p040o.MergePaths;
import p040o.PolystarShape;
import p040o.ShapeStroke;
import p040o.applyInvertedAddMask;
import p040o.applyInvertedIntersectMask;
import p040o.applyMasks;
import p040o.buildParentLayerListIfNeeded;
import p040o.forValue;
import p040o.getInOutKeyframes;
import p040o.getInnerRadius;
import p040o.getInnerRoundedness;
import p040o.getMaskMode;
import p040o.getMatteType;
import p040o.getOuterRadius;
import p040o.getPoints;
import p040o.getPreCompWidth;
import p040o.getRefId;
import p040o.getSolidHeight;
import p040o.headSetImpl;
import p040o.isHashCodeFast;
import p040o.isPartialView;
import p040o.reverse;
import p040o.setCurrentItemInternal;
import p040o.subSetImpl;
import p040o.tailSetImpl;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Streaming;
import retrofit2.http.Url;

public interface MutualFundsService {
    @POST("v1/mutualfunds/riskassessment/calculation")
    DebitCardResetOtpActivity<SingleDataEntity<PolystarShape.Type>> calculateRiskAssessment(@Body CustomConcurrentHashMap.StrongValueReference strongValueReference);

    @POST("v1/mutualfunds/cancel")
    DebitCardResetOtpActivity<setCurrentItemInternal> cancelFundTransaction(@Body EnumBiMap enumBiMap);

    @POST("v3/mutualfunds/purchase/confirmation")
    DebitCardResetOtpActivity<ImageLayer> confirmPurchase(@Body isPartialView ispartialview);

    @POST("v1/mutualfunds/redeem/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<getMatteType>> confirmRedeem(@Body reverse reverse, @Header("tokenUUID") String str, @Header("otp") String str2);

    @POST("v1/mutualfunds/riskassessment/confirmation")
    DebitCardResetOtpActivity<setCurrentItemInternal> confirmRiskAssessment(@Body CustomConcurrentHashMap.ValueIterator valueIterator);

    @POST("/v2/mutualfunds/switch/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<applyMasks>> confirmSwitch(@Body EmptyImmutableSet emptyImmutableSet);

    @Streaming
    @GET
    DebitCardResetOtpActivity<Response<ResponseBody>> downloadFundSummaryPDF(@Url String str);

    @POST("/v2/mutualfunds/details")
    DebitCardResetOtpActivity<SingleDataEntity<getMaskMode>> getDetails(@Body headSetImpl headsetimpl, @Header("tileVersion") String str);

    @POST("v2/mutualfunds/fund/details")
    DebitCardResetOtpActivity<SingleDataEntity<BaseLayer>> getFundDetails(@Body tailSetImpl tailsetimpl);

    @GET("v1/mutualfunds/discover")
    DebitCardResetOtpActivity<ShapeStroke> getFundList(@Query("groupCode") String str);

    @GET("v1/mutualfunds/knowledgeassessment")
    DebitCardResetOtpActivity<SingleDataEntity<getOuterRadius>> getKnowledgeAssessment();

    @GET("v2/mutualfunds/discover")
    DebitCardResetOtpActivity<SingleDataEntity<forValue>> getLandingDiscover();

    @POST("/v1/mutualfunds/config")
    DebitCardResetOtpActivity<SingleDataEntity<getInnerRoundedness>> getMutualFundsConfig(@Body ForwardingMultimap forwardingMultimap);

    @POST("v1/mutualfunds/purchase/search")
    DebitCardResetOtpActivity<SingleDataEntity<getInOutKeyframes>> getPurchaseSearchFunds(@Body EmptyImmutableList.C97281 r1);

    @POST("v1/mutualfunds/redeem/search")
    DebitCardResetOtpActivity<getPreCompWidth> getRedeemSearchFunds(@Body EmptyImmutableMap emptyImmutableMap);

    @GET("v1/mutualfunds/riskassessment")
    DebitCardResetOtpActivity<SingleDataEntity<getPoints>> getRiskAssessment();

    @POST("/v1/mutualfunds/summary")
    DebitCardResetOtpActivity<SingleDataEntity<getInnerRadius>> getSummary(@Body Collections2.FilteredCollection.C31791 r1);

    @POST("/v1/mutualfunds/switch/search/switchin")
    DebitCardResetOtpActivity<SingleDataEntity<applyInvertedAddMask>> getSwitchInSearchFunds(@Body isHashCodeFast ishashcodefast);

    @POST("v1/mutualfunds/switch/search/switchout")
    DebitCardResetOtpActivity<SingleDataEntity<applyInvertedIntersectMask>> getSwitchOutSearchFunds(@Body EmptyImmutableSetMultimap emptyImmutableSetMultimap);

    @GET("v1/mutualfunds/riskassessment/request/{riskLevel}")
    DebitCardResetOtpActivity<SingleDataEntity<getOuterRadius>> requestRiskAssessment(@Path("riskLevel") String str, @Query("tileVersion") String str2);

    @POST("v1/mutualfunds/knowledgeassessment")
    DebitCardResetOtpActivity<setCurrentItemInternal> sendKnowledgeAssessment(@Body ForwardingMultiset forwardingMultiset);

    @PUT("v1/mutualfunds/riskassessment")
    DebitCardResetOtpActivity<SingleDataEntity<MergePaths.MergePathsMode>> setRiskAssessment(@Body headSetImpl headsetimpl);

    @POST("v3/mutualfunds/purchase/verification")
    DebitCardResetOtpActivity<SingleDataEntity<getRefId>> verifyPurchase(@Body EmptyImmutableList emptyImmutableList);

    @POST("v2/mutualfunds/redeem/verification")
    DebitCardResetOtpActivity<SingleDataEntity<getSolidHeight>> verifyRedeem(@Body EmptyImmutableMultiset emptyImmutableMultiset);

    @POST("/v2/mutualfunds/switch/verification")
    DebitCardResetOtpActivity<SingleDataEntity<buildParentLayerListIfNeeded>> verifySwitch(@Body subSetImpl subsetimpl);
}
