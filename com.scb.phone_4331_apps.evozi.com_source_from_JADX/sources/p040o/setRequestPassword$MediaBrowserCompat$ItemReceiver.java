package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setRequestPassword$MediaBrowserCompat$ItemReceiver */
public final class setRequestPassword$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractor_Factory> {
    private /* synthetic */ setRequestPassword IconCompatParcelizer;

    public setRequestPassword$MediaBrowserCompat$ItemReceiver(setRequestPassword setrequestpassword) {
        this.IconCompatParcelizer = setrequestpassword;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        PassportExtractor_Factory passportExtractor_Factory = (PassportExtractor_Factory) obj;
        if (this.IconCompatParcelizer.IconCompatParcelizer.IconCompatParcelizer.write.read() != null) {
            passportExtractor_Factory.MediaBrowserCompat$ItemReceiver();
        } else {
            passportExtractor_Factory.IconCompatParcelizer();
        }
    }
}
