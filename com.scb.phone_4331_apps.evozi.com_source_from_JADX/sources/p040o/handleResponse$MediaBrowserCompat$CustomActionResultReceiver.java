package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.handleResponse$MediaBrowserCompat$CustomActionResultReceiver */
public final class handleResponse$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getPayeeEndorsement> {
    private /* synthetic */ handleResponse read;

    public handleResponse$MediaBrowserCompat$CustomActionResultReceiver(handleResponse handleresponse) {
        this.read = handleresponse;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((getPayeeEndorsement) obj).write(handleResponse.MediaBrowserCompat$ItemReceiver(this.read), false);
    }
}
