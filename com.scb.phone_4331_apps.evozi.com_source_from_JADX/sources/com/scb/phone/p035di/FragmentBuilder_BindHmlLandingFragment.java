package com.scb.phone.p035di;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.hml.HmlETBCalculatorFragment;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.FragmentBuilder_BindHmlLandingFragment */
public abstract class FragmentBuilder_BindHmlLandingFragment {

    /* renamed from: com.scb.phone.di.FragmentBuilder_BindHmlLandingFragment$IconCompatParcelizer */
    public interface IconCompatParcelizer extends MileageQuantitySelectionActivity_ViewBinding<HmlETBCalculatorFragment> {

        /* renamed from: com.scb.phone.di.FragmentBuilder_BindHmlLandingFragment$IconCompatParcelizer$read */
        public static abstract class read extends C1241xc75ead43<HmlETBCalculatorFragment> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Fragment> MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer.read read);
}
