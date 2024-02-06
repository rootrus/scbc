package p040o;

import p040o.AbstractIterator;
import p040o.PhenotypeFlag;
import p040o.ServerProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.nK */
public final class C5010nK extends writeUInt64NoTag<ServerProjectProvider.C70611> {
    public final PhenotypeFlag.zza IconCompatParcelizer;
    public final AbstractIterator.State MediaBrowserCompat$ItemReceiver;
    private final isTopPrivateDomain MediaMetadataCompat;
    public final writeObject read;
    public C3092xce3d994b write;

    /* renamed from: o.nK$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C70611> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C70611) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.nK$ParcelableVolumeInfo */
    public static final class ParcelableVolumeInfo<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C70611> {
        private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;

        public ParcelableVolumeInfo(boolean z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C70611) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.nK$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C70611> {
        public static final write read = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C70611) obj).MediaBrowserCompat$SearchResultReceiver();
        }
    }

    /* renamed from: o.nK$MediaDescriptionCompat */
    public static final /* synthetic */ class MediaDescriptionCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<Integer, HmlVerifyPhoneValidateOtpActivity> {
        public MediaDescriptionCompat(C5010nK nKVar) {
            super(1, nKVar);
        }

        public final String getName() {
            return "onSaveFavouriteSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C5010nK.class);
        }

        public final String getSignature() {
            return "onSaveFavouriteSuccess(I)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C5010nK.read((C5010nK) this.receiver);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.nK$MediaMetadataCompat */
    public static final class MediaMetadataCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C70611> {
        public static final MediaMetadataCompat MediaBrowserCompat$CustomActionResultReceiver = new MediaMetadataCompat();

        MediaMetadataCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C70611) obj).MediaMetadataCompat();
        }
    }

    /* renamed from: o.nK$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C70611> {
        public static final RatingCompat read = new RatingCompat();

        RatingCompat() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C70611) obj).write();
        }
    }

    /* renamed from: o.nK$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C70611> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C70611) obj).read();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5010nK(RegularImmutableBiMap regularImmutableBiMap, PhenotypeFlag.zza zza, AbstractIterator.State state, isTopPrivateDomain istopprivatedomain, writeObject writeobject) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) zza, "validateEmailUseCase");
        onGetStartedClick.write((Object) state, "remittanceVerificationCase");
        onGetStartedClick.write((Object) istopprivatedomain, "remittanceDisplayMapper");
        onGetStartedClick.write((Object) writeobject, "remittanceSaveFavouriteCase");
        this.IconCompatParcelizer = zza;
        this.MediaBrowserCompat$ItemReceiver = state;
        this.MediaMetadataCompat = istopprivatedomain;
        this.read = writeobject;
    }

    public final void onDestroy() {
        writeObject writeobject = this.read;
        if (!writeobject.MediaBrowserCompat$MediaItem.isDisposed()) {
            writeobject.MediaBrowserCompat$MediaItem.dispose();
        }
        AbstractIterator.State state = this.MediaBrowserCompat$ItemReceiver;
        if (!state.MediaBrowserCompat$MediaItem.isDisposed()) {
            state.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    public static final /* synthetic */ void read(C5010nK nKVar) {
        boolean z = true;
        if (nKVar.RatingCompat != null) {
            nKVar.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.MediaBrowserCompat$ItemReceiver;
        if (nKVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(nKVar.RatingCompat);
        }
    }

    public static final /* synthetic */ void read(C5010nK nKVar, tiltGesturesEnabled tiltgesturesenabled) {
        boolean z = true;
        if (nKVar.RatingCompat != null) {
            nKVar.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer nk_mediabrowsercompat_searchresultreceiver = new nK$MediaBrowserCompat$SearchResultReceiver(nKVar.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(tiltgesturesenabled));
        if (nKVar.RatingCompat == null) {
            z = false;
        }
        if (z) {
            nk_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(nKVar.RatingCompat);
        }
    }
}
