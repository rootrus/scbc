package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getConfidenceThreshold */
public final /* synthetic */ class getConfidenceThreshold implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ normalize IconCompatParcelizer;
    private final /* synthetic */ ensureReceiverRegistered MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getConfidenceThreshold(ensureReceiverRegistered ensurereceiverregistered, normalize normalize) {
        this.MediaBrowserCompat$ItemReceiver = ensurereceiverregistered;
        this.IconCompatParcelizer = normalize;
    }

    public final void IconCompatParcelizer(Object obj) {
        KotlinDetector.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer, (getAddress5) obj);
    }
}
