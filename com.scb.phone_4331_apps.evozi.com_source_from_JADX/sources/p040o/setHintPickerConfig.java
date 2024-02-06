package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: o.setHintPickerConfig */
public final class setHintPickerConfig extends FragmentBuilder_BindSummaryFragment {
    public static LtfSummaryAdapter$ParentViewHolder read(fromInputStreamSync frominputstreamsync) {
        int i = frominputstreamsync.IconCompatParcelizer;
        String str = frominputstreamsync.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = frominputstreamsync.read;
        Iterable<fromAsset> iterable = frominputstreamsync.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (fromAsset fromasset : iterable) {
            int i3 = fromasset.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = fromasset.read;
            String str3 = fromasset.write;
            if (str3 == null) {
                str3 = "";
            }
            arrayList.add(new UnselectedTileAdapter$Holder(i3, str2, str3, fromasset.IconCompatParcelizer));
        }
        return new LtfSummaryAdapter$ParentViewHolder(i, str, i2, (List) arrayList);
    }
}
