package p040o;

import p040o.getUsable;
import p040o.writeUInt64NoTag;

/* renamed from: o.setIsShadowed */
public final /* synthetic */ class setIsShadowed implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ String read;

    public /* synthetic */ setIsShadowed(String str, String str2) {
        this.IconCompatParcelizer = str;
        this.read = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getUsable.read) obj).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, this.read);
    }
}
