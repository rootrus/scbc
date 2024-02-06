package com.scb.phone.view.custom.debitcard;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.data.network.service.BillPaymentService;
import java.util.ArrayList;
import java.util.List;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.C1251R;
import p040o.C5431transform;
import p040o.Collections2;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindPrepaidCashOutSuccessFragment;
import p040o.FragmentBuilder_BindPrepaidRequestMailingAddressFragment;
import p040o.FragmentBuilder_BindPrepaidTravelDetailTabFragment;
import p040o.GoogleAnalytics;
import p040o.GoogleMapOptions;
import p040o.HitBuilders;
import p040o.HmlLatestPersonalInformationDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.IAccountAccessor;
import p040o.ImmutableSortedSet;
import p040o.ImmutableSortedSetFauxverideShim;
import p040o.Interners;
import p040o.ResolveAccountRequest;
import p040o.ResolveAccountResponse;
import p040o.ResourceUtils;
import p040o.ServiceSpecificExtraArgs;
import p040o.ShowFirstParty;
import p040o.SignInButtonConfig;
import p040o.SignInButtonCreator;
import p040o.SignInButtonImpl;
import p040o.StreetViewPanoramaFragment;
import p040o.SupportMapFragment;
import p040o.addImpression;
import p040o.checkBundlesEquality;
import p040o.classificationConfidence;
import p040o.createElementSet;
import p040o.createView;
import p040o.getAccountAccessor;
import p040o.getButtonSize;
import p040o.getColorScheme;
import p040o.getEnvLanguage$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getLogSessionId;
import p040o.getPanningGesturesEnabled;
import p040o.getSaveDefaultAccount;
import p040o.getSessionId;
import p040o.getSignInAccountHint;
import p040o.getUserNavigationEnabled;
import p040o.isFromCrossClientAuth;
import p040o.isMapToolbarEnabled;
import p040o.newStrongInterner;
import p040o.onActivityStarted;
import p040o.onCopy;
import p040o.onIndoorLevelActivated;
import p040o.onInfoWindowLongClick;
import p040o.onStreetViewPanoramaLongClick;
import p040o.panoramaCamera;
import p040o.panoramaId;
import p040o.putInstance;
import p040o.removeAllOccurrences;
import p040o.setAccountAccessor;
import p040o.setCustomDimension;
import p040o.setIsFromCrossClientAuth;
import p040o.setLabel;
import p040o.setNonInteraction;
import p040o.setPrice;
import p040o.setQuantity;
import p040o.setSaveDefaultAccount;
import p040o.useViewLifecycleInFragment;
import p040o.userNavigationEnabled;
import p040o.withExplicitOrder;
import p040o.writeByteArray;
import p040o.writeFloat;
import p040o.zzce;
import p040o.zzcg;
import p040o.zzch;
import p040o.zzvf;

public final class CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver implements classificationConfidence {
    public final FragmentBuilder_BindPrepaidTravelDetailTabFragment IconCompatParcelizer;
    private final String Keep;
    public final setCustomDimension MediaBrowserCompat$CustomActionResultReceiver;
    public final HitBuilders MediaBrowserCompat$ItemReceiver;
    public final setPrice MediaBrowserCompat$MediaItem;
    public final setQuantity MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final FragmentBuilder_BindPrepaidCashOutSuccessFragment f3075x50fd9e4a;
    private final FragmentBuilder_BindPrepaidRequestMailingAddressFragment MediaDescriptionCompat;
    public final setNonInteraction MediaMetadataCompat;
    private final setLabel MediaSessionCompat$QueueItem;
    private final getLogSessionId MediaSessionCompat$ResultReceiverWrapper;
    private final BillPaymentService MediaSessionCompat$Token;
    private final onActivityStarted ParcelableVolumeInfo;
    private final removeAllOccurrences.write PlaybackStateCompat;
    private final getEnvLanguage$MediaBrowserCompat$CustomActionResultReceiver RatingCompat;
    public final addImpression read;
    private final createElementSet.IconCompatParcelizer setHasDecor;
    public final GoogleAnalytics.zzb write;

    private CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver() {
    }

