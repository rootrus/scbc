package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import p040o.onGetStartedClick;
import p040o.zzjx;

/* renamed from: com.scb.phone.view.activity.hml.HmlETBLandingActivity$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5607x23cfbb87 {
    private C5607x23cfbb87() {
    }

    public /* synthetic */ C5607x23cfbb87(byte b) {
        this();
    }

    public static Intent IconCompatParcelizer(Context context, zzjx.zza.zzb zzb) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) zzb, "productType");
        Intent putExtra = new Intent(context, HmlETBLandingActivity.class).putExtra("PRODUCT_TYPE_ARG", zzb.ordinal());
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "putExtra(key, value?.ordinal ?: -1)");
        return putExtra;
    }
}
