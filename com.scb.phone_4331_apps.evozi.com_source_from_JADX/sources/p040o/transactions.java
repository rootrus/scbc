package p040o;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.closeaccount.CloseAccountSelectionOtherFragment;
import com.scb.phone.view.fragment.closeaccount.CloseAccountSelectionOwnFragment;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.transactions */
public final class transactions extends setCardElevation {
    private CloseAccountSelectionOtherFragment IconCompatParcelizer;
    private List<Integer> MediaBrowserCompat$CustomActionResultReceiver = Arrays.asList(new Integer[]{Integer.valueOf(R.string.tab_transfer_to_me), Integer.valueOf(R.string.tab_transfer_to_others)});
    private Resources MediaBrowserCompat$ItemReceiver;
    private CloseAccountSelectionOwnFragment read;

    public transactions(setTitleMarginStart settitlemarginstart, Resources resources) {
        super(settitlemarginstart);
        this.MediaBrowserCompat$ItemReceiver = resources;
        this.read = CloseAccountSelectionOwnFragment.MediaBrowserCompat$ItemReceiver();
        this.IconCompatParcelizer = CloseAccountSelectionOtherFragment.write();
    }

    public final Fragment read(int i) {
        if (i != 1) {
            return this.read;
        }
        return this.IconCompatParcelizer;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.size();
    }

    public final CharSequence getPageTitle(int i) {
        return this.MediaBrowserCompat$ItemReceiver.getString(this.MediaBrowserCompat$CustomActionResultReceiver.get(i).intValue());
    }
}
