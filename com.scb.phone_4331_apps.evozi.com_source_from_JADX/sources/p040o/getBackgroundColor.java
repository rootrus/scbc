package p040o;

import p040o.StandardTable;

/* renamed from: o.getBackgroundColor */
public class getBackgroundColor extends writeUInt64NoTag<PassportWorkflowActivity> {
    public setCountry IconCompatParcelizer;
    public final setHelperTextEnabled MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final StandardTable.Column.Values read;
    public final PlayCoreMissingSplitsActivity write;

    @HmlPinActivity
    public getBackgroundColor(setHelperTextEnabled sethelpertextenabled, PlayCoreMissingSplitsActivity playCoreMissingSplitsActivity, StandardTable.Column.Values values, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$ItemReceiver = sethelpertextenabled;
        this.write = playCoreMissingSplitsActivity;
        this.read = values;
    }

    public void onDestroy() {
        super.onDestroy();
        setHelperTextEnabled sethelpertextenabled = this.MediaBrowserCompat$ItemReceiver;
        if (!sethelpertextenabled.MediaBrowserCompat$MediaItem.isDisposed()) {
            sethelpertextenabled.MediaBrowserCompat$MediaItem.dispose();
        }
        PlayCoreMissingSplitsActivity playCoreMissingSplitsActivity = this.write;
        if (!playCoreMissingSplitsActivity.MediaBrowserCompat$MediaItem.isDisposed()) {
            playCoreMissingSplitsActivity.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getBackgroundColor getbackgroundcolor) {
        if (getbackgroundcolor.RatingCompat != null) {
            getbackgroundcolor.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(getBackgroundColor getbackgroundcolor) {
        if (getbackgroundcolor.RatingCompat != null) {
            getbackgroundcolor.RatingCompat.aj_();
        }
    }
}
