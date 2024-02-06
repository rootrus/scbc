package com.scb.phone.view.activity.ntb.touchpoint;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ntb.touchpoint.TouchPointInputCidFragment;
import p040o.AlertController$RecycleListView;
import p040o.getKernelIDMultiply;
import p040o.onGetStartedClick;

public final class TouchPointInputCidActivity extends BaseTouchPointBreadcrumbActivity {
    public static final write MediaBrowserCompat$MediaItem = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        String stringExtra;
        super.onCreate(bundle);
        setContentView(R.layout.f80122131493237);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.ntb_ekyc_title);
        setTabContainer();
        Intent intent = getIntent();
        if (intent == null || (stringExtra = intent.getStringExtra("EXTRA_MOBILE_NUMBER")) == null) {
            fragment = new Fragment();
        } else {
            TouchPointInputCidFragment.read read = TouchPointInputCidFragment.IconCompatParcelizer;
            onGetStartedClick.write((Object) stringExtra, "mobileNumber");
            TouchPointInputCidFragment touchPointInputCidFragment = new TouchPointInputCidFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putString("EXTRA_MOBILE_NUMBER", stringExtra);
            touchPointInputCidFragment.setArguments(bundle2);
            fragment = touchPointInputCidFragment;
        }
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((AppCompatActivity) this, fragment, (int) R.id.container);
        new getKernelIDMultiply().MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "touchpoint_ekyc_information");
    }

    /* access modifiers changed from: protected */
    public final C5677x8060c4c1 MediaSessionCompat$ResultReceiverWrapper() {
        return C5677x8060c4c1.INPUT_YOUR_INFORMATION;
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.ntb_ekyc_title);
        setTabContainer();
    }
}
