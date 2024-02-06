package p040o;

import android.widget.NumberPicker;
import com.scb.phone.view.activity.deposit.exportstatement.DepositExportStatementActivity;
import java.util.ArrayList;
import java.util.Calendar;

/* renamed from: o.oC */
public final /* synthetic */ class C7273oC implements NumberPicker.OnValueChangeListener {
    private final /* synthetic */ DepositExportStatementActivity IconCompatParcelizer;

    public /* synthetic */ C7273oC(DepositExportStatementActivity depositExportStatementActivity) {
        this.IconCompatParcelizer = depositExportStatementActivity;
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        DepositExportStatementActivity depositExportStatementActivity = this.IconCompatParcelizer;
        depositExportStatementActivity.PlaybackStateCompat = i2;
        String str = depositExportStatementActivity.PlaybackStateCompat$CustomAction[i2];
        adornBoundary adornboundary = depositExportStatementActivity.depositExportStatementPresenter;
        toBitmap tobitmap = new toBitmap(adornboundary.MediaBrowserCompat$ItemReceiver(str));
        if (adornboundary.RatingCompat != null) {
            tobitmap.IconCompatParcelizer(adornboundary.RatingCompat);
        }
        depositExportStatementActivity.MediaSessionCompat$ResultReceiverWrapper = 0;
        depositExportStatementActivity.MediaSessionCompat$ResultReceiverWrapper();
        depositExportStatementActivity.MediaSessionCompat$Token.setValue(0);
        int i3 = depositExportStatementActivity.MediaSessionCompat$ResultReceiverWrapper;
        String str2 = depositExportStatementActivity.PlaybackStateCompat$CustomAction[depositExportStatementActivity.PlaybackStateCompat];
        if (depositExportStatementActivity.MediaBrowserCompat$SearchResultReceiver) {
            adornBoundary adornboundary2 = depositExportStatementActivity.depositExportStatementPresenter;
            ArrayList arrayList = adornboundary2.MediaBrowserCompat$SearchResultReceiver.get(str2.trim());
            if (arrayList != null) {
                adornboundary2.MediaBrowserCompat$MediaItem = (Calendar) arrayList.get(i3);
                return;
            }
            return;
        }
        adornBoundary adornboundary3 = depositExportStatementActivity.depositExportStatementPresenter;
        ArrayList arrayList2 = adornboundary3.MediaBrowserCompat$SearchResultReceiver.get(str2.trim());
        if (arrayList2 != null) {
            adornboundary3.MediaBrowserCompat$ItemReceiver = (Calendar) arrayList2.get(i3);
        }
    }
}
