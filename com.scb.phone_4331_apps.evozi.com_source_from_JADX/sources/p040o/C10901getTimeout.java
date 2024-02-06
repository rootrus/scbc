package p040o;

import p040o.C10859sendImage;
import p040o.writeUInt64NoTag;

/* renamed from: o.getTimeout  reason: case insensitive filesystem */
public final /* synthetic */ class C10901getTimeout implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C10859sendImage.read MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ extractLocationAvailability write;

    public /* synthetic */ C10901getTimeout(C10859sendImage.read read, extractLocationAvailability extractlocationavailability) {
        this.MediaBrowserCompat$ItemReceiver = read;
        this.write = extractlocationavailability;
    }

    public final void IconCompatParcelizer(Object obj) {
        C10859sendImage.read read = this.MediaBrowserCompat$ItemReceiver;
        ((getFoldedOrTornDocumentEdges) obj).MediaBrowserCompat$ItemReceiver(C10859sendImage.this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.write));
    }
}
