package com.scb.phone.view.activity.ccrredemption.ecoupon;

import com.scb.phone.R;
import com.scb.phone.data.network.service.LoginService;
import com.scb.phone.view.activity.BaseActivity;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p040o.C7195kR;
import p040o.FieldNamingPolicy;
import p040o.HmlPinActivity;
import p040o.onGetStartedClick;

public class BaseECouponActivity extends BaseActivity {
    private final List<Integer> MediaDescriptionCompat;

    public BaseECouponActivity() {
        Integer[] numArr = {Integer.valueOf(R.string.my_e_coupon_valid), Integer.valueOf(R.string.my_e_coupon_invalid)};
        onGetStartedClick.write((Object) numArr, "elements");
        onGetStartedClick.write((Object) numArr, "$this$asList");
        List<Integer> asList = Arrays.asList(numArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        this.MediaDescriptionCompat = asList;
    }

    public static final class IconCompatParcelizer {
        public LoginService write;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(LoginService loginService) {
            this.write = loginService;
        }
    }

    /* access modifiers changed from: protected */
    public final List<Integer> MediaSessionCompat$ResultReceiverWrapper() {
        return this.MediaDescriptionCompat;
    }

    protected static int IconCompatParcelizer(FieldNamingPolicy.C33496 r1) {
        onGetStartedClick.write((Object) r1, "pageType");
        int i = C7195kR.MediaBrowserCompat$ItemReceiver[r1.ordinal()];
        if (i == 1) {
            return R.string.e_coupon_details;
        }
        if (i == 2) {
            return R.string.e_coupon_quantity_header;
        }
        if (i == 3) {
            return R.string.review;
        }
        throw new NoWhenBranchMatchedException();
    }
}
