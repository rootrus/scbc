package com.google.firebase.p067ml.vision.face;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.firebase_ml.zzmd;
import com.google.android.gms.internal.firebase_ml.zzmn;
import com.google.android.gms.internal.firebase_ml.zznt;
import com.google.android.gms.internal.firebase_ml.zznu;
import com.google.android.gms.internal.firebase_ml.zzpw;
import com.google.android.gms.internal.firebase_ml.zzqa;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.vision.common.FirebaseVisionImage;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.face.FirebaseVisionFaceDetector */
public class FirebaseVisionFaceDetector extends zzpw<List<FirebaseVisionFace>> implements Closeable {
    private static final Map<zznt<FirebaseVisionFaceDetectorOptions>, FirebaseVisionFaceDetector> zzax = new HashMap();
    private final FirebaseVisionFaceDetectorOptions zzaye;

    public static FirebaseVisionFaceDetector zza(FirebaseApp firebaseApp, FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        FirebaseVisionFaceDetector firebaseVisionFaceDetector;
        synchronized (FirebaseVisionFaceDetector.class) {
            Preconditions.checkNotNull(firebaseApp, "You must provide a valid FirebaseApp.");
            Preconditions.checkNotNull(firebaseApp.getPersistenceKey(), "Firebase app name must not be null");
            Preconditions.checkNotNull(firebaseApp.getApplicationContext(), "You must provide a valid Context.");
            Preconditions.checkNotNull(firebaseVisionFaceDetectorOptions, "You must provide a valid FirebaseVisionFaceDetectorOptions.");
            zznt zzj = zznt.zzj(firebaseApp.getPersistenceKey(), firebaseVisionFaceDetectorOptions);
            firebaseVisionFaceDetector = zzax.get(zzj);
            if (firebaseVisionFaceDetector == null) {
                firebaseVisionFaceDetector = new FirebaseVisionFaceDetector(firebaseApp, firebaseVisionFaceDetectorOptions);
                zzax.put(zzj, firebaseVisionFaceDetector);
            }
        }
        return firebaseVisionFaceDetector;
    }

    private FirebaseVisionFaceDetector(FirebaseApp firebaseApp, FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        super(firebaseApp, new zzqa(firebaseApp, firebaseVisionFaceDetectorOptions));
        this.zzaye = firebaseVisionFaceDetectorOptions;
        zznu.zza(firebaseApp, 1).zza(zzmd.zzq.zzjx().zzb(zzmd.zzw.zzkk().zzb(firebaseVisionFaceDetectorOptions.zznn())), zzmn.ON_DEVICE_FACE_CREATE);
    }

    public Task<List<FirebaseVisionFace>> detectInImage(FirebaseVisionImage firebaseVisionImage) {
        Preconditions.checkArgument(this.zzaye.getContourMode() != 2 || firebaseVisionImage.zza(false, false).getMetadata().getWidth() >= 32, String.format(Locale.getDefault(), "The width of input image cannot be less than %s when using contour mode ALL_CONTOURS!", new Object[]{32}));
        return super.zza(firebaseVisionImage, false, true);
    }

    public void close() throws IOException {
        super.close();
    }
}
