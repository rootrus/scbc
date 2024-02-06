package p040o;

import java.io.File;
import p040o.postponeEnterTransition;

/* renamed from: o.onViewCreated */
final class onViewCreated<DataType> implements postponeEnterTransition.write {
    private final onActivityResult IconCompatParcelizer;
    private final isInLayout<DataType> MediaBrowserCompat$ItemReceiver;
    private final DataType write;

    onViewCreated(isInLayout<DataType> isinlayout, DataType datatype, onActivityResult onactivityresult) {
        this.MediaBrowserCompat$ItemReceiver = isinlayout;
        this.write = datatype;
        this.IconCompatParcelizer = onactivityresult;
    }

    public final boolean write(File file) {
        return this.MediaBrowserCompat$ItemReceiver.read(this.write, file, this.IconCompatParcelizer);
    }
}
