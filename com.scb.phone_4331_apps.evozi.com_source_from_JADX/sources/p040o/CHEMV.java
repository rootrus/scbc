package p040o;

import android.content.Context;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.zzma;

/* renamed from: o.CHEMV */
public final class CHEMV {
    /* access modifiers changed from: package-private */
    public static final String MediaBrowserCompat$CustomActionResultReceiver = CHEMV.class.getSimpleName();
    Camera.CameraInfo IconCompatParcelizer;
    CGBMV MediaBrowserCompat$ItemReceiver;
    Context MediaBrowserCompat$MediaItem;
    final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    BNNM f5482x50fd9e4a;
    boolean MediaDescriptionCompat;
    public getEnterTransitionCallback MediaMetadataCompat;
    public CHER MediaSessionCompat$QueueItem = new CHER();
    private String MediaSessionCompat$ResultReceiverWrapper;
    int MediaSessionCompat$Token = -1;
    BNNM RatingCompat;
    rsnScriptIntrinsicBLAS_Complex read;
    Camera write;

    /* renamed from: o.CHEMV$IconCompatParcelizer */
    final class IconCompatParcelizer implements Camera.PreviewCallback {
        IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory MediaBrowserCompat$CustomActionResultReceiver;
        BNNM MediaBrowserCompat$ItemReceiver;

