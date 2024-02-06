package p040o;

import java.util.ArrayList;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;

/* renamed from: o.LifecycleFragment */
public final class LifecycleFragment extends FragmentBuilder_BindSummaryFragment {
    public final onStreetViewPanoramaLongClick MediaBrowserCompat$CustomActionResultReceiver(isLimitAdTrackingEnabled islimitadtrackingenabled) {
        onStreetViewPanoramaLongClick write = onStreetViewPanoramaLongClick.write();
        write.MediaBrowserCompat$SearchResultReceiver = islimitadtrackingenabled.IconCompatParcelizer;
        write.f5555x50fd9e4a = FragmentBuilder_BindSummaryFragment.write(islimitadtrackingenabled.write, (OffsetDateTime) null);
        write.write = new setOnCameraMoveStartedListener(IconCompatParcelizer(islimitadtrackingenabled.MediaBrowserCompat$ItemReceiver));
        return write;
    }

    private static List<setOnIndoorStateChangeListener> IconCompatParcelizer(addPoints addpoints) {
        ArrayList arrayList = new ArrayList();
        if (!(addpoints == null || addpoints.MediaBrowserCompat$CustomActionResultReceiver == null || addpoints.MediaBrowserCompat$CustomActionResultReceiver.isEmpty())) {
            for (Utils next : addpoints.MediaBrowserCompat$CustomActionResultReceiver) {
                arrayList.add(new setOnIndoorStateChangeListener(next.IconCompatParcelizer, next.MediaBrowserCompat$ItemReceiver, next.read, next.RatingCompat, next.write, next.MediaBrowserCompat$CustomActionResultReceiver));
            }
        }
        return arrayList;
    }
}
