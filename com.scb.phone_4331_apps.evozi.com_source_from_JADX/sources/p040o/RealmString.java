package p040o;

import com.scb.phone.view.adapter.bond.BondSelectionListAdapter;

/* renamed from: o.RealmString */
public final /* synthetic */ class RealmString implements ZHPR2$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ isTerminated IconCompatParcelizer;
    private final /* synthetic */ BondSelectionListAdapter MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ RealmString(BondSelectionListAdapter bondSelectionListAdapter, isTerminated isterminated) {
        this.MediaBrowserCompat$ItemReceiver = bondSelectionListAdapter;
        this.IconCompatParcelizer = isterminated;
    }

    public final void read() {
        this.MediaBrowserCompat$ItemReceiver.write.IconCompatParcelizer(this.IconCompatParcelizer.read);
    }
}
