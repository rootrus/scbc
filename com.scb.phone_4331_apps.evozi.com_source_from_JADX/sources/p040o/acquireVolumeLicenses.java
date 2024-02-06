package p040o;

import p040o.C10829Sizeof;
import p040o.writeUInt64NoTag;

/* renamed from: o.acquireVolumeLicenses */
public final /* synthetic */ class acquireVolumeLicenses implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C10829Sizeof.C37931 write;

    public /* synthetic */ acquireVolumeLicenses(C10829Sizeof.C37931 r1) {
        this.write = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        getPayee getpayee = (getPayee) obj;
        if (!this.write.PlaybackStateCompat$CustomAction.write.RatingCompat().write.isEmpty()) {
            getpayee.setIcon();
        } else {
            getpayee.setItemInvoker();
        }
    }
}
