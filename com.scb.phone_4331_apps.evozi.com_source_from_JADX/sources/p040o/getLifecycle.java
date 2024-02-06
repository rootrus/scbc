package p040o;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* renamed from: o.getLifecycle */
public final class getLifecycle<T> extends Property<T, Float> {
    private float IconCompatParcelizer;
    private final float[] MediaBrowserCompat$CustomActionResultReceiver = new float[2];
    private final PathMeasure MediaBrowserCompat$ItemReceiver;
    private final Property<T, PointF> MediaDescriptionCompat;
    private final float read;
    private final PointF write = new PointF();

    public final /* synthetic */ void set(Object obj, Object obj2) {
        Float f = (Float) obj2;
        this.IconCompatParcelizer = f.floatValue();
        this.MediaBrowserCompat$ItemReceiver.getPosTan(this.read * f.floatValue(), this.MediaBrowserCompat$CustomActionResultReceiver, (float[]) null);
        this.write.x = this.MediaBrowserCompat$CustomActionResultReceiver[0];
        this.write.y = this.MediaBrowserCompat$CustomActionResultReceiver[1];
        this.MediaDescriptionCompat.set(obj, this.write);
    }

    public getLifecycle(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.MediaDescriptionCompat = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.MediaBrowserCompat$ItemReceiver = pathMeasure;
        this.read = pathMeasure.getLength();
    }

    public final /* synthetic */ Object get(Object obj) {
        return Float.valueOf(this.IconCompatParcelizer);
    }
}
