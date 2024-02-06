package p040o;

import android.content.Context;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.SurfaceHolder;
import p040o.MapConstraints;
import p040o.zzmd;

/* renamed from: o.CGERU */
public class CGERU {
    /* access modifiers changed from: private */
    public static final String MediaSessionCompat$ResultReceiverWrapper = CGERU.class.getSimpleName();
    public boolean IconCompatParcelizer = true;
    public Runnable MediaBrowserCompat$CustomActionResultReceiver = new Runnable() {
        public final void run() {
            try {
                Log.d(CGERU.MediaSessionCompat$ResultReceiverWrapper, "Closing camera");
                CHEMV MediaBrowserCompat$ItemReceiver = CGERU.this.write;
                CGBMV cgbmv = MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                if (cgbmv != null) {
                    cgbmv.write();
                    MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = null;
                }
                if (MediaBrowserCompat$ItemReceiver.read != null) {
                    MediaBrowserCompat$ItemReceiver.read = null;
                }
                Camera camera = MediaBrowserCompat$ItemReceiver.write;
                if (camera != null && MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat) {
                    camera.stopPreview();
                    MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
                    MediaBrowserCompat$ItemReceiver.MediaDescriptionCompat = false;
                }
                CHEMV MediaBrowserCompat$ItemReceiver2 = CGERU.this.write;
                Camera camera2 = MediaBrowserCompat$ItemReceiver2.write;
                if (camera2 != null) {
                    camera2.release();
                    MediaBrowserCompat$ItemReceiver2.write = null;
                }
            } catch (Exception e) {
                Log.e(CGERU.MediaSessionCompat$ResultReceiverWrapper, "Failed to close camera", e);
            }
            boolean unused = CGERU.this.IconCompatParcelizer = true;
            CGERU.this.ParcelableVolumeInfo.sendEmptyMessage(rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_camera_closed);
            MapConstraints.ConstrainedMultimap.C36372.write read = CGERU.this.MediaBrowserCompat$ItemReceiver;
            synchronized (read.read) {
                int i = read.MediaBrowserCompat$ItemReceiver - 1;
                read.MediaBrowserCompat$ItemReceiver = i;
                if (i == 0) {
                    read.IconCompatParcelizer();
                }
            }
        }
    };
    public MapConstraints.ConstrainedMultimap.C36372.write MediaBrowserCompat$ItemReceiver;
    public Runnable MediaBrowserCompat$MediaItem = new Runnable() {
        public final void run() {
            try {
                Log.d(CGERU.MediaSessionCompat$ResultReceiverWrapper, "Starting preview");
                CHEMV MediaBrowserCompat$ItemReceiver2 = CGERU.this.write;
                zzmd.zzm.zza.read MediaBrowserCompat$MediaItem = CGERU.this.MediaSessionCompat$Token;
                Camera camera = MediaBrowserCompat$ItemReceiver2.write;
                SurfaceHolder surfaceHolder = MediaBrowserCompat$MediaItem.IconCompatParcelizer;
                if (surfaceHolder != null) {
                    camera.setPreviewDisplay(surfaceHolder);
                } else {
                    camera.setPreviewTexture(MediaBrowserCompat$MediaItem.read);
                }
                CHEMV MediaBrowserCompat$ItemReceiver3 = CGERU.this.write;
                Camera camera2 = MediaBrowserCompat$ItemReceiver3.write;
                if (camera2 != null && !MediaBrowserCompat$ItemReceiver3.MediaDescriptionCompat) {
                    camera2.startPreview();
                    MediaBrowserCompat$ItemReceiver3.MediaDescriptionCompat = true;
                    MediaBrowserCompat$ItemReceiver3.MediaBrowserCompat$ItemReceiver = new CGBMV(MediaBrowserCompat$ItemReceiver3.write, MediaBrowserCompat$ItemReceiver3.MediaSessionCompat$QueueItem);
                    MediaBrowserCompat$ItemReceiver3.read = new rsnScriptIntrinsicBLAS_Complex(MediaBrowserCompat$ItemReceiver3.MediaBrowserCompat$MediaItem, MediaBrowserCompat$ItemReceiver3, MediaBrowserCompat$ItemReceiver3.MediaSessionCompat$QueueItem);
                }
            } catch (Exception e) {
                CGERU.MediaBrowserCompat$CustomActionResultReceiver(CGERU.this, e);
                Log.e(CGERU.MediaSessionCompat$ResultReceiverWrapper, "Failed to start preview", e);
            }
        }
    };
    public Runnable MediaBrowserCompat$SearchResultReceiver = new Runnable() {
        /* JADX WARNING: Can't wrap try/catch for region: R(18:3|4|5|(14:(2:8|(2:10|(1:12)(1:13))(1:14))(1:15)|17|(1:19)(1:20)|21|24|25|26|27|28|29|30|(1:32)(1:33)|34|(2:36|37)(1:43))|16|17|(0)(0)|21|24|25|26|27|28|29|30|(0)(0)|34|(0)(0)) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            android.util.Log.w(p040o.CHEMV.MediaBrowserCompat$CustomActionResultReceiver, "Failed to set rotation.");
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0067 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0072 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x0076 */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[Catch:{ Exception -> 0x0067 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0040 A[Catch:{ Exception -> 0x0067 }] */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0089 A[Catch:{ Exception -> 0x00c5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x008e A[Catch:{ Exception -> 0x00c5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00a7 A[Catch:{ Exception -> 0x00c5 }] */
        /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                java.lang.String r0 = p040o.CGERU.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ Exception -> 0x00c5 }
                java.lang.String r1 = "Configuring camera"
                android.util.Log.d(r0, r1)     // Catch:{ Exception -> 0x00c5 }
                o.CGERU r0 = p040o.CGERU.this     // Catch:{ Exception -> 0x00c5 }
                o.CHEMV r0 = r0.write     // Catch:{ Exception -> 0x00c5 }
                android.hardware.Camera r1 = r0.write     // Catch:{ Exception -> 0x00c5 }
                if (r1 == 0) goto L_0x00bd
                r1 = 1
                r2 = 0
                o.getEnterTransitionCallback r3 = r0.MediaMetadataCompat     // Catch:{ Exception -> 0x0067 }
                int r3 = r3.IconCompatParcelizer     // Catch:{ Exception -> 0x0067 }
                if (r3 == 0) goto L_0x002d
                if (r3 == r1) goto L_0x002a
                r4 = 2
                if (r3 == r4) goto L_0x0027
                r4 = 3
                if (r3 == r4) goto L_0x0024
                goto L_0x002d
            L_0x0024:
                r3 = 270(0x10e, float:3.78E-43)
                goto L_0x002e
            L_0x0027:
                r3 = 180(0xb4, float:2.52E-43)
                goto L_0x002e
            L_0x002a:
                r3 = 90
                goto L_0x002e
            L_0x002d:
                r3 = r2
            L_0x002e:
                android.hardware.Camera$CameraInfo r4 = r0.IconCompatParcelizer     // Catch:{ Exception -> 0x0067 }
                int r4 = r4.facing     // Catch:{ Exception -> 0x0067 }
                if (r4 != r1) goto L_0x0040
                android.hardware.Camera$CameraInfo r4 = r0.IconCompatParcelizer     // Catch:{ Exception -> 0x0067 }
                int r4 = r4.orientation     // Catch:{ Exception -> 0x0067 }
                int r4 = r4 + r3
                int r4 = r4 % 360
                int r3 = 360 - r4
                int r3 = r3 % 360
                goto L_0x0049
            L_0x0040:
                android.hardware.Camera$CameraInfo r4 = r0.IconCompatParcelizer     // Catch:{ Exception -> 0x0067 }
                int r4 = r4.orientation     // Catch:{ Exception -> 0x0067 }
                int r4 = r4 - r3
                int r4 = r4 + 360
                int r3 = r4 % 360
            L_0x0049:
                java.lang.String r4 = p040o.CHEMV.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x0067 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0067 }
                r5.<init>()     // Catch:{ Exception -> 0x0067 }
                java.lang.String r6 = "Camera Display Orientation: "
                r5.append(r6)     // Catch:{ Exception -> 0x0067 }
                r5.append(r3)     // Catch:{ Exception -> 0x0067 }
                java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x0067 }
                android.util.Log.i(r4, r5)     // Catch:{ Exception -> 0x0067 }
                r0.MediaSessionCompat$Token = r3     // Catch:{ Exception -> 0x0067 }
                android.hardware.Camera r4 = r0.write     // Catch:{ Exception -> 0x0067 }
                r4.setDisplayOrientation(r3)     // Catch:{ Exception -> 0x0067 }
                goto L_0x006e
            L_0x0067:
                java.lang.String r3 = p040o.CHEMV.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x00c5 }
                java.lang.String r4 = "Failed to set rotation."
                android.util.Log.w(r3, r4)     // Catch:{ Exception -> 0x00c5 }
            L_0x006e:
                r0.MediaBrowserCompat$CustomActionResultReceiver(r2)     // Catch:{ Exception -> 0x0072 }
                goto L_0x007d
            L_0x0072:
                r0.MediaBrowserCompat$CustomActionResultReceiver(r1)     // Catch:{ Exception -> 0x0076 }
                goto L_0x007d
            L_0x0076:
                java.lang.String r1 = p040o.CHEMV.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ Exception -> 0x00c5 }
                java.lang.String r2 = "Camera rejected even safe-mode parameters! No configuration"
                android.util.Log.w(r1, r2)     // Catch:{ Exception -> 0x00c5 }
            L_0x007d:
                android.hardware.Camera r1 = r0.write     // Catch:{ Exception -> 0x00c5 }
                android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch:{ Exception -> 0x00c5 }
                android.hardware.Camera$Size r1 = r1.getPreviewSize()     // Catch:{ Exception -> 0x00c5 }
                if (r1 != 0) goto L_0x008e
                o.BNNM r1 = r0.f5482x50fd9e4a     // Catch:{ Exception -> 0x00c5 }
                r0.RatingCompat = r1     // Catch:{ Exception -> 0x00c5 }
                goto L_0x0099
            L_0x008e:
                o.BNNM r2 = new o.BNNM     // Catch:{ Exception -> 0x00c5 }
                int r3 = r1.width     // Catch:{ Exception -> 0x00c5 }
                int r1 = r1.height     // Catch:{ Exception -> 0x00c5 }
                r2.<init>(r3, r1)     // Catch:{ Exception -> 0x00c5 }
                r0.RatingCompat = r2     // Catch:{ Exception -> 0x00c5 }
            L_0x0099:
                o.CHEMV$IconCompatParcelizer r1 = r0.MediaBrowserCompat$SearchResultReceiver     // Catch:{ Exception -> 0x00c5 }
                o.BNNM r0 = r0.RatingCompat     // Catch:{ Exception -> 0x00c5 }
                r1.MediaBrowserCompat$ItemReceiver = r0     // Catch:{ Exception -> 0x00c5 }
                o.CGERU r0 = p040o.CGERU.this     // Catch:{ Exception -> 0x00c5 }
                android.os.Handler r0 = r0.ParcelableVolumeInfo     // Catch:{ Exception -> 0x00c5 }
                if (r0 == 0) goto L_0x00d4
                o.CGERU r0 = p040o.CGERU.this     // Catch:{ Exception -> 0x00c5 }
                android.os.Handler r0 = r0.ParcelableVolumeInfo     // Catch:{ Exception -> 0x00c5 }
                int r1 = p040o.rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_prewiew_size_ready     // Catch:{ Exception -> 0x00c5 }
                o.CGERU r2 = p040o.CGERU.this     // Catch:{ Exception -> 0x00c5 }
                o.BNNM r2 = p040o.CGERU.write(r2)     // Catch:{ Exception -> 0x00c5 }
                android.os.Message r0 = r0.obtainMessage(r1, r2)     // Catch:{ Exception -> 0x00c5 }
                r0.sendToTarget()     // Catch:{ Exception -> 0x00c5 }
                return
            L_0x00bd:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x00c5 }
                java.lang.String r1 = "Camera not open"
                r0.<init>(r1)     // Catch:{ Exception -> 0x00c5 }
                throw r0     // Catch:{ Exception -> 0x00c5 }
            L_0x00c5:
                r0 = move-exception
                o.CGERU r1 = p040o.CGERU.this
                p040o.CGERU.MediaBrowserCompat$CustomActionResultReceiver(r1, r0)
                java.lang.String r1 = p040o.CGERU.MediaSessionCompat$ResultReceiverWrapper
                java.lang.String r2 = "Failed to configure camera"
                android.util.Log.e(r1, r2, r0)
            L_0x00d4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.CGERU.C96785.run():void");
        }
    };

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private Runnable f5481x50fd9e4a = new Runnable() {
        public final void run() {
            try {
                Log.d(CGERU.MediaSessionCompat$ResultReceiverWrapper, "Opening camera");
                CHEMV MediaBrowserCompat$ItemReceiver = CGERU.this.write;
                Camera write2 = rsnScriptInvokeIDCreate.write(MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem.IconCompatParcelizer);
                MediaBrowserCompat$ItemReceiver.write = write2;
                if (write2 != null) {
                    int IconCompatParcelizer = rsnScriptInvokeIDCreate.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem.IconCompatParcelizer);
                    Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
                    MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = cameraInfo;
                    Camera.getCameraInfo(IconCompatParcelizer, cameraInfo);
                    return;
                }
                throw new RuntimeException("Failed to open camera");
            } catch (Exception e) {
                CGERU.MediaBrowserCompat$CustomActionResultReceiver(CGERU.this, e);
                Log.e(CGERU.MediaSessionCompat$ResultReceiverWrapper, "Failed to open camera", e);
            }
        }
    };
    public Handler MediaDescriptionCompat;
    public boolean MediaMetadataCompat = false;
    public zzmd.zzm.zza.read MediaSessionCompat$Token;
    public Handler ParcelableVolumeInfo;
    public getEnterTransitionCallback RatingCompat;
    public CHER read = new CHER();
    public CHEMV write;

    public CGERU(Context context) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            if (MapConstraints.ConstrainedMultimap.C36372.write.MediaBrowserCompat$CustomActionResultReceiver == null) {
                MapConstraints.ConstrainedMultimap.C36372.write.MediaBrowserCompat$CustomActionResultReceiver = new MapConstraints.ConstrainedMultimap.C36372.write();
            }
            this.MediaBrowserCompat$ItemReceiver = MapConstraints.ConstrainedMultimap.C36372.write.MediaBrowserCompat$CustomActionResultReceiver;
            CHEMV chemv = new CHEMV(context);
            this.write = chemv;
            chemv.MediaSessionCompat$QueueItem = this.read;
            this.MediaDescriptionCompat = new Handler();
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(CGERU cgeru, Exception exc) {
        Handler handler = cgeru.ParcelableVolumeInfo;
        if (handler != null) {
            handler.obtainMessage(rsnScriptInvokeV$MediaBrowserCompat$CustomActionResultReceiver.zxing_camera_error, exc).sendToTarget();
        }
    }

    static /* synthetic */ BNNM write(CGERU cgeru) {
        CHEMV chemv = cgeru.write;
        if (chemv.RatingCompat == null) {
            return null;
        }
        if (!chemv.read()) {
            return chemv.RatingCompat;
        }
        BNNM bnnm = chemv.RatingCompat;
        return new BNNM(bnnm.IconCompatParcelizer, bnnm.read);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.MediaMetadataCompat = true;
            this.IconCompatParcelizer = false;
            this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.f5481x50fd9e4a);
            return;
        }
        throw new IllegalStateException("Must be called from the main thread.");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(final boolean z) {
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("Must be called from the main thread.");
        } else if (this.MediaMetadataCompat) {
            MapConstraints.ConstrainedMultimap.C36372.write write2 = this.MediaBrowserCompat$ItemReceiver;
            C96763 r1 = new Runnable() {
                public final void run() {
                    CGERU.this.write.read(z);
                }
            };
            synchronized (write2.read) {
                write2.MediaBrowserCompat$CustomActionResultReceiver();
                write2.write.post(r1);
            }
        }
    }
}
