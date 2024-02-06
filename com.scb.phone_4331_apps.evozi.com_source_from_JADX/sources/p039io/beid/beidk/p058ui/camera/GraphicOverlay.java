package p039io.beid.beidk.p058ui.camera;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p039io.beid.beidk.p058ui.camera.GraphicOverlay.read;

/* renamed from: io.beid.beidk.ui.camera.GraphicOverlay */
public class GraphicOverlay<T extends read> extends View {
    int IconCompatParcelizer;
    int MediaBrowserCompat$ItemReceiver;
    public final Object read = new Object();
    public Set<T> write = new HashSet();

    /* renamed from: io.beid.beidk.ui.camera.GraphicOverlay$read */
    public static abstract class read {
        public abstract long IconCompatParcelizer();

        public abstract String[] MediaBrowserCompat$ItemReceiver();
    }

    public GraphicOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        synchronized (this.read) {
            if (!(this.MediaBrowserCompat$ItemReceiver == 0 || this.IconCompatParcelizer == 0)) {
                getWidth();
                getHeight();
            }
            Iterator<T> it = this.write.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
