package p040o;

import p040o.omGMBSectionClick;

/* renamed from: o.omGMBSectionClick$MediaBrowserCompat$CustomActionResultReceiver */
final class omGMBSectionClick$MediaBrowserCompat$CustomActionResultReceiver extends omGMBSectionClick.write {
    private final Runnable IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public omGMBSectionClick$MediaBrowserCompat$CustomActionResultReceiver(long j, Runnable runnable) {
        super(j);
        onGetStartedClick.write((Object) runnable, "block");
        this.IconCompatParcelizer = runnable;
    }

    public final void run() {
        this.IconCompatParcelizer.run();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(this.IconCompatParcelizer.toString());
        return sb.toString();
    }
}
