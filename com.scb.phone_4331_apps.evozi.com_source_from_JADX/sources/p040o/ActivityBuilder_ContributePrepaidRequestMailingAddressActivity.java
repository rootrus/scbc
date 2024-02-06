package p040o;

import android.view.View;

/* renamed from: o.ActivityBuilder_ContributePrepaidRequestMailingAddressActivity */
public final class ActivityBuilder_ContributePrepaidRequestMailingAddressActivity implements View.OnFocusChangeListener {
    private final /* synthetic */ BaseDiscoverFundFilterActivity MediaBrowserCompat$ItemReceiver;

    public ActivityBuilder_ContributePrepaidRequestMailingAddressActivity(BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity) {
        this.MediaBrowserCompat$ItemReceiver = baseDiscoverFundFilterActivity;
    }

    public final /* synthetic */ void onFocusChange(View view, boolean z) {
        onGetStartedClick.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(view, Boolean.valueOf(z)), "invoke(...)");
    }
}
