package p040o;

import java.io.IOException;
import org.xmlpull.repackaged.p103v1.XmlPullParserException;

/* renamed from: o.AccountEStatementViewHolder_ViewBinding */
public final class AccountEStatementViewHolder_ViewBinding implements AccountHeaderViewHolder {
    public static Class IconCompatParcelizer = new byte[0].getClass();

    public final Object readInstance(HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding, String str, String str2, AccountRemarkViewHolder accountRemarkViewHolder) throws IOException, XmlPullParserException {
        return LendingIssuerAdapter$IssuerViewHolder.write(historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$ResultReceiverWrapper());
    }

    public final void writeInstance(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding, Object obj) throws IOException {
        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$MediaItem(LendingIssuerAdapter$IssuerViewHolder.MediaBrowserCompat$ItemReceiver((byte[]) obj));
    }

    public final void register(AccountSelectorViewHolder accountSelectorViewHolder) {
        accountSelectorViewHolder.IconCompatParcelizer(accountSelectorViewHolder.RatingCompat, "base64Binary", IconCompatParcelizer, this);
        accountSelectorViewHolder.IconCompatParcelizer("http://schemas.xmlsoap.org/soap/encoding/", "base64", IconCompatParcelizer, this);
    }
}
