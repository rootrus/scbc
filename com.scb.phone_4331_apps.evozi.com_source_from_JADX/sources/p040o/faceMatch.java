package p040o;

import android.content.Intent;
import com.scb.phone.view.fragment.creditcard.BilledTabFragment;

/* renamed from: o.faceMatch */
public final /* synthetic */ class faceMatch implements Runnable {
    private final /* synthetic */ BilledTabFragment MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Intent write;

    public /* synthetic */ faceMatch(BilledTabFragment billedTabFragment, Intent intent) {
        this.MediaBrowserCompat$ItemReceiver = billedTabFragment;
        this.write = intent;
    }

    public final void run() {
        BilledTabFragment billedTabFragment = this.MediaBrowserCompat$ItemReceiver;
        Intent intent = this.write;
        if (intent.getExtras() != null) {
            billedTabFragment.mContainerRelativeLayout.setVisibility(8);
            billedTabFragment.mShowMessages.setVisibility(8);
            billedTabFragment.mRecyclerView.setVisibility(8);
            billedTabFragment.billedTabPresenter.read = intent.getStringExtra("CREDIT_CARD_NUMBER");
            billedTabFragment.billedTabPresenter.write();
        }
    }
}
