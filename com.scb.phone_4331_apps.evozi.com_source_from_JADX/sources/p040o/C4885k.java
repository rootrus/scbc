package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.getTopLeftCornerWidth;
import p040o.writeUInt64NoTag;

/* renamed from: o.k */
public final /* synthetic */ class C4885k implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ asGzippedBytes write;

    /* renamed from: o.k$a */
    public final /* synthetic */ class C4886a implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ String write;

        public /* synthetic */ C4886a(String str) {
            this.write = str;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth.setForceShowIcon) obj).mo18712j_(this.write);
        }
    }

    public /* synthetic */ C4885k(asGzippedBytes asgzippedbytes) {
        this.write = asgzippedbytes;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckExtractActivity_MembersInjector.PlaybackStateCompat.CustomAction) obj).IconCompatParcelizer(this.write);
    }
}
