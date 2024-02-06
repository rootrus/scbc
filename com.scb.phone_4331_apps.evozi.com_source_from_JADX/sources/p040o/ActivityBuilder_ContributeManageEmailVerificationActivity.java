package p040o;

import android.view.View;
import com.scb.phone.view.fragment.profilemanagement.promptpay.PromptPayTermsAndConditionsLandingFragment;
import p040o.C9924f;

/* renamed from: o.ActivityBuilder_ContributeManageEmailVerificationActivity */
public final /* synthetic */ class ActivityBuilder_ContributeManageEmailVerificationActivity implements View.OnClickListener {
    private final /* synthetic */ PromptPayTermsAndConditionsLandingFragment write;

    public /* synthetic */ ActivityBuilder_ContributeManageEmailVerificationActivity(PromptPayTermsAndConditionsLandingFragment promptPayTermsAndConditionsLandingFragment) {
        this.write = promptPayTermsAndConditionsLandingFragment;
    }

    public final void onClick(View view) {
        C9924f.C43932 r4 = this.write.presenter;
        if (r4.RatingCompat != null) {
            r4.RatingCompat.AlertController$RecycleListView();
        }
        r4.write.write(r4.write.write("PROMPTPAY"), new IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean>() {
            public final /* synthetic */ void onNext(Object obj) {
                super.onNext((Boolean) obj);
                C43932.read(C43932.this);
                C43932 r3 = C43932.this;
                C4845jC jCVar = C4845jC.MediaBrowserCompat$CustomActionResultReceiver;
                if (r3.RatingCompat != null) {
                    jCVar.IconCompatParcelizer(r3.RatingCompat);
                }
            }

            public final void onError(Throwable th) {
                super.onError(th);
                C43932.this.RatingCompat(th);
            }
        });
    }
}
