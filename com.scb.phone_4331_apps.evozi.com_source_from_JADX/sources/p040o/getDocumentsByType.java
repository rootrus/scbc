package p040o;

import android.view.MenuItem;
import com.scb.phone.view.fragment.deposit.DepositDetailTransactionFragment;
import okhttp3.internal.cache.DiskLruCache;
import org.threeten.p041bp.OffsetDateTime;
import p040o.FirebaseCrashlytics;
import p040o.setOverflowReserved;

/* renamed from: o.getDocumentsByType */
public final /* synthetic */ class getDocumentsByType implements setOverflowReserved.IconCompatParcelizer {
    private final /* synthetic */ DepositDetailTransactionFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getDocumentsByType(DepositDetailTransactionFragment depositDetailTransactionFragment) {
        this.MediaBrowserCompat$ItemReceiver = depositDetailTransactionFragment;
    }

    public final boolean write(MenuItem menuItem) {
        String str;
        DepositDetailTransactionFragment depositDetailTransactionFragment = this.MediaBrowserCompat$ItemReceiver;
        getLastReturnCode getlastreturncode = depositDetailTransactionFragment.mDepositTransactionPresenter;
        int order = menuItem.getOrder();
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("monthIndex: %d", Integer.valueOf(order));
        if (getlastreturncode.RatingCompat != null) {
            TrackedDocument trackedDocument = TrackedDocument.MediaBrowserCompat$CustomActionResultReceiver;
            if (getlastreturncode.RatingCompat != null) {
                trackedDocument.IconCompatParcelizer(getlastreturncode.RatingCompat);
            }
        }
        OffsetDateTime minusMonths = OffsetDateTime.now().minusMonths((long) order);
        String format = minusMonths.withDayOfMonth(1).format(getlastreturncode.MediaBrowserCompat$ItemReceiver);
        if (order == 0) {
            str = OffsetDateTime.now().format(getlastreturncode.MediaBrowserCompat$ItemReceiver);
        } else {
            str = minusMonths.plusMonths(1).withDayOfMonth(1).minusDays(1).format(getlastreturncode.MediaBrowserCompat$ItemReceiver);
        }
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("startDate: %s, endDate: %s", format, str);
        FirebaseCrashlytics.C33741 r4 = new FirebaseCrashlytics.C33741();
        r4.read = DiskLruCache.VERSION_1;
        r4.IconCompatParcelizer = format;
        r4.MediaBrowserCompat$CustomActionResultReceiver = str;
        getlastreturncode.read = r4;
        getlastreturncode.read(false, 0);
        depositDetailTransactionFragment.mTextTxnMonth.setText(menuItem.getTitle());
        return true;
    }
}
