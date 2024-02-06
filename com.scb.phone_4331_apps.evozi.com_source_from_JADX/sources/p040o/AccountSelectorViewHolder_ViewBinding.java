package p040o;

import java.io.IOException;
import java.net.Proxy;

/* renamed from: o.AccountSelectorViewHolder_ViewBinding */
public class AccountSelectorViewHolder_ViewBinding extends AccountRepaymentPlanSelectorViewHolder {
    protected final int MediaBrowserCompat$CustomActionResultReceiver;
    protected final String MediaBrowserCompat$ItemReceiver;
    private BusinessAndMaritalInfoInputViewHolder MediaMetadataCompat;
    protected final String read;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AccountSelectorViewHolder_ViewBinding(java.lang.String r3, int r4, java.lang.String r5, int r6) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "https://"
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ":"
            r0.append(r1)
            r0.append(r4)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r2.<init>(r0, r6)
            r2.read = r3
            r2.MediaBrowserCompat$CustomActionResultReceiver = r4
            r2.MediaBrowserCompat$ItemReceiver = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AccountSelectorViewHolder_ViewBinding.<init>(java.lang.String, int, java.lang.String, int):void");
    }

    public BusinessAndMaritalInfoInputViewHolder_ViewBinding read() throws IOException {
        BusinessAndMaritalInfoInputViewHolder businessAndMaritalInfoInputViewHolder = this.MediaMetadataCompat;
        if (businessAndMaritalInfoInputViewHolder != null) {
            return businessAndMaritalInfoInputViewHolder;
        }
        BusinessAndMaritalInfoInputViewHolder businessAndMaritalInfoInputViewHolder2 = new BusinessAndMaritalInfoInputViewHolder((Proxy) null, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver, this.MediaDescriptionCompat);
        this.MediaMetadataCompat = businessAndMaritalInfoInputViewHolder2;
        return businessAndMaritalInfoInputViewHolder2;
    }
}
