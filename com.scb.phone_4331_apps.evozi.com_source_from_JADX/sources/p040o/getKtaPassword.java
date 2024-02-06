package p040o;

import com.scb.phone.view.activity.HomeActivity;

/* renamed from: o.getKtaPassword */
public final class getKtaPassword implements MileageQuantitySelectionActivity<HomeActivity> {
    public static void write(HomeActivity homeActivity, getIdType getidtype) {
        homeActivity.iDeviceCompatibilityHelper = getidtype;
    }

    public static void read(HomeActivity homeActivity, getEventAppCustomAttributeSize geteventappcustomattributesize) {
        homeActivity.homePresenter = geteventappcustomattributesize;
    }
}
