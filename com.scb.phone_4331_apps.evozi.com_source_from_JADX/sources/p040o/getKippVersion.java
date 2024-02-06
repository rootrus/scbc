package p040o;

import java.util.List;
import p040o.AbstractMultimap;
import p040o.C10829Sizeof;
import p040o.writeUInt64NoTag;

/* renamed from: o.getKippVersion */
public final /* synthetic */ class getKippVersion implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPlace IconCompatParcelizer;
    private final /* synthetic */ Sizeof$1$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ getKippVersion(Sizeof$1$MediaBrowserCompat$ItemReceiver sizeof$1$MediaBrowserCompat$ItemReceiver, getPlace getplace) {
        this.write = sizeof$1$MediaBrowserCompat$ItemReceiver;
        this.IconCompatParcelizer = getplace;
    }

    public final void IconCompatParcelizer(Object obj) {
        Sizeof$1$MediaBrowserCompat$ItemReceiver sizeof$1$MediaBrowserCompat$ItemReceiver = this.write;
        getPlace getplace = this.IconCompatParcelizer;
        getPayee getpayee = (getPayee) obj;
        C10829Sizeof.C37931 r2 = sizeof$1$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
        List unused = r2.IconCompatParcelizer = r2.Keep.read;
        getpayee.MediaBrowserCompat$CustomActionResultReceiver((List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver>) sizeof$1$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer);
        if (getplace.write == AbstractMultimap.AsMap.AsMapEntries.SUCCESS) {
            getpayee.setContentView();
            getpayee.AppCompatDialogFragment();
            getpayee.setCheckable();
            getpayee.MediaBrowserCompat$ItemReceiver(true);
        } else if (getplace.write == AbstractMultimap.AsMap.AsMapEntries.LOADING) {
            getpayee.aM_();
            getpayee.AppCompatDialogFragment();
            getpayee.MediaBrowserCompat$ItemReceiver(false);
        } else if (getplace.write == AbstractMultimap.AsMap.AsMapEntries.ERROR) {
            getpayee.setShortcut();
            getpayee.setContentView();
            getpayee.MediaBrowserCompat$ItemReceiver(false);
        }
    }
}
