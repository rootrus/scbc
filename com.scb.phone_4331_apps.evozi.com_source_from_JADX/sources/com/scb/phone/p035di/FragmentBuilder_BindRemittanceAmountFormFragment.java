package com.scb.phone.p035di;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.remittance.RemittanceAmountFormFragment;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.FragmentBuilder_BindRemittanceAmountFormFragment */
public abstract class FragmentBuilder_BindRemittanceAmountFormFragment {

    /* renamed from: com.scb.phone.di.FragmentBuilder_BindRemittanceAmountFormFragment$IconCompatParcelizer */
    public interface IconCompatParcelizer extends MileageQuantitySelectionActivity_ViewBinding<RemittanceAmountFormFragment> {

        /* renamed from: com.scb.phone.di.FragmentBuilder_BindRemittanceAmountFormFragment$IconCompatParcelizer$write */
        public static abstract class write extends C1241xc75ead43<RemittanceAmountFormFragment> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Fragment> MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.write write);
}