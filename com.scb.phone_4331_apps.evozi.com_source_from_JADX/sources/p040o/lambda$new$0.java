package p040o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.lambda$new$0 */
public class lambda$new$0 implements Parcelable {
    public static final Parcelable.Creator<lambda$new$0> CREATOR = new Parcelable.Creator<lambda$new$0>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new lambda$new$0(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new lambda$new$0[i];
        }
    };
    public String IconCompatParcelizer;
    public String read;

    /* renamed from: o.lambda$new$0$AssessmentPopupActivity */
    public interface AssessmentPopupActivity<P1, P2, P3, P4, P5, P6, P7, P8, P9, P10, R> extends HmlSummaryActivity<R> {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.read);
    }

    /* renamed from: o.lambda$new$0$NdidNationalIdInputActivity */
    public class NdidNationalIdInputActivity<E> {
        private static final AtomicReferenceFieldUpdater MediaBrowserCompat$ItemReceiver = AtomicReferenceFieldUpdater.newUpdater(NdidNationalIdInputActivity.class, Object.class, "_cur");
        private volatile Object _cur = new NdidNationalIdInputActivity(8, false);

        public final int write() {
            long j = ((NdidNationalIdInputActivity) this._cur)._state;
            return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver() {
            while (true) {
                NdidNationalIdInputActivity ndidNationalIdInputActivity = (NdidNationalIdInputActivity) this._cur;
                if (!ndidNationalIdInputActivity.MediaBrowserCompat$ItemReceiver()) {
                    MediaBrowserCompat$ItemReceiver.compareAndSet(this, ndidNationalIdInputActivity, ndidNationalIdInputActivity.read(ndidNationalIdInputActivity.MediaBrowserCompat$CustomActionResultReceiver()));
                } else {
                    return;
                }
            }
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver(E e) {
            onGetStartedClick.write((Object) e, "element");
            while (true) {
                NdidNationalIdInputActivity ndidNationalIdInputActivity = (NdidNationalIdInputActivity) this._cur;
                int MediaBrowserCompat$CustomActionResultReceiver = ndidNationalIdInputActivity.MediaBrowserCompat$CustomActionResultReceiver(e);
                if (MediaBrowserCompat$CustomActionResultReceiver == 0) {
                    return true;
                }
                if (MediaBrowserCompat$CustomActionResultReceiver == 1) {
                    MediaBrowserCompat$ItemReceiver.compareAndSet(this, ndidNationalIdInputActivity, ndidNationalIdInputActivity.read(ndidNationalIdInputActivity.MediaBrowserCompat$CustomActionResultReceiver()));
                } else if (MediaBrowserCompat$CustomActionResultReceiver == 2) {
                    return false;
                }
            }
        }

        public final E IconCompatParcelizer() {
            while (true) {
                NdidNationalIdInputActivity ndidNationalIdInputActivity = (NdidNationalIdInputActivity) this._cur;
                E write = ndidNationalIdInputActivity.write();
                if (write != NdidNationalIdInputActivity.MediaBrowserCompat$CustomActionResultReceiver) {
                    return write;
                }
                MediaBrowserCompat$ItemReceiver.compareAndSet(this, ndidNationalIdInputActivity, ndidNationalIdInputActivity.read(ndidNationalIdInputActivity.MediaBrowserCompat$CustomActionResultReceiver()));
            }
        }
    }

    private lambda$new$0() {
    }

    public static lambda$new$0 IconCompatParcelizer() {
        return new lambda$new$0();
    }

    protected lambda$new$0(Parcel parcel) {
        this.IconCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
    }

    /* renamed from: o.lambda$new$0$NationalIdActivity */
    public abstract class NationalIdActivity implements Runnable {
        public NationalIdActivity_ViewBinding MediaBrowserCompat$SearchResultReceiver;
        public long RatingCompat;

        public NationalIdActivity(long j, NationalIdActivity_ViewBinding nationalIdActivity_ViewBinding) {
            onGetStartedClick.write((Object) nationalIdActivity_ViewBinding, "taskContext");
            this.RatingCompat = j;
            this.MediaBrowserCompat$SearchResultReceiver = nationalIdActivity_ViewBinding;
        }

        public NationalIdActivity() {
            this(0, lambda$setListeners$3$NationalIdActivity.write);
        }
    }
}
