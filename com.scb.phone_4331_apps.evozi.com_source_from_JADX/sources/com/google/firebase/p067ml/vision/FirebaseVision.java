package com.google.firebase.p067ml.vision;

import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.p067ml.vision.barcode.FirebaseVisionBarcodeDetectorOptions;
import com.google.firebase.p067ml.vision.cloud.FirebaseVisionCloudDetectorOptions;
import com.google.firebase.p067ml.vision.document.FirebaseVisionCloudDocumentRecognizerOptions;
import com.google.firebase.p067ml.vision.face.FirebaseVisionFaceDetector;
import com.google.firebase.p067ml.vision.face.FirebaseVisionFaceDetectorOptions;
import com.google.firebase.p067ml.vision.label.FirebaseVisionCloudImageLabelerOptions;
import com.google.firebase.p067ml.vision.label.FirebaseVisionOnDeviceImageLabelerOptions;
import com.google.firebase.p067ml.vision.object.zza;
import com.google.firebase.p067ml.vision.object.zzc;
import com.google.firebase.p067ml.vision.text.FirebaseVisionCloudTextRecognizerOptions;
import com.google.firebase.p067ml.vision.text.FirebaseVisionTextRecognizer;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.ml.vision.FirebaseVision */
public class FirebaseVision {
    private static final FirebaseVisionCloudDetectorOptions zzaut = new FirebaseVisionCloudDetectorOptions.Builder().build();
    private static final FirebaseVisionFaceDetectorOptions zzauu = new FirebaseVisionFaceDetectorOptions.Builder().build();
    private static final FirebaseVisionBarcodeDetectorOptions zzauv = new FirebaseVisionBarcodeDetectorOptions.Builder().build();
    private static final FirebaseVisionCloudTextRecognizerOptions zzauw = new FirebaseVisionCloudTextRecognizerOptions.Builder().build();
    private static final FirebaseVisionCloudDocumentRecognizerOptions zzaux = new FirebaseVisionCloudDocumentRecognizerOptions.Builder().build();
    private static final FirebaseVisionOnDeviceImageLabelerOptions zzauy = new FirebaseVisionOnDeviceImageLabelerOptions.Builder().build();
    private static final FirebaseVisionCloudImageLabelerOptions zzauz = new FirebaseVisionCloudImageLabelerOptions.Builder().build();
    private static final zza zzava = new zzc().zznp();
    private static final Map<String, FirebaseVision> zzax = new HashMap();
    private final FirebaseApp zzaso;

    public static FirebaseVision getInstance() {
        return getInstance(FirebaseApp.getInstance());
    }

    public static FirebaseVision getInstance(FirebaseApp firebaseApp) {
        FirebaseVision firebaseVision;
        Preconditions.checkNotNull(firebaseApp, "FirebaseApp can not be null");
        String persistenceKey = firebaseApp.getPersistenceKey();
        synchronized (zzax) {
            firebaseVision = zzax.get(persistenceKey);
            if (firebaseVision == null) {
                firebaseVision = new FirebaseVision(firebaseApp);
                zzax.put(persistenceKey, firebaseVision);
            }
        }
        return firebaseVision;
    }

    public FirebaseVisionFaceDetector getVisionFaceDetector(FirebaseVisionFaceDetectorOptions firebaseVisionFaceDetectorOptions) {
        Preconditions.checkNotNull(firebaseVisionFaceDetectorOptions, "Please provide a valid FirebaseVisionFaceDetectorOptions");
        return FirebaseVisionFaceDetector.zza(this.zzaso, firebaseVisionFaceDetectorOptions);
    }

    public FirebaseVisionTextRecognizer getOnDeviceTextRecognizer() {
        return FirebaseVisionTextRecognizer.zza(this.zzaso, (FirebaseVisionCloudTextRecognizerOptions) null, true);
    }

    private FirebaseVision(FirebaseApp firebaseApp) {
        this.zzaso = firebaseApp;
    }
}
