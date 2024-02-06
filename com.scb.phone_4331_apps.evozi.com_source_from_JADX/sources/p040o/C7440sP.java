package p040o;

import p040o.C7431sF;
import p040o.writeUInt64NoTag;

/* renamed from: o.sP */
public final /* synthetic */ class C7440sP implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C7431sF.read MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ setBoundsBias write;

    public /* synthetic */ C7440sP(C7431sF.read read, setBoundsBias setboundsbias) {
        this.MediaBrowserCompat$ItemReceiver = read;
        this.write = setboundsbias;
    }

    public final void IconCompatParcelizer(Object obj) {
        C7431sF.read read = this.MediaBrowserCompat$ItemReceiver;
        ((getTopLeftCornerWidth$MediaSessionCompat$ResultReceiverWrapper) obj).IconCompatParcelizer(C7431sF.this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(this.write));
    }
}
