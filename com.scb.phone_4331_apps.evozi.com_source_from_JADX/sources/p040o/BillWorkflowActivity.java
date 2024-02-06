package p040o;

import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.BillWorkflowActivity */
public final /* synthetic */ class BillWorkflowActivity implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.BillWorkflowActivity$a */
    public final /* synthetic */ class C6337a implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ C6337a MediaBrowserCompat$CustomActionResultReceiver = new C6337a();

        private /* synthetic */ C6337a() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth.setIcon) obj).MediaDescriptionCompat();
        }
    }

    public /* synthetic */ BillWorkflowActivity(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final boolean write(Object obj) {
        return this.MediaBrowserCompat$ItemReceiver.equals(((parseFile) obj).read.write);
    }
}
