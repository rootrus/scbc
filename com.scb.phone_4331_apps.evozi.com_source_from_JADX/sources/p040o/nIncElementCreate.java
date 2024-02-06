package p040o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: o.nIncElementCreate */
public final class nIncElementCreate implements Handler.Callback {
    public static nIncElementCreate read;
    public nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
    public final Object MediaBrowserCompat$CustomActionResultReceiver = new Object();
    public final Handler MediaBrowserCompat$ItemReceiver = new Handler(Looper.getMainLooper(), this);
    public nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver write;

    /* renamed from: o.nIncElementCreate$read */
    public interface read {
        void IconCompatParcelizer(int i);

        void MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$ItemReceiver(read read2, int i) {
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            if (MediaBrowserCompat$CustomActionResultReceiver(read2)) {
                MediaBrowserCompat$ItemReceiver(this.write, i);
            } else if (MediaMetadataCompat(read2)) {
                MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer, i);
            }
        }
    }

    public final void IconCompatParcelizer(read read2) {
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            if (MediaBrowserCompat$CustomActionResultReceiver(read2)) {
                this.write = null;
                if (this.IconCompatParcelizer != null) {
                    MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(read read2) {
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            if (MediaBrowserCompat$CustomActionResultReceiver(read2) && !this.write.MediaBrowserCompat$ItemReceiver) {
                this.write.MediaBrowserCompat$ItemReceiver = true;
                this.MediaBrowserCompat$ItemReceiver.removeCallbacksAndMessages(this.write);
            }
        }
    }

    public final void read(read read2) {
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            if (MediaBrowserCompat$CustomActionResultReceiver(read2) && this.write.MediaBrowserCompat$ItemReceiver) {
                this.write.MediaBrowserCompat$ItemReceiver = false;
                write(this.write);
            }
        }
    }

    public final boolean write(read read2) {
        boolean z;
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            z = MediaBrowserCompat$CustomActionResultReceiver(read2) || MediaMetadataCompat(read2);
        }
        return z;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver nincelementcreate_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
        if (nincelementcreate_mediabrowsercompat_customactionresultreceiver != null) {
            this.write = nincelementcreate_mediabrowsercompat_customactionresultreceiver;
            this.IconCompatParcelizer = null;
            read read2 = nincelementcreate_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.get();
            if (read2 != null) {
                read2.MediaBrowserCompat$ItemReceiver();
            } else {
                this.write = null;
            }
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver nincelementcreate_mediabrowsercompat_customactionresultreceiver, int i) {
        read read2 = nincelementcreate_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (read2 == null) {
            return false;
        }
        this.MediaBrowserCompat$ItemReceiver.removeCallbacksAndMessages(nincelementcreate_mediabrowsercompat_customactionresultreceiver);
        read2.IconCompatParcelizer(i);
        return true;
    }

    private boolean MediaBrowserCompat$CustomActionResultReceiver(read read2) {
        nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver nincelementcreate_mediabrowsercompat_customactionresultreceiver = this.write;
        if (nincelementcreate_mediabrowsercompat_customactionresultreceiver != null) {
            if (read2 != null && nincelementcreate_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.get() == read2) {
                return true;
            }
        }
        return false;
    }

    private boolean MediaMetadataCompat(read read2) {
        nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver nincelementcreate_mediabrowsercompat_customactionresultreceiver = this.IconCompatParcelizer;
        if (nincelementcreate_mediabrowsercompat_customactionresultreceiver != null) {
            if (read2 != null && nincelementcreate_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver.get() == read2) {
                return true;
            }
        }
        return false;
    }

    public final void write(nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver nincelementcreate_mediabrowsercompat_customactionresultreceiver) {
        if (nincelementcreate_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer != -2) {
            int i = 2750;
            if (nincelementcreate_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer > 0) {
                i = nincelementcreate_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer;
            } else if (nincelementcreate_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer == -1) {
                i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            }
            this.MediaBrowserCompat$ItemReceiver.removeCallbacksAndMessages(nincelementcreate_mediabrowsercompat_customactionresultreceiver);
            Handler handler = this.MediaBrowserCompat$ItemReceiver;
            handler.sendMessageDelayed(Message.obtain(handler, 0, nincelementcreate_mediabrowsercompat_customactionresultreceiver), (long) i);
        }
    }

    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver nincelementcreate_mediabrowsercompat_customactionresultreceiver = (nIncElementCreate$MediaBrowserCompat$CustomActionResultReceiver) message.obj;
        synchronized (this.MediaBrowserCompat$CustomActionResultReceiver) {
            if (this.write == nincelementcreate_mediabrowsercompat_customactionresultreceiver || this.IconCompatParcelizer == nincelementcreate_mediabrowsercompat_customactionresultreceiver) {
                MediaBrowserCompat$ItemReceiver(nincelementcreate_mediabrowsercompat_customactionresultreceiver, 2);
            }
        }
        return true;
    }
}
