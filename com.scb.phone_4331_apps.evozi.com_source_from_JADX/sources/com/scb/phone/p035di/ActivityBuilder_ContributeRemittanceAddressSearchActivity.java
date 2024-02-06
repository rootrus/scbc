package com.scb.phone.p035di;

import android.app.Activity;
import com.scb.phone.view.activity.remittance.RemittanceAddressSearchActivity;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.ActivityBuilder_ContributeRemittanceAddressSearchActivity */
public abstract class ActivityBuilder_ContributeRemittanceAddressSearchActivity {

    /* renamed from: com.scb.phone.di.ActivityBuilder_ContributeRemittanceAddressSearchActivity$IconCompatParcelizer */
    public interface IconCompatParcelizer extends MileageQuantitySelectionActivity_ViewBinding<RemittanceAddressSearchActivity> {

        /* renamed from: com.scb.phone.di.ActivityBuilder_ContributeRemittanceAddressSearchActivity$IconCompatParcelizer$write */
        public static abstract class write extends C1241xc75ead43<RemittanceAddressSearchActivity> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Activity> read(IconCompatParcelizer.write write);
}
