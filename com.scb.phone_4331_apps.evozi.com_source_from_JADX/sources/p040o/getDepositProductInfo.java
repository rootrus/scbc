package p040o;

import com.scb.phone.view.adapter.prelogin.QuickAccountSelectAdapter;

/* renamed from: o.getDepositProductInfo */
public final /* synthetic */ class getDepositProductInfo implements CheckExtractor_MembersInjector {
    private final /* synthetic */ QuickAccountSelectAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ getDepositProductInfo(QuickAccountSelectAdapter quickAccountSelectAdapter, String str) {
        this.MediaBrowserCompat$CustomActionResultReceiver = quickAccountSelectAdapter;
        this.write = str;
    }

    public final boolean MediaBrowserCompat$ItemReceiver(int i) {
        return this.write.equals(this.MediaBrowserCompat$CustomActionResultReceiver.read.get(i).AppCompatViewInflater);
    }
}
