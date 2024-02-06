package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.GoogleMap;

/* renamed from: o.getActualTypeArguments$MediaBrowserCompat$CustomActionResultReceiver */
public final class C9951x800aeba5 extends CheckEligibilityActivity implements FundFactSheetActivity<setTransitionTypes, HmlVerifyPhoneValidateOtpActivity> {
    private /* synthetic */ getActualTypeArguments MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9951x800aeba5(getActualTypeArguments getactualtypearguments) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = getactualtypearguments;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        onSnapshotReady onsnapshotready;
        List list;
        String str;
        String str2;
        setTransitionTypes settransitiontypes = (setTransitionTypes) obj;
        onGetStartedClick.write((Object) settransitiontypes, "it");
        getActualTypeArguments.write(this.MediaBrowserCompat$ItemReceiver);
        MinMaxPriorityQueue unused = this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat;
        onGetStartedClick.write((Object) settransitiontypes, "insurancePaymentConfirmation");
        String str3 = settransitiontypes.read;
        OffsetDateTime parse = OffsetDateTime.parse(settransitiontypes.MediaBrowserCompat$CustomActionResultReceiver);
        Double d = settransitiontypes.write;
        GeofencingEvent geofencingEvent = settransitiontypes.IconCompatParcelizer;
        if (geofencingEvent != null) {
            String str4 = geofencingEvent.read;
            setLoiteringDelay setloiteringdelay = geofencingEvent.MediaBrowserCompat$CustomActionResultReceiver;
            GoogleMap.OnPolylineClickListener onPolylineClickListener = setloiteringdelay != null ? new GoogleMap.OnPolylineClickListener(setloiteringdelay.read, setloiteringdelay.IconCompatParcelizer, setloiteringdelay.write, setloiteringdelay.MediaBrowserCompat$CustomActionResultReceiver, setloiteringdelay.MediaDescriptionCompat, setloiteringdelay.MediaBrowserCompat$ItemReceiver) : null;
            List<GeofencingApi> list2 = geofencingEvent.write;
            if (list2 != null) {
                Iterable<GeofencingApi> iterable = list2;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (GeofencingApi geofencingApi : iterable) {
                    String str5 = geofencingApi != null ? geofencingApi.MediaMetadataCompat : null;
                    String str6 = geofencingApi != null ? geofencingApi.MediaBrowserCompat$ItemReceiver : null;
                    if (geofencingApi != null) {
                        str = geofencingApi.IconCompatParcelizer;
                    } else {
                        str = null;
                    }
                    String str7 = geofencingApi != null ? geofencingApi.read : null;
                    if (geofencingApi != null) {
                        str2 = geofencingApi.MediaBrowserCompat$CustomActionResultReceiver;
                    } else {
                        str2 = null;
                    }
                    arrayList.add(new onPolylineClick(str5, str6, str, str7, str2));
                }
                list = (List) arrayList;
            } else {
                list = HmlNationalIdActivity.IconCompatParcelizer;
            }
            onsnapshotready = new onSnapshotReady(str4, onPolylineClickListener, list);
        } else {
            onsnapshotready = null;
        }
        standardStartAndWait read = this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat.read(getActualTypeArguments.read(this.MediaBrowserCompat$ItemReceiver), new GoogleMap.zza(str3, parse, d, onsnapshotready, settransitiontypes.MediaBrowserCompat$ItemReceiver));
        MinMaxPriorityQueue unused2 = this.MediaBrowserCompat$ItemReceiver.MediaMetadataCompat;
        getActualTypeArguments.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, read, MinMaxPriorityQueue.read(settransitiontypes.MediaBrowserCompat$ItemReceiver));
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
