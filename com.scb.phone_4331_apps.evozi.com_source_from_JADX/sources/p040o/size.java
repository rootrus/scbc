package p040o;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: o.size */
public class size<D> {
    boolean mAbandoned = false;
    boolean mContentChanged = false;
    Context mContext;
    int mId;
    write<D> mListener;
    read<D> mOnLoadCanceledListener;
    boolean mProcessingChange = false;
    boolean mReset = true;
    boolean mStarted = false;

    /* renamed from: o.size$read */
    public interface read<D> {
        void write(size<D> size);
    }

    /* renamed from: o.size$write */
    public interface write<D> {
        void IconCompatParcelizer(size<D> size, D d);
    }

    /* access modifiers changed from: protected */
    public void onAbandon() {
    }

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
    }

    /* access modifiers changed from: protected */
    public void onReset() {
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
    }

    public size(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public void deliverResult(D d) {
        write<D> write2 = this.mListener;
        if (write2 != null) {
            write2.IconCompatParcelizer(this, d);
        }
    }

    public void deliverCancellation() {
        read<D> read2 = this.mOnLoadCanceledListener;
        if (read2 != null) {
            read2.write(this);
        }
    }

    public Context getContext() {
        return this.mContext;
    }

    public int getId() {
        return this.mId;
    }

    public void registerListener(int i, write<D> write2) {
        if (this.mListener == null) {
            this.mListener = write2;
            this.mId = i;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void unregisterListener(write<D> write2) {
        write<D> write3 = this.mListener;
        if (write3 == null) {
            throw new IllegalStateException("No listener register");
        } else if (write3 == write2) {
            this.mListener = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public void registerOnLoadCanceledListener(read<D> read2) {
        if (this.mOnLoadCanceledListener == null) {
            this.mOnLoadCanceledListener = read2;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void unregisterOnLoadCanceledListener(read<D> read2) {
        read<D> read3 = this.mOnLoadCanceledListener;
        if (read3 == null) {
            throw new IllegalStateException("No listener register");
        } else if (read3 == read2) {
            this.mOnLoadCanceledListener = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public boolean isStarted() {
        return this.mStarted;
    }

    public boolean isAbandoned() {
        return this.mAbandoned;
    }

    public boolean isReset() {
        return this.mReset;
    }

    public final void startLoading() {
        this.mStarted = true;
        this.mReset = false;
        this.mAbandoned = false;
        onStartLoading();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void forceLoad() {
        onForceLoad();
    }

    public void stopLoading() {
        this.mStarted = false;
        onStopLoading();
    }

    public void abandon() {
        this.mAbandoned = true;
        onAbandon();
    }

    public void reset() {
        onReset();
        this.mReset = true;
        this.mStarted = false;
        this.mAbandoned = false;
        this.mContentChanged = false;
        this.mProcessingChange = false;
    }

    public boolean takeContentChanged() {
        boolean z = this.mContentChanged;
        this.mContentChanged = false;
        this.mProcessingChange |= z;
        return z;
    }

    public void commitContentChanged() {
        this.mProcessingChange = false;
    }

    public void rollbackContentChanged() {
        if (this.mProcessingChange) {
            onContentChanged();
        }
    }

    public void onContentChanged() {
        if (this.mStarted) {
            forceLoad();
        } else {
            this.mContentChanged = true;
        }
    }

    public String dataToString(D d) {
        StringBuilder sb = new StringBuilder(64);
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Object) d, sb);
        sb.append("}");
        return sb.toString();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Object) this, sb);
        sb.append(" id=");
        sb.append(this.mId);
        sb.append("}");
        return sb.toString();
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.mId);
        printWriter.print(" mListener=");
        printWriter.println(this.mListener);
        if (this.mStarted || this.mContentChanged || this.mProcessingChange) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.mStarted);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.mContentChanged);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.mProcessingChange);
        }
        if (this.mAbandoned || this.mReset) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.mAbandoned);
            printWriter.print(" mReset=");
            printWriter.println(this.mReset);
        }
    }
}
