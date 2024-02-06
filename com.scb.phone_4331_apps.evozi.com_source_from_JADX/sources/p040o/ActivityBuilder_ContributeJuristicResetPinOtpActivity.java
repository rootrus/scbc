package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.fragment.profilemanagement.accounts.VerifyIdentityFragment;
import p040o.C10178z;
import p040o.writeUInt64NoTag;

/* renamed from: o.ActivityBuilder_ContributeJuristicResetPinOtpActivity */
public final /* synthetic */ class ActivityBuilder_ContributeJuristicResetPinOtpActivity implements TextView.OnEditorActionListener {
    private final /* synthetic */ VerifyIdentityFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeJuristicResetPinOtpActivity(VerifyIdentityFragment verifyIdentityFragment) {
        this.IconCompatParcelizer = verifyIdentityFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        VerifyIdentityFragment verifyIdentityFragment = this.IconCompatParcelizer;
        boolean z = false;
        if (i != 5) {
            return false;
        }
        C4867jg jgVar = verifyIdentityFragment.presenter;
        C10178z.C547415 r4 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                KtaJsonExactionHelper.this.MediaBrowserCompat$ItemReceiver((getCountryLong) obj);
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
