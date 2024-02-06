package p040o;

import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicInteger;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.getSignal;

/* renamed from: o.convertDottedQuadToHex */
public final /* synthetic */ class convertDottedQuadToHex implements findFragmentByWho {
    private final /* synthetic */ AtomicInteger IconCompatParcelizer;
    private final /* synthetic */ getTeredoInfo MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ convertDottedQuadToHex(getTeredoInfo getteredoinfo, AtomicInteger atomicInteger) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getteredoinfo;
        this.IconCompatParcelizer = atomicInteger;
    }

    public final Object IconCompatParcelizer(Object obj) {
        getTeredoInfo getteredoinfo = this.MediaBrowserCompat$CustomActionResultReceiver;
        getSignal getsignal = (getSignal) ((AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder) obj);
        int andIncrement = this.IconCompatParcelizer.getAndIncrement();
        getSignal.read MediaBrowserCompat$CustomActionResultReceiver2 = getSignal.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver2.MediaDescriptionCompat = getsignal.read();
        MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer = getsignal.IconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat = getsignal.MediaBrowserCompat$SearchResultReceiver;
        String str = "";
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = TextUtils.isEmpty(getsignal.write) ? str : getsignal.write;
        MediaBrowserCompat$CustomActionResultReceiver2.read = getsignal.read;
        MediaBrowserCompat$CustomActionResultReceiver2.write = getsignal.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$CustomActionResultReceiver2.RatingCompat = getteredoinfo.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.review_account_number, new Object[]{String.valueOf(andIncrement)});
        if (!TextUtils.isEmpty(getsignal.MediaBrowserCompat$MediaItem)) {
            str = getsignal.MediaBrowserCompat$MediaItem;
        }
        MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$Token = str;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$SearchResultReceiver = getsignal.MediaDescriptionCompat;
        return new getSignal(MediaBrowserCompat$CustomActionResultReceiver2, (byte) 0);
    }
}
