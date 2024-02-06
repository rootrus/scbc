package com.scb.phone.view.activity.registration;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.registration.RegistrationManageDevicesFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class RegistrationManageDevicesActivity extends BaseActivityWithFragment {
    public void onBackPressed() {
    }

    public static void MediaBrowserCompat$ItemReceiver(Context context, String str, boolean z) {
        Intent intent = new Intent(context, RegistrationManageDevicesActivity.class);
        intent.putExtra("error_message", str);
        intent.putExtra("EXTRA_IS_CC_ACTIVATION", z);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return RegistrationManageDevicesFragment.write(getIntent().getStringExtra("error_message"), getIntent().getBooleanExtra("EXTRA_IS_CC_ACTIVATION", false));
    }

    public final String au_() {
        return getString(R.string.review_device_page);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        if (this.read != null) {
            this.read.MediaBrowserCompat$CustomActionResultReceiver(false);
        }
    }
}
