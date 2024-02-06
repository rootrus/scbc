package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@HmlSetNTBPinActivity
/* renamed from: o.synchronizedMultimap$MediaBrowserCompat$ItemReceiver */
public final class synchronizedMultimap$MediaBrowserCompat$ItemReceiver {
    private synchronizedMultimap$MediaBrowserCompat$ItemReceiver() {
    }

    @HmlPinActivity
    public synchronizedMultimap$MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindUnlinkAccountFragment fragmentBuilder_BindUnlinkAccountFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindUnlinkAccountFragment, "debitCardInfoEntityMapper");
    }

    public static getFadeIn IconCompatParcelizer(setRepeatMode setrepeatmode) {
        int i;
        onGetStartedClick.write((Object) setrepeatmode, "entity");
        String str = setrepeatmode.read;
        Iterable<updateBitmap> iterable = setrepeatmode.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
        for (updateBitmap MediaBrowserCompat$ItemReceiver : iterable) {
            arrayList.add(FragmentBuilder_BindUnlinkAccountFragment.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver));
        }
        List list = (List) arrayList;
        Integer num = setrepeatmode.write;
        boolean z = num != null && num.intValue() == 1;
        Integer num2 = setrepeatmode.IconCompatParcelizer;
        boolean z2 = num2 != null && num2.intValue() == 1;
        Integer num3 = setrepeatmode.MediaBrowserCompat$ItemReceiver;
        if (num3 != null) {
            i = num3.intValue();
        } else {
            i = 0;
        }
        return new getFadeIn(str, list, (String) null, z, z2, i, 4);
    }
}
