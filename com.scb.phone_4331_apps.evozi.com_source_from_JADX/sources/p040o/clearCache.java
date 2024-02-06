package p040o;

import android.app.Dialog;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.fragment.transferandpay.topuptab.TopUpTargetTabFragment;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.clearCache */
public final /* synthetic */ class clearCache implements View.OnClickListener {
    private final /* synthetic */ getSessionIdForFile IconCompatParcelizer;
    private final /* synthetic */ Dialog MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ HomeActivity MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ CheckBox read;
    private final /* synthetic */ CheckBox write;

    public /* synthetic */ clearCache(HomeActivity homeActivity, getSessionIdForFile getsessionidforfile, CheckBox checkBox, CheckBox checkBox2, Dialog dialog) {
        this.MediaBrowserCompat$ItemReceiver = homeActivity;
        this.IconCompatParcelizer = getsessionidforfile;
        this.write = checkBox;
        this.read = checkBox2;
        this.MediaBrowserCompat$CustomActionResultReceiver = dialog;
    }

    public final void onClick(View view) {
        boolean z;
        HomeActivity homeActivity = this.MediaBrowserCompat$ItemReceiver;
        getSessionIdForFile getsessionidforfile = this.IconCompatParcelizer;
        CheckBox checkBox = this.write;
        CheckBox checkBox2 = this.read;
        Dialog dialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = getsessionidforfile.RatingCompat;
        try {
            if (!TextUtils.isEmpty(str) && str.contains("://")) {
                boolean z2 = false;
                if (!homeActivity.MediaBrowserCompat$MediaItem) {
                    homeActivity.MediaBrowserCompat$MediaItem = true;
                    if (!checkBox.isChecked()) {
                        if (!checkBox2.isChecked()) {
                            z = false;
                            homeActivity.scbAnalytics.write("pop_up_ad", new ZSYR2K("ads_name", getsessionidforfile.read), new ZSYR2K("user_action", "click_link"), new ZSYR2K("tick_checkbox", String.valueOf(z)), new ZSYR2K("ads_id", getsessionidforfile.IconCompatParcelizer));
                        }
                    }
                    z = true;
                    homeActivity.scbAnalytics.write("pop_up_ad", new ZSYR2K("ads_name", getsessionidforfile.read), new ZSYR2K("user_action", "click_link"), new ZSYR2K("tick_checkbox", String.valueOf(z)), new ZSYR2K("ads_id", getsessionidforfile.IconCompatParcelizer));
                }
                dialog.dismiss();
                getEventAppCustomAttributeSize geteventappcustomattributesize = homeActivity.homePresenter;
                setBackingMap setbackingmap = geteventappcustomattributesize.MediaBrowserCompat$SearchResultReceiver;
                String str2 = getsessionidforfile.read;
                String str3 = getsessionidforfile.IconCompatParcelizer;
                OffsetDateTime now = OffsetDateTime.now();
                onGetStartedClick.IconCompatParcelizer((Object) now, "now");
                setbackingmap.write(new TopUpTargetTabFragment.read(str2, "popup", str3, now));
                capFilesCount capfilescount = new capFilesCount(getsessionidforfile);
                if (geteventappcustomattributesize.RatingCompat != null) {
                    z2 = true;
                }
                if (z2) {
                    capfilescount.IconCompatParcelizer(geteventappcustomattributesize.RatingCompat);
                }
            }
        } catch (Exception e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }
}
