package com.scb.phone.p035di;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.ErrorFragment;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.FragmentBuilder_BindErrorFragment */
public abstract class FragmentBuilder_BindErrorFragment {

    /* renamed from: com.scb.phone.di.FragmentBuilder_BindErrorFragment$write */
    public interface write extends MileageQuantitySelectionActivity_ViewBinding<ErrorFragment> {

        /* renamed from: com.scb.phone.di.FragmentBuilder_BindErrorFragment$write$IconCompatParcelizer */
        public static abstract class IconCompatParcelizer extends C1241xc75ead43<ErrorFragment> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Fragment> MediaBrowserCompat$ItemReceiver(write.IconCompatParcelizer iconCompatParcelizer);
}
