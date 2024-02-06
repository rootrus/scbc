package p040o;

import p040o.proxyGetOnDevicePassportDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.setDisplayValue$MediaBrowserCompat$CustomActionResultReceiver */
public final class setDisplayValue$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetOnDevicePassportDeserializer.IconCompatParcelizer> {
    public static final setDisplayValue$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver = new setDisplayValue$MediaBrowserCompat$CustomActionResultReceiver();

    setDisplayValue$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        proxyGetOnDevicePassportDeserializer.IconCompatParcelizer iconCompatParcelizer = (proxyGetOnDevicePassportDeserializer.IconCompatParcelizer) obj;
        iconCompatParcelizer.write();
        iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
