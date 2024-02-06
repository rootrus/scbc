package p040o;

import p040o.StandardTable;

/* renamed from: o.CheckCaptureExperience */
public class CheckCaptureExperience extends writeUInt64NoTag<getFaceImageField> {
    /* access modifiers changed from: private */
    public final StandardTable.Column.Values.C38221 MediaBrowserCompat$ItemReceiver;
    public final TokenResponseException write;

    @HmlPinActivity
    public CheckCaptureExperience(RegularImmutableBiMap regularImmutableBiMap, TokenResponseException tokenResponseException, StandardTable.Column.Values.C38221 r3) {
        super(regularImmutableBiMap);
        this.write = tokenResponseException;
        this.MediaBrowserCompat$ItemReceiver = r3;
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(CheckCaptureExperience checkCaptureExperience) {
        if (checkCaptureExperience.RatingCompat != null) {
            checkCaptureExperience.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(CheckCaptureExperience checkCaptureExperience) {
        if (checkCaptureExperience.RatingCompat != null) {
            checkCaptureExperience.RatingCompat.aj_();
        }
    }
}
