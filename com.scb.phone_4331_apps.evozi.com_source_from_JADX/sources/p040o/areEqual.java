package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.areEqual */
public final class areEqual implements OPRStatusRewardsLandingActivity_ViewBinding<entriesOnlyOnLeft> {
    public static entriesOnlyOnLeft read(Resources resources, SharedPreferences sharedPreferences, String str) {
        return new entriesOnlyOnLeft(resources, sharedPreferences, str);
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
        return new entriesOnlyOnLeft((Resources) hmlReviewDocumentActivity.get(), (SharedPreferences) hmlReviewDocumentActivity.get(), (String) hmlReviewDocumentActivity.get());
    }
}
