package com.scb.phone.view.activity.juristic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.juristic.JuristicResetPinLandingFragment;
import p040o.CardView;
import p040o.onGetStartedClick;

public final class JuristicResetPinLandingActivity extends BaseActivity {
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78482131493073);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.juristic_reset_pin_landing_title);
        CardView read = getSupportFragmentManager().read();
        JuristicResetPinLandingFragment.IconCompatParcelizer iconCompatParcelizer = JuristicResetPinLandingFragment.IconCompatParcelizer;
        read.MediaBrowserCompat$CustomActionResultReceiver(R.id.container, new JuristicResetPinLandingFragment()).write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.juristic_reset_pin_landing_title);
    }

    public static final Intent write(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return new Intent(context, JuristicResetPinLandingActivity.class);
    }
}
