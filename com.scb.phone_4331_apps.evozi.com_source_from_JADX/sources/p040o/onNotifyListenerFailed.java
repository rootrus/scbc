package p040o;

import android.view.View;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* renamed from: o.onNotifyListenerFailed */
public final class onNotifyListenerFailed {
    public float AlertController$RecycleListView;
    public int IconCompatParcelizer;
    public int MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver = PKIFailureInfo.systemUnavail;
    public int MediaBrowserCompat$MediaItem;
    public int MediaBrowserCompat$SearchResultReceiver = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public int f2910x50fd9e4a;
    public int MediaDescriptionCompat;
    public List<Integer> MediaMetadataCompat = new ArrayList();
    public int MediaSessionCompat$QueueItem = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public float MediaSessionCompat$ResultReceiverWrapper;
    public int MediaSessionCompat$Token = PKIFailureInfo.systemUnavail;
    public int ParcelableVolumeInfo;
    public int RatingCompat;
    public int read;
    public int write;

    public static final List<getZOrderOnTop> write(List<setEntryLabelTextSize> list) {
        onGetStartedClick.write((Object) list, "$this$toDomain");
        Iterable<setEntryLabelTextSize> iterable = list;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (setEntryLabelTextSize read2 : iterable) {
            arrayList.add(read(read2));
        }
        return HmlNTBBusinessURLInformationActivity.write((List) arrayList, new IconCompatParcelizer());
    }

    /* renamed from: o.onNotifyListenerFailed$IconCompatParcelizer */
    public static final class IconCompatParcelizer<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Comparable valueOf = Integer.valueOf(((getZOrderOnTop) t).read);
            Comparable valueOf2 = Integer.valueOf(((getZOrderOnTop) t2).read);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }

    private static getZOrderOnTop read(setEntryLabelTextSize setentrylabeltextsize) {
        onGetStartedClick.write((Object) setentrylabeltextsize, "$this$toDomain");
        String str = setentrylabeltextsize.write;
        String str2 = setentrylabeltextsize.MediaBrowserCompat$ItemReceiver;
        int parseInt = Integer.parseInt(setentrylabeltextsize.read);
        Iterable<setDrawRoundedSlices> iterable = setentrylabeltextsize.IconCompatParcelizer;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (setDrawRoundedSlices setdrawroundedslices : iterable) {
            arrayList.add(new getTiltGesturesEnabled(setdrawroundedslices.MediaBrowserCompat$ItemReceiver, setdrawroundedslices.MediaBrowserCompat$CustomActionResultReceiver, setdrawroundedslices.IconCompatParcelizer, setdrawroundedslices.write, setdrawroundedslices.read, Integer.parseInt(setdrawroundedslices.MediaBrowserCompat$MediaItem), setdrawroundedslices.RatingCompat, setdrawroundedslices.MediaMetadataCompat));
        }
        return new getZOrderOnTop(str, str2, parseInt, HmlNTBBusinessURLInformationActivity.write((List) arrayList, new onNotifyListenerFailed$MediaBrowserCompat$ItemReceiver()));
    }

    public final void write(View view, int i, int i2, int i3, int i4) {
        nAllocationResize2D nallocationresize2d = (nAllocationResize2D) view.getLayoutParams();
        this.MediaBrowserCompat$SearchResultReceiver = Math.min(this.MediaBrowserCompat$SearchResultReceiver, (view.getLeft() - nallocationresize2d.RatingCompat()) - i);
        this.MediaSessionCompat$QueueItem = Math.min(this.MediaSessionCompat$QueueItem, (view.getTop() - nallocationresize2d.MediaDescriptionCompat()) - i2);
        this.MediaSessionCompat$Token = Math.max(this.MediaSessionCompat$Token, view.getRight() + nallocationresize2d.MediaMetadataCompat() + i3);
        this.MediaBrowserCompat$ItemReceiver = Math.max(this.MediaBrowserCompat$ItemReceiver, view.getBottom() + nallocationresize2d.MediaBrowserCompat$MediaItem() + i4);
    }
}
