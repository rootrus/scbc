package p040o;

import org.apache.http.conn.UnsupportedSchemeException;

/* renamed from: o.CardViewPagerAdapter$ItemViewHolder_ViewBinding */
public final class CardViewPagerAdapter$ItemViewHolder_ViewBinding implements DealsBuyReviewActivity {
    public static final CardViewPagerAdapter$ItemViewHolder_ViewBinding IconCompatParcelizer = new CardViewPagerAdapter$ItemViewHolder_ViewBinding();

    public final int read(PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder) throws UnsupportedSchemeException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "HTTP host");
        int i = privacyManagementLandingViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
        if (i > 0) {
            return i;
        }
        String str = privacyManagementLandingViewHolder.read;
        if (str.equalsIgnoreCase("http")) {
            return 80;
        }
        if (str.equalsIgnoreCase("https")) {
            return 443;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" protocol is not supported");
        throw new UnsupportedSchemeException(sb.toString());
    }
}
