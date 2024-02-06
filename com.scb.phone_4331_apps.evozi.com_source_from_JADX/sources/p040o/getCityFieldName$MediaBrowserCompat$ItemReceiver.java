package p040o;

import p040o.OnDeviceIdExtractor_Factory;
import p040o.getCityFieldName;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCityFieldName$MediaBrowserCompat$ItemReceiver */
final class getCityFieldName$MediaBrowserCompat$ItemReceiver extends getCityFieldName.IconCompatParcelizer {
    private /* synthetic */ getCityFieldName read;

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return true;
    }

    public final boolean MediaMetadataCompat() {
        return false;
    }

    /* renamed from: o.getCityFieldName$MediaBrowserCompat$ItemReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ getCityFieldName$MediaBrowserCompat$ItemReceiver write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(getCityFieldName$MediaBrowserCompat$ItemReceiver getcityfieldname_mediabrowsercompat_itemreceiver) {
            super(1);
            this.write = getcityfieldname_mediabrowsercompat_itemreceiver;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (Throwable) obj, "it");
            getCityFieldName$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.write);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getCityFieldName$MediaBrowserCompat$ItemReceiver$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<getProjection, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ getCityFieldName$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        read(getCityFieldName$MediaBrowserCompat$ItemReceiver getcityfieldname_mediabrowsercompat_itemreceiver) {
            super(1);
            this.IconCompatParcelizer = getcityfieldname_mediabrowsercompat_itemreceiver;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (getProjection) obj, "it");
            getCityFieldName$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getCityFieldName$MediaBrowserCompat$ItemReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor_Factory.write> {
        public static final write read = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((OnDeviceIdExtractor_Factory.write) obj).read();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getCityFieldName$MediaBrowserCompat$ItemReceiver(getCityFieldName getcityfieldname) {
        super();
        this.read = getcityfieldname;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        super.MediaBrowserCompat$ItemReceiver();
        read();
    }

    public final void IconCompatParcelizer(boolean z) {
        getCityFieldName.MediaBrowserCompat$MediaItem(this.read);
        this.read.IconCompatParcelizer.IconCompatParcelizer(new read(this), new IconCompatParcelizer(this), write(z));
    }

    public final String IconCompatParcelizer() {
        String string = this.read.MediaBrowserCompat$SearchResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.privacy_management_cross_sell_consent);
        onGetStartedClick.IconCompatParcelizer((Object) string, "mResources.getString(R.s…ement_cross_sell_consent)");
        return string;
    }

    public final void write(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        getCityFieldName getcityfieldname = this.read;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.read;
        if (getcityfieldname.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getcityfieldname.RatingCompat);
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(getCityFieldName$MediaBrowserCompat$ItemReceiver getcityfieldname_mediabrowsercompat_itemreceiver) {
        getCityFieldName.RatingCompat(getcityfieldname_mediabrowsercompat_itemreceiver.read);
        getCityFieldName getcityfieldname = getcityfieldname_mediabrowsercompat_itemreceiver.read;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4521x4da11fc.read;
        if (getcityfieldname.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getcityfieldname.RatingCompat);
        }
    }

    public final void write() {
        getCityFieldName.RatingCompat(this.read);
        getCityFieldName getcityfieldname = this.read;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4521x4da11fc.read;
        if (getcityfieldname.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getcityfieldname.RatingCompat);
        }
    }
}
