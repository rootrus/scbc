package p040o;

import android.content.Context;
import java.util.concurrent.Callable;
import p040o.ForwardingListenableFuture;

/* renamed from: o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment */
public final /* synthetic */ class FragmentBuilder_BindDirectDebitTermsAndConditionsFragment implements Callable {
    private final /* synthetic */ ForwardingListenableFuture.SimpleForwardingListenableFuture IconCompatParcelizer;
    private final /* synthetic */ FragmentBuilder_BindEBillSelectedFragment MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Context read;

    public /* synthetic */ FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(FragmentBuilder_BindEBillSelectedFragment fragmentBuilder_BindEBillSelectedFragment, ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, Context context) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindEBillSelectedFragment;
        this.IconCompatParcelizer = simpleForwardingListenableFuture;
        this.read = context;
    }

    public final Object call() {
        return this.MediaBrowserCompat$ItemReceiver.write(this.IconCompatParcelizer, this.read);
    }
}
