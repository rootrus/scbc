package com.scb.phone.view.activity.mailingaddress;

import android.content.Context;
import android.content.Intent;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.readElement;
import p040o.setTapText;

/* renamed from: com.scb.phone.view.activity.mailingaddress.MailingAddressSuccessfulActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5659x401caf7f {
    private C5659x401caf7f() {
    }

    public /* synthetic */ C5659x401caf7f(byte b) {
        this();
    }

    public final void MediaBrowserCompat$ItemReceiver(Context context, readElement readelement) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) readelement, "argument");
        Intent intent = new Intent(context, MailingAddressSuccessfulActivity.class);
        intent.putExtra("PARCELABLE_ADDRESS_SUCCESS", readelement);
        IntentTidInjectionContextAspect.aspectOf();
        MediaBrowserCompat$ItemReceiver(context, intent);
    }

    private static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Context context, Intent intent) {
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
