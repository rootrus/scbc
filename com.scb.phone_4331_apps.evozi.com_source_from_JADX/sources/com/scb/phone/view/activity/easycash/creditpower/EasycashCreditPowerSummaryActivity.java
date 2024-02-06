package com.scb.phone.view.activity.easycash.creditpower;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.easycash.creditpower.EasycashCreditPowerSummaryFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.onGetStartedClick;

public final class EasycashCreditPowerSummaryActivity extends BaseActivity {
    public static final C5598xcfbcbfeb MediaDescriptionCompat = new C5598xcfbcbfeb((byte) 0);

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77522131492977);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.credit_power_summary_title);
        ListMenuItemView();
        Intent intent = getIntent();
        if (intent.hasExtra("product_displays") && intent.hasExtra("ncb_accepted_flag")) {
            EasycashCreditPowerSummaryFragment.read read = EasycashCreditPowerSummaryFragment.MediaBrowserCompat$CustomActionResultReceiver;
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("product_displays");
            onGetStartedClick.IconCompatParcelizer((Object) parcelableArrayListExtra, "getParcelableArrayListExtra(PRODUCT_DISPLAYS)");
            List list = parcelableArrayListExtra;
            String stringExtra = intent.getStringExtra("ncb_accepted_flag");
            onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "getStringExtra(NCB_ACCEPTED_FLAG)");
            onGetStartedClick.write((Object) list, "productDisplay");
            onGetStartedClick.write((Object) stringExtra, "ncbAcceptedFlag");
            EasycashCreditPowerSummaryFragment easycashCreditPowerSummaryFragment = new EasycashCreditPowerSummaryFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelableArrayList("tile_displays", new ArrayList(list));
            bundle2.putString("ncb_accepted_flag", stringExtra);
            easycashCreditPowerSummaryFragment.setArguments(bundle2);
            getSupportFragmentManager().read().write(R.id.container, easycashCreditPowerSummaryFragment, (String) null).write();
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.credit_power_summary_title);
        ListMenuItemView();
    }

    public final void onBackPressed() {
        Fragment findFragmentById = getSupportFragmentManager().findFragmentById(R.id.container);
        if (findFragmentById instanceof EasycashCreditPowerSummaryFragment) {
            EasycashCreditPowerSummaryFragment easycashCreditPowerSummaryFragment = (EasycashCreditPowerSummaryFragment) findFragmentById;
            if (!((CustomDialog) easycashCreditPowerSummaryFragment.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).isShowing()) {
                ((CustomDialog) easycashCreditPowerSummaryFragment.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver()).show();
                return;
            }
            return;
        }
        super.onBackPressed();
    }
}
