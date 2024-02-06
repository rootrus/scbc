package com.scb.phone.data.p033di;

import android.content.SharedPreferences;
import android.content.res.AssetManager;
import com.google.gson.Gson;
import com.scb.phone.data.network.service.CardManagementService;
import com.scb.phone.data.network.service.CreditCardService;
import com.scb.phone.data.network.service.CustomerService;
import com.scb.phone.data.network.service.DepositService;
import com.scb.phone.data.network.service.FundOnboardingService;
import com.scb.phone.data.network.service.InvestmentService;
import com.scb.phone.data.network.service.LoanService;
import com.scb.phone.data.network.service.LoginService;
import com.scb.phone.data.network.service.LogoutService;
import com.scb.phone.data.network.service.ManageChequeService;
import com.scb.phone.data.network.service.MediaImageService;
import com.scb.phone.data.network.service.MutualFundsService;
import com.scb.phone.data.network.service.ProfileService;
import com.scb.phone.data.network.service.RewardRedemptionService;
import com.scb.phone.data.network.service.TopUpService;
import com.scb.phone.data.network.service.TransferService;
import com.scb.phone.data.network.service.registration.RegistrationService;
import com.scb.phone.data.network.service.registration.RegistrationWithApiAuthService;
import com.scb.phone.view.activity.deeplink.CreditCardServiceDefaultCardDeepLinkActivity;
import com.scb.phone.view.activity.friends.FriendsLandingActivity;
import com.scb.phone.view.activity.hml.BaseHmlLandingActivity;
import com.scb.phone.view.activity.hml.C5613x13cfb373;
import com.scb.phone.view.activity.hml.HmlBaseReviewActivity;
import com.scb.phone.view.activity.partner.PartnerLandingAdapter;
import p040o.AbstractMultimap;
import p040o.C4323eA;
import p040o.C4773hl;
import p040o.C4997nB;
import p040o.C5011nL;
import p040o.FragmentBuilder_BindPrepaidCashOutSuccessFragment;
import p040o.FragmentBuilder_BindPrepaidRequestSuccessFragment;
import p040o.FragmentBuilder_BindPrepaidTravelServicesTabFragment;
import p040o.FragmentBuilder_BindPreregistrationLandingFragment;
import p040o.FragmentBuilder_BindProductCatalogFragment;
import p040o.FragmentBuilder_BindPurchaseFromTabSelectionFragment;
import p040o.FragmentBuilder_BindRegistrationEmailSetupFragment;
import p040o.FragmentBuilder_BindRegistrationNewPinFragment;
import p040o.FragmentBuilder_BindRegistrationPushNotificationFragment;
import p040o.FragmentBuilder_BindSCBSproductDetailFragment;
import p040o.FragmentBuilder_BindSSFTabFragment;
import p040o.FragmentBuilder_BindScbsMaritalStatusFragment;
import p040o.FragmentBuilder_BindSetupScheduleMonthlyFragment;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.ScriptIntrinsicConvolve5x5;
import p040o.ScriptIntrinsicLUT;
import p040o.Short3;
import p040o.count$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.createElementSet;
import p040o.eH$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getObject;
import p040o.inject_permissionChecker;
import p040o.nE$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.notNull;
import p040o.readObjectNoData$MediaBrowserCompat$ItemReceiver;
import p040o.removeAllOccurrences;
import p040o.sz$MediaBrowserCompat$ItemReceiver;