    @HmlPinActivity
    public CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver(String str, getEnvLanguage$MediaBrowserCompat$CustomActionResultReceiver getenvlanguage_mediabrowsercompat_customactionresultreceiver, BillPaymentService billPaymentService, FragmentBuilder_BindPrepaidCashOutSuccessFragment fragmentBuilder_BindPrepaidCashOutSuccessFragment, createElementSet.IconCompatParcelizer iconCompatParcelizer, removeAllOccurrences.write write2, FragmentBuilder_BindPrepaidRequestMailingAddressFragment fragmentBuilder_BindPrepaidRequestMailingAddressFragment, HitBuilders hitBuilders, addImpression addimpression, GoogleAnalytics.zzb zzb, setCustomDimension setcustomdimension, setNonInteraction setnoninteraction, setQuantity setquantity, setPrice setprice, getLogSessionId getlogsessionid, FragmentBuilder_BindPrepaidTravelDetailTabFragment fragmentBuilder_BindPrepaidTravelDetailTabFragment, onActivityStarted onactivitystarted, setLabel setlabel) {
        this.RatingCompat = getenvlanguage_mediabrowsercompat_customactionresultreceiver;
        this.MediaSessionCompat$Token = billPaymentService;
        this.f3075x50fd9e4a = fragmentBuilder_BindPrepaidCashOutSuccessFragment;
        this.setHasDecor = iconCompatParcelizer;
        this.PlaybackStateCompat = write2;
        this.MediaDescriptionCompat = fragmentBuilder_BindPrepaidRequestMailingAddressFragment;
        this.MediaBrowserCompat$ItemReceiver = hitBuilders;
        this.read = addimpression;
        this.write = zzb;
        this.MediaBrowserCompat$CustomActionResultReceiver = setcustomdimension;
        this.MediaMetadataCompat = setnoninteraction;
        this.MediaBrowserCompat$SearchResultReceiver = setquantity;
        this.MediaBrowserCompat$MediaItem = setprice;
        this.MediaSessionCompat$ResultReceiverWrapper = getlogsessionid;
        this.IconCompatParcelizer = fragmentBuilder_BindPrepaidTravelDetailTabFragment;
        this.Keep = str;
        this.ParcelableVolumeInfo = onactivitystarted;
        this.MediaSessionCompat$QueueItem = setlabel;
    }

    public final userNavigationEnabled IconCompatParcelizer() {
        return this.f3075x50fd9e4a.write;
    }

    public final putInstance MediaBrowserCompat$CustomActionResultReceiver() {
        return this.f3075x50fd9e4a.read;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.MediaDescriptionCompat.read = null;
    }

    public final DebitCardResetOtpActivity<getPanningGesturesEnabled> read(Collections2 collections2) {
        return this.RatingCompat.write.getAutoInquiryAmount(collections2).flatMap(new ShowFirstParty(this));
    }

    public final StreetViewPanoramaFragment.zza read() {
        return this.MediaDescriptionCompat.read;
    }

    public final DebitCardResetOtpActivity<StreetViewPanoramaFragment.zza> MediaBrowserCompat$MediaItem() {
        if (this.MediaDescriptionCompat.read == null) {
            return this.RatingCompat.write.getRecommandedBiller().map(new setAccountAccessor(this)).doOnNext(new checkBundlesEquality(this.MediaDescriptionCompat));
        }
        return DebitCardResetOtpActivity.just(this.MediaDescriptionCompat.read);
    }

    public final DebitCardResetOtpActivity<onStreetViewPanoramaLongClick> IconCompatParcelizer(ImmutableSortedSet.SerializedForm serializedForm) {
        return this.RatingCompat.write.getBillPaymentEDonationConfirmation(serializedForm).flatMap(new SignInButtonCreator(this));
    }

    public final DebitCardResetOtpActivity<userNavigationEnabled> MediaBrowserCompat$ItemReceiver(ImmutableSortedSetFauxverideShim immutableSortedSetFauxverideShim) {
        return this.RatingCompat.write.getBillPaymentEDonationReview(immutableSortedSetFauxverideShim).flatMap(new ServiceSpecificExtraArgs(this)).doOnNext(new zzcg.zza(this.f3075x50fd9e4a));
    }