        public IconCompatParcelizer() {
        }

        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            BNNM bnnm = this.MediaBrowserCompat$ItemReceiver;
            IdCaptureModule_GetIExceptionResponseDeserializerRttiFactory idCaptureModule_GetIExceptionResponseDeserializerRttiFactory = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (bnnm == null || idCaptureModule_GetIExceptionResponseDeserializerRttiFactory == null) {
                Log.d(CHEMV.MediaBrowserCompat$CustomActionResultReceiver, "Got preview callback, but no handler or resolution available");
                if (idCaptureModule_GetIExceptionResponseDeserializerRttiFactory != null) {
                    idCaptureModule_GetIExceptionResponseDeserializerRttiFactory.IconCompatParcelizer();
                }
            } else if (bArr != null) {
                try {
                    byte[] bArr2 = bArr;
                    idCaptureModule_GetIExceptionResponseDeserializerRttiFactory.MediaBrowserCompat$CustomActionResultReceiver(new zzma.IconCompatParcelizer(bArr2, bnnm.read, bnnm.IconCompatParcelizer, camera.getParameters().getPreviewFormat(), CHEMV.this.MediaSessionCompat$Token));
                } catch (RuntimeException e) {
                    Log.e(CHEMV.MediaBrowserCompat$CustomActionResultReceiver, "Camera preview failed", e);
                    idCaptureModule_GetIExceptionResponseDeserializerRttiFactory.IconCompatParcelizer();
                }
            } else {
                throw new NullPointerException("No preview data received");
            }
        }
    }

    public CHEMV(Context context) {
        this.MediaBrowserCompat$MediaItem = context;
        this.MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer();
    }

    public final boolean read() {
        int i = this.MediaSessionCompat$Token;
        if (i != -1) {
            return i % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 != 0;
        }
        throw new IllegalStateException("Rotation not calculated yet. Call configure() first.");
    }

    private static List<BNNM> MediaBrowserCompat$ItemReceiver(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        ArrayList arrayList = new ArrayList();
        if (supportedPreviewSizes == null) {
            Camera.Size previewSize = parameters.getPreviewSize();
            if (previewSize != null) {
                arrayList.add(new BNNM(previewSize.width, previewSize.height));
            }
            return arrayList;
        }
        for (Camera.Size next : supportedPreviewSizes) {
            arrayList.add(new BNNM(next.width, next.height));
        }
        return arrayList;
    }

    public final void read(boolean z) {
        if (this.write != null) {
            try {
                if (z != write()) {
                    if (this.MediaBrowserCompat$ItemReceiver != null) {
                        this.MediaBrowserCompat$ItemReceiver.write();
                    }
                    Camera.Parameters parameters = this.write.getParameters();
                    rsnScriptInvoke.read(parameters, z);
                    this.write.setParameters(parameters);
                    if (this.MediaBrowserCompat$ItemReceiver != null) {
                        this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer();
                    }
                }
            } catch (RuntimeException e) {
                Log.e(MediaBrowserCompat$CustomActionResultReceiver, "Failed to set torch", e);
            }
        }
    }

    private boolean write() {
        String flashMode;
        Camera.Parameters parameters = this.write.getParameters();
        if (parameters == null || (flashMode = parameters.getFlashMode()) == null) {
            return false;
        }
        if ("on".equals(flashMode) || "torch".equals(flashMode)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Camera.Parameters parameters = this.write.getParameters();
        String str = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str == null) {
            this.MediaSessionCompat$ResultReceiverWrapper = parameters.flatten();
        } else {
            parameters.unflatten(str);
        }
        if (parameters == null) {
            Log.w(MediaBrowserCompat$CustomActionResultReceiver, "Device error: no camera parameters are available. Proceeding without configuration.");
            return;
        }
        String str2 = MediaBrowserCompat$CustomActionResultReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append("Initial camera parameters: ");
        sb.append(parameters.flatten());
        Log.i(str2, sb.toString());
        if (z) {
            Log.w(MediaBrowserCompat$CustomActionResultReceiver, "In camera config safe mode -- most settings will not be honored");
        }
        rsnScriptInvoke.MediaBrowserCompat$CustomActionResultReceiver(parameters, this.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver, z);
        if (!z) {
            rsnScriptInvoke.read(parameters, false);
        }
        List<BNNM> MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(parameters);
        BNNM bnnm = null;
        if (MediaBrowserCompat$ItemReceiver2.size() == 0) {
            this.f5482x50fd9e4a = null;
        } else {
            getEnterTransitionCallback getentertransitioncallback = this.MediaMetadataCompat;
            boolean read2 = read();
            BNNM bnnm2 = getentertransitioncallback.read;
            if (bnnm2 != null) {
                bnnm = read2 ? new BNNM(bnnm2.IconCompatParcelizer, bnnm2.read) : bnnm2;
            }
            CHER2 cher2 = getentertransitioncallback.MediaBrowserCompat$CustomActionResultReceiver;
            if (bnnm != null) {
                Collections.sort(MediaBrowserCompat$ItemReceiver2, new Comparator<BNNM>(bnnm) {
                    private /* synthetic */ BNNM MediaBrowserCompat$ItemReceiver;

                    {
                        this.MediaBrowserCompat$ItemReceiver = r2;
                    }

                    public final /* synthetic */ int compare(Object obj, Object obj2) {
                        return Float.compare(CHER2.this.read((BNNM) obj2, this.MediaBrowserCompat$ItemReceiver), CHER2.this.read((BNNM) obj, this.MediaBrowserCompat$ItemReceiver));
                    }
                });
            }
            String str3 = CHER2.read;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Viewfinder size: ");
            sb2.append(bnnm);
            Log.i(str3, sb2.toString());
            String str4 = CHER2.read;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Preview in order of preference: ");
            sb3.append(MediaBrowserCompat$ItemReceiver2);
            Log.i(str4, sb3.toString());
            BNNM bnnm3 = MediaBrowserCompat$ItemReceiver2.get(0);
            this.f5482x50fd9e4a = bnnm3;
            parameters.setPreviewSize(bnnm3.read, this.f5482x50fd9e4a.IconCompatParcelizer);
        }
        if (Build.DEVICE.equals("glass-1")) {
            rsnScriptInvoke.MediaBrowserCompat$CustomActionResultReceiver(parameters);
        }
        String str5 = MediaBrowserCompat$CustomActionResultReceiver;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("Final camera parameters: ");
        sb4.append(parameters.flatten());
        Log.i(str5, sb4.toString());
        this.write.setParameters(parameters);
    }
}
