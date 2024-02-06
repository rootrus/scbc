package p040o;

import p040o.VideoPlayerCameraPlayer;
import p040o.getBlackStreakMaxHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.getFaceImageFieldName */
public final /* synthetic */ class getFaceImageFieldName implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ VideoPlayerCameraPlayer.C3943b.C39464 IconCompatParcelizer;

    public /* synthetic */ getFaceImageFieldName(VideoPlayerCameraPlayer.C3943b.C39464 r1) {
        this.IconCompatParcelizer = r1;
    }

    public final void IconCompatParcelizer(Object obj) {
        getBlackStreakMaxHeight.read read = (getBlackStreakMaxHeight.read) obj;
        read.IconCompatParcelizer(VideoPlayerCameraPlayer.C3943b.this.IconCompatParcelizer);
        read.IconCompatParcelizer();
    }
}
