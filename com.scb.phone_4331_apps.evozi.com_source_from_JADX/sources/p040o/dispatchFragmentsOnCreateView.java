package p040o;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* renamed from: o.dispatchFragmentsOnCreateView */
public final class dispatchFragmentsOnCreateView implements onContextItemSelected<BitmapDrawable> {
    private final CheckParameters_MembersInjector IconCompatParcelizer;
    private final onContextItemSelected<Bitmap> write;

    public final /* synthetic */ boolean read(Object obj, File file, onActivityResult onactivityresult) {
        return this.write.read(new getLastCustomNonConfigurationInstance(((BitmapDrawable) ((performOptionsMenuClosed) obj).write()).getBitmap(), this.IconCompatParcelizer), file, onactivityresult);
    }

    public dispatchFragmentsOnCreateView(CheckParameters_MembersInjector checkParameters_MembersInjector, onContextItemSelected<Bitmap> oncontextitemselected) {
        this.IconCompatParcelizer = checkParameters_MembersInjector;
        this.write = oncontextitemselected;
    }

    public final isRemoving IconCompatParcelizer(onActivityResult onactivityresult) {
        return this.write.IconCompatParcelizer(onactivityresult);
    }
}
