package com.scb.phone.p035di;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.cardmanagement.CardActivationFragment;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.FragmentBuilder_BindCardActivationFragment */
public abstract class FragmentBuilder_BindCardActivationFragment {

    /* renamed from: com.scb.phone.di.FragmentBuilder_BindCardActivationFragment$write */
    public interface write extends MileageQuantitySelectionActivity_ViewBinding<CardActivationFragment> {

        /* renamed from: com.scb.phone.di.FragmentBuilder_BindCardActivationFragment$write$IconCompatParcelizer */
        public static abstract class IconCompatParcelizer extends C1241xc75ead43<CardActivationFragment> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Fragment> MediaBrowserCompat$ItemReceiver(write.IconCompatParcelizer iconCompatParcelizer);
}
