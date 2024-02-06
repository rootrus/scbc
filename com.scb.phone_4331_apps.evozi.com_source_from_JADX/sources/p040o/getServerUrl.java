package p040o;

import android.content.Intent;
import com.scb.phone.view.activity.HomeActivity;

/* renamed from: o.getServerUrl */
public final class getServerUrl {
    private static final String[] MediaBrowserCompat$ItemReceiver = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};

    public static void read(HomeActivity homeActivity) {
        if (ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(homeActivity, MediaBrowserCompat$ItemReceiver)) {
            homeActivity.sendBroadcast(new Intent("com.scb.phone/BROADCAST_UPDATE_LOCATION"));
        } else {
            AppCompatRatingBar.write(homeActivity, MediaBrowserCompat$ItemReceiver, 31);
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(HomeActivity homeActivity, int i, int[] iArr) {
        if (i == 31 && ProxySourceAdapter$ItemViewHolder.write(iArr)) {
            homeActivity.sendBroadcast(new Intent("com.scb.phone/BROADCAST_UPDATE_LOCATION"));
        }
    }
}
