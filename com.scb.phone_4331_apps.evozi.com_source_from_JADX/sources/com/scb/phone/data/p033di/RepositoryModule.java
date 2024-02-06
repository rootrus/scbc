package com.scb.phone.data.p033di;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.google.gson.Gson;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.scb.phone.data.network.api.ForgotPinApi;
import com.scb.phone.data.network.api.GoogleSigninApi;
import com.scb.phone.data.network.api.justforyou.JustForYouApi;
import com.scb.phone.data.network.service.AddressService;
import com.scb.phone.data.network.service.BillPaymentService;
import com.scb.phone.data.network.service.FundDiscoverService;
import com.scb.phone.data.network.service.PartnerDiscoverWebViewService;
import com.scb.phone.data.network.service.common.SlipPlatformService;
import com.scb.phone.data.network.service.csent.CSentService;
import com.scb.phone.data.network.service.privacymanagement.PrivacyManagementService;
import com.scb.phone.data.repository.ForgotPinRepository;
import com.scb.phone.domain.repositories.ForgotPinRepositoryContractor;
import com.scb.phone.service.SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.FullScreenLoadingActivity;
import com.scb.phone.view.activity.ScbMapActivity$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.activity.additionaldocument.C5561xfdfcc7cf;
import com.scb.phone.view.activity.bankingagent.C5562xb3a19c4a;
import com.scb.phone.view.activity.ccrredemption.ecoupon.BaseECouponActivity;
import com.scb.phone.view.activity.deeplink.C5584x1d866acf;
import com.scb.phone.view.activity.deeplink.C5585x106633ac;
import com.scb.phone.view.activity.deeplink.C5586x287d9eb4;
import com.scb.phone.view.activity.deeplink.C5587xcce9efa1;
import com.scb.phone.view.activity.deeplink.C5588xdb5a0e5b;
import com.scb.phone.view.activity.deeplink.CreditCardServiceDefaultCardDeepLinkActivity;
import com.scb.phone.view.activity.deeplink.PurchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.demo.ntb.RegistrationActivity;
import com.scb.phone.view.activity.easycash.CommercialReferralNCBConsentActivity;
import com.scb.phone.view.activity.friends.FriendsLandingActivity;
import com.scb.phone.view.activity.hml.BaseHmlLandingActivity;
import com.scb.phone.view.activity.hml.C5613x13cfb373;
import com.scb.phone.view.activity.hml.HmlBaseConsentActivity;
import com.scb.phone.view.activity.hml.HmlBaseReviewActivity;
import com.scb.phone.view.activity.investment.discover.BaseDiscoverDisclaimerActivity;
import com.scb.phone.view.activity.investment.discover.BaseDiscoverSearchActivity;
import com.scb.phone.view.activity.partner.PartnerLandingAdapter;
import com.scb.phone.view.custom.common.CustomViewProgressAnimation;
import com.scb.phone.view.custom.common.CustomViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.hml.HmlCommonCustomDialog;
import com.scb.phone.view.custom.item.C5836x45fc1907;
import com.scb.phone.view.custom.webview.SCBWebView;
import com.scb.phone.view.fragment.additionaldocument.C5850x981d5d19;
import com.scb.phone.view.fragment.additionaldocument.DocumentUploadFragment$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.cardmanagement.C5866x109ad279;
import com.scb.phone.view.fragment.cardmanagement.SelectPurchaseFragment$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.directdebit.C5907x10730e76;
import com.scb.phone.view.fragment.easycash.DurationEmploymentDialog;
import com.scb.phone.view.fragment.easycash.DurationEmploymentForBusinessDialog;
import com.scb.phone.view.fragment.easycash.EasycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.easycash.EasycashCommonReviewFragment;
import com.scb.phone.view.fragment.ebillsubscription.EBillSubscriptionBillerListFragment;
import com.scb.phone.view.fragment.hml.C5971x988df801;
import com.scb.phone.view.fragment.hml.C5982xd23bad81;
import com.scb.phone.view.fragment.hml.C5985x82597580;
import com.scb.phone.view.fragment.hml.C5993x5a636e5f;
import com.scb.phone.view.fragment.hml.C5995xd770688e;
import com.scb.phone.view.fragment.hml.C6010x1c5b49b5;
import com.scb.phone.view.fragment.hml.HmlBusinessOwnerETBPersonalInfoFragment;
import com.scb.phone.view.fragment.hml.businessowner.C6016xc8f96b6e;
import com.scb.phone.view.fragment.hml.businessowner.HmlNtbBusinessOccupationInfoFragment;
import com.scb.phone.view.fragment.investment.onboarding.FundOnboardingTermsAndConditionsFragment;
import com.scb.phone.view.fragment.mailingaddress.BaseMailingAddressFragment;
import com.scb.phone.view.fragment.registration.friends.C6144x11f2e34b;
import com.scb.phone.view.fragment.remittance.C6150x69d72700;
import com.scb.phone.view.fragment.transferandpay.AnyTransferHistoryFragment;
import com.thunderhead.android.infrastructure.login.LoginActivity$MediaBrowserCompat$ItemReceiver;
import java.io.File;
import p040o.AbstractMultimap;
import p040o.AbstractMultiset;
import p040o.AbstractSortedSetMultimap;
import p040o.AccountChangeEventsRequest;
import p040o.AccountChangeEventsResponse;
import p040o.AccountPicker;
import p040o.AccountTransferClient;
import p040o.ActivityBuilder_ContributeECouponRedemptionDeeplinkActivity;
import p040o.ActivityBuilder_ContributeECouponRedemptionDetailActivity;
import p040o.AlertController$RecycleListView;
import p040o.Api;
import p040o.ApiKey;
import p040o.ArrayListMultimap;
import p040o.AsynchronousComputationException;
import p040o.Auth;
import p040o.BackgroundDetector;
import p040o.BankingActionActivity;
import p040o.BankingAgentReviewActivity;
import p040o.BankingAgentSuccessActivity_ViewBinding;
import p040o.BaseImplementation;
import p040o.BasePartialSearchActivity_ViewBinding;
import p040o.Batch;
import p040o.BatchResult;
import p040o.BatchResultToken;
import p040o.BiMap;
import p040o.BondTermsAndConditionsActivity;
import p040o.BulkTransferSuccessActivity;
import p040o.C10887sdkVersion;
import p040o.C1185xac757a41;
import p040o.C4093bd;
import p040o.C4299ds;
import p040o.C4310dy;
import p040o.C4494xdf0bba7d;
import p040o.C4750hg;
import p040o.C4768hj;
import p040o.C4773hl;
import p040o.C4943log;
import p040o.C4997nB;
import p040o.C4998nC;
import p040o.C5011nL;
import p040o.C5080ny;
import p040o.C5259send;
import p040o.C5425xff02711e;
import p040o.C6372x3d677cbb;
import p040o.C6457xf27f1ecf;
import p040o.C6468xef3b5654;
import p040o.C6514xb47b5894;
import p040o.C6548x820c5aab;
import p040o.C6697xa3eba5a5;
import p040o.C6893x309be96c;
import p040o.C6897xeb950f47;
import p040o.C7329x31a960dc;
import p040o.C7514tY;
import p040o.C7515tZ;
import p040o.C7534ua;
import p040o.CCRBaseActivity;
import p040o.CaptureDocumentActivity_ViewBinding;
import p040o.CcSofHybridActivity_ViewBinding;
import p040o.CheckCaptureModule;
import p040o.ClassToInstanceMap;
import p040o.ClearcutLogger;
import p040o.CommonStatusCodes;
import p040o.CrashlyticsRegistrar$$Lambda$1;
import p040o.Credential;
import p040o.CredentialRequest;
import p040o.CredentialRequestResponse;
import p040o.CredentialsOptions;
import p040o.CreditCardBilledDetailActivity;
import p040o.DataBuffer;
import p040o.EasycashEligibilityCaseModule;
import p040o.EasycashSalesheetIndexActivity;
import p040o.ErrorPageActivity;
import p040o.Feature;
import p040o.FirstPartyScopes;
import p040o.FragmentBuilder_BindBaseInvestmentSuccessFragment;
import p040o.FragmentBuilder_BindCcSofBillPaymentInputFragment;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.FragmentBuilder_BindCloseAccountSelectionOwnFragment;
import p040o.FragmentBuilder_BindDeejungTransferMinMaxReviewFragment;
import p040o.FragmentBuilder_BindDepositMoreInfoFragment;
import p040o.FragmentBuilder_BindDirectDebitInputMainFragment;
import p040o.FragmentBuilder_BindDiscoverFragment;
import p040o.FragmentBuilder_BindECouponQuantityFragment;
import p040o.FragmentBuilder_BindECouponReviewFragment;
import p040o.FragmentBuilder_BindEasyCashFeaturesMCMCInformationFragment;
import p040o.FragmentBuilder_BindEasycashInputIncomeFragment;
import p040o.FragmentBuilder_BindEditFavouriteFragment;
import p040o.FragmentBuilder_BindHmlNTBDocumentUploadGuidelineFragment;
import p040o.FragmentBuilder_BindNTBLifestyleLandingFragment;
import p040o.FragmentBuilder_BindNdidIdpVerifyIdentityFragment;
import p040o.FragmentBuilder_BindNdidInstructionFragment;
import p040o.FragmentBuilder_BindPrepaidCashOutSuccessFragment;
import p040o.FragmentBuilder_BindPrepaidRequestInputFragment;
import p040o.FragmentBuilder_BindPrepaidRequestMailingAddressFragment;
import p040o.FragmentBuilder_BindPrepaidTravelDetailTabFragment;
import p040o.FragmentBuilder_BindPrepaidTravelServicesTabFragment;
import p040o.FragmentBuilder_BindPreregisteredMobileFragment;
import p040o.FragmentBuilder_BindPreregistrationLandingFragment;
import p040o.FragmentBuilder_BindProductCatalogFragment;
import p040o.FragmentBuilder_BindProductDetailFragment;
import p040o.FragmentBuilder_BindPromptPayQRInputFragment;
import p040o.FragmentBuilder_BindPurchaseDepositFragment;
import p040o.FragmentBuilder_BindPurchaseDepositInputFragment;
import p040o.FragmentBuilder_BindPurchaseFromTabSelectionFragment;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;
import p040o.FragmentBuilder_BindQuickTopUpFragment;
import p040o.FragmentBuilder_BindRegistrationEmailSetupFragment;
import p040o.FragmentBuilder_BindRegistrationLandingFragment;
import p040o.FragmentBuilder_BindRegistrationNewPinFragment;
import p040o.FragmentBuilder_BindRegistrationPushNotificationFragment;
import p040o.FragmentBuilder_BindRemittanceLandingFragment;
import p040o.FragmentBuilder_BindRemittanceSenderAddressFragment;
import p040o.FragmentBuilder_BindRequestToPayLandingFragment;
import p040o.FragmentBuilder_BindRiskSummaryFragment;
import p040o.FragmentBuilder_BindSCBSRiskLevelFragment;
import p040o.FragmentBuilder_BindSCBSproductDetailFragment;
import p040o.FragmentBuilder_BindSSFTabFragment;
import p040o.FragmentBuilder_BindScbsMaritalStatusFragment;
import p040o.FragmentBuilder_BindSelectProvinceOrDistrictFragment;
import p040o.FragmentBuilder_BindSelectRecipientFromFavouriteFragment;
import p040o.FragmentBuilder_BindSentFragment;
import p040o.FragmentBuilder_BindSettingTabFragment;
import p040o.FragmentBuilder_BindSetupQuickTopUpFragment;
import p040o.FragmentBuilder_BindSetupScheduleMonthlyFragment;
import p040o.FragmentBuilder_BindSetupScheduleOnceFragment;
import p040o.FragmentBuilder_BindSetupScheduleWeeklyFragment;
import p040o.FragmentBuilder_BindSlipFragment;
import p040o.FragmentBuilder_BindStatementChannelSuccessfulFragment;
import p040o.FragmentBuilder_BindStopChequeReviewFragment;
import p040o.FragmentBuilder_BindSuccessQuickOperationFragment;
import p040o.FragmentBuilder_BindSummaryFragment;
import p040o.FragmentBuilder_BindTakePhotoFragment;
import p040o.FragmentBuilder_BindThirdPartySlipFragment;
import p040o.FragmentBuilder_BindTopUpBillerFragment;
import p040o.FragmentBuilder_BindTopUpBillerSelectedFragment;
import p040o.FragmentBuilder_BindTransferInputAmountFragment;
import p040o.FragmentBuilder_BindTransferTabFragment;
import p040o.FragmentBuilder_ContributeMututalFundOnboardingReviewFragment;
import p040o.FragmentBuilder_FundAddressDetailFragment;
import p040o.FragmentBuilder_HmlBusinessOwnerETBPersonalInfoFragment;
import p040o.FragmentBuilder_PhotoTakingDetailsFragment;
import p040o.FragmentBuilder_ScbsAccountDetailFragment;
import p040o.Functions;
import p040o.GoogleAnalytics;
import p040o.GoogleApi;
import p040o.GoogleApiActivity;
import p040o.GoogleApiAvailability;
import p040o.GoogleApiManager;
import p040o.GooglePlayServicesUtilLight;
import p040o.GoogleSignInStatusCodes;
import p040o.HintRequest;
import p040o.HitBuilders;
import p040o.HmlCalculatorDeepLinkActivity;
import p040o.HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver;
import p040o.HmlPromptPayVerificationActivity;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSensitiveConsentActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.IExtractionServer;
import p040o.IFaceDetector$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.IIdExtractionResult;
import p040o.IIdExtractor;
import p040o.IIdImageProcessingListener;
import p040o.IdRegion;
import p040o.IdType;
import p040o.ImageField;
import p040o.KeepForSdkWithMembers;
import p040o.KeepName;
import p040o.Lazy$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.LifecycleActivity;
import p040o.LifecycleCallback;
import p040o.LifecycleFragment;
import p040o.ListenerHolder;
import p040o.LocalProjectProvider;
import p040o.LocalProjectProvider_Factory;
import p040o.LocalProjectProvider_MembersInjector;
import p040o.Logger;
import p040o.ManageQrToPayActivity;
import p040o.ManageRecipientGroupActivity;
import p040o.OnDeviceIdExtractor;
import p040o.OnDeviceIdExtractor_Factory;
import p040o.OptionalPendingResultImpl;
import p040o.PassportCaptureModule_PassportOnDeviceExtractionServer_Factory;
import p040o.PassportExtractActivity;
import p040o.PinCase$PinIncorrectLimitReachedException;
import p040o.PreLoadCheckActivity;
import p040o.PrepaidCashOutCaseModule;
import p040o.ProductAction;
import p040o.ProjectProviderException;
import p040o.ProxyRequest;
import p040o.RegistrationMethods;
import p040o.Response;
import p040o.ResultCallback;
import p040o.RevocationBoundService;
import p040o.ScbException;
import p040o.ScbMapActivity$MediaBrowserCompat$ItemReceiver;
import p040o.ScriptIntrinsicConvolve5x5;
import p040o.ScriptIntrinsicLUT;
import p040o.ServerProjectProvider;
import p040o.Short3;
import p040o.SignInButton;
import p040o.SignInConnectionListener;
import p040o.SignInCredential;
import p040o.SmsRetrieverApi;
import p040o.StandardExceptionParser;
import p040o.Status;
import p040o.TaskApiCall;
import p040o.TaskRunner;
import p040o.ThirdPartyWebActivity;
import p040o.Tracker;
import p040o.UserRecoverableException;
import p040o.UserRecoverableNotifiedException;
import p040o.access$208$MediaBrowserCompat$ItemReceiver;
import p040o.addConcreteTypeArrayInternal;
import p040o.addConcreteTypeInternal;
import p040o.addImpression;
import p040o.addObject;
import p040o.addToMap;
import p040o.addWorkAccount;
import p040o.andFinally;
import p040o.anonymousLogger;
import p040o.areEdgesInView$MediaBrowserCompat$ItemReceiver;
import p040o.asActivity;
import p040o.blockingConnect;
import p040o.classification;
import p040o.classificationConfidence;
import p040o.clearInstanceForTest;
import p040o.clearListener;
import p040o.clickShareSlip;
import p040o.closeTutorial;
import p040o.count$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.createClientSettingsBuilder;
import p040o.createElementSet;
import p040o.createListenerKey;
import p040o.disconnectService;
import p040o.dispatchTransaction;
import p040o.doBestEffortWrite;
import p040o.doRegisterEventListener;
import p040o.dq$MediaBrowserCompat$ItemReceiver;
import p040o.dumpAll;
import p040o.eH$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.elementSet;
import p040o.enableAdvertisingIdCollection;
import p040o.enableUsingApkIndependentContext;
import p040o.ensurePlayServicesAvailable;
import p040o.findValueIteratorAndKey;
import p040o.firstKey;
import p040o.fromDataField;
import p040o.getAccountForExtension;
import p040o.getAccountForScopes;
import p040o.getAccountName;
import p040o.getAccountTypes;
import p040o.getAddress1FieldName;
import p040o.getAddress2FieldName;
import p040o.getAddress4FieldName;
import p040o.getAncestor;
import p040o.getApiKey;
import p040o.getApiName;
import p040o.getBundleVersion;
import p040o.getCause;
import p040o.getChangeType;
import p040o.getChimeraLifecycleFragmentImpl;
import p040o.getCityFieldName;
import p040o.getClientVersion;
import p040o.getCredential;
import p040o.getCredentialPickerConfig;
import p040o.getDelegateIterator;
import p040o.getDisplayName;
import p040o.getDocument$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getEnvCarrier$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getEnvLanguage$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getFieldValue;
import p040o.getFrontException;
import p040o.getGoogleSignInAccount;
import p040o.getHintPickerIntent;
import p040o.getInstanceId;
import p040o.getKernelIDSrc;
import p040o.getLifecycleActivity;
import p040o.getLogSessionId;
import p040o.getLooper;
import p040o.getMinAgeOfLockScreen;
import p040o.getMinApkVersion;
import p040o.getNotNullImages;
import p040o.getObject;
import p040o.getPendingIntent;
import p040o.getProcessName;
import p040o.getProject;
import p040o.getProjectAsync;
import p040o.getRegionName;
import p040o.getRemoteContext;
import p040o.getRequestedScopes;
import p040o.getSavedDefaultGoogleSignInOptions;
import p040o.getSharedApiKey;
import p040o.getSpatulaHeader;
import p040o.getStatus;
import p040o.getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver;
import p040o.getVariantAsync;
import p040o.hasApi;
import p040o.hasConnectedApi;
import p040o.hasPermissions;
import p040o.hasResolution;
import p040o.hn$MediaBrowserCompat$ItemReceiver;
import p040o.ho$MediaBrowserCompat$ItemReceiver;
import p040o.initialize;
import p040o.inject_cacheProvider;
import p040o.inject_extractorProvider;
import p040o.inject_permissionChecker;
import p040o.isConnecting;
import p040o.isCreated;
import p040o.isEmailAddressIdentifierSupported;
import p040o.isGooglePlayServicesUid;
import p040o.isIdTokenRequested;
import p040o.isLockScreenSolved;
import p040o.isMeasurementEnabled;
import p040o.isMeasurementExplicitlyDisabled;
import p040o.isPasswordLoginSupported;
import p040o.isPresent;
import p040o.isSidewinderDevice;
import p040o.isUidGoogleSigned;
import p040o.isUserRecoverableError;
import p040o.isUserResolvableError;
import p040o.keys;
import p040o.makeGooglePlayServicesAvailable;
import p040o.my$MediaBrowserCompat$ItemReceiver;
import p040o.nE$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.nativeIsGuidanceAvailable;
import p040o.newChooseAccountIntent;
import p040o.newInstance;
import p040o.newLocalProjectProvider;
import p040o.newOnDeviceIdExtractor;
import p040o.newTaskFor;
import p040o.notNull;
import p040o.notifyCompletion;
import p040o.notifyListenerInternal;
import p040o.onActivityResumed;
import p040o.onActivityStarted;
import p040o.onBackClicked;
import p040o.onBackImageProcessed;
import p040o.onBtnSendEmailVerificationClicked;
import p040o.onCaptureClicked;
import p040o.onConnectionFailed;
import p040o.onFailure;
import p040o.onFastPaySettingCoachmarkClicked$MediaBrowserCompat$ItemReceiver;
import p040o.onFrontImageProcessed;
import p040o.onLoadFinished;
import p040o.onNextTutorialButtonClick;
import p040o.onNotNowClick;
import p040o.onPause;
import p040o.onReportServiceBinding;
import p040o.onReviewButtonClicked;
import p040o.onSearchButtonClick;
import p040o.onServiceConnected;
import p040o.onStopCallOnce;
import p040o.onTrimMemory;
import p040o.preauthorization;
import p040o.readObjectNoData$MediaBrowserCompat$ItemReceiver;
import p040o.readVersion;
import p040o.refreshIfEmpty;
import p040o.register;
import p040o.release;
import p040o.removeAllOccurrences;
import p040o.removeIfEmpty;
import p040o.reportActivityStart;
import p040o.requestGoogleAccountsAccess;
import p040o.requestIdToken;
import p040o.requestServerAuthCode;
import p040o.retrieveData;
import p040o.save;
import p040o.setAccountName;
import p040o.setAllowableAccountsTypes;
import p040o.setAppName;
import p040o.setBackingMap$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setBody;
import p040o.setBrand;
import p040o.setCampaignParamsOnNextHit;
import p040o.setCheckoutOptions;
import p040o.setClientId;
import p040o.setCouponCode;
import p040o.setCredentialHintPickerConfig;
import p040o.setCurrencyCode;
import p040o.setCustomDimension;
import p040o.setCvv;
import p040o.setDefaultNotificationChannelId;
import p040o.setEncoding;
import p040o.setFeatures;
import p040o.setFilterByAuthorizedAccounts;
import p040o.setForNewAccount;
import p040o.setGoogleIdTokenRequestOptions;
import p040o.setHintPickerConfig;
import p040o.setLabel;
import p040o.setLanguage;
import p040o.setMap;
import p040o.setNonInteraction;
import p040o.setPasswordLoginSupported;
import p040o.setPhoneNumberIdentifierSupported;
import p040o.setPrice;
import p040o.setQuantity;
import p040o.setRevenue;
import p040o.setRootView$MediaBrowserCompat$ItemReceiver;
import p040o.setSampleRate;
import p040o.setScreenName;
import p040o.setScreenResolution;
import p040o.setSelectedAccount;
import p040o.setSessionTimeout;
import p040o.setShowCancelButton;
import p040o.setSupported;
import p040o.setTapText;
import p040o.setTarget;
import p040o.setTax;
import p040o.setTimeoutMillis;
import p040o.setTransactionId;
import p040o.setTransactionTax;
import p040o.setViewportSize;
import p040o.shouldShowCancelButton;
import p040o.singleRefIterator;
import p040o.sz$MediaBrowserCompat$ItemReceiver;
import p040o.tailSet;
import p040o.tryCrossOverAndBubbleUp;
import p040o.unmodifiableCollectionSubclass;
import p040o.validateIterator;
import p040o.verifyGooglePlayServicesIsAvailable;
import p040o.warn;
import p040o.withHolder;
import p040o.zaad;
import p040o.zaat;
import p040o.zaaw;
import p040o.zabg;
import p040o.zabj;
import p040o.zabk;
import p040o.zabl;
import p040o.zabn;
import p040o.zaj;
import p040o.zak;
import p040o.zam;
import p040o.zar;
import p040o.zzai;
import p040o.zzak;
import p040o.zzam;
import p040o.zzap;
import p040o.zzaq;
import p040o.zzav;
import p040o.zzga;
import p040o.zzgb;
import p040o.zzge;
import p040o.zzgj;
import p040o.zzgk;
import p040o.zzgs;
import p040o.zzgt;
import p040o.zzh;
import p040o.zzha;
import p040o.zzju;
import p040o.zzjv;
import p040o.zzjy;
import p040o.zzk;
import p040o.zzke;
import p040o.zzkf;
import p040o.zzkg;
import p040o.zzkw;
import p040o.zzkx;
import p040o.zzla;
import p040o.zzlu;
import p040o.zzn;
import p040o.zzo;
import p040o.zzs;
import p040o.zzv;
import p040o.zzy;

