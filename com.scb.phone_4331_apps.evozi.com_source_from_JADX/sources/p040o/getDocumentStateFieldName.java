package p040o;

import p040o.VideoPlayerCameraPlayer;
import p040o.access$2300;
import p040o.getBlackStreakMaxHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.getDocumentStateFieldName */
public final /* synthetic */ class getDocumentStateFieldName implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;
    private final /* synthetic */ VideoPlayerCameraPlayer.C3943b MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getSignal MediaBrowserCompat$SearchResultReceiver;
    private final /* synthetic */ String read;
    private final /* synthetic */ String write;

    public /* synthetic */ getDocumentStateFieldName(VideoPlayerCameraPlayer.C3943b bVar, String str, String str2, String str3, String str4, getSignal getsignal) {
        this.MediaBrowserCompat$CustomActionResultReceiver = bVar;
        this.IconCompatParcelizer = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.read = str4;
        this.MediaBrowserCompat$SearchResultReceiver = getsignal;
    }

    public final void IconCompatParcelizer(Object obj) {
        VideoPlayerCameraPlayer.C3943b bVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.IconCompatParcelizer;
        String str2 = this.write;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        String str4 = this.read;
        getSignal getsignal = this.MediaBrowserCompat$SearchResultReceiver;
        access$2300 access_2300 = new access$2300();
        getEyesFieldName geteyesfieldname = new getEyesFieldName(bVar, getsignal);
        access_2300.read = access$2300.write.CUSTOM;
        access_2300.MediaBrowserCompat$CustomActionResultReceiver = geteyesfieldname;
        ((getBlackStreakMaxHeight.read) obj).MediaBrowserCompat$CustomActionResultReceiver(str, str2, str3, str4, access_2300);
    }
}
