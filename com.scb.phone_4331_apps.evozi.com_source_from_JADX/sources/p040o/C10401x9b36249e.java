package p040o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.HmlDocumentListAdapter$DocumentViewHolder_ViewBinding$MediaBrowserCompat$ItemReceiver */
class C10401x9b36249e extends HmlDocumentListAdapter$DocumentViewHolder_ViewBinding {
    private boolean MediaBrowserCompat$CustomActionResultReceiver = true;

    public C10401x9b36249e(OutputStream outputStream) {
        super(outputStream);
    }

    public final void IconCompatParcelizer(int i) throws IOException {
        if (this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = false;
        } else {
            super.IconCompatParcelizer(i);
        }
    }
}
