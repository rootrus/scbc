package p040o;

import p040o.loadPerspective;
import p040o.rsnScriptInvokeV;

/* renamed from: o.internalCreate */
public final class internalCreate<T> implements getArray<T> {
    private final RenderScript IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final Float4 MediaBrowserCompat$ItemReceiver;
    private final getPercentBlackPixels read;
    private final Int3<T, byte[]> write;

    public internalCreate(RenderScript renderScript, String str, Float4 float4, Int3<T, byte[]> int3, getPercentBlackPixels getpercentblackpixels) {
        this.IconCompatParcelizer = renderScript;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.MediaBrowserCompat$ItemReceiver = float4;
        this.write = int3;
        this.read = getpercentblackpixels;
    }

    public final void schedule(Int2<T> int2, Long3 long3) {
        this.read.MediaBrowserCompat$CustomActionResultReceiver(new loadPerspective.write().read(this.IconCompatParcelizer).read((Int2<?>) int2).write(this.MediaBrowserCompat$CustomActionResultReceiver).read((Int3<?, byte[]>) this.write).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver(), long3);
    }

    public final void send(Int2<T> int2) {
        schedule(int2, rsnScriptInvokeV.write.IconCompatParcelizer);
    }
}
