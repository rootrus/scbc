package p040o;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Set;

/* renamed from: o.requireActivity */
public final class requireActivity implements CheckParameters_MembersInjector {
    private static final Bitmap.Config MediaBrowserCompat$ItemReceiver = Bitmap.Config.ARGB_8888;
    private int IconCompatParcelizer;
    private final Set<Bitmap.Config> MediaBrowserCompat$CustomActionResultReceiver;
    private int MediaBrowserCompat$MediaItem;
    private final getCheckUsabilityData MediaBrowserCompat$SearchResultReceiver;
    private long MediaDescriptionCompat;
    private int RatingCompat;
    private int read;
    private long write;

    private requireActivity(long j, getCheckUsabilityData getcheckusabilitydata, Set<Bitmap.Config> set) {
        this.MediaDescriptionCompat = j;
        this.MediaBrowserCompat$SearchResultReceiver = getcheckusabilitydata;
        this.MediaBrowserCompat$CustomActionResultReceiver = set;
    }

    public final void write(Bitmap bitmap) {
        synchronized (this) {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            } else if (!bitmap.isRecycled()) {
                if (bitmap.isMutable() && ((long) this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(bitmap)) <= this.MediaDescriptionCompat) {
                    if (this.MediaBrowserCompat$CustomActionResultReceiver.contains(bitmap.getConfig())) {
                        int IconCompatParcelizer2 = this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(bitmap);
                        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(bitmap);
                        this.MediaBrowserCompat$MediaItem++;
                        this.write += (long) IconCompatParcelizer2;
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Put bitmap in pool=");
                            sb.append(this.MediaBrowserCompat$SearchResultReceiver.write(bitmap));
                            Log.v("LruBitmapPool", sb.toString());
                        }
                        if (Log.isLoggable("LruBitmapPool", 2)) {
                            IconCompatParcelizer();
                        }
                        read();
                        return;
                    }
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Reject bitmap from pool, bitmap: ");
                    sb2.append(this.MediaBrowserCompat$SearchResultReceiver.write(bitmap));
                    sb2.append(", is mutable: ");
                    sb2.append(bitmap.isMutable());
                    sb2.append(", is allowed config: ");
                    sb2.append(this.MediaBrowserCompat$CustomActionResultReceiver.contains(bitmap.getConfig()));
                    Log.v("LruBitmapPool", sb2.toString());
                }
                bitmap.recycle();
            } else {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
        }
    }

    private void read() {
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat);
    }

    public final Bitmap IconCompatParcelizer(int i, int i2, Bitmap.Config config) {
        Bitmap write2 = write(i, i2, config);
        if (write2 != null) {
            write2.eraseColor(0);
            return write2;
        }
        if (config == null) {
            config = MediaBrowserCompat$ItemReceiver;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final Bitmap MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, Bitmap.Config config) {
        Bitmap write2 = write(i, i2, config);
        if (write2 != null) {
            return write2;
        }
        if (config == null) {
            config = MediaBrowserCompat$ItemReceiver;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        MediaBrowserCompat$CustomActionResultReceiver(0);
    }

    public final void read(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("trimMemory, level=");
            sb.append(i);
            Log.d("LruBitmapPool", sb.toString());
        }
        if (i >= 40 || (Build.VERSION.SDK_INT >= 23 && i >= 20)) {
            MediaBrowserCompat$ItemReceiver();
        } else if (i >= 20 || i == 15) {
            MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat / 2);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(long j) {
        synchronized (this) {
            while (this.write > j) {
                Bitmap MediaBrowserCompat$ItemReceiver2 = this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver();
                if (MediaBrowserCompat$ItemReceiver2 == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        IconCompatParcelizer();
                    }
                    this.write = 0;
                    return;
                }
                this.write -= (long) this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2);
                this.IconCompatParcelizer++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Evicting bitmap=");
                    sb.append(this.MediaBrowserCompat$SearchResultReceiver.write(MediaBrowserCompat$ItemReceiver2));
                    Log.d("LruBitmapPool", sb.toString());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    IconCompatParcelizer();
                }
                MediaBrowserCompat$ItemReceiver2.recycle();
            }
        }
    }

    private void IconCompatParcelizer() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hits=");
        sb.append(this.read);
        sb.append(", misses=");
        sb.append(this.RatingCompat);
        sb.append(", puts=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", evictions=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", currentSize=");
        sb.append(this.write);
        sb.append(", maxSize=");
        sb.append(this.MediaDescriptionCompat);
        sb.append("\nStrategy=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        Log.v("LruBitmapPool", sb.toString());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public requireActivity(long r5) {
        /*
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r0 < r1) goto L_0x000c
            o.requireContext r0 = new o.requireContext
            r0.<init>()
            goto L_0x0011
        L_0x000c:
            o.performPrepareOptionsMenu r0 = new o.performPrepareOptionsMenu
            r0.<init>()
        L_0x0011:
            java.util.HashSet r2 = new java.util.HashSet
            android.graphics.Bitmap$Config[] r3 = android.graphics.Bitmap.Config.values()
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r1) goto L_0x0026
            r1 = 0
            r2.add(r1)
        L_0x0026:
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r1 < r3) goto L_0x0031
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.HARDWARE
            r2.remove(r1)
        L_0x0031:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r2)
            r4.<init>(r5, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.requireActivity.<init>(long):void");
    }

    private Bitmap write(int i, int i2, Bitmap.Config config) {
        Bitmap IconCompatParcelizer2;
        synchronized (this) {
            if (Build.VERSION.SDK_INT >= 26) {
                if (config == Bitmap.Config.HARDWARE) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Cannot create a mutable Bitmap with config: ");
                    sb.append(config);
                    sb.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            IconCompatParcelizer2 = this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(i, i2, config != null ? config : MediaBrowserCompat$ItemReceiver);
            if (IconCompatParcelizer2 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Missing bitmap=");
                    sb2.append(this.MediaBrowserCompat$SearchResultReceiver.read(i, i2, config));
                    Log.d("LruBitmapPool", sb2.toString());
                }
                this.RatingCompat++;
            } else {
                this.read++;
                this.write -= (long) this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(IconCompatParcelizer2);
                IconCompatParcelizer2.setHasAlpha(true);
                if (Build.VERSION.SDK_INT >= 19) {
                    IconCompatParcelizer2.setPremultiplied(true);
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Get bitmap=");
                sb3.append(this.MediaBrowserCompat$SearchResultReceiver.read(i, i2, config));
                Log.v("LruBitmapPool", sb3.toString());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                IconCompatParcelizer();
            }
        }
        return IconCompatParcelizer2;
    }
}
