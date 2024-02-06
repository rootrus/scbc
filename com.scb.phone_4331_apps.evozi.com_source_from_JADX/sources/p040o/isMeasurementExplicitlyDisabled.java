package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.isMeasurementExplicitlyDisabled */
public final class isMeasurementExplicitlyDisabled extends FragmentBuilder_BindSummaryFragment {
    public static List<animateTo> MediaBrowserCompat$ItemReceiver(List<setShowDivider> list) {
        if (list == null) {
            return null;
        }
        Iterable<setShowDivider> iterable = list;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList = new ArrayList(i);
        for (setShowDivider setshowdivider : iterable) {
            arrayList.add(new animateTo(setshowdivider.MediaBrowserCompat$CustomActionResultReceiver, setshowdivider.IconCompatParcelizer, setshowdivider.read, setshowdivider.MediaBrowserCompat$ItemReceiver, setshowdivider.write));
        }
        return (List) arrayList;
    }
}
