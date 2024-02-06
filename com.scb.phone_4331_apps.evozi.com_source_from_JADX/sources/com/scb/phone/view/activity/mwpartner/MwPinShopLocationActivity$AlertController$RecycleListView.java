package com.scb.phone.view.activity.mwpartner;

import android.content.DialogInterface;
import android.content.Intent;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

final class MwPinShopLocationActivity$AlertController$RecycleListView implements DialogInterface.OnClickListener {
    private /* synthetic */ MwPinShopLocationActivity write;

    MwPinShopLocationActivity$AlertController$RecycleListView(MwPinShopLocationActivity mwPinShopLocationActivity) {
        this.write = mwPinShopLocationActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MwPinShopLocationActivity mwPinShopLocationActivity = this.write;
        Intent intent = new Intent("android.settings.SETTINGS");
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(mwPinShopLocationActivity, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(mwPinShopLocationActivity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            mwPinShopLocationActivity.startActivityForResult(read, 1001);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        dialogInterface.dismiss();
    }
}
