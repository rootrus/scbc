package com.scb.phone.data.network.service.hml;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p040o.DebitCardResetOtpActivity;
import p040o.LottieCompositionFactory;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface HmlDocumentUploadService {
    @POST("/v2/loanorigination/applications/documents")
    @Multipart
    DebitCardResetOtpActivity<SingleDataEntity<LottieCompositionFactory.C36086>> uploadDocument(@Part("applicationUuid") RequestBody requestBody, @Part("documentType") RequestBody requestBody2, @Part("productType") RequestBody requestBody3, @Part("documentPassword") RequestBody requestBody4, @Part("isBlurry") RequestBody requestBody5, @Part("isMissingBorders") RequestBody requestBody6, @Part("isLowContrastBackground") RequestBody requestBody7, @Part("isOverSaturated") RequestBody requestBody8, @Part("isUnderSaturated") RequestBody requestBody9, @Part("uploadMethod") RequestBody requestBody10, @Part("documentName") RequestBody requestBody11, @Part MultipartBody.Part part);
}
