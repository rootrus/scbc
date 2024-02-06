package p040o;

import android.text.TextUtils;
import com.scb.phone.view.custom.common.DateInputText;
import com.scb.phone.view.fragment.hml.HmlNTBPersonalInfoFragment;

/* renamed from: o.ActivityBuilder_BindCardlessATMActivity */
public final /* synthetic */ class ActivityBuilder_BindCardlessATMActivity implements DateInputText.read {
    private final /* synthetic */ HmlNTBPersonalInfoFragment read;

    public /* synthetic */ ActivityBuilder_BindCardlessATMActivity(HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment) {
        this.read = hmlNTBPersonalInfoFragment;
    }

    public final void read(String str) {
        setResultCode setresultcode = this.read.presenter;
        setresultcode.write(getPageID$MediaBrowserCompat$ItemReceiver.ISSUE_DATE, setresultcode.MediaBrowserCompat$ItemReceiver(str), TextUtils.isEmpty(str));
    }
}
