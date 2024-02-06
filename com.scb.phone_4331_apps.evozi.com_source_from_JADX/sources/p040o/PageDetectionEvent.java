package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.PageDetectionEvent */
public final /* synthetic */ class PageDetectionEvent implements writeUInt64NoTag.IconCompatParcelizer {
    public static final /* synthetic */ PageDetectionEvent read = new PageDetectionEvent();

    /* renamed from: o.PageDetectionEvent$a */
    public final /* synthetic */ class C3726a implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ C3726a IconCompatParcelizer = new C3726a();

        private /* synthetic */ C3726a() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((IImageProcessor) obj).write();
        }
    }

    private /* synthetic */ PageDetectionEvent() {
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getExtractionListener) obj).write();
    }
}
