package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.ds$MediaBrowserCompat$SearchResultReceiver */
public final class ds$MediaBrowserCompat$SearchResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<getInnerThrowables> {
    private /* synthetic */ setEndedAt read;

    public ds$MediaBrowserCompat$SearchResultReceiver(setEndedAt setendedat) {
        this.read = setendedat;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        List<String> list;
        getInnerThrowables getinnerthrowables = (getInnerThrowables) obj;
        setEndedAt setendedat = this.read;
        if (setendedat != null) {
            list = setendedat.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            list = null;
        }
        getinnerthrowables.MediaBrowserCompat$ItemReceiver(list);
    }
}
