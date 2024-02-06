package p040o;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: o.FragmentBuilder_BindDonationsLandingFragment */
public final /* synthetic */ class FragmentBuilder_BindDonationsLandingFragment implements Callable {
    private final /* synthetic */ getUuidUtf8Bytes IconCompatParcelizer;
    private final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Context write;

    public /* synthetic */ FragmentBuilder_BindDonationsLandingFragment(getUuidUtf8Bytes getuuidutf8bytes, Context context, boolean z) {
        this.IconCompatParcelizer = getuuidutf8bytes;
        this.write = context;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final Object call() {
        return AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, this.write, this.MediaBrowserCompat$ItemReceiver);
    }
}
