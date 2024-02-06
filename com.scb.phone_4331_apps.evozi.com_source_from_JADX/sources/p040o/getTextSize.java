package p040o;

import java.util.List;
import p040o.StandardTable;

/* renamed from: o.getTextSize */
public class getTextSize extends writeUInt64NoTag<getSignatureImageField> {
    public final setHintTextAppearance IconCompatParcelizer;
    public List<addPlace> MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final StandardTable.ColumnKeyIterator read;
    public final setPasswordVisibilityToggleDrawable write;

    @HmlPinActivity
    public getTextSize(setPasswordVisibilityToggleDrawable setpasswordvisibilitytoggledrawable, setHintTextAppearance sethinttextappearance, StandardTable.ColumnKeyIterator columnKeyIterator, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.write = setpasswordvisibilitytoggledrawable;
        this.IconCompatParcelizer = sethinttextappearance;
        this.read = columnKeyIterator;
    }

    public void onDestroy() {
        super.onDestroy();
        setPasswordVisibilityToggleDrawable setpasswordvisibilitytoggledrawable = this.write;
        if (!setpasswordvisibilitytoggledrawable.MediaBrowserCompat$MediaItem.isDisposed()) {
            setpasswordvisibilitytoggledrawable.MediaBrowserCompat$MediaItem.dispose();
        }
        setHintTextAppearance sethinttextappearance = this.IconCompatParcelizer;
        if (!sethinttextappearance.MediaBrowserCompat$MediaItem.isDisposed()) {
            sethinttextappearance.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getTextSize gettextsize) {
        if (gettextsize.RatingCompat != null) {
            gettextsize.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(getTextSize gettextsize) {
        if (gettextsize.RatingCompat != null) {
            gettextsize.RatingCompat.aj_();
        }
    }
}
