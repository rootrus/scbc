package p040o;

import p040o.ILocationSourceDelegate;
import p040o.writeUInt64NoTag;

/* renamed from: o.getSettings$write$MediaBrowserCompat$CustomActionResultReceiver */
final class getSettings$write$MediaBrowserCompat$CustomActionResultReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<gePayeeName> {
    private /* synthetic */ ILocationSourceDelegate.zza read;

    getSettings$write$MediaBrowserCompat$CustomActionResultReceiver(ILocationSourceDelegate.zza zza) {
        this.read = zza;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        gePayeeName gepayeename = (gePayeeName) obj;
        gepayeename.aj_();
        String str = this.read.write;
        onGetStartedClick.IconCompatParcelizer((Object) str, "error.header");
        String str2 = this.read.read;
        onGetStartedClick.IconCompatParcelizer((Object) str2, "error.message");
        gepayeename.read(str, str2);
    }
}
