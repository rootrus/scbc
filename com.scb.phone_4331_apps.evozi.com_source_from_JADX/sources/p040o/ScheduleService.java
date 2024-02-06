package p040o;

import com.scb.phone.view.fragment.ccrredemption.ecoupon.ECouponReviewFragment;

/* renamed from: o.ScheduleService */
public final class ScheduleService implements MileageQuantitySelectionActivity<ECouponReviewFragment> {
    public static void write(ECouponReviewFragment eCouponReviewFragment, upperCaseFirstLetter uppercasefirstletter) {
        eCouponReviewFragment.reviewPresenter = uppercasefirstletter;
    }

    public static void write(ECouponReviewFragment eCouponReviewFragment, newParameterizedTypeWithOwner newparameterizedtypewithowner) {
        eCouponReviewFragment.reviewRedemptionPresenter = newparameterizedtypewithowner;
    }
}