/* renamed from: com.scb.phone.data.di.RepositoryModule */
public class RepositoryModule {
    @HmlSetNTBPinActivity
    public AbstractMultimap.WrappedList IconCompatParcelizer(zzkg zzkg) {
        return zzkg;
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindBaseInvestmentSuccessFragment IconCompatParcelizer(zzge.zzk zzk) {
        return zzk;
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindChangeChannelStatementReviewFragment IconCompatParcelizer(FragmentBuilder_BindNTBLifestyleLandingFragment.write write) {
        return write;
    }

    @HmlSetNTBPinActivity
    public LocalProjectProvider.C69353 IconCompatParcelizer(C5985x82597580 hmlDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        return hmlDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    @HmlSetNTBPinActivity
    public OnDeviceIdExtractor.C6970b IconCompatParcelizer(FragmentBuilder_BindDiscoverFragment fragmentBuilder_BindDiscoverFragment) {
        return fragmentBuilder_BindDiscoverFragment;
    }

    @HmlSetNTBPinActivity
    public firstKey IconCompatParcelizer(zzgt zzgt) {
        return zzgt;
    }

    @HmlSetNTBPinActivity
    public getBundleVersion IconCompatParcelizer(EasycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver easycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver) {
        return easycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver;
    }

    public BiMap MediaBrowserCompat$CustomActionResultReceiver(zzge.zzm.zza zza) {
        return zza;
    }

    @HmlSetNTBPinActivity
    public OnDeviceIdExtractor.C6966a.C69693 MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindECouponQuantityFragment fragmentBuilder_BindECouponQuantityFragment) {
        return fragmentBuilder_BindECouponQuantityFragment;
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.Entries MediaBrowserCompat$ItemReceiver(setRootView$MediaBrowserCompat$ItemReceiver setrootview_mediabrowsercompat_itemreceiver) {
        return setrootview_mediabrowsercompat_itemreceiver;
    }

    @HmlSetNTBPinActivity
    public AbstractMultiset MediaBrowserCompat$ItemReceiver(zzlu zzlu) {
        return zzlu;
    }

    @HmlSetNTBPinActivity
    public IdType MediaBrowserCompat$ItemReceiver(C5866x109ad279 baseAmortizationAmountTabFragment$MediaBrowserCompat$ItemReceiver) {
        return baseAmortizationAmountTabFragment$MediaBrowserCompat$ItemReceiver;
    }

    @HmlSetNTBPinActivity
    public ImageField MediaBrowserCompat$ItemReceiver(C5907x10730e76 directDebitInputBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        return directDebitInputBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    @HmlSetNTBPinActivity
    public classification MediaBrowserCompat$ItemReceiver(zzga zzga) {
        return zzga;
    }

    @HmlSetNTBPinActivity
    public getDelegateIterator MediaBrowserCompat$ItemReceiver(zzke zzke) {
        return zzke;
    }

    @HmlSetNTBPinActivity
    public tailSet MediaBrowserCompat$ItemReceiver(zzha zzha) {
        return zzha;
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.MultisetKeyIterator read(zzgj zzgj) {
        return zzgj;
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.WrappedCollection read(zzjy zzjy) {
        return zzjy;
    }

    public ServerProjectProvider.C70684 read(zzge.zzg.zzb zzb) {
        return zzb;
    }

    @HmlSetNTBPinActivity
    public addToMap read(ThirdPartyWebActivity.IconCompatParcelizer iconCompatParcelizer) {
        return iconCompatParcelizer;
    }

    @HmlSetNTBPinActivity
    public elementSet read(ManageRecipientGroupActivity.write write) {
        return write;
    }

    public removeIfEmpty read(isPresent ispresent) {
        return ispresent;
    }

    @HmlSetNTBPinActivity
    public IdRegion write(DurationEmploymentForBusinessDialog.read read) {
        return read;
    }

    @HmlSetNTBPinActivity
    public PassportCaptureModule_PassportOnDeviceExtractionServer_Factory write(CustomViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver customViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver) {
        return customViewProgressAnimationFull$MediaBrowserCompat$ItemReceiver;
    }

    @HmlSetNTBPinActivity
    public ServerProjectProvider.C70729 write(zzge.zzh.zza zza) {
        return zza;
    }

    @HmlSetNTBPinActivity
    public readVersion write(zzge.zzc.zza zza) {
        return zza;
    }

    @HmlSetNTBPinActivity
    public validateIterator write(zzkf zzkf) {
        return zzkf;
    }

    @HmlSetNTBPinActivity
    public classificationConfidence write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, getEnvLanguage$MediaBrowserCompat$CustomActionResultReceiver getenvlanguage_mediabrowsercompat_customactionresultreceiver, FragmentBuilder_BindPrepaidCashOutSuccessFragment fragmentBuilder_BindPrepaidCashOutSuccessFragment, createElementSet.IconCompatParcelizer iconCompatParcelizer, removeAllOccurrences.write write, FragmentBuilder_BindPrepaidRequestMailingAddressFragment fragmentBuilder_BindPrepaidRequestMailingAddressFragment, HitBuilders hitBuilders, addImpression addimpression, GoogleAnalytics.zzb zzb, setCustomDimension setcustomdimension, setNonInteraction setnoninteraction, setQuantity setquantity, setPrice setprice, getLogSessionId getlogsessionid, FragmentBuilder_BindPrepaidTravelDetailTabFragment fragmentBuilder_BindPrepaidTravelDetailTabFragment, onActivityStarted onactivitystarted, setLabel setlabel, BillPaymentService billPaymentService) {
        return new CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver(str, getenvlanguage_mediabrowsercompat_customactionresultreceiver, billPaymentService, fragmentBuilder_BindPrepaidCashOutSuccessFragment, iconCompatParcelizer, write, fragmentBuilder_BindPrepaidRequestMailingAddressFragment, hitBuilders, addimpression, zzb, setcustomdimension, setnoninteraction, setquantity, setprice, getlogsessionid, fragmentBuilder_BindPrepaidTravelDetailTabFragment, onactivitystarted, setlabel);
    }

    @HmlSetNTBPinActivity
    public LocalProjectProvider write(C4773hl.read read, FragmentBuilder_BindPreregistrationLandingFragment fragmentBuilder_BindPreregistrationLandingFragment, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, notifyCompletion notifycompletion, clearListener clearlistener, retrieveData retrievedata, onFailure onfailure, getFrontException getfrontexception, setHintPickerConfig sethintpickerconfig, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        return new EasycashCommonReviewFragment.IconCompatParcelizer(read, fragmentBuilder_BindPreregistrationLandingFragment, getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, notifycompletion, clearlistener, retrievedata, onfailure, getfrontexception, sethintpickerconfig, str);
    }

    @HmlSetNTBPinActivity
    public inject_cacheProvider read(AssetManager assetManager, getAddress4FieldName.IconCompatParcelizer iconCompatParcelizer, SharedPreferences sharedPreferences, setSupported setsupported) {
        return new FundOnboardingTermsAndConditionsFragment.read(assetManager, iconCompatParcelizer, sharedPreferences, setsupported);
    }

    @HmlSetNTBPinActivity
    public C7514tY MediaBrowserCompat$ItemReceiver(C4998nC.read read, FragmentBuilder_BindRegistrationEmailSetupFragment fragmentBuilder_BindRegistrationEmailSetupFragment, setDefaultNotificationChannelId setdefaultnotificationchannelid, makeGooglePlayServicesAvailable makegoogleplayservicesavailable, ScriptIntrinsicConvolve5x5 scriptIntrinsicConvolve5x5) {
        return new C6144x11f2e34b(read, fragmentBuilder_BindRegistrationEmailSetupFragment, setdefaultnotificationchannelid, makegoogleplayservicesavailable, scriptIntrinsicConvolve5x5);
    }

    @HmlSetNTBPinActivity
    public C7515tZ MediaBrowserCompat$ItemReceiver(C5080ny.write write, isUidGoogleSigned isuidgooglesigned, FragmentBuilder_BindRegistrationNewPinFragment fragmentBuilder_BindRegistrationNewPinFragment) {
        return new AnyTransferHistoryFragment.IconCompatParcelizer(write, isuidgooglesigned, fragmentBuilder_BindRegistrationNewPinFragment);
    }

    @HmlSetNTBPinActivity
    public OnDeviceIdExtractor.C69651 MediaBrowserCompat$CustomActionResultReceiver(nE$MediaBrowserCompat$CustomActionResultReceiver ne_mediabrowsercompat_customactionresultreceiver, FragmentBuilder_BindRemittanceLandingFragment fragmentBuilder_BindRemittanceLandingFragment, FragmentBuilder_BindPurchaseProfileManagementFragment.write write, SignInButton.ButtonSize buttonSize, setNonInteraction setnoninteraction, SignInButton.ColorScheme colorScheme, SignInButton signInButton) {
        return new FragmentBuilder_BindDeejungTransferMinMaxReviewFragment(ne_mediabrowsercompat_customactionresultreceiver, fragmentBuilder_BindRemittanceLandingFragment, write, buttonSize, colorScheme, signInButton);
    }

    @HmlSetNTBPinActivity
    public setMap MediaBrowserCompat$CustomActionResultReceiver(C5588xdb5a0e5b webViewDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindPurchaseProfileManagementFragment.write write, KeepName keepName) {
        return new ErrorPageActivity.write(webViewDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver, write, keepName);
    }

    @HmlSetNTBPinActivity
    public C7534ua read(C4997nB.read read, my$MediaBrowserCompat$ItemReceiver my_mediabrowsercompat_itemreceiver, FragmentBuilder_BindPurchaseProfileManagementFragment.write write, FragmentBuilder_BindRegistrationPushNotificationFragment fragmentBuilder_BindRegistrationPushNotificationFragment, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "fileDir") File file, GoogleSignInStatusCodes googleSignInStatusCodes, requestIdToken requestidtoken, requestServerAuthCode requestserverauthcode, getSavedDefaultGoogleSignInOptions getsaveddefaultgooglesigninoptions, hasResolution hasresolution, newInstance newinstance, onServiceConnected onserviceconnected, Feature feature, ensurePlayServicesAvailable ensureplayservicesavailable, PreLoadCheckActivity preLoadCheckActivity, getClientVersion getclientversion, FirstPartyScopes firstPartyScopes, zzy zzy, getMinApkVersion getminapkversion, getStatus getstatus, addObject addobject, RevocationBoundService revocationBoundService, getFrontException getfrontexception, getGoogleSignInAccount getgooglesigninaccount, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        return new C6150x69d72700(read, fragmentBuilder_BindRegistrationPushNotificationFragment, googleSignInStatusCodes, requestidtoken, requestserverauthcode, getsaveddefaultgooglesigninoptions, hasresolution, newinstance, onserviceconnected, feature, ensureplayservicesavailable, preLoadCheckActivity, getclientversion, firstPartyScopes, zzy, getminapkversion, getstatus, addobject, revocationBoundService, getgooglesigninaccount, getfrontexception, str);
    }

    @HmlSetNTBPinActivity
    public setCvv MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindRegistrationEmailSetupFragment fragmentBuilder_BindRegistrationEmailSetupFragment, C5011nL.IconCompatParcelizer iconCompatParcelizer, BaseECouponActivity.IconCompatParcelizer iconCompatParcelizer2, createElementSet.IconCompatParcelizer iconCompatParcelizer3, notNull.read read, readObjectNoData$MediaBrowserCompat$ItemReceiver readobjectnodata_mediabrowsercompat_itemreceiver, keys keys, SharedPreferences sharedPreferences, FragmentBuilder_BindSetupScheduleWeeklyFragment fragmentBuilder_BindSetupScheduleWeeklyFragment, KeepForSdkWithMembers keepForSdkWithMembers, UserRecoverableException userRecoverableException, ScriptIntrinsicLUT scriptIntrinsicLUT, FragmentBuilder_BindRegistrationPushNotificationFragment fragmentBuilder_BindRegistrationPushNotificationFragment, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, ScriptIntrinsicConvolve5x5 scriptIntrinsicConvolve5x5, HmlSensitiveConsentActivity hmlSensitiveConsentActivity) {
        return new zzge.zzg(fragmentBuilder_BindRegistrationEmailSetupFragment, iconCompatParcelizer, iconCompatParcelizer2, iconCompatParcelizer3, read, readobjectnodata_mediabrowsercompat_itemreceiver, keys, sharedPreferences, fragmentBuilder_BindSetupScheduleWeeklyFragment, keepForSdkWithMembers, userRecoverableException, scriptIntrinsicLUT, fragmentBuilder_BindRegistrationPushNotificationFragment, str, scriptIntrinsicConvolve5x5, hmlSensitiveConsentActivity);
    }

    @HmlSetNTBPinActivity
    public OnDeviceIdExtractor.C6966a.C69671 write(inject_permissionChecker.IconCompatParcelizer iconCompatParcelizer, Api.ApiOptions.NoOptions noOptions) {
        return new FragmentBuilder_BindDirectDebitInputMainFragment(iconCompatParcelizer, noOptions);
    }

    @HmlSetNTBPinActivity
    public OnDeviceIdExtractor_Factory write(CheckCaptureModule checkCaptureModule, hasApi hasapi) {
        return new FragmentBuilder_BindECouponReviewFragment(checkCaptureModule, hasapi);
    }

    @HmlSetNTBPinActivity
    public newOnDeviceIdExtractor write(CheckCaptureModule.KtaExceptionResponseDeserializer.write write, FragmentBuilder_BindTakePhotoFragment fragmentBuilder_BindTakePhotoFragment, readObjectNoData$MediaBrowserCompat$ItemReceiver readobjectnodata_mediabrowsercompat_itemreceiver) {
        return new C1185xac757a41(write, fragmentBuilder_BindTakePhotoFragment, readobjectnodata_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public ServerProjectProvider.C70695 MediaBrowserCompat$ItemReceiver(C5562xb3a19c4a bankingAgentTCActivity$MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindThirdPartySlipFragment fragmentBuilder_BindThirdPartySlipFragment, isEmailAddressIdentifierSupported isemailaddressidentifiersupported) {
        return new FragmentBuilder_BindHmlNTBDocumentUploadGuidelineFragment(bankingAgentTCActivity$MediaBrowserCompat$CustomActionResultReceiver, fragmentBuilder_BindThirdPartySlipFragment, isemailaddressidentifiersupported);
    }

    @HmlSetNTBPinActivity
    public getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, CreditCardServiceDefaultCardDeepLinkActivity.write write, PartnerLandingAdapter.IconCompatParcelizer iconCompatParcelizer, createElementSet.IconCompatParcelizer iconCompatParcelizer2, SharedPreferences sharedPreferences, removeAllOccurrences.write write2, FragmentBuilder_BindProductCatalogFragment fragmentBuilder_BindProductCatalogFragment, register register, onStopCallOnce onstopcallonce, ResultCallback resultCallback, andFinally andfinally, Status status, setPhoneNumberIdentifierSupported setphonenumberidentifiersupported, getSharedApiKey getsharedapikey, getApiName getapiname, onTrimMemory ontrimmemory, initialize initialize, FragmentBuilder_ContributeMututalFundOnboardingReviewFragment fragmentBuilder_ContributeMututalFundOnboardingReviewFragment, ApiKey apiKey) {
        return new FragmentBuilder_BindPurchaseProfileManagementFragment.write(str, write, iconCompatParcelizer, iconCompatParcelizer2, sharedPreferences, write2, fragmentBuilder_BindProductCatalogFragment, register, onstopcallonce, resultCallback, andfinally, status, setphonenumberidentifiersupported, getsharedapikey, getapiname, ontrimmemory, initialize, fragmentBuilder_ContributeMututalFundOnboardingReviewFragment, apiKey);
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.EntrySet read(FragmentBuilder_BindSettingTabFragment fragmentBuilder_BindSettingTabFragment, removeAllOccurrences.write write, FriendsLandingActivity.write write2, LifecycleCallback lifecycleCallback, isCreated iscreated, getLifecycleActivity getlifecycleactivity, register register, LifecycleFragment lifecycleFragment, ListenerHolder.ListenerKey listenerKey, notifyListenerInternal notifylistenerinternal) {
        return new BankingActionActivity(fragmentBuilder_BindSettingTabFragment, write, write2, iscreated, lifecycleCallback, getlifecycleactivity, lifecycleFragment, listenerKey, notifylistenerinternal);
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.MultisetEntry IconCompatParcelizer(EasycashCommonReviewFragment.IconCompatParcelizer iconCompatParcelizer, FragmentBuilder_BindPurchaseProfileManagementFragment.write write, BaseHmlLandingActivity.write write2, FragmentBuilder_BindSetupScheduleMonthlyFragment fragmentBuilder_BindSetupScheduleMonthlyFragment, removeAllOccurrences.write write3, withHolder withholder, SignInConnectionListener signInConnectionListener, RegistrationMethods.Builder builder, OptionalPendingResultImpl optionalPendingResultImpl, RegistrationMethods registrationMethods, setFeatures setfeatures, TaskApiCall taskApiCall) {
        return new clickShareSlip(iconCompatParcelizer, write, write2, fragmentBuilder_BindSetupScheduleMonthlyFragment, write3, withholder, signInConnectionListener, builder, optionalPendingResultImpl, registrationMethods, setfeatures, taskApiCall);
    }

    @HmlSetNTBPinActivity
    public findValueIteratorAndKey write(AbstractMultimap.write write) {
        return new BankingAgentSuccessActivity_ViewBinding(write);
    }

    @HmlSetNTBPinActivity
    public onFrontImageProcessed MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, dq$MediaBrowserCompat$ItemReceiver dq_mediabrowsercompat_itemreceiver, zzk zzk, zzh zzh, getCause getcause) {
        return new SCBWebView.write(str, dq_mediabrowsercompat_itemreceiver, zzk, zzh, getcause);
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.C30091 MediaBrowserCompat$CustomActionResultReceiver(readObjectNoData$MediaBrowserCompat$ItemReceiver readobjectnodata_mediabrowsercompat_itemreceiver) {
        return new LoginActivity$MediaBrowserCompat$ItemReceiver(readobjectnodata_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public C6372x3d677cbb MediaBrowserCompat$ItemReceiver(C5586x287d9eb4 openAccountEtbNoActiveCasaDeepLinkActivity$MediaBrowserCompat$ItemReceiver, FragmentBuilder_BindScbsMaritalStatusFragment fragmentBuilder_BindScbsMaritalStatusFragment, FragmentBuilder_BindSSFTabFragment fragmentBuilder_BindSSFTabFragment, FragmentBuilder_BindSCBSproductDetailFragment fragmentBuilder_BindSCBSproductDetailFragment, zaat zaat, zabg zabg, onConnectionFailed onconnectionfailed, zam zam, zabl zabl, zabk zabk) {
        return new FragmentBuilder_BindSCBSRiskLevelFragment.read(openAccountEtbNoActiveCasaDeepLinkActivity$MediaBrowserCompat$ItemReceiver, fragmentBuilder_BindScbsMaritalStatusFragment, fragmentBuilder_BindSSFTabFragment, fragmentBuilder_BindSCBSproductDetailFragment, zaat, zabg, onconnectionfailed, zam, zabl, zabk);
    }

    @HmlSetNTBPinActivity
    public LocalProjectProvider.C69331 MediaBrowserCompat$CustomActionResultReceiver(getNotNullImages.write write, FragmentBuilder_BindProductCatalogFragment fragmentBuilder_BindProductCatalogFragment, zzs zzs, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        return new C5971x988df801(write, fragmentBuilder_BindProductCatalogFragment, zzs, str);
    }

    @HmlSetNTBPinActivity
    public OnDeviceIdExtractor.C6966a.C69682 read(sz$MediaBrowserCompat$ItemReceiver sz_mediabrowsercompat_itemreceiver, zzak zzak, getAccountName getaccountname, newTaskFor newtaskfor, zzaq zzaq, zzav zzav, zzk.zzc zzc, zzap zzap, zzk.zza zza) {
        return new FragmentBuilder_BindDepositMoreInfoFragment(sz_mediabrowsercompat_itemreceiver, zzak, getaccountname, newtaskfor, zzaq, zzav, zzc, zzap, zza);
    }

    @HmlSetNTBPinActivity
    public OnDeviceIdExtractor read(Context context, FragmentBuilder_BindPrepaidTravelServicesTabFragment fragmentBuilder_BindPrepaidTravelServicesTabFragment, keys keys, Resources resources, requestGoogleAccountsAccess requestgoogleaccountsaccess) {
        return new BaseMailingAddressFragment.IconCompatParcelizer(context, fragmentBuilder_BindPrepaidTravelServicesTabFragment, keys, resources, requestgoogleaccountsaccess);
    }

    @HmlSetNTBPinActivity
    public ServerProjectProvider.C70673 read(C5561xfdfcc7cf ntbHmlApiBasedDocumentInstructionsActivity$MediaBrowserCompat$ItemReceiver, zaj zaj, Api.zab zab, nativeIsGuidanceAvailable.read read, areEdgesInView$MediaBrowserCompat$ItemReceiver areedgesinview_mediabrowsercompat_itemreceiver) {
        return new FragmentBuilder_BindEasycashInputIncomeFragment.IconCompatParcelizer(ntbHmlApiBasedDocumentInstructionsActivity$MediaBrowserCompat$ItemReceiver, zab, zaj, read, areedgesinview_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.AsMap.AsMapIterator IconCompatParcelizer(CreditCardServiceDefaultCardDeepLinkActivity.write write, FragmentBuilder_BindPurchaseProfileManagementFragment.write write2, getRemoteContext getremotecontext, isUserRecoverableError isuserrecoverableerror, enableUsingApkIndependentContext enableusingapkindependentcontext, Short3 short3, FragmentBuilder_BindSelectProvinceOrDistrictFragment fragmentBuilder_BindSelectProvinceOrDistrictFragment, CommercialReferralNCBConsentActivity.read read, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, isSidewinderDevice issidewinderdevice, isGooglePlayServicesUid isgoogleplayservicesuid, SharedPreferences sharedPreferences) {
        return new BankingAgentReviewActivity(write, write2, getremotecontext, isuserrecoverableerror, enableusingapkindependentcontext, short3, fragmentBuilder_BindSelectProvinceOrDistrictFragment, read, str, issidewinderdevice, isgoogleplayservicesuid, sharedPreferences);
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.AsMap write(FragmentBuilder_BindSentFragment fragmentBuilder_BindSentFragment) {
        return new onFastPaySettingCoachmarkClicked$MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindSentFragment);
    }

    @HmlSetNTBPinActivity
    public getProjectAsync MediaBrowserCompat$CustomActionResultReceiver(IFaceDetector$MediaBrowserCompat$CustomActionResultReceiver iFaceDetector$MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindProductDetailFragment fragmentBuilder_BindProductDetailFragment, save save, getHintPickerIntent gethintpickerintent) {
        return new HmlBusinessOwnerETBPersonalInfoFragment.read(iFaceDetector$MediaBrowserCompat$CustomActionResultReceiver, fragmentBuilder_BindProductDetailFragment, save, gethintpickerintent);
    }

    @HmlSetNTBPinActivity
    public SubsamplingScaleImageView.IconCompatParcelizer read(C5584x1d866acf eTBProductDetailDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindRequestToPayLandingFragment fragmentBuilder_BindRequestToPayLandingFragment, BackgroundDetector.BackgroundStateChangeListener backgroundStateChangeListener) {
        return new C6697xa3eba5a5(eTBProductDetailDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver, fragmentBuilder_BindRequestToPayLandingFragment, backgroundStateChangeListener);
    }

    @HmlSetNTBPinActivity
    public LocalProjectProvider_MembersInjector read(getProcessName.read read, FragmentBuilder_BindPurchaseDepositInputFragment fragmentBuilder_BindPurchaseDepositInputFragment, getChimeraLifecycleFragmentImpl getchimeralifecyclefragmentimpl) {
        return new ActivityBuilder_ContributeECouponRedemptionDetailActivity.IconCompatParcelizer(read, fragmentBuilder_BindPurchaseDepositInputFragment, getchimeralifecyclefragmentimpl);
    }

    @HmlSetNTBPinActivity
    public onBackImageProcessed IconCompatParcelizer(C4093bd.write write, Logger.LogLevel logLevel, warn warn, Tracker tracker, setTax settax, StandardExceptionParser standardExceptionParser) {
        return new C5836x45fc1907(write, logLevel, warn, tracker, settax, standardExceptionParser);
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.EntryIterator MediaBrowserCompat$CustomActionResultReceiver(RegistrationActivity.write write, setBackingMap$MediaBrowserCompat$CustomActionResultReceiver setbackingmap_mediabrowsercompat_customactionresultreceiver, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "fileDir") File file) {
        return new setTapText(write, setbackingmap_mediabrowsercompat_customactionresultreceiver, file);
    }

    @HmlSetNTBPinActivity
    public C10887sdkVersion read(C4768hj.write write, isLockScreenSolved islockscreensolved, AccountTransferClient.zzc zzc, count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tokenCache") SharedPreferences sharedPreferences) {
        return new EBillSubscriptionBillerListFragment.IconCompatParcelizer(write, islockscreensolved, zzc, count_mediabrowsercompat_customactionresultreceiver);
    }

    @HmlSetNTBPinActivity
    public CcSofHybridActivity_ViewBinding.read read(PurchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver purchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver, zabj zabj, GoogleApiManager.zab zab) {
        return new FragmentBuilder_BindSuccessQuickOperationFragment.IconCompatParcelizer(purchasesPaymentDeepLinkActivity$MediaBrowserCompat$ItemReceiver, zabj, zab);
    }

    @HmlSetNTBPinActivity
    public getFrontException read(getEnvCarrier$MediaBrowserCompat$CustomActionResultReceiver getenvcarrier_mediabrowsercompat_customactionresultreceiver, zaad zaad, ScriptIntrinsicLUT scriptIntrinsicLUT, SharedPreferences sharedPreferences, count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
        return new preauthorization.read(getenvcarrier_mediabrowsercompat_customactionresultreceiver, zaad, scriptIntrinsicLUT, sharedPreferences);
    }

    @HmlSetNTBPinActivity
    public LocalProjectProvider.C6939a IconCompatParcelizer(Context context) {
        return new HmlNtbBusinessOccupationInfoFragment.write(context);
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindCloseAccountSelectionOwnFragment MediaBrowserCompat$ItemReceiver(SharedPreferences sharedPreferences, readObjectNoData$MediaBrowserCompat$ItemReceiver readobjectnodata_mediabrowsercompat_itemreceiver, keys keys) {
        return new FragmentBuilder_BindNdidIdpVerifyIdentityFragment.IconCompatParcelizer(sharedPreferences, readobjectnodata_mediabrowsercompat_itemreceiver, keys);
    }

    @HmlSetNTBPinActivity
    public inject_extractorProvider write(FragmentBuilder_BindTopUpBillerSelectedFragment fragmentBuilder_BindTopUpBillerSelectedFragment) {
        return new FragmentBuilder_BindEasyCashFeaturesMCMCInformationFragment.write(fragmentBuilder_BindTopUpBillerSelectedFragment);
    }

    @HmlSetNTBPinActivity
    public getRegionName MediaBrowserCompat$CustomActionResultReceiver(C4750hg.write write, FragmentBuilder_BindTopUpBillerFragment fragmentBuilder_BindTopUpBillerFragment, asActivity asactivity) {
        return new SelectPurchaseFragment$MediaBrowserCompat$ItemReceiver(write, fragmentBuilder_BindTopUpBillerFragment, asactivity);
    }

    @HmlSetNTBPinActivity
    public keys read(count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
        return new C6468xef3b5654(count_mediabrowsercompat_customactionresultreceiver);
    }

    @HmlSetNTBPinActivity
    public HmlLaserIdAboutActivity$MediaBrowserCompat$ItemReceiver read(FragmentBuilder_BindTransferInputAmountFragment fragmentBuilder_BindTransferInputAmountFragment) {
        return new FragmentBuilder_BindNdidInstructionFragment.read(fragmentBuilder_BindTransferInputAmountFragment);
    }

    @HmlSetNTBPinActivity
    public onPause.read read(FragmentBuilder_BindSetupScheduleWeeklyFragment fragmentBuilder_BindSetupScheduleWeeklyFragment) {
        return new onReviewButtonClicked(fragmentBuilder_BindSetupScheduleWeeklyFragment);
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.MultisetEntryIterator read(C5613x13cfb373 hmlNTBAdditionalDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver, ProductAction productAction, setCheckoutOptions setcheckoutoptions, setTransactionTax settransactiontax, zzo zzo, zzam zzam, FragmentBuilder_BindSlipFragment fragmentBuilder_BindSlipFragment, zzai zzai, FragmentBuilder_BindSetupScheduleOnceFragment fragmentBuilder_BindSetupScheduleOnceFragment) {
        return new BulkTransferSuccessActivity(hmlNTBAdditionalDocumentActivity$MediaBrowserCompat$CustomActionResultReceiver, productAction, setcheckoutoptions, settransactiontax, zzo, zzam, zzai, fragmentBuilder_BindSlipFragment, fragmentBuilder_BindSetupScheduleOnceFragment);
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.MultisetView.EntrySet IconCompatParcelizer(HmlBaseReviewActivity.read read, C5259send send, setCampaignParamsOnNextHit setcampaignparamsonnexthit, enableAdvertisingIdCollection enableadvertisingidcollection, setAppName setappname, setScreenResolution setscreenresolution, setLanguage setlanguage, FragmentBuilder_BindSetupQuickTopUpFragment fragmentBuilder_BindSetupQuickTopUpFragment, setClientId setclientid, setSampleRate setsamplerate, setEncoding setencoding, setCouponCode setcouponcode, setViewportSize setviewportsize, setBrand setbrand, setSessionTimeout setsessiontimeout, zzn zzn, Tracker.zza zza, setScreenName setscreenname) {
        return new BondTermsAndConditionsActivity(read, send, setcampaignparamsonnexthit, enableadvertisingidcollection, setappname, setscreenresolution, setlanguage, fragmentBuilder_BindSetupQuickTopUpFragment, setclientid, setsamplerate, setencoding, setcouponcode, setviewportsize, setbrand, setsessiontimeout, zzn, zza, setscreenname);
    }

    @HmlSetNTBPinActivity
    public AccountChangeEventsResponse MediaBrowserCompat$CustomActionResultReceiver() {
        return new AccountChangeEventsResponse();
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.SortedAsMap IconCompatParcelizer(SlipPlatformService slipPlatformService, AccountChangeEventsResponse accountChangeEventsResponse) {
        return new zzgs(slipPlatformService, accountChangeEventsResponse);
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.KeySet MediaBrowserCompat$ItemReceiver(HmlBaseConsentActivity.read read, setAccountName setaccountname) {
        return new ManageQrToPayActivity(read, setaccountname);
    }

    @HmlSetNTBPinActivity
    public getDocument$MediaBrowserCompat$CustomActionResultReceiver write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, C5585x106633ac nsipPartnerPaymentDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver, EasycashSalesheetIndexActivity easycashSalesheetIndexActivity, BaseImplementation.ApiMethodImpl apiMethodImpl, HmlPromptPayVerificationActivity.write write, onBtnSendEmailVerificationClicked onbtnsendemailverificationclicked, zar zar) {
        return new FragmentBuilder_BindRegistrationLandingFragment.read(str, nsipPartnerPaymentDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver, easycashSalesheetIndexActivity, apiMethodImpl, write, onbtnsendemailverificationclicked, zar);
    }

    @HmlSetNTBPinActivity
    public PassportExtractActivity write(AssetManager assetManager) {
        return new CustomViewProgressAnimation.IconCompatParcelizer(assetManager);
    }

    @HmlSetNTBPinActivity
    public LocalProjectProvider.C69375 write(getAddress2FieldName.read read, BaseDiscoverDisclaimerActivity.write write, setShowCancelButton setshowcancelbutton, isIdTokenRequested isidtokenrequested, CredentialRequest.Builder builder, getCredential getcredential, setPasswordLoginSupported setpasswordloginsupported, CredentialRequestResponse credentialRequestResponse, isPasswordLoginSupported ispasswordloginsupported, Api.AnyClientKey anyClientKey, shouldShowCancelButton shouldshowcancelbutton, setForNewAccount setfornewaccount, verifyGooglePlayServicesIsAvailable verifygoogleplayservicesisavailable, zzv zzv, FragmentBuilder_BindPromptPayQRInputFragment fragmentBuilder_BindPromptPayQRInputFragment, getAccountTypes getaccounttypes, Credential.Builder builder2, getCredentialPickerConfig getcredentialpickerconfig, setCredentialHintPickerConfig setcredentialhintpickerconfig, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        return new C5993x5a636e5f(read, write, setshowcancelbutton, isidtokenrequested, builder, getcredential, setpasswordloginsupported, credentialRequestResponse, ispasswordloginsupported, anyClientKey, shouldshowcancelbutton, setfornewaccount, verifygoogleplayservicesisavailable, zzv, fragmentBuilder_BindPromptPayQRInputFragment, getaccounttypes, builder2, getcredentialpickerconfig, setcredentialhintpickerconfig, str);
    }

    @HmlSetNTBPinActivity
    public ServerProjectProvider.C706515 MediaBrowserCompat$CustomActionResultReceiver(eH$MediaBrowserCompat$CustomActionResultReceiver eh_mediabrowsercompat_customactionresultreceiver, zak zak, notNull.read read, count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
        return new FragmentBuilder_BindEditFavouriteFragment.C65275(eh_mediabrowsercompat_customactionresultreceiver, zak, read, count_mediabrowsercompat_customactionresultreceiver);
    }

    @HmlSetNTBPinActivity
    public ServerProjectProvider MediaBrowserCompat$CustomActionResultReceiver(FullScreenLoadingActivity.write write, GooglePlayServicesUtilLight googlePlayServicesUtilLight, enableUsingApkIndependentContext enableusingapkindependentcontext, setGoogleIdTokenRequestOptions setgoogleidtokenrequestoptions, HintRequest.Builder builder, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        return new C6514xb47b5894(write, googlePlayServicesUtilLight, enableusingapkindependentcontext, setgoogleidtokenrequestoptions, builder, str);
    }

    @HmlSetNTBPinActivity
    public newLocalProjectProvider write(getObject.read read, ClearcutLogger clearcutLogger, setSelectedAccount setselectedaccount, anonymousLogger anonymouslogger, setAllowableAccountsTypes setallowableaccountstypes, newChooseAccountIntent newchooseaccountintent, C4943log log, AccountPicker accountPicker, AccountPicker.AccountChooserOptions.Builder builder, ClearcutLogger.zzc zzc, SharedPreferences sharedPreferences) {
        return new ActivityBuilder_ContributeECouponRedemptionDeeplinkActivity.IconCompatParcelizer(read, clearcutLogger, setselectedaccount, anonymouslogger, setallowableaccountstypes, newchooseaccountintent, log, accountPicker, builder, zzc);
    }

    @HmlSetNTBPinActivity
    public LocalProjectProvider_Factory read(FundDiscoverService fundDiscoverService) {
        return new zzge.zzd.zza(fundDiscoverService);
    }

    @HmlSetNTBPinActivity
    public getVariantAsync IconCompatParcelizer(IExtractionServer.IconCompatParcelizer iconCompatParcelizer, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        return new C5982xd23bad81(iconCompatParcelizer, str);
    }

    @HmlSetNTBPinActivity
    public IIdExtractionResult IconCompatParcelizer(TaskRunner.TaskCompletedListener.IconCompatParcelizer iconCompatParcelizer, HitBuilders.TransactionBuilder transactionBuilder, setRevenue setrevenue, setCurrencyCode setcurrencycode, setTransactionId settransactionid, setTarget settarget, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        return new HmlCommonCustomDialog.IconCompatParcelizer(iconCompatParcelizer, transactionBuilder, setrevenue, setcurrencycode, settransactionid, settarget, str);
    }

    @HmlSetNTBPinActivity
    public LocalProjectProvider.C6940b write(getCityFieldName.write write, setFilterByAuthorizedAccounts setfilterbyauthorizedaccounts, addImpression addimpression, SignInConnectionListener signInConnectionListener, withHolder withholder, setNonInteraction setnoninteraction, FragmentBuilder_BindPrepaidCashOutSuccessFragment fragmentBuilder_BindPrepaidCashOutSuccessFragment, FragmentBuilder_BindSetupScheduleMonthlyFragment fragmentBuilder_BindSetupScheduleMonthlyFragment) {
        return new C6016xc8f96b6e(write, setfilterbyauthorizedaccounts, addimpression, signInConnectionListener, withholder, setnoninteraction, fragmentBuilder_BindPrepaidCashOutSuccessFragment, fragmentBuilder_BindSetupScheduleMonthlyFragment);
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindCcSofBillPaymentInputFragment write(PartnerDiscoverWebViewService partnerDiscoverWebViewService, onLoadFinished onloadfinished, Gson gson) {
        return new zzge.zzj(partnerDiscoverWebViewService, onloadfinished, gson);
    }

    @HmlSetNTBPinActivity
    public ForgotPinRepositoryContractor read(ForgotPinApi forgotPinApi, getPendingIntent getpendingintent, zabn zabn, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, ScriptIntrinsicConvolve5x5 scriptIntrinsicConvolve5x5) {
        return new ForgotPinRepository(forgotPinApi, getpendingintent, zabn, str, scriptIntrinsicConvolve5x5);
    }

    @HmlSetNTBPinActivity
    public fromDataField write(hn$MediaBrowserCompat$ItemReceiver hn_mediabrowsercompat_itemreceiver, C5425xff02711e synchronizedsetmultimap_mediabrowsercompat_customactionresultreceiver, tryCrossOverAndBubbleUp.write write, FragmentBuilder_BindTransferTabFragment fragmentBuilder_BindTransferTabFragment, Auth.AuthCredentialsOptions authCredentialsOptions, dispatchTransaction dispatchtransaction, UserRecoverableNotifiedException userRecoverableNotifiedException, FragmentBuilder_BindPreregisteredMobileFragment fragmentBuilder_BindPreregisteredMobileFragment, addWorkAccount addworkaccount) {
        return new DurationEmploymentDialog.write(hn_mediabrowsercompat_itemreceiver, synchronizedsetmultimap_mediabrowsercompat_customactionresultreceiver, write, fragmentBuilder_BindTransferTabFragment, authCredentialsOptions, dispatchtransaction, addworkaccount, userRecoverableNotifiedException, fragmentBuilder_BindPreregisteredMobileFragment);
    }

    /* access modifiers changed from: package-private */
    @HmlSetNTBPinActivity
    public unmodifiableCollectionSubclass MediaBrowserCompat$ItemReceiver(AlertController$RecycleListView alertController$RecycleListView) {
        return new unmodifiableCollectionSubclass();
    }

    @HmlSetNTBPinActivity
    public C6548x820c5aab MediaBrowserCompat$CustomActionResultReceiver(PartnerLandingAdapter.IconCompatParcelizer iconCompatParcelizer, C6893x309be96c hmlPromptPayVerificationActivity$IconCompatParcelizer$MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindStopChequeReviewFragment fragmentBuilder_BindStopChequeReviewFragment, initialize initialize, FragmentBuilder_BindRiskSummaryFragment fragmentBuilder_BindRiskSummaryFragment, keys keys, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        return new CreditCardBilledDetailActivity.IconCompatParcelizer(iconCompatParcelizer, fragmentBuilder_BindStopChequeReviewFragment, initialize, fragmentBuilder_BindRiskSummaryFragment, keys, str);
    }

    @HmlSetNTBPinActivity
    public LocalProjectProvider.VersionTable.VersionList MediaBrowserCompat$ItemReceiver(C4494xdf0bba7d getaddress3fieldname_mediabrowsercompat_customactionresultreceiver, CredentialsOptions.Builder builder) {
        return new C6010x1c5b49b5(getaddress3fieldname_mediabrowsercompat_customactionresultreceiver, builder);
    }

    @HmlSetNTBPinActivity
    public getProject MediaBrowserCompat$CustomActionResultReceiver(C4310dy.IconCompatParcelizer iconCompatParcelizer, AccountChangeEventsRequest accountChangeEventsRequest, getChangeType getchangetype, FragmentBuilder_BindPrepaidRequestInputFragment fragmentBuilder_BindPrepaidRequestInputFragment) {
        return new C5850x981d5d19(iconCompatParcelizer, accountChangeEventsRequest, getchangetype, fragmentBuilder_BindPrepaidRequestInputFragment);
    }

    @HmlSetNTBPinActivity
    public C6897xeb950f47 read(C5587xcce9efa1 thirdPartySlipDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindSelectRecipientFromFavouriteFragment fragmentBuilder_BindSelectRecipientFromFavouriteFragment, isMeasurementExplicitlyDisabled ismeasurementexplicitlydisabled, isMeasurementEnabled ismeasurementenabled, onReportServiceBinding onreportservicebinding, ScbMapActivity$MediaBrowserCompat$ItemReceiver scbMapActivity$MediaBrowserCompat$ItemReceiver, clearInstanceForTest clearinstancefortest, LifecycleActivity lifecycleActivity, onNotNowClick onnotnowclick, setAllowableAccountsTypes setallowableaccountstypes, isUserResolvableError isuserresolvableerror, onCaptureClicked oncaptureclicked, onBackClicked onbackclicked, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        return new FragmentBuilder_BindSummaryFragment(thirdPartySlipDeepLinkActivity$MediaBrowserCompat$CustomActionResultReceiver, fragmentBuilder_BindSelectRecipientFromFavouriteFragment, ismeasurementexplicitlydisabled, ismeasurementenabled, onreportservicebinding, scbMapActivity$MediaBrowserCompat$ItemReceiver, clearinstancefortest, lifecycleActivity, onnotnowclick, setallowableaccountstypes, isuserresolvableerror, oncaptureclicked, onbackclicked, str);
    }

    @HmlSetNTBPinActivity
    public ServerProjectProvider.C70662 MediaBrowserCompat$CustomActionResultReceiver(ScbMapActivity$MediaBrowserCompat$CustomActionResultReceiver scbMapActivity$MediaBrowserCompat$CustomActionResultReceiver, BaseDiscoverSearchActivity.IconCompatParcelizer iconCompatParcelizer, FragmentBuilder_BindQuickTopUpFragment fragmentBuilder_BindQuickTopUpFragment, C7329x31a960dc onsearchbuttonclick_mediabrowsercompat_customactionresultreceiver, onSearchButtonClick.read read, FragmentBuilder_BindRemittanceSenderAddressFragment fragmentBuilder_BindRemittanceSenderAddressFragment, Api.SimpleClient simpleClient, isConnecting isconnecting, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        return new zzge.zzh(scbMapActivity$MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer, fragmentBuilder_BindQuickTopUpFragment, onsearchbuttonclick_mediabrowsercompat_customactionresultreceiver, read, fragmentBuilder_BindRemittanceSenderAddressFragment, simpleClient, isconnecting, str);
    }

    @HmlSetNTBPinActivity
    public refreshIfEmpty write(DataBuffer dataBuffer, FragmentBuilder_BindQuickTopUpFragment fragmentBuilder_BindQuickTopUpFragment, FragmentBuilder_FundAddressDetailFragment fragmentBuilder_FundAddressDetailFragment, Lazy$MediaBrowserCompat$CustomActionResultReceiver lazy$MediaBrowserCompat$CustomActionResultReceiver, CCRBaseActivity cCRBaseActivity, FragmentBuilder_HmlBusinessOwnerETBPersonalInfoFragment fragmentBuilder_HmlBusinessOwnerETBPersonalInfoFragment, getSpatulaHeader getspatulaheader, FragmentBuilder_ScbsAccountDetailFragment fragmentBuilder_ScbsAccountDetailFragment, getDisplayName getdisplayname, EasycashEligibilityCaseModule easycashEligibilityCaseModule, SmsRetrieverApi smsRetrieverApi, SharedPreferences sharedPreferences, ProxyRequest proxyRequest, getRequestedScopes getrequestedscopes, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, PinCase$PinIncorrectLimitReachedException pinCase$PinIncorrectLimitReachedException, setBody setbody, PrepaidCashOutCaseModule prepaidCashOutCaseModule, FragmentBuilder_PhotoTakingDetailsFragment fragmentBuilder_PhotoTakingDetailsFragment, getAccountForScopes getaccountforscopes, hasPermissions haspermissions) {
        return new zzju(dataBuffer, fragmentBuilder_BindQuickTopUpFragment, fragmentBuilder_FundAddressDetailFragment, lazy$MediaBrowserCompat$CustomActionResultReceiver, cCRBaseActivity, fragmentBuilder_HmlBusinessOwnerETBPersonalInfoFragment, getspatulaheader, getdisplayname, easycashEligibilityCaseModule, fragmentBuilder_ScbsAccountDetailFragment, smsRetrieverApi, sharedPreferences, proxyRequest, getrequestedscopes, str, pinCase$PinIncorrectLimitReachedException, setbody, prepaidCashOutCaseModule, fragmentBuilder_PhotoTakingDetailsFragment, getaccountforscopes, haspermissions);
    }

    @HmlSetNTBPinActivity
    public IIdImageProcessingListener MediaBrowserCompat$ItemReceiver(C4299ds.write write, CaptureDocumentActivity_ViewBinding captureDocumentActivity_ViewBinding) {
        return new DocumentUploadFragment$MediaBrowserCompat$ItemReceiver(write, captureDocumentActivity_ViewBinding);
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.MultisetView write(SharedPreferences sharedPreferences, Gson gson) {
        return new zzgk(sharedPreferences, gson);
    }

    @HmlSetNTBPinActivity
    public IIdExtractor MediaBrowserCompat$CustomActionResultReceiver(zaaw zaaw, onActivityResumed onactivityresumed, getKernelIDSrc getkernelidsrc) {
        return new zzgb(zaaw, onactivityresumed, getkernelidsrc);
    }

    @HmlSetNTBPinActivity
    public ProjectProviderException MediaBrowserCompat$CustomActionResultReceiver(SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver sCBFcmMessagingService$MediaBrowserCompat$ItemReceiver, Functions.IdentityFunction.IconCompatParcelizer iconCompatParcelizer) {
        return new zzge.zzf.zza(sCBFcmMessagingService$MediaBrowserCompat$ItemReceiver, iconCompatParcelizer);
    }

    @HmlSetNTBPinActivity
    public AsynchronousComputationException MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, PrivacyManagementService privacyManagementService, Response response) {
        return new zzkw(str, privacyManagementService, response);
    }

    @HmlSetNTBPinActivity
    public AbstractSortedSetMultimap MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, PrivacyManagementService privacyManagementService) {
        return new zzkx(str, privacyManagementService);
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.RandomAccessWrappedList MediaBrowserCompat$ItemReceiver(CSentService cSentService) {
        return new zzgt.zza.zzb(cSentService);
    }

    @HmlSetNTBPinActivity
    public ArrayListMultimap IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, PrivacyManagementService privacyManagementService) {
        return new zzla(str, privacyManagementService);
    }

    @HmlSetNTBPinActivity
    public zzkg write(JustForYouApi justForYouApi, GoogleApiAvailability.zaa zaa, FragmentBuilder_BindStatementChannelSuccessfulFragment fragmentBuilder_BindStatementChannelSuccessfulFragment, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
        return new zzkg(justForYouApi, zaa, fragmentBuilder_BindStatementChannelSuccessfulFragment, str);
    }

    @HmlSetNTBPinActivity
    public OnDeviceIdExtractor.C6966a MediaBrowserCompat$CustomActionResultReceiver(GoogleSigninApi googleSigninApi, FragmentBuilder_BindPurchaseFromTabSelectionFragment fragmentBuilder_BindPurchaseFromTabSelectionFragment) {
        return new zzge.zzf(googleSigninApi, fragmentBuilder_BindPurchaseFromTabSelectionFragment);
    }

    @HmlSetNTBPinActivity
    public zzge.zzc.zza write(ho$MediaBrowserCompat$ItemReceiver ho_mediabrowsercompat_itemreceiver, getMinAgeOfLockScreen getminageoflockscreen, getFieldValue getfieldvalue, addConcreteTypeInternal addconcretetypeinternal, addConcreteTypeArrayInternal addconcretetypearrayinternal) {
        return new zzge.zzc.zza(ho_mediabrowsercompat_itemreceiver, getminageoflockscreen, getfieldvalue, addconcretetypeinternal, addconcretetypearrayinternal);
    }

    @HmlSetNTBPinActivity
    public AbstractMultimap.KeySet.C11261 IconCompatParcelizer(FriendsLandingActivity.read read, ListenerHolder.zaa zaa, ListenerHolder.Notifier notifier, createListenerKey createlistenerkey) {
        return new zzge.zzk.zza(read, zaa, notifier, createlistenerkey);
    }

    @HmlSetNTBPinActivity
    public ClassToInstanceMap IconCompatParcelizer(access$208$MediaBrowserCompat$ItemReceiver access_208_mediabrowsercompat_itemreceiver) {
        return new HmlCalculatorDeepLinkActivity.PlaybackStateCompat(access_208_mediabrowsercompat_itemreceiver);
    }

    @HmlSetNTBPinActivity
    public LocalProjectProvider.C69386 MediaBrowserCompat$CustomActionResultReceiver(getAddress1FieldName.read read, count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str2, getLooper getlooper, doBestEffortWrite dobesteffortwrite, AccountTransferClient.zzb zzb, Batch.Builder builder, hasConnectedApi hasconnectedapi, disconnectService disconnectservice, GoogleApiActivity googleApiActivity, doRegisterEventListener doregistereventlistener, release release, BatchResult batchResult, singleRefIterator singlerefiterator, createClientSettingsBuilder createclientsettingsbuilder, getApiKey getapikey, BatchResultToken batchResultToken, FragmentBuilder_BindPurchaseDepositFragment fragmentBuilder_BindPurchaseDepositFragment, blockingConnect blockingconnect, dumpAll dumpall, getInstanceId getinstanceid, GoogleApi.Settings settings, BaseDiscoverSearchActivity.IconCompatParcelizer iconCompatParcelizer, FragmentBuilder_BindQuickTopUpFragment fragmentBuilder_BindQuickTopUpFragment, CommonStatusCodes commonStatusCodes) {
        getLooper getlooper2 = getlooper;
        getlooper2.MediaBrowserCompat$CustomActionResultReceiver = googleApiActivity;
        getlooper2.MediaBrowserCompat$ItemReceiver = doregistereventlistener;
        getlooper2.IconCompatParcelizer = getinstanceid;
        return new C5995xd770688e(read, count_mediabrowsercompat_customactionresultreceiver, str, str2, getlooper2, dobesteffortwrite, zzb, builder, hasconnectedapi, fragmentBuilder_BindPurchaseDepositFragment, blockingconnect, dumpall, settings, iconCompatParcelizer, fragmentBuilder_BindQuickTopUpFragment);
    }

    @HmlSetNTBPinActivity
    public getAncestor MediaBrowserCompat$ItemReceiver(BaseDiscoverSearchActivity.IconCompatParcelizer iconCompatParcelizer, AddressService addressService, reportActivityStart reportactivitystart, FragmentBuilder_BindQuickTopUpFragment fragmentBuilder_BindQuickTopUpFragment, Functions.IdentityFunction.IconCompatParcelizer iconCompatParcelizer2, ProxyRequest proxyRequest, SmsRetrieverApi smsRetrieverApi, PrepaidCashOutCaseModule prepaidCashOutCaseModule, getDisplayName getdisplayname, CrashlyticsRegistrar$$Lambda$1.IconCompatParcelizer iconCompatParcelizer3, onNextTutorialButtonClick onnexttutorialbuttonclick, FragmentBuilder_PhotoTakingDetailsFragment fragmentBuilder_PhotoTakingDetailsFragment, SignInCredential signInCredential, FragmentBuilder_ScbsAccountDetailFragment fragmentBuilder_ScbsAccountDetailFragment, PinCase$PinIncorrectLimitReachedException pinCase$PinIncorrectLimitReachedException, setBody setbody, getAccountForScopes getaccountforscopes, closeTutorial closetutorial, hasPermissions haspermissions, setTimeoutMillis settimeoutmillis, getAccountForExtension getaccountforextension, ScbException scbException, BasePartialSearchActivity_ViewBinding.read read, enableUsingApkIndependentContext enableusingapkindependentcontext, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str, EasycashEligibilityCaseModule easycashEligibilityCaseModule, SharedPreferences sharedPreferences, getLooper getlooper, disconnectService disconnectservice, GoogleApiActivity googleApiActivity, doRegisterEventListener doregistereventlistener, release release, BatchResult batchResult, singleRefIterator singlerefiterator, createClientSettingsBuilder createclientsettingsbuilder, getApiKey getapikey, BatchResultToken batchResultToken, FragmentBuilder_BindPurchaseDepositFragment fragmentBuilder_BindPurchaseDepositFragment, getInstanceId getinstanceid, getSpatulaHeader getspatulaheader, C6457xf27f1ecf emailMeVerificationCodeUseCase$EmailVerificationCodeNotSendException, shouldShowCancelButton shouldshowcancelbutton, CommonStatusCodes commonStatusCodes) {
        getLooper getlooper2 = getlooper;
        BaseDiscoverSearchActivity.IconCompatParcelizer iconCompatParcelizer4 = iconCompatParcelizer;
        getAccountForExtension getaccountforextension2 = getaccountforextension;
        SharedPreferences sharedPreferences2 = sharedPreferences;
        getLooper getlooper3 = getlooper;
        FragmentBuilder_BindPurchaseDepositFragment fragmentBuilder_BindPurchaseDepositFragment2 = fragmentBuilder_BindPurchaseDepositFragment;
        getlooper2.MediaBrowserCompat$CustomActionResultReceiver = googleApiActivity;
        getlooper2.MediaBrowserCompat$ItemReceiver = doregistereventlistener;
        getlooper2.IconCompatParcelizer = getinstanceid;
        return new zzjv(iconCompatParcelizer, addressService, reportactivitystart, fragmentBuilder_BindQuickTopUpFragment, iconCompatParcelizer2, proxyRequest, smsRetrieverApi, prepaidCashOutCaseModule, getdisplayname, iconCompatParcelizer3, onnexttutorialbuttonclick, fragmentBuilder_PhotoTakingDetailsFragment, signInCredential, fragmentBuilder_ScbsAccountDetailFragment, pinCase$PinIncorrectLimitReachedException, setbody, getaccountforscopes, closetutorial, haspermissions, getaccountforextension2, settimeoutmillis, sharedPreferences2, getlooper3, scbException, read, enableusingapkindependentcontext, str, fragmentBuilder_BindPurchaseDepositFragment2, easycashEligibilityCaseModule, getspatulaheader, emailMeVerificationCodeUseCase$EmailVerificationCodeNotSendException, shouldshowcancelbutton);
    }
}
