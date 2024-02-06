package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.FragmentBuilder_BindRegistrationLandingFragment;
import p040o.GoogleMap;
import p040o.HmlPromptPayVerificationActivity;

/* renamed from: o.createDelegate */
public final /* synthetic */ class createDelegate implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindRegistrationLandingFragment.read MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ createDelegate(FragmentBuilder_BindRegistrationLandingFragment.read read) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
    }

    public final Object write(Object obj) {
        onSnapshotReady onsnapshotready;
        HmlPromptPayVerificationActivity.write write = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        setRenderer setrenderer = (setRenderer) ((SingleDataEntity) obj).getData();
        onGetStartedClick.write((Object) setrenderer, "entity");
        setMarkerView setmarkerview = setrenderer.IconCompatParcelizer;
        List list = null;
        GoogleMap.OnPoiClickListener onPoiClickListener = setmarkerview != null ? new GoogleMap.OnPoiClickListener(HmlPromptPayVerificationActivity.write.write(setmarkerview.MediaBrowserCompat$ItemReceiver), HmlPromptPayVerificationActivity.write.write(setmarkerview.MediaDescriptionCompat), setmarkerview.read, setmarkerview.RatingCompat, setmarkerview.write, setmarkerview.MediaBrowserCompat$MediaItem, setmarkerview.IconCompatParcelizer, setmarkerview.MediaBrowserCompat$CustomActionResultReceiver) : null;
        String str = setrenderer.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = setrenderer.MediaDescriptionCompat;
        String str3 = setrenderer.MediaBrowserCompat$MediaItem;
        String str4 = setrenderer.MediaMetadataCompat;
        List<String> list2 = setrenderer.RatingCompat;
        setHighlighter sethighlighter = setrenderer.MediaBrowserCompat$ItemReceiver;
        onMyLocationClick onmylocationclick = sethighlighter != null ? new onMyLocationClick(sethighlighter.IconCompatParcelizer, sethighlighter.write, sethighlighter.MediaBrowserCompat$ItemReceiver, sethighlighter.read, sethighlighter.MediaBrowserCompat$CustomActionResultReceiver, sethighlighter.MediaMetadataCompat) : null;
        setLogEnabled setlogenabled = setrenderer.read;
        GoogleMap.OnPolygonClickListener onPolygonClickListener = setlogenabled != null ? new GoogleMap.OnPolygonClickListener(setlogenabled.write, setlogenabled.MediaBrowserCompat$ItemReceiver, setlogenabled.read, setlogenabled.MediaBrowserCompat$CustomActionResultReceiver) : null;
        setOnChartGestureListener setonchartgesturelistener = setrenderer.write;
        if (setonchartgesturelistener != null) {
            String str5 = setonchartgesturelistener.write;
            setMarker setmarker = setonchartgesturelistener.MediaBrowserCompat$ItemReceiver;
            GoogleMap.OnPolylineClickListener onPolylineClickListener = setmarker != null ? new GoogleMap.OnPolylineClickListener(setmarker.IconCompatParcelizer, setmarker.read, setmarker.write, setmarker.MediaBrowserCompat$CustomActionResultReceiver, setmarker.MediaDescriptionCompat, setmarker.MediaBrowserCompat$ItemReceiver) : null;
            List<setNoDataTextColor> list3 = setonchartgesturelistener.MediaBrowserCompat$CustomActionResultReceiver;
            if (list3 != null) {
                Iterable<setNoDataTextColor> iterable = list3;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (setNoDataTextColor setnodatatextcolor : iterable) {
                    arrayList.add(new onPolylineClick(setnodatatextcolor.MediaBrowserCompat$ItemReceiver, setnodatatextcolor.MediaBrowserCompat$CustomActionResultReceiver, setnodatatextcolor.IconCompatParcelizer, setnodatatextcolor.write, setnodatatextcolor.read));
                }
                list = (List) arrayList;
            }
            onsnapshotready = new onSnapshotReady(str5, onPolylineClickListener, list);
        } else {
            onsnapshotready = null;
        }
        return BScanCNotificationDeepLinkActivity.read(new createFromAttributes(onPoiClickListener, str, str2, str3, str4, list2, onmylocationclick, onPolygonClickListener, onsnapshotready));
    }
}
