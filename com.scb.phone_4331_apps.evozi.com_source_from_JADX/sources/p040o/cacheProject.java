package p040o;

import android.text.TextUtils;
import com.scb.phone.view.activity.HomeActivity;

/* renamed from: o.cacheProject */
public final /* synthetic */ class cacheProject implements Runnable {
    private final /* synthetic */ HomeActivity IconCompatParcelizer;
    private final /* synthetic */ getSessionIdForFile read;

    public /* synthetic */ cacheProject(HomeActivity homeActivity, getSessionIdForFile getsessionidforfile) {
        this.IconCompatParcelizer = homeActivity;
        this.read = getsessionidforfile;
    }

    public final void run() {
        HomeActivity homeActivity = this.IconCompatParcelizer;
        getSessionIdForFile getsessionidforfile = this.read;
        getEventAppCustomAttributeSize geteventappcustomattributesize = homeActivity.homePresenter;
        boolean MediaBrowserCompat$CustomActionResultReceiver = geteventappcustomattributesize.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(getsessionidforfile.IconCompatParcelizer);
        boolean z = true;
        if ((getsessionidforfile.MediaBrowserCompat$CustomActionResultReceiver != null && !getsessionidforfile.MediaBrowserCompat$CustomActionResultReceiver.isEmpty() && getsessionidforfile.MediaBrowserCompat$ItemReceiver != null && !getsessionidforfile.MediaBrowserCompat$ItemReceiver.isEmpty() && getsessionidforfile.IconCompatParcelizer != null && !getsessionidforfile.IconCompatParcelizer.isEmpty()) && !MediaBrowserCompat$CustomActionResultReceiver && !TextUtils.isEmpty(getsessionidforfile.MediaBrowserCompat$CustomActionResultReceiver)) {
            getEventNameWithoutPriority geteventnamewithoutpriority = new getEventNameWithoutPriority(getsessionidforfile);
            if (geteventappcustomattributesize.RatingCompat == null) {
                z = false;
            }
            if (z) {
                geteventnamewithoutpriority.IconCompatParcelizer(geteventappcustomattributesize.RatingCompat);
            }
        }
    }
}
