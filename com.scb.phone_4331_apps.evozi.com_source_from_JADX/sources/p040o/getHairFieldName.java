package p040o;

import java.util.List;
import p040o.VideoPlayerCameraPlayer;
import p040o.writeUInt64NoTag;

/* renamed from: o.getHairFieldName */
public final /* synthetic */ class getHairFieldName implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ VideoPlayerCameraPlayer.OnCompleteListener IconCompatParcelizer;
    private final /* synthetic */ List write;

    public /* synthetic */ getHairFieldName(VideoPlayerCameraPlayer.OnCompleteListener onCompleteListener, List list) {
        this.IconCompatParcelizer = onCompleteListener;
        this.write = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        C7107x5505c5d1 getblackstreakmaxheight_mediabrowsercompat_customactionresultreceiver = (C7107x5505c5d1) obj;
        getblackstreakmaxheight_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(this.write, this.IconCompatParcelizer.IconCompatParcelizer);
    }
}
