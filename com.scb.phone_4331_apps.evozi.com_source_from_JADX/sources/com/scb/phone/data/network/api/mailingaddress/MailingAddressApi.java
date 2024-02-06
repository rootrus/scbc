package com.scb.phone.data.network.api.mailingaddress;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.mailingaddress.MailingAddressService;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingMap;
import p040o.HmlPinActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.beginArray;
import p040o.hasNext;
import p040o.nextBoolean;
import p040o.nextDouble;
import p040o.nextString;
import p040o.onGetStartedClick;
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

@HmlSetNTBPinActivity
public final class MailingAddressApi implements MailingAddressService {
    private final MailingAddressService MediaBrowserCompat$ItemReceiver;

    @GET("v1/addresses/mailingAddress/addressDetails")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<nextDouble>> getAddressDetails() {
        return this.MediaBrowserCompat$ItemReceiver.getAddressDetails();
    }

    @GET("/v1/addresses/mailingAddress/confirmation")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<beginArray>> getMailingAddressConfirmation(@Query("tokenId") String str) {
        onGetStartedClick.write((Object) str, "tokenId");
        return this.MediaBrowserCompat$ItemReceiver.getMailingAddressConfirmation(str);
    }

    @POST("v1/addresses/mailingAddress/landing")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<nextBoolean>> mailingAddressLanding(@Body standardListIterator standardlistiterator) {
        onGetStartedClick.write((Object) standardlistiterator, "request");
        return this.MediaBrowserCompat$ItemReceiver.mailingAddressLanding(standardlistiterator);
    }

    @POST("/v1/addresses/services/format/validation")
    public final BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postAddressesValidation(@Body standardEntrySet standardentryset) {
        onGetStartedClick.write((Object) standardentryset, "request");
        return this.MediaBrowserCompat$ItemReceiver.postAddressesValidation(standardentryset);
    }

    @POST("v1/addresses/mailingAddress/addressUpdateForm")
    public final BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postMailingAddress(@Body standardContainsValue standardcontainsvalue) {
        onGetStartedClick.write((Object) standardcontainsvalue, "request");
        return this.MediaBrowserCompat$ItemReceiver.postMailingAddress(standardcontainsvalue);
    }

    @POST("/v1/addresses/mailingAddress/confirmation")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<hasNext>> postMailingAddressConfirmation(@Header("otp") String str, @Header("tokenUUID") String str2, @Body ForwardingMap forwardingMap) {
        onGetStartedClick.write((Object) forwardingMap, "request");
        return this.MediaBrowserCompat$ItemReceiver.postMailingAddressConfirmation(str, str2, forwardingMap);
    }

    @POST("v1/addresses/mailingAddress/addressDetails")
    public final BScanCNotificationDeepLinkActivity<setCurrentItemInternal> postMailingAddressDetails(@Body standardSubList standardsublist) {
        onGetStartedClick.write((Object) standardsublist, "request");
        return this.MediaBrowserCompat$ItemReceiver.postMailingAddressDetails(standardsublist);
    }

    @POST("/v1/addresses/mailingAddress/goodtoknow")
    public final DebitCardResetOtpActivity<SingleDataEntity<nextString>> postMailingAddressGoodToKnow(@Body selectName selectname) {
        onGetStartedClick.write((Object) selectname, "body");
        return this.MediaBrowserCompat$ItemReceiver.postMailingAddressGoodToKnow(selectname);
    }

    @POST("v1/addresses/mailingAddress/productList")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<pushScope>> postProductList(@Body standardPutAll standardputall) {
        onGetStartedClick.write((Object) standardputall, "request");
        return this.MediaBrowserCompat$ItemReceiver.postProductList(standardputall);
    }

    @POST("v1/addresses/mailingAddress/productAddress")
    public final BScanCNotificationDeepLinkActivity<SingleDataEntity<peek>> productAddress(@Body standardKeySet standardkeyset) {
        onGetStartedClick.write((Object) standardkeyset, "request");
        return this.MediaBrowserCompat$ItemReceiver.productAddress(standardkeyset);
    }

    @HmlPinActivity
    public MailingAddressApi(MailingAddressService mailingAddressService) {
        onGetStartedClick.write((Object) mailingAddressService, "service");
        this.MediaBrowserCompat$ItemReceiver = mailingAddressService;
    }
}
