package p040o;

import android.view.MotionEvent;
import android.view.View;
import com.scb.phone.view.activity.transferandpay.transfer.TransferActivity;

/* renamed from: o.BottomBarTab */
public final /* synthetic */ class BottomBarTab implements View.OnTouchListener {
    private final /* synthetic */ TransferActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ BottomBarTab(TransferActivity transferActivity) {
        this.MediaBrowserCompat$ItemReceiver = transferActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TransferActivity transferActivity = this.MediaBrowserCompat$ItemReceiver;
        transferActivity.getWindow().clearFlags(1024);
        transferActivity.historyCoachmark.setVisibility(8);
        return false;
    }
}
