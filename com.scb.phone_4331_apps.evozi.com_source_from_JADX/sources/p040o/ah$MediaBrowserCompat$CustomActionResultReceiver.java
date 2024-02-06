package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ah$MediaBrowserCompat$CustomActionResultReceiver */
final class ah$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<KtaPassportExtractor_Factory> {
    private /* synthetic */ C4025ah write;

    ah$MediaBrowserCompat$CustomActionResultReceiver(C4025ah ahVar) {
        this.write = ahVar;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((KtaPassportExtractor_Factory) obj).MediaBrowserCompat$CustomActionResultReceiver(new trimSessionFiles(this.write.IconCompatParcelizer.read.MediaBrowserCompat$SearchResultReceiver()));
    }
}
