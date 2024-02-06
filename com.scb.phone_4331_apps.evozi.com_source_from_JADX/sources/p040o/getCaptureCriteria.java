package p040o;

import p040o.AbstractMapBasedMultiset;

/* renamed from: o.getCaptureCriteria */
public class getCaptureCriteria extends writeUInt64NoTag<PassportExtractor_MembersInjector> {
    public final replaceValues IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    final toLongArray read;
    private final AbstractMapBasedMultiset.EntrySet.C30061.C30071 write;

    @HmlPinActivity
    public getCaptureCriteria(RegularImmutableBiMap regularImmutableBiMap, AbstractMapBasedMultiset.EntrySet.C30061.C30071 r2, toLongArray tolongarray, replaceValues replacevalues) {
        super(regularImmutableBiMap);
        this.write = r2;
        this.read = tolongarray;
        this.IconCompatParcelizer = replacevalues;
    }

    public void onDestroy() {
        AbstractMapBasedMultiset.EntrySet.C30061.C30071 r0 = this.write;
        if (!r0.MediaBrowserCompat$MediaItem.isDisposed()) {
            r0.MediaBrowserCompat$MediaItem.dispose();
        }
        replaceValues replacevalues = this.IconCompatParcelizer;
        if (!replacevalues.MediaBrowserCompat$MediaItem.isDisposed()) {
            replacevalues.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getCaptureCriteria getcapturecriteria) {
        if (getcapturecriteria.RatingCompat != null) {
            getcapturecriteria.RatingCompat.aj_();
        }
    }
}
