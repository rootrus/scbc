package com.scb.phone.data.network.service;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.BaseAnimatableValue;
import p040o.C1251R;
import p040o.CctBackendFactory;
import p040o.ComparatorOrdering;
import p040o.DebitCardResetOtpActivity;
import p040o.DeepLinkUri;
import p040o.PolystarContent;
import p040o.ShapeData;
import p040o.ShapeDataParser;
import p040o.Unbinder;
import p040o.clearComposition;
import p040o.drawGlyphTextLine;
import p040o.getLinearCurrentKeyframeProgress;
import p040o.getSize;
import p040o.getSortedRenderTimes;
import p040o.isNetworkException;
import p040o.root;
import p040o.setAnimationFromJson;
import p040o.setDefaultFontFileExtension;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DeepLinkService {
    @GET("v1/cta/profiles/verifyemail/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<getSortedRenderTimes>> ctaVerify(@Path("deepLinkId") String str);

    @GET("/v1/cta/loanorigination/applications/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<getLinearCurrentKeyframeProgress>> getApplicationsById(@Path("deepLinkId") String str, @Query("tilesVersion") String str2);

    @GET("/v1/cta/loanorigination/applications/latest")
    DebitCardResetOtpActivity<SingleDataEntity<getLinearCurrentKeyframeProgress>> getApplicationsLatest(@Query("tilesVersion") String str);

    @GET("/v1/bankingagent/transactions/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<C1251R>> getBankingAgentsTransactions(@Path("deepLinkId") String str);

    @GET("v1/cta/payments/transactions/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<Unbinder>> getBillPaymentTransactions(@Path("deepLinkId") String str);

    @GET("/v1/cta/bizloanorigination/applications/status/id/{deepLinkId}")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<BaseAnimatableValue>> getBusinessOwnerApplicationById(@Path("deepLinkId") String str);

    @GET("/v1/cta/bizloanorigination/applications/status/latest")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<BaseAnimatableValue>> getBusinessOwnerApplicationLatest();

    @GET("v1/cta/bizloanorigination/outcome/status/latest")
    DebitCardResetOtpActivity<SingleDataEntity<setDefaultFontFileExtension>> getBusinessOwnerLatestLoanOfferStatus();

    @GET("v1/cta/bizloanorigination/outcome/status/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<setDefaultFontFileExtension>> getBusinessOwnerLoanOfferStatus(@Path("deepLinkId") String str);

    @GET("v1/cta/bizloanorigination/setup/result/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<getSize>> getBusinessOwnerSetupResult(@Path("deepLinkId") String str);

    @GET("v1/cta/cardmanagement/cc/approved/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<DeepLinkUri.C11721>> getCardManagementActivation(@Path("deepLinkId") String str);

    @GET("v1/cta/payments/creditcard/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<isNetworkException>> getCreditCardPaymentInfo(@Path("deepLinkId") String str);

    @POST("v2/cta/creditcards/services")
    DebitCardResetOtpActivity<setAnimationFromJson> getCreditCardSummary(@Body ComparatorOrdering comparatorOrdering);

    @GET("v1/cta/loanorigination/applications/customer/contacts/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<PolystarContent.C37331>> getCustomerContact(@Path("deepLinkId") String str);

    @GET("v1/ekyc/ndid/idp/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<root>> getIdpRequestInfo(@Path("deepLinkId") String str);

    @GET("v1/cta/loanorigination/applications/customer/contacts/latest")
    DebitCardResetOtpActivity<SingleDataEntity<PolystarContent.C37331>> getLatestCustomerContact();

    @GET("v1/cta/loanorigination/offers/status/latest")
    DebitCardResetOtpActivity<SingleDataEntity<setDefaultFontFileExtension>> getLatestLoanOfferStatus();

    @GET("v1/cta/rtp/pay/id/{deeplinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<CctBackendFactory>> getLinkRtp(@Path("deeplinkId") String str);

    @GET("v1/cta/loanorigination/offers/status/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<setDefaultFontFileExtension>> getLoanOfferStatus(@Path("deepLinkId") String str);

    @GET("v1/cta/loans/payment/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<ShapeDataParser>> getLoanPayment(@Path("deepLinkId") String str);

    @GET("v1/cta/mutualfunds/discover/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<ShapeData>> getMutualFundsDiscover(@Path("deepLinkId") String str);

    @GET("v1/cta/ccrewardredemption/rewards/opr/renew/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<clearComposition>> getOprRenew(@Path("deepLinkId") String str);

    @GET("v1/cta/payments/bill/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<Unbinder.CC>> getPaymentBillPartner(@Path("deepLinkId") String str);

    @GET("v1/securities/customer/registered")
    BScanCNotificationDeepLinkActivity<SingleDataEntity<drawGlyphTextLine>> getSecuritiesList();

    @GET("v2/cta/loanorigination/setup/result/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<getSize>> getSetupResult(@Path("deepLinkId") String str);

    @GET("v1/email/verify/id/{deepLinkId}")
    DebitCardResetOtpActivity<SingleDataEntity<getSortedRenderTimes>> verifyEmail(@Path("deepLinkId") String str);
}
