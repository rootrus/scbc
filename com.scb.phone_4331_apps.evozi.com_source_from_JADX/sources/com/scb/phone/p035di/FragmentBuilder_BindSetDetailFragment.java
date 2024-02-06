package com.scb.phone.p035di;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.etb.EtbSetDetailFragment;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.FragmentBuilder_BindSetDetailFragment */
public abstract class FragmentBuilder_BindSetDetailFragment {

    /* renamed from: com.scb.phone.di.FragmentBuilder_BindSetDetailFragment$write */
    public interface write extends MileageQuantitySelectionActivity_ViewBinding<EtbSetDetailFragment> {

        /* renamed from: com.scb.phone.di.FragmentBuilder_BindSetDetailFragment$write$read */
        public static abstract class read extends C1241xc75ead43<EtbSetDetailFragment> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Fragment> IconCompatParcelizer(write.read read);
}
