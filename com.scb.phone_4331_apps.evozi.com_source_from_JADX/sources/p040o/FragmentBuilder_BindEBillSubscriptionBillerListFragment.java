package p040o;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: o.FragmentBuilder_BindEBillSubscriptionBillerListFragment */
public final /* synthetic */ class FragmentBuilder_BindEBillSubscriptionBillerListFragment implements Callable {
    private final /* synthetic */ checkForPreviousCrash IconCompatParcelizer;
    private final /* synthetic */ Context MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ boolean MediaBrowserCompat$SearchResultReceiver = true;
    private final /* synthetic */ FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment read;
    private final /* synthetic */ boolean write;

    public /* synthetic */ FragmentBuilder_BindEBillSubscriptionBillerListFragment(FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment, checkForPreviousCrash checkforpreviouscrash, boolean z, Context context, String str, boolean z2) {
        this.read = fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment;
        this.IconCompatParcelizer = checkforpreviouscrash;
        this.write = z;
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final Object call() {
        return this.read.write(this.IconCompatParcelizer, this.write, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$SearchResultReceiver);
    }
}
