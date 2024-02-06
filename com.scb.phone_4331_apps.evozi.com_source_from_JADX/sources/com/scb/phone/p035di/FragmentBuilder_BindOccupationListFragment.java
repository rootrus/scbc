package com.scb.phone.p035di;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.ntb.fillinformation.OccupationSearchFragment;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.FragmentBuilder_BindOccupationListFragment */
public abstract class FragmentBuilder_BindOccupationListFragment {

    /* renamed from: com.scb.phone.di.FragmentBuilder_BindOccupationListFragment$IconCompatParcelizer */
    public interface IconCompatParcelizer extends MileageQuantitySelectionActivity_ViewBinding<OccupationSearchFragment> {

        /* renamed from: com.scb.phone.di.FragmentBuilder_BindOccupationListFragment$IconCompatParcelizer$write */
        public static abstract class write extends C1241xc75ead43<OccupationSearchFragment> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Fragment> MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer.write write);
}
