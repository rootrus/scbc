package com.scb.phone;

import android.app.Activity;
import android.os.Bundle;
import com.scb.phone.view.activity.BaseActivity;
import java.util.Locale;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindEasycashLoanFeaturesAccountFragment;

public class TestActivity extends BaseActivity {
    /* renamed from: E_ */
    public final boolean mo13022E_() {
        return false;
    }

    /* renamed from: x_ */
    public final boolean mo13023x_() {
        return true;
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        new FragmentBuilder_BindEasycashLoanFeaturesAccountFragment(getApplicationContext(), "", "secured_shared_prefs.xml").edit().putString("com.scb.phone.pref.key.LANGUAGE", "en").apply();
        super.onCreate(bundle);
        setContentView(R.layout.f80062131493231);
    }

    /* renamed from: D_ */
    public final String mo3026D_() {
        return Locale.ENGLISH.getLanguage();
    }
}
