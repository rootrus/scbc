package p040o;

import p040o.CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory;

/* renamed from: o.logBadConfigError */
public class logBadConfigError extends writeUInt64NoTag<CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory.IconCompatParcelizer> {
    public final doGoAsync IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final Chars read;

    @HmlPinActivity
    public logBadConfigError(doGoAsync dogoasync, RegularImmutableBiMap regularImmutableBiMap, Chars chars) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = dogoasync;
        this.read = chars;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(logBadConfigError logbadconfigerror) {
        if (logbadconfigerror.RatingCompat != null) {
            logbadconfigerror.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        doGoAsync dogoasync = this.IconCompatParcelizer;
        if (!dogoasync.MediaBrowserCompat$MediaItem.isDisposed()) {
            dogoasync.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }
}
