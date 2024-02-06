package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import java.io.InputStream;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p040o.IdWorkflowActivity;

/* renamed from: o.DSYR2 */
public class DSYR2 implements IdWorkflowActivity.C69161 {
    private final ReadWriteLock IconCompatParcelizer;
    private final Bitmap.Config MediaBrowserCompat$CustomActionResultReceiver;
    private BitmapRegionDecoder MediaBrowserCompat$ItemReceiver;

    public DSYR2() {
        this((byte) 0);
    }

    private DSYR2(byte b) {
        this.IconCompatParcelizer = new ReentrantReadWriteLock(true);
        Bitmap.Config IconCompatParcelizer2 = SubsamplingScaleImageView.IconCompatParcelizer();
        if (IconCompatParcelizer2 != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        } else {
            this.MediaBrowserCompat$CustomActionResultReceiver = Bitmap.Config.RGB_565;
        }
    }

    public final Point MediaBrowserCompat$ItemReceiver(Context context, Uri uri) throws Exception {
        Resources resources;
        int i;
        String obj = uri.toString();
        if (obj.startsWith("android.resource://")) {
            String authority = uri.getAuthority();
            if (context.getPackageName().equals(authority)) {
                resources = context.getResources();
            } else {
                resources = context.getPackageManager().getResourcesForApplication(authority);
            }
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size != 2 || !pathSegments.get(0).equals("drawable")) {
                if (size == 1 && TextUtils.isDigitsOnly(pathSegments.get(0))) {
                    try {
                        i = Integer.parseInt(pathSegments.get(0));
                    } catch (NumberFormatException unused) {
                    }
                }
                i = 0;
            } else {
                i = resources.getIdentifier(pathSegments.get(1), "drawable", authority);
            }
            this.MediaBrowserCompat$ItemReceiver = BitmapRegionDecoder.newInstance(context.getResources().openRawResource(i), false);
        } else if (obj.startsWith("file:///android_asset/")) {
            this.MediaBrowserCompat$ItemReceiver = BitmapRegionDecoder.newInstance(context.getAssets().open(obj.substring(22), 1), false);
        } else if (obj.startsWith("file://")) {
            this.MediaBrowserCompat$ItemReceiver = BitmapRegionDecoder.newInstance(obj.substring(7), false);
        } else {
            InputStream inputStream = null;
            try {
                inputStream = context.getContentResolver().openInputStream(uri);
                this.MediaBrowserCompat$ItemReceiver = BitmapRegionDecoder.newInstance(inputStream, false);
            } finally {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Exception unused2) {
                    }
                }
            }
        }
        return new Point(this.MediaBrowserCompat$ItemReceiver.getWidth(), this.MediaBrowserCompat$ItemReceiver.getHeight());
    }

    public final boolean IconCompatParcelizer() {
        boolean z;
        synchronized (this) {
            z = this.MediaBrowserCompat$ItemReceiver != null && !this.MediaBrowserCompat$ItemReceiver.isRecycled();
        }
        return z;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        synchronized (this) {
            this.IconCompatParcelizer.writeLock().lock();
            try {
                this.MediaBrowserCompat$ItemReceiver.recycle();
                this.MediaBrowserCompat$ItemReceiver = null;
            } finally {
                this.IconCompatParcelizer.writeLock().unlock();
            }
        }
    }

    public final Bitmap MediaBrowserCompat$CustomActionResultReceiver(Rect rect, int i) {
        Lock lock;
        Lock lock2;
        int i2;
        if (Build.VERSION.SDK_INT < 21) {
            lock = this.IconCompatParcelizer.writeLock();
        } else {
            lock = this.IconCompatParcelizer.readLock();
        }
        lock.lock();
        try {
            if (this.MediaBrowserCompat$ItemReceiver == null || this.MediaBrowserCompat$ItemReceiver.isRecycled()) {
                throw new IllegalStateException("Cannot decode region after decoder has been recycled");
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = i;
            options.inPreferredConfig = this.MediaBrowserCompat$CustomActionResultReceiver;
            Bitmap decodeRegion = this.MediaBrowserCompat$ItemReceiver.decodeRegion(rect, options);
            if (decodeRegion != null) {
                if (i2 >= 21) {
                    Lock readLock = this.IconCompatParcelizer.readLock();
                }
                return decodeRegion;
            }
            throw new RuntimeException("Skia image decoder returned null bitmap - image format may not be supported");
        } finally {
            if (Build.VERSION.SDK_INT < 21) {
                lock2 = this.IconCompatParcelizer.writeLock();
            } else {
                lock2 = this.IconCompatParcelizer.readLock();
            }
            lock2.unlock();
        }
    }
}
