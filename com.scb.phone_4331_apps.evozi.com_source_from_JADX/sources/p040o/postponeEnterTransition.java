package p040o;

import java.io.File;

/* renamed from: o.postponeEnterTransition */
public interface postponeEnterTransition {

    /* renamed from: o.postponeEnterTransition$write */
    public interface write {
        boolean write(File file);
    }

    File write(isStateSaved isstatesaved);

    void write(isStateSaved isstatesaved, write write2);
}
