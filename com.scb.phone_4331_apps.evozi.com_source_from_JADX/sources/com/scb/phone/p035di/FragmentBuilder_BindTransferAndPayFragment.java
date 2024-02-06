package com.scb.phone.p035di;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.transferandpay.TransferAndPayFragment;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.FragmentBuilder_BindTransferAndPayFragment */
public abstract class FragmentBuilder_BindTransferAndPayFragment {

    /* renamed from: com.scb.phone.di.FragmentBuilder_BindTransferAndPayFragment$write */
    public interface write extends MileageQuantitySelectionActivity_ViewBinding<TransferAndPayFragment> {

        /* renamed from: com.scb.phone.di.FragmentBuilder_BindTransferAndPayFragment$write$IconCompatParcelizer */
        public static abstract class IconCompatParcelizer extends C1241xc75ead43<TransferAndPayFragment> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Fragment> read(write.IconCompatParcelizer iconCompatParcelizer);
}
