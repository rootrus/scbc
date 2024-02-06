package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ccrredemption.product.OPRRewardsTabFragment;
import com.scb.phone.view.fragment.ccrredemption.product.OPRStatusFragment;

/* renamed from: o.postMailingAddressConfirmation */
public final class postMailingAddressConfirmation extends setCardElevation {
    private int[] MediaBrowserCompat$CustomActionResultReceiver = {R.string.status_label, R.string.rewards_label};
    private Context read;

    public postMailingAddressConfirmation(setTitleMarginStart settitlemarginstart, Context context) {
        super(settitlemarginstart);
        this.read = context;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return OPRStatusFragment.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (i != 1) {
            return null;
        }
        return OPRRewardsTabFragment.MediaDescriptionCompat();
    }

    public final int getCount() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.read.getString(this.MediaBrowserCompat$CustomActionResultReceiver[i]);
    }
}
