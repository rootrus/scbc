package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.crossOverUp */
public final class crossOverUp implements OPRStatusRewardsLandingActivity_ViewBinding<bubbleUpAlternatingLevels> {
    public static bubbleUpAlternatingLevels write(Resources resources, SharedPreferences sharedPreferences, bubbleUp bubbleup) {
        return new bubbleUpAlternatingLevels(resources, sharedPreferences, bubbleup);
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
        return new bubbleUpAlternatingLevels((Resources) hmlReviewDocumentActivity.get(), (SharedPreferences) hmlReviewDocumentActivity.get(), (bubbleUp) hmlReviewDocumentActivity.get());
    }
}