    public final DebitCardResetOtpActivity<GoogleMapOptions> MediaBrowserCompat$ItemReceiver(Integer num) {
        return this.RatingCompat.write.getBillPaymentHistory(num).map(new IAccountAccessor(this.ParcelableVolumeInfo));
    }

    public final DebitCardResetOtpActivity<userNavigationEnabled> write(putInstance putinstance) {
        this.f3075x50fd9e4a.read = putinstance;
        if (putinstance.MediaMetadataCompat == null) {
            putinstance.MediaMetadataCompat = this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (putinstance.RatingCompat == null) {
            putinstance.RatingCompat = this.IconCompatParcelizer.write;
        }
        if (putinstance.MediaSessionCompat$QueueItem == null) {
            putinstance.MediaSessionCompat$QueueItem = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        }
        return this.RatingCompat.write.getBillPaymentReview(putinstance).flatMap(new getSessionId(this)).doOnNext(new zzcg.zza(this.f3075x50fd9e4a)).doOnComplete(new getSignInAccountHint(this));
    }

    public final DebitCardResetOtpActivity<panoramaId> MediaBrowserCompat$CustomActionResultReceiver(newStrongInterner newstronginterner) {
        newstronginterner.MediaBrowserCompat$ItemReceiver = this.Keep;
        return this.RatingCompat.write.getBillScan(newstronginterner).map(zzce.MediaBrowserCompat$ItemReceiver).map(new writeFloat(this.MediaSessionCompat$ResultReceiverWrapper));
    }

    public final DebitCardResetOtpActivity IconCompatParcelizer(String str) {
        return this.RatingCompat.write.getBillerByAccountNumber(str, (String) null).map(new getSaveDefaultAccount(this)).doOnNext(new checkBundlesEquality(this.MediaDescriptionCompat));
    }

    public final DebitCardResetOtpActivity<StreetViewPanoramaFragment.zza> write(String str) {
        return this.RatingCompat.write.getBillerByAccountNumber(str, (String) null).map(new ResourceUtils(this));
    }

    public final DebitCardResetOtpActivity MediaBrowserCompat$ItemReceiver(String str) {
        return this.RatingCompat.write.getBillerByCompCode(str).map(new ServiceSpecificExtraArgs.PlusExtraArgs(this));
    }

    public final DebitCardResetOtpActivity<List<onIndoorLevelActivated>> MediaBrowserCompat$SearchResultReceiver() {
        zzvf zzvf = this.setHasDecor.write;
        if (zzvf == null || zzvf.read == null) {
            return DebitCardResetOtpActivity.just(new ArrayList());
        }
        return DebitCardResetOtpActivity.just(zzvf.read);
    }

    public final DebitCardResetOtpActivity<userNavigationEnabled> write(withExplicitOrder withexplicitorder) {
        return this.RatingCompat.write.getDealReview(withexplicitorder).flatMap(new setIsFromCrossClientAuth(this)).doOnNext(new zzcg.zza(this.f3075x50fd9e4a));
    }

    public final DebitCardResetOtpActivity<SupportMapFragment> read(int i) {
        return this.RatingCompat.write.getEBills(i).flatMap(new ServiceSpecificExtraArgs.GamesExtraArgs(this));
    }

    public final onInfoWindowLongClick write() {
        removeAllOccurrences.write write2 = this.PlaybackStateCompat;
        onInfoWindowLongClick oninfowindowlongclick = write2.read;
        if (oninfowindowlongclick != null && "BILLPAYMENT".equals(oninfowindowlongclick.AlertController$RecycleListView)) {
            return write2.read;
        }
        return null;
    }

    public final DebitCardResetOtpActivity<StreetViewPanoramaFragment.zza> write(String str, String str2) {
        return this.RatingCompat.write.getBillerByAccountNumber(str, str2).map(new SignInButtonImpl(this));
    }

    public final DebitCardResetOtpActivity<userNavigationEnabled> read(putInstance putinstance) {
        return this.RatingCompat.write.getBillPaymentReview(putinstance).flatMap(new SignInButtonConfig(this)).doOnNext(new zzcg.zza(this.f3075x50fd9e4a)).doOnComplete(new getSignInAccountHint(this));
    }

    public final DebitCardResetOtpActivity write(ImmutableSortedSet.Builder builder) {
        return this.RatingCompat.write.getPerformCinemaPayment(builder).flatMap(new setSaveDefaultAccount(this));
    }

    public final DebitCardResetOtpActivity<onStreetViewPanoramaLongClick> IconCompatParcelizer(ImmutableSortedSet.Builder builder) {
        return this.RatingCompat.write.getPerformPayment(builder).flatMap(new ResolveAccountRequest(this));
    }

    public final DebitCardResetOtpActivity<onStreetViewPanoramaLongClick> MediaBrowserCompat$ItemReceiver(ImmutableSortedSet.Builder builder) {
        return this.RatingCompat.write.getPerformPaymentWithReferer(builder).flatMap(new isFromCrossClientAuth(this));
    }

    public final DebitCardResetOtpActivity<panoramaCamera> MediaBrowserCompat$ItemReceiver(Interners.WeakInterner.InternReference internReference) {
        return this.RatingCompat.write.getRepeat(internReference).map(zzch.MediaBrowserCompat$ItemReceiver).map(new writeByteArray(this.MediaSessionCompat$QueueItem));
    }

    public final DebitCardResetOtpActivity<useViewLifecycleInFragment> MediaBrowserCompat$CustomActionResultReceiver(ImmutableSortedSet.Builder builder) {
        return this.RatingCompat.write.getRtpEBillPaymentConfirm(builder).flatMap(new createView(this));
    }

    public final DebitCardResetOtpActivity<isMapToolbarEnabled> MediaBrowserCompat$ItemReceiver(Interners interners) {
        return this.RatingCompat.write.getRtpEBillPaymentReview(interners).flatMap(new getAccountAccessor(this));
    }

    public final BScanCNotificationDeepLinkActivity<getUserNavigationEnabled> MediaBrowserCompat$CustomActionResultReceiver(C5431transform transform) {
        BScanCNotificationDeepLinkActivity<SingleDataEntity<C1251R.C1253id>> searchBillPaymentList = this.MediaSessionCompat$Token.getSearchBillPaymentList(transform);
        ServiceSpecificExtraArgs.CastExtraArgs castExtraArgs = new ServiceSpecificExtraArgs.CastExtraArgs(this);
        HmlLatestPersonalInformationDeepLinkActivity.write(castExtraArgs, "mapper is null");
        return new onCopy(searchBillPaymentList, castExtraArgs);
    }

    public final DebitCardResetOtpActivity<getUserNavigationEnabled> IconCompatParcelizer(String str, String str2) {
        getEnvLanguage$MediaBrowserCompat$CustomActionResultReceiver getenvlanguage_mediabrowsercompat_customactionresultreceiver = this.RatingCompat;
        return getenvlanguage_mediabrowsercompat_customactionresultreceiver.write.getSearchBillerList(new C5431transform(str, str2)).map(new getColorScheme(this));
    }

    public final DebitCardResetOtpActivity<getUserNavigationEnabled> MediaBrowserCompat$ItemReceiver(String str, String str2) {
        getEnvLanguage$MediaBrowserCompat$CustomActionResultReceiver getenvlanguage_mediabrowsercompat_customactionresultreceiver = this.RatingCompat;
        return getenvlanguage_mediabrowsercompat_customactionresultreceiver.write.getRtpSubscriptionSearchBillerList(new C5431transform(str, str2)).map(new getButtonSize(this));
    }

    public final String MediaDescriptionCompat() {
        return this.PlaybackStateCompat.IconCompatParcelizer;
    }

    public final DebitCardResetOtpActivity<StreetViewPanoramaFragment.zza> MediaMetadataCompat() {
        if (this.MediaDescriptionCompat.read == null) {
            return this.RatingCompat.write.getRtpSubscriptionRecommandedBiller().map(new ResolveAccountResponse(this)).doOnNext(new checkBundlesEquality(this.MediaDescriptionCompat));
        }
        return DebitCardResetOtpActivity.just(this.MediaDescriptionCompat.read);
    }
}
