package com.scb.phone.p035di;

import android.app.Activity;
import com.scb.phone.view.activity.cardmanagement.CardActivationActivity;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.ActivityBuilder_BindCardActivationActivity */
public abstract class ActivityBuilder_BindCardActivationActivity {

    /* renamed from: com.scb.phone.di.ActivityBuilder_BindCardActivationActivity$read */
    public interface read extends MileageQuantitySelectionActivity_ViewBinding<CardActivationActivity> {

        /* renamed from: com.scb.phone.di.ActivityBuilder_BindCardActivationActivity$read$IconCompatParcelizer */
        public static abstract class IconCompatParcelizer extends C1241xc75ead43<CardActivationActivity> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Activity> write(read.IconCompatParcelizer iconCompatParcelizer);
}
