package p040o;

import p040o.OnDeviceIdExtractor_Factory;
import p040o.getCityFieldName;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCityFieldName$MediaBrowserCompat$MediaItem */
final class getCityFieldName$MediaBrowserCompat$MediaItem extends getCityFieldName.IconCompatParcelizer {
    final /* synthetic */ getCityFieldName read;

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return true;
    }

    public final boolean MediaMetadataCompat() {
        return false;
    }

    /* renamed from: o.getCityFieldName$MediaBrowserCompat$MediaItem$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor_Factory.write> {
        private /* synthetic */ getCityFieldName$MediaBrowserCompat$MediaItem MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(getCityFieldName$MediaBrowserCompat$MediaItem getcityfieldname_mediabrowsercompat_mediaitem) {
            this.MediaBrowserCompat$ItemReceiver = getcityfieldname_mediabrowsercompat_mediaitem;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((OnDeviceIdExtractor_Factory.write) obj).IconCompatParcelizer(getCityFieldName.write(this.MediaBrowserCompat$ItemReceiver.read));
        }
    }

    /* renamed from: o.getCityFieldName$MediaBrowserCompat$MediaItem$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor_Factory.write> {
        private /* synthetic */ getCityFieldName$MediaBrowserCompat$MediaItem IconCompatParcelizer;

        read(getCityFieldName$MediaBrowserCompat$MediaItem getcityfieldname_mediabrowsercompat_mediaitem) {
            this.IconCompatParcelizer = getcityfieldname_mediabrowsercompat_mediaitem;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((OnDeviceIdExtractor_Factory.write) obj).IconCompatParcelizer(getCityFieldName.write(this.IconCompatParcelizer.read));
        }
    }

    /* renamed from: o.getCityFieldName$MediaBrowserCompat$MediaItem$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<getProjection, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ getCityFieldName$MediaBrowserCompat$MediaItem write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(getCityFieldName$MediaBrowserCompat$MediaItem getcityfieldname_mediabrowsercompat_mediaitem) {
            super(1);
            this.write = getcityfieldname_mediabrowsercompat_mediaitem;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (getProjection) obj, "it");
            getCityFieldName$MediaBrowserCompat$MediaItem.write(this.write);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getCityFieldName$MediaBrowserCompat$MediaItem(getCityFieldName getcityfieldname) {
        super();
        this.read = getcityfieldname;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        super.MediaBrowserCompat$ItemReceiver();
        read();
    }

    public final void IconCompatParcelizer(boolean z) {
        getCityFieldName.MediaBrowserCompat$MediaItem(this.read);
        this.read.IconCompatParcelizer.IconCompatParcelizer(new write(this), new C4522x5b6bf0e6(this), write(z));
    }

    public final String IconCompatParcelizer() {
        String string = this.read.MediaBrowserCompat$SearchResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.privacy_management_general_consent);
        onGetStartedClick.IconCompatParcelizer((Object) string, "mResources.getString(R.s…nagement_general_consent)");
        return string;
    }

    public final void write(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        getCityFieldName getcityfieldname = this.read;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this);
        if (getcityfieldname.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getcityfieldname.RatingCompat);
        }
    }

    public static final /* synthetic */ void write(getCityFieldName$MediaBrowserCompat$MediaItem getcityfieldname_mediabrowsercompat_mediaitem) {
        getCityFieldName.RatingCompat(getcityfieldname_mediabrowsercompat_mediaitem.read);
        getCityFieldName getcityfieldname = getcityfieldname_mediabrowsercompat_mediaitem.read;
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(getcityfieldname_mediabrowsercompat_mediaitem);
        if (getcityfieldname.RatingCompat != null) {
            read2.IconCompatParcelizer(getcityfieldname.RatingCompat);
        }
    }

    public final void write() {
        getCityFieldName.RatingCompat(this.read);
        getCityFieldName getcityfieldname = this.read;
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(this);
        if (getcityfieldname.RatingCompat != null) {
            read2.IconCompatParcelizer(getcityfieldname.RatingCompat);
        }
    }
}
