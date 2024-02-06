package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.concurrent.Callable;
import p040o.ForwardingListenableFuture;

/* renamed from: o.FragmentBuilder_BindDiscoverFundFilterFragment */
public final /* synthetic */ class FragmentBuilder_BindDiscoverFundFilterFragment implements Callable {
    private final /* synthetic */ Context IconCompatParcelizer;
    private final /* synthetic */ Bitmap MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ ForwardingListenableFuture.SimpleForwardingListenableFuture write;

    public /* synthetic */ FragmentBuilder_BindDiscoverFundFilterFragment(Bitmap bitmap, ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, Context context) {
        this.MediaBrowserCompat$ItemReceiver = bitmap;
        this.write = simpleForwardingListenableFuture;
        this.IconCompatParcelizer = context;
    }

    public final Object call() {
        return FragmentBuilder_BindEBillSelectedFragment.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, this.write, this.IconCompatParcelizer);
    }
}
