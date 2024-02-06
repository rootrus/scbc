package com.scb.phone.p035di;

import android.app.Activity;
import com.scb.phone.view.activity.hml.HmlCompanyNameActivity;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.ActivityBuilder_ContributeHmlCompanyNameActivity */
public abstract class ActivityBuilder_ContributeHmlCompanyNameActivity {

    /* renamed from: com.scb.phone.di.ActivityBuilder_ContributeHmlCompanyNameActivity$write */
    public interface write extends MileageQuantitySelectionActivity_ViewBinding<HmlCompanyNameActivity> {

        /* renamed from: com.scb.phone.di.ActivityBuilder_ContributeHmlCompanyNameActivity$write$IconCompatParcelizer */
        public static abstract class IconCompatParcelizer extends C1241xc75ead43<HmlCompanyNameActivity> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Activity> read(write.IconCompatParcelizer iconCompatParcelizer);
}
