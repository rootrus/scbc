package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.setImageJpegQuality$MediaSessionCompat$ResultReceiverWrapper */
final class setImageJpegQuality$MediaSessionCompat$ResultReceiverWrapper<V> implements writeUInt64NoTag.IconCompatParcelizer<RttiIdExtractor> {
    private /* synthetic */ setImageJpegQuality MediaBrowserCompat$CustomActionResultReceiver;

    setImageJpegQuality$MediaSessionCompat$ResultReceiverWrapper(setImageJpegQuality setimagejpegquality) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setimagejpegquality;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        RttiIdExtractor rttiIdExtractor = (RttiIdExtractor) obj;
        List<? extends onCrashlyticsOriginEvent> list = this.MediaBrowserCompat$CustomActionResultReceiver.write;
        if (list == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("displayList");
        }
        rttiIdExtractor.IconCompatParcelizer(list);
    }
}
