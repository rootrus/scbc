package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.handleLine */
public final class handleLine extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public handleLine(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }
}
