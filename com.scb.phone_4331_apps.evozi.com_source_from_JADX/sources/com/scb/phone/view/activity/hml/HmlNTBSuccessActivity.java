package com.scb.phone.view.activity.hml;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.demo.ntb.NTBLandingActivity;
import com.scb.phone.view.fragment.hml.C5999xad3eef32;
import com.scb.phone.view.fragment.hml.HmlNTBOfflineSuccessFragment;
import com.scb.phone.view.fragment.hml.HmlNTBOnlineSuccessFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class HmlNTBSuccessActivity extends HmlBaseSuccessActivity {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);

    public final String MediaSessionCompat$QueueItem() {
        return "ntb";
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        HmlNTBOnlineSuccessFragment.IconCompatParcelizer iconCompatParcelizer = HmlNTBOnlineSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver;
        Fragment hmlNTBOnlineSuccessFragment = new HmlNTBOnlineSuccessFragment();
        onGetStartedClick.write((Object) hmlNTBOnlineSuccessFragment, "fragment");
        getSupportFragmentManager().read().write(R.id.container, hmlNTBOnlineSuccessFragment, (String) null).write();
    }

    public final void IconCompatParcelizer() {
        C5999xad3eef32 hmlNTBOfflineSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBOfflineSuccessFragment.IconCompatParcelizer;
        Fragment hmlNTBOfflineSuccessFragment = new HmlNTBOfflineSuccessFragment();
        onGetStartedClick.write((Object) hmlNTBOfflineSuccessFragment, "fragment");
        getSupportFragmentManager().read().write(R.id.container, hmlNTBOfflineSuccessFragment, (String) null).write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent(getBaseContext(), NTBLandingActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
