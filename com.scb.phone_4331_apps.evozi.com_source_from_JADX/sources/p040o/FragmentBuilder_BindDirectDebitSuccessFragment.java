package p040o;

import android.content.Context;
import java.util.concurrent.Callable;
import p040o.ForwardingListenableFuture;

/* renamed from: o.FragmentBuilder_BindDirectDebitSuccessFragment */
public final /* synthetic */ class FragmentBuilder_BindDirectDebitSuccessFragment implements Callable {
    private final /* synthetic */ ForwardingListenableFuture.SimpleForwardingListenableFuture MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ FragmentBuilder_BindEBillSelectedFragment MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Context read;

    public /* synthetic */ FragmentBuilder_BindDirectDebitSuccessFragment(FragmentBuilder_BindEBillSelectedFragment fragmentBuilder_BindEBillSelectedFragment, ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, Context context) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindEBillSelectedFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = simpleForwardingListenableFuture;
        this.read = context;
    }

    public final Object call() {
        return this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
    }
}
