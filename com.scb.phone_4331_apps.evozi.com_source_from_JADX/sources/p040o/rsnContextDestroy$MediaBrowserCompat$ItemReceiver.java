package p040o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.Set;
import p040o.rsnContextDestroy;
import p040o.setApplyingOpacityToLayersEnabled;

/* renamed from: o.rsnContextDestroy$MediaBrowserCompat$ItemReceiver */
class rsnContextDestroy$MediaBrowserCompat$ItemReceiver {
    private final rsnClosureCreate<T> IconCompatParcelizer;
    private final Set<rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver> MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ rsnContextDestroy read;
    private final LatLng write;

    public rsnContextDestroy$MediaBrowserCompat$ItemReceiver(rsnContextDestroy rsncontextdestroy, rsnClosureCreate<T> rsnclosurecreate, Set<rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver> set, LatLng latLng) {
        this.read = rsncontextdestroy;
        this.IconCompatParcelizer = rsnclosurecreate;
        this.MediaBrowserCompat$CustomActionResultReceiver = set;
        this.write = latLng;
    }

    static /* synthetic */ void IconCompatParcelizer(rsnContextDestroy$MediaBrowserCompat$ItemReceiver rsncontextdestroy_mediabrowsercompat_itemreceiver, rsnContextDestroy.write write2) {
        rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver rsncontextdestroy_mediabrowsercompat_customactionresultreceiver;
        String str;
        rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver rsncontextdestroy_mediabrowsercompat_customactionresultreceiver2;
        if (!(rsncontextdestroy_mediabrowsercompat_itemreceiver.IconCompatParcelizer.write() > rsncontextdestroy_mediabrowsercompat_itemreceiver.read.IconCompatParcelizer)) {
            for (T t : rsncontextdestroy_mediabrowsercompat_itemreceiver.IconCompatParcelizer.read()) {
                Marker marker = rsncontextdestroy_mediabrowsercompat_itemreceiver.read.PlaybackStateCompat.write.get(t);
                if (marker == null) {
                    MarkerOptions markerOptions = new MarkerOptions();
                    LatLng latLng = rsncontextdestroy_mediabrowsercompat_itemreceiver.write;
                    if (latLng != null) {
                        markerOptions.position(latLng);
                    } else {
                        markerOptions.position(t.MediaBrowserCompat$ItemReceiver());
                    }
                    t.IconCompatParcelizer();
                    t.MediaBrowserCompat$CustomActionResultReceiver();
                    markerOptions.title(t.IconCompatParcelizer());
                    markerOptions.snippet(t.MediaBrowserCompat$CustomActionResultReceiver());
                    rsncontextdestroy_mediabrowsercompat_itemreceiver.read.MediaBrowserCompat$ItemReceiver(t, markerOptions);
                    Marker MediaBrowserCompat$CustomActionResultReceiver2 = rsncontextdestroy_mediabrowsercompat_itemreceiver.read.RatingCompat.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(markerOptions);
                    rsncontextdestroy_mediabrowsercompat_customactionresultreceiver2 = new rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2, (byte) 0);
                    rsnContextDestroy.read RatingCompat = rsncontextdestroy_mediabrowsercompat_itemreceiver.read.PlaybackStateCompat;
                    RatingCompat.write.put(t, MediaBrowserCompat$CustomActionResultReceiver2);
                    RatingCompat.IconCompatParcelizer.put(MediaBrowserCompat$CustomActionResultReceiver2, t);
                    LatLng latLng2 = rsncontextdestroy_mediabrowsercompat_itemreceiver.write;
                    if (latLng2 != null) {
                        write2.read(rsncontextdestroy_mediabrowsercompat_customactionresultreceiver2, latLng2, t.MediaBrowserCompat$ItemReceiver());
                    }
                } else {
                    rsncontextdestroy_mediabrowsercompat_customactionresultreceiver2 = new rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver(marker, (byte) 0);
                }
                rsncontextdestroy_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.add(rsncontextdestroy_mediabrowsercompat_customactionresultreceiver2);
            }
            return;
        }
        Marker marker2 = (Marker) rsncontextdestroy_mediabrowsercompat_itemreceiver.read.MediaSessionCompat$Token.get(rsncontextdestroy_mediabrowsercompat_itemreceiver.IconCompatParcelizer);
        if (marker2 == null) {
            MarkerOptions markerOptions2 = new MarkerOptions();
            LatLng latLng3 = rsncontextdestroy_mediabrowsercompat_itemreceiver.write;
            if (latLng3 == null) {
                latLng3 = rsncontextdestroy_mediabrowsercompat_itemreceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
            }
            MarkerOptions position = markerOptions2.position(latLng3);
            rsnContextDestroy rsncontextdestroy = rsncontextdestroy_mediabrowsercompat_itemreceiver.read;
            int write3 = rsncontextdestroy_mediabrowsercompat_itemreceiver.IconCompatParcelizer.write();
            if (write3 > rsnContextDestroy.MediaBrowserCompat$CustomActionResultReceiver[0]) {
                int i = 0;
                while (true) {
                    int[] iArr = rsnContextDestroy.MediaBrowserCompat$CustomActionResultReceiver;
                    if (i >= iArr.length - 1) {
                        write3 = iArr[iArr.length - 1];
                        break;
                    }
                    int i2 = i + 1;
                    if (write3 < iArr[i2]) {
                        write3 = iArr[i];
                        break;
                    }
                    i = i2;
                }
            }
            BitmapDescriptor bitmapDescriptor = rsncontextdestroy.write.get(write3);
            if (bitmapDescriptor == null) {
                Paint paint = rsncontextdestroy.MediaBrowserCompat$ItemReceiver.getPaint();
                float min = 300.0f - Math.min((float) write3, 300.0f);
                paint.setColor(Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f}));
                setApplyingOpacityToLayersEnabled.write write4 = rsncontextdestroy.read;
                if (write3 < rsnContextDestroy.MediaBrowserCompat$CustomActionResultReceiver[0]) {
                    str = String.valueOf(write3);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(String.valueOf(write3));
                    sb.append("+");
                    str = sb.toString();
                }
                TextView textView = write4.write;
                if (textView != null) {
                    textView.setText(str);
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                write4.read.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = write4.read.getMeasuredWidth();
                int measuredHeight = write4.read.getMeasuredHeight();
                write4.read.layout(0, 0, measuredWidth, measuredHeight);
                Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(0);
                write4.read.draw(new Canvas(createBitmap));
                bitmapDescriptor = BitmapDescriptorFactory.fromBitmap(createBitmap);
                rsncontextdestroy.write.put(write3, bitmapDescriptor);
            }
            position.icon(bitmapDescriptor);
            Marker MediaBrowserCompat$CustomActionResultReceiver3 = rsncontextdestroy_mediabrowsercompat_itemreceiver.read.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(position);
            rsncontextdestroy_mediabrowsercompat_itemreceiver.read.AlertController$RecycleListView.put(MediaBrowserCompat$CustomActionResultReceiver3, rsncontextdestroy_mediabrowsercompat_itemreceiver.IconCompatParcelizer);
            rsncontextdestroy_mediabrowsercompat_itemreceiver.read.MediaSessionCompat$Token.put(rsncontextdestroy_mediabrowsercompat_itemreceiver.IconCompatParcelizer, MediaBrowserCompat$CustomActionResultReceiver3);
            rsncontextdestroy_mediabrowsercompat_customactionresultreceiver = new rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver3, (byte) 0);
            LatLng latLng4 = rsncontextdestroy_mediabrowsercompat_itemreceiver.write;
            if (latLng4 != null) {
                write2.read(rsncontextdestroy_mediabrowsercompat_customactionresultreceiver, latLng4, rsncontextdestroy_mediabrowsercompat_itemreceiver.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver());
            }
        } else {
            rsncontextdestroy_mediabrowsercompat_customactionresultreceiver = new rsnContextDestroy$MediaBrowserCompat$CustomActionResultReceiver(marker2, (byte) 0);
        }
        rsncontextdestroy_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver.add(rsncontextdestroy_mediabrowsercompat_customactionresultreceiver);
    }
}
