package p040o;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: o.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() {
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    };
    MediaSessionCompat$QueueItem IconCompatParcelizer;
    final boolean MediaBrowserCompat$ItemReceiver = false;
    final Handler read;

    /* access modifiers changed from: protected */
    public void IconCompatParcelizer(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: o.ParcelableVolumeInfo$write */
    class write implements Runnable {
        final int MediaBrowserCompat$CustomActionResultReceiver;
        final Bundle read;

        write(int i, Bundle bundle) {
            this.MediaBrowserCompat$CustomActionResultReceiver = i;
            this.read = bundle;
        }

        public final void run() {
            ParcelableVolumeInfo.this.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = new ParcelableVolumeInfo$MediaBrowserCompat$ItemReceiver(this);
            }
            parcel.writeStrongBinder(this.IconCompatParcelizer.asBinder());
        }
    }

    ParcelableVolumeInfo(Parcel parcel) {
        MediaSessionCompat$QueueItem mediaSessionCompat$QueueItem = null;
        this.read = null;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("o.MediaSessionCompat$QueueItem");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof MediaSessionCompat$QueueItem)) {
                mediaSessionCompat$QueueItem = new C6957xdfc89cdc(readStrongBinder);
            } else {
                mediaSessionCompat$QueueItem = (MediaSessionCompat$QueueItem) queryLocalInterface;
            }
        }
        this.IconCompatParcelizer = mediaSessionCompat$QueueItem;
    }
}
