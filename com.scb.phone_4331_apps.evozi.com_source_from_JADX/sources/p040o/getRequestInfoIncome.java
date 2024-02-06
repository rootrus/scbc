package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferHistoryFragment;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferToOthersStep1Fragment;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferToPromptPayStep1Fragment;

/* renamed from: o.getRequestInfoIncome */
public final class getRequestInfoIncome extends setCardElevation {
    private final TransferToPromptPayStep1Fragment IconCompatParcelizer;
    private final TransferToOthersStep1Fragment MediaBrowserCompat$CustomActionResultReceiver;
    private int[] MediaBrowserCompat$ItemReceiver = {R.string.tab_transfer_to_account, R.string.tab_transfer_to_prompt_pay, R.string.auto_regen_repeat_top_up_history};
    private Context read;
    public final TransferHistoryFragment write;

    public getRequestInfoIncome(setTitleMarginStart settitlemarginstart, Context context) {
        super(settitlemarginstart);
        this.read = context;
        this.write = new TransferHistoryFragment();
        this.MediaBrowserCompat$CustomActionResultReceiver = TransferToOthersStep1Fragment.IconCompatParcelizer();
        this.IconCompatParcelizer = TransferToPromptPayStep1Fragment.MediaDescriptionCompat();
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (i == 1) {
            return this.IconCompatParcelizer;
        }
        if (i != 2) {
            return null;
        }
        return this.write;
    }

    public final int getCount() {
        return this.MediaBrowserCompat$ItemReceiver.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.read.getString(this.MediaBrowserCompat$ItemReceiver[i]);
    }
}
