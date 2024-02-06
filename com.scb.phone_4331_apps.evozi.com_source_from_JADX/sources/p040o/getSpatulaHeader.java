package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.getCurrentKeyframe;
import p040o.zzwe;

/* renamed from: o.getSpatulaHeader */
public final class getSpatulaHeader extends FragmentBuilder_BindSummaryFragment {
    public final zzwe MediaBrowserCompat$ItemReceiver(getCurrentKeyframe getcurrentkeyframe) {
        onGetStartedClick.write((Object) getcurrentkeyframe, "entity");
        Iterable<getCurrentKeyframe$MediaBrowserCompat$CustomActionResultReceiver> iterable = getcurrentkeyframe.read;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (getCurrentKeyframe$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer : iterable) {
            arrayList.add(IconCompatParcelizer.IconCompatParcelizer());
        }
        List list = (List) arrayList;
        OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver = MediaBrowserCompat$CustomActionResultReceiver(getcurrentkeyframe.MediaBrowserCompat$CustomActionResultReceiver);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "transformStringToDateTim…ty.applicationExpiryDate)");
        getCurrentKeyframe.write write = getcurrentkeyframe.write;
        zzwe.read read = new zzwe.read(write.read, write.IconCompatParcelizer);
        boolean z = true;
        if (getcurrentkeyframe.IconCompatParcelizer != 1) {
            z = false;
        }
        return new zzwe(list, MediaBrowserCompat$CustomActionResultReceiver, read, z);
    }
}
