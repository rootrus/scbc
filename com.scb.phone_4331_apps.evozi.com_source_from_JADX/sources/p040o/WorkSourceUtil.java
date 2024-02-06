package p040o;

import java.util.HashMap;
import java.util.List;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;
import p040o.removeAllOccurrences;

/* renamed from: o.WorkSourceUtil */
public final /* synthetic */ class WorkSourceUtil implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ WorkSourceUtil(FragmentBuilder_BindPurchaseProfileManagementFragment.write write) {
        this.MediaBrowserCompat$CustomActionResultReceiver = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        FragmentBuilder_BindPurchaseProfileManagementFragment.write write = this.MediaBrowserCompat$CustomActionResultReceiver;
        removeAllOccurrences.write write2 = write.MediaBrowserCompat$SearchResultReceiver;
        List<onInfoWindowLongClick> MediaBrowserCompat$CustomActionResultReceiver2 = write.write.MediaBrowserCompat$CustomActionResultReceiver(((HttpException) obj).MediaBrowserCompat$ItemReceiver);
        if (write2.write == null) {
            write2.write = new HashMap();
        }
        write2.write.put("ALL", MediaBrowserCompat$CustomActionResultReceiver2);
    }
}
