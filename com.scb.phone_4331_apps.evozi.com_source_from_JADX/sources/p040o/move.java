package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.FileBackedOutputStream;

/* renamed from: o.move */
public final class move implements OPRStatusRewardsLandingActivity_ViewBinding<FileBackedOutputStream.MemoryOutput> {
    public static FileBackedOutputStream.MemoryOutput write(Resources resources, SharedPreferences sharedPreferences, Files files) {
        return new FileBackedOutputStream.MemoryOutput(resources, sharedPreferences, files);
    }

    public final /* synthetic */ Object get() {
        HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
        return new FileBackedOutputStream.MemoryOutput((Resources) hmlReviewDocumentActivity.get(), (SharedPreferences) hmlReviewDocumentActivity.get(), (Files) hmlReviewDocumentActivity.get());
    }
}
