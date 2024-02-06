package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.hl$MediaBrowserCompat$SearchResultReceiver */
public final class hl$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<C6941xae337a3a> {
    private /* synthetic */ List read;

    public hl$MediaBrowserCompat$SearchResultReceiver(List list) {
        this.read = list;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        C6941xae337a3a localProjectProvider_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver = (C6941xae337a3a) obj;
        localProjectProvider_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver.write((List<? extends removeAllReports>) this.read);
        localProjectProvider_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.read.size() <= 10);
    }
}
