package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.ComputingConcurrentHashMap;
import p040o.DebitCardResetOtpActivity;
import p040o.compute;
import p040o.copyFor;
import p040o.encodedFragment;
import p040o.encodedPathSegments;
import p040o.encodedQuery;
import p040o.encodedUsername;
import p040o.isComputingReference;
import p040o.notifyValueReclaimed;
import p040o.pathSize;
import p040o.setCurrentItemInternal;
import p040o.waitForValue;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface BulkTransferService {
    @POST("v1/bulktransferprofiles/group/recipient")
    DebitCardResetOtpActivity<setCurrentItemInternal> addRecipientsToGroup(@Body compute compute);

    @POST("v1/transfer/bulk/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<encodedFragment>> confirmBulkTransfer(@Body ComputingConcurrentHashMap.C31941 r1);

    @POST("v1/transfer/bulk/confirmation")
    DebitCardResetOtpActivity<SingleDataEntity<encodedFragment>> confirmBulkTransfer(@Body ComputingConcurrentHashMap.C31941 r1, @Header("tokenUUID") String str, @Header("otp") String str2);

    @POST("v1/bulktransferprofiles/group")
    DebitCardResetOtpActivity<SingleDataEntity<encodedUsername>> createGroup(@Body ComputingConcurrentHashMap.ComputingSegment computingSegment);

    @HTTP(hasBody = true, method = "DELETE", path = "v1/bulktransferprofiles/group")
    DebitCardResetOtpActivity<setCurrentItemInternal> deleteGroup(@Body isComputingReference iscomputingreference);

    @HTTP(hasBody = true, method = "DELETE", path = "v1/bulktransferprofiles/group/recipient")
    DebitCardResetOtpActivity<setCurrentItemInternal> deleteRecipient(@Body copyFor copyfor);

    @PUT("v1/bulktransferprofiles/group/recipient")
    DebitCardResetOtpActivity<setCurrentItemInternal> editRecipient(@Body waitForValue waitforvalue);

    @GET("v1/bulktransferprofiles/group")
    DebitCardResetOtpActivity<SingleDataEntity<encodedPathSegments>> getDataGroups();

    @GET("v1/bulktransferprofiles/group/recipient")
    DebitCardResetOtpActivity<SingleDataEntity<encodedQuery>> getRecipients(@Query("groupId") String str);

    @PUT("v1/bulktransferprofiles/group")
    DebitCardResetOtpActivity<setCurrentItemInternal> updateNameGroup(@Body notifyValueReclaimed notifyvaluereclaimed);

    @POST("v1/transfer/bulk/verification")
    DebitCardResetOtpActivity<SingleDataEntity<pathSize>> verifyBulkTransfer(@Body ComputingConcurrentHashMap.NullPointerExceptionReference nullPointerExceptionReference);
}
