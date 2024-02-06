package p040o;

import android.view.MotionEvent;
import android.view.View;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.ntb.fillinformation.OccupationInfoFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlExternalAuthenticationActivity */
public final /* synthetic */ class ActivityBuilder_ContributeHmlExternalAuthenticationActivity implements View.OnTouchListener {
    private final /* synthetic */ OccupationInfoFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeHmlExternalAuthenticationActivity(OccupationInfoFragment occupationInfoFragment) {
        this.MediaBrowserCompat$ItemReceiver = occupationInfoFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        OccupationInfoFragment occupationInfoFragment = this.MediaBrowserCompat$ItemReceiver;
        if (motionEvent.getAction() != 1) {
            return false;
        }
        blend blend = occupationInfoFragment.MediaBrowserCompat$CustomActionResultReceiver;
        if (occupationInfoFragment.getActivity() == null) {
            return false;
        }
        blend.MediaBrowserCompat$ItemReceiver(((BaseActivity) occupationInfoFragment.getActivity()).scbAnalytics, "ekyc_sourceofincome");
        return false;
    }
}
