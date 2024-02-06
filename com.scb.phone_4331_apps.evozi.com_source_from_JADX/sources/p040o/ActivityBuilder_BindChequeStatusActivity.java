package p040o;

import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.fragment.hml.HmlNTBPersonalInfoFragment;

/* renamed from: o.ActivityBuilder_BindChequeStatusActivity */
public final /* synthetic */ class ActivityBuilder_BindChequeStatusActivity implements CustomEditText.IconCompatParcelizer {
    private final /* synthetic */ HmlNTBPersonalInfoFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_BindChequeStatusActivity(HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment) {
        this.MediaBrowserCompat$ItemReceiver = hmlNTBPersonalInfoFragment;
    }

    public final boolean IconCompatParcelizer(CustomEditText customEditText, String str) {
        setResultCode setresultcode = this.MediaBrowserCompat$ItemReceiver.presenter;
        int i = 17;
        if (str.length() < 17) {
            i = str.length();
        }
        getRawTempFilenames getrawtempfilenames = new getRawTempFilenames(str, i);
        if (setresultcode.RatingCompat != null) {
            getrawtempfilenames.IconCompatParcelizer(setresultcode.RatingCompat);
        }
        return true;
    }
}
