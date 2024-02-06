package p040o;

import android.database.sqlite.SQLiteDatabase;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import p040o.nAllocationGetStride;

/* renamed from: o.rsnScriptInvokeV */
public final class rsnScriptInvokeV {
    public float IconCompatParcelizer = Float.NaN;
    public int MediaBrowserCompat$CustomActionResultReceiver = 1122867;
    public FieldPacker$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver = FieldPacker$MediaBrowserCompat$ItemReceiver.DEFAULT;
    public String RatingCompat;
    public DashPathEffect read = null;
    public float write = Float.NaN;

    public rsnScriptInvokeV() {
    }

    /* renamed from: o.rsnScriptInvokeV$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public static final int zxing_custom_possible_result_points = 2131100263;
        public static final int zxing_custom_result_view = 2131100264;
        public static final int zxing_custom_viewfinder_laser = 2131100265;
        public static final int zxing_custom_viewfinder_mask = 2131100266;
        public static final int zxing_possible_result_points = 2131100267;
        public static final int zxing_result_view = 2131100268;
        public static final int zxing_status_text = 2131100269;
        public static final int zxing_transparent = 2131100270;
        public static final int zxing_viewfinder_laser = 2131100271;
        public static final int zxing_viewfinder_mask = 2131100272;
        public float IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        public Matrix MediaBrowserCompat$CustomActionResultReceiver = new Matrix();
        public RectF MediaBrowserCompat$ItemReceiver = new RectF();
        public float MediaBrowserCompat$MediaItem = 1.0f;
        public float MediaBrowserCompat$SearchResultReceiver = 1.0f;
        public float MediaMetadataCompat = 1.0f;
        public float read = 1.0f;
        public float write = BitmapDescriptorFactory.HUE_RED;

        public IconCompatParcelizer() {
            new Matrix();
        }

        public final boolean read(float f) {
            return this.MediaBrowserCompat$ItemReceiver.right >= (((float) ((int) (f * 100.0f))) / 100.0f) - 1.0f;
        }
    }

    /* renamed from: o.rsnScriptInvokeV$read */
    public static final class read implements nAllocationGetStride.write {
        public static final read read = new read();
        public static final int zxing_app_name = 2131761483;
        public static final int zxing_button_ok = 2131761484;
        public static final int zxing_msg_camera_framework_bug = 2131761485;
        public static final int zxing_msg_default_status = 2131761486;

        private read() {
        }

        public final Object read(Object obj) {
            return (List) nAllocationGetStride.MediaBrowserCompat$ItemReceiver(((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), ZGERC.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.rsnScriptInvokeV$write */
    public static final class write implements Long3 {
        public static final write IconCompatParcelizer = new write();
        public static final int zxing_barcode_scanner = 2131494525;
        public static final int zxing_capture = 2131494526;

        public final void onSchedule(Exception exc) {
        }

        private write() {
        }
    }

    public rsnScriptInvokeV(String str, FieldPacker$MediaBrowserCompat$ItemReceiver fieldPacker$MediaBrowserCompat$ItemReceiver, float f, float f2, DashPathEffect dashPathEffect, int i) {
        this.RatingCompat = str;
        this.MediaBrowserCompat$ItemReceiver = fieldPacker$MediaBrowserCompat$ItemReceiver;
        this.write = f;
        this.IconCompatParcelizer = f2;
        this.read = dashPathEffect;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }
}
