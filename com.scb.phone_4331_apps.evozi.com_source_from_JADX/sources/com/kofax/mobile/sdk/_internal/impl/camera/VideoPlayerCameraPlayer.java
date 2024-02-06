package com.kofax.mobile.sdk._internal.impl.camera;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.hardware.Camera;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.kofax.kmc.kui.uicontrols.data.CameraType;
import com.kofax.kmc.kui.uicontrols.data.Flash;
import com.kofax.mobile.sdk._internal.C0767k;
import com.kofax.mobile.sdk._internal.camera.C0496b;
import com.kofax.mobile.sdk._internal.camera.C0497c;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.C0501g;
import com.kofax.mobile.sdk._internal.camera.C0502h;
import com.kofax.mobile.sdk._internal.camera.C0505k;
import com.kofax.mobile.sdk._internal.camera.C0507o;
import com.kofax.mobile.sdk._internal.camera.C0508p;
import com.kofax.mobile.sdk._internal.camera.C0510s;
import com.kofax.mobile.sdk._internal.camera.C0511t;
import com.kofax.mobile.sdk._internal.camera.C7889a;
import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.RttiJsonExactionHelper;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import p040o.HmlPinActivity;

public final class VideoPlayerCameraPlayer implements C0499e {

    /* renamed from: CT */
    private static final int[] f1187CT = {21};
    private static final String TAG = VideoPlayerCameraPlayer.class.getSimpleName();

    /* renamed from: Bl */
    private final Camera.CameraInfo f1188Bl;

    /* renamed from: Bm */
    private volatile boolean f1189Bm = false;

    /* renamed from: CA */
    private C0539b f1190CA = new C0539b();

    /* renamed from: CB */
    private C0511t f1191CB;

    /* renamed from: CC */
    private boolean f1192CC = true;

    /* renamed from: CD */
    private MediaExtractor f1193CD;

    /* renamed from: CE */
    private MediaCodec f1194CE;

    /* renamed from: CF */
    private MediaFormat f1195CF = null;

    /* renamed from: CG */
    private C0508p f1196CG = null;

    /* renamed from: CH */
    private byte[] f1197CH = null;
    /* access modifiers changed from: private */

    /* renamed from: CI */
    public Handler f1198CI;

    /* renamed from: CJ */
    private ByteBuffer[] f1199CJ;

    /* renamed from: CK */
    private ByteBuffer[] f1200CK;

    /* renamed from: CL */
    private MediaCodec.BufferInfo f1201CL = new MediaCodec.BufferInfo();

    /* renamed from: CM */
    private int f1202CM = 0;

    /* renamed from: CN */
    private boolean f1203CN = false;

    /* renamed from: CO */
    private long f1204CO = System.currentTimeMillis();

    /* renamed from: CP */
    private int f1205CP;

    /* renamed from: CQ */
    private C0540c f1206CQ;

    /* renamed from: CS */
    private int f1207CS = 0;

    /* renamed from: Cx */
    private final C0502h f1208Cx;

    /* renamed from: Cy */
    private MediaMetadataRetriever f1209Cy;

    /* renamed from: Cz */
    private SurfaceHolder f1210Cz;

    /* renamed from: Q */
    private Paint f1211Q = new Paint(1);
    private int _height;
    private int _width;

    /* renamed from: ti */
    private OnCompleteListener f1212ti = null;

    public interface OnCompleteListener {
        void onComplete();
    }

    /* renamed from: a */
    public final void mo11148a(Flash flash) {
    }

    /* renamed from: a */
    public final void mo11149a(C0496b bVar) {
    }

    /* renamed from: a */
    public final void mo11167a(C0501g gVar) {
    }

    /* renamed from: c */
    public final void mo11154c(Point point) {
    }

    public final void cancelAutoFocus() {
    }

    /* renamed from: d */
    public final void mo11155d(Point point) {
    }

    public final int getMaxNumFocusAreas() {
        return 1;
    }

    public final int getPictureFormat() {
        return 17;
    }

    public final int getPreviewFormat() {
        return 17;
    }

    public final void setFocusAreas(List<C7889a> list) {
    }

