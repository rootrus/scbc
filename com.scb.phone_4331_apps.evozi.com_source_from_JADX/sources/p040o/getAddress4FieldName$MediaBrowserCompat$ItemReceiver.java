package p040o;

import p040o.GoogleMap;
import p040o.newOnDeviceIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.getAddress4FieldName$MediaBrowserCompat$ItemReceiver */
public final class getAddress4FieldName$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<newOnDeviceIdExtractor.write> {
    private /* synthetic */ GoogleMap.OnCircleClickListener read;

    public getAddress4FieldName$MediaBrowserCompat$ItemReceiver(GoogleMap.OnCircleClickListener onCircleClickListener) {
        this.read = onCircleClickListener;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        String str;
        newOnDeviceIdExtractor.write write = (newOnDeviceIdExtractor.write) obj;
        onCameraMoveStarted oncameramovestarted = this.read.MediaBrowserCompat$ItemReceiver;
        if (oncameramovestarted == null || (str = oncameramovestarted.MediaBrowserCompat$CustomActionResultReceiver) == null) {
            str = "";
        }
        write.write(str);
    }
}
