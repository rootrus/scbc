package p040o;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: o.addF32 */
public abstract class addF32 {
    public float IconCompatParcelizer;
    private Object read;

    public addF32() {
        this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.read = null;
    }

    private addF32(float f) {
        this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.read = null;
        this.IconCompatParcelizer = f;
    }

    public addF32(float f, Object obj) {
        this(f);
        this.read = obj;
    }

    public final Object read() {
        return this.read;
    }

    public final void read(Object obj) {
        this.read = obj;
    }
}
