package p040o;

import android.content.SharedPreferences;
import com.scb.phone.view.fragment.ntb.NtbUserInfoFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlBusinessIndustrySelectionActivity */
public final class ActivityBuilder_ContributeHmlBusinessIndustrySelectionActivity implements MileageQuantitySelectionActivity<NtbUserInfoFragment> {
    public static void read(NtbUserInfoFragment ntbUserInfoFragment, Category category) {
        ntbUserInfoFragment.mPresenter = category;
    }

    public static void write(NtbUserInfoFragment ntbUserInfoFragment, SharedPreferences sharedPreferences) {
        ntbUserInfoFragment.mSharedPreferences = sharedPreferences;
    }
}
