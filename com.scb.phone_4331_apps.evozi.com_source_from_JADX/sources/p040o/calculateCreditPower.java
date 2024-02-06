package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.sme.gifting.GiftRecipientFragment;
import com.scb.phone.view.fragment.sme.gifting.GiftRecipientFromFavouriteFragment;
import com.scb.phone.view.fragment.sme.gifting.GiftRecipientFromOthersFragment;

/* renamed from: o.calculateCreditPower */
public final class calculateCreditPower extends BrowserActionsFallbackMenuView {
    private final String MediaBrowserCompat$ItemReceiver;
    private int[] read = {R.string.favorite_empty, R.string.tab_transfer_to_others, R.string.tab_transfer_to_prompt_pay};
    private Context write;

    public calculateCreditPower(String str, setTitleMarginStart settitlemarginstart, Context context) {
        super(settitlemarginstart);
        this.write = context;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final Fragment MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            return GiftRecipientFromFavouriteFragment.MediaBrowserCompat$ItemReceiver();
        }
        if (i == 1) {
            return GiftRecipientFromOthersFragment.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (i != 2) {
            return GiftRecipientFromFavouriteFragment.MediaBrowserCompat$ItemReceiver();
        }
        return GiftRecipientFragment.read(this.MediaBrowserCompat$ItemReceiver);
    }

    public final int getCount() {
        return this.read.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.write.getString(this.read[i]);
    }
}
