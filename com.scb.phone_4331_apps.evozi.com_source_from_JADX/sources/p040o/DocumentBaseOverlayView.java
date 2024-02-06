package p040o;

import android.os.SystemClock;
import p040o.CharMatcher;
import p040o.LinkedListMultimap;
import p040o.StandardTable;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.DocumentBaseOverlayView */
public final class DocumentBaseOverlayView extends writeUInt64NoTag<C7134hH> {
    /* access modifiers changed from: private */
    public boolean IconCompatParcelizer;
    public long MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final StandardTable.RowMap.EntryIterator MediaDescriptionCompat;
    private final LinkedListMultimap.MultisetView.C35822 MediaMetadataCompat;
    /* access modifiers changed from: private */
    public boolean read;
    public final toLowerCase write;

    /* renamed from: o.DocumentBaseOverlayView$IconCompatParcelizer */
    public static final /* synthetic */ class IconCompatParcelizer extends InvestmentFundDetailsActivity implements FundFactSheetActivity<C7134hH, HmlVerifyPhoneValidateOtpActivity> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final String getName() {
            return "navigateToLifeStyleLanding";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(C7134hH.class);
        }

        public final String getSignature() {
            return "navigateToLifeStyleLanding()V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C7134hH hHVar = (C7134hH) obj;
            onGetStartedClick.write((Object) hHVar, "p1");
            hHVar.IconCompatParcelizer();
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.DocumentBaseOverlayView$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<C7134hH> {
        private /* synthetic */ DocumentBaseOverlayView IconCompatParcelizer;

        public MediaDescriptionCompat(DocumentBaseOverlayView documentBaseOverlayView) {
            this.IconCompatParcelizer = documentBaseOverlayView;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7134hH) obj).MediaBrowserCompat$ItemReceiver((15000 - (SystemClock.elapsedRealtime() - this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver)) / 1000);
        }
    }

    /* renamed from: o.DocumentBaseOverlayView$MediaMetadataCompat */
    public static final /* synthetic */ class MediaMetadataCompat extends InvestmentFundDetailsActivity implements FundFactSheetActivity<getPlaceIds, HmlVerifyPhoneValidateOtpActivity> {
        public MediaMetadataCompat(DocumentBaseOverlayView documentBaseOverlayView) {
            super(1, documentBaseOverlayView);
        }

        public final String getName() {
            return "onSendOtaSuccess";
        }

        public final CheckSCBSEligibilityActivity getOwner() {
            return FundOnboardingLandingActivity_ViewBinding.write(DocumentBaseOverlayView.class);
        }

        public final String getSignature() {
            return "onSendOtaSuccess(Lcom/scb/phone/domain/entity/juristic/JuristicSendOtaResponse;)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            getPlaceIds getplaceids = (getPlaceIds) obj;
            onGetStartedClick.write((Object) getplaceids, "p1");
            DocumentBaseOverlayView.write((DocumentBaseOverlayView) this.receiver, getplaceids);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.DocumentBaseOverlayView$ParcelableVolumeInfo */
    static final class ParcelableVolumeInfo extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ DocumentBaseOverlayView MediaBrowserCompat$ItemReceiver;
        final /* synthetic */ String write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        ParcelableVolumeInfo(DocumentBaseOverlayView documentBaseOverlayView, String str) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = documentBaseOverlayView;
            this.write = str;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final String str = (String) obj;
            onGetStartedClick.write((Object) str, "preregistrationTokenId");
            DocumentBaseOverlayView.write(this.MediaBrowserCompat$ItemReceiver);
            DocumentBaseOverlayView documentBaseOverlayView = this.MediaBrowserCompat$ItemReceiver;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<C7134hH>(this) {
                private /* synthetic */ ParcelableVolumeInfo MediaBrowserCompat$ItemReceiver;

                {
                    this.MediaBrowserCompat$ItemReceiver = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    C7134hH hHVar = (C7134hH) obj;
                    String str = this.MediaBrowserCompat$ItemReceiver.write;
                    int hashCode = str.hashCode();
                    if (hashCode != -58979906) {
                        if (hashCode == 233355415 && str.equals("DEVICE_NOT_REGISTERED")) {
                            hHVar.read(str);
                        }
                    } else if (str.equals("PRE_REGISTERED")) {
                        hHVar.IconCompatParcelizer(str);
                    }
                }
            };
            if (documentBaseOverlayView.RatingCompat != null) {
                r1.IconCompatParcelizer(documentBaseOverlayView.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.DocumentBaseOverlayView$RatingCompat */
    public static final class RatingCompat<V> implements writeUInt64NoTag.IconCompatParcelizer<C7134hH> {
        private /* synthetic */ DocumentBaseOverlayView read;
        private /* synthetic */ String write;

        public RatingCompat(DocumentBaseOverlayView documentBaseOverlayView, String str) {
            this.read = documentBaseOverlayView;
            this.write = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7134hH) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read.MediaDescriptionCompat.MediaDescriptionCompat(this.write), getOversizeImage.SUCCESS);
        }
    }

    /* renamed from: o.DocumentBaseOverlayView$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<C7134hH> {
        public static final read read = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C7134hH) obj).MediaBrowserCompat$ItemReceiver();
        }
    }

    /* renamed from: o.DocumentBaseOverlayView$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<C7134hH> {
        private /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ DocumentBaseOverlayView read;

        write(DocumentBaseOverlayView documentBaseOverlayView, Throwable th) {
            this.read = documentBaseOverlayView;
            this.MediaBrowserCompat$ItemReceiver = th;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            access$2200 MediaBrowserCompat$ItemReceiver2 = this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS);
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "errorDisplayMapper.transform(throwable)");
            ((C7134hH) obj).MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer, getOversizeImage.ERROR);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public DocumentBaseOverlayView(toLowerCase tolowercase, LinkedListMultimap.MultisetView.C35822 r3, StandardTable.RowMap.EntryIterator entryIterator, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) tolowercase, "juristicSendOtaCase");
        onGetStartedClick.write((Object) r3, "juristicVerifyUserController");
        onGetStartedClick.write((Object) entryIterator, "juristicOnboardingDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.write = tolowercase;
        this.MediaMetadataCompat = r3;
        this.MediaDescriptionCompat = entryIterator;
    }

    public static final /* synthetic */ void write(DocumentBaseOverlayView documentBaseOverlayView) {
        if (documentBaseOverlayView.RatingCompat != null) {
            documentBaseOverlayView.RatingCompat.aj_();
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(DocumentBaseOverlayView documentBaseOverlayView, Throwable th) {
        boolean z = true;
        if (documentBaseOverlayView.RatingCompat != null) {
            documentBaseOverlayView.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.read;
        if (documentBaseOverlayView.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(documentBaseOverlayView.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer write2 = new write(documentBaseOverlayView, th);
        if (documentBaseOverlayView.RatingCompat == null) {
            z = false;
        }
        if (z) {
            write2.IconCompatParcelizer(documentBaseOverlayView.RatingCompat);
        }
    }

    public static final /* synthetic */ void write(DocumentBaseOverlayView documentBaseOverlayView, getPlaceIds getplaceids) {
        boolean z = true;
        if (documentBaseOverlayView.RatingCompat != null) {
            documentBaseOverlayView.RatingCompat.aj_();
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.read;
        if (documentBaseOverlayView.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(documentBaseOverlayView.RatingCompat);
        }
        writeUInt64NoTag.IconCompatParcelizer documentBaseOverlayView$MediaBrowserCompat$MediaItem = new DocumentBaseOverlayView$MediaBrowserCompat$MediaItem(getplaceids);
        if (documentBaseOverlayView.RatingCompat == null) {
            z = false;
        }
        if (z) {
            documentBaseOverlayView$MediaBrowserCompat$MediaItem.IconCompatParcelizer(documentBaseOverlayView.RatingCompat);
        }
    }

    public final void write(String str, String str2, String str3, String str4) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.MultisetView.C35822 r0 = this.MediaMetadataCompat;
        FundFactSheetActivity parcelableVolumeInfo = new ParcelableVolumeInfo(this, str2);
        FundFactSheetActivity documentBaseOverlayView$MediaSessionCompat$Token = new DocumentBaseOverlayView$MediaSessionCompat$Token(this);
        standardAddAll standardaddall = new standardAddAll(str, str2, str3, str4);
        onGetStartedClick.write((Object) parcelableVolumeInfo, "preregistrationTokenId");
        onGetStartedClick.write((Object) documentBaseOverlayView$MediaSessionCompat$Token, "onError");
        onGetStartedClick.write((Object) standardaddall, "juristicVerifyUserRequest");
        r0.IconCompatParcelizer(r0.IconCompatParcelizer, parcelableVolumeInfo, documentBaseOverlayView$MediaSessionCompat$Token, new CharMatcher.IconCompatParcelizer(standardaddall));
    }

    public final boolean IconCompatParcelizer(String str, int i) {
        onGetStartedClick.write((Object) str, "pinInput");
        boolean z = false;
        this.read = !(str == null || str.equals("")) && str.length() == i;
        writeUInt64NoTag.IconCompatParcelizer documentBaseOverlayView$MediaBrowserCompat$CustomActionResultReceiver = new C3322x1d7fed96(this);
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            documentBaseOverlayView$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.RatingCompat);
        }
        return this.read;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(String str, int i) {
        onGetStartedClick.write((Object) str, "registrationNo");
        boolean z = false;
        this.IconCompatParcelizer = !(str == null || str.equals("")) && str.length() == i;
        writeUInt64NoTag.IconCompatParcelizer documentBaseOverlayView$MediaBrowserCompat$CustomActionResultReceiver = new C3322x1d7fed96(this);
        if (this.RatingCompat != null) {
            z = true;
        }
        if (z) {
            documentBaseOverlayView$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this.RatingCompat);
        }
        return this.IconCompatParcelizer;
    }
}
