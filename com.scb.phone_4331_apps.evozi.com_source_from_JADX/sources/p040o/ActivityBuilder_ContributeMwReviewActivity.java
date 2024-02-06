package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.fragment.registration.RegistrationCardDetailFragment;
import p040o.C10178z;
import p040o.writeUInt64NoTag;

/* renamed from: o.ActivityBuilder_ContributeMwReviewActivity */
public final /* synthetic */ class ActivityBuilder_ContributeMwReviewActivity implements TextView.OnEditorActionListener {
    private final /* synthetic */ RegistrationCardDetailFragment read;

    public /* synthetic */ ActivityBuilder_ContributeMwReviewActivity(RegistrationCardDetailFragment registrationCardDetailFragment) {
        this.read = registrationCardDetailFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        RegistrationCardDetailFragment registrationCardDetailFragment = this.read;
        boolean z = false;
        if (i != 6) {
            return false;
        }
        buildNameMap buildnamemap = registrationCardDetailFragment.presenter;
        C10178z.C547618 r4 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                KtaJsonExactionHelper.this.IconCompatParcelizer();
            }
        };
        if (buildnamemap.RatingCompat != null) {
            z = true;
        }
        if (z) {
            r4.IconCompatParcelizer(buildnamemap.RatingCompat);
        }
        return true;
    }
}
