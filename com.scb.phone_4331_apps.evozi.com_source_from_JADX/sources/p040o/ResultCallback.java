package p040o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.ResultCallback */
public final class ResultCallback extends notifyCompletion {
    public final setOnMyLocationButtonClickListener MediaBrowserCompat$CustomActionResultReceiver(TiffProcessingException tiffProcessingException) {
        double d;
        List list;
        setOnMyLocationButtonClickListener write = setOnMyLocationButtonClickListener.write();
        write.MediaBrowserCompat$MediaItem = tiffProcessingException.read;
        write.MediaBrowserCompat$SearchResultReceiver = setOnMyLocationChangeListener.read(tiffProcessingException.MediaBrowserCompat$MediaItem);
        if (tiffProcessingException.write != null) {
            d = tiffProcessingException.write.doubleValue();
        } else {
            d = 0.0d;
        }
        write.write = Double.valueOf(d);
        getDeviceMetaData getdevicemetadata = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (tiffProcessingException.MediaBrowserCompat$ItemReceiver != null) {
            list = tiffProcessingException.MediaBrowserCompat$ItemReceiver;
        } else {
            list = new ArrayList();
        }
        write.MediaBrowserCompat$CustomActionResultReceiver = getdevicemetadata.MediaBrowserCompat$ItemReceiver(list);
        return write;
    }
}
