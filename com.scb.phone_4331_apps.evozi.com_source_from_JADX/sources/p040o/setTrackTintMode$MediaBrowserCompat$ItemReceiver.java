package p040o;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import p040o.setTrackTintMode;

/* renamed from: o.setTrackTintMode$MediaBrowserCompat$ItemReceiver */
class setTrackTintMode$MediaBrowserCompat$ItemReceiver implements Runnable {
    final /* synthetic */ setTrackTintMode read;

    setTrackTintMode$MediaBrowserCompat$ItemReceiver(setTrackTintMode settracktintmode) {
        this.read = settracktintmode;
    }

    public final void run() {
        if (this.read.MediaBrowserCompat$CustomActionResultReceiver) {
            if (this.read.write) {
                this.read.write = false;
                setTrackTintMode.IconCompatParcelizer iconCompatParcelizer = this.read.read;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = currentAnimationTimeMillis;
                iconCompatParcelizer.RatingCompat = -1;
                iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = currentAnimationTimeMillis;
                iconCompatParcelizer.MediaDescriptionCompat = 0.5f;
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = 0;
                iconCompatParcelizer.write = 0;
            }
            setTrackTintMode.IconCompatParcelizer iconCompatParcelizer2 = this.read.read;
            if ((iconCompatParcelizer2.RatingCompat > 0 && AnimationUtils.currentAnimationTimeMillis() > iconCompatParcelizer2.RatingCompat + ((long) iconCompatParcelizer2.IconCompatParcelizer)) || !this.read.write()) {
                this.read.MediaBrowserCompat$CustomActionResultReceiver = false;
                return;
            }
            if (this.read.IconCompatParcelizer) {
                this.read.IconCompatParcelizer = false;
                setTrackTintMode settracktintmode = this.read;
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
                settracktintmode.MediaBrowserCompat$MediaItem.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver != 0) {
                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float MediaBrowserCompat$ItemReceiver = iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(currentAnimationTimeMillis2);
                long j = iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver;
                iconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = currentAnimationTimeMillis2;
                float f = ((float) (currentAnimationTimeMillis2 - j)) * ((-4.0f * MediaBrowserCompat$ItemReceiver * MediaBrowserCompat$ItemReceiver) + (MediaBrowserCompat$ItemReceiver * 4.0f));
                iconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = (int) (iconCompatParcelizer2.MediaBrowserCompat$MediaItem * f);
                iconCompatParcelizer2.write = (int) (f * iconCompatParcelizer2.ParcelableVolumeInfo);
                this.read.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer2.write);
                SwitchCompat.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$MediaItem, (Runnable) this);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }
    }
}
