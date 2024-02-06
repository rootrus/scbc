package com.scb.phone.view.activity.hml;

import android.os.Bundle;
import android.view.MenuItem;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;

public abstract class BaseHmlPersonalInfoActivity extends BaseActivityWithFragment {
    public final String au_() {
        return getString(R.string.hml_personal_info_title);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }
}
