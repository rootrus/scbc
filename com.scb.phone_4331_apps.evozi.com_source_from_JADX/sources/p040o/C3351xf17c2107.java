package p040o;

import p040o.getFirstName;
import p040o.writeUInt64NoTag;

/* renamed from: o.FieldNamingPolicy$1$MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
public final class C3351xf17c2107<V> implements writeUInt64NoTag.IconCompatParcelizer<getFirstName.write> {
    private /* synthetic */ intoSet MediaBrowserCompat$CustomActionResultReceiver;

    public C3351xf17c2107(intoSet intoset) {
        this.MediaBrowserCompat$CustomActionResultReceiver = intoset;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        getFirstName.write write = (getFirstName.write) obj;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView;
        if (str != null) {
            write.MediaBrowserCompat$MediaItem(str);
        }
    }
}
