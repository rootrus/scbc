package p040o;

import p040o.QuickExtractorAgent;
import p040o.writeUInt64NoTag;

/* renamed from: o.my$MediaBrowserCompat$CustomActionResultReceiver */
final class my$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<QuickExtractorAgent.C7021a> {
    private /* synthetic */ access$2200 read;

    my$MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200) {
        this.read = access_2200;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((QuickExtractorAgent.C7021a) obj).write(this.read);
    }
}
