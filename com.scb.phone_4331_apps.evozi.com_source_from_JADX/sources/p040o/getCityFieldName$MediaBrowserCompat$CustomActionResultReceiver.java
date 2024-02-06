package p040o;

import p040o.OnDeviceIdExtractor_Factory;
import p040o.access$2300;
import p040o.getCityFieldName;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCityFieldName$MediaBrowserCompat$CustomActionResultReceiver */
final class getCityFieldName$MediaBrowserCompat$CustomActionResultReceiver extends getCityFieldName.IconCompatParcelizer {
    private /* synthetic */ getCityFieldName MediaBrowserCompat$ItemReceiver;

    public final void IconCompatParcelizer(boolean z) {
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return false;
    }

    public final boolean MediaMetadataCompat() {
        return true;
    }

    /* renamed from: o.getCityFieldName$MediaBrowserCompat$CustomActionResultReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor_Factory.write> {
        private /* synthetic */ getCityFieldName$MediaBrowserCompat$CustomActionResultReceiver write;

        write(getCityFieldName$MediaBrowserCompat$CustomActionResultReceiver getcityfieldname_mediabrowsercompat_customactionresultreceiver) {
            this.write = getcityfieldname_mediabrowsercompat_customactionresultreceiver;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((OnDeviceIdExtractor_Factory.write) obj).read(this.write.IconCompatParcelizer());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getCityFieldName$MediaBrowserCompat$CustomActionResultReceiver(getCityFieldName getcityfieldname) {
        super();
        this.MediaBrowserCompat$ItemReceiver = getcityfieldname;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        super.MediaBrowserCompat$ItemReceiver();
        getCityFieldName getcityfieldname = this.MediaBrowserCompat$ItemReceiver;
        writeUInt64NoTag.IconCompatParcelizer write2 = new write(this);
        if (getcityfieldname.RatingCompat != null) {
            write2.IconCompatParcelizer(getcityfieldname.RatingCompat);
        }
        read();
    }

    public final void write() {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, access$2300.write.NAVIGATE_BACK);
    }

    public final String IconCompatParcelizer() {
        String MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        if (MediaBrowserCompat$ItemReceiver2 != null) {
            return MediaBrowserCompat$ItemReceiver2;
        }
        String string = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.privacy_management_cross_sell_consent);
        onGetStartedClick.IconCompatParcelizer((Object) string, "mResources.getString(R.s…ement_cross_sell_consent)");
        return string;
    }

    public final void write(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
    }
}
