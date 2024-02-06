package p040o;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.cardmanagement.DeejungPlanDetailFragment;
import com.scb.phone.view.fragment.cardmanagement.DeejungPlanErrorFragment;
import java.util.List;
import p040o.FirebaseApp;

/* renamed from: o.resetPin */
public final class resetPin extends setCardElevation {
    private final List<normalize> IconCompatParcelizer;
    private final getAddress2 MediaBrowserCompat$CustomActionResultReceiver;

    public resetPin(setTitleMarginStart settitlemarginstart, List<normalize> list, getAddress2 getaddress2) {
        super(settitlemarginstart);
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = getaddress2;
    }

    public final Fragment read(int i) {
        normalize normalize = this.IconCompatParcelizer.get(i);
        FirebaseApp.UiExecutor uiExecutor = normalize.ParcelableVolumeInfo;
        if (uiExecutor == null || "1000".equals(uiExecutor.MediaBrowserCompat$ItemReceiver)) {
            DeejungPlanDetailFragment IconCompatParcelizer2 = DeejungPlanDetailFragment.IconCompatParcelizer(normalize);
            IconCompatParcelizer2.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            return IconCompatParcelizer2;
        }
        String str = uiExecutor.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = uiExecutor.IconCompatParcelizer;
        boolean z = false;
        CharSequence[] charSequenceArr = {normalize.MediaMetadataCompat};
        if (!SetupQuickTopUpReviewActivity.write(charSequenceArr)) {
            int i2 = 0;
            while (true) {
                if (i2 > 0) {
                    break;
                }
                CharSequence charSequence = charSequenceArr[0];
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        return DeejungPlanErrorFragment.read(str, str2, !z);
    }

    public final int getCount() {
        return this.IconCompatParcelizer.size();
    }
}
