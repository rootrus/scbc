package com.kofax.mobile.sdk.p012ah;

import com.kofax.kmc.kui.uicontrols.Utility;
import com.kofax.mobile.sdk._internal.camera.C0496b;
import com.kofax.mobile.sdk._internal.camera.C0503i;
import com.kofax.mobile.sdk._internal.camera.C0504j;
import com.kofax.mobile.sdk._internal.camera.CameraSourceParametersHolder;
import com.kofax.mobile.sdk._internal.impl.camera.VideoPlayerCameraSourceType;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0579a;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0584d;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0586f;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0592i;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0597k;
import com.kofax.mobile.sdk._internal.impl.camera.focus.C0602p;
import p040o.HmlRepaymentMethodAboutActivity;

/* renamed from: com.kofax.mobile.sdk.ah.g */
public class C0837g {

    /* renamed from: Ye */
    public static final String f2034Ye = "VideoPlayerFocus";

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "Default_Focus_Mode")
    /* renamed from: a */
    public C0503i mo12054a(C0584d dVar) {
        return dVar;
    }

    /* renamed from: c */
    public C0504j mo12056c(C0592i iVar) {
        return iVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "VideoPlayerFocus")
    /* renamed from: d */
    public C0503i mo12057d(C0602p pVar) {
        return pVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "Delayed_Focus_Mode")
    /* renamed from: i */
    public C0503i mo12058i(C0586f fVar) {
        return fVar;
    }

    /* renamed from: a */
    public C0503i mo12053a(C0579a aVar, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "VideoPlayerFocus") C0503i iVar) {
        return (!CameraSourceParametersHolder.isVideoPlayerCameraSourceProvider() || !VideoPlayerCameraSourceType.VIDEO_PLAYER.equals(CameraSourceParametersHolder.getCameraSourceType())) ? aVar : iVar;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "Focus_Auto")
    /* renamed from: b */
    public C0503i mo12055b(C0579a aVar, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "VideoPlayerFocus") C0503i iVar) {
        return (!CameraSourceParametersHolder.isVideoPlayerCameraSourceProvider() || !VideoPlayerCameraSourceType.VIDEO_PLAYER.equals(CameraSourceParametersHolder.getCameraSourceType())) ? aVar : iVar;
    }

    /* renamed from: sv */
    public C0597k mo12059sv() {
        C0597k kVar = new C0597k();
        kVar.put(Utility.SAMSUNG_GALAXY_S5_A, C0496b.AUTO);
        kVar.put(Utility.SAMSUNG_GALAXY_S5_H, C0496b.AUTO);
        kVar.put(Utility.SAMSUNG_GALAXY_S5_T, C0496b.AUTO);
        kVar.put(Utility.SAMSUNG_GALAXY_S5_F, C0496b.AUTO);
        kVar.put(Utility.SAMSUNG_GALAXY_TAB_S3, C0496b.AUTO);
        kVar.put(Utility.HTC_ONE_MAX, C0496b.AUTO);
        kVar.put(Utility.SONY_XPERIA_Z1S, C0496b.AUTO);
        kVar.put(Utility.SONY_XPERIA_Z, C0496b.AUTO);
        kVar.put(Utility.SAMSUNG_NOTE_3, C0496b.AUTO);
        kVar.put(Utility.SAMSUNG_S4_MINI, C0496b.AUTO);
        kVar.put(Utility.LG_G3, C0496b.AUTO);
        kVar.put(Utility.MOTO_G_1034, C0496b.AUTO);
        kVar.put(Utility.LENOVO_YOGA, C0496b.AUTO);
        kVar.put(Utility.NEXUS_7, C0496b.AUTO);
        kVar.put(Utility.NEXUS_9, C0496b.AUTO);
        kVar.put(Utility.ASUS_Z00XS, C0496b.AUTO);
        kVar.put(Utility.HTC_ONE_M9, C0496b.AUTO);
        return kVar;
    }
}
