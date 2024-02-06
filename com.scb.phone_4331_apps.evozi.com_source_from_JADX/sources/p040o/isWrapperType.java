package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.isWrapperType */
public final class isWrapperType implements OPRStatusRewardsLandingActivity_ViewBinding<allPrimitiveTypes> {
    public static allPrimitiveTypes read(Resources resources, SharedPreferences sharedPreferences) {
        return new allPrimitiveTypes(resources, sharedPreferences);
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
        return new allPrimitiveTypes((Resources) hmlReviewDocumentActivity.get(), (SharedPreferences) hmlReviewDocumentActivity.get());
    }
}
