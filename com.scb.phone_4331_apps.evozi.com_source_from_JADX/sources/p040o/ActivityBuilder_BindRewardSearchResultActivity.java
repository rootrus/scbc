package p040o;

import android.content.Intent;
import com.scb.phone.view.activity.BaseActivity$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.fragment.investment.redeem.TransactionsTabFragment;

/* renamed from: o.ActivityBuilder_BindRewardSearchResultActivity */
public final /* synthetic */ class ActivityBuilder_BindRewardSearchResultActivity implements BaseActivity$MediaBrowserCompat$CustomActionResultReceiver {
    private final /* synthetic */ TransactionsTabFragment read;

    public /* synthetic */ ActivityBuilder_BindRewardSearchResultActivity(TransactionsTabFragment transactionsTabFragment) {
        this.read = transactionsTabFragment;
    }

    public final void write() {
        TransactionsTabFragment transactionsTabFragment = this.read;
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_HOME_ACTIVITY_REFRESH");
        transactionsTabFragment.getActivity().sendBroadcast(intent);
    }
}
