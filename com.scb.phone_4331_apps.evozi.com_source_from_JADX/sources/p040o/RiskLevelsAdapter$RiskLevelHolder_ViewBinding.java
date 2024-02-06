package p040o;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: o.RiskLevelsAdapter$RiskLevelHolder_ViewBinding */
public final class RiskLevelsAdapter$RiskLevelHolder_ViewBinding extends HmlDocumentListAdapter$DocumentViewHolder_ViewBinding {
    public RiskLevelsAdapter$RiskLevelHolder_ViewBinding(OutputStream outputStream) {
        super(outputStream);
    }

    public final void MediaBrowserCompat$ItemReceiver(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) throws IOException {
        if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
            hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem().MediaDescriptionCompat().IconCompatParcelizer(this);
            return;
        }
        throw new IOException("null object detected");
    }
}