/* renamed from: com.scb.phone.data.di.DataModule */
public class DataModule {
    @HmlSetNTBPinActivity
    public FragmentBuilder_BindPrepaidCashOutSuccessFragment MediaBrowserCompat$CustomActionResultReceiver() {
        return new FragmentBuilder_BindPrepaidCashOutSuccessFragment();
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindPrepaidRequestSuccessFragment IconCompatParcelizer() {
        return new FragmentBuilder_BindPrepaidRequestSuccessFragment();
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindPrepaidTravelServicesTabFragment read() {
        return new FragmentBuilder_BindPrepaidTravelServicesTabFragment();
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindPreregistrationLandingFragment IconCompatParcelizer(AssetManager assetManager) {
        return new FragmentBuilder_BindPreregistrationLandingFragment();
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindProductCatalogFragment MediaBrowserCompat$ItemReceiver() {
        return new FragmentBuilder_BindProductCatalogFragment();
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindRegistrationEmailSetupFragment MediaBrowserCompat$SearchResultReceiver() {
        return new FragmentBuilder_BindRegistrationEmailSetupFragment();
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindRegistrationNewPinFragment MediaMetadataCompat() {
        return new FragmentBuilder_BindRegistrationNewPinFragment();
    }

    @HmlSetNTBPinActivity
    public createElementSet.IconCompatParcelizer MediaBrowserCompat$ItemReceiver(SharedPreferences sharedPreferences) {
        return new createElementSet.IconCompatParcelizer(sharedPreferences);
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindScbsMaritalStatusFragment MediaSessionCompat$QueueItem() {
        return new FragmentBuilder_BindScbsMaritalStatusFragment();
    }

    @HmlSetNTBPinActivity
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public FragmentBuilder_BindSSFTabFragment mo13046x50fd9e4a() {
        return new FragmentBuilder_BindSSFTabFragment();
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindSCBSproductDetailFragment MediaSessionCompat$ResultReceiverWrapper() {
        return new FragmentBuilder_BindSCBSproductDetailFragment();
    }

    @HmlSetNTBPinActivity
    public readObjectNoData$MediaBrowserCompat$ItemReceiver write(SharedPreferences sharedPreferences) {
        return new readObjectNoData$MediaBrowserCompat$ItemReceiver(sharedPreferences);
    }

    @HmlSetNTBPinActivity
    public count$MediaBrowserCompat$CustomActionResultReceiver read(SharedPreferences sharedPreferences) {
        return new count$MediaBrowserCompat$CustomActionResultReceiver(sharedPreferences);
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindSetupScheduleMonthlyFragment ParcelableVolumeInfo() {
        return new FragmentBuilder_BindSetupScheduleMonthlyFragment();
    }

    @HmlSetNTBPinActivity
    public removeAllOccurrences.write IconCompatParcelizer(SharedPreferences sharedPreferences) {
        return new removeAllOccurrences.write((byte) 0);
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.write MediaBrowserCompat$CustomActionResultReceiver(SharedPreferences sharedPreferences) {
        return new AbstractMultimap.write(sharedPreferences);
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindRegistrationPushNotificationFragment MediaDescriptionCompat() {
        return new FragmentBuilder_BindRegistrationPushNotificationFragment();
    }

    @HmlSetNTBPinActivity
    public Gson MediaBrowserCompat$MediaItem() {
        return new Gson();
    }

    @HmlSetNTBPinActivity
    public ScriptIntrinsicLUT write(SharedPreferences sharedPreferences, Gson gson) {
        return new ScriptIntrinsicLUT(sharedPreferences, gson);
    }

    @HmlSetNTBPinActivity
    public Short3 MediaBrowserCompat$CustomActionResultReceiver(SharedPreferences sharedPreferences, Gson gson) {
        return new Short3(sharedPreferences, gson);
    }

    @HmlSetNTBPinActivity
    public notNull.read IconCompatParcelizer(SharedPreferences sharedPreferences, Gson gson) {
        return new notNull.read(sharedPreferences, gson);
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindPurchaseFromTabSelectionFragment write() {
        return new FragmentBuilder_BindPurchaseFromTabSelectionFragment();
    }

    @HmlSetNTBPinActivity
    public ScriptIntrinsicConvolve5x5 RatingCompat() {
        return new ScriptIntrinsicConvolve5x5();
    }

    public C4323eA.write read(CreditCardService creditCardService) {
        return new C4323eA.write(creditCardService);
    }

    public C4773hl.read write(DepositService depositService) {
        return new C4773hl.read(depositService);
    }

    public nE$MediaBrowserCompat$CustomActionResultReceiver read(LoanService loanService) {
        return new nE$MediaBrowserCompat$CustomActionResultReceiver(loanService);
    }

    public C4997nB.read MediaBrowserCompat$ItemReceiver(MutualFundsService mutualFundsService, InvestmentService investmentService) {
        return new C4997nB.read(mutualFundsService, investmentService);
    }

    public C5011nL.IconCompatParcelizer write(LogoutService logoutService, LoginService loginService, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "LoginFingerprintService") LoginService loginService2) {
        return new C5011nL.IconCompatParcelizer(logoutService, loginService, loginService2);
    }

    public inject_permissionChecker.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(MediaImageService mediaImageService) {
        return new inject_permissionChecker.IconCompatParcelizer(mediaImageService);
    }

    public CreditCardServiceDefaultCardDeepLinkActivity.write MediaBrowserCompat$ItemReceiver(ProfileService profileService, RegistrationWithApiAuthService registrationWithApiAuthService) {
        return new CreditCardServiceDefaultCardDeepLinkActivity.write(profileService, registrationWithApiAuthService);
    }

    public FriendsLandingActivity.write MediaBrowserCompat$CustomActionResultReceiver(TopUpService topUpService) {
        return new FriendsLandingActivity.write(topUpService);
    }

    public BaseHmlLandingActivity.write read(TransferService transferService) {
        return new BaseHmlLandingActivity.write(transferService);
    }

    public C5613x13cfb373 MediaBrowserCompat$CustomActionResultReceiver(RewardRedemptionService rewardRedemptionService, AssetManager assetManager) {
        return new C5613x13cfb373(rewardRedemptionService);
    }

    public HmlBaseReviewActivity.read IconCompatParcelizer(CardManagementService cardManagementService, AssetManager assetManager, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        return new HmlBaseReviewActivity.read(cardManagementService, str);
    }

    public eH$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer(CustomerService customerService) {
        return new eH$MediaBrowserCompat$CustomActionResultReceiver(customerService);
    }

    public sz$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver(ManageChequeService manageChequeService) {
        return new sz$MediaBrowserCompat$ItemReceiver(manageChequeService);
    }

    public getObject.read write(FundOnboardingService fundOnboardingService) {
        return new getObject.read(fundOnboardingService);
    }

    public PartnerLandingAdapter.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(RegistrationService registrationService, RegistrationWithApiAuthService registrationWithApiAuthService) {
        return new PartnerLandingAdapter.IconCompatParcelizer(registrationService, registrationWithApiAuthService);
    }
}
