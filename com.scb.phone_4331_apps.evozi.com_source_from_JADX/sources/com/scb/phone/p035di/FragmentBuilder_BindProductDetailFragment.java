package com.scb.phone.p035di;

import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.ccrredemption.product.ProductDetailFragment;
import p040o.C1241xc75ead43;
import p040o.MileageQuantitySelectionActivity_ViewBinding;

/* renamed from: com.scb.phone.di.FragmentBuilder_BindProductDetailFragment */
public abstract class FragmentBuilder_BindProductDetailFragment {

    /* renamed from: com.scb.phone.di.FragmentBuilder_BindProductDetailFragment$read */
    public interface read extends MileageQuantitySelectionActivity_ViewBinding<ProductDetailFragment> {

        /* renamed from: com.scb.phone.di.FragmentBuilder_BindProductDetailFragment$read$IconCompatParcelizer */
        public static abstract class IconCompatParcelizer extends C1241xc75ead43<ProductDetailFragment> {
        }
    }

    /* access modifiers changed from: package-private */
    public abstract MileageQuantitySelectionActivity_ViewBinding.read<? extends Fragment> MediaBrowserCompat$CustomActionResultReceiver(read.IconCompatParcelizer iconCompatParcelizer);
}
