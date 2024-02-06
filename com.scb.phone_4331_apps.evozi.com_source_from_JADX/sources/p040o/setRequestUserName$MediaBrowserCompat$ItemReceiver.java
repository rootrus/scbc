package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setRequestUserName$MediaBrowserCompat$ItemReceiver */
final class setRequestUserName$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractor> {
    private /* synthetic */ int read;

    setRequestUserName$MediaBrowserCompat$ItemReceiver(int i) {
        this.read = i;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        PassportExtractor passportExtractor = (PassportExtractor) obj;
        if (this.read == 1) {
            passportExtractor.ay_();
            passportExtractor.MediaBrowserCompat$CustomActionResultReceiver(true);
            return;
        }
        passportExtractor.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
