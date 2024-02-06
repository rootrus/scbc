package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.onResultOf */
public final class onResultOf extends constrainedListMultimap {
    public final String read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public onResultOf(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "language") String str) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "language");
        this.read = str;
    }
}
