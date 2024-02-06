package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ah$MediaBrowserCompat$ItemReceiver */
final class ah$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<KtaPassportExtractor_Factory> {
    public static final ah$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = new ah$MediaBrowserCompat$ItemReceiver();

    ah$MediaBrowserCompat$ItemReceiver() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        KtaPassportExtractor_Factory ktaPassportExtractor_Factory = (KtaPassportExtractor_Factory) obj;
        ktaPassportExtractor_Factory.write("business_owner");
        ktaPassportExtractor_Factory.read();
    }
}
