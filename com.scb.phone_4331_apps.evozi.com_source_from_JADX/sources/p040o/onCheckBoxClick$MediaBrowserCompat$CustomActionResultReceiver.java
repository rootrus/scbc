package p040o;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: o.onCheckBoxClick$MediaBrowserCompat$CustomActionResultReceiver */
public abstract class onCheckBoxClick$MediaBrowserCompat$CustomActionResultReceiver {
    final ThreadLocal<String> MediaBrowserCompat$CustomActionResultReceiver = new ThreadLocal<>();

    /* access modifiers changed from: protected */
    public boolean MediaBrowserCompat$ItemReceiver(int i) {
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract void read(int i, String str, Throwable th);

    public void MediaBrowserCompat$CustomActionResultReceiver(String str, Object... objArr) {
        write(2, (Throwable) null, str, objArr);
    }

    public void MediaBrowserCompat$ItemReceiver(Throwable th, String str, Object... objArr) {
        write(2, th, str, objArr);
    }

    public void read(String str, Object... objArr) {
        write(3, (Throwable) null, str, objArr);
    }

    public void IconCompatParcelizer(Throwable th, String str, Object... objArr) {
        write(3, th, str, objArr);
    }

    public void read(Throwable th) {
        write(3, th, (String) null, new Object[0]);
    }

    public void IconCompatParcelizer(String str, Object... objArr) {
        write(4, (Throwable) null, str, objArr);
    }

    public void write(String str, Object... objArr) {
        write(5, (Throwable) null, str, objArr);
    }

    public void read(Throwable th, String str, Object... objArr) {
        write(5, th, str, objArr);
    }

    public void IconCompatParcelizer(Throwable th) {
        write(5, th, (String) null, new Object[0]);
    }

    public void MediaBrowserCompat$ItemReceiver(String str, Object... objArr) {
        write(6, (Throwable) null, str, objArr);
    }

    public void write(Throwable th, String str, Object... objArr) {
        write(6, th, str, objArr);
    }

    public void write(Throwable th) {
        write(6, th, (String) null, new Object[0]);
    }

    private static String MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter(stringWriter, false);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    private void write(int i, Throwable th, String str, Object... objArr) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.get() != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver.remove();
        }
        if (MediaBrowserCompat$ItemReceiver(i)) {
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str != null) {
                if (objArr != null && objArr.length > 0) {
                    str = String.format(str, objArr);
                }
                if (th != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("\n");
                    sb.append(MediaBrowserCompat$CustomActionResultReceiver(th));
                    str = sb.toString();
                }
            } else if (th != null) {
                str = MediaBrowserCompat$CustomActionResultReceiver(th);
            } else {
                return;
            }
            read(i, str, th);
        }
    }
}
