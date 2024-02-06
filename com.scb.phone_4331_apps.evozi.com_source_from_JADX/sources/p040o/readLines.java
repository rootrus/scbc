package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.gson.Gson;

/* renamed from: o.readLines */
public final class readLines extends constrainedListMultimap {
    public final Gson read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public readLines(Resources resources, SharedPreferences sharedPreferences, Gson gson) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) gson, "gson");
        this.read = gson;
    }
}
