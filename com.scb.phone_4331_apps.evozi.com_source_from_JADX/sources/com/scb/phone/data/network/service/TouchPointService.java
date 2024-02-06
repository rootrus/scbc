package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.ImmutableSortedSet;
import p040o.doFrame;
import p040o.emptySet;
import p040o.getFrameDurationNs;
import p040o.hasSameComparator;
import p040o.setCurrentItemInternal;
import retrofit2.http.Body;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface TouchPointService {
    @POST("v1/ekyc/touchpoint/facematch")
    @Multipart
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> faceMatch(@Part("imageFormat") RequestBody requestBody, @Part MultipartBody.Part part, @Part("imageHeight") RequestBody requestBody2, @Part("imageWidth") RequestBody requestBody3, @Part("imageCropCoordinateX") RequestBody requestBody4, @Part("imageCropCoordinateY") RequestBody requestBody5, @Part("imageCropWidth") RequestBody requestBody6, @Part("imageCropHeight") RequestBody requestBody7);

    @POST("v2/ekyc/touchpoint/finduser")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<getFrameDurationNs>> findUser(@Body ImmutableSortedSet immutableSortedSet);

    @POST("v1/ekyc/touchpoint/validation")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> validation(@Body emptySet emptyset);

    @POST("v2/ekyc/touchpoint/identity/validation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<doFrame>> verifyIdentity(@Body hasSameComparator hassamecomparator);
}
