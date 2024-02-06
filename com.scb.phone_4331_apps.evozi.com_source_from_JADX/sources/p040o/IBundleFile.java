package p040o;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.scb.phone.view.activity.HomeActivity;

/* renamed from: o.IBundleFile */
public final /* synthetic */ class IBundleFile implements DialogInterface.OnDismissListener {
    private final /* synthetic */ getSessionIdForFile IconCompatParcelizer;
    private final /* synthetic */ HomeActivity MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ CheckBox read;
    private final /* synthetic */ CheckBox write;

    public /* synthetic */ IBundleFile(HomeActivity homeActivity, CheckBox checkBox, CheckBox checkBox2, getSessionIdForFile getsessionidforfile) {
        this.MediaBrowserCompat$ItemReceiver = homeActivity;
        this.read = checkBox;
        this.write = checkBox2;
        this.IconCompatParcelizer = getsessionidforfile;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        HomeActivity homeActivity = this.MediaBrowserCompat$ItemReceiver;
        CheckBox checkBox = this.read;
        CheckBox checkBox2 = this.write;
        getSessionIdForFile getsessionidforfile = this.IconCompatParcelizer;
        if (checkBox.isChecked() || checkBox2.isChecked()) {
            homeActivity.homePresenter.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.read(getsessionidforfile.IconCompatParcelizer);
        }
        homeActivity.MediaBrowserCompat$MediaItem = false;
        homeActivity.scbAnalytics.write("pop_up_ad", new ZSYR2K("ads_name", getsessionidforfile.read), new ZSYR2K("user_action", "close_ad"), new ZSYR2K("tick_checkbox", String.valueOf(checkBox.isChecked() || checkBox2.isChecked())), new ZSYR2K("ads_id", getsessionidforfile.IconCompatParcelizer));
    }
}
