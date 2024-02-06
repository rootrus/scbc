package p040o;

import p040o.OnDeviceIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.ho$MediaBrowserCompat$SearchResultReceiver */
public final class ho$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C6966a.IconCompatParcelizer> {
    private /* synthetic */ C4778ho IconCompatParcelizer;

    public ho$MediaBrowserCompat$SearchResultReceiver(C4778ho hoVar) {
        this.IconCompatParcelizer = hoVar;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        OnDeviceIdExtractor.C6966a.IconCompatParcelizer iconCompatParcelizer = (OnDeviceIdExtractor.C6966a.IconCompatParcelizer) obj;
        boolean z = false;
        if (this.IconCompatParcelizer.read > 0.0d && this.IconCompatParcelizer.MediaDescriptionCompat) {
            z = true;
        }
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(z);
    }
}
