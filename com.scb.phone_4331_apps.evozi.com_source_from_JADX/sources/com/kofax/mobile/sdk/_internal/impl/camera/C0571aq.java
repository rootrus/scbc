package com.kofax.mobile.sdk._internal.impl.camera;

import android.content.Context;
import com.kofax.mobile.sdk._internal.camera.C0502h;
import com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider;
import com.kofax.mobile.sdk._internal.dagger.C0519a;
import com.kofax.mobile.sdk._internal.dagger.Injector;
import java.util.List;
import p040o.HmlPinActivity;

@C0519a
/* renamed from: com.kofax.mobile.sdk._internal.impl.camera.aq */
public class C0571aq implements IVideoResourceProvider {
    private static final String TAG = C0571aq.class.getSimpleName();

    /* renamed from: DM */
    IVideoResourceProvider.StorageType f1308DM = IVideoResourceProvider.StorageType.FILE;

    /* renamed from: V */
    private Context f1309V;
    String path;

    @HmlPinActivity
    public C0571aq(Context context) {
        this.f1309V = context.getApplicationContext();
    }

    public void setFileParameters(String str, IVideoResourceProvider.StorageType storageType) {
        this.path = str;
        this.f1308DM = storageType;
    }

    public List<String> getVideoFiles() {
        return C0561aj.m1144kl();
    }

    public String getDefaultNewRecordingFilePath() {
        return C0561aj.m1143kk();
    }

    /* renamed from: com.kofax.mobile.sdk._internal.impl.camera.aq$1 */
    static /* synthetic */ class C05721 {

        /* renamed from: DN */
        static final /* synthetic */ int[] f1310DN;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider$StorageType[] r0 = com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider.StorageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1310DN = r0
                com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider$StorageType r1 = com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider.StorageType.FILE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1310DN     // Catch:{ NoSuchFieldError -> 0x001d }
                com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider$StorageType r1 = com.kofax.mobile.sdk._internal.camera.IVideoResourceProvider.StorageType.ASSET     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kofax.mobile.sdk._internal.impl.camera.C0571aq.C05721.<clinit>():void");
        }
    }

    public C0502h getFileProvider() {
        C0502h hVar;
        synchronized (this) {
            if (C05721.f1310DN[this.f1308DM.ordinal()] != 2) {
                hVar = Injector.getInjector(this.f1309V).getFileProvider();
            } else {
                hVar = Injector.getInjector(this.f1309V).getAssetProvider();
            }
            hVar.setPath(this.path);
        }
        return hVar;
    }
}
