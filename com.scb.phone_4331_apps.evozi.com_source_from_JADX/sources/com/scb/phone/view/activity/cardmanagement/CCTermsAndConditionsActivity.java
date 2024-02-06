package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.CCRBaseActivity;

public class CCTermsAndConditionsActivity extends CCRBaseActivity {
    public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str) {
        Intent intent = new Intent(context, CCTermsAndConditionsActivity.class);
        intent.putExtra("com.scb.phone.view.activity.card_management.CCAboutActivity.KEY_TERMS_AND_CONDITIONS_URL", str);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77012131492926);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        setTitle(R.string.terms_and_conditions_title);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }

    public final void setStackedBackground() {
        this.mToolbar.setBackgroundResource(R.color.f71012131100257);
        this.mActionBarTitle.setTextColor(-9031231);
        super.setStackedBackground();
        setTitle(R.string.terms_and_conditions_title);
        setTabContainer();
        mo11B_().ParcelableVolumeInfo();
    }
}
