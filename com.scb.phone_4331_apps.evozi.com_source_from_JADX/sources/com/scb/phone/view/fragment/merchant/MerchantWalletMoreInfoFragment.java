package com.scb.phone.view.fragment.merchant;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.FragmentBuilder_BindDeejungPlansFragment;
import p040o.doWriteToLog;

public class MerchantWalletMoreInfoFragment extends BaseFragment {
    private boolean IconCompatParcelizer;
    @BindView
    protected ImageView mImageIconExpandMore;
    @BindView
    protected ViewGroup mLayoutCollapsed;
    @BindView
    protected ViewGroup mLayoutExpanded;
    @BindView
    protected TextView mTextLinkedAccountValue;
    @BindView
    protected TextView mTextOwnerNameValue;
    @BindView
    protected TextView mTextProductTypeValue;
    @BindView
    protected TextView mTextShopNameValue;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88372131494064, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.mLayoutExpanded.setVisibility(8);
        return inflate;
    }

    @OnClick
    public void onLayoutCollapsedClick() {
        this.IconCompatParcelizer = !this.IconCompatParcelizer;
        FragmentBuilder_BindDeejungPlansFragment.read(this.mImageIconExpandMore);
        if (this.mLayoutExpanded.getVisibility() == 8) {
            FragmentBuilder_BindDeejungPlansFragment.write(this.mLayoutExpanded);
        } else {
            FragmentBuilder_BindDeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(this.mLayoutExpanded);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(doWriteToLog dowritetolog) {
        if (dowritetolog == null) {
            this.mTextProductTypeValue.setText((CharSequence) null);
            this.mTextShopNameValue.setText((CharSequence) null);
            this.mTextOwnerNameValue.setText((CharSequence) null);
            this.mTextLinkedAccountValue.setText((CharSequence) null);
            return;
        }
        this.mTextProductTypeValue.setText(dowritetolog.MediaBrowserCompat$CustomActionResultReceiver);
        this.mTextShopNameValue.setText(dowritetolog.RatingCompat);
        this.mTextOwnerNameValue.setText(dowritetolog.MediaBrowserCompat$ItemReceiver);
        this.mTextLinkedAccountValue.setText(dowritetolog.read);
    }
}
