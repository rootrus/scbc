package com.scb.phone.view.activity.juristic;

import android.content.DialogInterface;
import android.content.Intent;
import com.scb.phone.view.activity.HomeActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

final class JuristicSetupNewPinActivity$MediaBrowserCompat$ItemReceiver implements DialogInterface.OnClickListener {
    private /* synthetic */ JuristicSetupNewPinActivity MediaBrowserCompat$CustomActionResultReceiver;

    JuristicSetupNewPinActivity$MediaBrowserCompat$ItemReceiver(JuristicSetupNewPinActivity juristicSetupNewPinActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = juristicSetupNewPinActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        JuristicSetupNewPinActivity juristicSetupNewPinActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (juristicSetupNewPinActivity.getApplicationContext() != null) {
            Intent IconCompatParcelizer = HomeActivity.IconCompatParcelizer(juristicSetupNewPinActivity.getApplicationContext());
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(juristicSetupNewPinActivity, IconCompatParcelizer).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(juristicSetupNewPinActivity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                juristicSetupNewPinActivity.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        dialogInterface.dismiss();
    }
}
