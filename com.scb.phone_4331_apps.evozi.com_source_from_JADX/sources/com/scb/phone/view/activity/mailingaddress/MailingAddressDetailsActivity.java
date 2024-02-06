package com.scb.phone.view.activity.mailingaddress;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.mailingaddress.MailingAddressInputActivity;
import com.scb.phone.view.fragment.mailingaddress.C6087x2ddfc176;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class MailingAddressDetailsActivity extends BaseActivity implements C6087x2ddfc176 {
    public static final read MediaDescriptionCompat = new read((byte) 0);

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        r0 = r0.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r0 = 2131492930(0x7f0c0042, float:1.8609326E38)
            r4.setContentView(r0)
            r0 = r4
            android.app.Activity r0 = (android.app.Activity) r0
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r0)
            super.setStackedBackground()
            r4.setTabContainer()
            r0 = 2131755921(0x7f100391, float:1.9142735E38)
            r4.setTitle(r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r1 = "PARCELABLE_TOKEN_ID"
            if (r0 == 0) goto L_0x002e
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = r0.getString(r1)
            goto L_0x002f
        L_0x002e:
            r0 = 0
        L_0x002f:
            if (r5 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x005e
            o.setTitleMarginStart r5 = r4.getSupportFragmentManager()
            o.CardView r5 = r5.read()
            com.scb.phone.view.fragment.mailingaddress.MailingAddressDetailsFragment$MediaBrowserCompat$ItemReceiver r2 = com.scb.phone.view.fragment.mailingaddress.MailingAddressDetailsFragment.IconCompatParcelizer
            java.lang.String r2 = "argument"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
            com.scb.phone.view.fragment.mailingaddress.MailingAddressDetailsFragment r2 = new com.scb.phone.view.fragment.mailingaddress.MailingAddressDetailsFragment
            r2.<init>()
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r3.putString(r1, r0)
            r2.setArguments(r3)
            androidx.fragment.app.Fragment r2 = (androidx.fragment.app.Fragment) r2
            r0 = 2131297116(0x7f09035c, float:1.8212168E38)
            o.CardView r5 = r5.MediaBrowserCompat$ItemReceiver(r0, r2)
            r5.MediaBrowserCompat$ItemReceiver()
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.mailingaddress.MailingAddressDetailsActivity.onCreate(android.os.Bundle):void");
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "tokenId");
        MailingAddressReviewActivity.MediaDescriptionCompat.write(this, str);
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "tokenId");
        MailingAddressInputActivity.write write = MailingAddressInputActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "tokenId");
        Intent intent = new Intent(context, MailingAddressInputActivity.class);
        intent.putExtra("PARCELABLE_TOKEN_ID", str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.auto_change_mailing_address_select_address_title);
    }
}
