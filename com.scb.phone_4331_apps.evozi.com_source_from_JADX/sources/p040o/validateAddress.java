package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.debitatm.DebitCardRewardTabFragment;
import com.scb.phone.view.fragment.debitatm.DebitCardServiceTabFragment;
import com.scb.phone.view.fragment.debitatm.DebitCardTransactionTabFragment;

/* renamed from: o.validateAddress */
public final class validateAddress extends BrowserActionsFallbackMenuView {
    private int[] MediaBrowserCompat$CustomActionResultReceiver = {R.string.debit_atm_detail_tab, R.string.debit_atm_point_tab, R.string.debit_atm_service_tab};
    private Context write;

    public validateAddress(setTitleMarginStart settitlemarginstart, Context context) {
        super(settitlemarginstart);
        this.write = context;
    }

    public final Fragment MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            return DebitCardTransactionTabFragment.MediaMetadataCompat();
        }
        if (i == 1) {
            return DebitCardRewardTabFragment.IconCompatParcelizer();
        }
        if (i != 2) {
            return new Fragment();
        }
        return DebitCardServiceTabFragment.IconCompatParcelizer();
    }

    public final int getCount() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.write.getString(this.MediaBrowserCompat$CustomActionResultReceiver[i]);
    }
}
