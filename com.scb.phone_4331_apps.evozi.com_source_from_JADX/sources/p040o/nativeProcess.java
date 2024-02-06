package p040o;

import p040o.C10827Iterators;
import p040o.CodedOutputStream;
import p040o.Iterables;
import p040o.writeUInt64NoTag;

/* renamed from: o.nativeProcess */
public final class nativeProcess extends CodedOutputStream.OutOfSpaceException<C1152x3c012820> {
    /* access modifiers changed from: private */
    public final lessThanUnsigned MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver MediaMetadataCompat;
    private final C10827Iterators.C35423 read;

    /* renamed from: o.nativeProcess$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<C1152x3c012820> {
        public static final IconCompatParcelizer MediaBrowserCompat$ItemReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((C1152x3c012820) obj).MediaMetadataCompat();
        }
    }

    /* renamed from: o.nativeProcess$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ nativeProcess MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(nativeProcess nativeprocess) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = nativeprocess;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (Throwable) obj, "it");
            nativeProcess.write(this.MediaBrowserCompat$CustomActionResultReceiver);
            nativeProcess nativeprocess = this.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C50461.IconCompatParcelizer;
            if (nativeprocess.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(nativeprocess.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.nativeProcess$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ nativeProcess read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(nativeProcess nativeprocess) {
            super(1);
            this.read = nativeprocess;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (Throwable) obj, "it");
            nativeProcess nativeprocess = this.read;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C50475.MediaBrowserCompat$ItemReceiver;
            if (nativeprocess.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(nativeprocess.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(nativeProcess nativeprocess, String str) {
        onGetStartedClick.write((Object) str, "<set-?>");
        nativeprocess.write = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public nativeProcess(C10827Iterators.C35423 r2, lessThanUnsigned lessthanunsigned, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) r2, "directDebitBillerSearchController");
        onGetStartedClick.write((Object) lessthanunsigned, "billPaymentBillerDisplayMapper");
        onGetStartedClick.write((Object) getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, "profileRepositoryContractor");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        this.read = r2;
        this.MediaBrowserCompat$ItemReceiver = lessthanunsigned;
        this.MediaMetadataCompat = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
    }

    public final Iterables.C35317<C5431transform, getUserNavigationEnabled> IconCompatParcelizer() {
        return this.read;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
        this.read.read(new nativeProcess$MediaBrowserCompat$ItemReceiver(this), new write(this), new C5431transform(this.IconCompatParcelizer, this.write));
    }

    public static final /* synthetic */ void write(nativeProcess nativeprocess) {
        if (nativeprocess.RatingCompat != null) {
            nativeprocess.RatingCompat.ay_();
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "keyword");
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        this.read.read(new nativeProcess$MediaBrowserCompat$CustomActionResultReceiver(this), new read(this), new C5431transform(this.IconCompatParcelizer, this.write));
    }
}
