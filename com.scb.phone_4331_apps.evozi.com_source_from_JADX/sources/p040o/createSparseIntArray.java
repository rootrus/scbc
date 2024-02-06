package p040o;

import com.scb.phone.view.fragment.directdebit.C5907x10730e76;
import java.util.List;

/* renamed from: o.createSparseIntArray */
public final /* synthetic */ class createSparseIntArray implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ C5907x10730e76 MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ createSparseIntArray(C5907x10730e76 directDebitInputBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$ItemReceiver = directDebitInputBillerListFragment$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final Object write(Object obj) {
        List<String> list;
        setMaxFrame setmaxframe = (setMaxFrame) obj;
        if (setmaxframe != null) {
            list = setmaxframe.IconCompatParcelizer;
        } else {
            list = null;
        }
        return new DepositAccountSelectorAdapter$ItemViewHolder_ViewBinding(list);
    }
}
