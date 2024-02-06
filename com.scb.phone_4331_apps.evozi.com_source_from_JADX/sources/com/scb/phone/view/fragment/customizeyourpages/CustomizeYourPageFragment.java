package com.scb.phone.view.fragment.customizeyourpages;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomCustomizePageItem;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.HmlPinActivity;
import p040o.IdParameters;
import p040o.access$2200;
import p040o.buildUnexpectedTypeError;
import p040o.documentUpload;
import p040o.getCommercialDetail;
import p040o.validateMCMCEligibility;

public class CustomizeYourPageFragment extends BaseFragment implements IdParameters.IdState {
    @BindView
    public CustomCustomizePageItem applyTheme;
    @HmlPinActivity
    public buildUnexpectedTypeError customizeYourPagePresenter;

    public static /* synthetic */ void IconCompatParcelizer() {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86412131493868, viewGroup, false);
        MediaBrowserCompat$CustomActionResultReceiver(this, inflate);
        this.customizeYourPagePresenter.MediaBrowserCompat$ItemReceiver(this);
        this.applyTheme.setTitle(getString(R.string.apply_theme_title));
        this.applyTheme.setDescription(getString(R.string.apply_theme_description));
        this.applyTheme.setDividerVisible(false);
        this.applyTheme.setToggleStatus(this.customizeYourPagePresenter.MediaBrowserCompat$CustomActionResultReceiver());
        this.applyTheme.setOnCustomCustomizePageItemClickListener(new documentUpload(this));
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) getActivity()).MediaBrowserCompat$ItemReceiver((int) R.string.dialog_apply_theme_title).IconCompatParcelizer(z ? R.string.dialog_apply_theme_message_toggle_on : R.string.dialog_apply_theme_message_toggle_off);
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.dialog_apply_theme_btn_confirm), new getCommercialDetail(this, z));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.dialog_apply_theme_btn_cancel), validateMCMCEligibility.read).show();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200) {
        write(access_2200);
    }

    public final void read(boolean z) {
        this.applyTheme.setToggleStatus(z);
    }

    public final void read() {
        if (getActivity() != null && (getActivity() instanceof BaseActivity)) {
            ((BaseActivity) getActivity()).setCustomView();
        }
    }
}
