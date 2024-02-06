package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.hg$MediaBrowserCompat$SearchResultReceiver */
public final class hg$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.VersionTable.VersionList.read> {
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ String write;

    public hg$MediaBrowserCompat$SearchResultReceiver(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((LocalProjectProvider.VersionTable.VersionList.read) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
    }
}
