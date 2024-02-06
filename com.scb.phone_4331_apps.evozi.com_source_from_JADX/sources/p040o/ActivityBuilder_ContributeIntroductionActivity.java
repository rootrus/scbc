package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.fragment.profilemanagement.accounts.VerifyIdentityFragment;
import p040o.C10178z;
import p040o.writeUInt64NoTag;

/* renamed from: o.ActivityBuilder_ContributeIntroductionActivity */
public final /* synthetic */ class ActivityBuilder_ContributeIntroductionActivity implements TextView.OnEditorActionListener {
    private final /* synthetic */ VerifyIdentityFragment write;

    public /* synthetic */ ActivityBuilder_ContributeIntroductionActivity(VerifyIdentityFragment verifyIdentityFragment) {
        this.write = verifyIdentityFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        VerifyIdentityFragment verifyIdentityFragment = this.write;
        boolean z = false;
        if (i != 6) {
            return false;
        }
        C4867jg jgVar = verifyIdentityFragment.presenter;
        C10178z.C547618 r4 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                KtaJsonExactionHelper.this.IconCompatParcelizer();
            }
        };
        if (jgVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r4.IconCompatParcelizer(jgVar.RatingCompat);
        }
        return true;
    }
}
