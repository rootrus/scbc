package p040o;

import android.os.Parcelable;
import android.view.View;
import java.util.concurrent.Callable;

/* renamed from: o.loadInBackground */
public interface loadInBackground extends executePendingTask, Parcelable, View.OnClickListener, Iterable, Callable {

    /* renamed from: o.loadInBackground$write */
    public interface write {
        void read(boolean z);
    }
}
