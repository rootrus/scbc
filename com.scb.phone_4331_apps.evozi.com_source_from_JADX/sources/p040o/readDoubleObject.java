package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.fragment.easycash.DurationEmploymentForBusinessDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p040o.GoogleMap;
import p040o.Unbinder;

/* renamed from: o.readDoubleObject */
public final /* synthetic */ class readDoubleObject implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ DurationEmploymentForBusinessDialog.read MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ readDoubleObject(DurationEmploymentForBusinessDialog.read read) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
    }

    public final Object write(Object obj) {
        String str;
        String str2;
        String str3;
        List list;
        String str4;
        GoogleMap.OnPolylineClickListener onPolylineClickListener;
        setMarker setmarker;
        List<DeepLinkModule> list2;
        Unbinder.CC r0 = (Unbinder.CC) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) r0, "entity");
        float f = r0.MediaBrowserCompat$CustomActionResultReceiver;
        String str5 = r0.read;
        String str6 = r0.IconCompatParcelizer;
        String str7 = r0.MediaMetadataCompat;
        String str8 = r0.MediaBrowserCompat$MediaItem;
        String str9 = r0.MediaDescriptionCompat;
        String str10 = r0.MediaSessionCompat$ResultReceiverWrapper;
        String str11 = r0.ParcelableVolumeInfo;
        String str12 = r0.MediaBrowserCompat$ItemReceiver;
        String str13 = r0.MediaBrowserCompat$SearchResultReceiver;
        String str14 = r0.RatingCompat;
        parseParameters parseparameters = r0.write;
        if (parseparameters == null || (list2 = parseparameters.IconCompatParcelizer) == null) {
            str = str12;
            str2 = str13;
            str3 = str14;
            list = HmlNationalIdActivity.IconCompatParcelizer;
        } else {
            Iterable iterable = list2;
            int i = 10;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            if (iterable instanceof Collection) {
                i = ((Collection) iterable).size();
            }
            Collection arrayList = new ArrayList(i);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                DeepLinkModule deepLinkModule = (DeepLinkModule) it.next();
                arrayList.add(new SupportStreetViewPanoramaFragment(deepLinkModule.MediaBrowserCompat$ItemReceiver, deepLinkModule.write, deepLinkModule.MediaBrowserCompat$CustomActionResultReceiver, deepLinkModule.RatingCompat, deepLinkModule.read, (String) null, 32));
                it = it;
                str14 = str14;
                str13 = str13;
                str12 = str12;
            }
            str = str12;
            str2 = str13;
            str3 = str14;
            list = (List) arrayList;
        }
        parseParameters parseparameters2 = r0.write;
        if (parseparameters2 != null) {
            str4 = parseparameters2.write;
        } else {
            str4 = null;
        }
        parseParameters parseparameters3 = r0.write;
        if (parseparameters3 == null || (setmarker = parseparameters3.MediaBrowserCompat$ItemReceiver) == null) {
            onPolylineClickListener = null;
        } else {
            onPolylineClickListener = new GoogleMap.OnPolylineClickListener(setmarker.IconCompatParcelizer, setmarker.read, setmarker.write, setmarker.MediaBrowserCompat$CustomActionResultReceiver, setmarker.MediaDescriptionCompat, setmarker.MediaBrowserCompat$ItemReceiver);
        }
        return new getStreetNamesEnabled(f, str5, str6, str7, str8, str9, str10, str11, str, str2, str3, list, str4, onPolylineClickListener);
    }
}