    @HmlPinActivity
    public VideoPlayerCameraPlayer(IVideoResourceProvider iVideoResourceProvider, C0511t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("player cannot be null");
        } else if (iVideoResourceProvider != null) {
            this.f1191CB = tVar;
            C0502h fileProvider = iVideoResourceProvider.getFileProvider();
            this.f1208Cx = fileProvider;
            if (fileProvider == null || !fileProvider.exists()) {
                throw new IllegalArgumentException("fileProvider and the file it provides cannot be null");
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            this.f1209Cy = mediaMetadataRetriever;
            mediaMetadataRetriever.setDataSource(this.f1208Cx.mo11183bo(), this.f1208Cx.mo11184bp(), this.f1208Cx.getLength());
            HandlerThread handlerThread = new HandlerThread("Media Retriever Handler Thread");
            handlerThread.start();
            this.f1198CI = new Handler(handlerThread.getLooper());
            this.f1188Bl = new Camera.CameraInfo();
        } else {
            throw new IllegalArgumentException("videoResourceProvider cannot be null");
        }
    }

    public final void setOnCompleteListener(OnCompleteListener onCompleteListener) {
        this.f1212ti = onCompleteListener;
    }

    /* renamed from: bl */
    public final boolean mo11171bl() {
        return this.f1189Bm;
    }

    /* renamed from: bm */
    public final boolean mo11172bm() {
        return 1 == this.f1188Bl.facing;
    }

    public final int getOrientation() {
        String extractMetadata = this.f1209Cy.extractMetadata(24);
        if (TextUtils.isEmpty(extractMetadata)) {
            return 0;
        }
        return Integer.valueOf(extractMetadata).intValue();
    }

    public final void open() {
        mo11165a(CameraType.BACK_CAMERA);
    }

    /* renamed from: a */
    public final void mo11165a(CameraType cameraType) {
        m1053c(cameraType);
        this.f1189Bm = true;
    }

    public final void close() {
        synchronized (this) {
            this.f1189Bm = false;
            this.f1208Cx.close();
            if (this.f1194CE != null) {
                this.f1194CE.release();
                this.f1194CE = null;
            }
            if (this.f1193CD != null) {
                this.f1193CD.release();
                this.f1193CD = null;
            }
        }
    }

