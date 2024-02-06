package p040o;

import com.scb.phone.view.fragment.additionaldocument.DocumentUploadFragment$MediaBrowserCompat$ItemReceiver;
import java.util.ArrayList;

/* renamed from: o.createDoubleSparseArray */
public final /* synthetic */ class createDoubleSparseArray implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ DocumentUploadFragment$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ createDoubleSparseArray(DocumentUploadFragment$MediaBrowserCompat$ItemReceiver documentUploadFragment$MediaBrowserCompat$ItemReceiver) {
        this.write = documentUploadFragment$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (drawTextGlyphs next : ((drawTextWithFont) obj).MediaBrowserCompat$CustomActionResultReceiver) {
            arrayList.add(new getScaledPhoto(next.MediaBrowserCompat$ItemReceiver, next.MediaBrowserCompat$CustomActionResultReceiver));
        }
        return arrayList;
    }
}
