package com.scb.phone.view.activity.deposit;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.deposit.DepositSelectionFragment;
import p040o.CardView;
import p040o.onGetStartedClick;
import p040o.setTitleMarginStart;

public final class DepositOpenAccountActivity extends BaseActivity {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77362131492961);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.title_etb_open_account);
        setTabContainer();
        DepositSelectionFragment.read read = DepositSelectionFragment.MediaBrowserCompat$CustomActionResultReceiver;
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra("accountType") : null;
        DepositSelectionFragment depositSelectionFragment = new DepositSelectionFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putString("accountType", stringExtra);
        depositSelectionFragment.setArguments(bundle2);
        setTitleMarginStart supportFragmentManager = getSupportFragmentManager();
        onGetStartedClick.IconCompatParcelizer((Object) supportFragmentManager, "supportFragmentManager");
        CardView read2 = supportFragmentManager.read();
        onGetStartedClick.IconCompatParcelizer((Object) read2, "beginTransaction()");
        CardView MediaBrowserCompat$ItemReceiver = read2.MediaBrowserCompat$ItemReceiver(R.id.container, depositSelectionFragment);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "replace(R.id.container, fragment)");
        MediaBrowserCompat$ItemReceiver.write();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.title_etb_open_account);
        setTabContainer();
    }

    public static final Intent MediaBrowserCompat$ItemReceiver(Context context, String str) {
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, DepositOpenAccountActivity.class);
        intent.putExtra("accountType", str);
        return intent;
    }
}
