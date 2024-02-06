package p040o;

import p040o.OnDeviceIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.IExtractionServer$MediaBrowserCompat$ItemReceiver */
public final class IExtractionServer$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.C6966a.C69682.write> {
    private /* synthetic */ ForwardingService IconCompatParcelizer;
    private /* synthetic */ getTimestamp MediaBrowserCompat$CustomActionResultReceiver;

    public IExtractionServer$MediaBrowserCompat$ItemReceiver(getTimestamp gettimestamp, ForwardingService forwardingService) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gettimestamp;
        this.IconCompatParcelizer = forwardingService;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((OnDeviceIdExtractor.C6966a.C69682.write) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver.f2857x50fd9e4a, this.IconCompatParcelizer);
    }
}
