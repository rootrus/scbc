package p040o;

import p040o.MapFragment;

/* renamed from: o.parent */
public final /* synthetic */ class parent implements findFragmentByWho {
    private final /* synthetic */ lexicographicalComparator IconCompatParcelizer;
    private final /* synthetic */ boolean write;

    public /* synthetic */ parent(lexicographicalComparator lexicographicalcomparator, boolean z) {
        this.IconCompatParcelizer = lexicographicalcomparator;
        this.write = z;
    }

    public final Object IconCompatParcelizer(Object obj) {
        return lexicographicalComparator.MediaBrowserCompat$ItemReceiver((MapFragment.zzb) obj, this.write);
    }
}
