package p040o;

import java.util.List;
import p040o.getLastReturnCode;

/* renamed from: o.IsComplete */
public final /* synthetic */ class IsComplete implements getAllowEnterTransitionOverlap {
    private final /* synthetic */ List IconCompatParcelizer;
    private final /* synthetic */ getLastReturnCode.write read;

    public /* synthetic */ IsComplete(getLastReturnCode.write write, List list) {
        this.read = write;
        this.IconCompatParcelizer = list;
    }

    public final Object read(int i) {
        getLastReturnCode.write write = this.read;
        return getLastReturnCode.this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(new synchronizedSortedSetMultimap$MediaBrowserCompat$ItemReceiver((activate) this.IconCompatParcelizer.get(i), write.MediaBrowserCompat$ItemReceiver + i));
    }
}
