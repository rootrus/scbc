package p040o;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* renamed from: o.nContextDeinitToClient */
public final class nContextDeinitToClient extends Property<ImageView, Matrix> {
    private final Matrix read = new Matrix();

    public final /* synthetic */ Object get(Object obj) {
        this.read.set(((ImageView) obj).getImageMatrix());
        return this.read;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }

    public nContextDeinitToClient() {
        super(Matrix.class, "imageMatrixProperty");
    }
}
