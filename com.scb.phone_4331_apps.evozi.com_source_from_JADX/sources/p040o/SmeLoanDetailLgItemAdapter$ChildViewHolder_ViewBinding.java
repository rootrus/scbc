package p040o;

import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

/* renamed from: o.SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding */
public final class SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding {
    public final String IconCompatParcelizer;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final String write;

    SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding() {
    }

    static DividendSummaryAdapter$ParentViewHolder_ViewBinding read(Object obj) {
        return obj instanceof X509Certificate ? DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(((X509Certificate) obj).getIssuerX500Principal().getEncoded()) : DividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(((X500Principal) ((MobileListAdapter$MobileListCustomView) obj).read().read()[0]).getEncoded());
    }

    public SmeLoanDetailLgItemAdapter$ChildViewHolder_ViewBinding(String str, String str2, String str3, String str4) {
        onGetStartedClick.write((Object) str, "transactionToken");
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.IconCompatParcelizer = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
        this.write = str4;
    }
}
