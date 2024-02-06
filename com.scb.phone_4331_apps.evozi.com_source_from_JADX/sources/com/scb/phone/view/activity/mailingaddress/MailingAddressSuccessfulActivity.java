package com.scb.phone.view.activity.mailingaddress;

import android.content.Intent;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.profilemanagement.ProfileManagementActivity;
import com.scb.phone.view.fragment.mailingaddress.MailingAddressSuccessfulFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public final class MailingAddressSuccessfulActivity extends BaseActivity implements MailingAddressSuccessfulFragment.write {
    public static final C5659x401caf7f MediaMetadataCompat = new C5659x401caf7f((byte) 0);

    public final void onBackPressed() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0017, code lost:
        r0 = r0.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r0 = 2131492932(0x7f0c0044, float:1.860933E38)
            r4.setContentView(r0)
            r0 = r4
            android.app.Activity r0 = (android.app.Activity) r0
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "PARCELABLE_ADDRESS_SUCCESS"
            if (r0 == 0) goto L_0x0024
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0024
            android.os.Parcelable r0 = r0.getParcelable(r1)
            o.readElement r0 = (p040o.readElement) r0
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            if (r5 != 0) goto L_0x0056
            if (r0 == 0) goto L_0x0056
            o.setTitleMarginStart r5 = r4.getSupportFragmentManager()
            o.CardView r5 = r5.read()
            com.scb.phone.view.fragment.mailingaddress.MailingAddressSuccessfulFragment$MediaBrowserCompat$CustomActionResultReceiver r2 = com.scb.phone.view.fragment.mailingaddress.MailingAddressSuccessfulFragment.IconCompatParcelizer
            java.lang.String r2 = "addressConfirmationParcelable"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
            com.scb.phone.view.fragment.mailingaddress.MailingAddressSuccessfulFragment r2 = new com.scb.phone.view.fragment.mailingaddress.MailingAddressSuccessfulFragment
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            r3.putParcelable(r1, r0)
            r2.setArguments(r3)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r0 = 2131297116(0x7f09035c, float:1.8212168E38)
            o.CardView r5 = r5.MediaBrowserCompat$ItemReceiver(r0, r2)
            r5.MediaBrowserCompat$ItemReceiver()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.mailingaddress.MailingAddressSuccessfulActivity.onCreate(android.os.Bundle):void");
    }

    public final void MediaSessionCompat$QueueItem() {
        Intent MediaBrowserCompat$ItemReceiver = ProfileManagementActivity.MediaBrowserCompat$ItemReceiver(this);
        MediaBrowserCompat$ItemReceiver.addFlags(335544320);
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
        finish();
    }
}
