package com.scb.phone.view.activity.juristic;

import android.content.DialogInterface;
import android.content.Intent;
import com.scb.phone.view.activity.HomeActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

/* renamed from: com.scb.phone.view.activity.juristic.JuristicSetupResetPinActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C5656xfa96cc42 implements DialogInterface.OnClickListener {
    private /* synthetic */ JuristicSetupResetPinActivity IconCompatParcelizer;

    C5656xfa96cc42(JuristicSetupResetPinActivity juristicSetupResetPinActivity) {
        this.IconCompatParcelizer = juristicSetupResetPinActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        JuristicSetupResetPinActivity juristicSetupResetPinActivity = this.IconCompatParcelizer;
        if (juristicSetupResetPinActivity.getApplicationContext() != null) {
            Intent IconCompatParcelizer2 = HomeActivity.IconCompatParcelizer(juristicSetupResetPinActivity.getApplicationContext());
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(juristicSetupResetPinActivity, IconCompatParcelizer2).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(juristicSetupResetPinActivity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                juristicSetupResetPinActivity.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        dialogInterface.dismiss();
    }
}
