package com.scb.phone.view.activity.investment.scbs.open;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.investment.onboarding.FatcaActivity;
import com.scb.phone.view.fragment.investment.scbs.open.OnboardingFatcaQuestionsFragment;
import com.scb.phone.view.fragment.ntb.fatca.FatcaLandingQuestionFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTapText;

public class OnboardingFatcaQuestionsActivity extends FatcaActivity {
    public final int MediaSessionCompat$ResultReceiverWrapper() {
        return 3;
    }

    public static void read(Context context) {
        Intent intent = new Intent(context, OnboardingFatcaQuestionsActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
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

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final FatcaLandingQuestionFragment mo14669x50fd9e4a() {
        return new OnboardingFatcaQuestionsFragment();
    }

    public final void MediaSessionCompat$Token() {
        SCBSFormActivity.MediaBrowserCompat$CustomActionResultReceiver((Context) this);
    }
}
