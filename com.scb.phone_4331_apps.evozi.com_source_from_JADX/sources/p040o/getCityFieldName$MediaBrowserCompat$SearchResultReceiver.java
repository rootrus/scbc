package p040o;

import kotlin.NoWhenBranchMatchedException;
import p040o.getCityFieldName;

/* renamed from: o.getCityFieldName$MediaBrowserCompat$SearchResultReceiver */
public final class getCityFieldName$MediaBrowserCompat$SearchResultReceiver {
    private /* synthetic */ getCityFieldName MediaBrowserCompat$CustomActionResultReceiver;

    public getCityFieldName$MediaBrowserCompat$SearchResultReceiver(getCityFieldName getcityfieldname) {
        this.MediaBrowserCompat$CustomActionResultReceiver = getcityfieldname;
    }

    public final getCityFieldName.RatingCompat read(generateBinaryImagesJsonString generatebinaryimagesjsonstring, getLibraryFile getlibraryfile) {
        onGetStartedClick.write((Object) generatebinaryimagesjsonstring, "type");
        onGetStartedClick.write((Object) getlibraryfile, "flow");
        if (generatebinaryimagesjsonstring == generateBinaryImagesJsonString.MARKETING_CONSENT) {
            int i = getAddress5FieldName.MediaBrowserCompat$ItemReceiver[getlibraryfile.ordinal()];
            if (i == 1) {
                return new getCityFieldName$MediaBrowserCompat$MediaItem(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            if (i == 2) {
                return new getCityFieldName.MediaDescriptionCompat();
            }
            if (i == 3) {
                return new getCityFieldName.MediaMetadataCompat();
            }
            throw new NoWhenBranchMatchedException();
        } else if (generatebinaryimagesjsonstring != generateBinaryImagesJsonString.CROSS_SELL_CONSENT) {
            return new getCityFieldName$MediaBrowserCompat$MediaItem(this.MediaBrowserCompat$CustomActionResultReceiver);
        } else {
            int i2 = getAddress5FieldName.MediaBrowserCompat$CustomActionResultReceiver[getlibraryfile.ordinal()];
            if (i2 == 1) {
                return new getCityFieldName$MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            if (i2 == 2) {
                return new getCityFieldName.read();
            }
            if (i2 == 3) {
                return new getCityFieldName$MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
