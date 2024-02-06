package p040o;

import android.view.View;
import com.scb.phone.view.adapter.bond.BondSelectionListAdapter;

/* renamed from: o.SequentialSearchRepositoryModule */
public final /* synthetic */ class SequentialSearchRepositoryModule implements View.OnClickListener {
    private final /* synthetic */ isTerminated MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ BondSelectionListAdapter read;

    public /* synthetic */ SequentialSearchRepositoryModule(BondSelectionListAdapter bondSelectionListAdapter, isTerminated isterminated) {
        this.read = bondSelectionListAdapter;
        this.MediaBrowserCompat$ItemReceiver = isterminated;
    }

    public final void onClick(View view) {
        BondSelectionListAdapter bondSelectionListAdapter = this.read;
        bondSelectionListAdapter.write.write(this.MediaBrowserCompat$ItemReceiver);
    }
}
