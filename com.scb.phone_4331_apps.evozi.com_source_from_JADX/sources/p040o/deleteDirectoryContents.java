package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.deleteDirectoryContents */
public final class deleteDirectoryContents implements OPRStatusRewardsLandingActivity_ViewBinding<deleteRecursively> {
    public static deleteRecursively write(Resources resources, SharedPreferences sharedPreferences) {
        return new deleteRecursively(resources, sharedPreferences);
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
        return new deleteRecursively((Resources) hmlReviewDocumentActivity.get(), (SharedPreferences) hmlReviewDocumentActivity.get());
    }
}
