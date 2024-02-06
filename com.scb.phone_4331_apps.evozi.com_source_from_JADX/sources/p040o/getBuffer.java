package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.Iterables;

/* renamed from: o.getBuffer */
public final class getBuffer extends constrainedListMultimap {
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompat$ItemReceiver;
    private final String read;

    @HmlPinActivity
    public getBuffer(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str2, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseStaticURL") String str3) {
        super(resources, sharedPreferences);
        this.MediaBrowserCompat$ItemReceiver = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
    }

    public final String read(int i) {
        if (i != -1) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.getStringArray(Iterables.C35273.write.environment_dev_base_url)[i];
        }
        return this.write.getString("BASE_URL", this.MediaBrowserCompat$ItemReceiver);
    }

    public final String MediaBrowserCompat$ItemReceiver(int i) {
        if (i != -1) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.getStringArray(Iterables.C35273.write.environment_dev_base_assets_url)[i];
        }
        return this.write.getString("BASE_ASSETS_URL", this.IconCompatParcelizer);
    }

    public final String IconCompatParcelizer(int i) {
        if (i != -1) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.getStringArray(Iterables.C35273.write.environment_dev_base_static_url)[i];
        }
        return this.write.getString("BASE_STATIC_URL", this.read);
    }
}
