package p040o;

import java.util.HashMap;
import java.util.List;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;
import p040o.removeAllOccurrences;

/* renamed from: o.fromScopeString */
public final /* synthetic */ class fromScopeString implements DebitCardMarketConductDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write read;

    public /* synthetic */ fromScopeString(FragmentBuilder_BindPurchaseProfileManagementFragment.write write) {
        this.read = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        FragmentBuilder_BindPurchaseProfileManagementFragment.write write = this.read;
        removeAllOccurrences.write write2 = write.MediaBrowserCompat$SearchResultReceiver;
        List<onInfoWindowLongClick> MediaBrowserCompat$CustomActionResultReceiver = write.write.MediaBrowserCompat$CustomActionResultReceiver(((HttpException) obj).MediaBrowserCompat$ItemReceiver);
        if (write2.write == null) {
            write2.write = new HashMap();
        }
        write2.write.put("BILLPAYMENT", MediaBrowserCompat$CustomActionResultReceiver);
    }
}
