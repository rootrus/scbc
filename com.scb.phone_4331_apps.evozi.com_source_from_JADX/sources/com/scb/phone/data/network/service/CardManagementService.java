package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.List;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.ComputingConcurrentHashMap;
import p040o.ConcurrentHashMultiset;
import p040o.Constraint;
import p040o.Constraints;
import p040o.DebitCardResetOtpActivity;
import p040o.DeepLinkUri;
import p040o.addEncodedPathSegment;
import p040o.addEncodedQueryParameter;
import p040o.checkElement;
import p040o.checkElements;
import p040o.constrainedCollection;
import p040o.constrainedList;
import p040o.constrainedListIterator;
import p040o.containsInvalidHostnameAsciiCodes;
import p040o.decodeIpv6;
import p040o.domainToAscii;
import p040o.effectivePort;
import p040o.inet6AddressToAscii;
import p040o.parseUri;
import p040o.query;
import p040o.queryParameterValues;
import p040o.removeAllEncodedQueryParameters;
import p040o.removeAllQueryParameters;
import p040o.removePathSegment;
import p040o.resolve;
import p040o.resolvePath;
import p040o.scheme;
import p040o.schemeDelimiterOffset;
import p040o.setEncodedPathSegment;
import p040o.setQueryParameter;
import p040o.skipTrailingAsciiWhitespace;
import p040o.unbox;
import p040o.username;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public interface CardManagementService {
    @POST("v1/cardmanagement/cc/{cardRef}/activate")
    DebitCardResetOtpActivity<query> activateCard(@Header("tokenUUID") String str, @Header("otp") String str2, @Path("cardRef") String str3, @Body ComputingConcurrentHashMap.ComputingValueReference computingValueReference);

    @PUT("v1/cardmanagement/cc/{cardRef}/blockstatus")
    DebitCardResetOtpActivity<queryParameterValues> changeCardBlockStatus(@Path("cardRef") String str, @Body ConcurrentHashMultiset.C31961 r2);

    @POST("/v1/cardmanagement/cc/estatement/{cardRef}/changechannel")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setQueryParameter>> changeStatementChannel(@Path("cardRef") String str, @Body unbox unbox);

    @POST("/v1/cardmanagement/cc/payments/deejung/verification")
    DebitCardResetOtpActivity<resolvePath> generateTokenForDeejungInstallment(@Body checkElement checkelement);

    @POST("/v1/cardmanagement/cc/cashadvance/verification")
    DebitCardResetOtpActivity<removeAllEncodedQueryParameters> generateTokenForDeejungTransfer(@Body constrainedList constrainedlist);

    @POST("/v1/cardmanagement/cc/cashadvance/getamortization")
    DebitCardResetOtpActivity<SingleDataEntity<resolve>> getAmortizationList(@Body ConcurrentHashMultiset concurrentHashMultiset);

    @GET("/v1/cardmanagement/cc/estatement/{cardRef}/inquiry")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<setEncodedPathSegment>> getAvailableCycles(@Path("cardRef") String str);

    @GET("v1/cardmanagement/cc/{cardRef}")
    DebitCardResetOtpActivity<username> getCardDetails(@Path("cardRef") String str, @Query("tileVersion") String str2);

    @POST("v1/creditcards/image")
    DebitCardResetOtpActivity<DeepLinkUri.Builder> getCardImageUrl(@Body ConcurrentHashMultiset.EntrySet.C31951 r1);

    @POST("/v1/cardmanagement/cc/payments/deejung/transactions")
    DebitCardResetOtpActivity<containsInvalidHostnameAsciiCodes> getCardTransactions(@Body ConcurrentHashMultiset.EntrySet entrySet);

    @POST("/v1/cardmanagement/cc/payments/deejung/getamortization")
    DebitCardResetOtpActivity<SingleDataEntity<List<scheme>>> getDeejungInstallmentAmortizationList(@Body Constraint constraint);

    @POST("v2/cardmanagement/cc/payments/deejung/confirmation")
    DebitCardResetOtpActivity<domainToAscii> getDeejungInstallmentsConfirmation(@Header("tokenId") String str);

    @POST("/v1/cardmanagement/cc/payments/deejung/plans")
    DebitCardResetOtpActivity<inet6AddressToAscii> getDeejungTransactionPlans(@Body checkElements checkelements);

    @POST("/v1/cardmanagement/cc/cashadvance/confirmation")
    DebitCardResetOtpActivity<addEncodedQueryParameter> getDeejungTransferInstallmentsConfirmation(@Header("tokenId") String str, @Header("tokenUUID") String str2, @Header("otp") String str3);

    @POST("/v1/cardmanagement/cc/cashadvance/confirmation")
    DebitCardResetOtpActivity<skipTrailingAsciiWhitespace> getDeejungTransferMinFullConfirmation(@Header("tokenId") String str, @Header("tokenUUID") String str2, @Header("otp") String str3);

    @POST("/v1/cardmanagement/cc/cashadvance/plans")
    DebitCardResetOtpActivity<addEncodedPathSegment> getDeejungTransferPlans(@Body constrainedListIterator constrainedlistiterator);

    @POST("/v1/cardmanagement/cc/cashadvance/plans")
    DebitCardResetOtpActivity<removeAllQueryParameters> getMinFullTransferPlans(@Body constrainedListIterator constrainedlistiterator);

    @GET
    DebitCardResetOtpActivity<containsInvalidHostnameAsciiCodes> getMoreCardTransactions(@Url String str);

    @GET("/v1/cardmanagement/cc/estatement/{cardRef}/inquirychannel")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<parseUri>> getStatementCurrentChannel(@Path("cardRef") String str);

    @GET("v1/cardmanagement/cc/{cardRef}/creditlimitcriteria")
    DebitCardResetOtpActivity<schemeDelimiterOffset> getTempLimitCriteria(@Path("cardRef") String str);

    @POST("v1/cardmanagement/cc/cashadvance/eligibleamount")
    DebitCardResetOtpActivity<effectivePort> getTransferEligibleAmount(@Body constrainedCollection constrainedcollection);

    @POST("/v1/cardmanagement/cc/estatement/{cardRef}/email")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<removePathSegment>> sendEStatementToEmail(@Path("cardRef") String str, @Body Constraints.ConstrainedList constrainedList);

    @PUT("/v1/cardmanagement/cc/{cardRef}/creditlimit")
    DebitCardResetOtpActivity<decodeIpv6> submitCreditLimitUpdate(@Path("cardRef") String str, @Body ConcurrentHashMultiset.FieldSettersHolder fieldSettersHolder);
}
