package p040o;

import android.content.Intent;
import com.scb.phone.view.activity.easycash.introduction.EasycashBaseIntroductionActivity;
import com.scb.phone.view.activity.privacypolicy.ScbPrivacyPolicyActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;

/* renamed from: o.pT */
public final /* synthetic */ class C7358pT implements C6992x633f693d {
    private final /* synthetic */ EasycashBaseIntroductionActivity read;

    public /* synthetic */ C7358pT(EasycashBaseIntroductionActivity easycashBaseIntroductionActivity) {
        this.read = easycashBaseIntroductionActivity;
    }

    public final boolean read(String str) {
        EasycashBaseIntroductionActivity easycashBaseIntroductionActivity = this.read;
        Intent read2 = ScbPrivacyPolicyActivity.read(easycashBaseIntroductionActivity, str);
        IntentTidInjectionContextAspect.aspectOf();
        EasycashBaseIntroductionActivity.write(easycashBaseIntroductionActivity, read2);
        return true;
    }
}
