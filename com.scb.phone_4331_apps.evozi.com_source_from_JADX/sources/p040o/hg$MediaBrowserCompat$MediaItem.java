package p040o;

import p040o.LocalProjectProvider;
import p040o.writeUInt64NoTag;

/* renamed from: o.hg$MediaBrowserCompat$MediaItem */
public final class hg$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.VersionTable.VersionList.read> {
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ String write;

    public hg$MediaBrowserCompat$MediaItem(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((LocalProjectProvider.VersionTable.VersionList.read) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
    }
}
