package p040o;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: o.sizeOf */
public abstract class sizeOf {

    /* renamed from: o.sizeOf$IconCompatParcelizer */
    public interface IconCompatParcelizer<D> {
        size<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(size<D> size, D d);

        void onLoaderReset(size<D> size);
    }

    public abstract void IconCompatParcelizer();

    @Deprecated
    public abstract void MediaBrowserCompat$CustomActionResultReceiver(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract <D> size<D> read(IconCompatParcelizer<D> iconCompatParcelizer);

    public static <T extends maxSize & CheckCaptureModule_GetLookAndFeelParametersFactory> sizeOf MediaBrowserCompat$ItemReceiver(T t) {
        return new toString(t, ((CheckCaptureModule_GetLookAndFeelParametersFactory) t).getViewModelStore());
    }
}
