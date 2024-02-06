package p040o;

import com.scb.phone.view.activity.prepaid.request.PrepaidRequestTermConditionsActivity;

/* renamed from: o.setRightArrowMask */
public final class setRightArrowMask implements MileageQuantitySelectionActivity<PrepaidRequestTermConditionsActivity> {
    public static void read(PrepaidRequestTermConditionsActivity prepaidRequestTermConditionsActivity, IDeserializer iDeserializer) {
        prepaidRequestTermConditionsActivity.presenter = iDeserializer;
    }
}
