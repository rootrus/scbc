package p040o;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.api.GoogleSigninApi;
import com.scb.phone.data.network.service.DebitCardATMService;
import com.scb.phone.data.network.service.ETBService;
import com.scb.phone.data.network.service.FundDiscoverService;
import com.scb.phone.data.network.service.MerchantService;
import com.scb.phone.data.network.service.MerchantWalletService;
import com.scb.phone.data.network.service.NsipPartnerPaymentService;
import com.scb.phone.data.network.service.PDFService;
import com.scb.phone.data.network.service.PartnerAuthorizeService;
import com.scb.phone.data.network.service.PartnerDiscoverWebViewService;
import com.scb.phone.data.network.service.PartnerService;
import com.scb.phone.data.network.service.TermsConditionsService;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import com.scb.phone.domain.errors.RetrofitException;
import com.scb.phone.domain.interactor.partner.nsip.NsipPartnerPaymentConfirmCase;
import com.scb.phone.service.SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.ScbMapActivity$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.activity.cardmanagement.BaseAmortizationActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.BaseECouponActivity;
import com.scb.phone.view.activity.deeplink.CreditCardServiceDefaultCardDeepLinkActivity;
import com.scb.phone.view.activity.friends.FriendsLandingActivity;
import com.scb.phone.view.activity.hml.businessowner.C5628x19aef3bd;
import com.scb.phone.view.activity.investment.discover.BaseDiscoverSearchActivity;
import com.scb.phone.view.activity.partner.PartnerLandingAdapter;
import com.scb.phone.view.fragment.cardmanagement.C5866x109ad279;
import com.scb.phone.view.fragment.directdebit.C5907x10730e76;
import com.scb.phone.view.fragment.easycash.DurationEmploymentForBusinessDialog;
import com.scb.phone.view.fragment.easycash.EasycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.easycash.EasycashCommonReviewFragment;
import com.scb.phone.view.fragment.hml.C5985x82597580;
import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.internal.cache.DiskLruCache;
import org.threeten.p041bp.OffsetDateTime;
import p039io.beid.beidk.definitions.BeIDParams;
import p040o.AbstractMultimap;
import p040o.Api;
import p040o.BeginSignInRequest;
import p040o.C4323eA;
import p040o.C4771hk;
import p040o.C4773hl;
import p040o.C5011nL;
import p040o.Constraints;
import p040o.ContactUsActivity;
import p040o.CredentialsOptions;
import p040o.CustomConcurrentHashMap;
import p040o.DeepLinkUri;
import p040o.FragmentBuilder_BindHmlNTBManageEmailVerificationFragment;
import p040o.FragmentBuilder_BindNTBLifestyleLandingFragment;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;
import p040o.Functions;
import p040o.GoogleMap;
import p040o.ICancelToken;
import p040o.ILocationSourceDelegate;
import p040o.ImmutableSetMultimap;
import p040o.ListenerHolder;
import p040o.MailingAddressReviewOTPActivity;
import p040o.OnDeviceIdExtractor;
import p040o.PlaceAutocomplete;
import p040o.RemoteCreator;
import p040o.ServerProjectProvider;
import p040o.ShapeStroke;
import p040o.StreetViewPanoramaFragment;
import p040o.Tracker;
import p040o.createElementSet;
import p040o.notNull;
import p040o.onSearchButtonClick;
import p040o.removeAllOccurrences;
import p040o.setupDialog;
import p040o.zzfy;
import p040o.zzgp;
import p040o.zzmd;

/* renamed from: o.zzge */
public final class zzge implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashCommonReviewFragment.IconCompatParcelizer> {
    private final HmlReviewDocumentActivity<C4773hl.read> IconCompatParcelizer;
    private final HmlReviewDocumentActivity<retrieveData> MediaBrowserCompat$CustomActionResultReceiver;
    private final HmlReviewDocumentActivity<FragmentBuilder_BindPreregistrationLandingFragment> MediaBrowserCompat$ItemReceiver;
    private final HmlReviewDocumentActivity<onFailure> MediaBrowserCompat$MediaItem;
    private final HmlReviewDocumentActivity<String> MediaBrowserCompat$SearchResultReceiver;
    private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> MediaDescriptionCompat;
    private final HmlReviewDocumentActivity<notifyCompletion> MediaMetadataCompat;
    private final HmlReviewDocumentActivity<setHintPickerConfig> RatingCompat;
    private final HmlReviewDocumentActivity<getFrontException> read;
    private final HmlReviewDocumentActivity<clearListener> write;

    /* renamed from: o.zzge$zzv */
    public final /* synthetic */ class zzv implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ C5259send IconCompatParcelizer;

        /* renamed from: o.zzge$zzv$zza */
        public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
            public static final /* synthetic */ zza MediaBrowserCompat$CustomActionResultReceiver = new zza();

            private /* synthetic */ zza() {
            }

