package p040o;

import p040o.C10829Sizeof;
import p040o.writeUInt64NoTag;

/* renamed from: o.setOnUs */
public final /* synthetic */ class setOnUs implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ C10829Sizeof.SizeOfNewObject read;

    public /* synthetic */ setOnUs(C10829Sizeof.SizeOfNewObject sizeOfNewObject, String str) {
        this.read = sizeOfNewObject;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        C10829Sizeof.SizeOfNewObject sizeOfNewObject = this.read;
        ((getPiggybackDocument) obj).write(sizeOfNewObject.MediaBrowserCompat$ItemReceiver.mo26549c_(this.MediaBrowserCompat$CustomActionResultReceiver));
    }
}
