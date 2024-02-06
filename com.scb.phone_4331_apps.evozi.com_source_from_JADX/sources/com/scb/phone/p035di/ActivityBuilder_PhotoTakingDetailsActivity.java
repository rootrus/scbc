package com.scb.phone.p035di;

import android.app.Activity;
import com.scb.phone.view.activity.additionaldocument.DocumentInstructionsActivity;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.ActivityBuilder_PhotoTakingDetailsActivity */
public abstract class ActivityBuilder_PhotoTakingDetailsActivity {

    /* renamed from: com.scb.phone.di.ActivityBuilder_PhotoTakingDetailsActivity$write */
    public interface write extends MileageQuantitySelectionActivity_ViewBinding<DocumentInstructionsActivity> {

        /* renamed from: com.scb.phone.di.ActivityBuilder_PhotoTakingDetailsActivity$write$IconCompatParcelizer */
        public static abstract class IconCompatParcelizer extends C1241xc75ead43<DocumentInstructionsActivity> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Activity> MediaBrowserCompat$ItemReceiver(write.IconCompatParcelizer iconCompatParcelizer);
}