            public final Object write(Object obj) {
                return (parseUri) ((SingleDataEntity) obj).getData();
            }
        }

        /* renamed from: o.zzge$zzv$zzb */
        public final /* synthetic */ class zzb implements DirectDebitDeepLinkActivity {
            public static final /* synthetic */ zzb IconCompatParcelizer = new zzb();

            private /* synthetic */ zzb() {
            }

            public final Object write(Object obj) {
                return (setEncodedPathSegment) ((SingleDataEntity) obj).getData();
            }
        }

        public /* synthetic */ zzv(C5259send send) {
            this.IconCompatParcelizer = send;
        }

        public final Object write(Object obj) {
            return C5259send.MediaBrowserCompat$CustomActionResultReceiver((query) obj);
        }
    }

    /* renamed from: o.zzge$zzh */
    public final class zzh implements ServerProjectProvider.C70662 {
        private final BaseDiscoverSearchActivity.IconCompatParcelizer IconCompatParcelizer;
        private final isConnecting MediaBrowserCompat$CustomActionResultReceiver;
        private final C7329x31a960dc MediaBrowserCompat$ItemReceiver;
        private FragmentBuilder_BindRemittanceSenderAddressFragment MediaBrowserCompat$MediaItem;
        private final String MediaBrowserCompat$SearchResultReceiver;
        private final onSearchButtonClick.read MediaDescriptionCompat;
        private final ScbMapActivity$MediaBrowserCompat$CustomActionResultReceiver MediaMetadataCompat;
        private final FragmentBuilder_BindQuickTopUpFragment read;
        private final Api.SimpleClient write;

        /* renamed from: o.zzge$zzh$zza */
        public final class zza implements ServerProjectProvider.C70729 {
            private final PartnerAuthorizeService MediaBrowserCompat$CustomActionResultReceiver;

            /* renamed from: o.zzge$zzh$zza$IconCompatParcelizer */
            static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
                public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

                IconCompatParcelizer() {
                }

                public final /* synthetic */ Object write(Object obj) {
                    SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
                    onGetStartedClick.write((Object) singleDataEntity, "entity");
                    return new setMinZoomPreference(((clamp) singleDataEntity.getData()).IconCompatParcelizer);
                }
            }

            @HmlPinActivity
            public zza(PartnerAuthorizeService partnerAuthorizeService) {
                onGetStartedClick.write((Object) partnerAuthorizeService, "partnerAuthorizeService");
                this.MediaBrowserCompat$CustomActionResultReceiver = partnerAuthorizeService;
            }

            public final BScanCNotificationDeepLinkActivity<setMinZoomPreference> read(String str, Map<String, String> map) {
                onGetStartedClick.write((Object) str, "appId");
                onGetStartedClick.write((Object) map, "queryMap");
                BScanCNotificationDeepLinkActivity<SingleDataEntity<clamp>> partnerAuthorize = this.MediaBrowserCompat$CustomActionResultReceiver.getPartnerAuthorize(str, "mobile_easy", "mobile_app", map);
                DirectDebitDeepLinkActivity directDebitDeepLinkActivity = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
                HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
                onCopy oncopy = new onCopy(partnerAuthorize, directDebitDeepLinkActivity);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy, "partnerAuthorizeService.… entity.data.toDomain() }");
                return oncopy;
            }
        }

        @HmlPinActivity
        public zzh(ScbMapActivity$MediaBrowserCompat$CustomActionResultReceiver scbMapActivity$MediaBrowserCompat$CustomActionResultReceiver, BaseDiscoverSearchActivity.IconCompatParcelizer iconCompatParcelizer, FragmentBuilder_BindQuickTopUpFragment fragmentBuilder_BindQuickTopUpFragment, C7329x31a960dc onsearchbuttonclick_mediabrowsercompat_customactionresultreceiver, onSearchButtonClick.read read2, FragmentBuilder_BindRemittanceSenderAddressFragment fragmentBuilder_BindRemittanceSenderAddressFragment, Api.SimpleClient simpleClient, isConnecting isconnecting, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion") String str) {
            this.MediaMetadataCompat = scbMapActivity$MediaBrowserCompat$CustomActionResultReceiver;
            this.IconCompatParcelizer = iconCompatParcelizer;
            this.read = fragmentBuilder_BindQuickTopUpFragment;
            this.MediaBrowserCompat$ItemReceiver = onsearchbuttonclick_mediabrowsercompat_customactionresultreceiver;
            this.MediaDescriptionCompat = read2;
            this.MediaBrowserCompat$MediaItem = fragmentBuilder_BindRemittanceSenderAddressFragment;
            this.write = simpleClient;
            this.MediaBrowserCompat$CustomActionResultReceiver = isconnecting;
            this.MediaBrowserCompat$SearchResultReceiver = str;
        }

        public final DebitCardResetOtpActivity<Boolean> write(cellSet cellset) {
            return this.MediaMetadataCompat.read.verifyRequest(cellset).map(areJsonValuesEquivalent.read);
        }

        public final DebitCardResetOtpActivity<List<newCameraPosition>> MediaBrowserCompat$ItemReceiver() {
            BScanCNotificationDeepLinkActivity<List<R>> list = this.MediaMetadataCompat.read.getIdps().map(zzep.read).map(zzdo.write).flatMapIterable(copyStream.write).map(new zzcm(this.MediaBrowserCompat$ItemReceiver)).toList();
            if (list instanceof HmlLatestLoanOfferStatusDeepLinkActivity) {
                return ((HmlLatestLoanOfferStatusDeepLinkActivity) list).MediaBrowserCompat$CustomActionResultReceiver();
            }
            return new FriendsLandingActivity_ViewBinding(list);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(List<newCameraPosition> list) {
            this.MediaBrowserCompat$MediaItem.write = list;
        }

        public final List<newCameraPosition> IconCompatParcelizer() {
            return this.MediaBrowserCompat$MediaItem.write;
        }

        public final DebitCardResetOtpActivity<List<String>> MediaBrowserCompat$ItemReceiver(ForwardingTable forwardingTable) {
            return this.MediaMetadataCompat.read.confirmRpRequest(forwardingTable).map(RemoteCreator.RemoteCreatorException.write).map(new zzdg(this.MediaDescriptionCompat));
        }

        /* renamed from: o.zzge$zzh$4 */
        static /* synthetic */ class C54934 {
            static final /* synthetic */ int[] IconCompatParcelizer;

            static {
                int[] iArr = new int[CustomConcurrentHashMap.StrongExpirableEvictableEntry.values().length];
                IconCompatParcelizer = iArr;
                try {
                    iArr[CustomConcurrentHashMap.StrongExpirableEvictableEntry.HML.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
            }
        }

        public final DebitCardResetOtpActivity<Boolean> read(CustomConcurrentHashMap.StrongExpirableEvictableEntry strongExpirableEvictableEntry) {
            if (C54934.IconCompatParcelizer[strongExpirableEvictableEntry.ordinal()] != 1) {
                return this.MediaMetadataCompat.read.confirmRpRegistration().map(IOUtils.write);
            }
            BaseDiscoverSearchActivity.IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
            return iconCompatParcelizer.read.completeSubmission(this.read.MediaBrowserCompat$MediaItem, new isContainer(this.read.write, (String) null)).map(readInputStreamFully.IconCompatParcelizer);
        }

        public final DebitCardResetOtpActivity<Boolean> write(MultipartBody.Part part) {
            return this.MediaMetadataCompat.read.uploadPhoto(part).map(isGzipByteBuffer.MediaBrowserCompat$ItemReceiver);
        }

        public final DebitCardCoachMarkActivity read() {
            return DebitCardCoachMarkActivity.IconCompatParcelizer(this.MediaMetadataCompat.read.cancelRpRequest());
        }

        public final DebitCardCoachMarkActivity MediaBrowserCompat$CustomActionResultReceiver() {
            return DebitCardCoachMarkActivity.IconCompatParcelizer(this.MediaMetadataCompat.read.getStatusRpRequest());
        }

        public final DebitCardResetOtpActivity<Boolean> read(valueComparator valuecomparator) {
            return this.MediaMetadataCompat.read.livenessCheck(valuecomparator.MediaMetadataCompat, valuecomparator.MediaSessionCompat$Token, valuecomparator.MediaBrowserCompat$MediaItem, valuecomparator.MediaBrowserCompat$ItemReceiver, valuecomparator.MediaBrowserCompat$SearchResultReceiver, valuecomparator.MediaDescriptionCompat, valuecomparator.MediaBrowserCompat$CustomActionResultReceiver, valuecomparator.IconCompatParcelizer, valuecomparator.read, valuecomparator.write, valuecomparator.RatingCompat, valuecomparator.ParcelableVolumeInfo).map(HttpUtils.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final DebitCardCoachMarkActivity MediaBrowserCompat$ItemReceiver(ForwardingSortedSetMultimap forwardingSortedSetMultimap) {
            forwardingSortedSetMultimap.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$SearchResultReceiver;
            return DebitCardCoachMarkActivity.IconCompatParcelizer(this.MediaMetadataCompat.read.verifyIdentity(forwardingSortedSetMultimap));
        }

        public final DebitCardResetOtpActivity<zoomOut> IconCompatParcelizer(ForwardingSetMultimap forwardingSetMultimap) {
            return this.MediaMetadataCompat.read.getCustomerData(forwardingSetMultimap).map(previous.read).map(new ICancelToken.Stub(this.write));
        }

        public final DebitCardResetOtpActivity<zoomIn> write(standardSubMap standardsubmap) {
            return this.MediaMetadataCompat.read.confirmIdpResponse(standardsubmap).map(writeChar.write).map(new zzei(this.MediaBrowserCompat$CustomActionResultReceiver));
        }
    }

    /* renamed from: o.zzge$zzd */
    final class zzd implements DataPrivacyManagementDeepLinkActivity {
        private final /* synthetic */ FundActionsSuccessActivity write;

        zzd(FundActionsSuccessActivity fundActionsSuccessActivity) {
            this.write = fundActionsSuccessActivity;
        }

        public final /* synthetic */ void read() {
            onGetStartedClick.IconCompatParcelizer(this.write.invoke(), "invoke(...)");
        }

        /* renamed from: o.zzge$zzd$zza */
        public final class zza implements LocalProjectProvider_Factory {
            private final FundDiscoverService read;

            /* renamed from: o.zzge$zzd$zza$read */
            static final class read<T, R> implements DirectDebitDeepLinkActivity<T, R> {
                public static final read read = new read();

                read() {
                }

                public final /* synthetic */ Object write(Object obj) {
                    SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
                    onGetStartedClick.write((Object) singleDataEntity, "it");
                    return (getShapePath) singleDataEntity.getData();
                }
            }

            public zza(FundDiscoverService fundDiscoverService) {
                onGetStartedClick.write((Object) fundDiscoverService, "fundDiscoverService");
                this.read = fundDiscoverService;
            }

            public final BScanCNotificationDeepLinkActivity<setIvAvatar> write() {
                BScanCNotificationDeepLinkActivity<SingleDataEntity<getShapePath>> discoverConfig = this.read.getDiscoverConfig();
                DirectDebitDeepLinkActivity directDebitDeepLinkActivity = read.read;
                HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
                onCopy oncopy = new onCopy(discoverConfig, directDebitDeepLinkActivity);
                DirectDebitDeepLinkActivity directDebitDeepLinkActivity2 = zzge$zzd$zza$MediaBrowserCompat$CustomActionResultReceiver.write;
                HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity2, "mapper is null");
                onCopy oncopy2 = new onCopy(oncopy, directDebitDeepLinkActivity2);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy2, "fundDiscoverService.getD…   .map { it.toDomain() }");
                return oncopy2;
            }

            public final BScanCNotificationDeepLinkActivity<isFastestIntervalExplicitlySet> write(EnumHashBiMap enumHashBiMap) {
                onGetStartedClick.write((Object) enumHashBiMap, "request");
                BScanCNotificationDeepLinkActivity<SingleDataEntity<getCurves>> searchFund = this.read.searchFund(enumHashBiMap);
                DirectDebitDeepLinkActivity directDebitDeepLinkActivity = zzge$zzd$zza$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
                onCopy oncopy = new onCopy(searchFund, directDebitDeepLinkActivity);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy, "fundDiscoverService.sear…ap { it.data.toDomain() }");
                return oncopy;
            }
        }
    }

    /* renamed from: o.zzge$zzm */
    public final class zzm implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindPurchaseProfileManagementFragment.write> {
        private final HmlReviewDocumentActivity<register> IconCompatParcelizer;
        private final HmlReviewDocumentActivity<getSharedApiKey> Keep;
        private final HmlReviewDocumentActivity<CreditCardServiceDefaultCardDeepLinkActivity.write> MediaBrowserCompat$CustomActionResultReceiver;
        private final HmlReviewDocumentActivity<FragmentBuilder_BindProductCatalogFragment> MediaBrowserCompat$ItemReceiver;
        private final HmlReviewDocumentActivity<getApiName> MediaBrowserCompat$MediaItem;
        private final HmlReviewDocumentActivity<ResultCallback> MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private final HmlReviewDocumentActivity<SharedPreferences> f2993x50fd9e4a;
        private final HmlReviewDocumentActivity<createElementSet.IconCompatParcelizer> MediaDescriptionCompat;
        private final HmlReviewDocumentActivity<andFinally> MediaMetadataCompat;
        private final HmlReviewDocumentActivity<Status> MediaSessionCompat$QueueItem;
        private final HmlReviewDocumentActivity<String> MediaSessionCompat$ResultReceiverWrapper;
        private final HmlReviewDocumentActivity<PartnerLandingAdapter.IconCompatParcelizer> MediaSessionCompat$Token;
        private final HmlReviewDocumentActivity<removeAllOccurrences.write> ParcelableVolumeInfo;
        private final HmlReviewDocumentActivity<setPhoneNumberIdentifierSupported> PlaybackStateCompat;
        private final HmlReviewDocumentActivity<onStopCallOnce> PlaybackStateCompat$CustomAction;
        private final HmlReviewDocumentActivity<onTrimMemory> RatingCompat;
        private final HmlReviewDocumentActivity<initialize> read;
        private final HmlReviewDocumentActivity<ApiKey> setHasDecor;
        private final HmlReviewDocumentActivity<FragmentBuilder_ContributeMututalFundOnboardingReviewFragment> write;

        @HmlSetNTBPinActivity
        /* renamed from: o.zzge$zzm$zza */
        public final class zza implements BiMap {
            private final CreditCardServiceDefaultCardDeepLinkActivity.write read;

            /* renamed from: o.zzge$zzm$zza$read */
            static final class read<T, R> implements DirectDebitDeepLinkActivity<T, R> {
                public static final read IconCompatParcelizer = new read();

                read() {
                }

                public final /* bridge */ /* synthetic */ Object write(Object obj) {
                    onGetStartedClick.write((Object) (setCurrentItemInternal) obj, "it");
                    return Boolean.TRUE;
                }
            }

            @HmlPinActivity
            public zza(CreditCardServiceDefaultCardDeepLinkActivity.write write) {
                onGetStartedClick.write((Object) write, "profileApi");
                this.read = write;
            }

            public final DebitCardResetOtpActivity<Boolean> IconCompatParcelizer(fromEntryList fromentrylist) {
                onGetStartedClick.write((Object) fromentrylist, "request");
                DebitCardResetOtpActivity<R> map = this.read.MediaBrowserCompat$CustomActionResultReceiver.acceptTermsAndConditions(fromentrylist).map(read.IconCompatParcelizer);
                onGetStartedClick.IconCompatParcelizer((Object) map, "profileApi.acceptTermsAn…ons(request).map { true }");
                return map;
            }
        }

        private zzm(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CreditCardServiceDefaultCardDeepLinkActivity.write> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<PartnerLandingAdapter.IconCompatParcelizer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<createElementSet.IconCompatParcelizer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeAllOccurrences.write> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<FragmentBuilder_BindProductCatalogFragment> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<register> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<onStopCallOnce> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<ResultCallback> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<andFinally> hmlReviewDocumentActivity11, HmlReviewDocumentActivity<Status> hmlReviewDocumentActivity12, HmlReviewDocumentActivity<setPhoneNumberIdentifierSupported> hmlReviewDocumentActivity13, HmlReviewDocumentActivity<getSharedApiKey> hmlReviewDocumentActivity14, HmlReviewDocumentActivity<getApiName> hmlReviewDocumentActivity15, HmlReviewDocumentActivity<onTrimMemory> hmlReviewDocumentActivity16, HmlReviewDocumentActivity<initialize> hmlReviewDocumentActivity17, HmlReviewDocumentActivity<FragmentBuilder_ContributeMututalFundOnboardingReviewFragment> hmlReviewDocumentActivity18, HmlReviewDocumentActivity<ApiKey> hmlReviewDocumentActivity19) {
            this.MediaSessionCompat$ResultReceiverWrapper = hmlReviewDocumentActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
            this.MediaSessionCompat$Token = hmlReviewDocumentActivity3;
            this.MediaDescriptionCompat = hmlReviewDocumentActivity4;
            this.f2993x50fd9e4a = hmlReviewDocumentActivity5;
            this.ParcelableVolumeInfo = hmlReviewDocumentActivity6;
            this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity7;
            this.IconCompatParcelizer = hmlReviewDocumentActivity8;
            this.PlaybackStateCompat$CustomAction = hmlReviewDocumentActivity9;
            this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity10;
            this.MediaMetadataCompat = hmlReviewDocumentActivity11;
            this.MediaSessionCompat$QueueItem = hmlReviewDocumentActivity12;
            this.PlaybackStateCompat = hmlReviewDocumentActivity13;
            this.Keep = hmlReviewDocumentActivity14;
            this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity15;
            this.RatingCompat = hmlReviewDocumentActivity16;
            this.read = hmlReviewDocumentActivity17;
            this.write = hmlReviewDocumentActivity18;
            this.setHasDecor = hmlReviewDocumentActivity19;
        }

        public static zzm IconCompatParcelizer(HmlReviewDocumentActivity<String> hmlReviewDocumentActivity, HmlReviewDocumentActivity<CreditCardServiceDefaultCardDeepLinkActivity.write> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<PartnerLandingAdapter.IconCompatParcelizer> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<createElementSet.IconCompatParcelizer> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<removeAllOccurrences.write> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<FragmentBuilder_BindProductCatalogFragment> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<register> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<onStopCallOnce> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<ResultCallback> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<andFinally> hmlReviewDocumentActivity11, HmlReviewDocumentActivity<Status> hmlReviewDocumentActivity12, HmlReviewDocumentActivity<setPhoneNumberIdentifierSupported> hmlReviewDocumentActivity13, HmlReviewDocumentActivity<getSharedApiKey> hmlReviewDocumentActivity14, HmlReviewDocumentActivity<getApiName> hmlReviewDocumentActivity15, HmlReviewDocumentActivity<onTrimMemory> hmlReviewDocumentActivity16, HmlReviewDocumentActivity<initialize> hmlReviewDocumentActivity17, HmlReviewDocumentActivity<FragmentBuilder_ContributeMututalFundOnboardingReviewFragment> hmlReviewDocumentActivity18, HmlReviewDocumentActivity<ApiKey> hmlReviewDocumentActivity19) {
            return new zzm(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10, hmlReviewDocumentActivity11, hmlReviewDocumentActivity12, hmlReviewDocumentActivity13, hmlReviewDocumentActivity14, hmlReviewDocumentActivity15, hmlReviewDocumentActivity16, hmlReviewDocumentActivity17, hmlReviewDocumentActivity18, hmlReviewDocumentActivity19);
        }

        public final /* synthetic */ Object get() {
            return new FragmentBuilder_BindPurchaseProfileManagementFragment.write(this.MediaSessionCompat$ResultReceiverWrapper.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaSessionCompat$Token.get(), this.MediaDescriptionCompat.get(), this.f2993x50fd9e4a.get(), this.ParcelableVolumeInfo.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.PlaybackStateCompat$CustomAction.get(), this.MediaBrowserCompat$SearchResultReceiver.get(), this.MediaMetadataCompat.get(), this.MediaSessionCompat$QueueItem.get(), this.PlaybackStateCompat.get(), this.Keep.get(), this.MediaBrowserCompat$MediaItem.get(), this.RatingCompat.get(), this.read.get(), this.write.get(), this.setHasDecor.get());
        }
    }

    /* renamed from: o.zzge$zzf */
    public final class zzf implements OnDeviceIdExtractor.C6966a {
        private static final String MediaBrowserCompat$ItemReceiver = "authorization_code";
        private final GoogleSigninApi IconCompatParcelizer;
        private final FragmentBuilder_BindPurchaseFromTabSelectionFragment read;

        /* renamed from: o.zzge$zzf$zza */
        public final class zza implements ProjectProviderException {
            private final SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
            final Functions.IdentityFunction.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;

            @HmlPinActivity
            public zza(SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver sCBFcmMessagingService$MediaBrowserCompat$ItemReceiver, Functions.IdentityFunction.IconCompatParcelizer iconCompatParcelizer) {
                onGetStartedClick.write((Object) sCBFcmMessagingService$MediaBrowserCompat$ItemReceiver, "service");
                onGetStartedClick.write((Object) iconCompatParcelizer, "storage");
                this.IconCompatParcelizer = sCBFcmMessagingService$MediaBrowserCompat$ItemReceiver;
                this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
            }

            public final DebitCardCoachMarkActivity write(String str, String str2) {
                onGetStartedClick.write((Object) str, "encryptedPin");
                onGetStartedClick.write((Object) str2, "e2eeSid");
                SCBFcmMessagingService$MediaBrowserCompat$ItemReceiver sCBFcmMessagingService$MediaBrowserCompat$ItemReceiver = this.IconCompatParcelizer;
                isStatic isstatic = new isStatic(str, str2);
                onGetStartedClick.write((Object) isstatic, "request");
                DebitCardCoachMarkActivity IconCompatParcelizer2 = DebitCardCoachMarkActivity.IconCompatParcelizer(sCBFcmMessagingService$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.verifyPin(isstatic));
                onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer2, "Completable.fromObservab…rvice.verifyPin(request))");
                DebitCardMarketConductDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver2 = HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver();
                DebitCardMarketConductDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver3 = HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver();
                DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity = HmlCalculatorDeepLinkActivity.read;
                DebitCardCoachMarkActivity write = IconCompatParcelizer2.write(MediaBrowserCompat$CustomActionResultReceiver2, MediaBrowserCompat$CustomActionResultReceiver3, new read(this), dataPrivacyManagementDeepLinkActivity, dataPrivacyManagementDeepLinkActivity, HmlCalculatorDeepLinkActivity.read);
                onGetStartedClick.IconCompatParcelizer((Object) write, "service.verifyPin(NTBPin…n(true)\n                }");
                return write;
            }

            /* renamed from: o.zzge$zzf$zza$read */
            static final class read implements DataPrivacyManagementDeepLinkActivity {
                private /* synthetic */ zza read;

                read(zza zza) {
                    this.read = zza;
                }

                public final void read() {
                    this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = true;
                }
            }

            public final BScanCNotificationDeepLinkActivity<Boolean> read() {
                BScanCNotificationDeepLinkActivity<Boolean> read2 = BScanCNotificationDeepLinkActivity.read(Boolean.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver));
                onGetStartedClick.IconCompatParcelizer((Object) read2, "Single.just(storage.isInNTBLoginSession())");
                return read2;
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = false;
            }

            public final void IconCompatParcelizer() {
                this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.edit().remove("randomDeviceId").apply();
            }
        }

        @HmlPinActivity
        public zzf(GoogleSigninApi googleSigninApi, FragmentBuilder_BindPurchaseFromTabSelectionFragment fragmentBuilder_BindPurchaseFromTabSelectionFragment) {
            onGetStartedClick.write((Object) googleSigninApi, "googleSigninApi");
            onGetStartedClick.write((Object) fragmentBuilder_BindPurchaseFromTabSelectionFragment, "googleSigninKeyCache");
            this.IconCompatParcelizer = googleSigninApi;
            this.read = fragmentBuilder_BindPurchaseFromTabSelectionFragment;
        }

        /* renamed from: o.zzge$zzf$read */
        public static final class read {
            public final byte[][] MediaBrowserCompat$CustomActionResultReceiver;
            public final int MediaBrowserCompat$ItemReceiver;
            public final int read;

            private read() {
            }

            public read(int i, int i2) {
                int[] iArr = new int[2];
                iArr[1] = i;
                iArr[0] = i2;
                this.MediaBrowserCompat$CustomActionResultReceiver = (byte[][]) Array.newInstance(Byte.TYPE, iArr);
                this.read = i;
                this.MediaBrowserCompat$ItemReceiver = i2;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder(((this.read << 1) * this.MediaBrowserCompat$ItemReceiver) + 2);
                for (int i = 0; i < this.MediaBrowserCompat$ItemReceiver; i++) {
                    byte[] bArr = this.MediaBrowserCompat$CustomActionResultReceiver[i];
                    for (int i2 = 0; i2 < this.read; i2++) {
                        byte b = bArr[i2];
                        if (b == 0) {
                            sb.append(" 0");
                        } else if (b != 1) {
                            sb.append("  ");
                        } else {
                            sb.append(" 1");
                        }
                    }
                    sb.append(10);
                }
                return sb.toString();
            }
        }

        public final DebitCardResetOtpActivity<setPositionFromBounds> read(String str, String str2) {
            onGetStartedClick.write((Object) str, "authToken");
            onGetStartedClick.write((Object) str2, "clientId");
            DebitCardResetOtpActivity<R> map = this.IconCompatParcelizer.postGoogleSignin(new Object(str, MediaBrowserCompat$ItemReceiver, this.read.IconCompatParcelizer, str2) {
                private final String IconCompatParcelizer;
                private final String MediaBrowserCompat$CustomActionResultReceiver;
                private final String MediaBrowserCompat$ItemReceiver;
                private final String write;

                public final boolean equals(
/*
Method generation error in method: o.LottieAnimationView.3.equals(java.lang.Object):boolean, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.LottieAnimationView.3.equals(java.lang.Object):boolean, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final int hashCode(
/*
Method generation error in method: o.LottieAnimationView.3.hashCode():int, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.LottieAnimationView.3.hashCode():int, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/

                public final java.lang.String toString(
/*
Method generation error in method: o.LottieAnimationView.3.toString():java.lang.String, dex: classes.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.LottieAnimationView.3.toString():java.lang.String, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.addArgDot(InsnGen.java:91)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:697)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            }).map(zzge$zzf$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) map, "googleSigninApi.postGoog…ty -> entity.toDomain() }");
            return map;
        }
    }

    /* renamed from: o.zzge$zzi */
    public final class zzi implements OPRStatusRewardsLandingActivity_ViewBinding<zzg.zzb> {
        private final HmlReviewDocumentActivity<reconnect> IconCompatParcelizer;
        private final HmlReviewDocumentActivity<withHolder> MediaBrowserCompat$CustomActionResultReceiver;
        private final HmlReviewDocumentActivity<NsipPartnerPaymentService> MediaBrowserCompat$ItemReceiver;
        private final HmlReviewDocumentActivity<maybeSignIn> read;

        /* renamed from: o.zzge$zzi$zza */
        public final class zza implements OPRStatusRewardsLandingActivity_ViewBinding<zzk> {
            private final HmlReviewDocumentActivity<BaseAmortizationActivity.read> MediaBrowserCompat$ItemReceiver;

            private zza(HmlReviewDocumentActivity<BaseAmortizationActivity.read> hmlReviewDocumentActivity) {
                this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
            }

            public static zza write(HmlReviewDocumentActivity<BaseAmortizationActivity.read> hmlReviewDocumentActivity) {
                return new zza(hmlReviewDocumentActivity);
            }

            public final /* synthetic */ Object get() {
                return new zzk(this.MediaBrowserCompat$ItemReceiver.get());
            }
        }

        private zzi(HmlReviewDocumentActivity<maybeSignIn> hmlReviewDocumentActivity, HmlReviewDocumentActivity<reconnect> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<withHolder> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<NsipPartnerPaymentService> hmlReviewDocumentActivity4) {
            this.read = hmlReviewDocumentActivity;
            this.IconCompatParcelizer = hmlReviewDocumentActivity2;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity3;
            this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity4;
        }

        public static zzi read(HmlReviewDocumentActivity<maybeSignIn> hmlReviewDocumentActivity, HmlReviewDocumentActivity<reconnect> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<withHolder> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<NsipPartnerPaymentService> hmlReviewDocumentActivity4) {
            return new zzi(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
        }

        public final /* synthetic */ Object get() {
            return new zzg.zzb(this.read.get(), this.IconCompatParcelizer.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$ItemReceiver.get());
        }
    }

    /* renamed from: o.zzge$zzj */
    public final class zzj implements FragmentBuilder_BindCcSofBillPaymentInputFragment {
        private final PartnerDiscoverWebViewService MediaBrowserCompat$CustomActionResultReceiver;
        final Gson read;
        final onLoadFinished write;

        /* renamed from: o.zzge$zzj$zzb */
        public final class zzb implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindNTBLifestyleLandingFragment.write> {
            private final HmlReviewDocumentActivity<PartnerService> MediaBrowserCompat$ItemReceiver;

            private zzb(HmlReviewDocumentActivity<PartnerService> hmlReviewDocumentActivity) {
                this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
            }

            public static zzb MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<PartnerService> hmlReviewDocumentActivity) {
                return new zzb(hmlReviewDocumentActivity);
            }

            public final /* synthetic */ Object get() {
                return new FragmentBuilder_BindNTBLifestyleLandingFragment.write(this.MediaBrowserCompat$ItemReceiver.get());
            }
        }

        /* renamed from: o.zzge$zzj$IconCompatParcelizer */
        static final class IconCompatParcelizer<T> implements DebitCardMarketConductDeepLinkActivity<LocationServices> {
            private /* synthetic */ zzj MediaBrowserCompat$CustomActionResultReceiver;

            IconCompatParcelizer(zzj zzj) {
                this.MediaBrowserCompat$CustomActionResultReceiver = zzj;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                LocationServices locationServices = (LocationServices) obj;
                onGetStartedClick.IconCompatParcelizer((Object) locationServices, "entity");
                onGetStartedClick.write((Object) locationServices, "investmentNow");
                if (locationServices.MediaBrowserCompat$ItemReceiver) {
                    getInitialTrigger getinitialtrigger = locationServices.read;
                    if (getinitialtrigger == null) {
                        throw new EntityMappingException("InvestmentNow.riskProfile must not be null or empty");
                    } else if (2 == getinitialtrigger.IconCompatParcelizer) {
                        Collection collection = locationServices.MediaBrowserCompat$CustomActionResultReceiver;
                        if (collection == null || collection.isEmpty()) {
                            throw new EntityMappingException("InvestmentNow.clientList must not be null or empty");
                        }
                    }
                }
            }
        }

        /* renamed from: o.zzge$zzj$read */
        static final class read<T, R> implements DirectDebitDeepLinkActivity<T, R> {
            private /* synthetic */ zzj MediaBrowserCompat$ItemReceiver;

            read(zzj zzj) {
                this.MediaBrowserCompat$ItemReceiver = zzj;
            }

            public final /* synthetic */ Object write(Object obj) {
                JsonObject jsonObject = (JsonObject) obj;
                onGetStartedClick.write((Object) jsonObject, "it");
                return this.MediaBrowserCompat$ItemReceiver.read.toJson((JsonElement) jsonObject);
            }
        }

        /* renamed from: o.zzge$zzj$zza */
        public final class zza implements OPRStatusRewardsLandingActivity_ViewBinding<zzh.zza> {
            private final HmlReviewDocumentActivity<PartnerAuthorizeService> MediaBrowserCompat$ItemReceiver;

            private zza(HmlReviewDocumentActivity<PartnerAuthorizeService> hmlReviewDocumentActivity) {
                this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
            }

            public static zza write(HmlReviewDocumentActivity<PartnerAuthorizeService> hmlReviewDocumentActivity) {
                return new zza(hmlReviewDocumentActivity);
            }

            public final /* synthetic */ Object get() {
                return new zzh.zza(this.MediaBrowserCompat$ItemReceiver.get());
            }
        }

        @HmlPinActivity
        public zzj(PartnerDiscoverWebViewService partnerDiscoverWebViewService, onLoadFinished onloadfinished, Gson gson) {
            onGetStartedClick.write((Object) partnerDiscoverWebViewService, "partnerDiscoverWebViewService");
            onGetStartedClick.write((Object) onloadfinished, "investmentNowEntityMapper");
            onGetStartedClick.write((Object) gson, "gson");
            this.MediaBrowserCompat$CustomActionResultReceiver = partnerDiscoverWebViewService;
            this.write = onloadfinished;
            this.read = gson;
        }

        public final BScanCNotificationDeepLinkActivity<String> read(RequestBody requestBody) {
            onGetStartedClick.write((Object) requestBody, "params");
            BScanCNotificationDeepLinkActivity<JsonObject> fundData = this.MediaBrowserCompat$CustomActionResultReceiver.getFundData(requestBody);
            DirectDebitDeepLinkActivity zzge_zzj_mediabrowsercompat_customactionresultreceiver = new zzge$zzj$MediaBrowserCompat$CustomActionResultReceiver(this);
            HmlLatestPersonalInformationDeepLinkActivity.write(zzge_zzj_mediabrowsercompat_customactionresultreceiver, "mapper is null");
            onCopy oncopy = new onCopy(fundData, zzge_zzj_mediabrowsercompat_customactionresultreceiver);
            onGetStartedClick.IconCompatParcelizer((Object) oncopy, "partnerDiscoverWebViewSe…).map { gson.toJson(it) }");
            return oncopy;
        }

        public final BScanCNotificationDeepLinkActivity<String> write(RequestBody requestBody) {
            onGetStartedClick.write((Object) requestBody, "params");
            BScanCNotificationDeepLinkActivity<JsonObject> historicalData = this.MediaBrowserCompat$CustomActionResultReceiver.getHistoricalData(requestBody);
            DirectDebitDeepLinkActivity read2 = new read(this);
            HmlLatestPersonalInformationDeepLinkActivity.write(read2, "mapper is null");
            onCopy oncopy = new onCopy(historicalData, read2);
            onGetStartedClick.IconCompatParcelizer((Object) oncopy, "partnerDiscoverWebViewSe…).map { gson.toJson(it) }");
            return oncopy;
        }

        public final BScanCNotificationDeepLinkActivity<LocationServices> MediaBrowserCompat$CustomActionResultReceiver(RequestBody requestBody) {
            onGetStartedClick.write((Object) requestBody, "params");
            BScanCNotificationDeepLinkActivity<SingleDataEntity<ShapeStroke.LineCapType>> investFund = this.MediaBrowserCompat$CustomActionResultReceiver.getInvestFund(requestBody);
            DirectDebitDeepLinkActivity zzge_zzj_mediabrowsercompat_itemreceiver = new zzge$zzj$MediaBrowserCompat$ItemReceiver(this);
            HmlLatestPersonalInformationDeepLinkActivity.write(zzge_zzj_mediabrowsercompat_itemreceiver, "mapper is null");
            onCopy oncopy = new onCopy(investFund, zzge_zzj_mediabrowsercompat_itemreceiver);
            DebitCardMarketConductDeepLinkActivity iconCompatParcelizer = new IconCompatParcelizer(this);
            HmlLatestPersonalInformationDeepLinkActivity.write(iconCompatParcelizer, "onSuccess is null");
            ReviewDeviceActivity_ViewBinding reviewDeviceActivity_ViewBinding = new ReviewDeviceActivity_ViewBinding(oncopy, iconCompatParcelizer);
            onGetStartedClick.IconCompatParcelizer((Object) reviewDeviceActivity_ViewBinding, "partnerDiscoverWebViewSe…lidateIntegrity(entity) }");
            return reviewDeviceActivity_ViewBinding;
        }
    }

    /* renamed from: o.zzge$zzl */
    public final class zzl implements OPRStatusRewardsLandingActivity_ViewBinding<setRootView$MediaBrowserCompat$ItemReceiver> {
        private final HmlReviewDocumentActivity<MailingAddressReviewOTPActivity.write> MediaBrowserCompat$CustomActionResultReceiver;
        private final HmlReviewDocumentActivity<TermsConditionsService> read;
        private final HmlReviewDocumentActivity<SharedPreferences> write;

        /* renamed from: o.zzge$zzl$zza */
        public final class zza implements OPRStatusRewardsLandingActivity_ViewBinding<zzm.zza> {
            private final HmlReviewDocumentActivity<CreditCardServiceDefaultCardDeepLinkActivity.write> read;

            private zza(HmlReviewDocumentActivity<CreditCardServiceDefaultCardDeepLinkActivity.write> hmlReviewDocumentActivity) {
                this.read = hmlReviewDocumentActivity;
            }

            public static zza read(HmlReviewDocumentActivity<CreditCardServiceDefaultCardDeepLinkActivity.write> hmlReviewDocumentActivity) {
                return new zza(hmlReviewDocumentActivity);
            }

            public final /* synthetic */ Object get() {
                return new zzm.zza(this.read.get());
            }
        }

        private zzl(HmlReviewDocumentActivity<TermsConditionsService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<MailingAddressReviewOTPActivity.write> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity3) {
            this.read = hmlReviewDocumentActivity;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
            this.write = hmlReviewDocumentActivity3;
        }

        public static zzl MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<TermsConditionsService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<MailingAddressReviewOTPActivity.write> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity3) {
            return new zzl(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3);
        }

        public final /* synthetic */ Object get() {
            HmlReviewDocumentActivity<TermsConditionsService> hmlReviewDocumentActivity = this.read;
            HmlReviewDocumentActivity<MailingAddressReviewOTPActivity.write> hmlReviewDocumentActivity2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            HmlReviewDocumentActivity<SharedPreferences> hmlReviewDocumentActivity3 = this.write;
            hmlReviewDocumentActivity.get();
            hmlReviewDocumentActivity2.get();
            return new setRootView$MediaBrowserCompat$ItemReceiver(hmlReviewDocumentActivity3.get());
        }
    }

    /* renamed from: o.zzge$zzb */
    public final class zzb implements OPRStatusRewardsLandingActivity_ViewBinding<EasycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver> {
        private final HmlReviewDocumentActivity<NsipPartnerPaymentConfirmCase.IconCompatParcelizer> IconCompatParcelizer;

        private zzb(HmlReviewDocumentActivity<NsipPartnerPaymentConfirmCase.IconCompatParcelizer> hmlReviewDocumentActivity) {
            this.IconCompatParcelizer = hmlReviewDocumentActivity;
        }

        public static zzb read(HmlReviewDocumentActivity<NsipPartnerPaymentConfirmCase.IconCompatParcelizer> hmlReviewDocumentActivity) {
            return new zzb(hmlReviewDocumentActivity);
        }

        /* renamed from: o.zzge$zzb$zza */
        public final class zza implements OPRStatusRewardsLandingActivity_ViewBinding<DurationEmploymentForBusinessDialog.read> {
            private final HmlReviewDocumentActivity<setTitleOverrideText> AlertController$RecycleListView;
            private final HmlReviewDocumentActivity<enableAutoActivityTracking> IconCompatParcelizer;
            private final HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> Keep;
            private final HmlReviewDocumentActivity<getDisplayName> MediaBrowserCompat$CustomActionResultReceiver;
            private final HmlReviewDocumentActivity<setFatal> MediaBrowserCompat$ItemReceiver;
            private final HmlReviewDocumentActivity<C4771hk.read> MediaBrowserCompat$MediaItem;
            private final HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidTravelDetailTabFragment> MediaBrowserCompat$SearchResultReceiver;

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            private final HmlReviewDocumentActivity<onSearchButtonClick.IconCompatParcelizer> f2989x50fd9e4a;
            private final HmlReviewDocumentActivity<SignInCredential> MediaDescriptionCompat;
            private final HmlReviewDocumentActivity<FragmentBuilder_ContributeMututalFundOnboardingReviewFragment> MediaMetadataCompat;
            private final HmlReviewDocumentActivity<hasPermissions> MediaSessionCompat$QueueItem;
            private final HmlReviewDocumentActivity<FragmentBuilder_BindQuickTopUpFragment> MediaSessionCompat$ResultReceiverWrapper;
            private final HmlReviewDocumentActivity<C10852onClick> MediaSessionCompat$Token;
            private final HmlReviewDocumentActivity<GoogleAnalytics> ParcelableVolumeInfo;
            private final HmlReviewDocumentActivity<zzp> PlaybackStateCompat;
            private final HmlReviewDocumentActivity<ContactUsActivity.CustomActionBar.write> PlaybackStateCompat$CustomAction;
            private final HmlReviewDocumentActivity<PrepaidTravelCaseModule> RatingCompat;
            private final HmlReviewDocumentActivity<getAccountId> read;
            private final HmlReviewDocumentActivity<String> setContentView;
            private final HmlReviewDocumentActivity<onConnectionFailed> setHasDecor;
            private final HmlReviewDocumentActivity<setAction> write;

            private zza(HmlReviewDocumentActivity<C4771hk.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<onConnectionFailed> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<ContactUsActivity.CustomActionBar.write> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C10852onClick> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<FragmentBuilder_ContributeMututalFundOnboardingReviewFragment> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<enableAutoActivityTracking> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<zzp> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<setAction> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidTravelDetailTabFragment> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<getAccountId> hmlReviewDocumentActivity11, HmlReviewDocumentActivity<onSearchButtonClick.IconCompatParcelizer> hmlReviewDocumentActivity12, HmlReviewDocumentActivity<PrepaidTravelCaseModule> hmlReviewDocumentActivity13, HmlReviewDocumentActivity<GoogleAnalytics> hmlReviewDocumentActivity14, HmlReviewDocumentActivity<getDisplayName> hmlReviewDocumentActivity15, HmlReviewDocumentActivity<FragmentBuilder_BindQuickTopUpFragment> hmlReviewDocumentActivity16, HmlReviewDocumentActivity<hasPermissions> hmlReviewDocumentActivity17, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity18, HmlReviewDocumentActivity<setFatal> hmlReviewDocumentActivity19, HmlReviewDocumentActivity<SignInCredential> hmlReviewDocumentActivity20, HmlReviewDocumentActivity<setTitleOverrideText> hmlReviewDocumentActivity21) {
                this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity;
                this.Keep = hmlReviewDocumentActivity2;
                this.setHasDecor = hmlReviewDocumentActivity3;
                this.PlaybackStateCompat$CustomAction = hmlReviewDocumentActivity4;
                this.MediaSessionCompat$Token = hmlReviewDocumentActivity5;
                this.MediaMetadataCompat = hmlReviewDocumentActivity6;
                this.IconCompatParcelizer = hmlReviewDocumentActivity7;
                this.PlaybackStateCompat = hmlReviewDocumentActivity8;
                this.write = hmlReviewDocumentActivity9;
                this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity10;
                this.read = hmlReviewDocumentActivity11;
                this.f2989x50fd9e4a = hmlReviewDocumentActivity12;
                this.RatingCompat = hmlReviewDocumentActivity13;
                this.ParcelableVolumeInfo = hmlReviewDocumentActivity14;
                this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity15;
                this.MediaSessionCompat$ResultReceiverWrapper = hmlReviewDocumentActivity16;
                this.MediaSessionCompat$QueueItem = hmlReviewDocumentActivity17;
                this.setContentView = hmlReviewDocumentActivity18;
                this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity19;
                this.MediaDescriptionCompat = hmlReviewDocumentActivity20;
                this.AlertController$RecycleListView = hmlReviewDocumentActivity21;
            }

            public static zza IconCompatParcelizer(HmlReviewDocumentActivity<C4771hk.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<onConnectionFailed> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<ContactUsActivity.CustomActionBar.write> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<C10852onClick> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<FragmentBuilder_ContributeMututalFundOnboardingReviewFragment> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<enableAutoActivityTracking> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<zzp> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<setAction> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidTravelDetailTabFragment> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<getAccountId> hmlReviewDocumentActivity11, HmlReviewDocumentActivity<onSearchButtonClick.IconCompatParcelizer> hmlReviewDocumentActivity12, HmlReviewDocumentActivity<PrepaidTravelCaseModule> hmlReviewDocumentActivity13, HmlReviewDocumentActivity<GoogleAnalytics> hmlReviewDocumentActivity14, HmlReviewDocumentActivity<getDisplayName> hmlReviewDocumentActivity15, HmlReviewDocumentActivity<FragmentBuilder_BindQuickTopUpFragment> hmlReviewDocumentActivity16, HmlReviewDocumentActivity<hasPermissions> hmlReviewDocumentActivity17, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity18, HmlReviewDocumentActivity<setFatal> hmlReviewDocumentActivity19, HmlReviewDocumentActivity<SignInCredential> hmlReviewDocumentActivity20, HmlReviewDocumentActivity<setTitleOverrideText> hmlReviewDocumentActivity21) {
                return new zza(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10, hmlReviewDocumentActivity11, hmlReviewDocumentActivity12, hmlReviewDocumentActivity13, hmlReviewDocumentActivity14, hmlReviewDocumentActivity15, hmlReviewDocumentActivity16, hmlReviewDocumentActivity17, hmlReviewDocumentActivity18, hmlReviewDocumentActivity19, hmlReviewDocumentActivity20, hmlReviewDocumentActivity21);
            }

            public final /* synthetic */ Object get() {
                HmlReviewDocumentActivity<C4771hk.read> hmlReviewDocumentActivity = this.MediaBrowserCompat$MediaItem;
                HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity2 = this.Keep;
                HmlReviewDocumentActivity<onConnectionFailed> hmlReviewDocumentActivity3 = this.setHasDecor;
                HmlReviewDocumentActivity<ContactUsActivity.CustomActionBar.write> hmlReviewDocumentActivity4 = this.PlaybackStateCompat$CustomAction;
                HmlReviewDocumentActivity<C10852onClick> hmlReviewDocumentActivity5 = this.MediaSessionCompat$Token;
                HmlReviewDocumentActivity<FragmentBuilder_ContributeMututalFundOnboardingReviewFragment> hmlReviewDocumentActivity6 = this.MediaMetadataCompat;
                HmlReviewDocumentActivity<enableAutoActivityTracking> hmlReviewDocumentActivity7 = this.IconCompatParcelizer;
                HmlReviewDocumentActivity<zzp> hmlReviewDocumentActivity8 = this.PlaybackStateCompat;
                HmlReviewDocumentActivity<setAction> hmlReviewDocumentActivity9 = this.write;
                HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidTravelDetailTabFragment> hmlReviewDocumentActivity10 = this.MediaBrowserCompat$SearchResultReceiver;
                HmlReviewDocumentActivity<getAccountId> hmlReviewDocumentActivity11 = this.read;
                HmlReviewDocumentActivity<onSearchButtonClick.IconCompatParcelizer> hmlReviewDocumentActivity12 = this.f2989x50fd9e4a;
                HmlReviewDocumentActivity<PrepaidTravelCaseModule> hmlReviewDocumentActivity13 = this.RatingCompat;
                HmlReviewDocumentActivity<GoogleAnalytics> hmlReviewDocumentActivity14 = this.ParcelableVolumeInfo;
                HmlReviewDocumentActivity<getDisplayName> hmlReviewDocumentActivity15 = this.MediaBrowserCompat$CustomActionResultReceiver;
                HmlReviewDocumentActivity<FragmentBuilder_BindQuickTopUpFragment> hmlReviewDocumentActivity16 = this.MediaSessionCompat$ResultReceiverWrapper;
                HmlReviewDocumentActivity<hasPermissions> hmlReviewDocumentActivity17 = this.MediaSessionCompat$QueueItem;
                HmlReviewDocumentActivity<String> hmlReviewDocumentActivity18 = this.setContentView;
                HmlReviewDocumentActivity<setFatal> hmlReviewDocumentActivity19 = this.MediaBrowserCompat$ItemReceiver;
                HmlReviewDocumentActivity<SignInCredential> hmlReviewDocumentActivity20 = this.MediaDescriptionCompat;
                HmlReviewDocumentActivity<setTitleOverrideText> hmlReviewDocumentActivity21 = this.AlertController$RecycleListView;
                hmlReviewDocumentActivity14.get();
                return new DurationEmploymentForBusinessDialog.read(hmlReviewDocumentActivity.get(), hmlReviewDocumentActivity2.get(), hmlReviewDocumentActivity3.get(), hmlReviewDocumentActivity4.get(), hmlReviewDocumentActivity5.get(), hmlReviewDocumentActivity6.get(), hmlReviewDocumentActivity7.get(), hmlReviewDocumentActivity8.get(), hmlReviewDocumentActivity9.get(), hmlReviewDocumentActivity10.get(), hmlReviewDocumentActivity11.get(), hmlReviewDocumentActivity12.get(), hmlReviewDocumentActivity13.get(), hmlReviewDocumentActivity15.get(), hmlReviewDocumentActivity16.get(), hmlReviewDocumentActivity17.get(), hmlReviewDocumentActivity18.get(), hmlReviewDocumentActivity19.get(), hmlReviewDocumentActivity20.get(), hmlReviewDocumentActivity21.get());
            }
        }

        public final /* synthetic */ Object get() {
            return new EasycashBaseReviewFragment$MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get());
        }
    }

    /* renamed from: o.zzge$zze */
    public final class zze implements C7513tX {
        setIdTokenNonce IconCompatParcelizer;
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        private C5628x19aef3bd MediaBrowserCompat$ItemReceiver;

        @HmlPinActivity
        public zze(C5628x19aef3bd hmlNTBBusinessURLInformationActivity$MediaBrowserCompat$ItemReceiver, setIdTokenNonce setidtokennonce, String str) {
            onGetStartedClick.write((Object) hmlNTBBusinessURLInformationActivity$MediaBrowserCompat$ItemReceiver, "easycashDFWYNApi");
            onGetStartedClick.write((Object) setidtokennonce, "easycashReferralDFWYNMapper");
            onGetStartedClick.write((Object) str, "tileVersion");
            this.MediaBrowserCompat$ItemReceiver = hmlNTBBusinessURLInformationActivity$MediaBrowserCompat$ItemReceiver;
            this.IconCompatParcelizer = setidtokennonce;
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final BScanCNotificationDeepLinkActivity<registerOnMeasurementEventListener> MediaBrowserCompat$ItemReceiver(String str) {
            onGetStartedClick.write((Object) str, "productType");
            C5628x19aef3bd hmlNTBBusinessURLInformationActivity$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) str, "productType");
            onGetStartedClick.write((Object) str2, "tileVersion");
            BScanCNotificationDeepLinkActivity<SingleDataEntity<notifyFailureListeners>> referralProductDFWYN = hmlNTBBusinessURLInformationActivity$MediaBrowserCompat$ItemReceiver.write.getReferralProductDFWYN(str, str2);
            DirectDebitDeepLinkActivity zzge_zze_mediabrowsercompat_itemreceiver = new zzge$zze$MediaBrowserCompat$ItemReceiver(this);
            HmlLatestPersonalInformationDeepLinkActivity.write(zzge_zze_mediabrowsercompat_itemreceiver, "mapper is null");
            onCopy oncopy = new onCopy(referralProductDFWYN, zzge_zze_mediabrowsercompat_itemreceiver);
            onGetStartedClick.IconCompatParcelizer((Object) oncopy, "easycashDFWYNApi.getRefe…transformDFWYN(it.data) }");
            return oncopy;
        }

        /* renamed from: o.zzge$zze$zza */
        public final class zza implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindDiscoverFragment> {
            private final HmlReviewDocumentActivity<Api.ApiOptions> IconCompatParcelizer;
            private final HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseProfileManagementFragment.write> MediaBrowserCompat$ItemReceiver;
            private final HmlReviewDocumentActivity<MerchantService> read;
            private final HmlReviewDocumentActivity<FragmentBuilder_BindRemittanceSuccessFragment> write;

            private zza(HmlReviewDocumentActivity<MerchantService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseProfileManagementFragment.write> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<Api.ApiOptions> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<FragmentBuilder_BindRemittanceSuccessFragment> hmlReviewDocumentActivity4) {
                this.read = hmlReviewDocumentActivity;
                this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
                this.IconCompatParcelizer = hmlReviewDocumentActivity3;
                this.write = hmlReviewDocumentActivity4;
            }

            public static zza read(HmlReviewDocumentActivity<MerchantService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseProfileManagementFragment.write> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<Api.ApiOptions> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<FragmentBuilder_BindRemittanceSuccessFragment> hmlReviewDocumentActivity4) {
                return new zza(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4);
            }

            public final /* synthetic */ Object get() {
                return new FragmentBuilder_BindDiscoverFragment(this.read.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.IconCompatParcelizer.get(), this.write.get());
            }
        }

        /* renamed from: o.zzge$zze$zzb */
        public final class zzb implements OPRStatusRewardsLandingActivity_ViewBinding<FragmentBuilder_BindECouponQuantityFragment> {
            private final HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseFromTabSelectionFragment> IconCompatParcelizer;
            private final HmlReviewDocumentActivity<Api.ApiOptions.Optional> MediaBrowserCompat$CustomActionResultReceiver;
            private final HmlReviewDocumentActivity<Api.ApiOptions.HasGoogleSignInAccountOptions> MediaBrowserCompat$ItemReceiver;
            private final HmlReviewDocumentActivity<getRequiredFeatures> MediaBrowserCompat$MediaItem;
            private final HmlReviewDocumentActivity<FragmentBuilder_BindRemittanceReviewFragment> MediaBrowserCompat$SearchResultReceiver;

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            private final HmlReviewDocumentActivity<TermsConditionsService> f2991x50fd9e4a;
            private final HmlReviewDocumentActivity<FragmentBuilder_BindSelectPurchaseFragment> MediaDescriptionCompat;
            private final HmlReviewDocumentActivity<getEndpointPackageName> MediaMetadataCompat;
            private final HmlReviewDocumentActivity<isConnected> MediaSessionCompat$Token;
            private final HmlReviewDocumentActivity<MerchantWalletService> RatingCompat;
            private final HmlReviewDocumentActivity<Api.Client> read;
            private final HmlReviewDocumentActivity<getAvailableFeatures> write;

            private zzb(HmlReviewDocumentActivity<getAvailableFeatures> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Api.ApiOptions.Optional> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<MerchantWalletService> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<isConnected> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<TermsConditionsService> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<getRequiredFeatures> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Api.ApiOptions.HasGoogleSignInAccountOptions> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<getEndpointPackageName> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<FragmentBuilder_BindRemittanceReviewFragment> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<FragmentBuilder_BindSelectPurchaseFragment> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<Api.Client> hmlReviewDocumentActivity11, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseFromTabSelectionFragment> hmlReviewDocumentActivity12) {
                this.write = hmlReviewDocumentActivity;
                this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity2;
                this.RatingCompat = hmlReviewDocumentActivity3;
                this.MediaSessionCompat$Token = hmlReviewDocumentActivity4;
                this.f2991x50fd9e4a = hmlReviewDocumentActivity5;
                this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity6;
                this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity7;
                this.MediaMetadataCompat = hmlReviewDocumentActivity8;
                this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity9;
                this.MediaDescriptionCompat = hmlReviewDocumentActivity10;
                this.read = hmlReviewDocumentActivity11;
                this.IconCompatParcelizer = hmlReviewDocumentActivity12;
            }

            public static zzb MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<getAvailableFeatures> hmlReviewDocumentActivity, HmlReviewDocumentActivity<Api.ApiOptions.Optional> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<MerchantWalletService> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<isConnected> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<TermsConditionsService> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<getRequiredFeatures> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<Api.ApiOptions.HasGoogleSignInAccountOptions> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<getEndpointPackageName> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<FragmentBuilder_BindRemittanceReviewFragment> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<FragmentBuilder_BindSelectPurchaseFragment> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<Api.Client> hmlReviewDocumentActivity11, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseFromTabSelectionFragment> hmlReviewDocumentActivity12) {
                return new zzb(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10, hmlReviewDocumentActivity11, hmlReviewDocumentActivity12);
            }

            public final /* synthetic */ Object get() {
                HmlReviewDocumentActivity<getAvailableFeatures> hmlReviewDocumentActivity = this.write;
                HmlReviewDocumentActivity<Api.ApiOptions.Optional> hmlReviewDocumentActivity2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                HmlReviewDocumentActivity<MerchantWalletService> hmlReviewDocumentActivity3 = this.RatingCompat;
                HmlReviewDocumentActivity<isConnected> hmlReviewDocumentActivity4 = this.MediaSessionCompat$Token;
                HmlReviewDocumentActivity<TermsConditionsService> hmlReviewDocumentActivity5 = this.f2991x50fd9e4a;
                HmlReviewDocumentActivity<getRequiredFeatures> hmlReviewDocumentActivity6 = this.MediaBrowserCompat$MediaItem;
                HmlReviewDocumentActivity<Api.ApiOptions.HasGoogleSignInAccountOptions> hmlReviewDocumentActivity7 = this.MediaBrowserCompat$ItemReceiver;
                HmlReviewDocumentActivity<getEndpointPackageName> hmlReviewDocumentActivity8 = this.MediaMetadataCompat;
                HmlReviewDocumentActivity<FragmentBuilder_BindRemittanceReviewFragment> hmlReviewDocumentActivity9 = this.MediaBrowserCompat$SearchResultReceiver;
                HmlReviewDocumentActivity<FragmentBuilder_BindSelectPurchaseFragment> hmlReviewDocumentActivity10 = this.MediaDescriptionCompat;
                HmlReviewDocumentActivity<Api.Client> hmlReviewDocumentActivity11 = this.read;
                HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseFromTabSelectionFragment> hmlReviewDocumentActivity12 = this.IconCompatParcelizer;
                hmlReviewDocumentActivity5.get();
                hmlReviewDocumentActivity6.get();
                return new FragmentBuilder_BindECouponQuantityFragment(hmlReviewDocumentActivity.get(), hmlReviewDocumentActivity2.get(), hmlReviewDocumentActivity3.get(), hmlReviewDocumentActivity4.get(), hmlReviewDocumentActivity7.get(), hmlReviewDocumentActivity8.get(), hmlReviewDocumentActivity9.get(), hmlReviewDocumentActivity10.get(), hmlReviewDocumentActivity11.get(), hmlReviewDocumentActivity12.get());
            }
        }
    }

    /* renamed from: o.zzge$zzk */
    public final class zzk implements FragmentBuilder_BindBaseInvestmentSuccessFragment {
        /* access modifiers changed from: private */
        public final BaseAmortizationActivity.read write;

        /* renamed from: o.zzge$zzk$IconCompatParcelizer */
        static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<D, DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> {
            private /* synthetic */ String IconCompatParcelizer;
            private /* synthetic */ zzk read;

            IconCompatParcelizer(zzk zzk, String str) {
                this.read = zzk;
                this.IconCompatParcelizer = str;
            }

            public final /* synthetic */ Object write(Object obj) {
                onGetStartedClick.write(obj, "it");
                BaseAmortizationActivity.read IconCompatParcelizer2 = this.read.write;
                String str = this.IconCompatParcelizer;
                onGetStartedClick.write((Object) str, BeIDParams.BEID_TRANSACTION_ID);
                return IconCompatParcelizer2.IconCompatParcelizer.getPartnerConsentWithTransactionId(str);
            }
        }

        /* renamed from: o.zzge$zzk$MediaDescriptionCompat */
        static final class MediaDescriptionCompat<T, R> implements DirectDebitDeepLinkActivity<D, DebitCardResetPinSuccessActivity_ViewBinding<? extends T>> {
            private /* synthetic */ zzk IconCompatParcelizer;
            private /* synthetic */ String read;

            MediaDescriptionCompat(zzk zzk, String str) {
                this.IconCompatParcelizer = zzk;
                this.read = str;
            }

            public final /* synthetic */ Object write(Object obj) {
                onGetStartedClick.write(obj, "it");
                BaseAmortizationActivity.read IconCompatParcelizer2 = this.IconCompatParcelizer.write;
                String str = this.read;
                onGetStartedClick.write((Object) str, "sessionId");
                return IconCompatParcelizer2.IconCompatParcelizer.getPartnerConsent(str);
            }
        }

        /* renamed from: o.zzge$zzk$MediaMetadataCompat */
        static final class MediaMetadataCompat<T, R> implements DirectDebitDeepLinkActivity<T, R> {
            public static final MediaMetadataCompat IconCompatParcelizer = new MediaMetadataCompat();

            MediaMetadataCompat() {
            }

            public final /* synthetic */ Object write(Object obj) {
                SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
                onGetStartedClick.write((Object) singleDataEntity, "it");
                setOnPageChangeListener status = singleDataEntity.getStatus();
                onGetStartedClick.IconCompatParcelizer((Object) status, "it.status");
                return ((getMean) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver(status);
            }
        }

        /* renamed from: o.zzge$zzk$write */
        static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
            public static final write MediaBrowserCompat$ItemReceiver = new write();

            write() {
            }

            public final /* synthetic */ Object write(Object obj) {
                SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
                onGetStartedClick.write((Object) singleDataEntity, "it");
                setOnPageChangeListener status = singleDataEntity.getStatus();
                onGetStartedClick.IconCompatParcelizer((Object) status, "it.status");
                return ((getMean) singleDataEntity.getData()).MediaBrowserCompat$CustomActionResultReceiver(status);
            }
        }

        /* renamed from: o.zzge$zzk$zza */
        public final class zza implements AbstractMultimap.KeySet.C11261 {
            final ListenerHolder.zaa IconCompatParcelizer;
            private final FriendsLandingActivity.read MediaBrowserCompat$CustomActionResultReceiver;
            final createListenerKey read;
            final ListenerHolder.Notifier write;

            /* renamed from: o.zzge$zzk$zza$IconCompatParcelizer */
            static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
                private /* synthetic */ zza write;

                IconCompatParcelizer(zza zza) {
                    this.write = zza;
                }

                public final /* synthetic */ Object write(Object obj) {
                    setIndoorEnabled setindoorenabled;
                    SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
                    onGetStartedClick.write((Object) singleDataEntity, "it");
                    Object data = singleDataEntity.getData();
                    onGetStartedClick.IconCompatParcelizer(data, "it.data");
                    getFrameDurationNs getframedurationns = (getFrameDurationNs) data;
                    onGetStartedClick.write((Object) getframedurationns, "entity");
                    getAnimatedFraction getanimatedfraction = getframedurationns.MediaBrowserCompat$CustomActionResultReceiver;
                    if (getanimatedfraction != null) {
                        setindoorenabled = new setIndoorEnabled(getanimatedfraction.write, getanimatedfraction.MediaBrowserCompat$ItemReceiver);
                    } else {
                        setindoorenabled = null;
                    }
                    return new setBuildingsEnabled(setindoorenabled, getframedurationns.MediaBrowserCompat$ItemReceiver);
                }
            }

            /* renamed from: o.zzge$zzk$zza$read */
            static final class read<T, R> implements DirectDebitDeepLinkActivity<T, R> {
                private /* synthetic */ zza MediaBrowserCompat$ItemReceiver;

                read(zza zza) {
                    this.MediaBrowserCompat$ItemReceiver = zza;
                }

                public final /* synthetic */ Object write(Object obj) {
                    setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) obj;
                    onGetStartedClick.write((Object) setcurrentiteminternal, "it");
                    return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(setcurrentiteminternal);
                }
            }

            /* renamed from: o.zzge$zzk$zza$write */
            static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
                public static final write MediaBrowserCompat$CustomActionResultReceiver = new write();

                write() {
                }

                public final /* bridge */ /* synthetic */ Object write(Object obj) {
                    onGetStartedClick.write((Object) (SingleDataEntity) obj, "it");
                    return Boolean.TRUE;
                }
            }

            public zza(FriendsLandingActivity.read read2, ListenerHolder.zaa zaa, ListenerHolder.Notifier notifier, createListenerKey createlistenerkey) {
                onGetStartedClick.write((Object) read2, "api");
                onGetStartedClick.write((Object) zaa, "touchPointValidationMapper");
                onGetStartedClick.write((Object) notifier, "touchPointFindUserEntityMapper");
                onGetStartedClick.write((Object) createlistenerkey, "verifyIdentityEntityMapper");
                this.MediaBrowserCompat$CustomActionResultReceiver = read2;
                this.IconCompatParcelizer = zaa;
                this.write = notifier;
                this.read = createlistenerkey;
            }

            public final BScanCNotificationDeepLinkActivity<zzuk> IconCompatParcelizer(emptySet emptyset) {
                onGetStartedClick.write((Object) emptyset, "request");
                FriendsLandingActivity.read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.write((Object) emptyset, "request");
                BScanCNotificationDeepLinkActivity<setCurrentItemInternal> validation = read2.IconCompatParcelizer.validation(emptyset);
                DirectDebitDeepLinkActivity read3 = new read(this);
                HmlLatestPersonalInformationDeepLinkActivity.write(read3, "mapper is null");
                onCopy oncopy = new onCopy(validation, read3);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy, "api.validateTouchPoint(r…apper.transformBase(it) }");
                return oncopy;
            }

            public final BScanCNotificationDeepLinkActivity<Boolean> MediaBrowserCompat$CustomActionResultReceiver(expireAfterAccess expireafteraccess) {
                onGetStartedClick.write((Object) expireafteraccess, "request");
                FriendsLandingActivity.read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.write((Object) expireafteraccess, "request");
                BScanCNotificationDeepLinkActivity<SingleDataEntity<setCurrentItemInternal>> faceMatch = read2.IconCompatParcelizer.faceMatch(expireafteraccess.MediaBrowserCompat$MediaItem, expireafteraccess.MediaBrowserCompat$CustomActionResultReceiver, expireafteraccess.MediaDescriptionCompat, expireafteraccess.MediaMetadataCompat, expireafteraccess.read, expireafteraccess.IconCompatParcelizer, expireafteraccess.write, expireafteraccess.MediaBrowserCompat$ItemReceiver);
                DirectDebitDeepLinkActivity directDebitDeepLinkActivity = write.MediaBrowserCompat$CustomActionResultReceiver;
                HmlLatestPersonalInformationDeepLinkActivity.write(directDebitDeepLinkActivity, "mapper is null");
                onCopy oncopy = new onCopy(faceMatch, directDebitDeepLinkActivity);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy, "api.faceMatch(request).map { true }");
                return oncopy;
            }

            public final BScanCNotificationDeepLinkActivity<setBuildingsEnabled> write(ImmutableSortedSet immutableSortedSet) {
                onGetStartedClick.write((Object) immutableSortedSet, "request");
                FriendsLandingActivity.read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.write((Object) immutableSortedSet, "request");
                BScanCNotificationDeepLinkActivity<SingleDataEntity<getFrameDurationNs>> findUser = read2.IconCompatParcelizer.findUser(immutableSortedSet);
                DirectDebitDeepLinkActivity iconCompatParcelizer = new IconCompatParcelizer(this);
                HmlLatestPersonalInformationDeepLinkActivity.write(iconCompatParcelizer, "mapper is null");
                onCopy oncopy = new onCopy(findUser, iconCompatParcelizer);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy, "api.findUser(request).ma…pper.transform(it.data) }");
                return oncopy;
            }

            public final BScanCNotificationDeepLinkActivity<resetMinMaxZoomPreference> MediaBrowserCompat$ItemReceiver(hasSameComparator hassamecomparator) {
                onGetStartedClick.write((Object) hassamecomparator, "request");
                FriendsLandingActivity.read read2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.write((Object) hassamecomparator, "request");
                BScanCNotificationDeepLinkActivity<SingleDataEntity<doFrame>> verifyIdentity = read2.IconCompatParcelizer.verifyIdentity(hassamecomparator);
                DirectDebitDeepLinkActivity zzge_zzk_zza_mediabrowsercompat_itemreceiver = new zzge$zzk$zza$MediaBrowserCompat$ItemReceiver(this);
                HmlLatestPersonalInformationDeepLinkActivity.write(zzge_zzk_zza_mediabrowsercompat_itemreceiver, "mapper is null");
                onCopy oncopy = new onCopy(verifyIdentity, zzge_zzk_zza_mediabrowsercompat_itemreceiver);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy, "api.verifyIdentity(reque…pper.transform(it.data) }");
                return oncopy;
            }
        }

        /* renamed from: o.zzge$zzk$RatingCompat */
        static final class RatingCompat<T, R> implements DirectDebitDeepLinkActivity<T, R> {
            public static final RatingCompat MediaBrowserCompat$ItemReceiver = new RatingCompat();

            RatingCompat() {
            }

            public final /* synthetic */ Object write(Object obj) {
                SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
                onGetStartedClick.write((Object) singleDataEntity, "it");
                return ((getMean) singleDataEntity.getData()).IconCompatParcelizer();
            }
        }

        @HmlPinActivity
        public zzk(BaseAmortizationActivity.read read2) {
            onGetStartedClick.write((Object) read2, "partnerConsentApi");
            this.write = read2;
        }

        public final DebitCardResetOtpActivity<setMyLocationEnabled> MediaBrowserCompat$CustomActionResultReceiver(String str) {
            onGetStartedClick.write((Object) str, "sessionId");
            DebitCardResetOtpActivity<setMyLocationEnabled> map = DebitCardResetOtpActivity.using(new FragmentBuilder_BindHmlNTBManageEmailVerificationFragment.write(new zzge$zzk$MediaBrowserCompat$CustomActionResultReceiver(this)), new MediaDescriptionCompat(this, str), zzge$zzk$MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver).map(MediaMetadataCompat.IconCompatParcelizer);
            onGetStartedClick.IconCompatParcelizer((Object) map, "Observable.using<SingleD…atus(it.status)\n        }");
            return map;
        }

        public final DebitCardResetOtpActivity<setMyLocationEnabled> write(maximumSize maximumsize) {
            onGetStartedClick.write((Object) maximumsize, "requestBody");
            BaseAmortizationActivity.read read2 = this.write;
            onGetStartedClick.write((Object) maximumsize, "requestBody");
            DebitCardResetOtpActivity<R> map = read2.IconCompatParcelizer.postPartnerConsent(maximumsize).map(zzge$zzk$MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer);
            onGetStartedClick.IconCompatParcelizer((Object) map, "partnerConsentApi.postPa…t> { it.data.toDomain() }");
            return map;
        }

        public final DebitCardResetOtpActivity<setMyLocationEnabled> MediaBrowserCompat$CustomActionResultReceiver(maximumSize maximumsize) {
            onGetStartedClick.write((Object) maximumsize, "requestBody");
            BaseAmortizationActivity.read read2 = this.write;
            onGetStartedClick.write((Object) maximumsize, "requestBody");
            DebitCardResetOtpActivity<R> map = read2.IconCompatParcelizer.putPartnerConsent(maximumsize).map(zzge$zzk$MediaSessionCompat$QueueItem.read);
            onGetStartedClick.IconCompatParcelizer((Object) map, "partnerConsentApi.putPar…t> { it.data.toDomain() }");
            return map;
        }

        public final DebitCardResetOtpActivity<setMyLocationEnabled> write(String str) {
            onGetStartedClick.write((Object) str, BeIDParams.BEID_TRANSACTION_ID);
            DebitCardResetOtpActivity<setMyLocationEnabled> map = DebitCardResetOtpActivity.using(new FragmentBuilder_BindHmlNTBManageEmailVerificationFragment.write(new zzge$zzk$MediaBrowserCompat$ItemReceiver(this)), new IconCompatParcelizer(this, str), read.write).map(write.MediaBrowserCompat$ItemReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) map, "Observable.using<SingleD…atus(it.status)\n        }");
            return map;
        }

        /* renamed from: o.zzge$zzk$read */
        static final class read<T> implements DebitCardMarketConductDeepLinkActivity<D> {
            public static final read write = new read();

            read() {
            }

            public final void IconCompatParcelizer(Object obj) {
                zabr.IconCompatParcelizer();
            }
        }

        public final DebitCardResetOtpActivity<setMyLocationEnabled> read(softValues softvalues) {
            onGetStartedClick.write((Object) softvalues, "requestBody");
            BaseAmortizationActivity.read read2 = this.write;
            onGetStartedClick.write((Object) softvalues, "requestBody");
            DebitCardResetOtpActivity<R> map = read2.IconCompatParcelizer.postPartnerConsentWithTransactionId(softvalues).map(RatingCompat.MediaBrowserCompat$ItemReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) map, "partnerConsentApi.postCo…t> { it.data.toDomain() }");
            return map;
        }

        public final DebitCardResetOtpActivity<setMyLocationEnabled> write(softValues softvalues) {
            onGetStartedClick.write((Object) softvalues, "requestBody");
            BaseAmortizationActivity.read read2 = this.write;
            onGetStartedClick.write((Object) softvalues, "requestBody");
            DebitCardResetOtpActivity<R> map = read2.IconCompatParcelizer.putPartnerConsentWithTransactionId(softvalues).map(C10186xab5aa34b.MediaBrowserCompat$ItemReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) map, "partnerConsentApi.putCon…t> { it.data.toDomain() }");
            return map;
        }

        public static final /* synthetic */ void IconCompatParcelizer() {
            zabr.IconCompatParcelizer("3001");
            zabr.IconCompatParcelizer("3002");
        }
    }

    /* renamed from: o.zzge$zzg */
    public final class zzg implements setCvv {
        static String read = "0";
        private final String AlertController$RecycleListView;
        final FragmentBuilder_BindRegistrationPushNotificationFragment IconCompatParcelizer;
        private final HmlSensitiveConsentActivity Keep;
        final ScriptIntrinsicConvolve5x5 MediaBrowserCompat$CustomActionResultReceiver;
        final FragmentBuilder_BindRegistrationEmailSetupFragment MediaBrowserCompat$ItemReceiver;
        final FragmentBuilder_BindSetupScheduleWeeklyFragment MediaBrowserCompat$MediaItem;
        final ScriptIntrinsicLUT MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private final C5011nL.IconCompatParcelizer f2992x50fd9e4a;
        final notNull.read MediaDescriptionCompat;
        final UserRecoverableException MediaMetadataCompat;
        final SharedPreferences MediaSessionCompat$QueueItem;
        final keys MediaSessionCompat$ResultReceiverWrapper;
        final readObjectNoData$MediaBrowserCompat$ItemReceiver MediaSessionCompat$Token;
        final createElementSet.IconCompatParcelizer ParcelableVolumeInfo;
        final BaseECouponActivity.IconCompatParcelizer RatingCompat;
        final KeepForSdkWithMembers write;

        /* renamed from: o.zzge$zzg$zza */
        final class zza implements DataPrivacyManagementDeepLinkActivity {
            private final /* synthetic */ FundActionsSuccessActivity MediaBrowserCompat$ItemReceiver;

            zza(FundActionsSuccessActivity fundActionsSuccessActivity) {
                this.MediaBrowserCompat$ItemReceiver = fundActionsSuccessActivity;
            }

            public final /* synthetic */ void read() {
                onGetStartedClick.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.invoke(), "invoke(...)");
            }
        }

        /* renamed from: o.zzge$zzg$zzb */
        public final class zzb implements ServerProjectProvider.C70684 {
            final withHolder IconCompatParcelizer;
            private final NsipPartnerPaymentService MediaBrowserCompat$CustomActionResultReceiver;
            final maybeSignIn read;
            final reconnect write;

            /* renamed from: o.zzge$zzg$zzb$IconCompatParcelizer */
            static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
                private /* synthetic */ zzb write;

                IconCompatParcelizer(zzb zzb) {
                    this.write = zzb;
                }

                public final /* synthetic */ Object write(Object obj) {
                    SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
                    onGetStartedClick.write((Object) singleDataEntity, "entity");
                    Object data = singleDataEntity.getData();
                    onGetStartedClick.IconCompatParcelizer(data, "entity.data");
                    floorDiv floordiv = (floorDiv) data;
                    setOnPageChangeListener status = singleDataEntity.getStatus();
                    onGetStartedClick.IconCompatParcelizer((Object) status, "entity.status");
                    onGetStartedClick.write((Object) floordiv, "entity");
                    onGetStartedClick.write((Object) status, "statusEntity");
                    zzvj zzvj = new zzvj(status.write(), status.read());
                    zzvj.IconCompatParcelizer = status.MediaBrowserCompat$ItemReceiver();
                    zzvj.read = status.IconCompatParcelizer();
                    setOnGroundOverlayClickListener setongroundoverlayclicklistener = new setOnGroundOverlayClickListener(floordiv.MediaBrowserCompat$MediaItem, floordiv.MediaMetadataCompat, floordiv.MediaBrowserCompat$CustomActionResultReceiver, floordiv.read, floordiv.IconCompatParcelizer, floordiv.write, floordiv.RatingCompat, new setOnCameraMoveStartedListener(reconnect.MediaBrowserCompat$ItemReceiver(floordiv.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver)));
                    setongroundoverlayclicklistener.read(zzvj);
                    return setongroundoverlayclicklistener;
                }
            }

            /* renamed from: o.zzge$zzg$zzb$read */
            static final class read<T, R> implements DirectDebitDeepLinkActivity<T, R> {
                private /* synthetic */ zzb write;

                read(zzb zzb) {
                    this.write = zzb;
                }

                public final /* synthetic */ Object write(Object obj) {
                    SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
                    onGetStartedClick.write((Object) singleDataEntity, "it");
                    withHolder withholder = this.write.IconCompatParcelizer;
                    Object data = singleDataEntity.getData();
                    onGetStartedClick.IconCompatParcelizer(data, "it.data");
                    return withholder.read((ExceptionParser) data);
                }
            }

            @HmlPinActivity
            public zzb(maybeSignIn maybesignin, reconnect reconnect, withHolder withholder, NsipPartnerPaymentService nsipPartnerPaymentService) {
                onGetStartedClick.write((Object) maybesignin, "nsipPartnerPaymentEntityMapper");
                onGetStartedClick.write((Object) reconnect, "nsipPartnerPaymentVerificationEntityMapper");
                onGetStartedClick.write((Object) withholder, "transferConfirmationEntityMapper");
                onGetStartedClick.write((Object) nsipPartnerPaymentService, "service");
                this.read = maybesignin;
                this.write = reconnect;
                this.IconCompatParcelizer = withholder;
                this.MediaBrowserCompat$CustomActionResultReceiver = nsipPartnerPaymentService;
            }

            public final BScanCNotificationDeepLinkActivity<setOnCircleClickListener> IconCompatParcelizer(String str) {
                onGetStartedClick.write((Object) str, "deepLinkId");
                BScanCNotificationDeepLinkActivity<SingleDataEntity<MiscUtils>> partnerPaymentId = this.MediaBrowserCompat$CustomActionResultReceiver.getPartnerPaymentId(str);
                DirectDebitDeepLinkActivity zzge_zzg_zzb_mediabrowsercompat_itemreceiver = new zzge$zzg$zzb$MediaBrowserCompat$ItemReceiver(this);
                HmlLatestPersonalInformationDeepLinkActivity.write(zzge_zzg_zzb_mediabrowsercompat_itemreceiver, "mapper is null");
                onCopy oncopy = new onCopy(partnerPaymentId, zzge_zzg_zzb_mediabrowsercompat_itemreceiver);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getPartnerPaymen….transform(entity.data) }");
                return oncopy;
            }

            /* JADX WARNING: type inference failed for: r0v7, types: [o.zzge$zzg$zza] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final p040o.BScanCNotificationDeepLinkActivity<p040o.setOnGroundOverlayClickListener> MediaBrowserCompat$CustomActionResultReceiver(p040o.HashBiMap r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "request"
                    p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
                    java.lang.String r0 = "9003"
                    p040o.zabr.IconCompatParcelizer((java.lang.String) r0)
                    com.scb.phone.data.network.service.NsipPartnerPaymentService r0 = r2.MediaBrowserCompat$CustomActionResultReceiver
                    o.BScanCNotificationDeepLinkActivity r3 = r0.getPartnerPaymentVerification(r3)
                    o.zzge$zzg$zzb$IconCompatParcelizer r0 = new o.zzge$zzg$zzb$IconCompatParcelizer
                    r0.<init>(r2)
                    o.DirectDebitDeepLinkActivity r0 = (p040o.DirectDebitDeepLinkActivity) r0
                    java.lang.String r1 = "mapper is null"
                    p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r0, r1)
                    o.onCopy r1 = new o.onCopy
                    r1.<init>(r3, r0)
                    o.zzge$zzg$zzb$MediaBrowserCompat$CustomActionResultReceiver r3 = p040o.zzge$zzg$zzb$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer
                    o.FundActionsSuccessActivity r3 = (p040o.FundActionsSuccessActivity) r3
                    if (r3 == 0) goto L_0x002d
                    o.zzge$zzg$zza r0 = new o.zzge$zzg$zza
                    r0.<init>(r3)
                    r3 = r0
                L_0x002d:
                    o.DataPrivacyManagementDeepLinkActivity r3 = (p040o.DataPrivacyManagementDeepLinkActivity) r3
                    java.lang.String r0 = "onFinally is null"
                    p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r3, r0)
                    o.ForgotPinPersonalInfoActivity r0 = new o.ForgotPinPersonalInfoActivity
                    r0.<init>(r1, r3)
                    java.lang.String r3 = "service.getPartnerPaymen…actory::clearSuccessList)"
                    p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.zzge.zzg.zzb.MediaBrowserCompat$CustomActionResultReceiver(o.HashBiMap):o.BScanCNotificationDeepLinkActivity");
            }

            public final BScanCNotificationDeepLinkActivity<zoomByWithFocus> IconCompatParcelizer(HashMultimap hashMultimap, String str, String str2) {
                onGetStartedClick.write((Object) hashMultimap, "request");
                BScanCNotificationDeepLinkActivity<SingleDataEntity<ExceptionParser>> partnerPaymentConfirm = this.MediaBrowserCompat$CustomActionResultReceiver.getPartnerPaymentConfirm(hashMultimap, str, str2);
                DirectDebitDeepLinkActivity read2 = new read(this);
                HmlLatestPersonalInformationDeepLinkActivity.write(read2, "mapper is null");
                onCopy oncopy = new onCopy(partnerPaymentConfirm, read2);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy, "service.getPartnerPaymen…pper.transform(it.data) }");
                return oncopy;
            }
        }

        @HmlPinActivity
        public zzg(FragmentBuilder_BindRegistrationEmailSetupFragment fragmentBuilder_BindRegistrationEmailSetupFragment, C5011nL.IconCompatParcelizer iconCompatParcelizer, BaseECouponActivity.IconCompatParcelizer iconCompatParcelizer2, createElementSet.IconCompatParcelizer iconCompatParcelizer3, notNull.read read2, readObjectNoData$MediaBrowserCompat$ItemReceiver readobjectnodata_mediabrowsercompat_itemreceiver, keys keys, SharedPreferences sharedPreferences, FragmentBuilder_BindSetupScheduleWeeklyFragment fragmentBuilder_BindSetupScheduleWeeklyFragment, KeepForSdkWithMembers keepForSdkWithMembers, UserRecoverableException userRecoverableException, ScriptIntrinsicLUT scriptIntrinsicLUT, FragmentBuilder_BindRegistrationPushNotificationFragment fragmentBuilder_BindRegistrationPushNotificationFragment, String str, ScriptIntrinsicConvolve5x5 scriptIntrinsicConvolve5x5, HmlSensitiveConsentActivity hmlSensitiveConsentActivity) {
            this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindRegistrationEmailSetupFragment;
            this.f2992x50fd9e4a = iconCompatParcelizer;
            this.RatingCompat = iconCompatParcelizer2;
            this.ParcelableVolumeInfo = iconCompatParcelizer3;
            this.MediaSessionCompat$Token = readobjectnodata_mediabrowsercompat_itemreceiver;
            this.MediaSessionCompat$ResultReceiverWrapper = keys;
            this.MediaSessionCompat$QueueItem = sharedPreferences;
            this.MediaBrowserCompat$MediaItem = fragmentBuilder_BindSetupScheduleWeeklyFragment;
            this.write = keepForSdkWithMembers;
            this.MediaMetadataCompat = userRecoverableException;
            this.MediaDescriptionCompat = read2;
            this.MediaBrowserCompat$SearchResultReceiver = scriptIntrinsicLUT;
            this.IconCompatParcelizer = fragmentBuilder_BindRegistrationPushNotificationFragment;
            this.AlertController$RecycleListView = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = scriptIntrinsicConvolve5x5;
            this.Keep = hmlSensitiveConsentActivity;
        }

        public final DebitCardResetOtpActivity<C7506tP> MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, boolean z) {
            this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver(UUID.randomUUID().toString());
            if (this.Keep.MediaBrowserCompat$ItemReceiver() || z) {
                ILocationSourceDelegate write2 = ILocationSourceDelegate.write();
                ILocationSourceDelegate.zza zza2 = new ILocationSourceDelegate.zza();
                zza2.IconCompatParcelizer = PlaceAutocompleteFragment.JAILBREAK.code;
                write2.write = zza2;
                return DebitCardResetOtpActivity.error((Throwable) RetrofitException.MediaBrowserCompat$CustomActionResultReceiver(write2));
            }
            String string = this.MediaSessionCompat$QueueItem.getString("USER_MODE", zzmd.zzm.zzb.zza.INDIVIDUAL.mode);
            standardIndexOf standardindexof = new standardIndexOf();
            standardindexof.MediaBrowserCompat$ItemReceiver = str;
            standardindexof.write = str2;
            standardindexof.read = "0";
            standardindexof.MediaBrowserCompat$CustomActionResultReceiver = string;
            standardindexof.IconCompatParcelizer = this.AlertController$RecycleListView;
            return DebitCardResetOtpActivity.using(AndroidUtilsLight.IconCompatParcelizer, new StatsUtils(this, standardindexof), concat.MediaBrowserCompat$CustomActionResultReceiver).map(new getPackageCertificateHashBytes(this)).doOnNext(new getEventKey(this, str, str2)).doOnNext(new getDeviceProtectedStorageContext(this)).doOnNext(new IGmsServiceBroker(this)).doOnNext(new registerEvent(this)).doOnError(zzef.MediaBrowserCompat$ItemReceiver);
        }

        public final String write() {
            return this.MediaSessionCompat$QueueItem.getString("USER_MODE", zzmd.zzm.zzb.zza.INDIVIDUAL.mode);
        }

        public final DebitCardResetOtpActivity<PlaceAutocomplete> IconCompatParcelizer(standardEquals standardequals) {
            return this.f2992x50fd9e4a.MediaBrowserCompat$ItemReceiver.login(standardequals).flatMap(zaai.IconCompatParcelizer).map(new mutate(this.write)).doOnNext(new getBinder(this));
        }

        public final DebitCardResetOtpActivity<PlaceAutocomplete> read(ForwardingIterator forwardingIterator) {
            return this.f2992x50fd9e4a.read.loginFingerPrint(forwardingIterator).flatMap(zaag.MediaBrowserCompat$ItemReceiver).map(new zzdc(this.write)).doOnNext(new getBinder(this));
        }

        public final DebitCardResetOtpActivity<Boolean> MediaBrowserCompat$MediaItem() {
            this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = false;
            this.MediaSessionCompat$Token.IconCompatParcelizer.edit().putBoolean("com.scb.phone.pref.key.USER_LOGGED_IN", false).apply();
            return this.f2992x50fd9e4a.write.logout().flatMap(concatByteArrays.MediaBrowserCompat$CustomActionResultReceiver);
        }

        /* renamed from: o.zzge$zzg$1 */
        static /* synthetic */ class C54921 {
            static final /* synthetic */ int[] IconCompatParcelizer;

            /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
            /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
                return;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
            static {
                /*
                    o.PlaceAutocompleteFragment[] r0 = p040o.PlaceAutocompleteFragment.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    IconCompatParcelizer = r0
                    o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.DEVICE_IS_REGISTERED     // Catch:{ NoSuchFieldError -> 0x0012 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
                L_0x0012:
                    int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x001d }
                    o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PIN_LOCKED     // Catch:{ NoSuchFieldError -> 0x001d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
                L_0x001d:
                    int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0028 }
                    o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PIN_LOCKED_MAX_TRIALS     // Catch:{ NoSuchFieldError -> 0x0028 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
                L_0x0028:
                    int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0033 }
                    o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.NO_MOBILE_NUMBER_TO_REGISTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
                L_0x0033:
                    int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x003e }
                    o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PROFILE_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x003e }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
                L_0x003e:
                    int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0049 }
                    o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.DEVICE_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0049 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
                L_0x0049:
                    int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0054 }
                    o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PRE_REGISTERED_WITH_ACTIVATION_PERIOD_EXPIRED     // Catch:{ NoSuchFieldError -> 0x0054 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
                L_0x0054:
                    int[] r0 = IconCompatParcelizer     // Catch:{ NoSuchFieldError -> 0x0060 }
                    o.PlaceAutocompleteFragment r1 = p040o.PlaceAutocompleteFragment.PRE_REGISTERED     // Catch:{ NoSuchFieldError -> 0x0060 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                    r2 = 8
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
                L_0x0060:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.zzge.zzg.C54921.<clinit>():void");
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(GoogleMap.OnMarkerDragListener onMarkerDragListener, boolean z) {
            String str;
            this.MediaSessionCompat$Token.IconCompatParcelizer.edit().putBoolean("com.scb.phone.pref.key.USER_LOGGED_IN", true).apply();
            GoogleMap.OnMarkerDragListener onMarkerDragListener2 = this.ParcelableVolumeInfo.IconCompatParcelizer;
            String str2 = "";
            if (onMarkerDragListener2 != null) {
                str = onMarkerDragListener2.setBackgroundResource;
            } else {
                str = str2;
            }
            if (!TextUtils.isEmpty(str)) {
                GoogleMap.OnMarkerDragListener onMarkerDragListener3 = this.ParcelableVolumeInfo.IconCompatParcelizer;
                if (onMarkerDragListener3 != null) {
                    str2 = onMarkerDragListener3.setBackgroundResource;
                }
                onMarkerDragListener.setBackgroundResource = str2;
            }
            this.ParcelableVolumeInfo.IconCompatParcelizer = onMarkerDragListener;
            if (z) {
                MediaBrowserCompat$ItemReceiver(onMarkerDragListener.f2719x50fd9e4a);
            }
            this.MediaSessionCompat$QueueItem.edit().putBoolean("com.scb.phone.pref.key.ENABLE_EMAIL_NOTIFICATIONS", DiskLruCache.VERSION_1.equalsIgnoreCase(onMarkerDragListener.MediaBrowserCompat$MediaItem)).apply();
        }

        public final String IconCompatParcelizer() {
            return this.MediaSessionCompat$Token.IconCompatParcelizer.getString("randomDeviceId", "");
        }

        public final String MediaBrowserCompat$CustomActionResultReceiver() {
            readObjectNoData$MediaBrowserCompat$ItemReceiver readobjectnodata_mediabrowsercompat_itemreceiver = this.MediaSessionCompat$Token;
            String str = readobjectnodata_mediabrowsercompat_itemreceiver.write;
            return str == null || str.length() == 0 ? "" : readobjectnodata_mediabrowsercompat_itemreceiver.write;
        }

        public final void write(String str) {
            this.MediaSessionCompat$Token.write = str;
        }

        public final void write(boolean z) {
            this.MediaSessionCompat$Token.IconCompatParcelizer.edit().putBoolean("com.scb.phone.pref.key.USER_LOGGED_IN", z).apply();
            if (!z) {
                this.MediaBrowserCompat$ItemReceiver.write = null;
            }
        }

        public final void IconCompatParcelizer(boolean z) {
            this.MediaSessionCompat$Token.IconCompatParcelizer.edit().putBoolean("com.scb.phone.pref.key.ROOTED", true).apply();
        }

        public final boolean MediaBrowserCompat$ItemReceiver() {
            return this.MediaSessionCompat$Token.IconCompatParcelizer.getBoolean("com.scb.phone.pref.key.ROOTED", false);
        }

        public final void read(boolean z) {
            this.MediaSessionCompat$ResultReceiverWrapper.read(z);
        }

        public final boolean MediaDescriptionCompat() {
            return this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$SearchResultReceiver();
        }

        public final DebitCardResetOtpActivity<PlaceAutocomplete.IntentBuilder> IconCompatParcelizer(zzvc zzvc) {
            return this.f2992x50fd9e4a.MediaBrowserCompat$ItemReceiver.changePin(zzvc).map(new registerReleaseEvent(this)).doOnNext(new registerDeadlineEvent(this)).onErrorResumeNext(new WakeLockTracker(this));
        }

        public final DebitCardResetOtpActivity<Boolean> write(standardEquals standardequals) {
            return this.f2992x50fd9e4a.MediaBrowserCompat$ItemReceiver.verifyPin(standardequals).flatMap(appendToArray.MediaBrowserCompat$CustomActionResultReceiver).onErrorResumeNext(StatsEvent.read);
        }

        public final void MediaBrowserCompat$ItemReceiver(boolean z) {
            this.MediaBrowserCompat$SearchResultReceiver.write.edit().putBoolean("com.scb.phone.pref.SHOW_PUSH_NOTIFICATIONS_POP_UP", false).apply();
        }

        public final boolean read() {
            return this.MediaBrowserCompat$SearchResultReceiver.write.getBoolean("com.scb.phone.pref.SHOW_PUSH_NOTIFICATIONS_POP_UP", false);
        }

        public final DebitCardResetOtpActivity<getIndex> MediaBrowserCompat$ItemReceiver(String str, String str2) {
            return this.f2992x50fd9e4a.MediaBrowserCompat$ItemReceiver.getMigrationFLag(new standardIterator(str, str2)).map(new registerAcquireEvent(this)).doOnNext(new WakeLockEvent(this)).onErrorResumeNext(new ArrayUtils(this));
        }

        public final void MediaBrowserCompat$ItemReceiver(String str) {
            if (!(str == null || str.trim().isEmpty())) {
                this.MediaSessionCompat$QueueItem.edit().putString("com.scb.phone.pref.key.LANGUAGE", str.toLowerCase()).apply();
            }
        }
    }

    /* renamed from: o.zzge$zzc */
    public final class zzc implements OPRStatusRewardsLandingActivity_ViewBinding<C5985x82597580> {
        private final HmlReviewDocumentActivity<BeginSignInRequest.GoogleIdTokenRequestOptions.Builder> IconCompatParcelizer;
        private final HmlReviewDocumentActivity<ETBService> MediaBrowserCompat$CustomActionResultReceiver;
        private final HmlReviewDocumentActivity<CredentialsOptions.Builder> MediaBrowserCompat$ItemReceiver;
        private final HmlReviewDocumentActivity<BeginSignInRequest.PasswordRequestOptions.Builder> MediaBrowserCompat$MediaItem;
        private final HmlReviewDocumentActivity<FragmentBuilder_BindProductTermConditionFragment> MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private final HmlReviewDocumentActivity<String> f2990x50fd9e4a;
        private final HmlReviewDocumentActivity<isDryRunEnabled> MediaDescriptionCompat;
        private final HmlReviewDocumentActivity<getGoogleIdTokenRequestOptions> MediaMetadataCompat;
        private final HmlReviewDocumentActivity<File> MediaSessionCompat$QueueItem;
        private final HmlReviewDocumentActivity<PDFService> MediaSessionCompat$ResultReceiverWrapper;
        private final HmlReviewDocumentActivity<setPasswordRequestOptions> MediaSessionCompat$Token;
        private final HmlReviewDocumentActivity<filterByAuthorizedAccounts> RatingCompat;
        private final HmlReviewDocumentActivity<IdentityProviders> read;
        private final HmlReviewDocumentActivity<getIdentityProviderForAccount> write;

        /* renamed from: o.zzge$zzc$zza */
        public final class zza implements readVersion {
            final addConcreteTypeArrayInternal IconCompatParcelizer;
            final addConcreteTypeInternal MediaBrowserCompat$CustomActionResultReceiver;
            final getFieldValue MediaBrowserCompat$ItemReceiver;
            private final ho$MediaBrowserCompat$ItemReceiver read;
            final getMinAgeOfLockScreen write;

            /* renamed from: o.zzge$zzc$zza$IconCompatParcelizer */
            static final class IconCompatParcelizer<T, R> implements DirectDebitDeepLinkActivity<T, R> {
                private /* synthetic */ zza MediaBrowserCompat$ItemReceiver;

                IconCompatParcelizer(zza zza) {
                    this.MediaBrowserCompat$ItemReceiver = zza;
                }

                public final /* synthetic */ Object write(Object obj) {
                    String str;
                    SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
                    onGetStartedClick.write((Object) singleDataEntity, "it");
                    addConcreteTypeInternal addconcretetypeinternal = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
                    fromJsonStringSync fromjsonstringsync = (fromJsonStringSync) singleDataEntity.getData();
                    setOnPageChangeListener status = singleDataEntity.getStatus();
                    onGetStartedClick.IconCompatParcelizer((Object) status, "it.status");
                    onGetStartedClick.write((Object) status, "status");
                    if (fromjsonstringsync != null && (str = fromjsonstringsync.read) != null) {
                        return new SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding(str, status.write(), status.MediaBrowserCompat$ItemReceiver(), status.IconCompatParcelizer());
                    }
                    throw new EntityMappingException(addconcretetypeinternal.write);
                }
            }

            /* renamed from: o.zzge$zzc$zza$read */
            static final class read<T, R> implements DirectDebitDeepLinkActivity<T, R> {
                private /* synthetic */ zza write;

                read(zza zza) {
                    this.write = zza;
                }

                public final /* synthetic */ Object write(Object obj) {
                    SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
                    onGetStartedClick.write((Object) singleDataEntity, "it");
                    addConcreteTypeArrayInternal addconcretetypearrayinternal = this.write.IconCompatParcelizer;
                    Object data = singleDataEntity.getData();
                    onGetStartedClick.IconCompatParcelizer(data, "it.data");
                    fromJsonReaderSync fromjsonreadersync = (fromJsonReaderSync) data;
                    onGetStartedClick.write((Object) fromjsonreadersync, "entity");
                    return new showInfoWindow(FragmentBuilder_BindSummaryFragment.write(fromjsonreadersync.write, (OffsetDateTime) null), fromjsonreadersync.read);
                }
            }

            /* renamed from: o.zzge$zzc$zza$write */
            static final class write<T, R> implements DirectDebitDeepLinkActivity<T, R> {
                private /* synthetic */ zza IconCompatParcelizer;

                write(zza zza) {
                    this.IconCompatParcelizer = zza;
                }

                public final /* synthetic */ Object write(Object obj) {
                    SingleDataEntity singleDataEntity = (SingleDataEntity) obj;
                    onGetStartedClick.write((Object) singleDataEntity, "it");
                    fromRawRes fromrawres = (fromRawRes) singleDataEntity.getData();
                    if (fromrawres == null) {
                        return null;
                    }
                    panoramaId panoramaid = new panoramaId();
                    DeepLink deepLink = fromrawres.MediaBrowserCompat$CustomActionResultReceiver;
                    if (deepLink != null) {
                        panoramaid.read = deepLink.MediaBrowserCompat$ItemReceiver;
                        panoramaid.setHasDecor = deepLink.AppCompatActivity;
                        panoramaid.PlaybackStateCompat = deepLink.setContentView;
                        panoramaid.MediaBrowserCompat$SearchResultReceiver = deepLink.MediaSessionCompat$Token;
                    }
                    DeepLink deepLink2 = fromrawres.read;
                    if (deepLink2 == null) {
                        return panoramaid;
                    }
                    panoramaid.MediaBrowserCompat$ItemReceiver = deepLink2.IconCompatParcelizer;
                    panoramaid.RatingCompat = deepLink2.MediaMetadataCompat;
                    panoramaid.AppCompatDialogFragment = deepLink2.AppCompatDialogFragment;
                    panoramaid.MediaBrowserCompat$CustomActionResultReceiver = deepLink2.MediaDescriptionCompat;
                    panoramaid.AlertController$RecycleListView = deepLink2.Keep;
                    panoramaid.Keep = deepLink2.AlertController$RecycleListView;
                    panoramaid.MediaSessionCompat$QueueItem = deepLink2.f2540x50fd9e4a;
                    panoramaid.MediaSessionCompat$Token = deepLink2.PlaybackStateCompat$CustomAction;
                    return panoramaid;
                }
            }

            @HmlPinActivity
            public zza(ho$MediaBrowserCompat$ItemReceiver ho_mediabrowsercompat_itemreceiver, getMinAgeOfLockScreen getminageoflockscreen, getFieldValue getfieldvalue, addConcreteTypeInternal addconcretetypeinternal, addConcreteTypeArrayInternal addconcretetypearrayinternal) {
                onGetStartedClick.write((Object) ho_mediabrowsercompat_itemreceiver, "api");
                onGetStartedClick.write((Object) getminageoflockscreen, "directDebitBillerListEntityMapper");
                onGetStartedClick.write((Object) getfieldvalue, "directDebitScanEntityMapper");
                onGetStartedClick.write((Object) addconcretetypeinternal, "directDebitVerificationEntityMapper");
                onGetStartedClick.write((Object) addconcretetypearrayinternal, "directDebitConfirmRegistrationEntityMapper");
                this.read = ho_mediabrowsercompat_itemreceiver;
                this.write = getminageoflockscreen;
                this.MediaBrowserCompat$ItemReceiver = getfieldvalue;
                this.MediaBrowserCompat$CustomActionResultReceiver = addconcretetypeinternal;
                this.IconCompatParcelizer = addconcretetypearrayinternal;
            }

            public final BScanCNotificationDeepLinkActivity<StreetViewPanoramaFragment.zza> read() {
                BScanCNotificationDeepLinkActivity<SingleDataEntity<fromJson>> recommendedBiller = this.read.MediaBrowserCompat$CustomActionResultReceiver.getRecommendedBiller();
                DirectDebitDeepLinkActivity zzge_zzc_zza_mediabrowsercompat_customactionresultreceiver = new zzge$zzc$zza$MediaBrowserCompat$CustomActionResultReceiver(this);
                HmlLatestPersonalInformationDeepLinkActivity.write(zzge_zzc_zza_mediabrowsercompat_customactionresultreceiver, "mapper is null");
                onCopy oncopy = new onCopy(recommendedBiller, zzge_zzc_zza_mediabrowsercompat_customactionresultreceiver);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy, "api.getRecommendedBiller…pper.transform(it.data) }");
                return oncopy;
            }

            public final BScanCNotificationDeepLinkActivity<getUserNavigationEnabled> MediaBrowserCompat$CustomActionResultReceiver(C5431transform transform) {
                onGetStartedClick.write((Object) transform, "request");
                ho$MediaBrowserCompat$ItemReceiver ho_mediabrowsercompat_itemreceiver = this.read;
                onGetStartedClick.write((Object) transform, "request");
                BScanCNotificationDeepLinkActivity<SingleDataEntity<fromAssetSync>> billerInfo = ho_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.getBillerInfo(transform);
                DirectDebitDeepLinkActivity zzge_zzc_zza_mediabrowsercompat_itemreceiver = new zzge$zzc$zza$MediaBrowserCompat$ItemReceiver(this);
                HmlLatestPersonalInformationDeepLinkActivity.write(zzge_zzc_zza_mediabrowsercompat_itemreceiver, "mapper is null");
                onCopy oncopy = new onCopy(billerInfo, zzge_zzc_zza_mediabrowsercompat_itemreceiver);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy, "api.getBillerInfo(reques…pper.transform(it.data) }");
                return oncopy;
            }

            public final BScanCNotificationDeepLinkActivity<panoramaId> read(newStrongInterner newstronginterner) {
                onGetStartedClick.write((Object) newstronginterner, "request");
                ho$MediaBrowserCompat$ItemReceiver ho_mediabrowsercompat_itemreceiver = this.read;
                onGetStartedClick.write((Object) newstronginterner, "request");
                BScanCNotificationDeepLinkActivity<SingleDataEntity<fromRawRes>> scanBillerInfo = ho_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.getScanBillerInfo(newstronginterner);
                DirectDebitDeepLinkActivity write2 = new write(this);
                HmlLatestPersonalInformationDeepLinkActivity.write(write2, "mapper is null");
                onCopy oncopy = new onCopy(scanBillerInfo, write2);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy, "api.getScanBillerInfo(re…pper.transform(it.data) }");
                return oncopy;
            }

            /* JADX WARNING: type inference failed for: r0v6, types: [o.zzge$zzd] */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final p040o.BScanCNotificationDeepLinkActivity<p040o.SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding> write(p040o.CustomConcurrentHashMap.EntryFactory.C328811 r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "request"
                    p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
                    java.lang.String r1 = "3002"
                    p040o.zabr.IconCompatParcelizer((java.lang.String) r1)
                    o.ho$MediaBrowserCompat$ItemReceiver r1 = r2.read
                    p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
                    com.scb.phone.data.network.service.DirectDebitService r0 = r1.MediaBrowserCompat$CustomActionResultReceiver
                    o.BScanCNotificationDeepLinkActivity r3 = r0.verifyRegistration(r3)
                    o.zzge$zzc$zza$IconCompatParcelizer r0 = new o.zzge$zzc$zza$IconCompatParcelizer
                    r0.<init>(r2)
                    o.DirectDebitDeepLinkActivity r0 = (p040o.DirectDebitDeepLinkActivity) r0
                    java.lang.String r1 = "mapper is null"
                    p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r0, r1)
                    o.onCopy r1 = new o.onCopy
                    r1.<init>(r3, r0)
                    o.zzge$zzc$zza$MediaBrowserCompat$SearchResultReceiver r3 = p040o.zzge$zzc$zza$MediaBrowserCompat$SearchResultReceiver.write
                    o.FundActionsSuccessActivity r3 = (p040o.FundActionsSuccessActivity) r3
                    if (r3 == 0) goto L_0x0032
                    o.zzge$zzd r0 = new o.zzge$zzd
                    r0.<init>(r3)
                    r3 = r0
                L_0x0032:
                    o.DataPrivacyManagementDeepLinkActivity r3 = (p040o.DataPrivacyManagementDeepLinkActivity) r3
                    java.lang.String r0 = "onFinally is null"
                    p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r3, r0)
                    o.ForgotPinPersonalInfoActivity r0 = new o.ForgotPinPersonalInfoActivity
                    r0.<init>(r1, r3)
                    java.lang.String r3 = "api.verifyRegistration(r…actory::clearSuccessList)"
                    p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r3)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: p040o.zzge.zzc.zza.write(o.CustomConcurrentHashMap$EntryFactory$11):o.BScanCNotificationDeepLinkActivity");
            }

            public final BScanCNotificationDeepLinkActivity<showInfoWindow> write(readEntries readentries, String str, String str2) {
                onGetStartedClick.write((Object) readentries, "request");
                onGetStartedClick.write((Object) str, "tokenUUID");
                onGetStartedClick.write((Object) str2, "otp");
                ho$MediaBrowserCompat$ItemReceiver ho_mediabrowsercompat_itemreceiver = this.read;
                onGetStartedClick.write((Object) readentries, "request");
                onGetStartedClick.write((Object) str, "tokenUUID");
                onGetStartedClick.write((Object) str2, "otp");
                BScanCNotificationDeepLinkActivity<SingleDataEntity<fromJsonReaderSync>> confirmRegistrationDirectDebit = ho_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.confirmRegistrationDirectDebit(readentries, str, str2);
                DirectDebitDeepLinkActivity read2 = new read(this);
                HmlLatestPersonalInformationDeepLinkActivity.write(read2, "mapper is null");
                onCopy oncopy = new onCopy(confirmRegistrationDirectDebit, read2);
                onGetStartedClick.IconCompatParcelizer((Object) oncopy, "api.confirmRegistrationD…pper.transform(it.data) }");
                return oncopy;
            }
        }

        private zzc(HmlReviewDocumentActivity<ETBService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PDFService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CredentialsOptions.Builder> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<filterByAuthorizedAccounts> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<IdentityProviders> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<getGoogleIdTokenRequestOptions> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<BeginSignInRequest.PasswordRequestOptions.Builder> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<getIdentityProviderForAccount> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<BeginSignInRequest.GoogleIdTokenRequestOptions.Builder> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<setPasswordRequestOptions> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<isDryRunEnabled> hmlReviewDocumentActivity11, HmlReviewDocumentActivity<FragmentBuilder_BindProductTermConditionFragment> hmlReviewDocumentActivity12, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity13, HmlReviewDocumentActivity<File> hmlReviewDocumentActivity14) {
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
            this.MediaSessionCompat$ResultReceiverWrapper = hmlReviewDocumentActivity2;
            this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity3;
            this.RatingCompat = hmlReviewDocumentActivity4;
            this.read = hmlReviewDocumentActivity5;
            this.MediaMetadataCompat = hmlReviewDocumentActivity6;
            this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity7;
            this.write = hmlReviewDocumentActivity8;
            this.IconCompatParcelizer = hmlReviewDocumentActivity9;
            this.MediaSessionCompat$Token = hmlReviewDocumentActivity10;
            this.MediaDescriptionCompat = hmlReviewDocumentActivity11;
            this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity12;
            this.f2990x50fd9e4a = hmlReviewDocumentActivity13;
            this.MediaSessionCompat$QueueItem = hmlReviewDocumentActivity14;
        }

        public static zzc write(HmlReviewDocumentActivity<ETBService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<PDFService> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<CredentialsOptions.Builder> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<filterByAuthorizedAccounts> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<IdentityProviders> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<getGoogleIdTokenRequestOptions> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<BeginSignInRequest.PasswordRequestOptions.Builder> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<getIdentityProviderForAccount> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<BeginSignInRequest.GoogleIdTokenRequestOptions.Builder> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<setPasswordRequestOptions> hmlReviewDocumentActivity10, HmlReviewDocumentActivity<isDryRunEnabled> hmlReviewDocumentActivity11, HmlReviewDocumentActivity<FragmentBuilder_BindProductTermConditionFragment> hmlReviewDocumentActivity12, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity13, HmlReviewDocumentActivity<File> hmlReviewDocumentActivity14) {
            return new zzc(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10, hmlReviewDocumentActivity11, hmlReviewDocumentActivity12, hmlReviewDocumentActivity13, hmlReviewDocumentActivity14);
        }

        public final /* synthetic */ Object get() {
            HmlReviewDocumentActivity<ETBService> hmlReviewDocumentActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
            HmlReviewDocumentActivity<PDFService> hmlReviewDocumentActivity2 = this.MediaSessionCompat$ResultReceiverWrapper;
            HmlReviewDocumentActivity<CredentialsOptions.Builder> hmlReviewDocumentActivity3 = this.MediaBrowserCompat$ItemReceiver;
            HmlReviewDocumentActivity<filterByAuthorizedAccounts> hmlReviewDocumentActivity4 = this.RatingCompat;
            HmlReviewDocumentActivity<IdentityProviders> hmlReviewDocumentActivity5 = this.read;
            HmlReviewDocumentActivity<getGoogleIdTokenRequestOptions> hmlReviewDocumentActivity6 = this.MediaMetadataCompat;
            HmlReviewDocumentActivity<BeginSignInRequest.PasswordRequestOptions.Builder> hmlReviewDocumentActivity7 = this.MediaBrowserCompat$MediaItem;
            HmlReviewDocumentActivity<getIdentityProviderForAccount> hmlReviewDocumentActivity8 = this.write;
            HmlReviewDocumentActivity<BeginSignInRequest.GoogleIdTokenRequestOptions.Builder> hmlReviewDocumentActivity9 = this.IconCompatParcelizer;
            HmlReviewDocumentActivity<setPasswordRequestOptions> hmlReviewDocumentActivity10 = this.MediaSessionCompat$Token;
            HmlReviewDocumentActivity<isDryRunEnabled> hmlReviewDocumentActivity11 = this.MediaDescriptionCompat;
            HmlReviewDocumentActivity<FragmentBuilder_BindProductTermConditionFragment> hmlReviewDocumentActivity12 = this.MediaBrowserCompat$SearchResultReceiver;
            HmlReviewDocumentActivity<String> hmlReviewDocumentActivity13 = this.f2990x50fd9e4a;
            HmlReviewDocumentActivity<File> hmlReviewDocumentActivity14 = this.MediaSessionCompat$QueueItem;
            hmlReviewDocumentActivity3.get();
            hmlReviewDocumentActivity6.get();
            hmlReviewDocumentActivity8.get();
            hmlReviewDocumentActivity10.get();
            hmlReviewDocumentActivity11.get();
            hmlReviewDocumentActivity12.get();
            return new C5985x82597580(hmlReviewDocumentActivity.get(), hmlReviewDocumentActivity2.get(), hmlReviewDocumentActivity4.get(), hmlReviewDocumentActivity5.get(), hmlReviewDocumentActivity7.get(), hmlReviewDocumentActivity9.get(), hmlReviewDocumentActivity13.get(), hmlReviewDocumentActivity14.get());
        }
    }

    /* renamed from: o.zzge$zza */
    public final class zza implements OPRStatusRewardsLandingActivity_ViewBinding<C5866x109ad279> {
        private final HmlReviewDocumentActivity<getCookieValue> IconCompatParcelizer;
        private final HmlReviewDocumentActivity<getFrontException> MediaBrowserCompat$CustomActionResultReceiver;
        private final HmlReviewDocumentActivity<C4323eA.write> MediaBrowserCompat$ItemReceiver;
        private final HmlReviewDocumentActivity<getTokenWithNotification> MediaBrowserCompat$MediaItem;
        private final HmlReviewDocumentActivity<getAccountId> MediaDescriptionCompat;
        private final HmlReviewDocumentActivity<String> MediaMetadataCompat;
        private final HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseProfileManagementFragment.write> RatingCompat;
        private final HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidRequestSuccessFragment> read;
        private final HmlReviewDocumentActivity<GoogleAuthException> write;

        /* renamed from: o.zzge$zza$zza  reason: collision with other inner class name */
        public final class C10766zza implements OPRStatusRewardsLandingActivity_ViewBinding<C5907x10730e76> {
            private final HmlReviewDocumentActivity<WorkAccount> IconCompatParcelizer;
            private final HmlReviewDocumentActivity<DebitCardATMService> MediaBrowserCompat$CustomActionResultReceiver;
            private final HmlReviewDocumentActivity<getConnectionStatusCode> MediaBrowserCompat$ItemReceiver;
            private final HmlReviewDocumentActivity<String> MediaBrowserCompat$SearchResultReceiver;
            private final HmlReviewDocumentActivity<buildClientSettings> MediaDescriptionCompat;
            private final HmlReviewDocumentActivity<getIntent> read;
            private final HmlReviewDocumentActivity<isUidGoogleSigned> write;

            private C10766zza(HmlReviewDocumentActivity<DebitCardATMService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getIntent> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<WorkAccount> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<buildClientSettings> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<isUidGoogleSigned> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<getConnectionStatusCode> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity7) {
                this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity;
                this.read = hmlReviewDocumentActivity2;
                this.IconCompatParcelizer = hmlReviewDocumentActivity3;
                this.MediaDescriptionCompat = hmlReviewDocumentActivity4;
                this.write = hmlReviewDocumentActivity5;
                this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity6;
                this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity7;
            }

            public static C10766zza read(HmlReviewDocumentActivity<DebitCardATMService> hmlReviewDocumentActivity, HmlReviewDocumentActivity<getIntent> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<WorkAccount> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<buildClientSettings> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<isUidGoogleSigned> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<getConnectionStatusCode> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity7) {
                return new C10766zza(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7);
            }

            public final /* synthetic */ Object get() {
                return new C5907x10730e76(this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.read.get(), this.IconCompatParcelizer.get(), this.MediaDescriptionCompat.get(), this.write.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaBrowserCompat$SearchResultReceiver.get());
            }
        }

        private zza(HmlReviewDocumentActivity<C4323eA.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidRequestSuccessFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseProfileManagementFragment.write> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getTokenWithNotification> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getCookieValue> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<getAccountId> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<GoogleAuthException> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<getFrontException> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity9) {
            this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity;
            this.read = hmlReviewDocumentActivity2;
            this.RatingCompat = hmlReviewDocumentActivity3;
            this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity4;
            this.IconCompatParcelizer = hmlReviewDocumentActivity5;
            this.MediaDescriptionCompat = hmlReviewDocumentActivity6;
            this.write = hmlReviewDocumentActivity7;
            this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity8;
            this.MediaMetadataCompat = hmlReviewDocumentActivity9;
        }

        public static zza MediaBrowserCompat$ItemReceiver(HmlReviewDocumentActivity<C4323eA.write> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPrepaidRequestSuccessFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<FragmentBuilder_BindPurchaseProfileManagementFragment.write> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<getTokenWithNotification> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<getCookieValue> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<getAccountId> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<GoogleAuthException> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<getFrontException> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity9) {
            return new zza(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9);
        }

        public final /* synthetic */ Object get() {
            return new C5866x109ad279(this.MediaBrowserCompat$ItemReceiver.get(), this.read.get(), this.RatingCompat.get(), this.MediaBrowserCompat$MediaItem.get(), this.IconCompatParcelizer.get(), this.MediaDescriptionCompat.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaMetadataCompat.get());
        }
    }

    private zzge(HmlReviewDocumentActivity<C4773hl.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPreregistrationLandingFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<notifyCompletion> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<clearListener> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<retrieveData> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<onFailure> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<getFrontException> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<setHintPickerConfig> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity10) {
        this.IconCompatParcelizer = hmlReviewDocumentActivity;
        this.MediaBrowserCompat$ItemReceiver = hmlReviewDocumentActivity2;
        this.MediaDescriptionCompat = hmlReviewDocumentActivity3;
        this.MediaMetadataCompat = hmlReviewDocumentActivity4;
        this.write = hmlReviewDocumentActivity5;
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlReviewDocumentActivity6;
        this.MediaBrowserCompat$MediaItem = hmlReviewDocumentActivity7;
        this.read = hmlReviewDocumentActivity8;
        this.RatingCompat = hmlReviewDocumentActivity9;
        this.MediaBrowserCompat$SearchResultReceiver = hmlReviewDocumentActivity10;
    }

    public static zzge MediaBrowserCompat$CustomActionResultReceiver(HmlReviewDocumentActivity<C4773hl.read> hmlReviewDocumentActivity, HmlReviewDocumentActivity<FragmentBuilder_BindPreregistrationLandingFragment> hmlReviewDocumentActivity2, HmlReviewDocumentActivity<getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver> hmlReviewDocumentActivity3, HmlReviewDocumentActivity<notifyCompletion> hmlReviewDocumentActivity4, HmlReviewDocumentActivity<clearListener> hmlReviewDocumentActivity5, HmlReviewDocumentActivity<retrieveData> hmlReviewDocumentActivity6, HmlReviewDocumentActivity<onFailure> hmlReviewDocumentActivity7, HmlReviewDocumentActivity<getFrontException> hmlReviewDocumentActivity8, HmlReviewDocumentActivity<setHintPickerConfig> hmlReviewDocumentActivity9, HmlReviewDocumentActivity<String> hmlReviewDocumentActivity10) {
        return new zzge(hmlReviewDocumentActivity, hmlReviewDocumentActivity2, hmlReviewDocumentActivity3, hmlReviewDocumentActivity4, hmlReviewDocumentActivity5, hmlReviewDocumentActivity6, hmlReviewDocumentActivity7, hmlReviewDocumentActivity8, hmlReviewDocumentActivity9, hmlReviewDocumentActivity10);
    }

    /* renamed from: o.zzge$zzn */
    public final /* synthetic */ class zzn implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ setScreenName IconCompatParcelizer;

        public /* synthetic */ zzn(setScreenName setscreenname) {
            this.IconCompatParcelizer = setscreenname;
        }

        /* renamed from: o.zzge$zzn$zza */
        public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
            public static final /* synthetic */ zza write = new zza();

            private /* synthetic */ zza() {
            }

            public final Object write(Object obj) {
                return ((removePathSegment) obj).MediaBrowserCompat$ItemReceiver;
            }
        }

        /* renamed from: o.zzge$zzn$zzc */
        public final /* synthetic */ class zzc implements DirectDebitDeepLinkActivity {
            public /* synthetic */ zzc(setScreenResolution setscreenresolution) {
            }

            public final Object write(Object obj) {
                schemeDelimiterOffset schemedelimiteroffset = (schemeDelimiterOffset) obj;
                dispatch dispatch = new dispatch();
                dispatch.write = new C6932xfb9c3075(schemedelimiteroffset.write.write, schemedelimiteroffset.write.MediaBrowserCompat$ItemReceiver);
                dispatch.read = schemedelimiteroffset.IconCompatParcelizer;
                dispatch.MediaBrowserCompat$CustomActionResultReceiver = schemedelimiteroffset.MediaBrowserCompat$CustomActionResultReceiver;
                dispatch.MediaBrowserCompat$ItemReceiver = schemedelimiteroffset.read;
                dispatch.MediaBrowserCompat$MediaItem = schemedelimiteroffset.MediaDescriptionCompat;
                dispatch.MediaDescriptionCompat = schemedelimiteroffset.MediaBrowserCompat$ItemReceiver;
                return dispatch;
            }
        }

        public final Object write(Object obj) {
            setQueryParameter setqueryparameter = (setQueryParameter) obj;
            onGetStartedClick.write((Object) setqueryparameter, "entity");
            zzfy.zzc zzc2 = new zzfy.zzc();
            String str = setqueryparameter.MediaBrowserCompat$CustomActionResultReceiver;
            if (str == null) {
                str = "";
            }
            zzc2.MediaBrowserCompat$CustomActionResultReceiver = str;
            String str2 = setqueryparameter.write;
            if (str2 == null) {
                str2 = "";
            }
            zzc2.IconCompatParcelizer = str2;
            String str3 = setqueryparameter.IconCompatParcelizer;
            if (str3 == null) {
                str3 = "";
            }
            zzc2.write = str3;
            String str4 = setqueryparameter.MediaBrowserCompat$ItemReceiver;
            if (str4 == null) {
                str4 = "";
            }
            zzc2.read = str4;
            List<setEncodedQueryParameter> list = setqueryparameter.read;
            ArrayList arrayList = new ArrayList();
            if (list != null) {
                Iterable<setEncodedQueryParameter> iterable = list;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList2 = new ArrayList(i);
                for (setEncodedQueryParameter setencodedqueryparameter : iterable) {
                    String str5 = setencodedqueryparameter.IconCompatParcelizer;
                    if (str5 == null) {
                        str5 = "";
                    }
                    arrayList2.add(Boolean.valueOf(arrayList.add(str5)));
                }
            }
            zzc2.MediaBrowserCompat$ItemReceiver = arrayList;
            return zzc2;
        }

        /* renamed from: o.zzge$zzn$zzb */
        public final /* synthetic */ class zzb implements DirectDebitDeepLinkActivity {
            public /* synthetic */ zzb(setCouponCode setcouponcode) {
            }

            public final Object write(Object obj) {
                String str;
                List list;
                List list2;
                String str2;
                String str3;
                effectivePort effectiveport = (effectivePort) obj;
                double d = effectiveport.write;
                double d2 = effectiveport.MediaBrowserCompat$MediaItem;
                String str4 = effectiveport.MediaDescriptionCompat;
                String str5 = effectiveport.RatingCompat;
                String str6 = effectiveport.MediaBrowserCompat$SearchResultReceiver != null ? effectiveport.MediaBrowserCompat$SearchResultReceiver : "";
                if (effectiveport.MediaMetadataCompat != null) {
                    str = effectiveport.MediaMetadataCompat;
                } else {
                    str = "";
                }
                if (effectiveport.MediaBrowserCompat$ItemReceiver != null) {
                    list = effectiveport.MediaBrowserCompat$ItemReceiver;
                } else {
                    list = new ArrayList();
                }
                List list3 = list;
                if (effectiveport.read != null) {
                    list2 = effectiveport.read;
                } else {
                    list2 = new ArrayList();
                }
                List list4 = list2;
                if (effectiveport.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    str2 = effectiveport.MediaBrowserCompat$CustomActionResultReceiver;
                } else {
                    str2 = "";
                }
                if (effectiveport.IconCompatParcelizer != null) {
                    str3 = effectiveport.IconCompatParcelizer;
                } else {
                    str3 = "";
                }
                return new obtainMessage(d, d2, str4, str5, str6, str, list3, list4, str2, str3);
            }
        }
    }

    /* renamed from: o.zzge$zzp */
    public final /* synthetic */ class zzp implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ setClientId write;

        public /* synthetic */ zzp(setClientId setclientid) {
            this.write = setclientid;
        }

        public final Object write(Object obj) {
            return setClientId.MediaBrowserCompat$ItemReceiver((containsInvalidHostnameAsciiCodes) obj);
        }

        /* renamed from: o.zzge$zzp$zza */
        public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
            public /* synthetic */ zza(setViewportSize setviewportsize) {
            }

            public final Object write(Object obj) {
                resolvePath resolvepath = (resolvePath) obj;
                onGetStartedClick.write((Object) resolvepath, "responseEntity");
                return new constrainedSortedSet(resolvepath.MediaBrowserCompat$ItemReceiver, resolvepath.IconCompatParcelizer);
            }
        }
    }

    /* renamed from: o.zzge$zzs */
    public final /* synthetic */ class zzs implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ setAppName MediaBrowserCompat$CustomActionResultReceiver;

        /* renamed from: o.zzge$zzs$zza */
        public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
            public static final /* synthetic */ zza read = new zza();

            private /* synthetic */ zza() {
            }

            public final Object write(Object obj) {
                return (resolve) ((SingleDataEntity) obj).getData();
            }
        }

        /* renamed from: o.zzge$zzs$zzc */
        public final /* synthetic */ class zzc implements DirectDebitDeepLinkActivity {
            public static final /* synthetic */ zzc write = new zzc();

            private /* synthetic */ zzc() {
            }

            public final Object write(Object obj) {
                return (setQueryParameter) ((SingleDataEntity) obj).getData();
            }
        }

        public /* synthetic */ zzs(setAppName setappname) {
            this.MediaBrowserCompat$CustomActionResultReceiver = setappname;
        }

        public final Object write(Object obj) {
            return setAppName.MediaBrowserCompat$ItemReceiver((DeepLinkUri.Builder) obj);
        }

        /* renamed from: o.zzge$zzs$zzb */
        public final /* synthetic */ class zzb implements DirectDebitDeepLinkActivity {
            public /* synthetic */ zzb(setScreenName setscreenname) {
            }

            public final Object write(Object obj) {
                parseUri parseuri = (parseUri) obj;
                onGetStartedClick.write((Object) parseuri, "entity");
                zzgp.zza zza = new zzgp.zza();
                String str = parseuri.write;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                zza.write = str;
                String str3 = parseuri.IconCompatParcelizer;
                if (str3 == null) {
                    str3 = str2;
                }
                zza.MediaBrowserCompat$ItemReceiver = str3;
                String str4 = parseuri.read;
                if (str4 == null) {
                    str4 = str2;
                }
                zza.read = str4;
                String str5 = parseuri.MediaBrowserCompat$ItemReceiver;
                if (str5 != null) {
                    str2 = str5;
                }
                zza.MediaBrowserCompat$CustomActionResultReceiver = str2;
                List<String> list = parseuri.MediaBrowserCompat$CustomActionResultReceiver;
                if (list == null) {
                    list = HmlNationalIdActivity.IconCompatParcelizer;
                }
                zza.IconCompatParcelizer = list;
                return zza;
            }
        }
    }

    /* renamed from: o.zzge$zzu */
    public final /* synthetic */ class zzu implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ zzu MediaBrowserCompat$ItemReceiver = new zzu();

        private /* synthetic */ zzu() {
        }

        public final Object write(Object obj) {
            List<scheme> list = (List) obj;
            if (list == null) {
                return HmlNationalIdActivity.IconCompatParcelizer;
            }
            Collection arrayList = new ArrayList();
            for (scheme MediaBrowserCompat$CustomActionResultReceiver : list) {
                onClickNext$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver);
                if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                    arrayList.add(MediaBrowserCompat$CustomActionResultReceiver2);
                }
            }
            return (List) arrayList;
        }

        /* renamed from: o.zzge$zzu$zza */
        public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
            public /* synthetic */ zza(setLanguage setlanguage) {
            }

            public final Object write(Object obj) {
                decodeIpv6 decodeipv6 = (decodeIpv6) obj;
                return new getPayload(decodeipv6.read, decodeipv6.IconCompatParcelizer, decodeipv6.MediaBrowserCompat$ItemReceiver, decodeipv6.write, decodeipv6.MediaBrowserCompat$CustomActionResultReceiver, decodeipv6.MediaBrowserCompat$MediaItem);
            }
        }
    }

    /* renamed from: o.zzge$zzr */
    public final /* synthetic */ class zzr implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ setEncoding IconCompatParcelizer;

        /* renamed from: o.zzge$zzr$zza */
        public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
            public static final /* synthetic */ zza write = new zza();

            private /* synthetic */ zza() {
            }

            public final Object write(Object obj) {
                return (removePathSegment) ((SingleDataEntity) obj).getData();
            }
        }

        public /* synthetic */ zzr(setEncoding setencoding) {
            this.IconCompatParcelizer = setencoding;
        }

        public final Object write(Object obj) {
            List<onStartJob> list;
            domainToAscii domaintoascii = (domainToAscii) obj;
            onGetStartedClick.write((Object) domaintoascii, "responseEntity");
            C5449version version = new C5449version((byte) 0);
            List<portColonOffset> list2 = domaintoascii.read;
            if (list2 != null) {
                Iterable<portColonOffset> iterable = list2;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (portColonOffset portcolonoffset : iterable) {
                    onStartJob onstartjob = new onStartJob((byte) 0);
                    onstartjob.MediaBrowserCompat$CustomActionResultReceiver = Double.valueOf(portcolonoffset.MediaBrowserCompat$CustomActionResultReceiver);
                    isDot isdot = portcolonoffset.read;
                    onGetStartedClick.IconCompatParcelizer((Object) isdot, "entity.status");
                    onstartjob.MediaBrowserCompat$ItemReceiver = new SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver(isdot.MediaBrowserCompat$CustomActionResultReceiver, isdot.IconCompatParcelizer);
                    removeAllCanonicalQueryParameters removeallcanonicalqueryparameters = portcolonoffset.RatingCompat;
                    onGetStartedClick.IconCompatParcelizer((Object) removeallcanonicalqueryparameters, "entity.transactionInfo");
                    isPreview ispreview = new isPreview((byte) 0);
                    ispreview.MediaBrowserCompat$ItemReceiver = removeallcanonicalqueryparameters.read;
                    ispreview.MediaBrowserCompat$CustomActionResultReceiver = removeallcanonicalqueryparameters.IconCompatParcelizer;
                    ispreview.IconCompatParcelizer = removeallcanonicalqueryparameters.write;
                    ispreview.read = removeallcanonicalqueryparameters.MediaBrowserCompat$CustomActionResultReceiver;
                    onstartjob.MediaDescriptionCompat = ispreview;
                    onstartjob.read = Double.valueOf(portcolonoffset.IconCompatParcelizer);
                    onstartjob.write = Double.valueOf(portcolonoffset.MediaBrowserCompat$ItemReceiver);
                    onstartjob.RatingCompat = Double.valueOf(portcolonoffset.MediaBrowserCompat$SearchResultReceiver);
                    onstartjob.IconCompatParcelizer = portcolonoffset.write;
                    arrayList.add(onstartjob);
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            version.read = list;
            version.write = domaintoascii.write;
            version.MediaBrowserCompat$SearchResultReceiver = domaintoascii.MediaMetadataCompat;
            version.MediaBrowserCompat$CustomActionResultReceiver = domaintoascii.IconCompatParcelizer;
            version.IconCompatParcelizer = domaintoascii.MediaBrowserCompat$CustomActionResultReceiver;
            version.f2975x50fd9e4a = Double.valueOf(domaintoascii.f2573x50fd9e4a);
            version.MediaMetadataCompat = Double.valueOf(domaintoascii.RatingCompat);
            version.MediaDescriptionCompat = Double.valueOf(domaintoascii.MediaBrowserCompat$MediaItem);
            version.MediaBrowserCompat$ItemReceiver = Double.valueOf(domaintoascii.MediaBrowserCompat$ItemReceiver);
            version.ParcelableVolumeInfo = Double.valueOf(domaintoascii.ParcelableVolumeInfo);
            version.MediaBrowserCompat$MediaItem = Double.valueOf(domaintoascii.MediaBrowserCompat$SearchResultReceiver);
            version.MediaSessionCompat$Token = domaintoascii.MediaSessionCompat$Token;
            version.RatingCompat = Double.valueOf(domaintoascii.MediaDescriptionCompat);
            version.MediaSessionCompat$QueueItem = domaintoascii.MediaSessionCompat$QueueItem;
            return version;
        }
    }

    /* renamed from: o.zzge$zzt */
    public final /* synthetic */ class zzt implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ setSampleRate MediaBrowserCompat$CustomActionResultReceiver;

        /* renamed from: o.zzge$zzt$zzb */
        public final /* synthetic */ class zzb implements DirectDebitDeepLinkActivity {
            private final /* synthetic */ enableAdvertisingIdCollection IconCompatParcelizer;

            public /* synthetic */ zzb(enableAdvertisingIdCollection enableadvertisingidcollection) {
                this.IconCompatParcelizer = enableadvertisingidcollection;
            }

            public final Object write(Object obj) {
                return enableAdvertisingIdCollection.read((queryParameterValues) obj);
            }
        }

        public /* synthetic */ zzt(setSampleRate setsamplerate) {
            this.MediaBrowserCompat$CustomActionResultReceiver = setsamplerate;
        }

        /* renamed from: o.zzge$zzt$zza */
        public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
            public /* synthetic */ zza(setSessionTimeout setsessiontimeout) {
            }

            public final Object write(Object obj) {
                addEncodedQueryParameter addencodedqueryparameter = (addEncodedQueryParameter) obj;
                afterExecute afterexecute = new afterExecute();
                afterexecute.write = addencodedqueryparameter.write;
                afterexecute.MediaBrowserCompat$CustomActionResultReceiver = addencodedqueryparameter.MediaBrowserCompat$CustomActionResultReceiver;
                afterexecute.IconCompatParcelizer = addencodedqueryparameter.MediaBrowserCompat$ItemReceiver;
                setTvRemark$MediaBrowserCompat$ItemReceiver settvremark_mediabrowsercompat_itemreceiver = new setTvRemark$MediaBrowserCompat$ItemReceiver();
                settvremark_mediabrowsercompat_itemreceiver.IconCompatParcelizer = addencodedqueryparameter.IconCompatParcelizer.MediaMetadataCompat;
                settvremark_mediabrowsercompat_itemreceiver.RatingCompat = addencodedqueryparameter.IconCompatParcelizer.ParcelableVolumeInfo;
                settvremark_mediabrowsercompat_itemreceiver.write = addencodedqueryparameter.IconCompatParcelizer.RatingCompat;
                settvremark_mediabrowsercompat_itemreceiver.read = addencodedqueryparameter.IconCompatParcelizer.IconCompatParcelizer;
                settvremark_mediabrowsercompat_itemreceiver.MediaMetadataCompat = addencodedqueryparameter.IconCompatParcelizer.MediaSessionCompat$Token;
                settvremark_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver = addencodedqueryparameter.IconCompatParcelizer.f5533x50fd9e4a;
                settvremark_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = addencodedqueryparameter.IconCompatParcelizer.MediaBrowserCompat$MediaItem;
                settvremark_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = addencodedqueryparameter.IconCompatParcelizer.MediaDescriptionCompat;
                afterexecute.MediaBrowserCompat$ItemReceiver = settvremark_mediabrowsercompat_itemreceiver;
                afterexecute.read = addencodedqueryparameter.read;
                return afterexecute;
            }
        }

        public final Object write(Object obj) {
            List<callServiceStopSelfResult> list;
            setSampleRate setsamplerate = this.MediaBrowserCompat$CustomActionResultReceiver;
            inet6AddressToAscii inet6addresstoascii = (inet6AddressToAscii) obj;
            onGetStartedClick.write((Object) inet6addresstoascii, "entity");
            setTvRemark$MediaBrowserCompat$CustomActionResultReceiver settvremark_mediabrowsercompat_customactionresultreceiver = new setTvRemark$MediaBrowserCompat$CustomActionResultReceiver();
            List<decodeIpv4Suffix> list2 = inet6addresstoascii.IconCompatParcelizer;
            if (list2 != null) {
                Iterable<decodeIpv4Suffix> iterable = list2;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (decodeIpv4Suffix read : iterable) {
                    arrayList.add(setsamplerate.read(read));
                }
                list = (List) arrayList;
            } else {
                list = null;
            }
            settvremark_mediabrowsercompat_customactionresultreceiver.write = list;
            return settvremark_mediabrowsercompat_customactionresultreceiver;
        }
    }

    /* renamed from: o.zzge$zzo */
    public final /* synthetic */ class zzo implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ zzo IconCompatParcelizer = new zzo();

        private /* synthetic */ zzo() {
        }

        public final Object write(Object obj) {
            return AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((resolve) obj);
        }

        /* renamed from: o.zzge$zzo$zzb */
        public final /* synthetic */ class zzb implements DirectDebitDeepLinkActivity {
            private final /* synthetic */ zzn read;

            public /* synthetic */ zzb(zzn zzn) {
                this.read = zzn;
            }

            public final Object write(Object obj) {
                zzn zzn = this.read;
                zzfy.zzb zzb = new zzfy.zzb();
                show show = new show(((removeAllQueryParameters) obj).write);
                zzb.read = (List) new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, new ImmutableSetMultimap.Builder.IconCompatParcelizer(zzn))).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
                    /*  JADX ERROR: Method generation error
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: null
                        java.util.ConcurrentModificationException
                        	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1660)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.insertDecompilationProblems(ClassGen.java:327)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:301)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    public final /* synthetic */ java.lang.Object read(
/*
Method generation error in method: o.setupDialog.1.read():java.lang.Object, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                }, new ensureAnimationInfo<List<T>, T>() {
                    /*  JADX ERROR: Method generation error
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: null
                        java.util.ConcurrentModificationException
                        	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1660)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.insertDecompilationProblems(ClassGen.java:327)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:301)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(
/*
Method generation error in method: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                }));
                return zzb;
            }
        }

        /* renamed from: o.zzge$zzo$zza */
        public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
            private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
            private final /* synthetic */ ManageQrToPayActivity write;

            public /* synthetic */ zza(ManageQrToPayActivity manageQrToPayActivity, String str) {
                this.write = manageQrToPayActivity;
                this.MediaBrowserCompat$ItemReceiver = str;
            }

            public final Object write(Object obj) {
                String str;
                getIsAdIdFakeForDebugLogging getisadidfakefordebuglogging = (getIsAdIdFakeForDebugLogging) obj;
                if (this.MediaBrowserCompat$ItemReceiver.equalsIgnoreCase("th")) {
                    str = getisadidfakefordebuglogging.write.read;
                } else {
                    str = getisadidfakefordebuglogging.write.IconCompatParcelizer;
                }
                return DebitCardResetOtpActivity.just(str);
            }
        }
    }

    /* renamed from: o.zzge$zzw */
    public final /* synthetic */ class zzw implements DirectDebitDeepLinkActivity {
        public static final /* synthetic */ zzw read = new zzw();

        private /* synthetic */ zzw() {
        }

        public final Object write(Object obj) {
            return (List) ((SingleDataEntity) obj).getData();
        }

        /* renamed from: o.zzge$zzw$zzb */
        public final /* synthetic */ class zzb implements DirectDebitDeepLinkActivity {
            private final /* synthetic */ setBrand IconCompatParcelizer;

            public /* synthetic */ zzb(setBrand setbrand) {
                this.IconCompatParcelizer = setbrand;
            }

            public final Object write(Object obj) {
                setBrand setbrand = this.IconCompatParcelizer;
                has has = new has();
                show show = new show(((addEncodedPathSegment) obj).MediaBrowserCompat$ItemReceiver);
                has.MediaBrowserCompat$ItemReceiver = (List) new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, new ImmutableSetMultimap.BuilderMultimap.read(setbrand))).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
                    /*  JADX ERROR: Method generation error
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: null
                        java.util.ConcurrentModificationException
                        	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1660)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.insertDecompilationProblems(ClassGen.java:327)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:301)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    public final /* synthetic */ java.lang.Object read(
/*
Method generation error in method: o.setupDialog.1.read():java.lang.Object, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.1.read():java.lang.Object, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                }, new ensureAnimationInfo<List<T>, T>() {
                    /*  JADX ERROR: Method generation error
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                        jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:314)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    /*  JADX ERROR: Method generation error: null
                        java.util.ConcurrentModificationException
                        	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1660)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:484)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.insertDecompilationProblems(ClassGen.java:327)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:301)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                        */
                    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(
/*
Method generation error in method: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, dex: classes.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: o.setupDialog.8.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, java.lang.Object):void, class status: UNLOADED
                    	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                    	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:640)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                    	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:291)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                    	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                    	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:429)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.addInnerClass(ClassGen.java:249)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:238)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    
*/
                }));
                return has;
            }
        }

        /* renamed from: o.zzge$zzw$zza */
        public final /* synthetic */ class zza implements DirectDebitDeepLinkActivity {
            public static final /* synthetic */ zza read = new zza();

            private /* synthetic */ zza() {
            }

            public final Object write(Object obj) {
                List<build> list;
                setEncodedPathSegment setencodedpathsegment = (setEncodedPathSegment) obj;
                if (setencodedpathsegment == null || (list = setencodedpathsegment.IconCompatParcelizer) == null) {
                    return null;
                }
                Collection arrayList = new ArrayList();
                for (build build : list) {
                    build.write = setencodedpathsegment.MediaBrowserCompat$CustomActionResultReceiver;
                    interceptEvent write = AlertController$RecycleListView.write(build);
                    if (write != null) {
                        arrayList.add(write);
                    }
                }
                return (List) arrayList;
            }
        }
    }

    public final /* synthetic */ Object get() {
        return new EasycashCommonReviewFragment.IconCompatParcelizer(this.IconCompatParcelizer.get(), this.MediaBrowserCompat$ItemReceiver.get(), this.MediaDescriptionCompat.get(), this.MediaMetadataCompat.get(), this.write.get(), this.MediaBrowserCompat$CustomActionResultReceiver.get(), this.MediaBrowserCompat$MediaItem.get(), this.read.get(), this.RatingCompat.get(), this.MediaBrowserCompat$SearchResultReceiver.get());
    }

    /* renamed from: o.zzge$zzx */
    public final /* synthetic */ class zzx implements DirectDebitDeepLinkActivity {
        private final /* synthetic */ BulkTransferSuccessActivity MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ zzx(BulkTransferSuccessActivity bulkTransferSuccessActivity) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bulkTransferSuccessActivity;
        }

        /* renamed from: o.zzge$zzx$zza */
        public final /* synthetic */ class zza implements DebitCardMarketConductDeepLinkActivity {
            private final /* synthetic */ boolean IconCompatParcelizer;
            private final /* synthetic */ Constraints.ConstrainedSortedSet MediaBrowserCompat$CustomActionResultReceiver;
            private final /* synthetic */ BulkTransferSuccessActivity read;
            private final /* synthetic */ int write;

            public /* synthetic */ zza(BulkTransferSuccessActivity bulkTransferSuccessActivity, boolean z, int i, Constraints.ConstrainedSortedSet constrainedSortedSet) {
                this.read = bulkTransferSuccessActivity;
                this.IconCompatParcelizer = z;
                this.write = i;
                this.MediaBrowserCompat$CustomActionResultReceiver = constrainedSortedSet;
            }

            public final void IconCompatParcelizer(Object obj) {
                BulkTransferSuccessActivity bulkTransferSuccessActivity = this.read;
                boolean z = this.IconCompatParcelizer;
                int i = this.write;
                Constraints.ConstrainedSortedSet constrainedSortedSet = this.MediaBrowserCompat$CustomActionResultReceiver;
                getFontPath getfontpath = (getFontPath) obj;
                if (z) {
                    FragmentBuilder_BindSlipFragment fragmentBuilder_BindSlipFragment = bulkTransferSuccessActivity.write;
                    int i2 = constrainedSortedSet.write;
                    Map map = fragmentBuilder_BindSlipFragment.IconCompatParcelizer.get(Integer.valueOf(i));
                    if (map == null) {
                        map = new TreeMap();
                    }
                    map.put(Integer.valueOf(i2), getfontpath);
                    fragmentBuilder_BindSlipFragment.IconCompatParcelizer.put(Integer.valueOf(i), map);
                }
            }
        }

        public final Object write(Object obj) {
            return DebitCardResetOtpActivity.just(setCheckoutOptions.read((getFontPath) obj));
        }
    }

    /* renamed from: o.zzge$zzq */
    public final /* synthetic */ class zzq implements DirectDebitDeepLinkActivity {
        public /* synthetic */ zzq(Tracker.zza zza2) {
        }

        /* renamed from: o.zzge$zzq$zza */
        public final /* synthetic */ class zza implements DebitCardMarketConductDeepLinkActivity {
            private final /* synthetic */ String IconCompatParcelizer;
            private final /* synthetic */ BondTermsAndConditionsActivity write;

            public /* synthetic */ zza(BondTermsAndConditionsActivity bondTermsAndConditionsActivity, String str) {
                this.write = bondTermsAndConditionsActivity;
                this.IconCompatParcelizer = str;
            }

            public final void IconCompatParcelizer(Object obj) {
                BondTermsAndConditionsActivity bondTermsAndConditionsActivity = this.write;
                String str = this.IconCompatParcelizer;
                FragmentBuilder_BindSetupQuickTopUpFragment fragmentBuilder_BindSetupQuickTopUpFragment = bondTermsAndConditionsActivity.MediaBrowserCompat$ItemReceiver;
                if (fragmentBuilder_BindSetupQuickTopUpFragment.MediaBrowserCompat$ItemReceiver.containsKey(str)) {
                    fragmentBuilder_BindSetupQuickTopUpFragment.MediaBrowserCompat$ItemReceiver.remove(str);
                }
            }
        }

        /* renamed from: o.zzge$zzq$zzb */
        public final /* synthetic */ class zzb implements DebitCardMarketConductDeepLinkActivity {
            private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
            private final /* synthetic */ BondTermsAndConditionsActivity read;

            public /* synthetic */ zzb(BondTermsAndConditionsActivity bondTermsAndConditionsActivity, String str) {
                this.read = bondTermsAndConditionsActivity;
                this.MediaBrowserCompat$CustomActionResultReceiver = str;
            }

            public final void IconCompatParcelizer(Object obj) {
                this.read.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.put(this.MediaBrowserCompat$CustomActionResultReceiver, (username) obj);
            }
        }

        /* renamed from: o.zzge$zzq$zzc */
        public final /* synthetic */ class zzc implements DirectDebitDeepLinkActivity {
            private final /* synthetic */ String read;
            private final /* synthetic */ BondTermsAndConditionsActivity write;

            public /* synthetic */ zzc(BondTermsAndConditionsActivity bondTermsAndConditionsActivity, String str) {
                this.write = bondTermsAndConditionsActivity;
                this.read = str;
            }

            public final Object write(Object obj) {
                BondTermsAndConditionsActivity bondTermsAndConditionsActivity = this.write;
                String str = this.read;
                return DebitCardResetOtpActivity.just(bondTermsAndConditionsActivity.read.IconCompatParcelizer((username) obj, str));
            }
        }

        public final Object write(Object obj) {
            removeAllEncodedQueryParameters removeallencodedqueryparameters = (removeAllEncodedQueryParameters) obj;
            return new constrainedSet(removeallencodedqueryparameters.MediaBrowserCompat$ItemReceiver, removeallencodedqueryparameters.MediaBrowserCompat$CustomActionResultReceiver, removeallencodedqueryparameters.IconCompatParcelizer);
        }
    }
}
