package p040o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: o.rsnAllocationCubeCreateFromBitmap */
public abstract class rsnAllocationCubeCreateFromBitmap {
    public abstract rsnAllocationData1D IconCompatParcelizer() throws IOException;

    /* access modifiers changed from: package-private */
    public ByteArrayOutputStream MediaBrowserCompat$CustomActionResultReceiver(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Charset charset = rsnAllocationCreateTyped.MediaBrowserCompat$ItemReceiver;
        rsnAllocationData1D IconCompatParcelizer = IconCompatParcelizer();
        IconCompatParcelizer.IconCompatParcelizer(false, obj);
        IconCompatParcelizer.flush();
        return byteArrayOutputStream;
    }
}
