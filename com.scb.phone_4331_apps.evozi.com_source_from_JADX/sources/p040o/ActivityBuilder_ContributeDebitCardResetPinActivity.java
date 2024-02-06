package p040o;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.landingpage.LandingFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;

/* renamed from: o.ActivityBuilder_ContributeDebitCardResetPinActivity */
public final /* synthetic */ class ActivityBuilder_ContributeDebitCardResetPinActivity implements View.OnClickListener {
    private final /* synthetic */ LandingFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeDebitCardResetPinActivity(LandingFragment landingFragment) {
        this.MediaBrowserCompat$ItemReceiver = landingFragment;
    }

    public final void onClick(View view) {
        LandingFragment landingFragment = this.MediaBrowserCompat$ItemReceiver;
        if (!landingFragment.RatingCompat && landingFragment.getContext() != null) {
            landingFragment.RatingCompat = true;
            ZSYR2K[] zsyr2kArr = new ZSYR2K[2];
            zsyr2kArr[0] = new ZSYR2K("source", "lifestyle_landing");
            zsyr2kArr[1] = new ZSYR2K("new_insight", landingFragment.MediaBrowserCompat$SearchResultReceiver ? "yes" : "no");
            if (landingFragment.getActivity() != null) {
                ((BaseActivity) landingFragment.getActivity()).scbAnalytics.write("justforyou_landing", zsyr2kArr);
            }
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("scbeasy://justforyou/entrypoint?source=lifestyle_landing"));
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            LandingFragment.IconCompatParcelizer(landingFragment, intent);
        }
    }
}
