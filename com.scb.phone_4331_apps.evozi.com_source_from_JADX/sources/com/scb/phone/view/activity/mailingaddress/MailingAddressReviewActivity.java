package com.scb.phone.view.activity.mailingaddress;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.mailingaddress.MailingAddressReviewFragment$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.readElement;
import p040o.setTapText;

public final class MailingAddressReviewActivity extends BaseActivity implements MailingAddressReviewFragment$MediaBrowserCompat$ItemReceiver {
    public static final write MediaDescriptionCompat = new write((byte) 0);

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public final void write(Context context, String str) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "argument");
            Intent intent = new Intent(context, MailingAddressReviewActivity.class);
            intent.putExtra("PARCELABLE_TOKEN_ID", str);
            IntentTidInjectionContextAspect.aspectOf();
            MediaBrowserCompat$CustomActionResultReceiver(context, intent);
        }

        private static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Context context, Intent intent) {
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
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0023, code lost:
        r0 = r0.getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            super.onCreate(r5)
            r0 = 2131492931(0x7f0c0043, float:1.8609328E38)
            r4.setContentView(r0)
            r0 = r4
            android.app.Activity r0 = (android.app.Activity) r0
            butterknife.ButterKnife.MediaBrowserCompat$ItemReceiver(r0)
            super.setStackedBackground()
            r4.setTabContainer()
            r0 = 2131755916(0x7f10038c, float:1.9142725E38)
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
            com.scb.phone.view.fragment.mailingaddress.MailingAddressReviewFragment$read r2 = com.scb.phone.view.fragment.mailingaddress.MailingAddressReviewFragment.IconCompatParcelizer
            java.lang.String r2 = "argument"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
            com.scb.phone.view.fragment.mailingaddress.MailingAddressReviewFragment r2 = new com.scb.phone.view.fragment.mailingaddress.MailingAddressReviewFragment
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
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.mailingaddress.MailingAddressReviewActivity.onCreate(android.os.Bundle):void");
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.auto_change_mailing_address_review_title);
    }

    public final void IconCompatParcelizer(readElement readelement) {
        onGetStartedClick.write((Object) readelement, "params");
        MailingAddressSuccessfulActivity.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver((Context) this, readelement);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "tokenId");
        C5658x8bfdd5e6 mailingAddressReviewOTPActivity$MediaBrowserCompat$CustomActionResultReceiver = MailingAddressReviewOTPActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "argument");
        Intent intent = new Intent(context, MailingAddressReviewOTPActivity.class);
        intent.putExtra("PARCELABLE_TOKEN_ID", str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
