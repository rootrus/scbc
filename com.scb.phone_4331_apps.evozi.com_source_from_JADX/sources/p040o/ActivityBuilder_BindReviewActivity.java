package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.investment.redeem.TransactionsTabFragment;

/* renamed from: o.ActivityBuilder_BindReviewActivity */
public final /* synthetic */ class ActivityBuilder_BindReviewActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ TransactionsTabFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_BindReviewActivity(TransactionsTabFragment transactionsTabFragment, int i) {
        this.MediaBrowserCompat$ItemReceiver = transactionsTabFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        TransactionsTabFragment transactionsTabFragment = this.MediaBrowserCompat$ItemReceiver;
        transactionsTabFragment.presenter.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
