package com.scb.phone.data.network.p034di;

import com.scb.phone.data.network.service.AddressService;
import com.scb.phone.data.network.service.AppConfigService;
import com.scb.phone.data.network.service.BScanCService;
import com.scb.phone.data.network.service.BankingAgentService;
import com.scb.phone.data.network.service.BillPaymentService;
import com.scb.phone.data.network.service.BondService;
import com.scb.phone.data.network.service.BondTermsAndConditionsService;
import com.scb.phone.data.network.service.BulkTransferService;
import com.scb.phone.data.network.service.CCContentService;
import com.scb.phone.data.network.service.CardManagementService;
import com.scb.phone.data.network.service.CardlessATMService;
import com.scb.phone.data.network.service.ChubbService;
import com.scb.phone.data.network.service.CloseAccountService;
import com.scb.phone.data.network.service.CreditCardService;
import com.scb.phone.data.network.service.CustomerService;
import com.scb.phone.data.network.service.DealsService;
import com.scb.phone.data.network.service.DebitCardATMService;
import com.scb.phone.data.network.service.DebitCardService;
import com.scb.phone.data.network.service.DeepLinkService;
import com.scb.phone.data.network.service.DepositService;
import com.scb.phone.data.network.service.DeviceService;
import com.scb.phone.data.network.service.DirectDebitService;
import com.scb.phone.data.network.service.DonationsService;
import com.scb.phone.data.network.service.EBillSubscriptionService;
import com.scb.phone.data.network.service.EDonationService;
import com.scb.phone.data.network.service.ETBService;
import com.scb.phone.data.network.service.EkycService;
import com.scb.phone.data.network.service.EligibilityService;
import com.scb.phone.data.network.service.FastPayService;
import com.scb.phone.data.network.service.FindUsService;
import com.scb.phone.data.network.service.ForgotPinService;
import com.scb.phone.data.network.service.FundDiscoverService;
import com.scb.phone.data.network.service.FundOnboardingService;
import com.scb.phone.data.network.service.FundSummaryService;
import com.scb.phone.data.network.service.GiftingService;
import com.scb.phone.data.network.service.GoogleSigninService;
import com.scb.phone.data.network.service.ISprintService;
import com.scb.phone.data.network.service.InvestmentService;
import com.scb.phone.data.network.service.LimitService;
import com.scb.phone.data.network.service.LoanService;
import com.scb.phone.data.network.service.LoginService;
import com.scb.phone.data.network.service.LogoutService;
import com.scb.phone.data.network.service.ManageChequeService;
import com.scb.phone.data.network.service.MediaImageService;
import com.scb.phone.data.network.service.MerchantService;
import com.scb.phone.data.network.service.MerchantWalletService;
import com.scb.phone.data.network.service.MobileNumberService;
import com.scb.phone.data.network.service.MutualFundsService;
import com.scb.phone.data.network.service.NTBPinLoginService;
import com.scb.phone.data.network.service.NTBTileService;
import com.scb.phone.data.network.service.NdidService;
import com.scb.phone.data.network.service.NotificationsService;
import com.scb.phone.data.network.service.NsipPartnerPaymentService;
import com.scb.phone.data.network.service.OtpService;
import com.scb.phone.data.network.service.PDFService;
import com.scb.phone.data.network.service.PartnerAuthorizeService;
import com.scb.phone.data.network.service.PartnerConsentService;
import com.scb.phone.data.network.service.PartnerDiscoverWebViewService;
import com.scb.phone.data.network.service.PartnerService;
import com.scb.phone.data.network.service.ProfileService;
import com.scb.phone.data.network.service.PromptPayService;
import com.scb.phone.data.network.service.PurchaseService;
import com.scb.phone.data.network.service.RequestToPayService;
import com.scb.phone.data.network.service.RewardRedemptionService;
import com.scb.phone.data.network.service.ScheduleService;
import com.scb.phone.data.network.service.SecuritiesService;
import com.scb.phone.data.network.service.SmeLoanService;
import com.scb.phone.data.network.service.TermsConditionsService;
import com.scb.phone.data.network.service.ThemesService;
import com.scb.phone.data.network.service.TileService;
import com.scb.phone.data.network.service.TopUpService;
import com.scb.phone.data.network.service.TouchPointService;
import com.scb.phone.data.network.service.TransferService;
import com.scb.phone.data.network.service.common.SlipPlatformService;
import com.scb.phone.data.network.service.csent.CSentService;
import com.scb.phone.data.network.service.friends.FriendsService;
import com.scb.phone.data.network.service.hml.HmlBusinessOwnerService;
import com.scb.phone.data.network.service.hml.HmlConsentService;
import com.scb.phone.data.network.service.hml.HmlDocumentUploadService;
import com.scb.phone.data.network.service.hml.HmlService;
import com.scb.phone.data.network.service.insurance.InsuranceService;
import com.scb.phone.data.network.service.juristic.JuristicService;
import com.scb.phone.data.network.service.justforyou.JustForYouService;
import com.scb.phone.data.network.service.mailingaddress.MailingAddressService;
import com.scb.phone.data.network.service.paynow.PayNowService;
import com.scb.phone.data.network.service.privacymanagement.PrivacyManagementService;
import com.scb.phone.data.network.service.registration.RegistrationService;
import com.scb.phone.data.network.service.registration.RegistrationWithApiAuthService;
import com.scb.phone.data.network.service.remittance.RemittanceService;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.zaaa;

