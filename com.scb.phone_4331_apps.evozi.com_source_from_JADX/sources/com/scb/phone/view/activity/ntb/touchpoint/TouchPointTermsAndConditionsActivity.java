package com.scb.phone.view.activity.ntb.touchpoint;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ntb.ekyc.EkycTermsAndConditionsFragment;
import p040o.AlertController$RecycleListView;
import p040o.onGetStartedClick;

public final class TouchPointTermsAndConditionsActivity extends BaseTouchPointBreadcrumbActivity {
    public static final C5680x3e49184 MediaDescriptionCompat = new C5680x3e49184((byte) 0);

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static String m3335x50fd9e4a() {
        return "touchpoint";
    }

    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        setContentView(R.layout.f80152131493240);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.tc_action_bar_title);
        setTabContainer();
        Intent intent = getIntent();
        String str = null;
        String stringExtra = intent != null ? intent.getStringExtra("EXTRA_PRODUCT_CODE") : null;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            str = intent2.getStringExtra("EXTRA_OBJECTIVE_ID");
        }
        if (stringExtra == null || str == null) {
            fragment = new Fragment();
        } else {
            EkycTermsAndConditionsFragment.write write = EkycTermsAndConditionsFragment.IconCompatParcelizer;
            onGetStartedClick.write((Object) stringExtra, "depositProductCode");
            onGetStartedClick.write((Object) str, "objectiveId");
            EkycTermsAndConditionsFragment ekycTermsAndConditionsFragment = new EkycTermsAndConditionsFragment();
            ekycTermsAndConditionsFragment.setArguments(EkycTermsAndConditionsFragment.MediaBrowserCompat$CustomActionResultReceiver(stringExtra, str));
            fragment = ekycTermsAndConditionsFragment;
        }
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((AppCompatActivity) this, fragment, (int) R.id.container);
    }

    /* access modifiers changed from: protected */
    public final C5677x8060c4c1 MediaSessionCompat$ResultReceiverWrapper() {
        return C5677x8060c4c1.SELECT_ACCOUNT;
    }
}
