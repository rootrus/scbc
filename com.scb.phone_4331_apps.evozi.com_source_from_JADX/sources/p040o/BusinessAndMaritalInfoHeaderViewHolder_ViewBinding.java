package p040o;

import java.io.IOException;

/* renamed from: o.BusinessAndMaritalInfoHeaderViewHolder_ViewBinding */
public final class BusinessAndMaritalInfoHeaderViewHolder_ViewBinding extends BusinessAndMaritalInfoInputViewHolder {
    public BusinessAndMaritalInfoHeaderViewHolder_ViewBinding(String str, int i, String str2, int i2) throws IOException {
        super(str, i, str2, i2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        if (!"Connection".equalsIgnoreCase(str) || !"close".equalsIgnoreCase(str2)) {
            super.MediaBrowserCompat$CustomActionResultReceiver(str, str2);
        }
    }
}
