package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.MapConstraints;

/* renamed from: o.cartesianProduct */
public final class cartesianProduct extends constrainedListMultimap {
    public final MapConstraints.C36301 read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public cartesianProduct(MapConstraints.C36301 r2, Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) r2, "languageDisplayMapper");
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        this.read = r2;
    }
}
