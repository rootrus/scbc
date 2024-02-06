package p040o;

import java.io.IOException;
import org.xmlpull.repackaged.p103v1.XmlPullParserException;

/* renamed from: o.AccountHeaderViewHolder */
public interface AccountHeaderViewHolder {
    Object readInstance(HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding, String str, String str2, AccountRemarkViewHolder accountRemarkViewHolder) throws IOException, XmlPullParserException;

    void register(AccountSelectorViewHolder accountSelectorViewHolder);

    void writeInstance(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding, Object obj) throws IOException;
}
