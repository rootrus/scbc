package com.scb.phone.view.activity.juristic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.juristic.C6068xd559db9c;
import com.scb.phone.view.fragment.juristic.JuristicOnboardingLandingFragment;
import p040o.CardView;
import p040o.Utils;
import p040o.onGetStartedClick;

public final class JuristicOnboardingLandingActivity extends BaseActivity {
    private Utils.C39323.C12941 MediaBrowserCompat$SearchResultReceiver;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78472131493072);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        getWindow().setBackgroundDrawableResource(R.drawable.bg_juristic_onboarding);
        this.MediaBrowserCompat$SearchResultReceiver = (Utils.C39323.C12941) getIntent().getParcelableExtra("STATE_DISPLAY");
        CardView read = getSupportFragmentManager().read();
        C6068xd559db9c juristicOnboardingLandingFragment$MediaBrowserCompat$CustomActionResultReceiver = JuristicOnboardingLandingFragment.IconCompatParcelizer;
        Utils.C39323.C12941 r1 = this.MediaBrowserCompat$SearchResultReceiver;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("STATE_DISPLAY", r1);
        JuristicOnboardingLandingFragment juristicOnboardingLandingFragment = new JuristicOnboardingLandingFragment();
        juristicOnboardingLandingFragment.setArguments(bundle2);
        read.MediaBrowserCompat$CustomActionResultReceiver(R.id.container, juristicOnboardingLandingFragment).write();
    }

    public final void setSubtitle() {
        overridePendingTransition(R.anim.f64172130771984, R.anim.f64152130771982);
    }

    public static final Intent read(Context context, Utils.C39323.C12941 r3) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) r3, "stateDisplay");
        Intent intent = new Intent(context, JuristicOnboardingLandingActivity.class);
        intent.putExtra("STATE_DISPLAY", r3);
        return intent;
    }
}
