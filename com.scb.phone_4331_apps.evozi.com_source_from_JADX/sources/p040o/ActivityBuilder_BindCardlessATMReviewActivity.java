package p040o;

import android.text.TextUtils;
import com.scb.phone.view.custom.common.DateInputText;
import com.scb.phone.view.fragment.hml.HmlNTBPersonalInfoFragment;

/* renamed from: o.ActivityBuilder_BindCardlessATMReviewActivity */
public final /* synthetic */ class ActivityBuilder_BindCardlessATMReviewActivity implements DateInputText.read {
    private final /* synthetic */ HmlNTBPersonalInfoFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_BindCardlessATMReviewActivity(HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment) {
        this.IconCompatParcelizer = hmlNTBPersonalInfoFragment;
    }

    public final void read(String str) {
        setResultCode setresultcode = this.IconCompatParcelizer.presenter;
        setresultcode.write(getPageID$MediaBrowserCompat$ItemReceiver.BIRTH_DATE, setresultcode.MediaBrowserCompat$ItemReceiver(str), TextUtils.isEmpty(str));
    }
}
