package p040o;

import com.scb.phone.view.custom.C5796x9ab8a620;
import com.scb.phone.view.fragment.registration.RegistrationCardDetailFragment;
import p040o.C4316e;

/* renamed from: o.ActivityBuilder_ContributeMwPinnedSuccessActivity */
public final /* synthetic */ class ActivityBuilder_ContributeMwPinnedSuccessActivity implements C5796x9ab8a620 {
    private final /* synthetic */ RegistrationCardDetailFragment write;

    public /* synthetic */ ActivityBuilder_ContributeMwPinnedSuccessActivity(RegistrationCardDetailFragment registrationCardDetailFragment) {
        this.write = registrationCardDetailFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2, int i, int i2) {
        RegistrationCardDetailFragment registrationCardDetailFragment = this.write;
        registrationCardDetailFragment.IconCompatParcelizer = i;
        registrationCardDetailFragment.MediaBrowserCompat$CustomActionResultReceiver = i2;
        buildNameMap buildnamemap = registrationCardDetailFragment.presenter;
        C4316e.C4322a aVar = new C4316e.C4322a(str, str2);
        boolean z = true;
        if (buildnamemap.RatingCompat != null) {
            aVar.IconCompatParcelizer(buildnamemap.RatingCompat);
        }
        EdgeGuidance edgeGuidance = EdgeGuidance.MediaBrowserCompat$CustomActionResultReceiver;
        if (buildnamemap.RatingCompat == null) {
            z = false;
        }
        if (z) {
            edgeGuidance.IconCompatParcelizer(buildnamemap.RatingCompat);
        }
        buildnamemap.MediaBrowserCompat$MediaItem = CheckCaptureActivity.MediaBrowserCompat$ItemReceiver(str.concat(str2), "MMyy", "yyyy-MM", false);
    }
}
