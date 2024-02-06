package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.C10821Element;

/* renamed from: o.addToPack */
public final class addToPack extends C10821Element.DataKind {
    public read AlertController$RecycleListView;
    private float AppCompatActivity;
    private float Keep;
    public addToPack$MediaBrowserCompat$ItemReceiver PlaybackStateCompat;
    public boolean PlaybackStateCompat$CustomAction;
    public boolean setHasDecor;

    /* renamed from: o.addToPack$read */
    public enum read {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public addToPack() {
        this.PlaybackStateCompat$CustomAction = true;
        this.setHasDecor = true;
        this.AppCompatActivity = 10.0f;
        this.Keep = 10.0f;
        this.AlertController$RecycleListView = read.OUTSIDE_CHART;
        this.PlaybackStateCompat = addToPack$MediaBrowserCompat$ItemReceiver.LEFT;
        this.f2542x50fd9e4a = BitmapDescriptorFactory.HUE_RED;
    }

    public addToPack(addToPack$MediaBrowserCompat$ItemReceiver addtopack_mediabrowsercompat_itemreceiver) {
        this.PlaybackStateCompat$CustomAction = true;
        this.setHasDecor = true;
        this.AppCompatActivity = 10.0f;
        this.Keep = 10.0f;
        this.AlertController$RecycleListView = read.OUTSIDE_CHART;
        this.PlaybackStateCompat = addtopack_mediabrowsercompat_itemreceiver;
        this.f2542x50fd9e4a = BitmapDescriptorFactory.HUE_RED;
    }

    public final void MediaBrowserCompat$ItemReceiver(float f, float f2) {
        if (Math.abs(f2 - f) == BitmapDescriptorFactory.HUE_RED) {
            f2 += 1.0f;
            f -= 1.0f;
        }
        float abs = Math.abs(f2 - f) / 100.0f;
        this.IconCompatParcelizer = f - (this.Keep * abs);
        this.MediaBrowserCompat$CustomActionResultReceiver = f2 + (abs * this.AppCompatActivity);
        this.write = Math.abs(this.IconCompatParcelizer - this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
