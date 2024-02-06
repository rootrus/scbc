package p040o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: o.CreditCardDetailViewPagerAdapter$CreditCardItemViewHolder */
public final class CreditCardDetailViewPagerAdapter$CreditCardItemViewHolder implements Iterable<DebitCardDetailAdapter$DebitCardHolder> {
    private final List<DebitCardDetailAdapter$DebitCardHolder> MediaBrowserCompat$CustomActionResultReceiver = new LinkedList();
    private final Map<String, List<DebitCardDetailAdapter$DebitCardHolder>> MediaBrowserCompat$ItemReceiver = new HashMap();

    public final DebitCardDetailAdapter$DebitCardHolder IconCompatParcelizer(String str) {
        List list = this.MediaBrowserCompat$ItemReceiver.get(str.toLowerCase(Locale.ROOT));
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (DebitCardDetailAdapter$DebitCardHolder) list.get(0);
    }

    public final Iterator<DebitCardDetailAdapter$DebitCardHolder> iterator() {
        return Collections.unmodifiableList(this.MediaBrowserCompat$CustomActionResultReceiver).iterator();
    }

    public final String toString() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.toString();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(DebitCardDetailAdapter$DebitCardHolder debitCardDetailAdapter$DebitCardHolder) {
        String lowerCase = debitCardDetailAdapter$DebitCardHolder.MediaBrowserCompat$ItemReceiver.toLowerCase(Locale.ROOT);
        List list = this.MediaBrowserCompat$ItemReceiver.get(lowerCase);
        if (list == null) {
            list = new LinkedList();
            this.MediaBrowserCompat$ItemReceiver.put(lowerCase, list);
        }
        list.add(debitCardDetailAdapter$DebitCardHolder);
        this.MediaBrowserCompat$CustomActionResultReceiver.add(debitCardDetailAdapter$DebitCardHolder);
    }
}
