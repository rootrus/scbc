package p040o;

import com.scb.phone.view.activity.personallimit.PersonalLimitActivity;

/* renamed from: o.dispatchRestoreInstanceState */
public final class dispatchRestoreInstanceState implements MileageQuantitySelectionActivity<PersonalLimitActivity> {
    public static void write(PersonalLimitActivity personalLimitActivity, getRamSize getramsize) {
        personalLimitActivity.changeLimitPresenter = getramsize;
    }
}
