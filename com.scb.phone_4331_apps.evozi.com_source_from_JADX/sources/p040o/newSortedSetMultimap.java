package p040o;

import java.util.List;
import p040o.Multimaps;

/* renamed from: o.newSortedSetMultimap */
public final /* synthetic */ class newSortedSetMultimap implements getAllowEnterTransitionOverlap {
    private final /* synthetic */ unmodifiableEntries IconCompatParcelizer;
    private final /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ newSortedSetMultimap(unmodifiableEntries unmodifiableentries, List list) {
        this.IconCompatParcelizer = unmodifiableentries;
        this.MediaBrowserCompat$CustomActionResultReceiver = list;
    }

    public final Object read(int i) {
        unmodifiableEntries unmodifiableentries = this.IconCompatParcelizer;
        List list = this.MediaBrowserCompat$CustomActionResultReceiver;
        Multimaps.C36703 r0 = unmodifiableentries.read;
        Multimaps$3$MediaBrowserCompat$CustomActionResultReceiver multimaps$3$MediaBrowserCompat$CustomActionResultReceiver = new Multimaps$3$MediaBrowserCompat$CustomActionResultReceiver((setAnchor) list.get(i), i);
        return r0.read(multimaps$3$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, multimaps$3$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
    }
}