    public final void startPreview() {
        if (!this.f1190CA.f1222CZ) {
            try {
                this.f1207CS = 0;
                MediaExtractor mediaExtractor = new MediaExtractor();
                this.f1193CD = mediaExtractor;
                mediaExtractor.setDataSource(this.f1208Cx.mo11183bo(), this.f1208Cx.mo11184bp(), this.f1208Cx.getLength());
                int a = m1049a(this.f1193CD);
                if (a >= 0) {
                    this.f1193CD.selectTrack(a);
                    MediaFormat trackFormat = this.f1193CD.getTrackFormat(a);
                    this.f1195CF = trackFormat;
                    this._height = trackFormat.getInteger(RttiJsonExactionHelper.HEIGHT);
                    this._width = this.f1195CF.getInteger(RttiJsonExactionHelper.WIDTH);
                    String str = TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Video size is ");
                    sb.append(this._width);
                    sb.append("x");
                    sb.append(this._height);
                    C0767k.m1801b(str, sb.toString());
                    List<C0538a> Y = m1048Y(this.f1195CF.getString("mime"));
                    if (!Y.isEmpty()) {
                        this.f1195CF.setInteger("max-input-size", 0);
                        this.f1195CF.setInteger("max-input-size", 0);
                        if (this.f1195CF.containsKey("rotation-degrees")) {
                            String str2 = TAG;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Video rotation is ");
                            sb2.append(this.f1195CF.getInteger("rotation-degrees"));
                            C0767k.m1801b(str2, sb2.toString());
                            this.f1195CF.setInteger("rotation-degrees", 0);
                        }
                        this.f1195CF.setInteger("color-format", Y.get(0).f1219CX);
                        String str3 = TAG;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("  Format: ");
                        sb3.append(this.f1195CF);
                        C0767k.m1801b(str3, sb3.toString());
                        MediaCodec createByCodecName = MediaCodec.createByCodecName(Y.get(0).f1218CW);
                        this.f1194CE = createByCodecName;
                        createByCodecName.configure(this.f1195CF, (Surface) null, (MediaCrypto) null, 0);
                        this.f1194CE.start();
                        this.f1191CB.mo11205c((long) Integer.parseInt(this.f1209Cy.extractMetadata(9)));
                        this.f1198CI.post(this.f1190CA);
                        return;
                    }
                    throw new RuntimeException("No decoder supported format 'COLOR_FormatYUV420SemiPlanar' found");
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append("No video track found in ");
                sb4.append(this.f1208Cx.getPath());
                throw new RuntimeException(sb4.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    private void m1053c(CameraType cameraType) {
        int i = 0;
        while (i < Camera.getNumberOfCameras()) {
            Camera.getCameraInfo(i, this.f1188Bl);
            if (this.f1188Bl.facing != cameraType.ordinal()) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: Y */
    private static List<C0538a> m1048Y(String str) {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        String str2;
        String str3 = str;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int length = supportedTypes.length;
                int i2 = 0;
                while (true) {
                    codecCapabilities = null;
                    if (i2 >= length) {
                        str2 = null;
                        break;
                    } else if (supportedTypes[i2].equals(str3)) {
                        str2 = codecInfoAt.getName();
                        break;
                    } else {
                        i2++;
                    }
                }
                if (str2 != null) {
                    String str4 = TAG;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Found candidate decoder ");
                    sb.append(str2);
                    C0767k.m1801b(str4, sb.toString());
                    try {
                        codecCapabilities = codecInfoAt.getCapabilitiesForType(str3);
                    } catch (Exception unused) {
                    }
                    if (codecCapabilities != null) {
                        for (int hexString : codecCapabilities.colorFormats) {
                            String str5 = TAG;
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("   Color: 0x");
                            sb2.append(Integer.toHexString(hexString));
                            C0767k.m1801b(str5, sb2.toString());
                        }
                        for (int i3 : f1187CT) {
                            for (int i4 : codecCapabilities.colorFormats) {
                                if (i4 == i3) {
                                    String str6 = TAG;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append("Found target decoder ");
                                    sb3.append(str2);
                                    sb3.append(". Color: 0x");
                                    sb3.append(Integer.toHexString(i4));
                                    C0767k.m1801b(str6, sb3.toString());
                                    arrayList.add(new C0538a(str2, i4));
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraPlayer$a */
    static class C0538a {

        /* renamed from: CW */
        public final String f1218CW;

        /* renamed from: CX */
        public final int f1219CX;

        C0538a(String str, int i) {
            this.f1218CW = str;
            this.f1219CX = i;
        }
    }

    /* renamed from: a */
    private int m1049a(MediaExtractor mediaExtractor) {
        int trackCount = mediaExtractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
            String string = trackFormat.getString("mime");
            if (string.startsWith("video/")) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append("Extractor selected track ");
                sb.append(i);
                sb.append(" (");
                sb.append(string);
                sb.append("): ");
                sb.append(trackFormat);
                C0767k.m1801b(str, sb.toString());
                return i;
            }
        }
        return -1;
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraPlayer$b */
    class C0539b implements Runnable {

        /* renamed from: CY */
        private boolean f1221CY;

        /* renamed from: CZ */
        boolean f1222CZ;

        private C0539b() {
            this.f1222CZ = false;
        }

        public void run() {
            this.f1222CZ = true;
            VideoPlayerCameraPlayer.this.m1059kf();
            if (!this.f1221CY) {
                VideoPlayerCameraPlayer.this.f1198CI.post(this);
            } else {
                this.f1222CZ = false;
            }
        }

        public void stop() {
            this.f1221CY = true;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01cb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01cd, code lost:
        return;
     */
    /* renamed from: kf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m1059kf() {
        /*
            r12 = this;
            monitor-enter(r12)
            boolean r0 = r12.f1189Bm     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x01cc
            android.media.MediaCodec r0 = r12.f1194CE     // Catch:{ all -> 0x01ce }
            if (r0 != 0) goto L_0x000b
            goto L_0x01cc
        L_0x000b:
            java.nio.ByteBuffer[] r0 = r12.f1199CJ     // Catch:{ all -> 0x01ce }
            if (r0 != 0) goto L_0x0017
            android.media.MediaCodec r0 = r12.f1194CE     // Catch:{ all -> 0x01ce }
            java.nio.ByteBuffer[] r0 = r0.getInputBuffers()     // Catch:{ all -> 0x01ce }
            r12.f1199CJ = r0     // Catch:{ all -> 0x01ce }
        L_0x0017:
            java.nio.ByteBuffer[] r0 = r12.f1200CK     // Catch:{ all -> 0x01ce }
            if (r0 != 0) goto L_0x0023
            android.media.MediaCodec r0 = r12.f1194CE     // Catch:{ all -> 0x01ce }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ all -> 0x01ce }
            r12.f1200CK = r0     // Catch:{ all -> 0x01ce }
        L_0x0023:
            boolean r0 = r12.f1203CN     // Catch:{ all -> 0x01ce }
            r1 = 10000(0x2710, double:4.9407E-320)
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0093
            android.media.MediaCodec r0 = r12.f1194CE     // Catch:{ all -> 0x01ce }
            int r6 = r0.dequeueInputBuffer(r1)     // Catch:{ all -> 0x01ce }
            if (r6 < 0) goto L_0x008c
            java.nio.ByteBuffer[] r0 = r12.f1199CJ     // Catch:{ all -> 0x01ce }
            r0 = r0[r6]     // Catch:{ all -> 0x01ce }
            android.media.MediaExtractor r5 = r12.f1193CD     // Catch:{ all -> 0x01ce }
            int r0 = r5.readSampleData(r0, r4)     // Catch:{ all -> 0x01ce }
            if (r0 >= 0) goto L_0x0053
            android.media.MediaCodec r5 = r12.f1194CE     // Catch:{ all -> 0x01ce }
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 4
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ all -> 0x01ce }
            r12.f1203CN = r3     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01ce }
            java.lang.String r5 = "sent input EOS"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r5)     // Catch:{ all -> 0x01ce }
            goto L_0x0093
        L_0x0053:
            android.media.MediaExtractor r5 = r12.f1193CD     // Catch:{ all -> 0x01ce }
            long r9 = r5.getSampleTime()     // Catch:{ all -> 0x01ce }
            android.media.MediaCodec r5 = r12.f1194CE     // Catch:{ all -> 0x01ce }
            r7 = 0
            r11 = 0
            r8 = r0
            r5.queueInputBuffer(r6, r7, r8, r9, r11)     // Catch:{ all -> 0x01ce }
            java.lang.String r5 = TAG     // Catch:{ all -> 0x01ce }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ce }
            r6.<init>()     // Catch:{ all -> 0x01ce }
            java.lang.String r7 = "submitted frame "
            r6.append(r7)     // Catch:{ all -> 0x01ce }
            int r7 = r12.f1202CM     // Catch:{ all -> 0x01ce }
            r6.append(r7)     // Catch:{ all -> 0x01ce }
            java.lang.String r7 = " to dec, size="
            r6.append(r7)     // Catch:{ all -> 0x01ce }
            r6.append(r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x01ce }
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r5, (java.lang.String) r0)     // Catch:{ all -> 0x01ce }
            int r0 = r12.f1202CM     // Catch:{ all -> 0x01ce }
            int r0 = r0 + r3
            r12.f1202CM = r0     // Catch:{ all -> 0x01ce }
            android.media.MediaExtractor r0 = r12.f1193CD     // Catch:{ all -> 0x01ce }
            r0.advance()     // Catch:{ all -> 0x01ce }
            goto L_0x0093
        L_0x008c:
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01ce }
            java.lang.String r5 = "input buffer not available"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r5)     // Catch:{ all -> 0x01ce }
        L_0x0093:
            android.media.MediaCodec r0 = r12.f1194CE     // Catch:{ all -> 0x01ce }
            android.media.MediaCodec$BufferInfo r5 = r12.f1201CL     // Catch:{ all -> 0x01ce }
            int r0 = r0.dequeueOutputBuffer(r5, r1)     // Catch:{ all -> 0x01ce }
            r1 = -1
            if (r0 != r1) goto L_0x00a7
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "no output from decoder available"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x01ce }
            goto L_0x0190
        L_0x00a7:
            r1 = -3
            if (r0 != r1) goto L_0x00bb
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "decoder output buffers changed"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x01ce }
            android.media.MediaCodec r0 = r12.f1194CE     // Catch:{ all -> 0x01ce }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ all -> 0x01ce }
            r12.f1200CK = r0     // Catch:{ all -> 0x01ce }
            goto L_0x0190
        L_0x00bb:
            r1 = -2
            if (r0 != r1) goto L_0x00dc
            android.media.MediaCodec r0 = r12.f1194CE     // Catch:{ all -> 0x01ce }
            android.media.MediaFormat r0 = r0.getOutputFormat()     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = TAG     // Catch:{ all -> 0x01ce }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ce }
            r2.<init>()     // Catch:{ all -> 0x01ce }
            java.lang.String r5 = "decoder output format changed: "
            r2.append(r5)     // Catch:{ all -> 0x01ce }
            r2.append(r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x01ce }
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r1, (java.lang.String) r0)     // Catch:{ all -> 0x01ce }
            goto L_0x0190
        L_0x00dc:
            if (r0 >= 0) goto L_0x00f5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ce }
            r1.<init>()     // Catch:{ all -> 0x01ce }
            java.lang.String r2 = "unexpected result from decoder.dequeueOutputBuffer: "
            r1.append(r2)     // Catch:{ all -> 0x01ce }
            r1.append(r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x01ce }
            com.kofax.mobile.sdk._internal.C0767k.m1794F(r0)     // Catch:{ all -> 0x01ce }
            goto L_0x0190
        L_0x00f5:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x01ce }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01ce }
            r2.<init>()     // Catch:{ all -> 0x01ce }
            java.lang.String r5 = "surface decoder given buffer "
            r2.append(r5)     // Catch:{ all -> 0x01ce }
            r2.append(r0)     // Catch:{ all -> 0x01ce }
            java.lang.String r5 = " (size="
            r2.append(r5)     // Catch:{ all -> 0x01ce }
            android.media.MediaCodec$BufferInfo r5 = r12.f1201CL     // Catch:{ all -> 0x01ce }
            int r5 = r5.size     // Catch:{ all -> 0x01ce }
            r2.append(r5)     // Catch:{ all -> 0x01ce }
            java.lang.String r5 = ")"
            r2.append(r5)     // Catch:{ all -> 0x01ce }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01ce }
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ all -> 0x01ce }
            com.kofax.mobile.sdk._internal.camera.t r1 = r12.f1191CB     // Catch:{ all -> 0x01ce }
            android.media.MediaCodec$BufferInfo r2 = r12.f1201CL     // Catch:{ all -> 0x01ce }
            long r5 = r2.presentationTimeUs     // Catch:{ all -> 0x01ce }
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            int r2 = r12.f1207CS     // Catch:{ all -> 0x01ce }
            r1.mo11203a(r5, r2)     // Catch:{ all -> 0x01ce }
        L_0x012a:
            android.media.MediaCodec$BufferInfo r1 = r12.f1201CL     // Catch:{ all -> 0x01ce }
            long r1 = r1.presentationTimeUs     // Catch:{ all -> 0x01ce }
            long r1 = r1 / r7
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01ce }
            long r9 = r12.f1204CO     // Catch:{ all -> 0x01ce }
            long r5 = r5 - r9
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0144
            r1 = 10
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0140 }
            goto L_0x012a
        L_0x0140:
            r1 = move-exception
            com.kofax.mobile.sdk._internal.C0767k.m1823e(r1)     // Catch:{ all -> 0x01ce }
        L_0x0144:
            if (r0 < 0) goto L_0x018b
            java.nio.ByteBuffer[] r1 = r12.f1200CK     // Catch:{ all -> 0x01ce }
            r1 = r1[r0]     // Catch:{ all -> 0x01ce }
            android.media.MediaCodec$BufferInfo r2 = r12.f1201CL     // Catch:{ all -> 0x01ce }
            int r2 = r2.offset     // Catch:{ all -> 0x01ce }
            r1.position(r2)     // Catch:{ all -> 0x01ce }
            android.media.MediaCodec$BufferInfo r2 = r12.f1201CL     // Catch:{ all -> 0x01ce }
            int r2 = r2.offset     // Catch:{ all -> 0x01ce }
            android.media.MediaCodec$BufferInfo r5 = r12.f1201CL     // Catch:{ all -> 0x01ce }
            int r5 = r5.size     // Catch:{ all -> 0x01ce }
            int r2 = r2 + r5
            r1.limit(r2)     // Catch:{ all -> 0x01ce }
            android.media.MediaCodec$BufferInfo r2 = r12.f1201CL     // Catch:{ all -> 0x01ce }
            int r2 = r2.size     // Catch:{ all -> 0x01ce }
            byte[] r2 = new byte[r2]     // Catch:{ all -> 0x01ce }
            r1.get(r2)     // Catch:{ all -> 0x01ce }
            r1.clear()     // Catch:{ all -> 0x01ce }
            int r1 = r12._width     // Catch:{ all -> 0x01ce }
            int r5 = r12._height     // Catch:{ all -> 0x01ce }
            byte[] r1 = r12.m1054c(r2, r1, r5)     // Catch:{ all -> 0x01ce }
            r12.m1055f(r1)     // Catch:{ all -> 0x01ce }
            r12.m1056g(r1)     // Catch:{ all -> 0x01ce }
            boolean r2 = com.kofax.mobile.sdk._internal.camera.CameraSourceParametersHolder.getDrawVideoFramesFlag()     // Catch:{ all -> 0x01ce }
            if (r2 == 0) goto L_0x0181
            r12.m1057h(r1)     // Catch:{ all -> 0x01ce }
            goto L_0x018b
        L_0x0181:
            r1 = 100
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x0187 }
            goto L_0x018b
        L_0x0187:
            r1 = move-exception
            com.kofax.mobile.sdk._internal.C0767k.m1823e(r1)     // Catch:{ all -> 0x01ce }
        L_0x018b:
            android.media.MediaCodec r1 = r12.f1194CE     // Catch:{ all -> 0x01ce }
            r1.releaseOutputBuffer(r0, r4)     // Catch:{ all -> 0x01ce }
        L_0x0190:
            boolean r0 = r12.f1192CC     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x01ca
            boolean r0 = r12.f1203CN     // Catch:{ all -> 0x01ce }
            if (r0 != 0) goto L_0x01a0
            android.media.MediaCodec$BufferInfo r0 = r12.f1201CL     // Catch:{ all -> 0x01ce }
            int r0 = r0.flags     // Catch:{ all -> 0x01ce }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x01ca
        L_0x01a0:
            java.lang.String r0 = TAG     // Catch:{ all -> 0x01ce }
            java.lang.String r1 = "Reached end of stream, looping"
            com.kofax.mobile.sdk._internal.C0767k.m1801b((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ all -> 0x01ce }
            android.media.MediaExtractor r0 = r12.f1193CD     // Catch:{ all -> 0x01ce }
            r1 = 0
            r5 = 2
            r0.seekTo(r1, r5)     // Catch:{ all -> 0x01ce }
            android.media.MediaCodec r0 = r12.f1194CE     // Catch:{ all -> 0x01ce }
            r0.flush()     // Catch:{ all -> 0x01ce }
            int r0 = r12.f1207CS     // Catch:{ all -> 0x01ce }
            int r0 = r0 + r3
            r12.f1207CS = r0     // Catch:{ all -> 0x01ce }
            r12.f1203CN = r4     // Catch:{ all -> 0x01ce }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x01ce }
            r12.f1204CO = r0     // Catch:{ all -> 0x01ce }
            com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraPlayer$OnCompleteListener r0 = r12.f1212ti     // Catch:{ all -> 0x01ce }
            if (r0 == 0) goto L_0x01ca
            com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraPlayer$OnCompleteListener r0 = r12.f1212ti     // Catch:{ all -> 0x01ce }
            r0.onComplete()     // Catch:{ all -> 0x01ce }
        L_0x01ca:
            monitor-exit(r12)
            return
        L_0x01cc:
            monitor-exit(r12)
            return
        L_0x01ce:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraPlayer.m1059kf():void");
    }

    /* renamed from: f */
    private void m1055f(byte[] bArr) {
        C0508p kg = m1060kg();
        if (kg != null && bArr != null) {
            byte[] bArr2 = this.f1197CH;
            if (bArr2 != null) {
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            }
            kg.onPreviewFrame(bArr, this._width, this._height);
        }
    }

    /* renamed from: g */
    private void m1056g(byte[] bArr) {
        C0540c cVar = this.f1206CQ;
        if (cVar != null) {
            if (cVar.f1223Da != null) {
                this.f1206CQ.f1223Da.onShutter();
            }
            if (!(bArr == null || this.f1206CQ.f1224Db == null)) {
                this.f1206CQ.f1224Db.mo11199b(bArr, 17, this._width, this._height);
            }
            this.f1206CQ = null;
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.graphics.Rect] */
    /* JADX WARNING: type inference failed for: r0v3, types: [android.graphics.Canvas] */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0060, code lost:
        if (r0 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0073, code lost:
        r8.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0076, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1057h(byte[] r8) {
        /*
            r7 = this;
            int r0 = r7._width
            int r1 = r7._height
            android.graphics.Bitmap r8 = r7.mo11414b(r8, r0, r1)
            r0 = 0
            android.view.SurfaceHolder r1 = r7.f1210Cz     // Catch:{ Exception -> 0x0068 }
            android.graphics.Canvas r0 = r1.lockCanvas(r0)     // Catch:{ Exception -> 0x0068 }
            android.view.SurfaceHolder r1 = r7.f1210Cz     // Catch:{ Exception -> 0x0068 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x0068 }
            android.graphics.RectF r2 = new android.graphics.RectF     // Catch:{ all -> 0x0063 }
            int r3 = r7._width     // Catch:{ all -> 0x0063 }
            float r3 = (float) r3     // Catch:{ all -> 0x0063 }
            int r4 = r7._height     // Catch:{ all -> 0x0063 }
            float r4 = (float) r4     // Catch:{ all -> 0x0063 }
            r5 = 0
            r2.<init>(r5, r5, r3, r4)     // Catch:{ all -> 0x0063 }
            android.graphics.Matrix r3 = new android.graphics.Matrix     // Catch:{ all -> 0x0063 }
            r3.<init>()     // Catch:{ all -> 0x0063 }
            boolean r4 = r7.mo11172bm()     // Catch:{ all -> 0x0063 }
            if (r4 == 0) goto L_0x002e
            int r4 = r7.getOrientation()     // Catch:{ all -> 0x0063 }
            goto L_0x0030
        L_0x002e:
            int r4 = r7.f1205CP     // Catch:{ all -> 0x0063 }
        L_0x0030:
            float r4 = (float) r4     // Catch:{ all -> 0x0063 }
            r3.postRotate(r4)     // Catch:{ all -> 0x0063 }
            r3.mapRect(r2)     // Catch:{ all -> 0x0063 }
            float r4 = r2.left     // Catch:{ all -> 0x0063 }
            float r4 = -r4
            float r6 = r2.top     // Catch:{ all -> 0x0063 }
            float r6 = -r6
            r3.postTranslate(r4, r6)     // Catch:{ all -> 0x0063 }
            int r4 = r0.getWidth()     // Catch:{ all -> 0x0063 }
            float r4 = (float) r4     // Catch:{ all -> 0x0063 }
            float r6 = r2.width()     // Catch:{ all -> 0x0063 }
            float r4 = r4 / r6
            int r6 = r0.getHeight()     // Catch:{ all -> 0x0063 }
            float r6 = (float) r6     // Catch:{ all -> 0x0063 }
            float r2 = r2.height()     // Catch:{ all -> 0x0063 }
            float r6 = r6 / r2
            r3.postScale(r4, r6)     // Catch:{ all -> 0x0063 }
            r0.concat(r3)     // Catch:{ all -> 0x0063 }
            android.graphics.Paint r2 = r7.f1211Q     // Catch:{ all -> 0x0063 }
            r0.drawBitmap(r8, r5, r5, r2)     // Catch:{ all -> 0x0063 }
            monitor-exit(r1)
            if (r0 == 0) goto L_0x0073
            goto L_0x006e
        L_0x0063:
            r2 = move-exception
            monitor-exit(r1)
            throw r2     // Catch:{ Exception -> 0x0068 }
        L_0x0066:
            r8 = move-exception
            goto L_0x0077
        L_0x0068:
            r1 = move-exception
            r1.printStackTrace()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0073
        L_0x006e:
            android.view.SurfaceHolder r1 = r7.f1210Cz
            r1.unlockCanvasAndPost(r0)
        L_0x0073:
            r8.recycle()
            return
        L_0x0077:
            if (r0 == 0) goto L_0x007e
            android.view.SurfaceHolder r1 = r7.f1210Cz
            r1.unlockCanvasAndPost(r0)
        L_0x007e:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraPlayer.m1057h(byte[]):void");
    }

    /* renamed from: b */
    public final Bitmap mo11414b(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new YuvImage(bArr, 17, i, i2, (int[]) null).compressToJpeg(new Rect(0, 0, i, i2), 50, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    /* renamed from: c */
    private byte[] m1054c(byte[] bArr, int i, int i2) {
        int i3 = i * i2;
        int length = bArr.length;
        int i4 = i3 / 2;
        int i5 = i3 + i4;
        byte[] bArr2 = new byte[i5];
        System.arraycopy(bArr, 0, bArr2, 0, i3);
        System.arraycopy(bArr, ((length - i3) - i4) + i3, bArr2, i3, i4);
        while (i3 < i5) {
            int i6 = i3 + 1;
            byte b = bArr2[i6];
            bArr2[i6] = bArr2[i3];
            bArr2[i3] = b;
            i3 += 2;
        }
        return bArr2;
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraPlayer$c */
    static class C0540c {

        /* renamed from: Da */
        public final C0510s f1223Da;

        /* renamed from: Db */
        public final C0507o f1224Db;

        private C0540c(C0510s sVar, C0507o oVar) {
            this.f1223Da = sVar;
            this.f1224Db = oVar;
        }
    }

    /* renamed from: a */
    private void m1050a(C0508p pVar) {
        this.f1196CG = pVar;
    }

    /* renamed from: i */
    private void m1058i(byte[] bArr) {
        this.f1197CH = bArr;
    }

    /* renamed from: kg */
    private C0508p m1060kg() {
        return this.f1196CG;
    }

    public final void stopPreview() {
        synchronized (this) {
            if (this.f1194CE != null) {
                this.f1194CE.stop();
                this.f1194CE.release();
                this.f1194CE = null;
            }
            this.f1190CA.stop();
            this.f1198CI.removeCallbacks(this.f1190CA);
            this.f1191CB.stop();
        }
    }

    /* renamed from: a */
    public final void mo11169a(C0508p pVar, byte[] bArr) {
        m1050a(pVar);
        m1058i(bArr);
    }

    /* renamed from: a */
    public final void mo11168a(final C0505k kVar) {
        this.f1191CB.mo11206c((C0505k) new C0505k() {
            /* renamed from: k */
            public void mo11197k(boolean z) {
                kVar.mo11197k(z);
            }
        });
    }

    /* renamed from: a */
    public final void mo11166a(C0497c cVar) {
        this.f1191CB.mo11204a(cVar);
    }

    public final void setDisplayOrientation(int i) {
        this.f1205CP = i;
    }

    /* renamed from: a */
    public final void mo11170a(C0510s sVar, C0507o oVar) {
        C0767k.m1794F("takePicture");
        this.f1206CQ = new C0540c(sVar, oVar);
    }

    public final void setPreviewDisplay(SurfaceHolder surfaceHolder) {
        this.f1210Cz = surfaceHolder;
    }

    /* renamed from: bh */
    public final Flash mo11150bh() {
        return Flash.OFF;
    }

    public final List<C7889a> getFocusAreas() {
        return new ArrayList();
    }

    /* renamed from: bi */
    public final C0496b mo11151bi() {
        return C0496b.AUTO;
    }

    /* renamed from: bj */
    public final Point mo11152bj() {
        return new Point(Integer.valueOf(this.f1209Cy.extractMetadata(18)).intValue(), Integer.valueOf(this.f1209Cy.extractMetadata(19)).intValue());
    }

    /* renamed from: bk */
    public final Point mo11153bk() {
        return mo11152bj();
    }

    public final List<C0496b> getSupportedFocusModes() {
        return new ArrayList<C0496b>() {
            {
                add(C0496b.AUTO);
            }
        };
    }

    public final List<Flash> getSupportedFlashModes() {
        return new ArrayList<Flash>() {
            {
                add(Flash.OFF);
            }
        };
    }

    public final List<Point> getSupportedPictureSizes() {
        return new ArrayList<Point>() {
            {
                add(VideoPlayerCameraPlayer.this.mo11152bj());
            }
        };
    }

    public final List<Point> getSupportedPreviewSizes() {
        return new ArrayList<Point>() {
            {
                add(VideoPlayerCameraPlayer.this.mo11152bj());
            }
        };
    }
}
