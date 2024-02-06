package p040o;

import android.view.MotionEvent;
import android.view.View;
import com.thunderhead.popover.PopupWindows;

/* renamed from: o.AmortizationMerchantsActivity_ViewBinding */
public final /* synthetic */ class AmortizationMerchantsActivity_ViewBinding implements View.OnTouchListener {
    private final /* synthetic */ PopupWindows MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ AmortizationMerchantsActivity_ViewBinding(PopupWindows popupWindows) {
        this.MediaBrowserCompat$ItemReceiver = popupWindows;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindows popupWindows = this.MediaBrowserCompat$ItemReceiver;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (x >= 0 && x < view.getWidth() && y >= 0 && y < view.getHeight()) {
            return false;
        }
        popupWindows.ParcelableVolumeInfo = true;
        return false;
    }
}
