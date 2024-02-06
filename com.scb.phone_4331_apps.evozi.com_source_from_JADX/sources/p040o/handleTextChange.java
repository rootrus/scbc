package p040o;

/* renamed from: o.handleTextChange */
public final class handleTextChange {
    private static final ThreadLocal<MwCreateQrActivity_ViewBinding> MediaBrowserCompat$CustomActionResultReceiver = new ThreadLocal<>();
    public static final handleTextChange write = new handleTextChange();

    private handleTextChange() {
    }

    public static MwCreateQrActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver() {
        MwCreateQrActivity_ViewBinding mwCreateQrActivity_ViewBinding = MediaBrowserCompat$CustomActionResultReceiver.get();
        if (mwCreateQrActivity_ViewBinding != null) {
            return mwCreateQrActivity_ViewBinding;
        }
        Thread currentThread = Thread.currentThread();
        onGetStartedClick.IconCompatParcelizer((Object) currentThread, "Thread.currentThread()");
        MwCreateQrActivity_ViewBinding smeLoanDetailActivity = new SmeLoanDetailActivity(currentThread);
        MediaBrowserCompat$CustomActionResultReceiver.set(smeLoanDetailActivity);
        return smeLoanDetailActivity;
    }

    public static void MediaBrowserCompat$ItemReceiver() {
        MediaBrowserCompat$CustomActionResultReceiver.set((Object) null);
    }

    public static void MediaBrowserCompat$ItemReceiver(MwCreateQrActivity_ViewBinding mwCreateQrActivity_ViewBinding) {
        onGetStartedClick.write((Object) mwCreateQrActivity_ViewBinding, "eventLoop");
        MediaBrowserCompat$CustomActionResultReceiver.set(mwCreateQrActivity_ViewBinding);
    }
}
