package com.scb.phone.view.activity.paynow;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.scb.phone.view.fragment.paynow.PayNowSuccessFragment;
import p040o.CardView;
import p040o.onGetStartedClick;
import p040o.setTitleMarginStart;
import p040o.standardStartAndWait;

public final class PayNowSuccessActivity extends ReviewSuccessfulActivity {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static Intent read(Context context, standardStartAndWait standardstartandwait) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) standardstartandwait, "successDisplay");
            Intent intent = new Intent(context, PayNowSuccessActivity.class);
            intent.putExtra("EXTRA_PAY_NOW_SUCCESS_DISPLAY", standardstartandwait);
            return intent;
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        standardStartAndWait standardstartandwait;
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        if (extras == null || (standardstartandwait = (standardStartAndWait) extras.getParcelable("EXTRA_PAY_NOW_SUCCESS_DISPLAY")) == null) {
            finish();
            return;
        }
        PayNowSuccessFragment.write write = PayNowSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
        PayNowSuccessFragment payNowSuccessFragment = new PayNowSuccessFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("EXTRA_PAY_NOW_SUCCESS_DISPLAY", standardstartandwait);
        payNowSuccessFragment.setArguments(bundle);
        Fragment fragment = payNowSuccessFragment;
        onGetStartedClick.write((Object) this, "$this$replaceFragment");
        onGetStartedClick.write((Object) fragment, "fragment");
        setTitleMarginStart supportFragmentManager = getSupportFragmentManager();
        onGetStartedClick.IconCompatParcelizer((Object) supportFragmentManager, "supportFragmentManager");
        CardView read = supportFragmentManager.read();
        onGetStartedClick.IconCompatParcelizer((Object) read, "beginTransaction()");
        CardView MediaBrowserCompat$ItemReceiver = read.MediaBrowserCompat$ItemReceiver(R.id.frame_container, fragment);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "replace(frameId, fragment)");
        MediaBrowserCompat$ItemReceiver.write();
    }
}
