package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.C3085x7c929f5b;
import p040o.SignedBytes;

/* renamed from: o.hasParent */
public final class hasParent extends SignedBytes.LexicographicalComparator {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public hasParent(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
    }

    public final getCode MediaBrowserCompat$ItemReceiver(getZOrderOnTop getzorderontop) {
        onGetStartedClick.write((Object) getzorderontop, "country");
        String str = getzorderontop.MediaBrowserCompat$ItemReceiver;
        String c_ = mo26549c_(getzorderontop.write);
        onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(country.flagImage)");
        Iterable<getTiltGesturesEnabled> iterable = getzorderontop.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (getTiltGesturesEnabled gettiltgesturesenabled : iterable) {
            arrayList.add(new C3085x7c929f5b.C30861(gettiltgesturesenabled.write, gettiltgesturesenabled.MediaBrowserCompat$CustomActionResultReceiver, gettiltgesturesenabled.IconCompatParcelizer, gettiltgesturesenabled.read, gettiltgesturesenabled.MediaBrowserCompat$ItemReceiver, mo26549c_(gettiltgesturesenabled.MediaBrowserCompat$SearchResultReceiver), gettiltgesturesenabled.MediaDescriptionCompat));
        }
        return new getCode(str, c_, (List) arrayList);
    }
}
