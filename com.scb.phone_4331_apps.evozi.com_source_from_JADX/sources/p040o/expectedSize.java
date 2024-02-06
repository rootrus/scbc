package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.text.NumberFormat;
import java.util.Locale;
import p040o.ComponentDiscovery;

/* renamed from: o.expectedSize */
public final class expectedSize extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public expectedSize(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    public final ComponentDiscoveryService MediaBrowserCompat$CustomActionResultReceiver(ComponentDiscovery.RegistrarNameRetriever registrarNameRetriever) {
        if (registrarNameRetriever == null) {
            return null;
        }
        int i = registrarNameRetriever.write;
        int i2 = registrarNameRetriever.RatingCompat;
        Double valueOf = Double.valueOf(registrarNameRetriever.MediaBrowserCompat$CustomActionResultReceiver);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        currencyInstance.setMinimumFractionDigits(2);
        currencyInstance.setMaximumFractionDigits(2);
        String RatingCompat = RatingCompat(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(valueOf));
        String write = write(Double.valueOf(registrarNameRetriever.read));
        String write2 = write(Double.valueOf(registrarNameRetriever.MediaBrowserCompat$ItemReceiver));
        Double valueOf2 = Double.valueOf(registrarNameRetriever.MediaBrowserCompat$MediaItem);
        NumberFormat currencyInstance2 = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        currencyInstance2.setMinimumFractionDigits(2);
        currencyInstance2.setMaximumFractionDigits(2);
        return new ComponentDiscoveryService(i, i2, RatingCompat, write, write2, getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance2).format(valueOf2), write(Double.valueOf(registrarNameRetriever.MediaBrowserCompat$SearchResultReceiver)));
    }
}
