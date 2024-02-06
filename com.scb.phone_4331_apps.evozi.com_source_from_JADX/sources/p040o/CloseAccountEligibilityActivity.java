package p040o;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.p067ml.vision.FirebaseVision;
import com.google.firebase.p067ml.vision.common.FirebaseVisionImage;
import com.google.firebase.p067ml.vision.text.FirebaseVisionText;
import com.google.firebase.p067ml.vision.text.FirebaseVisionTextRecognizer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: o.CloseAccountEligibilityActivity */
public final class CloseAccountEligibilityActivity implements OnSuccessListener<FirebaseVisionText>, ProductListActivity<FirebaseVisionText> {
    /* access modifiers changed from: private */
    public static final AtomicBoolean read = new AtomicBoolean(false);
    public CloseAccountSelectionActivity<FirebaseVisionText> IconCompatParcelizer;
    private final FirebaseVisionTextRecognizer write = FirebaseVision.getInstance().getOnDeviceTextRecognizer();

    public final void read() {
        try {
            this.IconCompatParcelizer.write();
            this.write.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public final void write(FirebaseVisionImage firebaseVisionImage, onEmailUsClick onemailusclick) {
        try {
            if (!read.getAndSet(true)) {
                this.write.processImage(firebaseVisionImage).addOnCompleteListener(new OnCompleteListener<FirebaseVisionText>() {
                    public final void onComplete(Task<FirebaseVisionText> task) {
                        CloseAccountEligibilityActivity.read.set(false);
                    }
                }).addOnSuccessListener(this);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            read.set(false);
        }
    }

    public final /* synthetic */ void onSuccess(Object obj) {
        ArrayList arrayList = new ArrayList();
        arrayList.add((FirebaseVisionText) obj);
        this.IconCompatParcelizer.read(arrayList);
    }
}
