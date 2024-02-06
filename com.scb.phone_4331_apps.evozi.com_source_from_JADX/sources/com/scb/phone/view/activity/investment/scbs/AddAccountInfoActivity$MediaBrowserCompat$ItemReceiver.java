package com.scb.phone.view.activity.investment.scbs;

import android.content.Context;
import android.content.Intent;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public final class AddAccountInfoActivity$MediaBrowserCompat$ItemReceiver {
    private AddAccountInfoActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ AddAccountInfoActivity$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public static final /* synthetic */ void write(Context context, Intent intent) {
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
