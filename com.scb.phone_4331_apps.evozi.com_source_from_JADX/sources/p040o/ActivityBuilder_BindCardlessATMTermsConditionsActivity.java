package p040o;

import android.text.TextUtils;
import com.scb.phone.view.custom.common.DateInputText;
import com.scb.phone.view.fragment.hml.HmlETBPersonalInfoFragment;

/* renamed from: o.ActivityBuilder_BindCardlessATMTermsConditionsActivity */
public final /* synthetic */ class ActivityBuilder_BindCardlessATMTermsConditionsActivity implements DateInputText.read {
    private final /* synthetic */ HmlETBPersonalInfoFragment read;

    public /* synthetic */ ActivityBuilder_BindCardlessATMTermsConditionsActivity(HmlETBPersonalInfoFragment hmlETBPersonalInfoFragment) {
        this.read = hmlETBPersonalInfoFragment;
    }

    public final void read(String str) {
        CustomAdvertisingIdClient customAdvertisingIdClient = this.read.MediaBrowserCompat$CustomActionResultReceiver;
        customAdvertisingIdClient.write(getPageID$MediaBrowserCompat$ItemReceiver.EXPIRY_DATE, customAdvertisingIdClient.MediaBrowserCompat$ItemReceiver(str), TextUtils.isEmpty(str));
    }
}
