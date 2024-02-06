package p040o;

import android.content.SharedPreferences;
import com.scb.phone.view.fragment.debitatm.DebitWithdrawalLimitFragment;

/* renamed from: o.EasycashMCMCService */
public final class EasycashMCMCService implements MileageQuantitySelectionActivity<DebitWithdrawalLimitFragment> {
    public static void MediaBrowserCompat$ItemReceiver(DebitWithdrawalLimitFragment debitWithdrawalLimitFragment, loadFromString loadfromstring) {
        debitWithdrawalLimitFragment.debitLimitPresenter = loadfromstring;
    }

    public static void write(DebitWithdrawalLimitFragment debitWithdrawalLimitFragment, SharedPreferences sharedPreferences) {
        debitWithdrawalLimitFragment.sharedPreferences = sharedPreferences;
    }
}
