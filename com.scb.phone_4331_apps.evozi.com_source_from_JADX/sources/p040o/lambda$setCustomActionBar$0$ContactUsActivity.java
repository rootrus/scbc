package p040o;

import android.util.SparseArray;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p067ml.vision.FirebaseVision;
import com.google.firebase.p067ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p067ml.vision.face.FirebaseVisionFace;
import com.google.firebase.p067ml.vision.face.FirebaseVisionFaceDetector;
import com.google.firebase.p067ml.vision.face.FirebaseVisionFaceDetectorOptions;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.lambda$setCustomActionBar$0$ContactUsActivity */
public final class lambda$setCustomActionBar$0$ContactUsActivity implements ProductListActivity<ChequeAnnouncementActivity> {
    /* access modifiers changed from: private */
    public static final AtomicBoolean IconCompatParcelizer = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public static List<ChequeAnnouncementActivity> MediaBrowserCompat$CustomActionResultReceiver = null;
    private static FirebaseVisionImage MediaBrowserCompat$ItemReceiver;
    private FirebaseVisionFaceDetector read = FirebaseVision.getInstance().getVisionFaceDetector(new FirebaseVisionFaceDetectorOptions.Builder().setClassificationMode(2).setContourMode(2).setLandmarkMode(2).setPerformanceMode(1).setMinFaceSize(0.15f).enableTracking().build());
    public CloseAccountSelectionActivity<ChequeAnnouncementActivity> write;

    public lambda$setCustomActionBar$0$ContactUsActivity() {
        new SparseArray();
    }

    public static List<ChequeAnnouncementActivity> MediaBrowserCompat$CustomActionResultReceiver() {
        return MediaBrowserCompat$CustomActionResultReceiver;
    }

    public static FirebaseVisionImage write() {
        return MediaBrowserCompat$ItemReceiver;
    }

    public final void read() {
        this.write.write();
    }

    public final void write(FirebaseVisionImage firebaseVisionImage, final onEmailUsClick onemailusclick) {
        try {
            if (!IconCompatParcelizer.getAndSet(true)) {
                MediaBrowserCompat$ItemReceiver = firebaseVisionImage;
                this.read.detectInImage(firebaseVisionImage).addOnCompleteListener(new OnCompleteListener<List<FirebaseVisionFace>>() {
                    public final void onComplete(Task<List<FirebaseVisionFace>> task) {
                        lambda$setCustomActionBar$0$ContactUsActivity.IconCompatParcelizer.set(false);
                    }
                }).addOnSuccessListener(new OnSuccessListener<List<FirebaseVisionFace>>() {
                    public final /* synthetic */ void onSuccess(Object obj) {
                        ArrayList arrayList = new ArrayList();
                        for (FirebaseVisionFace firebaseVisionFace : (List) obj) {
                            boolean z = true;
                            if (onemailusclick.MediaBrowserCompat$ItemReceiver != 1) {
                                z = false;
                            }
                            arrayList.add(new ChequeAnnouncementActivity(firebaseVisionFace, z));
                        }
                        List unused = lambda$setCustomActionBar$0$ContactUsActivity.MediaBrowserCompat$CustomActionResultReceiver = arrayList;
                        lambda$setCustomActionBar$0$ContactUsActivity.this.write.read(arrayList);
                    }
                });
            }
        } catch (Throwable th) {
            th.printStackTrace();
            IconCompatParcelizer.set(false);
        }
    }
}
