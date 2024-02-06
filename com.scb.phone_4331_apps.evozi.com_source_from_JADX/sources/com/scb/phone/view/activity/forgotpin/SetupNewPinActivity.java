package com.scb.phone.view.activity.forgotpin;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.scb.phone.AndroidApplication;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseChangePinActivity;
import com.scb.phone.view.activity.registration.RegistrationManageDevicesActivity;
import com.scb.phone.view.activity.registration.RegistrationSuccessActivity;
import com.scb.phone.view.activity.registration.friends.FriendsRegistrationActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C9850ab;
import p040o.C9851ac;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OcrEventListener;
import p040o.forEachDstOver;
import p040o.getFileSHA;
import p040o.getPassportNumber;
import p040o.setTapText;

public class SetupNewPinActivity extends BaseChangePinActivity<OcrEventListener> implements getPassportNumber {
    private forEachDstOver MediaBrowserCompat$MediaItem = new forEachDstOver();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((OcrEventListener) this.presenter).MediaBrowserCompat$ItemReceiver(this);
        ((OcrEventListener) this.presenter).IconCompatParcelizer();
        this.customKeypad.setEnabledLines(true);
        super.setStackedBackground();
        setTitle(R.string.set_pin_title);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.set_pin_title);
    }

    public final void MediaDescriptionCompat() {
        super.MediaDescriptionCompat();
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "forgot_pin_new_pin");
        ListMenuItemView();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "forgot_pin_confirm_pin");
        setTabContainer();
    }

    public final void write(getFileSHA getfilesha) {
        Intent MediaBrowserCompat$CustomActionResultReceiver = FriendsRegistrationActivity.MediaBrowserCompat$CustomActionResultReceiver(this, getfilesha);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getFileSHA getfilesha) {
        Intent read = RegistrationSuccessActivity.read(this, getfilesha);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(String str, boolean z) {
        RegistrationManageDevicesActivity.MediaBrowserCompat$ItemReceiver(this, str, z);
        finish();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Boolean bool) {
        Intent MediaBrowserCompat$ItemReceiver = ReviewDeviceActivity.MediaBrowserCompat$ItemReceiver(this, bool.booleanValue());
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onBackPressed() {
        ((OcrEventListener) this.presenter).MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z, boolean z2) {
        getFileSHA getfilesha;
        boolean z3 = false;
        if (getApplication() instanceof AndroidApplication) {
            ((AndroidApplication) getApplication()).IconCompatParcelizer = false;
        }
        OcrEventListener ocrEventListener = (OcrEventListener) this.presenter;
        if (z2) {
            getfilesha = getFileSHA.DEAD_CARD;
        } else {
            getfilesha = getFileSHA.REGULAR;
        }
        if (z) {
            C9850ab abVar = new C9850ab(getfilesha);
            if (ocrEventListener.RatingCompat != null) {
                z3 = true;
            }
            if (z3) {
                abVar.IconCompatParcelizer(ocrEventListener.RatingCompat);
                return;
            }
            return;
        }
        C9851ac acVar = new C9851ac(getfilesha);
        if (ocrEventListener.RatingCompat != null) {
            z3 = true;
        }
        if (z3) {
            acVar.IconCompatParcelizer(ocrEventListener.RatingCompat);
        }
    }
}
