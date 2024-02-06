package com.scb.phone.view.activity.easycash;

import android.content.Context;
import android.content.Intent;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getLegacySharedPrefs;
import p040o.onGetStartedClick;
import p040o.setTapText;

public final class EasycashInputIncomeActivity$MediaBrowserCompat$ItemReceiver {
    private static final /* synthetic */ void IconCompatParcelizer(Context context, Intent intent) {
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

    private EasycashInputIncomeActivity$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ EasycashInputIncomeActivity$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }

    public final void MediaBrowserCompat$ItemReceiver(Context context, getLegacySharedPrefs getlegacysharedprefs) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) getlegacysharedprefs, "tileDisplay");
        Intent intent = new Intent(context, EasycashInputIncomeActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.EXTRA_LENDING_TILE", getlegacysharedprefs);
        IntentTidInjectionContextAspect.aspectOf();
        IconCompatParcelizer(context, intent);
    }
}
