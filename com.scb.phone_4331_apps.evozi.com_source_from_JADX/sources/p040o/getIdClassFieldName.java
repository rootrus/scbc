package p040o;

import p040o.VideoPlayerCameraPlayer;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIdClassFieldName */
public final /* synthetic */ class getIdClassFieldName implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ VideoPlayerCameraPlayer.OnCompleteListener write;

    public /* synthetic */ getIdClassFieldName(VideoPlayerCameraPlayer.OnCompleteListener onCompleteListener) {
        this.write = onCompleteListener;
    }

    public final void IconCompatParcelizer(Object obj) {
        C7107x5505c5d1 getblackstreakmaxheight_mediabrowsercompat_customactionresultreceiver = (C7107x5505c5d1) obj;
        if (this.write.IconCompatParcelizer) {
            getblackstreakmaxheight_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver();
        } else {
            getblackstreakmaxheight_mediabrowsercompat_customactionresultreceiver.read();
        }
    }
}
