package p040o;

import android.content.SharedPreferences;
import com.scb.phone.view.fragment.personallimit.PersonalLimitFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlNTBOperatingBankActivity */
public final class ActivityBuilder_ContributeHmlNTBOperatingBankActivity implements MileageQuantitySelectionActivity<PersonalLimitFragment> {
    public static void IconCompatParcelizer(PersonalLimitFragment personalLimitFragment, removeAppStatsWriteFileListener removeappstatswritefilelistener) {
        personalLimitFragment.limitPresenter = removeappstatswritefilelistener;
    }

    public static void write(PersonalLimitFragment personalLimitFragment, SharedPreferences sharedPreferences) {
        personalLimitFragment.sharedPreferences = sharedPreferences;
    }
}
