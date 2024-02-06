package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.InputSupplier */
public final class InputSupplier extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public InputSupplier(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }
}
