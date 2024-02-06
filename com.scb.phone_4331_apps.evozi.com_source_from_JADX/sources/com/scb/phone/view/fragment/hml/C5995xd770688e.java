package com.scb.phone.view.fragment.hml;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.activity.investment.discover.BaseDiscoverSearchActivity;
import com.scb.phone.view.activity.partner.PartnerDiscoverWebViewActivity;
import com.scb.phone.view.activity.partner.PartnerLandingActivity;
import com.scb.phone.view.activity.prepaid.C8902x24e4e8fb;
import com.scb.phone.view.activity.prepaid.reset.PrepaidResetOtpActivity;
import com.scb.phone.view.activity.prepaid.reset.PrepaidResetPinSuccessActivity;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AccountTransferClient;
import p040o.BScanCNotificationDeepLinkActivity;
import p040o.Batch;
import p040o.C9942format;
import p040o.CustomConcurrentHashMap;
import p040o.DataBufferObserver;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindPurchaseDepositFragment;
import p040o.FragmentBuilder_BindQuickTopUpFragment;
import p040o.GoogleApi;
import p040o.HmlPinActivity;
import p040o.LocalProjectProvider;
import p040o.OECF_sRGB;
import p040o.Objects;
import p040o.OnDelegateCreatedListener;
import p040o.RemoteCreator;
import p040o.blockingConnect;
import p040o.bytesToStringUppercase;
import p040o.concurrencyLevel;
import p040o.containsRow;
import p040o.count$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.doBestEffortWrite;
import p040o.dumpAll;
import p040o.getAddress1FieldName;
import p040o.getLooper;
import p040o.getProjection;
import p040o.getStrokeJointType;
import p040o.hasConnectedApi;
import p040o.isContainer;
import p040o.isMyLocationEnabled;
import p040o.isTrafficEnabled;
import p040o.moveCamera;
import p040o.row;
import p040o.writeSparseIntArray;
import p040o.writeSparseLongArray;
import p040o.writeString;
import p040o.writeStringArray;
import p040o.writeTypedList;
import p040o.writeTypedSparseArray;
import p040o.zaaf;
import p040o.zaah;
import p040o.zaaj;
import p040o.zabr;
import p040o.zzcb;
import p040o.zzcc;
import p040o.zzcg;
import p040o.zzdl;
import p040o.zzdq;
import p040o.zzek;
import p040o.zzel;
import p040o.zzeu;
import p040o.zzfl;
import p040o.zzfm;
import p040o.zzfq;
import p040o.zzuk;

