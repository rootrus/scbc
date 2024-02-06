package p040o;

import java.io.PrintStream;
import java.util.Queue;
import p040o.set;

/* renamed from: o.CustomProfileImageView_ViewBinding */
public final class CustomProfileImageView_ViewBinding implements CustomDoubleCircleBorderView {
    public static final int IconCompatParcelizer = write;
    private static int write;
    private Queue<Object> MediaBrowserCompat$ItemReceiver;

    static {
        set.Cdefault.IconCompatParcelizer();
        write = 128;
        if (setVBorder.read()) {
            write = 16;
        }
        String property = System.getProperty("rx.ring-buffer.size");
        if (property != null) {
            try {
                write = Integer.parseInt(property);
            } catch (Exception e) {
                PrintStream printStream = System.err;
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to set 'rx.buffer.size' with value ");
                sb.append(property);
                sb.append(" => ");
                sb.append(e.getMessage());
                printStream.println(sb.toString());
            }
        }
        new setBorderState<Queue<Object>>() {
            /* access modifiers changed from: protected */
            public final /* synthetic */ Object read() {
                return new setMaxLines(CustomProfileImageView_ViewBinding.IconCompatParcelizer);
            }
        };
        new setBorderState<Queue<Object>>() {
            /* access modifiers changed from: protected */
            public final /* synthetic */ Object read() {
                return new setInvalidInput(CustomProfileImageView_ViewBinding.IconCompatParcelizer);
            }
        };
    }

    private CustomProfileImageView_ViewBinding(Queue<Object> queue) {
        this.MediaBrowserCompat$ItemReceiver = queue;
    }

    public final void write() {
        synchronized (this) {
        }
    }

    CustomProfileImageView_ViewBinding() {
        this(new setImageHeight(IconCompatParcelizer));
    }

    public final boolean MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$ItemReceiver == null;
    }
}
