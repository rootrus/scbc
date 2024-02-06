package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.sme.gifting.ReceiveFragment;
import com.scb.phone.view.fragment.sme.gifting.SentFragment;
import p040o.CrashlyticsReport;

/* renamed from: o.submitFatca  reason: case insensitive filesystem */
public final class C10888submitFatca extends BrowserActionsFallbackMenuView {
    private final Context read;

    public C10888submitFatca(setTitleMarginStart settitlemarginstart, Context context) {
        super(settitlemarginstart);
        this.read = context;
    }

    public final Fragment MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return i == 1 ? new SentFragment() : new ReceiveFragment();
    }

    public final int getCount() {
        return CrashlyticsReport.FilesPayload.values().length;
    }

    public final CharSequence getPageTitle(int i) {
        Context context;
        CrashlyticsReport.FilesPayload filesPayload;
        if (i == 1) {
            context = this.read;
            filesPayload = CrashlyticsReport.FilesPayload.SENT;
        } else {
            context = this.read;
            filesPayload = CrashlyticsReport.FilesPayload.RECEIVED;
        }
        return context.getString(filesPayload.tabResourceId);
    }
}
