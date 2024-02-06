package com.scb.phone.p035di;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.ccrredemption.review.NormalRedemptionSlipFragment;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.FragmentBuilder_BindSlipFragment */
public abstract class FragmentBuilder_BindSlipFragment {

    /* renamed from: com.scb.phone.di.FragmentBuilder_BindSlipFragment$write */
    public interface write extends MileageQuantitySelectionActivity_ViewBinding<NormalRedemptionSlipFragment> {

        /* renamed from: com.scb.phone.di.FragmentBuilder_BindSlipFragment$write$IconCompatParcelizer */
        public static abstract class IconCompatParcelizer extends C1241xc75ead43<NormalRedemptionSlipFragment> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Fragment> write(write.IconCompatParcelizer iconCompatParcelizer);
}
