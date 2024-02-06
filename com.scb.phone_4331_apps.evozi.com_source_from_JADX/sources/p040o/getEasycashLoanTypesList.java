package p040o;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferToMeAccountFragment;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferToOthersStep1Fragment;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferToPromptPayStep1Fragment;

/* renamed from: o.getEasycashLoanTypesList */
public final class getEasycashLoanTypesList extends setCardElevation {
    private final Context IconCompatParcelizer;
    private TransferToMeAccountFragment MediaBrowserCompat$CustomActionResultReceiver;
    private TransferToPromptPayStep1Fragment MediaBrowserCompat$ItemReceiver;
    private final int[] read = {R.string.tab_transfer_to_me, R.string.tab_transfer_to_others, R.string.tab_transfer_to_prompt_pay};
    private TransferToOthersStep1Fragment write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getEasycashLoanTypesList(Context context, setTitleMarginStart settitlemarginstart, String str) {
        super(settitlemarginstart);
        onGetStartedClick.write((Object) context, "mContext");
        onGetStartedClick.write((Object) settitlemarginstart, "fm");
        onGetStartedClick.write((Object) str, "accountFrom");
        this.IconCompatParcelizer = context;
        TransferToMeAccountFragment.IconCompatParcelizer iconCompatParcelizer = TransferToMeAccountFragment.IconCompatParcelizer;
        onGetStartedClick.write((Object) str, "accountSource");
        TransferToMeAccountFragment transferToMeAccountFragment = new TransferToMeAccountFragment();
        Bundle bundle = new Bundle();
        bundle.putString("account_source", str);
        transferToMeAccountFragment.setArguments(bundle);
        this.MediaBrowserCompat$CustomActionResultReceiver = transferToMeAccountFragment;
        this.write = TransferToOthersStep1Fragment.MediaBrowserCompat$ItemReceiver();
        this.MediaBrowserCompat$ItemReceiver = TransferToPromptPayStep1Fragment.MediaDescriptionCompat();
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (i == 1) {
            return this.write;
        }
        if (i != 2) {
            return null;
        }
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final int getCount() {
        return this.read.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.IconCompatParcelizer.getString(this.read[i]);
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        onGetStartedClick.write((Object) str, "accountSource");
        TransferToMeAccountFragment transferToMeAccountFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (transferToMeAccountFragment != null && !transferToMeAccountFragment.isDetached() && str != null) {
            RttiBillExtractor_Factory rttiBillExtractor_Factory = transferToMeAccountFragment.presenter;
            if (rttiBillExtractor_Factory == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            rttiBillExtractor_Factory.read(str);
        }
    }
}
