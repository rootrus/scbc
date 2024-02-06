package p040o;

import com.scb.phone.R;
import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import com.scb.phone.view.custom.common.EditTextDecorator$MediaBrowserCompat$ItemReceiver;
import p040o.PhenotypeFlag;

/* renamed from: o.onDetectMotionDone */
public final /* synthetic */ class onDetectMotionDone implements EditTextDecorator$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ MwBusinessDetailsActivity write;

    public /* synthetic */ onDetectMotionDone(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.write = mwBusinessDetailsActivity;
    }

    public final String read(String str) {
        boolean z;
        MwBusinessDetailsActivity mwBusinessDetailsActivity = this.write;
        PhenotypeFlag.zza zza = new PhenotypeFlag.zza();
        if (str == null) {
            z = false;
        } else {
            z = zza.IconCompatParcelizer.matcher(str).matches();
        }
        if (z) {
            return null;
        }
        return mwBusinessDetailsActivity.getString(R.string.mw_bd_error_email);
    }
}
