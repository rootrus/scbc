package p040o;

/* renamed from: o.performAction */
public final class performAction {
    public String IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    public String write;

    /* renamed from: o.performAction$read */
    public static final class read {
        public String IconCompatParcelizer;
        public String MediaBrowserCompat$ItemReceiver;
        public boolean read;
        public String write;
    }

    public /* synthetic */ performAction(read read2, byte b) {
        this(read2);
    }

    private performAction(read read2) {
        this.IconCompatParcelizer = read2.write;
        this.write = read2.MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$CustomActionResultReceiver = read2.read;
    }
}
