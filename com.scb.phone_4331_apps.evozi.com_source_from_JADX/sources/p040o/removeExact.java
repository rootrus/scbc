package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.gson.Gson;

/* renamed from: o.removeExact */
public final class removeExact extends constrainedListMultimap {
    public final Gson IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public removeExact(Resources resources, SharedPreferences sharedPreferences, Gson gson) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) gson, "gson");
        this.IconCompatParcelizer = gson;
    }
}
