package p040o;

import java.net.URL;
import p040o.translate;

/* renamed from: o.rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver */
public final class rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver implements isUseNative {
    public static final int centerCrop = 2131297007;
    public static final int fitCenter = 2131297766;
    public static final int fitXY = 2131297767;
    public static final rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver read = new rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver();
    public static final int zxing_back_button = 2131302373;
    public static final int zxing_barcode_scanner = 2131302374;
    public static final int zxing_barcode_surface = 2131302375;
    public static final int zxing_camera_closed = 2131302376;
    public static final int zxing_camera_error = 2131302377;
    public static final int zxing_decode = 2131302378;
    public static final int zxing_decode_failed = 2131302379;
    public static final int zxing_decode_succeeded = 2131302380;
    public static final int zxing_possible_result_points = 2131302381;
    public static final int zxing_preview_failed = 2131302382;
    public static final int zxing_prewiew_size_ready = 2131302383;
    public static final int zxing_status_view = 2131302384;
    public static final int zxing_viewfinder_view = 2131302385;

    private rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final Object MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
        translate.read read2 = (translate.read) obj;
        translate$MediaBrowserCompat$ItemReceiver translate_mediabrowsercompat_itemreceiver = (translate$MediaBrowserCompat$ItemReceiver) obj2;
        URL url = translate_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
        if (url == null) {
            return null;
        }
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver("CctTransportBackend", "Following redirect to: %s", (Object) url);
        return new translate.read(translate_mediabrowsercompat_itemreceiver.IconCompatParcelizer, read2.MediaBrowserCompat$ItemReceiver, read2.write);
    }
}
