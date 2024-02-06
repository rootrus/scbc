package p040o;

import p040o.TouchPointInstructionActivity;

/* renamed from: o.containsEntryImpl */
public final /* synthetic */ class containsEntryImpl implements dump {
    private final /* synthetic */ int[] write;

    public /* synthetic */ containsEntryImpl(int[] iArr) {
        this.write = iArr;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        int[] iArr = this.write;
        if ("1000".equalsIgnoreCase(((TouchPointInstructionActivity.IconCompatParcelizer) obj).MediaBrowserCompat$ItemReceiver)) {
            iArr[0] = iArr[0] + 1;
        }
    }
}
