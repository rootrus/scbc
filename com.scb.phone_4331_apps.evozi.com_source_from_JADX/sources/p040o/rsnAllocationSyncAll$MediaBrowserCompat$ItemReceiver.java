package p040o;

import android.os.AsyncTask;
import java.util.Set;

/* renamed from: o.rsnAllocationSyncAll$MediaBrowserCompat$ItemReceiver */
class rsnAllocationSyncAll$MediaBrowserCompat$ItemReceiver extends AsyncTask<Float, Void, Set<? extends rsnClosureCreate<T>>> {
    private /* synthetic */ rsnAllocationSyncAll IconCompatParcelizer;

    private rsnAllocationSyncAll$MediaBrowserCompat$ItemReceiver(rsnAllocationSyncAll rsnallocationsyncall) {
        this.IconCompatParcelizer = rsnallocationsyncall;
    }

    /* synthetic */ rsnAllocationSyncAll$MediaBrowserCompat$ItemReceiver(rsnAllocationSyncAll rsnallocationsyncall, byte b) {
        this(rsnallocationsyncall);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        this.IconCompatParcelizer.RatingCompat.read((Set) obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: IconCompatParcelizer */
    public Set<? extends rsnClosureCreate<T>> doInBackground(Float... fArr) {
        this.IconCompatParcelizer.write.readLock().lock();
        try {
            return this.IconCompatParcelizer.read.MediaBrowserCompat$CustomActionResultReceiver((double) fArr[0].floatValue());
        } finally {
            this.IconCompatParcelizer.write.readLock().unlock();
        }
    }
}
