package com.scb.phone.view.activity.common;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.scb.phone.view.fragment.common.ThirdPartySlipFragment;
import p040o.CycleDetector;
import p040o.onGetStartedClick;
import p040o.requestLocationUpdates;

public final class ThirdPartySlipActivity extends ReviewSuccessfulActivity {
    public static final C5580xe75847fb MediaBrowserCompat$MediaItem = new C5580xe75847fb((byte) 0);

    public static final Intent IconCompatParcelizer(Context context, String str, requestLocationUpdates requestlocationupdates) {
        return C5580xe75847fb.MediaBrowserCompat$CustomActionResultReceiver(context, str, requestlocationupdates);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        CycleDetector.Dep dep = (CycleDetector.Dep) getIntent().getParcelableExtra("KEY_THIRD_PARTY_SLIP_DISPLAY_ID");
        if (dep != null) {
            ThirdPartySlipFragment.read read = ThirdPartySlipFragment.MediaBrowserCompat$CustomActionResultReceiver;
            onGetStartedClick.write((Object) dep, "parcel");
            ThirdPartySlipFragment thirdPartySlipFragment = new ThirdPartySlipFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("KEY_THIRD_PARTY_SLIP_DISPLAY_ID", dep);
            thirdPartySlipFragment.setArguments(bundle);
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, thirdPartySlipFragment).write();
            return;
        }
        finish();
    }
}
