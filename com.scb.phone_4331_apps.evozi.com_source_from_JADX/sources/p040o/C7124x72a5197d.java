package p040o;

import android.widget.RadioGroup;
import com.scb.phone.R;

/* renamed from: o.getSearchBillerList$MediaBrowserCompat$CustomActionResultReceiver */
final class C7124x72a5197d implements RadioGroup.OnCheckedChangeListener {
    private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;
    private /* synthetic */ getSearchBillerList read;

    C7124x72a5197d(getSearchBillerList getsearchbillerlist, FundFactSheetActivity fundFactSheetActivity) {
        this.read = getsearchbillerlist;
        this.IconCompatParcelizer = fundFactSheetActivity;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        if (!this.read.PlaybackStateCompat) {
            this.IconCompatParcelizer.invoke(getSearchBillerList.MediaBrowserCompat$ItemReceiver(i == R.id.rdb_direct_debit));
        }
    }
}
