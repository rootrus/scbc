package p040o;

import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;
import p040o.GoogleMap;

/* renamed from: o.getApplicationInfo */
public final /* synthetic */ class getApplicationInfo implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write IconCompatParcelizer;

    public /* synthetic */ getApplicationInfo(FragmentBuilder_BindPurchaseProfileManagementFragment.write write) {
        this.IconCompatParcelizer = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        FragmentBuilder_BindPurchaseProfileManagementFragment.write write = this.IconCompatParcelizer;
        getCompassEnabled getcompassenabled = (getCompassEnabled) obj;
        GoogleMap.OnMarkerDragListener onMarkerDragListener = new GoogleMap.OnMarkerDragListener();
        onMarkerDragListener.setBackgroundResource = getcompassenabled.write;
        onMarkerDragListener.AppCompatDialogFragment = getcompassenabled.MediaBrowserCompat$CustomActionResultReceiver;
        onMarkerDragListener.setContentView = getcompassenabled.read;
        write.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = onMarkerDragListener;
    }
}
