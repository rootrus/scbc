package p040o;

import android.view.MotionEvent;
import android.view.View;
import com.scb.phone.view.activity.transferandpay.topup.TopUpActivity;

/* renamed from: o.setBadgeCount */
public final /* synthetic */ class setBadgeCount implements View.OnTouchListener {
    private final /* synthetic */ TopUpActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setBadgeCount(TopUpActivity topUpActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = topUpActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        TopUpActivity topUpActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        topUpActivity.getWindow().clearFlags(1024);
        topUpActivity.historyCoachmark.setVisibility(8);
        return false;
    }
}
