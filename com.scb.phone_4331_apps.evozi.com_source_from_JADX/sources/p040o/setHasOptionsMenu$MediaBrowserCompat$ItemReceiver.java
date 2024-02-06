package p040o;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: o.setHasOptionsMenu$MediaBrowserCompat$ItemReceiver */
public interface setHasOptionsMenu$MediaBrowserCompat$ItemReceiver<Data> {
    Class<Data> IconCompatParcelizer();

    void IconCompatParcelizer(Data data) throws IOException;

    Data read(File file) throws FileNotFoundException;
}
