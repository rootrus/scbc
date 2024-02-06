package com.bumptech.glide.load.engine;

import android.util.Log;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040o.isPostponed;
import p040o.isStateSaved;

public final class GlideException extends Exception {
    private static final StackTraceElement[] MediaBrowserCompat$ItemReceiver = new StackTraceElement[0];
    private final List<Throwable> IconCompatParcelizer;
    public isPostponed MediaBrowserCompat$CustomActionResultReceiver;
    private String MediaBrowserCompat$MediaItem;
    public Class<?> read;
    public isStateSaved write;

    public final Throwable fillInStackTrace() {
        return this;
    }

    public GlideException(String str) {
        this(str, (List<Throwable>) Collections.emptyList());
    }

    public GlideException(String str, Throwable th) {
        this(str, (List<Throwable>) Collections.singletonList(th));
    }

    public GlideException(String str, List<Throwable> list) {
        this.MediaBrowserCompat$MediaItem = str;
        setStackTrace(MediaBrowserCompat$ItemReceiver);
        this.IconCompatParcelizer = list;
    }

    private void MediaBrowserCompat$ItemReceiver(Throwable th, List<Throwable> list) {
        if (th instanceof GlideException) {
            for (Throwable MediaBrowserCompat$ItemReceiver2 : ((GlideException) th).IconCompatParcelizer) {
                MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2, list);
            }
            return;
        }
        list.add(th);
    }

    public final void printStackTrace() {
        printStackTrace(System.err);
    }

    public final String getMessage() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.MediaBrowserCompat$MediaItem);
        String str3 = "";
        if (this.read != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(", ");
            sb2.append(this.read);
            str = sb2.toString();
        } else {
            str = str3;
        }
        sb.append(str);
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(", ");
            sb3.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            str2 = sb3.toString();
        } else {
            str2 = str3;
        }
        sb.append(str2);
        if (this.write != null) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(", ");
            sb4.append(this.write);
            str3 = sb4.toString();
        }
        sb.append(str3);
        ArrayList<Throwable> arrayList = new ArrayList<>();
        MediaBrowserCompat$ItemReceiver(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            sb.append("\nThere was 1 cause:");
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            sb.append(" causes:");
        }
        for (Throwable th : arrayList) {
            sb.append(10);
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    private static void IconCompatParcelizer(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append(10);
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    static final class read implements Appendable {
        private boolean MediaBrowserCompat$ItemReceiver = true;
        private final Appendable write;

        read(Appendable appendable) {
            this.write = appendable;
        }

        public final Appendable append(char c) throws IOException {
            boolean z = false;
            if (this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = false;
                this.write.append("  ");
            }
            if (c == 10) {
                z = true;
            }
            this.MediaBrowserCompat$ItemReceiver = z;
            this.write.append(c);
            return this;
        }

        public final Appendable append(CharSequence charSequence) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            return append(charSequence, 0, charSequence.length());
        }

        public final Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
            if (charSequence == null) {
                charSequence = "";
            }
            boolean z = false;
            if (this.MediaBrowserCompat$ItemReceiver) {
                this.MediaBrowserCompat$ItemReceiver = false;
                this.write.append("  ");
            }
            if (charSequence.length() > 0 && charSequence.charAt(i2 - 1) == 10) {
                z = true;
            }
            this.MediaBrowserCompat$ItemReceiver = z;
            this.write.append(charSequence, i, i2);
            return this;
        }
    }

    private static void IconCompatParcelizer(List<Throwable> list, Appendable appendable) {
        try {
            int size = list.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                appendable.append("Cause (").append(String.valueOf(i2)).append(" of ").append(String.valueOf(size)).append("): ");
                Throwable th = list.get(i);
                if (th instanceof GlideException) {
                    GlideException glideException = (GlideException) th;
                    IconCompatParcelizer((Throwable) glideException, appendable);
                    IconCompatParcelizer(glideException.IconCompatParcelizer, (Appendable) new read(appendable));
                } else {
                    IconCompatParcelizer(th, appendable);
                }
                i = i2;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        ArrayList arrayList = new ArrayList();
        MediaBrowserCompat$ItemReceiver(this, arrayList);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            StringBuilder sb = new StringBuilder();
            sb.append("Root cause (");
            int i2 = i + 1;
            sb.append(i2);
            sb.append(" of ");
            sb.append(size);
            sb.append(")");
            Log.i(str, sb.toString(), (Throwable) arrayList.get(i));
            i = i2;
        }
    }

    public final void printStackTrace(PrintStream printStream) {
        IconCompatParcelizer((Throwable) this, (Appendable) printStream);
        IconCompatParcelizer(this.IconCompatParcelizer, (Appendable) new read(printStream));
    }

    public final void printStackTrace(PrintWriter printWriter) {
        IconCompatParcelizer((Throwable) this, (Appendable) printWriter);
        IconCompatParcelizer(this.IconCompatParcelizer, (Appendable) new read(printWriter));
    }
}
