package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/* renamed from: o.unmodifiableEntry */
public final class unmodifiableEntry extends constrainedSetMultimap<getPersistenceKey, normalize> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        return IconCompatParcelizer((getPersistenceKey) obj);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public unmodifiableEntry(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    private static normalize IconCompatParcelizer(getPersistenceKey getpersistencekey) {
        onGetStartedClick.write((Object) getpersistencekey, "data");
        normalize normalize = new normalize((byte) 0);
        normalize.f2902x50fd9e4a = MediaBrowserCompat$SearchResultReceiver(Double.valueOf(getpersistencekey.MediaBrowserCompat$CustomActionResultReceiver));
        normalize.MediaDescriptionCompat = Double.valueOf(getpersistencekey.MediaBrowserCompat$CustomActionResultReceiver);
        normalize.setHasDecor = MediaBrowserCompat$SearchResultReceiver(Double.valueOf(getpersistencekey.RatingCompat));
        normalize.Keep = Double.valueOf(getpersistencekey.RatingCompat);
        normalize.MediaSessionCompat$Token = MediaBrowserCompat$SearchResultReceiver(Double.valueOf(getpersistencekey.MediaMetadataCompat));
        normalize.PlaybackStateCompat$CustomAction = MediaBrowserCompat$SearchResultReceiver(Double.valueOf(getpersistencekey.MediaBrowserCompat$SearchResultReceiver));
        String str = getpersistencekey.IconCompatParcelizer;
        if (str != null) {
            normalize.MediaMetadataCompat = str;
            normalize.setContentView = getpersistencekey.MediaBrowserCompat$MediaItem;
            normalize.setBackgroundResource = onGetStartedClick.write(getpersistencekey.MediaBrowserCompat$MediaItem, (Object) "%");
        } else {
            normalize.MediaBrowserCompat$MediaItem = getpersistencekey.write;
            normalize.RatingCompat = onGetStartedClick.write(getpersistencekey.write, (Object) "%");
        }
        normalize.ParcelableVolumeInfo = getpersistencekey.read;
        normalize.MediaSessionCompat$ResultReceiverWrapper = getpersistencekey.MediaBrowserCompat$ItemReceiver;
        normalize.MediaSessionCompat$QueueItem = ModifyQuickTopUpReviewActivity.IconCompatParcelizer(getpersistencekey.MediaBrowserCompat$ItemReceiver, "0");
        normalize.PlaybackStateCompat = getpersistencekey.MediaDescriptionCompat;
        return normalize;
    }

    public final List<normalize> MediaBrowserCompat$ItemReceiver(List<getPersistenceKey> list) {
        onGetStartedClick.write((Object) list, "list");
        Iterable<getPersistenceKey> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (getPersistenceKey IconCompatParcelizer : iterable) {
            arrayList.add(IconCompatParcelizer(IconCompatParcelizer));
        }
        return (List) arrayList;
    }

    private static String MediaBrowserCompat$SearchResultReceiver(Double d) {
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        currencyInstance.setMinimumFractionDigits(2);
        currencyInstance.setMaximumFractionDigits(2);
        String format = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(d);
        onGetStartedClick.IconCompatParcelizer((Object) format, "currencyNumberFormatWith…onDigits(2).format(value)");
        return format;
    }
}
