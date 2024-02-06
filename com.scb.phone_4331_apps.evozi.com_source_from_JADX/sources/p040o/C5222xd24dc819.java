package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.removeHandshakeCompletedListener$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5222xd24dc819 {
    public DSYMV read;

    private C5222xd24dc819() {
    }

    public C5222xd24dc819(FragmentBuilder_BindOthersTabFragment fragmentBuilder_BindOthersTabFragment, DSYMM$MediaBrowserCompat$ItemReceiver dSYMM$MediaBrowserCompat$ItemReceiver) {
        this.read = new DSYMV(fragmentBuilder_BindOthersTabFragment, dSYMM$MediaBrowserCompat$ItemReceiver);
    }

    public final void write() {
        DSYMV dsymv = this.read;
        if (dsymv != null) {
            SGBMV sgbmv = dsymv.MediaBrowserCompat$ItemReceiver;
            if (sgbmv != null) {
                sgbmv.IconCompatParcelizer();
            }
            DSYMV dsymv2 = this.read;
            dsymv2.MediaBrowserCompat$CustomActionResultReceiver = false;
            dsymv2.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
            dsymv2.IconCompatParcelizer();
        }
    }
}
