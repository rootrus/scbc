package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.isActive  reason: case insensitive filesystem */
public final /* synthetic */ class C10845isActive implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ onAcceptButtonClick write;

    public /* synthetic */ C10845isActive(onAcceptButtonClick onacceptbuttonclick, String str) {
        this.write = onacceptbuttonclick;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        getTopLeftCornerWidth.read read = (getTopLeftCornerWidth.read) obj;
        read.read(this.MediaBrowserCompat$CustomActionResultReceiver, this.write.IconCompatParcelizer.IconCompatParcelizer);
    }
}
