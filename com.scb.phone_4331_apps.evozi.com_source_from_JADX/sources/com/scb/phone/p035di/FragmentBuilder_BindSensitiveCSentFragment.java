package com.scb.phone.p035di;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.csent.SensitiveCSentFragment;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.FragmentBuilder_BindSensitiveCSentFragment */
public abstract class FragmentBuilder_BindSensitiveCSentFragment {

    /* renamed from: com.scb.phone.di.FragmentBuilder_BindSensitiveCSentFragment$IconCompatParcelizer */
    public interface IconCompatParcelizer extends MileageQuantitySelectionActivity_ViewBinding<SensitiveCSentFragment> {

        /* renamed from: com.scb.phone.di.FragmentBuilder_BindSensitiveCSentFragment$IconCompatParcelizer$write */
        public static abstract class write extends C1241xc75ead43<SensitiveCSentFragment> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Fragment> MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.write write);
}
