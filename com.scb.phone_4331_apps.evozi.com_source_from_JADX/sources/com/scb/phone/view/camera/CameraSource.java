package com.scb.phone.view.camera;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.images.Size;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.validateCommercialEligibility;

public final class CameraSource {
    Context IconCompatParcelizer;
    public Camera MediaBrowserCompat$CustomActionResultReceiver;
    Map<byte[], ByteBuffer> MediaBrowserCompat$ItemReceiver;
    Size MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public float f3068x50fd9e4a;
    public int MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public int MediaSessionCompat$QueueItem;
    private Thread MediaSessionCompat$Token;
    public int ParcelableVolumeInfo;
    public write RatingCompat;
    public final Object read;
    public Camera.AutoFocusCallback write;

    /* synthetic */ CameraSource(byte b) {
        this();
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
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0124  */
    public final com.scb.phone.view.camera.CameraSource MediaBrowserCompat$CustomActionResultReceiver(android.view.SurfaceHolder r10) throws java.io.IOException {
        /*
            r9 = this;
            java.lang.Object r0 = r9.read
            monitor-enter(r0)
            android.hardware.Camera r1 = r9.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x01b8 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return r9
        L_0x0009:
            android.hardware.Camera$CameraInfo r1 = new android.hardware.Camera$CameraInfo     // Catch:{ all -> 0x01b8 }
            r1.<init>()     // Catch:{ all -> 0x01b8 }
            r2 = 0
            r3 = r2
        L_0x0010:
            int r4 = android.hardware.Camera.getNumberOfCameras()     // Catch:{ all -> 0x01b8 }
            r5 = -1
            if (r3 >= r4) goto L_0x0022
            android.hardware.Camera.getCameraInfo(r3, r1)     // Catch:{ all -> 0x01b8 }
            int r4 = r1.facing     // Catch:{ all -> 0x01b8 }
            if (r4 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r3 = r3 + 1
            goto L_0x0010
        L_0x0022:
            r3 = r5
        L_0x0023:
            if (r3 == r5) goto L_0x01b0
            android.hardware.Camera r1 = android.hardware.Camera.open(r3)     // Catch:{ all -> 0x01b8 }
            int r4 = r9.ParcelableVolumeInfo     // Catch:{ all -> 0x01b8 }
            int r5 = r9.MediaSessionCompat$QueueItem     // Catch:{ all -> 0x01b8 }
            com.scb.phone.view.camera.CameraSource$read r4 = MediaBrowserCompat$CustomActionResultReceiver(r1, r4, r5)     // Catch:{ all -> 0x01b8 }
            if (r4 == 0) goto L_0x01a8
            com.google.android.gms.common.images.Size r5 = r4.read     // Catch:{ all -> 0x01b8 }
            com.google.android.gms.common.images.Size r4 = r4.MediaBrowserCompat$ItemReceiver     // Catch:{ all -> 0x01b8 }
            r9.MediaBrowserCompat$MediaItem = r4     // Catch:{ all -> 0x01b8 }
            float r4 = r9.f3068x50fd9e4a     // Catch:{ all -> 0x01b8 }
            int[] r4 = MediaBrowserCompat$ItemReceiver(r1, r4)     // Catch:{ all -> 0x01b8 }
            if (r4 == 0) goto L_0x01a0
            android.hardware.Camera$Parameters r6 = r1.getParameters()     // Catch:{ all -> 0x01b8 }
            if (r5 == 0) goto L_0x0052
            int r7 = r5.getWidth()     // Catch:{ all -> 0x01b8 }
            int r5 = r5.getHeight()     // Catch:{ all -> 0x01b8 }
            r6.setPictureSize(r7, r5)     // Catch:{ all -> 0x01b8 }
        L_0x0052:
            com.google.android.gms.common.images.Size r5 = r9.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x01b8 }
            int r5 = r5.getWidth()     // Catch:{ all -> 0x01b8 }
            com.google.android.gms.common.images.Size r7 = r9.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x01b8 }
            int r7 = r7.getHeight()     // Catch:{ all -> 0x01b8 }
            r6.setPreviewSize(r5, r7)     // Catch:{ all -> 0x01b8 }
            r5 = r4[r2]     // Catch:{ all -> 0x01b8 }
            r7 = 1
            r4 = r4[r7]     // Catch:{ all -> 0x01b8 }
            r6.setPreviewFpsRange(r5, r4)     // Catch:{ all -> 0x01b8 }
            r4 = 17
            r6.setPreviewFormat(r4)     // Catch:{ all -> 0x01b8 }
            android.content.Context r4 = r9.IconCompatParcelizer     // Catch:{ all -> 0x01b8 }
            java.lang.String r5 = "window"
            java.lang.Object r4 = r4.getSystemService(r5)     // Catch:{ all -> 0x01b8 }
            android.view.WindowManager r4 = (android.view.WindowManager) r4     // Catch:{ all -> 0x01b8 }
            android.view.Display r4 = r4.getDefaultDisplay()     // Catch:{ all -> 0x01b8 }
            int r4 = r4.getRotation()     // Catch:{ all -> 0x01b8 }
            if (r4 == 0) goto L_0x00aa
            if (r4 == r7) goto L_0x00a7
            r5 = 2
            if (r4 == r5) goto L_0x00a4
            r5 = 3
            if (r4 == r5) goto L_0x00a1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b8 }
            r5.<init>()     // Catch:{ all -> 0x01b8 }
            java.lang.String r8 = "Bad rotation value: "
            r5.append(r8)     // Catch:{ all -> 0x01b8 }
            r5.append(r4)     // Catch:{ all -> 0x01b8 }
            java.lang.String r4 = "OpenCameraSource"
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01b8 }
            android.util.Log.e(r4, r5)     // Catch:{ all -> 0x01b8 }
            goto L_0x00aa
        L_0x00a1:
            r4 = 270(0x10e, float:3.78E-43)
            goto L_0x00ab
        L_0x00a4:
            r4 = 180(0xb4, float:2.52E-43)
            goto L_0x00ab
        L_0x00a7:
            r4 = 90
            goto L_0x00ab
        L_0x00aa:
            r4 = r2
        L_0x00ab:
            android.hardware.Camera$CameraInfo r5 = new android.hardware.Camera$CameraInfo     // Catch:{ all -> 0x01b8 }
            r5.<init>()     // Catch:{ all -> 0x01b8 }
            android.hardware.Camera.getCameraInfo(r3, r5)     // Catch:{ all -> 0x01b8 }
            int r3 = r5.facing     // Catch:{ all -> 0x01b8 }
            if (r3 != r7) goto L_0x00c1
            int r3 = r5.orientation     // Catch:{ all -> 0x01b8 }
            int r3 = r3 + r4
            int r3 = r3 % 360
            int r4 = 360 - r3
            int r4 = r4 % 360
            goto L_0x00c9
        L_0x00c1:
            int r3 = r5.orientation     // Catch:{ all -> 0x01b8 }
            int r3 = r3 - r4
            int r3 = r3 + 360
            int r3 = r3 % 360
            r4 = r3
        L_0x00c9:
            r1.setDisplayOrientation(r4)     // Catch:{ all -> 0x01b8 }
            r6.setRotation(r3)     // Catch:{ all -> 0x01b8 }
            java.lang.String r3 = r9.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x01b8 }
            if (r3 == 0) goto L_0x0102
            java.util.List r3 = r6.getSupportedFocusModes()     // Catch:{ all -> 0x01b8 }
            java.lang.String r4 = r9.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x01b8 }
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x01b8 }
            if (r3 == 0) goto L_0x00e5
            java.lang.String r3 = r9.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x01b8 }
            r6.setFocusMode(r3)     // Catch:{ all -> 0x01b8 }
            goto L_0x0102
        L_0x00e5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b8 }
            r3.<init>()     // Catch:{ all -> 0x01b8 }
            java.lang.String r4 = "Camera focus mode: "
            r3.append(r4)     // Catch:{ all -> 0x01b8 }
            java.lang.String r4 = r9.MediaBrowserCompat$SearchResultReceiver     // Catch:{ all -> 0x01b8 }
            r3.append(r4)     // Catch:{ all -> 0x01b8 }
            java.lang.String r4 = " is not supported on this device."
            r3.append(r4)     // Catch:{ all -> 0x01b8 }
            java.lang.String r4 = "OpenCameraSource"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01b8 }
            android.util.Log.i(r4, r3)     // Catch:{ all -> 0x01b8 }
        L_0x0102:
            java.lang.String r3 = r6.getFocusMode()     // Catch:{ all -> 0x01b8 }
            r9.MediaBrowserCompat$SearchResultReceiver = r3     // Catch:{ all -> 0x01b8 }
            java.lang.String r3 = r9.MediaMetadataCompat     // Catch:{ all -> 0x01b8 }
            if (r3 == 0) goto L_0x0141
            java.util.List r3 = r6.getSupportedFlashModes()     // Catch:{ all -> 0x01b8 }
            if (r3 == 0) goto L_0x0141
            java.util.List r3 = r6.getSupportedFlashModes()     // Catch:{ all -> 0x01b8 }
            java.lang.String r4 = r9.MediaMetadataCompat     // Catch:{ all -> 0x01b8 }
            boolean r3 = r3.contains(r4)     // Catch:{ all -> 0x01b8 }
            if (r3 == 0) goto L_0x0124
            java.lang.String r3 = r9.MediaMetadataCompat     // Catch:{ all -> 0x01b8 }
            r6.setFlashMode(r3)     // Catch:{ all -> 0x01b8 }
            goto L_0x0141
        L_0x0124:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b8 }
            r3.<init>()     // Catch:{ all -> 0x01b8 }
            java.lang.String r4 = "Camera flash mode: "
            r3.append(r4)     // Catch:{ all -> 0x01b8 }
            java.lang.String r4 = r9.MediaMetadataCompat     // Catch:{ all -> 0x01b8 }
            r3.append(r4)     // Catch:{ all -> 0x01b8 }
            java.lang.String r4 = " is not supported on this device."
            r3.append(r4)     // Catch:{ all -> 0x01b8 }
            java.lang.String r4 = "OpenCameraSource"
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01b8 }
            android.util.Log.i(r4, r3)     // Catch:{ all -> 0x01b8 }
        L_0x0141:
            java.lang.String r3 = r6.getFlashMode()     // Catch:{ all -> 0x01b8 }
            r9.MediaMetadataCompat = r3     // Catch:{ all -> 0x01b8 }
            r1.setParameters(r6)     // Catch:{ all -> 0x01b8 }
            com.scb.phone.view.camera.CameraSource$IconCompatParcelizer r3 = new com.scb.phone.view.camera.CameraSource$IconCompatParcelizer     // Catch:{ all -> 0x01b8 }
            r3.<init>(r9, r2)     // Catch:{ all -> 0x01b8 }
            r1.setPreviewCallbackWithBuffer(r3)     // Catch:{ all -> 0x01b8 }
            com.google.android.gms.common.images.Size r2 = r9.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x01b8 }
            byte[] r2 = r9.write(r2)     // Catch:{ all -> 0x01b8 }
            r1.addCallbackBuffer(r2)     // Catch:{ all -> 0x01b8 }
            com.google.android.gms.common.images.Size r2 = r9.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x01b8 }
            byte[] r2 = r9.write(r2)     // Catch:{ all -> 0x01b8 }
            r1.addCallbackBuffer(r2)     // Catch:{ all -> 0x01b8 }
            com.google.android.gms.common.images.Size r2 = r9.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x01b8 }
            byte[] r2 = r9.write(r2)     // Catch:{ all -> 0x01b8 }
            r1.addCallbackBuffer(r2)     // Catch:{ all -> 0x01b8 }
            com.google.android.gms.common.images.Size r2 = r9.MediaBrowserCompat$MediaItem     // Catch:{ all -> 0x01b8 }
            byte[] r2 = r9.write(r2)     // Catch:{ all -> 0x01b8 }
            r1.addCallbackBuffer(r2)     // Catch:{ all -> 0x01b8 }
            r9.MediaBrowserCompat$CustomActionResultReceiver = r1     // Catch:{ all -> 0x01b8 }
            r1.setPreviewDisplay(r10)     // Catch:{ all -> 0x01b8 }
            android.hardware.Camera r10 = r9.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x01b8 }
            r10.startPreview()     // Catch:{ all -> 0x01b8 }
            java.lang.Thread r10 = new java.lang.Thread     // Catch:{ all -> 0x01b8 }
            com.scb.phone.view.camera.CameraSource$write r1 = r9.RatingCompat     // Catch:{ all -> 0x01b8 }
            r10.<init>(r1)     // Catch:{ all -> 0x01b8 }
            r9.MediaSessionCompat$Token = r10     // Catch:{ all -> 0x01b8 }
            com.scb.phone.view.camera.CameraSource$write r10 = r9.RatingCompat     // Catch:{ all -> 0x01b8 }
            java.lang.Object r1 = r10.IconCompatParcelizer     // Catch:{ all -> 0x01b8 }
            monitor-enter(r1)     // Catch:{ all -> 0x01b8 }
            r10.MediaBrowserCompat$CustomActionResultReceiver = r7     // Catch:{ all -> 0x019d }
            java.lang.Object r10 = r10.IconCompatParcelizer     // Catch:{ all -> 0x019d }
            r10.notifyAll()     // Catch:{ all -> 0x019d }
            monitor-exit(r1)     // Catch:{ all -> 0x01b8 }
            java.lang.Thread r10 = r9.MediaSessionCompat$Token     // Catch:{ all -> 0x01b8 }
            r10.start()     // Catch:{ all -> 0x01b8 }
            monitor-exit(r0)
            return r9
        L_0x019d:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x01b8 }
            throw r10     // Catch:{ all -> 0x01b8 }
        L_0x01a0:
            com.scb.phone.view.camera.CameraSource$CameraSourceException r10 = new com.scb.phone.view.camera.CameraSource$CameraSourceException     // Catch:{ all -> 0x01b8 }
            java.lang.String r1 = "Could not find suitable preview frames per second range."
            r10.<init>(r1)     // Catch:{ all -> 0x01b8 }
            throw r10     // Catch:{ all -> 0x01b8 }
        L_0x01a8:
            com.scb.phone.view.camera.CameraSource$CameraSourceException r10 = new com.scb.phone.view.camera.CameraSource$CameraSourceException     // Catch:{ all -> 0x01b8 }
            java.lang.String r1 = "Could not find suitable preview size."
            r10.<init>(r1)     // Catch:{ all -> 0x01b8 }
            throw r10     // Catch:{ all -> 0x01b8 }
        L_0x01b0:
            com.scb.phone.view.camera.CameraSource$CameraSourceException r10 = new com.scb.phone.view.camera.CameraSource$CameraSourceException     // Catch:{ all -> 0x01b8 }
            java.lang.String r1 = "Could not find requested camera."
            r10.<init>(r1)     // Catch:{ all -> 0x01b8 }
            throw r10     // Catch:{ all -> 0x01b8 }
        L_0x01b8:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.camera.CameraSource.MediaBrowserCompat$CustomActionResultReceiver(android.view.SurfaceHolder):com.scb.phone.view.camera.CameraSource");
    }

    public static int read(int i) {
        if (Math.abs(i) + CipherSuite.TLS_RSA_WITH_SEED_CBC_SHA > 1000) {
            return i > 0 ? 850 : -850;
        }
        return i - 150;
    }

    public final void IconCompatParcelizer() {
        synchronized (this.read) {
            write write2 = this.RatingCompat;
            synchronized (write2.IconCompatParcelizer) {
                write2.MediaBrowserCompat$CustomActionResultReceiver = false;
                write2.IconCompatParcelizer.notifyAll();
            }
            if (this.MediaSessionCompat$Token != null) {
                try {
                    this.MediaSessionCompat$Token.join();
                } catch (InterruptedException unused) {
                    Log.d("OpenCameraSource", "Frame processing thread interrupted on release.");
                    Thread.currentThread().interrupt();
                }
                this.MediaSessionCompat$Token = null;
            }
            this.MediaBrowserCompat$ItemReceiver.clear();
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

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean IconCompatParcelizer(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.read
            monitor-enter(r0)
            android.hardware.Camera r1 = r3.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0027 }
            if (r1 == 0) goto L_0x0024
            android.hardware.Camera r1 = r3.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0027 }
            android.hardware.Camera$Parameters r1 = r1.getParameters()     // Catch:{ all -> 0x0027 }
            java.util.List r2 = r1.getSupportedFlashModes()     // Catch:{ all -> 0x0027 }
            boolean r2 = r2.contains(r4)     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x0024
            r1.setFlashMode(r4)     // Catch:{ all -> 0x0027 }
            android.hardware.Camera r2 = r3.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0027 }
            r2.setParameters(r1)     // Catch:{ all -> 0x0027 }
            r3.MediaMetadataCompat = r4     // Catch:{ all -> 0x0027 }
            monitor-exit(r0)
            r4 = 1
            return r4
        L_0x0024:
            monitor-exit(r0)
            r4 = 0
            return r4
        L_0x0027:
            r4 = move-exception
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.camera.CameraSource.IconCompatParcelizer(java.lang.String):boolean");
    }

    private CameraSource() {
        this.read = new Object();
        this.MediaDescriptionCompat = 0;
        this.f3068x50fd9e4a = 30.0f;
        this.ParcelableVolumeInfo = 1024;
        this.MediaSessionCompat$QueueItem = 768;
        this.MediaBrowserCompat$SearchResultReceiver = null;
        this.MediaMetadataCompat = null;
        this.MediaBrowserCompat$ItemReceiver = new HashMap();
        this.write = new validateCommercialEligibility(this);
    }

    static class read {
        Size MediaBrowserCompat$ItemReceiver;
        Size read;

        public read(Camera.Size size, Camera.Size size2) {
            this.MediaBrowserCompat$ItemReceiver = new Size(size.width, size.height);
            if (size2 != null) {
                this.read = new Size(size2.width, size2.height);
            }
        }
    }

    private static int[] MediaBrowserCompat$ItemReceiver(Camera camera, float f) {
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

    private byte[] write(Size size) {
        byte[] bArr = new byte[(((int) Math.ceil(((double) (((long) (size.getHeight() * size.getWidth())) * ((long) ImageFormat.getBitsPerPixel(17)))) / 8.0d)) + 1)];
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        if (!wrap.hasArray() || wrap.array() != bArr) {
            throw new IllegalStateException("Failed to create valid buffer for camera source.");
        }
        this.MediaBrowserCompat$ItemReceiver.put(bArr, wrap);
        return bArr;
    }

    class IconCompatParcelizer implements Camera.PreviewCallback {
        private IconCompatParcelizer() {
        }

        /* synthetic */ IconCompatParcelizer(CameraSource cameraSource, byte b) {
            this();
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            write write = CameraSource.this.RatingCompat;
            synchronized (write.IconCompatParcelizer) {
                if (write.read != null) {
                    camera.addCallbackBuffer(write.read.array());
                    write.read = null;
                }
                if (!CameraSource.this.MediaBrowserCompat$ItemReceiver.containsKey(bArr)) {
                    Log.d("OpenCameraSource", "Skipping frame.  Could not find ByteBuffer associated with the image data from the camera.");
                    return;
                }
                write.MediaBrowserCompat$ItemReceiver++;
                write.read = CameraSource.this.MediaBrowserCompat$ItemReceiver.get(bArr);
                write.write = bArr;
                write.IconCompatParcelizer.notifyAll();
            }
        }
    }

    public class write implements Runnable {
        final Object IconCompatParcelizer = new Object();
        boolean MediaBrowserCompat$CustomActionResultReceiver = true;
        int MediaBrowserCompat$ItemReceiver = 0;
        private CameraSource$MediaBrowserCompat$ItemReceiver MediaMetadataCompat;
        ByteBuffer read;
        byte[] write;

        public write(CameraSource$MediaBrowserCompat$ItemReceiver cameraSource$MediaBrowserCompat$ItemReceiver) {
            this.MediaMetadataCompat = cameraSource$MediaBrowserCompat$ItemReceiver;
        }

        public final void run() {
            int width;
            int height;
            byte[] bArr;
            ByteBuffer byteBuffer;
            while (true) {
                synchronized (this.IconCompatParcelizer) {
                    while (this.MediaBrowserCompat$CustomActionResultReceiver && this.read == null) {
                        try {
                            this.IconCompatParcelizer.wait();
                        } catch (InterruptedException e) {
                            Log.d("OpenCameraSource", "Frame processing loop terminated.", e);
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                        width = CameraSource.this.MediaBrowserCompat$MediaItem.getWidth();
                        height = CameraSource.this.MediaBrowserCompat$MediaItem.getHeight();
                        bArr = this.write;
                        byteBuffer = this.read;
                        this.read = null;
                    } else {
                        return;
                    }
                }
                this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(width, height, bArr);
                CameraSource.this.MediaBrowserCompat$CustomActionResultReceiver.addCallbackBuffer(byteBuffer.array());
            }
        }
    }

    public class CameraSourceException extends RuntimeException {
        public CameraSourceException(String str) {
            super(str);
        }
    }

    private static read MediaBrowserCompat$CustomActionResultReceiver(Camera camera, int i, int i2) {
        Camera.Parameters parameters = camera.getParameters();
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        ArrayList<read> arrayList = new ArrayList<>();
        for (Camera.Size next : supportedPreviewSizes) {
            float f = ((float) next.width) / ((float) next.height);
            Iterator<Camera.Size> it = supportedPictureSizes.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Camera.Size next2 = it.next();
                if (Math.abs(f - (((float) next2.width) / ((float) next2.height))) < 0.01f) {
                    arrayList.add(new read(next, next2));
                    break;
                }
            }
        }
        read read2 = null;
        if (arrayList.isEmpty()) {
            Log.w("OpenCameraSource", "No preview sizes have a corresponding same-aspect-ratio picture size");
            for (Camera.Size read3 : supportedPreviewSizes) {
                arrayList.add(new read(read3, (Camera.Size) null));
            }
        }
        int i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (read read4 : arrayList) {
            Size size = read4.MediaBrowserCompat$ItemReceiver;
            int abs = Math.abs(size.getHeight() - i2) + Math.abs(size.getWidth() - i);
            if (abs < i3) {
                read2 = read4;
                i3 = abs;
            }
        }
        return read2;
    }
}
