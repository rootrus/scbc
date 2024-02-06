package p040o;

import android.content.Intent;
import com.scb.phone.view.activity.HomeActivity;

/* renamed from: o.getAbsolutePath */
public final /* synthetic */ class getAbsolutePath implements C6377x418fbbc1 {
    private final /* synthetic */ HomeActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getAbsolutePath(HomeActivity homeActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = homeActivity;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        HomeActivity homeActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        Intent intent = new Intent();
        intent.setAction("IN_APP_UPDATE_TAG");
        homeActivity.sendBroadcast(intent);
    }
}
