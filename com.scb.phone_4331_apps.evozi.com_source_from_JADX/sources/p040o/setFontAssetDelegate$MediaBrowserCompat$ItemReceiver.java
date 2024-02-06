package p040o;

import com.google.zxing.NotFoundException;

/* renamed from: o.setFontAssetDelegate$MediaBrowserCompat$ItemReceiver */
public final class setFontAssetDelegate$MediaBrowserCompat$ItemReceiver {
    public final rsnElementCreate2 MediaBrowserCompat$ItemReceiver;
    public rsnScriptSetVarI read;

    private setFontAssetDelegate$MediaBrowserCompat$ItemReceiver() {
    }

    public setFontAssetDelegate$MediaBrowserCompat$ItemReceiver(rsnElementCreate2 rsnelementcreate2) {
        if (rsnelementcreate2 != null) {
            this.MediaBrowserCompat$ItemReceiver = rsnelementcreate2;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public final String toString() {
        try {
            if (this.read == null) {
                this.read = this.MediaBrowserCompat$ItemReceiver.read();
            }
            return this.read.toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
