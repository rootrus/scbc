package p040o;

import com.scb.phone.view.activity.mwpartner.MwManageWalletActivity;

/* renamed from: o.migrateStateAndReturn */
public final class migrateStateAndReturn implements MileageQuantitySelectionActivity<MwManageWalletActivity> {
    public static void read(MwManageWalletActivity mwManageWalletActivity, getTaskID gettaskid) {
        mwManageWalletActivity.presenter = gettaskid;
    }
}
