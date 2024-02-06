package p040o;

import p040o.clearGlobalBitmap;
import p040o.writeUInt64NoTag;

/* renamed from: o.onCameraParametersProduced */
public final /* synthetic */ class onCameraParametersProduced implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ clearGlobalBitmap.IconCompatParcelizer read;

    public /* synthetic */ onCameraParametersProduced(clearGlobalBitmap.IconCompatParcelizer iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C6397xabb2c88d) obj).read(clearGlobalBitmap.this.MediaSessionCompat$Token);
    }
}
