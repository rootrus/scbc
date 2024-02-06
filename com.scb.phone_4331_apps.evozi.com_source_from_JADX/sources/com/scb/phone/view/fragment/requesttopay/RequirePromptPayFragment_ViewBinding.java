package com.scb.phone.view.fragment.requesttopay;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class RequirePromptPayFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RequirePromptPayFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public RequirePromptPayFragment_ViewBinding(final RequirePromptPayFragment requirePromptPayFragment, View view) {
        super(requirePromptPayFragment, view);
        this.IconCompatParcelizer = requirePromptPayFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.request_money_tutorial_relative_layout, "field 'mRequestMoneyTutotrialContainer' and method 'onTutorialClicked'");
        requirePromptPayFragment.mRequestMoneyTutotrialContainer = (RelativeLayout) onStart.write(IconCompatParcelizer2, R.id.request_money_tutorial_relative_layout, "field 'mRequestMoneyTutotrialContainer'", RelativeLayout.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RequirePromptPayFragment.this.onTutorialClicked();
            }
        });
        requirePromptPayFragment.mOverlayRequestMoneyTutorialImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.overlay_request_money_tutorial_image_view, "field 'mOverlayRequestMoneyTutorialImageView'", ImageView.class);
        requirePromptPayFragment.mRootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_root_request_money, "field 'mRootView'", RelativeLayout.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_prompt_pay_settings, "field 'buttonPromptPaySettings' and method 'onPromptPaySettingsClick'");
        requirePromptPayFragment.buttonPromptPaySettings = (DefaultButton) onStart.write(IconCompatParcelizer3, R.id.button_prompt_pay_settings, "field 'buttonPromptPaySettings'", DefaultButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RequirePromptPayFragment.this.onPromptPaySettingsClick();
            }
        });
        requirePromptPayFragment.descriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description_text_view, "field 'descriptionTextView'", TextView.class);
    }

    public final void read() {
        RequirePromptPayFragment requirePromptPayFragment = this.IconCompatParcelizer;
        if (requirePromptPayFragment != null) {
            this.IconCompatParcelizer = null;
            requirePromptPayFragment.mRequestMoneyTutotrialContainer = null;
            requirePromptPayFragment.mOverlayRequestMoneyTutorialImageView = null;
            requirePromptPayFragment.mRootView = null;
            requirePromptPayFragment.buttonPromptPaySettings = null;
            requirePromptPayFragment.descriptionTextView = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
