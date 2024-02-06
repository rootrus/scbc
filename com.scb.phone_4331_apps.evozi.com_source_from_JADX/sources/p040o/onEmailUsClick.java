package p040o;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.lang.Thread;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: o.onEmailUsClick */
public class onEmailUsClick {
    public final Object IconCompatParcelizer;
    public Camera MediaBrowserCompat$CustomActionResultReceiver;
    /* access modifiers changed from: package-private */
    public int MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public int MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public int MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public Thread f5552x50fd9e4a;
    /* access modifiers changed from: private */
    public int MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public float MediaMetadataCompat;
    /* access modifiers changed from: private */
    public IconCompatParcelizer MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public String MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public Map<byte[], ByteBuffer> MediaSessionCompat$Token;
    /* access modifiers changed from: private */
    public String RatingCompat;
    /* access modifiers changed from: private */
    public Context read;
    public ChubbReviewActivity write;

    /* renamed from: o.onEmailUsClick$MediaDescriptionCompat */
    static class MediaDescriptionCompat {
        ChubbReviewActivity MediaBrowserCompat$CustomActionResultReceiver;
        ChubbReviewActivity MediaBrowserCompat$ItemReceiver;

        public MediaDescriptionCompat(Camera.Size size, Camera.Size size2) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new ChubbReviewActivity(size.width, size.height);
            if (size2 != null) {
                this.MediaBrowserCompat$ItemReceiver = new ChubbReviewActivity(size2.width, size2.height);
            }
        }
    }

    /* renamed from: o.onEmailUsClick$RatingCompat */
    public class RatingCompat implements Camera.ShutterCallback {
        private RatingCompat() {
        }

        public /* synthetic */ RatingCompat(onEmailUsClick onemailusclick) {
            this();
        }

        public final void onShutter() {
        }
    }

    /* renamed from: o.onEmailUsClick$read */
    public class read implements Camera.PictureCallback {
        public onEmailUsClick$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver;

        private read() {
        }

        public /* synthetic */ read(onEmailUsClick onemailusclick, byte b) {
            this();
        }

        public final void onPictureTaken(byte[] bArr, Camera camera) {
            onEmailUsClick$MediaBrowserCompat$ItemReceiver onemailusclick_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (onemailusclick_mediabrowsercompat_itemreceiver != null) {
                onemailusclick_mediabrowsercompat_itemreceiver.IconCompatParcelizer(new ByteArrayInputStream(bArr));
            }
            synchronized (onEmailUsClick.this.IconCompatParcelizer) {
                if (onEmailUsClick.this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                    onEmailUsClick.this.MediaBrowserCompat$CustomActionResultReceiver.startPreview();
                }
            }
        }
    }

    /* renamed from: o.onEmailUsClick$write */
    public static class write {
        public onEmailUsClick IconCompatParcelizer;
        public final ProductListActivity<?> write;

        public write(Context context, ProductListActivity<?> productListActivity) {
            onEmailUsClick onemailusclick = new onEmailUsClick((byte) 0);
            this.IconCompatParcelizer = onemailusclick;
            if (context == null) {
                throw new IllegalArgumentException("No context supplied.");
            } else if (productListActivity != null) {
                this.write = productListActivity;
                Context unused = onemailusclick.read = context;
            } else {
                throw new IllegalArgumentException("No detector supplied.");
            }
        }

        public final write MediaBrowserCompat$ItemReceiver(int i) {
            if (i == 0 || i == 1) {
                int unused = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = i;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid camera: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public final write MediaBrowserCompat$ItemReceiver(int i, int i2) {
            if (i <= 0 || i > 1000000 || i2 <= 0 || i2 > 1000000) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid preview size: ");
                sb.append(i);
                sb.append("x");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            }
            int unused = this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = i;
            int unused2 = this.IconCompatParcelizer.MediaDescriptionCompat = i2;
            return this;
        }

        public final write read(float f) {
            if (f > BitmapDescriptorFactory.HUE_RED) {
                float unused = this.IconCompatParcelizer.MediaMetadataCompat = f;
                return this;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid fps: ");
            sb.append(f);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    private onEmailUsClick() {
        this.IconCompatParcelizer = new Object();
        this.MediaBrowserCompat$ItemReceiver = 0;
        this.MediaMetadataCompat = 30.0f;
        this.MediaBrowserCompat$SearchResultReceiver = 1024;
        this.MediaDescriptionCompat = 768;
        this.RatingCompat = null;
        this.MediaSessionCompat$ResultReceiverWrapper = null;
        this.MediaSessionCompat$Token = new HashMap();
    }

    /* synthetic */ onEmailUsClick(byte b) {
        this();
    }

    private static int[] read(Camera camera, float f) {
        int i = (int) (f * 1000.0f);
        int[] iArr = null;
        int i2 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int[] next : camera.getParameters().getSupportedPreviewFpsRange()) {
            int abs = Math.abs(i - next[0]) + Math.abs(i - next[1]);
            if (abs < i2) {
                iArr = next;
                i2 = abs;
            }
        }
        return iArr;
    }

    public final void write() {
        synchronized (this.IconCompatParcelizer) {
            read();
            if (this.MediaSessionCompat$QueueItem != null) {
                this.MediaSessionCompat$QueueItem.read();
                this.MediaSessionCompat$QueueItem = null;
            }
            if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.release();
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
            System.gc();
        }
    }

    /* renamed from: o.onEmailUsClick$IconCompatParcelizer */
    public class IconCompatParcelizer implements Runnable {
        private static /* synthetic */ boolean MediaDescriptionCompat = (!onEmailUsClick.class.desiredAssertionStatus());
        ByteBuffer IconCompatParcelizer;
        final Object MediaBrowserCompat$ItemReceiver = new Object();
        private ProductListActivity<?> MediaBrowserCompat$SearchResultReceiver;
        boolean read = true;
        int write = 0;

        public IconCompatParcelizer(ProductListActivity<?> productListActivity) {
            SystemClock.elapsedRealtime();
            this.MediaBrowserCompat$SearchResultReceiver = productListActivity;
        }

        /* access modifiers changed from: package-private */
        public final void read() {
            if (MediaDescriptionCompat || onEmailUsClick.this.f5552x50fd9e4a.getState() == Thread.State.TERMINATED) {
                ProductListActivity<?> productListActivity = this.MediaBrowserCompat$SearchResultReceiver;
                if (productListActivity != null) {
                    productListActivity.read();
                    this.MediaBrowserCompat$SearchResultReceiver = null;
                    return;
                }
                return;
            }
            throw new AssertionError();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r4.MediaBrowserCompat$SearchResultReceiver.write(r1, r4.MediaBrowserCompat$CustomActionResultReceiver);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            android.util.Log.e("OpenCameraSource", "Exception thrown from receiver.", r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
            r0 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x008b, code lost:
            p040o.onEmailUsClick.MediaBrowserCompat$ItemReceiver(r4.MediaBrowserCompat$CustomActionResultReceiver).addCallbackBuffer(r2.array());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0098, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
            L_0x0000:
                java.lang.Object r0 = r4.MediaBrowserCompat$ItemReceiver
                monitor-enter(r0)
            L_0x0003:
                boolean r1 = r4.read     // Catch:{ all -> 0x0099 }
                if (r1 == 0) goto L_0x001b
                java.nio.ByteBuffer r1 = r4.IconCompatParcelizer     // Catch:{ all -> 0x0099 }
                if (r1 != 0) goto L_0x001b
                java.lang.Object r1 = r4.MediaBrowserCompat$ItemReceiver     // Catch:{ InterruptedException -> 0x0011 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0011 }
                goto L_0x0003
            L_0x0011:
                r1 = move-exception
                java.lang.String r2 = "OpenCameraSource"
                java.lang.String r3 = "Frame processing loop terminated."
                android.util.Log.d(r2, r3, r1)     // Catch:{ all -> 0x0099 }
                monitor-exit(r0)     // Catch:{ all -> 0x0099 }
                return
            L_0x001b:
                boolean r1 = r4.read     // Catch:{ all -> 0x0099 }
                if (r1 != 0) goto L_0x0021
                monitor-exit(r0)     // Catch:{ all -> 0x0099 }
                return
            L_0x0021:
                com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata$Builder r1 = new com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata$Builder     // Catch:{ all -> 0x0099 }
                r1.<init>()     // Catch:{ all -> 0x0099 }
                o.onEmailUsClick r2 = p040o.onEmailUsClick.this     // Catch:{ all -> 0x0099 }
                o.ChubbReviewActivity r2 = r2.write     // Catch:{ all -> 0x0099 }
                int r2 = r2.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0099 }
                com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata$Builder r1 = r1.setWidth(r2)     // Catch:{ all -> 0x0099 }
                o.onEmailUsClick r2 = p040o.onEmailUsClick.this     // Catch:{ all -> 0x0099 }
                o.ChubbReviewActivity r2 = r2.write     // Catch:{ all -> 0x0099 }
                int r2 = r2.write     // Catch:{ all -> 0x0099 }
                com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata$Builder r1 = r1.setHeight(r2)     // Catch:{ all -> 0x0099 }
                r2 = 17
                com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata$Builder r1 = r1.setFormat(r2)     // Catch:{ all -> 0x0099 }
                o.onEmailUsClick r2 = p040o.onEmailUsClick.this     // Catch:{ all -> 0x0099 }
                int r2 = r2.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x0099 }
                com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata$Builder r1 = r1.setRotation(r2)     // Catch:{ all -> 0x0099 }
                com.google.firebase.ml.vision.common.FirebaseVisionImageMetadata r1 = r1.build()     // Catch:{ all -> 0x0099 }
                java.nio.ByteBuffer r2 = r4.IconCompatParcelizer     // Catch:{ all -> 0x0099 }
                com.google.firebase.ml.vision.common.FirebaseVisionImage r1 = com.google.firebase.p067ml.vision.common.FirebaseVisionImage.fromByteBuffer(r2, r1)     // Catch:{ all -> 0x0099 }
                java.nio.ByteBuffer r2 = r4.IconCompatParcelizer     // Catch:{ all -> 0x0099 }
                r3 = 0
                r4.IconCompatParcelizer = r3     // Catch:{ all -> 0x0099 }
                monitor-exit(r0)     // Catch:{ all -> 0x0099 }
                o.ProductListActivity<?> r0 = r4.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x0073 }
                o.onEmailUsClick r3 = p040o.onEmailUsClick.this     // Catch:{ all -> 0x0073 }
                r0.write(r1, r3)     // Catch:{ all -> 0x0073 }
                o.onEmailUsClick r0 = p040o.onEmailUsClick.this
                android.hardware.Camera r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                byte[] r1 = r2.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x0073:
                r0 = move-exception
                java.lang.String r1 = "OpenCameraSource"
                java.lang.String r3 = "Exception thrown from receiver."
                android.util.Log.e(r1, r3, r0)     // Catch:{ all -> 0x008a }
                o.onEmailUsClick r0 = p040o.onEmailUsClick.this
                android.hardware.Camera r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                byte[] r1 = r2.array()
                r0.addCallbackBuffer(r1)
                goto L_0x0000
            L_0x008a:
                r0 = move-exception
                o.onEmailUsClick r1 = p040o.onEmailUsClick.this
                android.hardware.Camera r1 = r1.MediaBrowserCompat$CustomActionResultReceiver
                byte[] r2 = r2.array()
                r1.addCallbackBuffer(r2)
                throw r0
            L_0x0099:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.onEmailUsClick.IconCompatParcelizer.run():void");
        }
    }

    private static MediaDescriptionCompat write(Camera camera, int i, int i2) {
        int abs;
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        ArrayList<MediaDescriptionCompat> arrayList = new ArrayList<>();
        for (Camera.Size next : supportedPreviewSizes) {
            float f = ((float) next.width) / ((float) next.height);
            Iterator<Camera.Size> it = supportedPictureSizes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Camera.Size next2 = it.next();
                if (Math.abs(f - (((float) next2.width) / ((float) next2.height))) < 0.01f) {
                    arrayList.add(new MediaDescriptionCompat(next, next2));
                    break;
                }
            }
        }
        MediaDescriptionCompat mediaDescriptionCompat = null;
        if (arrayList.size() == 0) {
            Log.w("OpenCameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
            for (Camera.Size mediaDescriptionCompat2 : supportedPreviewSizes) {
                arrayList.add(new MediaDescriptionCompat(mediaDescriptionCompat2, (Camera.Size) null));
            }
        }
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (MediaDescriptionCompat mediaDescriptionCompat3 : arrayList) {
            ChubbReviewActivity chubbReviewActivity = mediaDescriptionCompat3.MediaBrowserCompat$CustomActionResultReceiver;
            if (chubbReviewActivity.MediaBrowserCompat$ItemReceiver != chubbReviewActivity.write && (abs = Math.abs(chubbReviewActivity.write - i2) + Math.abs(chubbReviewActivity.MediaBrowserCompat$ItemReceiver - i)) < i3) {
                mediaDescriptionCompat = mediaDescriptionCompat3;
                i3 = abs;
            }
        }
        return mediaDescriptionCompat;
    }

    private byte[] MediaBrowserCompat$ItemReceiver(ChubbReviewActivity chubbReviewActivity) {
        byte[] bArr = new byte[(((int) Math.ceil(((double) ((long) ((chubbReviewActivity.write * chubbReviewActivity.MediaBrowserCompat$ItemReceiver) * ImageFormat.getBitsPerPixel(17)))) / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.MediaSessionCompat$Token.put(bArr, wrap);
        return bArr;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0108  */
    public final p040o.onEmailUsClick MediaBrowserCompat$CustomActionResultReceiver(android.view.SurfaceHolder r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.IconCompatParcelizer
            monitor-enter(r0)
            android.hardware.Camera r1 = r9.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x01b4 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x01b4 }
            return r9
        L_0x0009:
            int r1 = r9.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x01b4 }
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo     // Catch:{ all -> 0x01b4 }
            r2.<init>()     // Catch:{ all -> 0x01b4 }
            r3 = 0
            r4 = r3
        L_0x0012:
            int r5 = android.hardware.Camera.getNumberOfCameras()     // Catch:{ all -> 0x01b4 }
            r6 = -1
            if (r4 >= r5) goto L_0x0024
            android.hardware.Camera.getCameraInfo(r4, r2)     // Catch:{ all -> 0x01b4 }
            int r5 = r2.facing     // Catch:{ all -> 0x01b4 }
            if (r5 != r1) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0024:
            r4 = r6
        L_0x0025:
            if (r4 == r6) goto L_0x01ac
            android.hardware.Camera r1 = android.hardware.Camera.open(r4)     // Catch:{ all -> 0x01b4 }
            int r2 = r9.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x01b4 }
            int r5 = r9.MediaDescriptionCompat     // Catch:{ all -> 0x01b4 }
            o.onEmailUsClick$MediaDescriptionCompat r2 = write(r1, r2, r5)     // Catch:{ all -> 0x01b4 }
            if (r2 == 0) goto L_0x01a4
            o.ChubbReviewActivity r5 = r2.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x01b4 }
            o.ChubbReviewActivity r2 = r2.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x01b4 }
            r9.write = r2     // Catch:{ all -> 0x01b4 }
            float r2 = r9.MediaMetadataCompat     // Catch:{ all -> 0x01b4 }
            int[] r2 = read(r1, r2)     // Catch:{ all -> 0x01b4 }
            if (r2 == 0) goto L_0x019c
            android.hardware.Camera$Parameters r6 = r1.getParameters()     // Catch:{ all -> 0x01b4 }
            if (r5 == 0) goto L_0x0050
            int r7 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x01b4 }
            int r5 = r5.write     // Catch:{ all -> 0x01b4 }
            r6.setPictureSize(r7, r5)     // Catch:{ all -> 0x01b4 }
        L_0x0050:
            o.ChubbReviewActivity r5 = r9.write     // Catch:{ all -> 0x01b4 }
            int r5 = r5.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x01b4 }
            o.ChubbReviewActivity r7 = r9.write     // Catch:{ all -> 0x01b4 }
            int r7 = r7.write     // Catch:{ all -> 0x01b4 }
            r6.setPreviewSize(r5, r7)     // Catch:{ all -> 0x01b4 }
            r5 = r2[r3]     // Catch:{ all -> 0x01b4 }
            r7 = 1
            r2 = r2[r7]     // Catch:{ all -> 0x01b4 }
            r6.setPreviewFpsRange(r5, r2)     // Catch:{ all -> 0x01b4 }
            r2 = 17
            r6.setPreviewFormat(r2)     // Catch:{ all -> 0x01b4 }
            android.content.Context r2 = r9.read     // Catch:{ all -> 0x01b4 }
            java.lang.String r5 = "window"
            java.lang.Object r2 = r2.getSystemService(r5)     // Catch:{ all -> 0x01b4 }
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch:{ all -> 0x01b4 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ all -> 0x01b4 }
            int r2 = r2.getRotation()     // Catch:{ all -> 0x01b4 }
            if (r2 == 0) goto L_0x00a4
            if (r2 == r7) goto L_0x00a1
            r5 = 2
            if (r2 == r5) goto L_0x009e
            r5 = 3
            if (r2 == r5) goto L_0x009b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b4 }
            r5.<init>()     // Catch:{ all -> 0x01b4 }
            java.lang.String r8 = "Bad rotation value: "
            r5.append(r8)     // Catch:{ all -> 0x01b4 }
            r5.append(r2)     // Catch:{ all -> 0x01b4 }
            java.lang.String r2 = "OpenCameraSource"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01b4 }
            android.util.Log.e(r2, r5)     // Catch:{ all -> 0x01b4 }
            goto L_0x00a4
        L_0x009b:
            r2 = 270(0x10e, float:3.78E-43)
            goto L_0x00a5
        L_0x009e:
            r2 = 180(0xb4, float:2.52E-43)
            goto L_0x00a5
        L_0x00a1:
            r2 = 90
            goto L_0x00a5
        L_0x00a4:
            r2 = r3
        L_0x00a5:
            android.hardware.Camera$CameraInfo r5 = new android.hardware.Camera$CameraInfo     // Catch:{ all -> 0x01b4 }
            r5.<init>()     // Catch:{ all -> 0x01b4 }
            android.hardware.Camera.getCameraInfo(r4, r5)     // Catch:{ all -> 0x01b4 }
            int r4 = r5.facing     // Catch:{ all -> 0x01b4 }
            if (r4 != r7) goto L_0x00b9
            int r4 = r5.orientation     // Catch:{ all -> 0x01b4 }
            int r4 = r4 + r2
            int r4 = r4 % 360
            int r2 = 360 - r4
            goto L_0x00c1
        L_0x00b9:
            int r4 = r5.orientation     // Catch:{ all -> 0x01b4 }
            int r4 = r4 - r2
            int r4 = r4 + 360
            int r4 = r4 % 360
            r2 = r4
        L_0x00c1:
            int r5 = r4 / 90
            r9.MediaBrowserCompat$MediaItem = r5     // Catch:{ all -> 0x01b4 }
            r1.setDisplayOrientation(r2)     // Catch:{ all -> 0x01b4 }
            r6.setRotation(r4)     // Catch:{ all -> 0x01b4 }
            java.lang.String r2 = r9.RatingCompat     // Catch:{ all -> 0x01b4 }
            if (r2 == 0) goto L_0x00fe
            java.util.List r2 = r6.getSupportedFocusModes()     // Catch:{ all -> 0x01b4 }
            java.lang.String r4 = r9.RatingCompat     // Catch:{ all -> 0x01b4 }
            boolean r2 = r2.contains(r4)     // Catch:{ all -> 0x01b4 }
            if (r2 == 0) goto L_0x00e1
            java.lang.String r2 = r9.RatingCompat     // Catch:{ all -> 0x01b4 }
            r6.setFocusMode(r2)     // Catch:{ all -> 0x01b4 }
            goto L_0x00fe
        L_0x00e1:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b4 }
            r2.<init>()     // Catch:{ all -> 0x01b4 }
            java.lang.String r4 = "Camera focus mode: "
            r2.append(r4)     // Catch:{ all -> 0x01b4 }
            java.lang.String r4 = r9.RatingCompat     // Catch:{ all -> 0x01b4 }
            r2.append(r4)     // Catch:{ all -> 0x01b4 }
            java.lang.String r4 = " is not supported on this device."
            r2.append(r4)     // Catch:{ all -> 0x01b4 }
            java.lang.String r4 = "OpenCameraSource"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01b4 }
            android.util.Log.i(r4, r2)     // Catch:{ all -> 0x01b4 }
        L_0x00fe:
            java.lang.String r2 = r6.getFocusMode()     // Catch:{ all -> 0x01b4 }
            r9.RatingCompat = r2     // Catch:{ all -> 0x01b4 }
            java.lang.String r2 = r9.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x01b4 }
            if (r2 == 0) goto L_0x013d
            java.util.List r2 = r6.getSupportedFlashModes()     // Catch:{ all -> 0x01b4 }
            if (r2 == 0) goto L_0x0120
            java.util.List r2 = r6.getSupportedFlashModes()     // Catch:{ all -> 0x01b4 }
            java.lang.String r4 = r9.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x01b4 }
            boolean r2 = r2.contains(r4)     // Catch:{ all -> 0x01b4 }
            if (r2 == 0) goto L_0x0120
            java.lang.String r2 = r9.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x01b4 }
            r6.setFlashMode(r2)     // Catch:{ all -> 0x01b4 }
            goto L_0x013d
        L_0x0120:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b4 }
            r2.<init>()     // Catch:{ all -> 0x01b4 }
            java.lang.String r4 = "Camera flash mode: "
            r2.append(r4)     // Catch:{ all -> 0x01b4 }
            java.lang.String r4 = r9.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ all -> 0x01b4 }
            r2.append(r4)     // Catch:{ all -> 0x01b4 }
            java.lang.String r4 = " is not supported on this device."
            r2.append(r4)     // Catch:{ all -> 0x01b4 }
            java.lang.String r4 = "OpenCameraSource"
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01b4 }
            android.util.Log.i(r4, r2)     // Catch:{ all -> 0x01b4 }
        L_0x013d:
            java.lang.String r2 = r6.getFlashMode()     // Catch:{ all -> 0x01b4 }
            r9.MediaSessionCompat$ResultReceiverWrapper = r2     // Catch:{ all -> 0x01b4 }
            r1.setParameters(r6)     // Catch:{ all -> 0x01b4 }
            o.onEmailUsClick$MediaBrowserCompat$CustomActionResultReceiver r2 = new o.onEmailUsClick$MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x01b4 }
            r2.<init>(r9, r3)     // Catch:{ all -> 0x01b4 }
            r1.setPreviewCallbackWithBuffer(r2)     // Catch:{ all -> 0x01b4 }
            o.ChubbReviewActivity r2 = r9.write     // Catch:{ all -> 0x01b4 }
            byte[] r2 = r9.MediaBrowserCompat$ItemReceiver((p040o.ChubbReviewActivity) r2)     // Catch:{ all -> 0x01b4 }
            r1.addCallbackBuffer(r2)     // Catch:{ all -> 0x01b4 }
            o.ChubbReviewActivity r2 = r9.write     // Catch:{ all -> 0x01b4 }
            byte[] r2 = r9.MediaBrowserCompat$ItemReceiver((p040o.ChubbReviewActivity) r2)     // Catch:{ all -> 0x01b4 }
            r1.addCallbackBuffer(r2)     // Catch:{ all -> 0x01b4 }
            o.ChubbReviewActivity r2 = r9.write     // Catch:{ all -> 0x01b4 }
            byte[] r2 = r9.MediaBrowserCompat$ItemReceiver((p040o.ChubbReviewActivity) r2)     // Catch:{ all -> 0x01b4 }
            r1.addCallbackBuffer(r2)     // Catch:{ all -> 0x01b4 }
            o.ChubbReviewActivity r2 = r9.write     // Catch:{ all -> 0x01b4 }
            byte[] r2 = r9.MediaBrowserCompat$ItemReceiver((p040o.ChubbReviewActivity) r2)     // Catch:{ all -> 0x01b4 }
            r1.addCallbackBuffer(r2)     // Catch:{ all -> 0x01b4 }
            r9.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ all -> 0x01b4 }
            r1.setPreviewDisplay(r10)     // Catch:{ all -> 0x01b4 }
            android.hardware.Camera r10 = r9.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x01b4 }
            r10.startPreview()     // Catch:{ all -> 0x01b4 }
            java.lang.Thread r10 = new java.lang.Thread     // Catch:{ all -> 0x01b4 }
            o.onEmailUsClick$IconCompatParcelizer r1 = r9.MediaSessionCompat$QueueItem     // Catch:{ all -> 0x01b4 }
            r10.<init>(r1)     // Catch:{ all -> 0x01b4 }
            r9.f5552x50fd9e4a = r10     // Catch:{ all -> 0x01b4 }
            o.onEmailUsClick$IconCompatParcelizer r10 = r9.MediaSessionCompat$QueueItem     // Catch:{ all -> 0x01b4 }
            java.lang.Object r1 = r10.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x01b4 }
            monitor-enter(r1)     // Catch:{ all -> 0x01b4 }
            r10.read = r7     // Catch:{ all -> 0x0199 }
            java.lang.Object r10 = r10.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x0199 }
            r10.notifyAll()     // Catch:{ all -> 0x0199 }
            monitor-exit(r1)     // Catch:{ all -> 0x0199 }
            java.lang.Thread r10 = r9.f5552x50fd9e4a     // Catch:{ all -> 0x01b4 }
            r10.start()     // Catch:{ all -> 0x01b4 }
            monitor-exit(r0)     // Catch:{ all -> 0x01b4 }
            return r9
        L_0x0199:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b4 }
            throw r10     // Catch:{ all -> 0x01b4 }
        L_0x019c:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ all -> 0x01b4 }
            java.lang.String r1 = "Could not find suitable preview frames per second range."
            r10.<init>(r1)     // Catch:{ all -> 0x01b4 }
            throw r10     // Catch:{ all -> 0x01b4 }
        L_0x01a4:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ all -> 0x01b4 }
            java.lang.String r1 = "Could not find suitable preview size."
            r10.<init>(r1)     // Catch:{ all -> 0x01b4 }
            throw r10     // Catch:{ all -> 0x01b4 }
        L_0x01ac:
            java.lang.RuntimeException r10 = new java.lang.RuntimeException     // Catch:{ all -> 0x01b4 }
            java.lang.String r1 = "Could not find requested camera."
            r10.<init>(r1)     // Catch:{ all -> 0x01b4 }
            throw r10     // Catch:{ all -> 0x01b4 }
        L_0x01b4:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.onEmailUsClick.MediaBrowserCompat$CustomActionResultReceiver(android.view.SurfaceHolder):o.onEmailUsClick");
    }

    public final void read() {
        synchronized (this.IconCompatParcelizer) {
            if (this.MediaSessionCompat$QueueItem != null) {
                IconCompatParcelizer iconCompatParcelizer = this.MediaSessionCompat$QueueItem;
                synchronized (iconCompatParcelizer.MediaBrowserCompat$ItemReceiver) {
                    iconCompatParcelizer.read = false;
                    iconCompatParcelizer.MediaBrowserCompat$ItemReceiver.notifyAll();
                }
            }
            if (this.f5552x50fd9e4a != null) {
                try {
                    this.f5552x50fd9e4a.join();
                } catch (InterruptedException unused) {
                    Log.d("OpenCameraSource", "Frame processing thread interrupted on release.");
                }
                this.f5552x50fd9e4a = null;
            }
            this.MediaSessionCompat$Token.clear();
            if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver.stopPreview();
                this.MediaBrowserCompat$CustomActionResultReceiver.setPreviewCallbackWithBuffer((Camera.PreviewCallback) null);
                try {
                    this.MediaBrowserCompat$CustomActionResultReceiver.setPreviewTexture((SurfaceTexture) null);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to clear camera preview: ");
                    sb.append(e);
                    Log.e("OpenCameraSource", sb.toString());
                }
                this.MediaBrowserCompat$CustomActionResultReceiver.release();
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
        }
    }
}
