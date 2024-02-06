package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.GoogleMap;

/* renamed from: o.LineReader */
public final class LineReader {
    private static getExecution read(GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        String str = onMapLoadedCallback.write;
        Iterable<onMapLongClick> iterable = onMapLoadedCallback.IconCompatParcelizer;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (onMapLongClick onmaplongclick : iterable) {
            arrayList.add(new AutoValue_CrashlyticsReport_Session_Event_Application.C30731(onmaplongclick.MediaDescriptionCompat, onmaplongclick.write, onmaplongclick.MediaBrowserCompat$ItemReceiver, onmaplongclick.read, onmaplongclick.MediaBrowserCompat$CustomActionResultReceiver, onmaplongclick.MediaMetadataCompat, onmaplongclick.IconCompatParcelizer));
        }
        return new getExecution(str, (List) arrayList);
    }

    public final AutoValue_CrashlyticsReport_Session_Event_Application.Builder IconCompatParcelizer(GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        GoogleMap.OnMapLongClickListener onMapLongClickListener2 = onMapLongClickListener;
        onGetStartedClick.write((Object) onMapLongClickListener2, "domain");
        GoogleMap.OnMapLoadedCallback onMapLoadedCallback = onMapLongClickListener2.f2718x50fd9e4a;
        onGetStartedClick.IconCompatParcelizer((Object) onMapLoadedCallback, "domain.depositAccounts");
        getExecution read = read(onMapLoadedCallback);
        GoogleMap.OnMapLoadedCallback onMapLoadedCallback2 = onMapLongClickListener2.MediaMetadataCompat;
        onGetStartedClick.IconCompatParcelizer((Object) onMapLoadedCallback2, "domain.cardAccounts");
        getExecution read2 = read(onMapLoadedCallback2);
        GoogleMap.OnMapLoadedCallback onMapLoadedCallback3 = onMapLongClickListener2.ParcelableVolumeInfo;
        onGetStartedClick.IconCompatParcelizer((Object) onMapLoadedCallback3, "domain.cardPendingAccounts");
        getExecution read3 = read(onMapLoadedCallback3);
        GoogleMap.OnMapLoadedCallback onMapLoadedCallback4 = onMapLongClickListener2.MediaSessionCompat$ResultReceiverWrapper;
        onGetStartedClick.IconCompatParcelizer((Object) onMapLoadedCallback4, "domain.loanAccounts");
        getExecution read4 = read(onMapLoadedCallback4);
        GoogleMap.OnMapLoadedCallback onMapLoadedCallback5 = onMapLongClickListener2.PlaybackStateCompat$CustomAction;
        onGetStartedClick.IconCompatParcelizer((Object) onMapLoadedCallback5, "domain.smeLoanAccounts");
        getExecution read5 = read(onMapLoadedCallback5);
        GoogleMap.OnMapLoadedCallback onMapLoadedCallback6 = onMapLongClickListener2.MediaSessionCompat$Token;
        onGetStartedClick.IconCompatParcelizer((Object) onMapLoadedCallback6, "domain.clientAccounts");
        getExecution read6 = read(onMapLoadedCallback6);
        GoogleMap.OnMapLoadedCallback onMapLoadedCallback7 = onMapLongClickListener2.setHasDecor;
        onGetStartedClick.IconCompatParcelizer((Object) onMapLoadedCallback7, "domain.merchantWalletAccounts");
        getExecution read7 = read(onMapLoadedCallback7);
        GoogleMap.OnMapLoadedCallback onMapLoadedCallback8 = onMapLongClickListener2.PlaybackStateCompat;
        onGetStartedClick.IconCompatParcelizer((Object) onMapLoadedCallback8, "domain.prepaidAccounts");
        getExecution read8 = read(onMapLoadedCallback8);
        GoogleMap.OnMapLoadedCallback onMapLoadedCallback9 = onMapLongClickListener2.MediaSessionCompat$QueueItem;
        onGetStartedClick.IconCompatParcelizer((Object) onMapLoadedCallback9, "domain.debitAccounts");
        getExecution read9 = read(onMapLoadedCallback9);
        onMapLoaded onmaploaded = onMapLongClickListener2.AlertController$RecycleListView;
        onGetStartedClick.IconCompatParcelizer((Object) onmaploaded, "domain.securitiesList");
        setTimestamp settimestamp = r3;
        setTimestamp settimestamp2 = new setTimestamp(onmaploaded.MediaBrowserCompat$CustomActionResultReceiver, onmaploaded.write);
        return new AutoValue_CrashlyticsReport_Session_Event_Application.Builder(read, read2, read3, read4, read5, read6, read7, read8, read9, settimestamp, onMapLongClickListener2.Keep, onMapLongClickListener2.MediaBrowserCompat$CustomActionResultReceiver, onMapLongClickListener2.MediaBrowserCompat$ItemReceiver, onMapLongClickListener2.read, onMapLongClickListener2.MediaDescriptionCompat, onMapLongClickListener2.write, onMapLongClickListener2.IconCompatParcelizer, onMapLongClickListener2.RatingCompat, onMapLongClickListener2.MediaBrowserCompat$SearchResultReceiver, onMapLongClickListener2.MediaBrowserCompat$MediaItem);
    }
}
