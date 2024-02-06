package p040o;

import java.io.IOException;

/* renamed from: o.BusinessAndMaritalInfoHeaderViewHolder */
public final class BusinessAndMaritalInfoHeaderViewHolder extends AccountSelectorViewHolder_ViewBinding {
    public BusinessAndMaritalInfoHeaderViewHolder(String str, int i, String str2, int i2) {
        super(str, i, str2, i2);
    }

    public final BusinessAndMaritalInfoInputViewHolder_ViewBinding read() throws IOException {
        BusinessAndMaritalInfoHeaderViewHolder_ViewBinding businessAndMaritalInfoHeaderViewHolder_ViewBinding = new BusinessAndMaritalInfoHeaderViewHolder_ViewBinding(this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.MediaDescriptionCompat);
        businessAndMaritalInfoHeaderViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver("Connection", "keep-alive");
        return businessAndMaritalInfoHeaderViewHolder_ViewBinding;
    }
}
