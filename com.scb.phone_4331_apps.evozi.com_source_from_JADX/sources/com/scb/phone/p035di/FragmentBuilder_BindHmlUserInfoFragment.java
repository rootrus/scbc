package com.scb.phone.p035di;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.hml.HmlUserInfoFragment;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.FragmentBuilder_BindHmlUserInfoFragment */
public abstract class FragmentBuilder_BindHmlUserInfoFragment {

    /* renamed from: com.scb.phone.di.FragmentBuilder_BindHmlUserInfoFragment$write */
    public interface write extends MileageQuantitySelectionActivity_ViewBinding<HmlUserInfoFragment> {

        /* renamed from: com.scb.phone.di.FragmentBuilder_BindHmlUserInfoFragment$write$IconCompatParcelizer */
        public static abstract class IconCompatParcelizer extends C1241xc75ead43<HmlUserInfoFragment> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Fragment> read(write.IconCompatParcelizer iconCompatParcelizer);
}
