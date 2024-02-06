package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.crossOver */
public final class crossOver implements OPRStatusRewardsLandingActivity_ViewBinding<bubbleUp> {
    public static bubbleUp IconCompatParcelizer(Resources resources, SharedPreferences sharedPreferences) {
        return new bubbleUp(resources, sharedPreferences);
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
        return new bubbleUp((Resources) hmlReviewDocumentActivity.get(), (SharedPreferences) hmlReviewDocumentActivity.get());
    }
}
