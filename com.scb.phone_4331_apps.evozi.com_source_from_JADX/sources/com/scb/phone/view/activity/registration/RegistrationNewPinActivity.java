package com.scb.phone.view.activity.registration;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.fragment.registration.RegistrationNewPinFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class RegistrationNewPinActivity extends BaseActivityWithFragment {
    private RegistrationNewPinFragment MediaDescriptionCompat;

    public static void read(Context context) {
        Intent intent = new Intent(context, RegistrationNewPinActivity.class);
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
        RegistrationNewPinFragment RatingCompat = RegistrationNewPinFragment.RatingCompat();
        this.MediaDescriptionCompat = RatingCompat;
        return RatingCompat;
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        ListMenuItemView();
    }

    public final String au_() {
        return getString(R.string.set_pin_title);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        RegistrationNewPinFragment registrationNewPinFragment = this.MediaDescriptionCompat;
        if (registrationNewPinFragment != null) {
            registrationNewPinFragment.presenter.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
