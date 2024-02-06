package com.scb.phone.p035di;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.sme.gifting.GiftRecipientFragment;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.FragmentBuilder_BindGiftRecipientBaseFragment */
public abstract class FragmentBuilder_BindGiftRecipientBaseFragment {

    /* renamed from: com.scb.phone.di.FragmentBuilder_BindGiftRecipientBaseFragment$read */
    public interface read extends MileageQuantitySelectionActivity_ViewBinding<GiftRecipientFragment> {

        /* renamed from: com.scb.phone.di.FragmentBuilder_BindGiftRecipientBaseFragment$read$IconCompatParcelizer */
        public static abstract class IconCompatParcelizer extends C1241xc75ead43<GiftRecipientFragment> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Fragment> MediaBrowserCompat$ItemReceiver(read.IconCompatParcelizer iconCompatParcelizer);
}
