package com.scb.phone.data.network.service.mailingaddress;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingMap;
import p040o.beginArray;
import p040o.hasNext;
import p040o.nextBoolean;
import p040o.nextDouble;
import p040o.nextString;
import p040o.peek;
import p040o.pushScope;
import p040o.selectName;
import p040o.setCurrentItemInternal;
import p040o.standardContainsValue;
import p040o.standardEntrySet;
import p040o.standardKeySet;
import p040o.standardListIterator;
import p040o.standardPutAll;
import p040o.standardSubList;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface MailingAddressService {
    @GET("v1/addresses/mailingAddress/addressDetails")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<nextDouble>> getAddressDetails();

    @GET("/v1/addresses/mailingAddress/confirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<beginArray>> getMailingAddressConfirmation(@Query("tokenId") String str);

    @POST("v1/addresses/mailingAddress/landing")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<nextBoolean>> mailingAddressLanding(@Body standardListIterator standardlistiterator);

    @POST("/v1/addresses/services/format/validation")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postAddressesValidation(@Body standardEntrySet standardentryset);

    @POST("v1/addresses/mailingAddress/addressUpdateForm")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postMailingAddress(@Body standardContainsValue standardcontainsvalue);

    @POST("/v1/addresses/mailingAddress/confirmation")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<hasNext>> postMailingAddressConfirmation(@Header("otp") String str, @Header("tokenUUID") String str2, @Body ForwardingMap forwardingMap);

    @POST("v1/addresses/mailingAddress/addressDetails")
    BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postMailingAddressDetails(@Body standardSubList standardsublist);

    @POST("/v1/addresses/mailingAddress/goodtoknow")
    DebitCardResetOtpActivity<SingleDataEntity<nextString>> postMailingAddressGoodToKnow(@Body selectName selectname);

    @POST("v1/addresses/mailingAddress/productList")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<pushScope>> postProductList(@Body standardPutAll standardputall);

    @POST("v1/addresses/mailingAddress/productAddress")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<peek>> productAddress(@Body standardKeySet standardkeyset);
}
