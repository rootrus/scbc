package p040o;

/* renamed from: o.rsnClosureSetArg$MediaBrowserCompat$ItemReceiver */
class rsnClosureSetArg$MediaBrowserCompat$ItemReceiver implements Runnable {
    private final int read;
    private /* synthetic */ rsnClosureSetArg write;

    public rsnClosureSetArg$MediaBrowserCompat$ItemReceiver(rsnClosureSetArg rsnclosuresetarg, int i) {
        this.write = rsnclosuresetarg;
        this.read = i;
    }

    public final void run() {
        try {
            Thread.sleep((long) ((Math.random() * 500.0d) + 500.0d));
        } catch (InterruptedException unused) {
        }
        this.write.IconCompatParcelizer(this.read);
    }
}
