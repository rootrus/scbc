package p040o;

import android.view.MotionEvent;
import android.view.View;
import com.scb.phone.view.activity.sme.gifting.GiftOpenSharingMomentActivity;

/* renamed from: o.ArrayWeekDayFormatter */
public final /* synthetic */ class ArrayWeekDayFormatter implements View.OnTouchListener {
    private final /* synthetic */ GiftOpenSharingMomentActivity read;

    public /* synthetic */ ArrayWeekDayFormatter(GiftOpenSharingMomentActivity giftOpenSharingMomentActivity) {
        this.read = giftOpenSharingMomentActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        GiftOpenSharingMomentActivity giftOpenSharingMomentActivity = this.read;
        giftOpenSharingMomentActivity.backgroundMsg.setFocusableInTouchMode(true);
        giftOpenSharingMomentActivity.backgroundMsg.setCursorVisible(true);
        giftOpenSharingMomentActivity.giftTapToEditHint.setVisibility(8);
        return false;
    }
}
