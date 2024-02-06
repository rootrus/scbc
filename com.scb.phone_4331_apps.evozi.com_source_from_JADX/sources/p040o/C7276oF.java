package p040o;

import android.widget.NumberPicker;
import com.scb.phone.view.activity.deposit.exportstatement.DepositExportStatementActivity;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: o.oF */
public final /* synthetic */ class C7276oF implements NumberPicker.OnValueChangeListener {
    private final /* synthetic */ DepositExportStatementActivity read;

    public /* synthetic */ C7276oF(DepositExportStatementActivity depositExportStatementActivity) {
        this.read = depositExportStatementActivity;
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        DepositExportStatementActivity depositExportStatementActivity = this.read;
        depositExportStatementActivity.MediaSessionCompat$ResultReceiverWrapper = i2;
        depositExportStatementActivity.MediaSessionCompat$ResultReceiverWrapper();
        String str = depositExportStatementActivity.PlaybackStateCompat$CustomAction[depositExportStatementActivity.PlaybackStateCompat];
        if (depositExportStatementActivity.MediaBrowserCompat$SearchResultReceiver) {
            adornBoundary adornboundary = depositExportStatementActivity.depositExportStatementPresenter;
            ArrayList arrayList = adornboundary.MediaBrowserCompat$SearchResultReceiver.get(str.trim());
            if (arrayList != null) {
                adornboundary.MediaBrowserCompat$MediaItem = (Calendar) arrayList.get(i2);
                return;
            }
            return;
        }
        adornBoundary adornboundary2 = depositExportStatementActivity.depositExportStatementPresenter;
        ArrayList arrayList2 = adornboundary2.MediaBrowserCompat$SearchResultReceiver.get(str.trim());
        if (arrayList2 != null) {
            adornboundary2.MediaBrowserCompat$ItemReceiver = (Calendar) arrayList2.get(i2);
        }
    }
}
