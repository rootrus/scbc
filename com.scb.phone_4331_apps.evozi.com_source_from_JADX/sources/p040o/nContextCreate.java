package p040o;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* renamed from: o.nContextCreate */
public final class nContextCreate implements TypeEvaluator<Matrix> {
    private final Matrix IconCompatParcelizer = new Matrix();
    private final float[] read = new float[9];
    private final float[] write = new float[9];

    public final /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        ((Matrix) obj).getValues(this.write);
        ((Matrix) obj2).getValues(this.read);
        for (int i = 0; i < 9; i++) {
            float[] fArr = this.read;
            float f2 = fArr[i];
            float[] fArr2 = this.write;
            fArr[i] = fArr2[i] + ((f2 - fArr2[i]) * f);
        }
        this.IconCompatParcelizer.setValues(this.read);
        return this.IconCompatParcelizer;
    }
}
