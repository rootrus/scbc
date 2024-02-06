package com.google.android.gms.internal.firebase_ml;

import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.common.FirebaseMLException;
import com.google.firebase.p067ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.p067ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.Collections;

public abstract class zzpo<ResultType> implements Closeable {
    private final zzjf imageContext;
    protected final FirebaseApp zzapo;
    private final zznq zzasm;
    private final zzpp zzawm;
    private final zzjc zzawn;

    protected zzpo(FirebaseApp firebaseApp, String str, FirebaseVisionCloudDetectorOptions firebaseVisionCloudDetectorOptions) {
        this(firebaseApp, new zzjc().zza(Integer.valueOf(firebaseVisionCloudDetectorOptions.getMaxResults())).zzay(str).zzax(zzpm.zzbl(firebaseVisionCloudDetectorOptions.getModelType())), (zzjf) null, firebaseVisionCloudDetectorOptions.isEnforceCertFingerprintMatch());
    }

    public void close() throws IOException {
    }

    /* access modifiers changed from: protected */
    public abstract ResultType zza(zzir zzir, float f);

    /* access modifiers changed from: protected */
    public abstract int zznh();

    /* access modifiers changed from: protected */
    public abstract int zzni();

    protected zzpo(FirebaseApp firebaseApp, String str, zzjf zzjf, boolean z) {
        this(firebaseApp, new zzjc().zzay(str).zzax(zzpm.zzbl(1)), (zzjf) Preconditions.checkNotNull(zzjf, "ImageContext must not be null"), z);
    }

    private zzpo(FirebaseApp firebaseApp, zzjc zzjc, zzjf zzjf, boolean z) {
        Preconditions.checkNotNull(firebaseApp, "FirebaseApp must not be null");
        Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
        this.zzawn = (zzjc) Preconditions.checkNotNull(zzjc);
        this.zzasm = zznq.zza(firebaseApp);
        this.zzawm = new zzpp(this, firebaseApp, z);
        this.zzapo = firebaseApp;
        this.imageContext = zzjf;
    }

    public final Task<ResultType> zza(FirebaseVisionImage firebaseVisionImage) {
        Preconditions.checkNotNull(firebaseVisionImage, "Input image can not be null");
        Pair<byte[], Float> zze = firebaseVisionImage.zze(zznh(), zzni());
        if (zze.first == null) {
            return Tasks.forException(new FirebaseMLException("Can not convert the image format", 3));
        }
        return this.zzasm.zza(this.zzawm, new zzpn((byte[]) zze.first, ((Float) zze.second).floatValue(), Collections.singletonList(this.zzawn), this.imageContext));
    }
}
