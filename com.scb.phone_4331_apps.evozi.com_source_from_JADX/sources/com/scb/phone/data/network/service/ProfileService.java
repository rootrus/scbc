package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.AnimatableValueParser;
import p040o.C1251R;
import p040o.CompoundException;
import p040o.DebitCardResetOtpActivity;
import p040o.EncryptedMessageException;
import p040o.Glide;
import p040o.Hashing;
import p040o.HttpException;
import p040o.ImmutableAsList;
import p040o.ImmutableBiMap;
import p040o.ImmutableList;
import p040o.ImmutableListMultimap;
import p040o.ImmutableMultimap;
import p040o.ImmutableMultiset;
import p040o.JsonEOFException;
import p040o.MetadataException;
import p040o.PerformanceTracker;
import p040o.RiffProcessingException;
import p040o.TiffProcessingException;
import p040o.copyOfInternal;
import p040o.entryOf;
import p040o.fromEntryList;
import p040o.getSortedRenderTimes;
import p040o.makeMap;
import p040o.orderKeysBy;
import p040o.orderValuesBy;
import p040o.setCurrentItemInternal;
import p040o.setExtraOffsets;
import p040o.setExtraRightOffset;
import p040o.standardRemove;
import p040o.toStringImpl;
import p040o.verifyFrame;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ProfileService {
    @PUT("v3/profiles/termcondversion")
    DebitCardResetOtpActivity<setCurrentItemInternal> acceptTermsAndConditions(@Body fromEntryList fromentrylist);

    @PUT("v2/profiles/termcondversion")
    DebitCardResetOtpActivity<setCurrentItemInternal> acceptTermsAndConditionsVersion(@Body entryOf entryof);

    @POST("v2/profiles/tiles")
    DebitCardResetOtpActivity<setCurrentItemInternal> addTile(@Body Hashing hashing);

    @POST("/v3/profiles/accounts/registered")
    DebitCardResetOtpActivity<setCurrentItemInternal> confirmAccounts(@Body ImmutableMultimap.EntryCollection.C35001 r1);

    @DELETE("v1/profiles/email")
    DebitCardResetOtpActivity<setCurrentItemInternal> deleteEmailProfile();

    @DELETE("v1/profiles/favourites/{favoriteId}")
    DebitCardResetOtpActivity<setCurrentItemInternal> deleteFavorite(@Path("favoriteId") String str);

    @HTTP(hasBody = true, method = "DELETE", path = "v1/profiles/accounts/registered")
    DebitCardResetOtpActivity<MetadataException> deleteRegisteredAccount(@Body ImmutableMultiset.C35031 r1);

    @HTTP(hasBody = true, method = "DELETE", path = "v2/profiles/tiles")
    DebitCardResetOtpActivity<setCurrentItemInternal> deleteTile(@Body standardRemove standardremove);

    @GET("v1/profiles/address")
    DebitCardResetOtpActivity<SingleDataEntity<EncryptedMessageException>> getAddress();

    @GET("v1/profiles/favourites/all")
    DebitCardResetOtpActivity<HttpException> getFavouriteAll();

    @GET("v1/profiles/favourites/billpayment")
    DebitCardResetOtpActivity<HttpException> getFavouriteBillPayment();

    @GET("v1/profiles/favourites/remittance")
    DebitCardResetOtpActivity<HttpException> getFavouriteRemittance();

    @GET("v1/profiles/favourites/topup")
    DebitCardResetOtpActivity<HttpException> getFavouriteTopUp();

    @GET("v1/profiles/favourites/transfer")
    DebitCardResetOtpActivity<HttpException> getFavouriteTransfer();

    @GET("v3/profiles/tiles")
    DebitCardResetOtpActivity<AnimatableValueParser> getLandingPageTileList(@Query("expand") boolean z);

    @POST("v1/profiles/mobilelist")
    DebitCardResetOtpActivity<verifyFrame> getMobileList(@Body makeMap makemap);

    @GET("v1/config/services/staticcontent/jsonformat/termsandconditions/promptpay/latest/version")
    DebitCardResetOtpActivity<SingleDataEntity<setExtraOffsets>> getPromptPayVersion();

    @GET("v4/profiles/promptpay")
    DebitCardResetOtpActivity<SingleDataEntity<setExtraRightOffset>> getPromptpayProfiles();

    @GET("v1/profiles/quickbalance")
    DebitCardResetOtpActivity<TiffProcessingException> getQuickBalanceStatus();

    @GET("v1/profiles/quickpromptpay")
    DebitCardResetOtpActivity<RiffProcessingException> getQuickPromptPayStatus();

    @GET("v1/profiles/quicktopup")
    DebitCardResetOtpActivity<CompoundException> getQuickTopUpStatus();

    @GET("v3/profiles/accounts/registered")
    DebitCardResetOtpActivity<MetadataException> getRegisteredAccounts(@Query("tilesVersion") String str);

    @GET("v3/profiles/tiles")
    DebitCardResetOtpActivity<AnimatableValueParser> getShortCutTileList(@Query("parenttileid") String str, @Query("expand") boolean z);

    @GET("v3/profiles/accounts/unregistered")
    DebitCardResetOtpActivity<JsonEOFException> getUnregisteredAccounts(@Query("consentAcceptFlag") String str);

    @POST("v1/profiles/accounts/unregistered")
    DebitCardResetOtpActivity<JsonEOFException> getUnregisteredAccounts(@Header("tokenUUID") String str, @Header("otp") String str2, @Body ImmutableMultiset.EntrySet entrySet);

    @POST("v1/profiles/accounts/unregistered/nootp")
    DebitCardResetOtpActivity<JsonEOFException> getUnregisteredAccountsWithNoOTP(@Body ImmutableMultiset.EntrySet entrySet);

    @GET("v1/email/verify/status")
    DebitCardResetOtpActivity<SingleDataEntity<getSortedRenderTimes>> getVerifyStatus();

    @HTTP(hasBody = true, method = "DELETE", path = "/v2/profiles/promptpay")
    DebitCardResetOtpActivity<setCurrentItemInternal> removePromptPay(@Body ImmutableMultimap.Values values);

    @PUT("v1/profiles/address")
    DebitCardResetOtpActivity<SingleDataEntity<EncryptedMessageException>> saveAddress(@Body ImmutableList.ReverseImmutableList reverseImmutableList);

    @POST("v1/profiles/favourites/billpayment")
    DebitCardResetOtpActivity<Glide> saveFavouriteBillPayment(@Body ImmutableList.SerializedForm serializedForm);

    @POST("v1/profiles/favourites/remittance")
    DebitCardResetOtpActivity<Glide> saveFavouriteRemittance(@Body ImmutableListMultimap immutableListMultimap);

    @POST("v1/profiles/favourites/topup")
    DebitCardResetOtpActivity<Glide> saveFavouriteTopUp(@Body ImmutableList.SerializedForm serializedForm);

    @POST("v1/profiles/favourites/transfer")
    DebitCardResetOtpActivity<Glide> saveFavouriteTransfer(@Body ImmutableList.SerializedForm serializedForm);

    @PUT("v1/profiles")
    DebitCardResetOtpActivity<setCurrentItemInternal> setMaskAccount(@Body copyOfInternal copyofinternal);

    @POST("/v2/profiles/promptpay")
    DebitCardResetOtpActivity<setCurrentItemInternal> setPromptPay(@Header("otp") String str, @Header("tokenUUID") String str2, @Body ImmutableMultimap.Values.C35011 r3);

    @PUT("v1/profiles")
    DebitCardResetOtpActivity<setCurrentItemInternal> setUserLanguage(@Body ImmutableMultiset immutableMultiset);

    @PUT("v2/profiles/tiles")
    DebitCardResetOtpActivity<setCurrentItemInternal> swapTiles(@Body toStringImpl tostringimpl);

    @PUT("v2/profiles/accounts/registered")
    DebitCardResetOtpActivity<setCurrentItemInternal> updateAccount(@Body ImmutableAsList immutableAsList);

    @PUT("v2/profiles/accounts/registered")
    DebitCardResetOtpActivity<setCurrentItemInternal> updateAccount(@Body ImmutableBiMap.EmptyBiMap emptyBiMap);

    @PUT("v2/profiles/email")
    DebitCardResetOtpActivity<SingleDataEntity<PerformanceTracker.C37281>> updateEmailProfile(@Body ImmutableListMultimap.Builder builder);

    @PUT("v1/profiles/favourites/{favouriteId}")
    DebitCardResetOtpActivity<setCurrentItemInternal> updateFavourite(@Body orderKeysBy orderkeysby, @Path("favouriteId") String str);

    @PUT("v2/profiles")
    DebitCardResetOtpActivity<setCurrentItemInternal> updateProfile(@Body orderValuesBy ordervaluesby);

    @PUT("/v1/profiles/promptpay")
    DebitCardResetOtpActivity<setCurrentItemInternal> updatePromptPay(@Body ImmutableMultimap.Values.C35011 r1);

    @PUT("v2/profiles/accounts/registered")
    DebitCardResetOtpActivity<setCurrentItemInternal> updateRegisteredAccount(@Body ImmutableMultiset.Builder builder);

    @POST("v1/email/verify")
    DebitCardResetOtpActivity<SingleDataEntity<C1251R.anim>> verifyEmailCode(@Header("uuid") String str, @Header("otp") String str2);
}
