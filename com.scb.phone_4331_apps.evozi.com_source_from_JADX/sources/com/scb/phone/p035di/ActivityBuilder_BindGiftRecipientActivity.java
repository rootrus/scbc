package com.scb.phone.p035di;

import android.app.Activity;
import com.scb.phone.view.activity.sme.gifting.GiftRecipientActivity;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.ActivityBuilder_BindGiftRecipientActivity */
public abstract class ActivityBuilder_BindGiftRecipientActivity {

    /* renamed from: com.scb.phone.di.ActivityBuilder_BindGiftRecipientActivity$write */
    public interface write extends MileageQuantitySelectionActivity_ViewBinding<GiftRecipientActivity> {

        /* renamed from: com.scb.phone.di.ActivityBuilder_BindGiftRecipientActivity$write$IconCompatParcelizer */
        public static abstract class IconCompatParcelizer extends C1241xc75ead43<GiftRecipientActivity> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Activity> read(write.IconCompatParcelizer iconCompatParcelizer);
}
