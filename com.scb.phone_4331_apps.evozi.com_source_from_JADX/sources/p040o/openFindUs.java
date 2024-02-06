package p040o;

import p040o.lambda$new$0;

/* renamed from: o.openFindUs */
public final class openFindUs extends lambda$new$0.NationalIdActivity {
    private Runnable MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public openFindUs(Runnable runnable, long j, NationalIdActivity_ViewBinding nationalIdActivity_ViewBinding) {
        super(j, nationalIdActivity_ViewBinding);
        onGetStartedClick.write((Object) runnable, "block");
        onGetStartedClick.write((Object) nationalIdActivity_ViewBinding, "taskContext");
        this.MediaBrowserCompat$ItemReceiver = runnable;
    }

    public final void run() {
        try {
            this.MediaBrowserCompat$ItemReceiver.run();
        } finally {
            this.MediaBrowserCompat$SearchResultReceiver.read();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Task[");
        Runnable runnable = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) runnable, "$this$classSimpleName");
        String simpleName = runnable.getClass().getSimpleName();
        onGetStartedClick.IconCompatParcelizer((Object) simpleName, "this::class.java.simpleName");
        sb.append(simpleName);
        sb.append('@');
        Runnable runnable2 = this.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) runnable2, "$this$hexAddress");
        String hexString = Integer.toHexString(System.identityHashCode(runnable2));
        onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
        sb.append(hexString);
        sb.append(", ");
        sb.append(this.RatingCompat);
        sb.append(", ");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(']');
        return sb.toString();
    }
}
