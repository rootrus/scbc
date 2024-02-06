package p040o;

import com.scb.phone.view.activity.ndid.NationalIdCameraActivity;
import java.lang.ref.WeakReference;

/* renamed from: o.copyDateTo */
public final class copyDateTo {
    /* access modifiers changed from: private */
    public static final String[] read = {"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004d, code lost:
        if (r5 != 0) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058 A[Catch:{ CameraAccessException -> 0x005f }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059 A[Catch:{ CameraAccessException -> 0x005f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void MediaBrowserCompat$ItemReceiver(com.scb.phone.view.activity.ndid.NationalIdCameraActivity r12) {
        /*
            java.lang.String r0 = "continuous-picture"
            java.lang.String[] r1 = read
            boolean r1 = p040o.ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$ItemReceiver(r12, r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x01d7
            int r1 = r12.MediaSessionCompat$Token
            if (r1 > 0) goto L_0x0014
            int r1 = r12.MediaBrowserCompat$SearchResultReceiver
            if (r1 <= 0) goto L_0x01d6
        L_0x0014:
            boolean r1 = r12.MediaBrowserCompat$MediaItem
            if (r1 != 0) goto L_0x0146
            com.scb.phone.view.camera.CameraApi2 r0 = r12.MediaDescriptionCompat     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            android.view.TextureView r1 = r12.textureView     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            int r4 = r12.MediaSessionCompat$Token     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            int r5 = r12.MediaBrowserCompat$SearchResultReceiver     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            android.content.Context r6 = r0.MediaSessionCompat$Token     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            java.lang.String r7 = "android.permission.CAMERA"
            int r6 = p040o.AppCompatRatingBar.MediaBrowserCompat$ItemReceiver(r6, r7)     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            if (r6 != 0) goto L_0x013c
            r0.AlertController$RecycleListView = r4     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            r0.setHasDecor = r5     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            android.util.SparseArray r4 = r0.IconCompatParcelizer()     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            java.lang.Object r4 = r4.get(r2)     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            android.hardware.camera2.CameraManager r5 = r0.MediaDescriptionCompat     // Catch:{ CameraAccessException -> 0x005f }
            android.hardware.camera2.CameraCharacteristics r5 = r5.getCameraCharacteristics(r4)     // Catch:{ CameraAccessException -> 0x005f }
            android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ CameraAccessException -> 0x005f }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ CameraAccessException -> 0x005f }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ CameraAccessException -> 0x005f }
            int r5 = r5.intValue()     // Catch:{ CameraAccessException -> 0x005f }
            r6 = 2
            if (r5 != r6) goto L_0x0053
            if (r5 == 0) goto L_0x0051
        L_0x004f:
            r5 = r3
            goto L_0x0056
        L_0x0051:
            r5 = r2
            goto L_0x0056
        L_0x0053:
            if (r5 < 0) goto L_0x004f
            goto L_0x0051
        L_0x0056:
            if (r5 == 0) goto L_0x0059
            goto L_0x0063
        L_0x0059:
            com.scb.phone.view.camera.CameraApi2$CameraHardwareNotSupportException r5 = new com.scb.phone.view.camera.CameraApi2$CameraHardwareNotSupportException     // Catch:{ CameraAccessException -> 0x005f }
            r5.<init>()     // Catch:{ CameraAccessException -> 0x005f }
            throw r5     // Catch:{ CameraAccessException -> 0x005f }
        L_0x005f:
            r5 = move-exception
            r5.getMessage()     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
        L_0x0063:
            android.util.SparseArray<java.lang.String> r5 = r0.MediaMetadataCompat     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            if (r5 != 0) goto L_0x006a
            r0.IconCompatParcelizer()     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
        L_0x006a:
            android.util.SparseArray<java.lang.String> r5 = r0.MediaMetadataCompat     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            if (r5 == 0) goto L_0x0075
            int r5 = r5.indexOfValue(r4)     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            if (r5 >= 0) goto L_0x0075
            r4 = 0
        L_0x0075:
            r0.MediaSessionCompat$QueueItem = r4     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            if (r4 == 0) goto L_0x010a
            android.hardware.camera2.CameraManager r5 = r0.MediaDescriptionCompat     // Catch:{ CameraAccessException -> 0x0106 }
            android.hardware.camera2.CameraCharacteristics r4 = r5.getCameraCharacteristics(r4)     // Catch:{ CameraAccessException -> 0x0106 }
            r0.MediaBrowserCompat$ItemReceiver = r4     // Catch:{ CameraAccessException -> 0x0106 }
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ CameraAccessException -> 0x0106 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ CameraAccessException -> 0x0106 }
            android.hardware.camera2.params.StreamConfigurationMap r4 = (android.hardware.camera2.params.StreamConfigurationMap) r4     // Catch:{ CameraAccessException -> 0x0106 }
            if (r4 == 0) goto L_0x010a
            java.lang.Class<android.graphics.SurfaceTexture> r5 = android.graphics.SurfaceTexture.class
            android.util.Size[] r5 = r4.getOutputSizes(r5)     // Catch:{ CameraAccessException -> 0x0106 }
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch:{ CameraAccessException -> 0x0106 }
            int r6 = r0.AlertController$RecycleListView     // Catch:{ CameraAccessException -> 0x0106 }
            int r7 = r0.setHasDecor     // Catch:{ CameraAccessException -> 0x0106 }
            float r6 = (float) r6     // Catch:{ CameraAccessException -> 0x0106 }
            float r7 = (float) r7     // Catch:{ CameraAccessException -> 0x0106 }
            float r6 = r6 / r7
            java.util.Iterator r5 = r5.iterator()     // Catch:{ CameraAccessException -> 0x0106 }
            r7 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r8 = r7
            r7 = r3
        L_0x00a5:
            boolean r9 = r5.hasNext()     // Catch:{ CameraAccessException -> 0x0106 }
            if (r9 == 0) goto L_0x00d9
            java.lang.Object r9 = r5.next()     // Catch:{ CameraAccessException -> 0x0106 }
            android.util.Size r9 = (android.util.Size) r9     // Catch:{ CameraAccessException -> 0x0106 }
            int r10 = r9.getWidth()     // Catch:{ CameraAccessException -> 0x0106 }
            float r10 = (float) r10     // Catch:{ CameraAccessException -> 0x0106 }
            int r11 = r9.getHeight()     // Catch:{ CameraAccessException -> 0x0106 }
            float r11 = (float) r11     // Catch:{ CameraAccessException -> 0x0106 }
            float r10 = r10 / r11
            float r10 = r6 - r10
            float r11 = java.lang.Math.abs(r10)     // Catch:{ CameraAccessException -> 0x0106 }
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 > 0) goto L_0x00a5
            int r11 = r9.getWidth()     // Catch:{ CameraAccessException -> 0x0106 }
            if (r11 < r3) goto L_0x00a5
            float r8 = java.lang.Math.abs(r10)     // Catch:{ CameraAccessException -> 0x0106 }
            int r3 = r9.getWidth()     // Catch:{ CameraAccessException -> 0x0106 }
            int r7 = r9.getHeight()     // Catch:{ CameraAccessException -> 0x0106 }
            goto L_0x00a5
        L_0x00d9:
            android.util.Size r5 = new android.util.Size     // Catch:{ CameraAccessException -> 0x0106 }
            r5.<init>(r3, r7)     // Catch:{ CameraAccessException -> 0x0106 }
            java.lang.Class<android.graphics.SurfaceTexture> r3 = android.graphics.SurfaceTexture.class
            android.util.Size[] r3 = r4.getOutputSizes(r3)     // Catch:{ CameraAccessException -> 0x0106 }
            java.util.List r3 = java.util.Arrays.asList(r3)     // Catch:{ CameraAccessException -> 0x0106 }
            android.util.Size r3 = r0.read((java.util.List<android.util.Size>) r3)     // Catch:{ CameraAccessException -> 0x0106 }
            r0.f3067x50fd9e4a = r3     // Catch:{ CameraAccessException -> 0x0106 }
            int r3 = r5.getWidth()     // Catch:{ CameraAccessException -> 0x0106 }
            int r4 = r5.getHeight()     // Catch:{ CameraAccessException -> 0x0106 }
            r5 = 256(0x100, float:3.59E-43)
            android.media.ImageReader r3 = android.media.ImageReader.newInstance(r3, r4, r5, r2)     // Catch:{ CameraAccessException -> 0x0106 }
            r0.ParcelableVolumeInfo = r3     // Catch:{ CameraAccessException -> 0x0106 }
            android.media.ImageReader$OnImageAvailableListener r4 = r0.MediaSessionCompat$ResultReceiverWrapper     // Catch:{ CameraAccessException -> 0x0106 }
            android.os.Handler r5 = r0.IconCompatParcelizer     // Catch:{ CameraAccessException -> 0x0106 }
            r3.setOnImageAvailableListener(r4, r5)     // Catch:{ CameraAccessException -> 0x0106 }
            goto L_0x010a
        L_0x0106:
            r3 = move-exception
            r3.getMessage()     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
        L_0x010a:
            android.os.HandlerThread r3 = new android.os.HandlerThread     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            java.lang.String r4 = "CameraApi2Thread"
            r3.<init>(r4)     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            r0.write = r3     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            r3.start()     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            android.os.Handler r3 = new android.os.Handler     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            android.os.HandlerThread r4 = r0.write     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            android.os.Looper r4 = r4.getLooper()     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            r3.<init>(r4)     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            r0.IconCompatParcelizer = r3     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            android.util.Size r3 = r0.f3067x50fd9e4a     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            if (r3 == 0) goto L_0x013c
            java.lang.String r3 = r0.MediaSessionCompat$QueueItem     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
            if (r3 == 0) goto L_0x013c
            android.hardware.camera2.CameraManager r4 = r0.MediaDescriptionCompat     // Catch:{ CameraAccessException -> 0x0138 }
            com.scb.phone.view.camera.CameraApi2$5 r5 = new com.scb.phone.view.camera.CameraApi2$5     // Catch:{ CameraAccessException -> 0x0138 }
            r5.<init>(r1)     // Catch:{ CameraAccessException -> 0x0138 }
            android.os.Handler r0 = r0.IconCompatParcelizer     // Catch:{ CameraAccessException -> 0x0138 }
            r4.openCamera(r3, r5, r0)     // Catch:{ CameraAccessException -> 0x0138 }
            return
        L_0x0138:
            r0 = move-exception
            r0.getMessage()     // Catch:{ CameraHardwareNotSupportException -> 0x013d }
        L_0x013c:
            return
        L_0x013d:
            r12.MediaBrowserCompat$MediaItem = r2
            r12.IconCompatParcelizer()
            MediaBrowserCompat$ItemReceiver(r12)
            return
        L_0x0146:
            o.requestCreditPowerLoan r1 = r12.MediaMetadataCompat
            android.view.SurfaceView r2 = r12.surfaceView
            int r3 = r12.MediaSessionCompat$Token
            int r12 = r12.MediaBrowserCompat$SearchResultReceiver
            r1.MediaBrowserCompat$SearchResultReceiver = r2
            int r2 = android.hardware.Camera.getNumberOfCameras()
            if (r2 <= 0) goto L_0x018b
            android.hardware.Camera r2 = android.hardware.Camera.open()     // Catch:{ RuntimeException -> 0x0181 }
            r1.read = r2     // Catch:{ RuntimeException -> 0x0181 }
            if (r2 == 0) goto L_0x018b
            android.hardware.Camera$Parameters r2 = r2.getParameters()     // Catch:{ RuntimeException -> 0x0181 }
            java.util.List r2 = r2.getSupportedPreviewSizes()     // Catch:{ RuntimeException -> 0x0181 }
            r1.MediaBrowserCompat$ItemReceiver = r2     // Catch:{ RuntimeException -> 0x0181 }
            android.hardware.Camera r2 = r1.read     // Catch:{ RuntimeException -> 0x0181 }
            android.hardware.Camera$Parameters r2 = r2.getParameters()     // Catch:{ RuntimeException -> 0x0181 }
            java.util.List r4 = r2.getSupportedFocusModes()     // Catch:{ RuntimeException -> 0x0181 }
            boolean r4 = r4.contains(r0)     // Catch:{ RuntimeException -> 0x0181 }
            if (r4 == 0) goto L_0x018b
            r2.setFocusMode(r0)     // Catch:{ RuntimeException -> 0x0181 }
            android.hardware.Camera r0 = r1.read     // Catch:{ RuntimeException -> 0x0181 }
            r0.setParameters(r2)     // Catch:{ RuntimeException -> 0x0181 }
            goto L_0x018b
        L_0x0181:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = ""
            android.util.Log.e(r2, r0)
        L_0x018b:
            java.util.List<android.hardware.Camera$Size> r0 = r1.MediaBrowserCompat$ItemReceiver
            if (r0 == 0) goto L_0x0195
            android.hardware.Camera$Size r0 = r1.write(r0)
            r1.RatingCompat = r0
        L_0x0195:
            android.hardware.Camera$Size r0 = r1.RatingCompat
            if (r0 == 0) goto L_0x01d6
            android.view.SurfaceView r2 = r1.MediaBrowserCompat$SearchResultReceiver
            int r0 = r0.width
            android.hardware.Camera$Size r4 = r1.RatingCompat
            int r4 = r4.height
            float r0 = (float) r0
            float r4 = (float) r4
            float r0 = r0 / r4
            float r4 = (float) r3
            float r5 = (float) r12
            float r6 = r4 / r5
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x01af
            float r4 = r4 / r0
            int r12 = (int) r4
            goto L_0x01b1
        L_0x01af:
            float r0 = r0 * r5
            int r3 = (int) r0
        L_0x01b1:
            android.view.SurfaceView r0 = r1.MediaBrowserCompat$SearchResultReceiver
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.height = r12
            r0.width = r3
            r2.setLayoutParams(r0)
            android.view.SurfaceView r12 = r1.MediaBrowserCompat$SearchResultReceiver
            android.view.SurfaceHolder r12 = r12.getHolder()
            r1.MediaBrowserCompat$CustomActionResultReceiver = r12
            r12.addCallback(r1)
            android.view.SurfaceHolder r12 = r1.MediaBrowserCompat$CustomActionResultReceiver
            r0 = 3
            r12.setType(r0)
            o.verifyCommercialReferral r12 = r1.IconCompatParcelizer
            r12.mo34100x50fd9e4a()
        L_0x01d6:
            return
        L_0x01d7:
            java.lang.String[] r0 = read
            boolean r0 = p040o.ProxySourceAdapter$ItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(r12, r0)
            if (r0 == 0) goto L_0x0252
            o.copyDateTo$IconCompatParcelizer r0 = new o.copyDateTo$IconCompatParcelizer
            r0.<init>(r12, r3)
            com.scb.phone.view.custom.common.CustomDialog r12 = com.scb.phone.view.custom.common.CustomDialog.IconCompatParcelizer((android.content.Context) r12)
            android.content.Context r1 = r12.read
            r4 = 2131759929(0x7f101339, float:1.9150864E38)
            java.lang.String r1 = r1.getString(r4)
            if (r1 == 0) goto L_0x01fb
            int r4 = r1.length()
            if (r4 == 0) goto L_0x01fb
            r4 = r3
            goto L_0x01fc
        L_0x01fb:
            r4 = r2
        L_0x01fc:
            r4 = r4 ^ r2
            if (r4 == 0) goto L_0x0209
            android.widget.TextView r4 = r12.mTitleTextView
            r4.setVisibility(r3)
            android.widget.TextView r4 = r12.mTitleTextView
            r4.setText(r1)
        L_0x0209:
            android.content.Context r1 = r12.read
            r4 = 2131759928(0x7f101338, float:1.9150862E38)
            java.lang.String r1 = r1.getString(r4)
            if (r1 == 0) goto L_0x021c
            int r4 = r1.length()
            if (r4 == 0) goto L_0x021c
            r4 = r3
            goto L_0x021d
        L_0x021c:
            r4 = r2
        L_0x021d:
            r2 = r2 ^ r4
            if (r2 == 0) goto L_0x022a
            android.widget.TextView r2 = r12.mTextTextView
            r2.setVisibility(r3)
            android.widget.TextView r2 = r12.mTextTextView
            r2.setText(r1)
        L_0x022a:
            o.getFirstViewDay r1 = new o.getFirstViewDay
            r1.<init>(r0)
            android.content.Context r2 = r12.read
            r3 = 2131759914(0x7f10132a, float:1.9150834E38)
            java.lang.String r2 = r2.getString(r3)
            com.scb.phone.view.custom.common.CustomDialog r12 = r12.IconCompatParcelizer(r2, r1)
            o.addDayView r1 = new o.addDayView
            r1.<init>(r0)
            android.content.Context r0 = r12.read
            r2 = 2131759918(0x7f10132e, float:1.9150842E38)
            java.lang.String r0 = r0.getString(r2)
            com.scb.phone.view.custom.common.CustomDialog r12 = r12.MediaBrowserCompat$ItemReceiver(r0, r1)
            r12.show()
            return
        L_0x0252:
            java.lang.String[] r0 = read
            r1 = 39
            p040o.AppCompatRatingBar.write(r12, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.copyDateTo.MediaBrowserCompat$ItemReceiver(com.scb.phone.view.activity.ndid.NationalIdCameraActivity):void");
    }

    /* renamed from: o.copyDateTo$IconCompatParcelizer */
    static final class IconCompatParcelizer implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
        private final WeakReference<NationalIdCameraActivity> write;

        /* synthetic */ IconCompatParcelizer(NationalIdCameraActivity nationalIdCameraActivity, byte b) {
            this(nationalIdCameraActivity);
        }

        private IconCompatParcelizer(NationalIdCameraActivity nationalIdCameraActivity) {
            this.write = new WeakReference<>(nationalIdCameraActivity);
        }

        public final void write() {
            NationalIdCameraActivity nationalIdCameraActivity = this.write.get();
            if (nationalIdCameraActivity != null) {
                AppCompatRatingBar.write(nationalIdCameraActivity, copyDateTo.read, 39);
            }
        }

        public final void read() {
            if (this.write.get() == null) {
            }
        }
    }
}
