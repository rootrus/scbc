package p040o;

import p040o.CharMatcher;

/* renamed from: o.removeOnTaskCompletedListener */
public class removeOnTaskCompletedListener extends writeUInt64NoTag<IIdExtractionListener> {
    public CharMatcher.C31669 IconCompatParcelizer;
    public double MediaBrowserCompat$ItemReceiver = 1.0d;
    public boolean MediaBrowserCompat$SearchResultReceiver = true;
    /* access modifiers changed from: private */
    public TreeMultimap MediaDescriptionCompat;
    boolean MediaMetadataCompat = false;
    public double read = 500000.0d;
    public CharMatcher.LookupTable write;

    @HmlPinActivity
    public removeOnTaskCompletedListener(CharMatcher.LookupTable lookupTable, CharMatcher.C31669 r4, TreeMultimap treeMultimap, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.write = lookupTable;
        this.IconCompatParcelizer = r4;
        this.MediaDescriptionCompat = treeMultimap;
    }

    static /* synthetic */ void write(IIdExtractionListener iIdExtractionListener) {
        iIdExtractionListener.IconCompatParcelizer();
        iIdExtractionListener.MediaBrowserCompat$CustomActionResultReceiver(true);
    }

    public final void read(double d) {
        boolean z = true;
        this.MediaMetadataCompat = d >= this.MediaBrowserCompat$ItemReceiver && d <= this.read;
        countRows countrows = new countRows(this);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            countrows.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(removeOnTaskCompletedListener removeontaskcompletedlistener) {
        if (removeontaskcompletedlistener.RatingCompat != null) {
            removeontaskcompletedlistener.RatingCompat.aj_();
        }
    }
}
