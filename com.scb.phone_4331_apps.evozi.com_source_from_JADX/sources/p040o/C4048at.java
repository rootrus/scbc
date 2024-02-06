package p040o;

import p040o.CheckParameters;
import p040o.getBitmapFromURI;
import p040o.writeUInt64NoTag;

/* renamed from: o.at */
public final /* synthetic */ class C4048at implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getBitmapFromURI.read MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C4048at(getBitmapFromURI.read read) {
        this.MediaBrowserCompat$ItemReceiver = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters.CheckCountry.write) obj).write(getBitmapFromURI.this.MediaBrowserCompat$ItemReceiver);
    }
}
