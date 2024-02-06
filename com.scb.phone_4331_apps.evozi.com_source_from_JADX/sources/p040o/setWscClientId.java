package p040o;

import p040o.Futures;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.setWscClientId */
public final /* synthetic */ class setWscClientId implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Futures.C34104 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setWscClientId(Futures.C34104 r1) {
        this.MediaBrowserCompat$ItemReceiver = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getMicrAmount.IconCompatParcelizer) obj).IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.replace("\n", " "));
    }
}
