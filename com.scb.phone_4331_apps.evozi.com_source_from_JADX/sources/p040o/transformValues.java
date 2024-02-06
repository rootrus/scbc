package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.transformValues */
public final class transformValues extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public transformValues(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    public final initializeApp MediaBrowserCompat$ItemReceiver(String str, String str2, chain chain, normalize normalize) {
        double d;
        double d2;
        List<isDefaultApp> list;
        String str3;
        String str4;
        String str5;
        double d3;
        double d4;
        double d5;
        Double d6;
        onGetStartedClick.write((Object) chain, "creditCardDisplay");
        onGetStartedClick.write((Object) normalize, "planDisplayModel");
        initializeApp initializeapp = new initializeApp((byte) 0);
        initializeapp.RatingCompat = chain.AppCompatViewInflater;
        initializeapp.MediaBrowserCompat$CustomActionResultReceiver = chain.MediaDescriptionCompat;
        initializeapp.MediaBrowserCompat$ItemReceiver = String.format("%s %s%s %s %s", new Object[]{chain.MediaBrowserCompat$SearchResultReceiver, chain.MediaSessionCompat$QueueItem, "xx", "xxxx", chain.f2806x50fd9e4a});
        initializeapp.read = normalize.MediaSessionCompat$ResultReceiverWrapper;
        initializeapp.MediaBrowserCompat$SearchResultReceiver = normalize.MediaBrowserCompat$MediaItem;
        Double d7 = normalize.Keep;
        if (d7 != null) {
            d = d7.doubleValue();
        } else {
            d = 0.0d;
        }
        initializeapp.MediaSessionCompat$QueueItem = d;
        initializeapp.ParcelableVolumeInfo = normalize.MediaSessionCompat$Token;
        Double d8 = normalize.MediaDescriptionCompat;
        if (d8 != null) {
            d2 = d8.doubleValue();
        } else {
            d2 = 0.0d;
        }
        initializeapp.MediaDescriptionCompat = d2;
        initializeapp.IconCompatParcelizer = String.format("%s %s", new Object[]{normalize.MediaSessionCompat$QueueItem, this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.month_label)});
        initializeapp.MediaSessionCompat$Token = str;
        initializeapp.write = normalize.MediaMetadataCompat;
        initializeapp.setHasDecor = normalize.setContentView;
        initializeapp.MediaBrowserCompat$MediaItem = normalize.setHasDecor;
        initializeapp.MediaSessionCompat$ResultReceiverWrapper = normalize.PlaybackStateCompat$CustomAction;
        initializeapp.f2868x50fd9e4a = str2;
        List<FirebaseException> list2 = normalize.PlaybackStateCompat;
        if (list2 != null) {
            Iterable<FirebaseException> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (FirebaseException firebaseException : iterable) {
                systemExit systemexit = firebaseException.IconCompatParcelizer;
                FirebaseApp$$Lambda$1 firebaseApp$$Lambda$1 = firebaseException.read;
                isDefaultApp isdefaultapp = new isDefaultApp((byte) 0);
                String str6 = null;
                if (systemexit != null) {
                    str3 = systemexit.MediaBrowserCompat$CustomActionResultReceiver;
                } else {
                    str3 = null;
                }
                isdefaultapp.read = str3;
                if (systemexit != null) {
                    str4 = systemexit.read;
                } else {
                    str4 = null;
                }
                isdefaultapp.write = str4;
                if (systemexit != null) {
                    str5 = systemexit.write;
                } else {
                    str5 = null;
                }
                isdefaultapp.MediaBrowserCompat$ItemReceiver = str5;
                if (systemexit != null) {
                    str6 = systemexit.MediaBrowserCompat$SearchResultReceiver;
                }
                isdefaultapp.MediaBrowserCompat$MediaItem = str6;
                if (systemexit == null || (d6 = systemexit.MediaMetadataCompat) == null) {
                    d3 = 0.0d;
                } else {
                    d3 = d6.doubleValue();
                }
                isdefaultapp.MediaBrowserCompat$SearchResultReceiver = d3;
                if (firebaseApp$$Lambda$1 != null) {
                    d4 = firebaseApp$$Lambda$1.MediaBrowserCompat$ItemReceiver;
                } else {
                    d4 = 0.0d;
                }
                isdefaultapp.IconCompatParcelizer = d4;
                if (firebaseApp$$Lambda$1 != null) {
                    d5 = firebaseApp$$Lambda$1.MediaBrowserCompat$ItemReceiver;
                } else {
                    d5 = 0.0d;
                }
                isdefaultapp.MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d5);
                arrayList.add(isdefaultapp);
            }
            list = (List) arrayList;
        } else {
            list = new ArrayList<>();
        }
        initializeapp.MediaMetadataCompat = list;
        return initializeapp;
    }
}
