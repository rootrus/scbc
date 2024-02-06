package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BlankFragment;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferHistoryFragment;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferToOthersStep1Fragment;

/* renamed from: o.addRecipientsToGroup */
public final class addRecipientsToGroup extends setCardElevation {
    private BlankFragment IconCompatParcelizer;
    private int[] MediaBrowserCompat$CustomActionResultReceiver = {R.string.tab_transfer_to_account, R.string.auto_regen_repeat_top_up_history};
    public TransferHistoryFragment MediaBrowserCompat$ItemReceiver;
    private TransferToOthersStep1Fragment read;
    private Context write;

    public addRecipientsToGroup(setTitleMarginStart settitlemarginstart, Context context, parseSession parsesession) {
        super(settitlemarginstart);
        this.write = context;
        this.read = TransferToOthersStep1Fragment.IconCompatParcelizer("FIXED_TRANSFER", parsesession);
        this.MediaBrowserCompat$ItemReceiver = new TransferHistoryFragment();
        this.IconCompatParcelizer = new BlankFragment();
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return this.read;
        }
        if (i != 1) {
            return this.IconCompatParcelizer;
        }
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.write.getString(this.MediaBrowserCompat$CustomActionResultReceiver[i]);
    }
}
