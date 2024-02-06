package p040o;

import android.view.View;
import com.scb.phone.view.fragment.hml.HmlCalculatorFragment;
import p040o.setDomain;

/* renamed from: o.ActivityBuilder_BankingAgentTCActivity */
public final /* synthetic */ class ActivityBuilder_BankingAgentTCActivity implements View.OnFocusChangeListener {
    private final /* synthetic */ HmlCalculatorFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BankingAgentTCActivity(HmlCalculatorFragment hmlCalculatorFragment) {
        this.IconCompatParcelizer = hmlCalculatorFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        HmlCalculatorFragment hmlCalculatorFragment = this.IconCompatParcelizer;
        T t = hmlCalculatorFragment.presenter;
        double d = hmlCalculatorFragment.loanAmount.IconCompatParcelizer;
        int selectedItemPosition = hmlCalculatorFragment.schedulePayment.spinner.getSelectedItemPosition();
        boolean z2 = true;
        if (z) {
            t.ParcelableVolumeInfo = 0.0d;
            createGPSMetadata creategpsmetadata = createGPSMetadata.IconCompatParcelizer;
            if (t.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                creategpsmetadata.IconCompatParcelizer(t.RatingCompat);
                return;
            }
            return;
        }
        t.write = null;
        t.MediaMetadataCompat = d;
        getDefault getdefault = getDefault.IconCompatParcelizer;
        if (t.RatingCompat != null) {
            getdefault.IconCompatParcelizer(t.RatingCompat);
        }
        t.IconCompatParcelizer(t.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.get(selectedItemPosition), selectedItemPosition);
        if (d < t.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem) {
            createMetadataFromImage createmetadatafromimage = new createMetadataFromImage(t);
            if (t.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                createmetadatafromimage.IconCompatParcelizer(t.RatingCompat);
            }
        } else if (d > t.MediaBrowserCompat$ItemReceiver.read) {
            copyToTempImage copytotempimage = new copyToTempImage(t);
            if (t.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                copytotempimage.IconCompatParcelizer(t.RatingCompat);
            }
        } else {
            t.write(new setDomain.write());
        }
    }
}
