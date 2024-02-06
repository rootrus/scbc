package p040o;

import p040o.VideoPlayerCameraPlayer;
import p040o.access$2300;
import p040o.getBlackStreakMaxHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDocumentVerificationConfidenceFieldName */
public final /* synthetic */ class getDocumentVerificationConfidenceFieldName implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ VideoPlayerCameraPlayer.C3943b.C39453 IconCompatParcelizer;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ getDocumentVerificationConfidenceFieldName(VideoPlayerCameraPlayer.C3943b.C39453 r1, Throwable th) {
        this.IconCompatParcelizer = r1;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        VideoPlayerCameraPlayer.C3943b.C39453 r0 = this.IconCompatParcelizer;
        ((getBlackStreakMaxHeight.read) obj).read(VideoPlayerCameraPlayer.C3943b.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
