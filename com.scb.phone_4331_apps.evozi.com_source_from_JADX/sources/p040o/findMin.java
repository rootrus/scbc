package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.findMin */
public final class findMin extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public findMin(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    public final Lazy write(Lazy lazy, setZIndex setzindex) {
        String str;
        String str2;
        String str3;
        onGetStartedClick.write((Object) lazy, "cardDisplay");
        onGetStartedClick.write((Object) setzindex, "reward");
        lazy.f2750x50fd9e4a = setzindex.MediaDescriptionCompat;
        onGetStartedClick.write((Object) setzindex, "debitCardReward");
        String str4 = setzindex.MediaBrowserCompat$CustomActionResultReceiver;
        String str5 = setzindex.RatingCompat;
        Double d = null;
        String IconCompatParcelizer = IconCompatParcelizer(str5 != null ? Double.valueOf(Double.parseDouble(str5)) : null);
        if (setzindex.MediaBrowserCompat$ItemReceiver == null || (str = CheckCaptureActivity.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, setzindex.MediaBrowserCompat$ItemReceiver)) == null) {
            str = "";
        }
        String str6 = setzindex.read;
        if (str6 != null) {
            d = Double.valueOf(Double.parseDouble(str6));
        }
        String IconCompatParcelizer2 = IconCompatParcelizer(d);
        if (setzindex.write == null || (str3 = setzindex.write) == null) {
            str2 = "";
        } else {
            str2 = str3;
        }
        lazy.MediaBrowserCompat$SearchResultReceiver = new CrashlyticsRegistrar(str4, IconCompatParcelizer, str, IconCompatParcelizer2, str2);
        return lazy;
    }
}