/* renamed from: com.scb.phone.view.fragment.hml.HmlNTBDocumentUploadFragment$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5995xd770688e implements LocalProjectProvider.C69386 {
    private final String IconCompatParcelizer;
    public final count$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;
    public final getLooper MediaBrowserCompat$ItemReceiver;
    private final AccountTransferClient.zzb MediaBrowserCompat$MediaItem;
    private final doBestEffortWrite MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final FragmentBuilder_BindQuickTopUpFragment f3086x50fd9e4a;
    private final getAddress1FieldName.read MediaDescriptionCompat;
    private final BaseDiscoverSearchActivity.IconCompatParcelizer MediaMetadataCompat;
    private final blockingConnect MediaSessionCompat$QueueItem;
    private final dumpAll MediaSessionCompat$ResultReceiverWrapper;
    private final String MediaSessionCompat$Token;
    private final hasConnectedApi ParcelableVolumeInfo;
    private final GoogleApi.Settings RatingCompat;
    public final FragmentBuilder_BindPurchaseDepositFragment read;
    public final Batch.Builder write;

    private C5995xd770688e() {
    }

    @HmlPinActivity
    public C5995xd770688e(getAddress1FieldName.read read2, count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver, String str, String str2, getLooper getlooper, doBestEffortWrite dobesteffortwrite, AccountTransferClient.zzb zzb, Batch.Builder builder, hasConnectedApi hasconnectedapi, FragmentBuilder_BindPurchaseDepositFragment fragmentBuilder_BindPurchaseDepositFragment, blockingConnect blockingconnect, dumpAll dumpall, GoogleApi.Settings settings, BaseDiscoverSearchActivity.IconCompatParcelizer iconCompatParcelizer, FragmentBuilder_BindQuickTopUpFragment fragmentBuilder_BindQuickTopUpFragment) {
        this.MediaDescriptionCompat = read2;
        this.MediaBrowserCompat$CustomActionResultReceiver = count_mediabrowsercompat_customactionresultreceiver;
        this.MediaBrowserCompat$ItemReceiver = getlooper;
        this.MediaBrowserCompat$SearchResultReceiver = dobesteffortwrite;
        this.MediaBrowserCompat$MediaItem = zzb;
        this.write = builder;
        this.ParcelableVolumeInfo = hasconnectedapi;
        this.read = fragmentBuilder_BindPurchaseDepositFragment;
        this.MediaSessionCompat$QueueItem = blockingconnect;
        this.MediaSessionCompat$ResultReceiverWrapper = dumpall;
        this.IconCompatParcelizer = str;
        this.MediaSessionCompat$Token = str2;
        this.RatingCompat = settings;
        this.MediaMetadataCompat = iconCompatParcelizer;
        this.f3086x50fd9e4a = fragmentBuilder_BindQuickTopUpFragment;
    }

    private DebitCardResetOtpActivity<getProjection> write(DebitCardResetOtpActivity<SingleDataEntity<OECF_sRGB>> debitCardResetOtpActivity) {
        return debitCardResetOtpActivity.map(zzfl.read).doOnNext(new Objects.ToStringHelper(this.read)).map(new zzcc(this.MediaBrowserCompat$ItemReceiver));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.read.write = null;
    }

    public final DebitCardResetOtpActivity<C8902x24e4e8fb> IconCompatParcelizer(CustomConcurrentHashMap.StrongExpirableEvictableEntry strongExpirableEvictableEntry) {
        if (strongExpirableEvictableEntry == CustomConcurrentHashMap.StrongExpirableEvictableEntry.HML) {
            BaseDiscoverSearchActivity.IconCompatParcelizer iconCompatParcelizer = this.MediaMetadataCompat;
            String str = this.f3086x50fd9e4a.MediaBrowserCompat$MediaItem;
            isContainer iscontainer = new isContainer(this.f3086x50fd9e4a.write, (String) null);
            zabr.IconCompatParcelizer("3024");
            zabr.IconCompatParcelizer("3025");
            return iconCompatParcelizer.read.completeSubmission(str, iscontainer).doFinally(DataBufferObserver.MediaBrowserCompat$CustomActionResultReceiver).map(new C9942format(this.RatingCompat));
        }
        getAddress1FieldName.read read2 = this.MediaDescriptionCompat;
        zabr.IconCompatParcelizer("9102");
        zabr.IconCompatParcelizer("9101");
        return read2.MediaBrowserCompat$ItemReceiver.completeSubmission().map(new zzcb(this.RatingCompat));
    }

    public final DebitCardResetOtpActivity<moveCamera> MediaBrowserCompat$ItemReceiver(String str, String str2) {
        return this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.confirmRegistration(str, str2).flatMap(zaaf.write).map(new zzeu(this.MediaBrowserCompat$SearchResultReceiver)).doOnNext(new writeSparseIntArray(this));
    }

    public final DebitCardResetOtpActivity<getProjection> IconCompatParcelizer(containsRow containsrow) {
        return this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.submitRegistration(containsrow).map(zzfl.read).map(new zzcc(this.MediaBrowserCompat$ItemReceiver));
    }

    public final DebitCardResetOtpActivity<PartnerDiscoverWebViewActivity.write> IconCompatParcelizer(String str) {
        return this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDepositProductDetail(str).map(writeTypedList.IconCompatParcelizer).map(new zzek(this.write));
    }

    public final DebitCardResetOtpActivity<List<PartnerDiscoverWebViewActivity.write>> IconCompatParcelizer() {
        return this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getDepositProductList(DiskLruCache.VERSION_1).map(zzdl.MediaBrowserCompat$CustomActionResultReceiver).map(new writeTypedSparseArray(this));
    }

    public final DebitCardResetOtpActivity<getProjection> MediaBrowserCompat$ItemReceiver() {
        return write((DebitCardResetOtpActivity<SingleDataEntity<OECF_sRGB>>) this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getEkycRegistration().flatMap(zaaj.write).map(new writeSparseLongArray(this)));
    }

    public final getProjection write() {
        return this.MediaBrowserCompat$ItemReceiver.write(this.read.write);
    }

    public final PartnerLandingActivity.write MediaBrowserCompat$SearchResultReceiver() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer);
        sb.append("beid/");
        return new PartnerLandingActivity.write(sb.toString(), this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver.write, "sha256/980Ionqp3wkYtN9SZVgMzuWQzJta1nfxNPwTem1X0uc=", "");
    }

    public final DebitCardResetOtpActivity<getStrokeJointType> MediaBrowserCompat$MediaItem() {
        return this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getFatca().map(zzcg.zze.read).map(new RemoteCreator(this.MediaBrowserCompat$MediaItem));
    }

    public final DebitCardResetOtpActivity<List<isTrafficEnabled>> MediaMetadataCompat() {
        return this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getObjectives().map(zzel.MediaBrowserCompat$CustomActionResultReceiver).map(new zzfm(this.MediaSessionCompat$ResultReceiverWrapper));
    }

    public final DebitCardResetOtpActivity<List<PrepaidResetOtpActivity.write>> RatingCompat() {
        return this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getOccupationList().map(zaah.write).map(new zzfq(this.MediaSessionCompat$QueueItem));
    }

    public final DebitCardResetOtpActivity<PrepaidResetPinSuccessActivity.write> MediaBrowserCompat$ItemReceiver(String str) {
        return this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getProductTermCondition(str).map(OnDelegateCreatedListener.MediaBrowserCompat$ItemReceiver).map(new bytesToStringUppercase(this.ParcelableVolumeInfo));
    }

    public final DebitCardResetOtpActivity<List<isMyLocationEnabled>> MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.getTitleList(str).map(zzcg.zzb.IconCompatParcelizer).map(new writeStringArray(this));
    }

    public final DebitCardResetOtpActivity<getProjection> IconCompatParcelizer(row row) {
        row.write = this.MediaSessionCompat$Token;
        return this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.initiateEkycRegistration(row).map(zzfl.read).map(new writeString(this));
    }

    public final void read() {
        this.read.write = null;
    }

    public final void MediaDescriptionCompat() {
        FragmentBuilder_BindPurchaseDepositFragment fragmentBuilder_BindPurchaseDepositFragment = this.read;
        OECF_sRGB oECF_sRGB = new OECF_sRGB();
        oECF_sRGB.setHasDecor = "RP_INITIAL";
        fragmentBuilder_BindPurchaseDepositFragment.write = oECF_sRGB;
    }

    public final DebitCardResetOtpActivity<getProjection> write(containsRow containsrow) {
        return write(this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.submitRegistration(containsrow));
    }

    public final BScanCNotificationDeepLinkActivity<getProjection> read(containsRow containsrow) {
        getAddress1FieldName.read read2 = this.MediaDescriptionCompat;
        containsrow.ParcelableVolumeInfo = this.MediaSessionCompat$Token;
        return BScanCNotificationDeepLinkActivity.read(read2.MediaBrowserCompat$ItemReceiver.submitConsent(containsrow).map(zzfl.read).map(new zzcc(this.MediaBrowserCompat$ItemReceiver)));
    }

    public final DebitCardResetOtpActivity<getProjection> MediaBrowserCompat$ItemReceiver(containsRow containsrow) {
        return write(this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.submitRegistration(containsrow));
    }

    public final DebitCardResetOtpActivity<getProjection> MediaBrowserCompat$CustomActionResultReceiver(containsRow containsrow) {
        return write(this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.submitRegistration(containsrow));
    }

    public final DebitCardResetOtpActivity<getProjection> MediaBrowserCompat$MediaItem(containsRow containsrow) {
        return write(this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.submitRegistration(containsrow));
    }

    public final DebitCardResetOtpActivity<getProjection> MediaMetadataCompat(containsRow containsrow) {
        return write(this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.submitRegistration(containsrow));
    }

    public final DebitCardResetOtpActivity<zzuk> MediaBrowserCompat$CustomActionResultReceiver(concurrencyLevel concurrencylevel) {
        return this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver.uploadNationalId(concurrencylevel).map(new zzdq(this.MediaBrowserCompat$ItemReceiver));
    }
}
