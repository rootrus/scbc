package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelDetailTabFragment;
import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelServicesTabFragment;
import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelWalletTabFragment;

/* renamed from: o.getSummary */
public final class getSummary extends BrowserActionsFallbackMenuView {
    private isSimulator IconCompatParcelizer;
    private int[] MediaBrowserCompat$CustomActionResultReceiver = {R.string.prepaid_tab_travel_wallet, R.string.prepaid_tab_travel_detail, R.string.prepaid_tab_travel_service};
    private getModelClass MediaBrowserCompat$ItemReceiver;
    private getKernelIDDstAtop read;
    private Context write;

    public getSummary(setTitleMarginStart settitlemarginstart, Context context, isSimulator issimulator, getModelClass getmodelclass) {
        super(settitlemarginstart);
        this.write = context;
        this.IconCompatParcelizer = issimulator;
        this.MediaBrowserCompat$ItemReceiver = getmodelclass;
        this.read = new getKernelIDDstAtop();
    }

    public final Fragment MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            this.read.MediaBrowserCompat$ItemReceiver(((BaseActivity) this.write).scbAnalytics, "planetscb_wallettab");
            return PrepaidTravelWalletTabFragment.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
        } else if (i == 1) {
            this.read.MediaBrowserCompat$ItemReceiver(((BaseActivity) this.write).scbAnalytics, "planetscb_detailtab");
            return PrepaidTravelDetailTabFragment.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver);
        } else if (i != 2) {
            return new Fragment();
        } else {
            return PrepaidTravelServicesTabFragment.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        }
    }

    public final int getCount() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.write.getString(this.MediaBrowserCompat$CustomActionResultReceiver[i]);
    }
}
