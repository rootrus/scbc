package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.setSampleRate */
public final class setSampleRate extends FragmentBuilder_BindSummaryFragment {
    public final callServiceStopSelfResult read(decodeIpv4Suffix decodeipv4suffix) {
        List<getContainerId> list;
        List<push> list2 = decodeipv4suffix.write;
        if (list2 != null) {
            Iterable<push> iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            for (push push : iterable) {
                url url = push.write;
                getJobId getjobid = new getJobId(url.MediaBrowserCompat$CustomActionResultReceiver, url.MediaBrowserCompat$MediaItem, url.MediaBrowserCompat$SearchResultReceiver, url.IconCompatParcelizer, url.read, url.MediaBrowserCompat$ItemReceiver, url.write);
                isDotDot isdotdot = push.MediaBrowserCompat$ItemReceiver;
                arrayList.add(new getContainerId(getjobid, new onStartCommand(isdotdot.write, isdotdot.IconCompatParcelizer, isdotdot.read)));
            }
            list = (List) arrayList;
        } else {
            list = null;
        }
        callServiceStopSelfResult callservicestopselfresult = new callServiceStopSelfResult((byte) 0);
        callservicestopselfresult.write = list;
        callservicestopselfresult.MediaSessionCompat$ResultReceiverWrapper = decodeipv4suffix.f5533x50fd9e4a;
        callservicestopselfresult.ParcelableVolumeInfo = decodeipv4suffix.MediaSessionCompat$Token;
        callservicestopselfresult.MediaSessionCompat$Token = decodeipv4suffix.MediaBrowserCompat$MediaItem;
        callservicestopselfresult.MediaDescriptionCompat = decodeipv4suffix.RatingCompat;
        callservicestopselfresult.MediaMetadataCompat = decodeipv4suffix.MediaDescriptionCompat;
        callservicestopselfresult.RatingCompat = decodeipv4suffix.MediaMetadataCompat;
        isDot isdot = decodeipv4suffix.MediaBrowserCompat$SearchResultReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) isdot, "entity.status");
        callservicestopselfresult.MediaBrowserCompat$CustomActionResultReceiver = new SCBUniversalWebViewActivity$MediaBrowserCompat$ItemReceiver(isdot.MediaBrowserCompat$CustomActionResultReceiver, isdot.IconCompatParcelizer, isdot.read);
        callservicestopselfresult.MediaBrowserCompat$SearchResultReceiver = decodeipv4suffix.IconCompatParcelizer;
        callservicestopselfresult.MediaSessionCompat$QueueItem = decodeipv4suffix.ParcelableVolumeInfo;
        return callservicestopselfresult;
    }
}
