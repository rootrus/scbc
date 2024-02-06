package p040o;

import android.widget.CompoundButton;
import com.scb.phone.view.custom.CustomCheckboxView;

/* renamed from: o.verifyNTBReferral */
public final /* synthetic */ class verifyNTBReferral implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ CustomCheckboxView write;

    public /* synthetic */ verifyNTBReferral(CustomCheckboxView customCheckboxView) {
        this.write = customCheckboxView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        CustomCheckboxView.write write2 = this.write.MediaBrowserCompat$CustomActionResultReceiver;
        if (write2 != null) {
            write2.IconCompatParcelizer(z);
        }
    }
}
