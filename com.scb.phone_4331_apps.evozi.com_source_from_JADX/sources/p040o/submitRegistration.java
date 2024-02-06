package p040o;

import android.view.View;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.common.CommonInputViewGroup$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.submitRegistration */
public final /* synthetic */ class submitRegistration implements View.OnClickListener {
    private final /* synthetic */ CommonInputViewGroup read;

    public /* synthetic */ submitRegistration(CommonInputViewGroup commonInputViewGroup) {
        this.read = commonInputViewGroup;
    }

    public final void onClick(View view) {
        CommonInputViewGroup$MediaBrowserCompat$ItemReceiver commonInputViewGroup$MediaBrowserCompat$ItemReceiver = this.read.IconCompatParcelizer;
        if (commonInputViewGroup$MediaBrowserCompat$ItemReceiver != null) {
            commonInputViewGroup$MediaBrowserCompat$ItemReceiver.read();
        }
    }
}
