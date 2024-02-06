package com.kofax.mobile.sdk._internal.impl.camera;

import android.content.Context;
import com.kofax.mobile.sdk._internal.camera.C0499e;
import com.kofax.mobile.sdk._internal.camera.CameraSourceParametersHolder;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.ag */
public class C0556ag extends C0619j {

    /* renamed from: Dj */
    private VideoPlayerCameraSourceType f1267Dj = VideoPlayerCameraSourceType.DEVICE_CAMERA;

    /* renamed from: Dk */
    private VideoPlayerCameraSourceType f1268Dk;

    /* renamed from: V */
    private Context f1269V;

    public /* synthetic */ Object get() {
        return get();
    }

    @HmlPinActivity
    public C0556ag(Context context) {
        super(context);
        this.f1269V = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo11435a(VideoPlayerCameraSourceType videoPlayerCameraSourceType) {
        this.f1267Dj = videoPlayerCameraSourceType;
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.ag$1 */
    static /* synthetic */ class C05571 {

        /* renamed from: Dl */
        static final /* synthetic */ int[] f1270Dl;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraSourceType[] r0 = com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraSourceType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1270Dl = r0
                com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraSourceType r1 = com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraSourceType.DEVICE_CAMERA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1270Dl     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraSourceType r1 = com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraSourceType.VIDEO_PLAYER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1270Dl     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraSourceType r1 = com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraSourceType.VIDEO_RECORDER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.C0556ag.C05571.<clinit>():void");
        }
    }

    /* renamed from: jM */
    public C0499e mo11436jM() {
        C0499e eVar;
        synchronized (this) {
            int i = C05571.f1270Dl[this.f1267Dj.ordinal()];
            if (i == 2) {
                VideoPlayerCameraPlayer videoPlayerCameraPlayer = Injector.getInjector(this.f1269V).getVideoPlayerCameraPlayer();
                videoPlayerCameraPlayer.setOnCompleteListener(CameraSourceParametersHolder.getOnCompleteListener());
                eVar = m1121a(videoPlayerCameraPlayer, false);
            } else if (i != 3) {
                eVar = super.get();
            } else {
                eVar = m1121a(Injector.getInjector(this.f1269V).getVideoPlayerCameraRecorder(), true);
            }
        }
        return eVar;
    }

    /* renamed from: a */
    private <T> C0499e m1121a(C0499e eVar, boolean z) {
        if (this.f1494Bf != null && this.f1268Dk == this.f1267Dj) {
            return this.f1494Bf;
        }
        if (z) {
            eVar = new C0637z(eVar);
        }
        this.f1494Bf = eVar;
        this.f1268Dk = this.f1267Dj;
        return eVar;
    }
}
