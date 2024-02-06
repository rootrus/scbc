package com.scb.phone.data.network.service.easycash;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p040o.DebitCardResetOtpActivity;
import p040o.LottieCompositionFactory;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface EasycashDocumentUploadService {
    @POST("/v2/lending/documents/upload")
    @Multipart
    DebitCardResetOtpActivity<SingleDataEntity<LottieCompositionFactory.C36086>> documentUpload(@Part("applicationId") RequestBody requestBody, @Part MultipartBody.Part part, @Part("documentName") RequestBody requestBody2, @Part("documentType") RequestBody requestBody3, @Part("productType") RequestBody requestBody4, @Part("password") RequestBody requestBody5);
}
