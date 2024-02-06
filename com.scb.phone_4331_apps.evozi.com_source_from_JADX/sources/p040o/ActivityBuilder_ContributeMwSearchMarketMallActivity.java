package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.fragment.registration.RegistrationCardDetailFragment;
import p040o.C10178z;
import p040o.writeUInt64NoTag;

/* renamed from: o.ActivityBuilder_ContributeMwSearchMarketMallActivity */
public final /* synthetic */ class ActivityBuilder_ContributeMwSearchMarketMallActivity implements TextView.OnEditorActionListener {
    private final /* synthetic */ RegistrationCardDetailFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeMwSearchMarketMallActivity(RegistrationCardDetailFragment registrationCardDetailFragment) {
        this.IconCompatParcelizer = registrationCardDetailFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        RegistrationCardDetailFragment registrationCardDetailFragment = this.IconCompatParcelizer;
        boolean z = false;
        if (i != 5) {
            return false;
        }
        buildNameMap buildnamemap = registrationCardDetailFragment.presenter;
        C10178z.C547415 r4 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                KtaJsonExactionHelper.this.MediaBrowserCompat$ItemReceiver((getCountryLong) obj);
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
