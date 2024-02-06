package com.scb.phone.data.network.service.registration;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.Collections2;
import p040o.DebitCardResetOtpActivity;
import p040o.ImmutableSet;
import p040o.ImmutableSetMultimap;
import p040o.ImmutableSortedAsList;
import p040o.PINMessageException;
import p040o.getLatLngBoundsForCameraTarget;
import p040o.onMyLocationChange;
import p040o.runUnlockedCleanup;
import p040o.setCenterTextColor;
import p040o.setCenterTextOffset;
import p040o.setCenterTextSizePixels;
import p040o.setCenterTextTypeface;
import p040o.setCurrentItemInternal;
import p040o.setDrawCenterText;
import p040o.setTouchEnabled;
import p040o.unsetKey;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface RegistrationWithApiAuthService {
    @GET("v2/profiles/allowadddevice")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setTouchEnabled>> allowAddDevice(@Header("otp") String str, @Header("tokenUUID") String str2);

    @GET("/v1/profiles/allowregister")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> allowRegister(@Header("otp") String str, @Header("tokenUUID") String str2);

    @GET("v1/registration/facestatus")
    DebitCardResetOtpActivity<setCurrentItemInternal> faceStatus(@Query("tilesVersion") String str);

    @POST("v3/profiles/register")
    DebitCardResetOtpActivity<SingleDataEntity<PINMessageException>> postRegisterNewPin(@Body getLatLngBoundsForCameraTarget getlatlngboundsforcameratarget);

    @POST("v3/profiles/preregistration/activation")
    DebitCardResetOtpActivity<SingleDataEntity<PINMessageException>> preActivation(@Body ImmutableSetMultimap.SortedKeyBuilderMultimap sortedKeyBuilderMultimap);

    @POST("/v1/profiles/preregistration/validation")
    DebitCardResetOtpActivity<SingleDataEntity<setCenterTextColor>> preValidation(@Body ImmutableSortedAsList immutableSortedAsList);

    @POST("v1/profiles/preregister/validation")
    DebitCardResetOtpActivity<Response<setCurrentItemInternal>> preregisterValidation(@Body ImmutableSet immutableSet);

    @POST("/v3/profiles/devices")
    DebitCardResetOtpActivity<SingleDataEntity<PINMessageException>> registerDevice(@Body Collections2.C31781 r1);

    @POST("v1/login/resetpin/verifybyatm")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCenterTextSizePixels>> resetPinVerifyByAtmCard(@Body ImmutableSetMultimap.BuilderMultimap builderMultimap);

    @POST("v2/login/resetpin/verifybycc")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCenterTextSizePixels>> resetPinVerifyByCreditCard(@Body ImmutableSetMultimap.Builder builder);

    @POST("v1/login/resetpin/verifybyface")
    @Multipart
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCenterTextSizePixels>> resetPinVerifyByFace(@Part("imageFormat") RequestBody requestBody, @Part("imageHeight") RequestBody requestBody2, @Part("imageWidth") RequestBody requestBody3, @Part MultipartBody.Part part, @Header("signature") String str, @Header("timestamp") String str2);

    @POST("v1/profiles/validateOTP")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> validateOTP(@Header("otp") String str, @Header("tokenuuid") String str2);

    @POST("v1/registration/verifybyatm")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> verifyByAtmCard(@Body ImmutableSetMultimap.BuilderMultimap builderMultimap);

    @POST("v2/registration/verifybycc")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> verifyByCreditCard(@Body ImmutableSetMultimap.Builder builder);

    @POST("v1/registration/verifybyface")
    @Multipart
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> verifyByFace(@Part("imageFormat") RequestBody requestBody, @Part("imageHeight") RequestBody requestBody2, @Part("imageWidth") RequestBody requestBody3, @Part MultipartBody.Part part, @Header("signature") String str, @Header("timestamp") String str2);

    @GET("v1/registration/verifymethod")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCenterTextOffset>> verifyMethod();

    @POST("/v1/profiles/register/verifyprofilesbyatm")
    DebitCardResetOtpActivity<SingleDataEntity<setDrawCenterText>> verifyProfileByAtm(@Body unsetKey unsetkey);

    @POST("/v1/profiles/register/verifyprofilesbycc")
    DebitCardResetOtpActivity<SingleDataEntity<setDrawCenterText>> verifyProfileByCreditCard(@Body runUnlockedCleanup rununlockedcleanup);

    @POST("v1/registration/verifyuser")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCenterTextTypeface>> verifyUser(@Body onMyLocationChange onmylocationchange);
}
