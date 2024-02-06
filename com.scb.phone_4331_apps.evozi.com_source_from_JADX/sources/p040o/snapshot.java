package p040o;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.Executor;

/* renamed from: o.snapshot */
public abstract class snapshot<D> extends size<D> {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile snapshot<D>.ItemReceiver mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile snapshot<D>.ItemReceiver mTask;
    long mUpdateThrottle;

    public void cancelLoadInBackground() {
    }

    public abstract D loadInBackground();

    public void onCanceled(D d) {
    }

    public snapshot(Context context) {
        this(context, valueOf.write);
    }

    private snapshot(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000;
        this.mExecutor = executor;
    }

    public void setUpdateThrottle(long j) {
        this.mUpdateThrottle = j;
        if (j != 0) {
            this.mHandler = new Handler();
        }
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new snapshot$MediaBrowserCompat$ItemReceiver(this);
        executePendingTask();
    }

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.IconCompatParcelizer) {
                this.mTask.IconCompatParcelizer = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        } else if (this.mTask.IconCompatParcelizer) {
            this.mTask.IconCompatParcelizer = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        } else {
            boolean MediaBrowserCompat$CustomActionResultReceiver = this.mTask.MediaBrowserCompat$CustomActionResultReceiver(false);
            if (MediaBrowserCompat$CustomActionResultReceiver) {
                this.mCancellingTask = this.mTask;
                cancelLoadInBackground();
            }
            this.mTask = null;
            return MediaBrowserCompat$CustomActionResultReceiver;
        }
    }

    /* access modifiers changed from: package-private */
    public void executePendingTask() {
        if (this.mCancellingTask == null && this.mTask != null) {
            if (this.mTask.IconCompatParcelizer) {
                this.mTask.IconCompatParcelizer = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
                this.mTask.read(this.mExecutor, (Params[]) null);
                return;
            }
            this.mTask.IconCompatParcelizer = true;
            this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnCancelled(snapshot<D>.ItemReceiver itemReceiver, D d) {
        onCanceled(d);
        if (this.mCancellingTask == itemReceiver) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnLoadComplete(snapshot<D>.ItemReceiver itemReceiver, D d) {
        if (this.mTask != itemReceiver) {
            dispatchOnCancelled(itemReceiver, d);
        } else if (isAbandoned()) {
            onCanceled(d);
        } else {
            commitContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mTask = null;
            deliverResult(d);
        }
    }

    /* access modifiers changed from: protected */
    public D onLoadInBackground() {
        return loadInBackground();
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public void waitForLoader() {
        snapshot<D>.ItemReceiver itemReceiver = this.mTask;
        if (itemReceiver != null) {
            itemReceiver.write();
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.IconCompatParcelizer);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.IconCompatParcelizer);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            setInputType.MediaBrowserCompat$ItemReceiver(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            setInputType.write(this.mLastLoadCompleteTime, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }
}
