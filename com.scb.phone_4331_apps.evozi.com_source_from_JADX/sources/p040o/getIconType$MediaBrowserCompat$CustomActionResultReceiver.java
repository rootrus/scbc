package p040o;

import p040o.AutoValue_CrashlyticsReport;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIconType$MediaBrowserCompat$CustomActionResultReceiver */
final class getIconType$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getFrontImage> {
    private /* synthetic */ int IconCompatParcelizer;
    private /* synthetic */ getIconType MediaBrowserCompat$ItemReceiver;

    getIconType$MediaBrowserCompat$CustomActionResultReceiver(getIconType geticontype, int i) {
        this.MediaBrowserCompat$ItemReceiver = geticontype;
        this.IconCompatParcelizer = i;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        AutoValue_CrashlyticsReport.Builder MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat;
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "ndidNationalIdInputDisplay");
        ((getFrontImage) obj).read(MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper, this.IconCompatParcelizer);
    }
}