/* renamed from: com.scb.phone.data.network.di.ServiceModule */
public class ServiceModule {
    @HmlSetNTBPinActivity
    public BulkTransferService setCustomView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (BulkTransferService) zaaa.read.create(BulkTransferService.class);
    }

    @HmlSetNTBPinActivity
    public BillPaymentService setTitleOptional(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "BillPaymentServiceGenerator") zaaa zaaa) {
        return (BillPaymentService) zaaa.read.create(BillPaymentService.class);
    }

    @HmlSetNTBPinActivity
    public CardlessATMService setHasNonEmbeddedTabs(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (CardlessATMService) zaaa.read.create(CardlessATMService.class);
    }

    @HmlSetNTBPinActivity
    public ManageChequeService setMenuCallbacks(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (ManageChequeService) zaaa.read.create(ManageChequeService.class);
    }

    @HmlSetNTBPinActivity
    public CreditCardService setActionBarHideOffset(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (CreditCardService) zaaa.read.create(CreditCardService.class);
    }

    @HmlSetNTBPinActivity
    public DepositService setHideOnContentScrollEnabled(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (DepositService) zaaa.read.create(DepositService.class);
    }

    @HmlSetNTBPinActivity
    public DeviceService ActionBarOverlayLayout(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (DeviceService) zaaa.read.create(DeviceService.class);
    }

    @HmlSetNTBPinActivity
    public DonationsService setOverlayMode(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "NoSSLServiceGenerator") zaaa zaaa) {
        return (DonationsService) zaaa.read.create(DonationsService.class);
    }

    @HmlSetNTBPinActivity
    public EBillSubscriptionService setLogo(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (EBillSubscriptionService) zaaa.read.create(EBillSubscriptionService.class);
    }

    @HmlSetNTBPinActivity
    public FindUsService setMenu(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (FindUsService) zaaa.read.create(FindUsService.class);
    }

    @HmlSetNTBPinActivity
    public FundSummaryService setMenuPrepared(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "NoSSLServiceGenerator") zaaa zaaa) {
        return (FundSummaryService) zaaa.read.create(FundSummaryService.class);
    }

    @HmlSetNTBPinActivity
    public GiftingService ActionMenuView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (GiftingService) zaaa.read.create(GiftingService.class);
    }

    @HmlSetNTBPinActivity
    public ISprintService setUiOptions(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "V1ServiceGenerator") zaaa zaaa) {
        return (ISprintService) zaaa.read.create(ISprintService.class);
    }

    @HmlSetNTBPinActivity
    public MutualFundsService onMenuItemClick(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (MutualFundsService) zaaa.read.create(MutualFundsService.class);
    }

    @HmlSetNTBPinActivity
    public LimitService ActionMenuPresenter$OverflowMenuButton(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (LimitService) zaaa.read.create(LimitService.class);
    }

    @HmlSetNTBPinActivity
    public LoanService setWindowTitle(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (LoanService) zaaa.read.create(LoanService.class);
    }

    @HmlSetNTBPinActivity
    public SmeLoanService AlertDialogLayout(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (SmeLoanService) zaaa.read.create(SmeLoanService.class);
    }

    @HmlSetNTBPinActivity
    public LoginService setExpandedActionViewsExclusive(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (LoginService) zaaa.read.create(LoginService.class);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "LoginFingerprintService")
    @HmlSetNTBPinActivity
    public LoginService setWindowCallback(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "FingerprintServiceGenerator") zaaa zaaa) {
        return (LoginService) zaaa.read.create(LoginService.class);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "preloadLoginService")
    @HmlSetNTBPinActivity
    public LoginService setPopupTheme(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "PreloadCheckServiceGenerator") zaaa zaaa) {
        return (LoginService) zaaa.read.create(LoginService.class);
    }

    @HmlSetNTBPinActivity
    public LogoutService setOverflowReserved(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (LogoutService) zaaa.read.create(LogoutService.class);
    }

    @HmlSetNTBPinActivity
    public MediaImageService setOnMenuItemClickListener(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (MediaImageService) zaaa.read.create(MediaImageService.class);
    }

    @HmlSetNTBPinActivity
    public ProfileService setInitialActivityCount(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "ProfileServiceGenerator") zaaa zaaa) {
        return (ProfileService) zaaa.read.create(ProfileService.class);
    }

    @HmlSetNTBPinActivity
    public NotificationsService ActionMenuView$OnMenuItemClickListener(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (NotificationsService) zaaa.read.create(NotificationsService.class);
    }

    @HmlSetNTBPinActivity
    public OtpService setPresenter(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "V1ServiceGenerator") zaaa zaaa) {
        return (OtpService) zaaa.read.create(OtpService.class);
    }

    @HmlSetNTBPinActivity
    public PromptPayService setActivityChooserModel(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (PromptPayService) zaaa.read.create(PromptPayService.class);
    }

    @HmlSetNTBPinActivity
    public RequestToPayService setDefaultActionButtonContentDescription(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (RequestToPayService) zaaa.read.create(RequestToPayService.class);
    }

    @HmlSetNTBPinActivity
    public ScheduleService setOnDismissListener(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (ScheduleService) zaaa.read.create(ScheduleService.class);
    }

    @HmlSetNTBPinActivity
    public ThemesService setProvider(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "NoSSLServiceGenerator") zaaa zaaa) {
        return (ThemesService) zaaa.read.create(ThemesService.class);
    }

    @HmlSetNTBPinActivity
    public TopUpService ActivityChooserView$InnerLayout(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (TopUpService) zaaa.read.create(TopUpService.class);
    }

    @HmlSetNTBPinActivity
    public TransferService setCustomSelectionActionModeCallback(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (TransferService) zaaa.read.create(TransferService.class);
    }

    @HmlSetNTBPinActivity
    public MobileNumberService setOverflowIcon(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "MobileNumberServiceGenerator") zaaa zaaa) {
        return (MobileNumberService) zaaa.read.create(MobileNumberService.class);
    }

    @HmlSetNTBPinActivity
    public TileService AppCompatAutoCompleteTextView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "TileServiceGenerator") zaaa zaaa) {
        return (TileService) zaaa.read.create(TileService.class);
    }

    @HmlSetNTBPinActivity
    public SlipPlatformService RatingCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "CommonServiceGenerator") zaaa zaaa) {
        return (SlipPlatformService) zaaa.read.create(SlipPlatformService.class);
    }

    @HmlSetNTBPinActivity
    public AppConfigService ActionBarContextView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (AppConfigService) zaaa.read.create(AppConfigService.class);
    }

    @HmlSetNTBPinActivity
    public DeepLinkService setActionBarVisibilityCallback(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (DeepLinkService) zaaa.read.create(DeepLinkService.class);
    }

    @HmlSetNTBPinActivity
    public RewardRedemptionService setExpandActivityOverflowButtonDrawable(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "RewardRedemptionServiceGenerator") zaaa zaaa) {
        return (RewardRedemptionService) zaaa.read.create(RewardRedemptionService.class);
    }

    @HmlSetNTBPinActivity
    public CardManagementService setTransitioning(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "CardManagementServiceGenerator") zaaa zaaa) {
        return (CardManagementService) zaaa.read.create(CardManagementService.class);
    }

    @HmlSetNTBPinActivity
    public CCContentService read(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "CCContentServiceConverterGenerator") zaaa zaaa) {
        return (CCContentService) zaaa.read.create(CCContentService.class);
    }

    @HmlSetNTBPinActivity
    public PurchaseService setExpandActivityOverflowButtonContentDescription(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (PurchaseService) zaaa.read.create(PurchaseService.class);
    }

    @HmlSetNTBPinActivity
    public AddressService setSubtitle(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (AddressService) zaaa.read.create(AddressService.class);
    }

    @HmlSetNTBPinActivity
    public EkycService setShowingForActionMode(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (EkycService) zaaa.read.create(EkycService.class);
    }

    @HmlSetNTBPinActivity
    public NdidService ActivityChooserView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (NdidService) zaaa.read.create(NdidService.class);
    }

    @HmlSetNTBPinActivity
    public CustomerService MediaBrowserCompat$SearchResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (CustomerService) zaaa.read.create(CustomerService.class);
    }

    @HmlSetNTBPinActivity
    public NTBTileService setItemInvoker(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (NTBTileService) zaaa.read.create(NTBTileService.class);
    }

    @HmlSetNTBPinActivity
    public FundOnboardingService setBackgroundResource(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (FundOnboardingService) zaaa.read.create(FundOnboardingService.class);
    }

    @HmlSetNTBPinActivity
    public FundDiscoverService AppCompatDelegateImpl$ListMenuDecorView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (FundDiscoverService) zaaa.read.create(FundDiscoverService.class);
    }

    @HmlSetNTBPinActivity
    public EDonationService MediaSessionCompat$Token(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "PlainTextServiceGenerator") zaaa zaaa) {
        return (EDonationService) zaaa.read.create(EDonationService.class);
    }

    @HmlSetNTBPinActivity
    public BondService write(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (BondService) zaaa.read.create(BondService.class);
    }

    @HmlSetNTBPinActivity
    public BondTermsAndConditionsService IconCompatParcelizer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "PlainTextServiceGenerator") zaaa zaaa) {
        return (BondTermsAndConditionsService) zaaa.read.create(BondTermsAndConditionsService.class);
    }

    @HmlSetNTBPinActivity
    public ETBService setHasDecor(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (ETBService) zaaa.read.create(ETBService.class);
    }

    @HmlSetNTBPinActivity
    public PDFService ListMenuItemView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "NoSSLServiceGenerator") zaaa zaaa) {
        return (PDFService) zaaa.read.create(PDFService.class);
    }

    @HmlSetNTBPinActivity
    public FastPayService PlaybackStateCompat$CustomAction(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (FastPayService) zaaa.read.create(FastPayService.class);
    }

    @HmlSetNTBPinActivity
    public DebitCardService MediaSessionCompat$QueueItem(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (DebitCardService) zaaa.read.create(DebitCardService.class);
    }

    @HmlSetNTBPinActivity
    public PartnerConsentService ExpandedMenuView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (PartnerConsentService) zaaa.read.create(PartnerConsentService.class);
    }

    @HmlSetNTBPinActivity
    public PartnerAuthorizeService setGroupDividerEnabled(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (PartnerAuthorizeService) zaaa.read.create(PartnerAuthorizeService.class);
    }

    @HmlSetNTBPinActivity
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public DealsService mo13256x50fd9e4a(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (DealsService) zaaa.read.create(DealsService.class);
    }

    @HmlSetNTBPinActivity
    public PartnerService AbsActionBarView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (PartnerService) zaaa.read.create(PartnerService.class);
    }

    @HmlSetNTBPinActivity
    public ForgotPinService PlaybackStateCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "ApiAuthServiceGenerator") zaaa zaaa) {
        return (ForgotPinService) zaaa.read.create(ForgotPinService.class);
    }

    @HmlSetNTBPinActivity
    public TermsConditionsService setPrimaryBackground(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "StaticContentServiceGenerator") zaaa zaaa) {
        return (TermsConditionsService) zaaa.read.create(TermsConditionsService.class);
    }

    @HmlSetNTBPinActivity
    public RegistrationService setContentHeight(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (RegistrationService) zaaa.read.create(RegistrationService.class);
    }

    @HmlSetNTBPinActivity
    public RegistrationWithApiAuthService setTabContainer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "ApiAuthServiceGenerator") zaaa zaaa) {
        return (RegistrationWithApiAuthService) zaaa.read.create(RegistrationWithApiAuthService.class);
    }

    @HmlSetNTBPinActivity
    public ChubbService MediaDescriptionCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (ChubbService) zaaa.read.create(ChubbService.class);
    }

    @HmlSetNTBPinActivity
    public CloseAccountService MediaBrowserCompat$MediaItem(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (CloseAccountService) zaaa.read.create(CloseAccountService.class);
    }

    @HmlSetNTBPinActivity
    public EligibilityService AlertController$RecycleListView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (EligibilityService) zaaa.read.create(EligibilityService.class);
    }

    @HmlSetNTBPinActivity
    public MerchantService setPopupCallback(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (MerchantService) zaaa.read.create(MerchantService.class);
    }

    @HmlSetNTBPinActivity
    public MerchantWalletService setShortcut(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (MerchantWalletService) zaaa.read.create(MerchantWalletService.class);
    }

    @HmlSetNTBPinActivity
    public SecuritiesService setSplitBackground(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (SecuritiesService) zaaa.read.create(SecuritiesService.class);
    }

    @HmlSetNTBPinActivity
    public InvestmentService setExpandedFormat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (InvestmentService) zaaa.read.create(InvestmentService.class);
    }

    @HmlSetNTBPinActivity
    public DebitCardATMService ParcelableVolumeInfo(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (DebitCardATMService) zaaa.read.create(DebitCardATMService.class);
    }

    @HmlSetNTBPinActivity
    public HmlService ActionMenuItemView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "ApiAuthServiceGenerator") zaaa zaaa) {
        return (HmlService) zaaa.read.create(HmlService.class);
    }

    @HmlSetNTBPinActivity
    public HmlBusinessOwnerService AppCompatDialogFragment(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (HmlBusinessOwnerService) zaaa.read.create(HmlBusinessOwnerService.class);
    }

    @HmlSetNTBPinActivity
    public HmlDocumentUploadService setChecked(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "HmlDocumentUploadServiceGenerator") zaaa zaaa) {
        return (HmlDocumentUploadService) zaaa.read.create(HmlDocumentUploadService.class);
    }

    @HmlSetNTBPinActivity
    public HmlConsentService setContentView(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "PlainTextServiceGenerator") zaaa zaaa) {
        return (HmlConsentService) zaaa.read.create(HmlConsentService.class);
    }

    @HmlSetNTBPinActivity
    public BScanCService MediaBrowserCompat$ItemReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (BScanCService) zaaa.read.create(BScanCService.class);
    }

    @HmlSetNTBPinActivity
    public BankingAgentService MediaBrowserCompat$CustomActionResultReceiver(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (BankingAgentService) zaaa.read.create(BankingAgentService.class);
    }

    @HmlSetNTBPinActivity
    public JuristicService setCheckable(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (JuristicService) zaaa.read.create(JuristicService.class);
    }

    @HmlSetNTBPinActivity
    public FriendsService Keep(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (FriendsService) zaaa.read.create(FriendsService.class);
    }

    @HmlSetNTBPinActivity
    public NTBPinLoginService setTitle(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "ApiAuthServiceGenerator") zaaa zaaa) {
        return (NTBPinLoginService) zaaa.read.create(NTBPinLoginService.class);
    }

    @HmlSetNTBPinActivity
    public RemittanceService ActionBarContainer(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (RemittanceService) zaaa.read.create(RemittanceService.class);
    }

    @HmlSetNTBPinActivity
    public PartnerDiscoverWebViewService MenuItemWrapperICS$CollapsibleActionViewWrapper(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (PartnerDiscoverWebViewService) zaaa.read.create(PartnerDiscoverWebViewService.class);
    }

    @HmlSetNTBPinActivity
    public PrivacyManagementService setVisibility(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (PrivacyManagementService) zaaa.read.create(PrivacyManagementService.class);
    }

    @HmlSetNTBPinActivity
    public JustForYouService setIcon(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (JustForYouService) zaaa.read.create(JustForYouService.class);
    }

    @HmlSetNTBPinActivity
    public NsipPartnerPaymentService setForceShowIcon(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (NsipPartnerPaymentService) zaaa.read.create(NsipPartnerPaymentService.class);
    }

    @HmlSetNTBPinActivity
    public GoogleSigninService AppCompatActivity(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "GoogleSigninServiceGenerator") zaaa zaaa) {
        return (GoogleSigninService) zaaa.read.create(GoogleSigninService.class);
    }

    @HmlSetNTBPinActivity
    public DirectDebitService MediaSessionCompat$ResultReceiverWrapper(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (DirectDebitService) zaaa.read.create(DirectDebitService.class);
    }

    @HmlSetNTBPinActivity
    public MailingAddressService setPadding(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (MailingAddressService) zaaa.read.create(MailingAddressService.class);
    }

    @HmlSetNTBPinActivity
    public TouchPointService setStackedBackground(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (TouchPointService) zaaa.read.create(TouchPointService.class);
    }

    @HmlSetNTBPinActivity
    public CSentService MediaMetadataCompat(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (CSentService) zaaa.read.create(CSentService.class);
    }

    @HmlSetNTBPinActivity
    public InsuranceService AppCompatViewInflater(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (InsuranceService) zaaa.read.create(InsuranceService.class);
    }

    @HmlSetNTBPinActivity
    public PayNowService MenuItemImpl(@HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "DefaultServiceGenerator") zaaa zaaa) {
        return (PayNowService) zaaa.read.create(PayNowService.class);
    }
}
