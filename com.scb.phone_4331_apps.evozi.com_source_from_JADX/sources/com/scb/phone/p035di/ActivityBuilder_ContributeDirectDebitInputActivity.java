package com.scb.phone.p035di;

import android.app.Activity;
import com.scb.phone.view.activity.directdebit.DirectDebitInputActivity;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.ActivityBuilder_ContributeDirectDebitInputActivity */
public abstract class ActivityBuilder_ContributeDirectDebitInputActivity {

    /* renamed from: com.scb.phone.di.ActivityBuilder_ContributeDirectDebitInputActivity$write */
    public interface write extends MileageQuantitySelectionActivity_ViewBinding<DirectDebitInputActivity> {

        /* renamed from: com.scb.phone.di.ActivityBuilder_ContributeDirectDebitInputActivity$write$read */
        public static abstract class read extends C1241xc75ead43<DirectDebitInputActivity> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Activity> write(write.read read);
}
