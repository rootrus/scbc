package com.google.android.gms.internal.firebase_ml;

import android.content.Context;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.firebase.p067ml.common.FirebaseMLException;
import com.google.firebase.p067ml.common.modeldownload.FirebaseLocalModel;
import java.nio.MappedByteBuffer;

public final class zzpb implements zzow {
    private final Context zzasx;

    public zzpb(Context context) {
        this.zzasx = context;
    }

    public final void zzlu() throws FirebaseMLException {
    }

    public final MappedByteBuffer zzca(String str) throws FirebaseMLException {
        return new zzog(this.zzasx, new FirebaseLocalModel.Builder(ImagesContract.LOCAL).setFilePath(str).build()).load();
    }
}
