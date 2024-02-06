package p040o;

import android.content.Intent;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.scb.phone.view.fragment.BaseFragment;

/* renamed from: o.getSwitchInSearchFunds */
public final /* synthetic */ class getSwitchInSearchFunds implements SwipeRefreshLayout.IconCompatParcelizer {
    private final /* synthetic */ BaseFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getSwitchInSearchFunds(BaseFragment baseFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = baseFragment;
    }

    public final void read() {
        BaseFragment baseFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        Intent intent = new Intent();
        intent.setAction("com.scb.phone/BROADCAST_SWIPE_REFRESH");
        baseFragment.getContext().sendBroadcast(intent);
    }
}
