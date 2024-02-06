package p040o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: o.setShowsDialog */
public final class setShowsDialog implements Handler.Callback {
    public static setShowsDialog MediaBrowserCompat$CustomActionResultReceiver;
    private final Handler IconCompatParcelizer = new Handler(Looper.getMainLooper(), this);
    public setShowsDialog$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;
    public final Object read = new Object();
    public setShowsDialog$MediaBrowserCompat$CustomActionResultReceiver write;

    /* renamed from: o.setShowsDialog$write */
    public interface write {
        void read(int i);

        void write();
    }

    public final void read(int i, write write2) {
        boolean z;
        synchronized (this.read) {
            if (MediaBrowserCompat$ItemReceiver(write2)) {
                this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver = i;
                this.IconCompatParcelizer.removeCallbacksAndMessages(this.MediaBrowserCompat$ItemReceiver);
                MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver);
                return;
            }
            if (MediaBrowserCompat$CustomActionResultReceiver(write2)) {
                this.write.MediaBrowserCompat$ItemReceiver = i;
            } else {
                this.write = new setShowsDialog$MediaBrowserCompat$CustomActionResultReceiver(i, write2);
            }
            if (this.MediaBrowserCompat$ItemReceiver != null) {
                write write3 = this.MediaBrowserCompat$ItemReceiver.read.get();
                if (write3 != null) {
                    write3.read(4);
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            this.MediaBrowserCompat$ItemReceiver = null;
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void IconCompatParcelizer(write write2) {
        synchronized (this.read) {
            if (MediaBrowserCompat$ItemReceiver(write2)) {
                this.MediaBrowserCompat$ItemReceiver = null;
                if (this.write != null) {
                    MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
        }
    }

    public final void write(write write2) {
        synchronized (this.read) {
            if (MediaBrowserCompat$ItemReceiver(write2)) {
                this.IconCompatParcelizer.removeCallbacksAndMessages(this.MediaBrowserCompat$ItemReceiver);
            }
        }
    }

    public final boolean read(write write2) {
        boolean z;
        synchronized (this.read) {
            z = MediaBrowserCompat$ItemReceiver(write2) || MediaBrowserCompat$CustomActionResultReceiver(write2);
        }
        return z;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        setShowsDialog$MediaBrowserCompat$CustomActionResultReceiver setshowsdialog_mediabrowsercompat_customactionresultreceiver = this.write;
        if (setshowsdialog_mediabrowsercompat_customactionresultreceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = setshowsdialog_mediabrowsercompat_customactionresultreceiver;
            this.write = null;
            write write2 = setshowsdialog_mediabrowsercompat_customactionresultreceiver.read.get();
            if (write2 != null) {
                write2.write();
            } else {
                this.MediaBrowserCompat$ItemReceiver = null;
            }
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(write write2) {
        setShowsDialog$MediaBrowserCompat$CustomActionResultReceiver setshowsdialog_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver;
        if (setshowsdialog_mediabrowsercompat_customactionresultreceiver != null) {
            if (write2 != null && setshowsdialog_mediabrowsercompat_customactionresultreceiver.read.get() == write2) {
                return true;
            }
        }
        return false;
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver(write write2) {
        setShowsDialog$MediaBrowserCompat$CustomActionResultReceiver setshowsdialog_mediabrowsercompat_customactionresultreceiver = this.write;
        if (setshowsdialog_mediabrowsercompat_customactionresultreceiver != null) {
            if (write2 != null && setshowsdialog_mediabrowsercompat_customactionresultreceiver.read.get() == write2) {
                return true;
            }
        }
        return false;
    }

    public final void MediaBrowserCompat$ItemReceiver(setShowsDialog$MediaBrowserCompat$CustomActionResultReceiver setshowsdialog_mediabrowsercompat_customactionresultreceiver) {
        if (setshowsdialog_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver != -2) {
            int i = 2750;
            if (setshowsdialog_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver > 0) {
                i = setshowsdialog_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver;
            } else if (setshowsdialog_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver == -1) {
                i = ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED;
            }
            this.IconCompatParcelizer.removeCallbacksAndMessages(setshowsdialog_mediabrowsercompat_customactionresultreceiver);
            Handler handler = this.IconCompatParcelizer;
            handler.sendMessageDelayed(Message.obtain(handler, 0, setshowsdialog_mediabrowsercompat_customactionresultreceiver), (long) i);
        }
    }

    public final boolean handleMessage(Message message) {
        write write2;
        if (message.what != 0) {
            return false;
        }
        setShowsDialog$MediaBrowserCompat$CustomActionResultReceiver setshowsdialog_mediabrowsercompat_customactionresultreceiver = (setShowsDialog$MediaBrowserCompat$CustomActionResultReceiver) message.obj;
        synchronized (this.read) {
            if ((this.MediaBrowserCompat$ItemReceiver == setshowsdialog_mediabrowsercompat_customactionresultreceiver || this.write == setshowsdialog_mediabrowsercompat_customactionresultreceiver) && (write2 = setshowsdialog_mediabrowsercompat_customactionresultreceiver.read.get()) != null) {
                write2.read(2);
            }
        }
        return true;
    }
}
