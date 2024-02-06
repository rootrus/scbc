package com.scb.phone.view.activity.hml.fatca;

import android.content.Intent;
import com.scb.phone.view.activity.investment.onboarding.FatcaActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public final class HmlNTBOnboardingFatcaQuestionsActivity extends FatcaActivity {
    public static final write MediaBrowserCompat$MediaItem = new write((byte) 0);

    public final int MediaSessionCompat$ResultReceiverWrapper() {
        return 4;
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void MediaSessionCompat$Token() {
        Intent intent = new Intent(this, HmlNTBSelectAccountActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
