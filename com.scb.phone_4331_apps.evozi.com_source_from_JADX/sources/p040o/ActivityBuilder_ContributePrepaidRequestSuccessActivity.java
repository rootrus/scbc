package p040o;

import android.content.DialogInterface;

/* renamed from: o.ActivityBuilder_ContributePrepaidRequestSuccessActivity */
public final class ActivityBuilder_ContributePrepaidRequestSuccessActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ BaseDiscoverFundFilterActivity write;

    public ActivityBuilder_ContributePrepaidRequestSuccessActivity(BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity) {
        this.write = baseDiscoverFundFilterActivity;
    }

    public final /* synthetic */ void onClick(DialogInterface dialogInterface, int i) {
        onGetStartedClick.IconCompatParcelizer(this.write.MediaBrowserCompat$CustomActionResultReceiver(dialogInterface, Integer.valueOf(i)), "invoke(...)");
    }
}
