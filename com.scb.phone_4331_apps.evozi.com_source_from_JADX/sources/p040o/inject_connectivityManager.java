package p040o;

import android.view.View;
import com.scb.phone.view.activity.HomeActivity;

/* renamed from: o.inject_connectivityManager */
public final /* synthetic */ class inject_connectivityManager implements View.OnClickListener {
    private final /* synthetic */ int[] MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ HomeActivity write;

    public /* synthetic */ inject_connectivityManager(HomeActivity homeActivity, int[] iArr) {
        this.write = homeActivity;
        this.MediaBrowserCompat$CustomActionResultReceiver = iArr;
    }

    public final void onClick(View view) {
        HomeActivity homeActivity = this.write;
        int[] iArr = this.MediaBrowserCompat$CustomActionResultReceiver;
        iArr[0] = iArr[0] + 1;
        if (iArr[0] <= 3) {
            homeActivity.ivJuristicCoachMark.setImageLevel(iArr[0]);
            return;
        }
        homeActivity.ivJuristicCoachMark.setVisibility(8);
        homeActivity.mBottomNavigationView.setVisibility(0);
    }
}
