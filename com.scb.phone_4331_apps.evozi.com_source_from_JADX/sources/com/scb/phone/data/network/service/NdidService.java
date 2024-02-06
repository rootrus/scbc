package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingSetMultimap;
import p040o.ForwardingSortedSetMultimap;
import p040o.ForwardingTable;
import p040o.LinkedHashTreeMap;
import p040o.cellSet;
import p040o.keySet;
import p040o.removeInternal;
import p040o.setCurrentItemInternal;
import p040o.standardSubMap;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface NdidService {
    @POST("/v1/ekyc/ndid/rp/request/cancellation")
    DebitCardResetOtpActivity<setCurrentItemInternal> cancelRpRequest();

    @POST("v1/ekyc/ndid/idp/response")
    DebitCardResetOtpActivity<SingleDataEntity<removeInternal>> confirmIdpResponse(@Body standardSubMap standardsubmap);

    @POST("v1/ekyc/ndid/rp/registration/confirmation")
    DebitCardResetOtpActivity<setCurrentItemInternal> confirmRpRegistration();

    @POST("v1/ekyc/ndid/rp/request/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<LinkedHashTreeMap.AvlIterator>> confirmRpRequest(@Body ForwardingTable forwardingTable);

    @POST("v1/ekyc/ndid/idp/customerData")
    DebitCardResetOtpActivity<SingleDataEntity<keySet>> getCustomerData(@Body ForwardingSetMultimap forwardingSetMultimap);

    @GET("v1/ekyc/ndid/rp/request/idplist")
    DebitCardResetOtpActivity<SingleDataEntity<LinkedHashTreeMap.EntrySet>> getIdps();

    @GET("/v1/ekyc/ndid/rp/request/status")
    DebitCardResetOtpActivity<setCurrentItemInternal> getStatusRpRequest();

    @POST("v1/ekyc/ndid/livenesscheck")
    @Multipart
    DebitCardResetOtpActivity<setCurrentItemInternal> livenessCheck(@Part("ndidType") RequestBody requestBody, @Part("requestId") RequestBody requestBody2, @Part("imageFormat") RequestBody requestBody3, @Part MultipartBody.Part part, @Part("imageHeight") RequestBody requestBody4, @Part("imageWidth") RequestBody requestBody5, @Part("imageCropCoordinateX") RequestBody requestBody6, @Part("imageCropCoordinateY") RequestBody requestBody7, @Part("imageCropWidth") RequestBody requestBody8, @Part("imageCropHeight") RequestBody requestBody9, @Header("signature") String str, @Header("timestamp") String str2);

    @POST("v1/ekyc/ndid/rp/request/cidphoto")
    @Multipart
    DebitCardResetOtpActivity<setCurrentItemInternal> uploadPhoto(@Part MultipartBody.Part part);

    @POST("v1/ekyc/ndid/idp/verification")
    DebitCardResetOtpActivity<setCurrentItemInternal> verifyIdentity(@Body ForwardingSortedSetMultimap forwardingSortedSetMultimap);

    @POST("v1/ekyc/ndid/rp/request/verification")
    DebitCardResetOtpActivity<setCurrentItemInternal> verifyRequest(@Body cellSet cellset);
}
