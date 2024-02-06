package com.scb.phone.view.adapter.prelogin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.login.CustomPreLoginMenuItem;
import p040o.FragmentBuilder_BindCreateGroupFragment;
import p040o.getSecuritiesList;
import p040o.onActivityCreated;
import p040o.onStart;

public final class PreLoginTutorialViewPagerAdapter extends onActivityCreated {
    /* access modifiers changed from: private */
    public FragmentBuilder_BindCreateGroupFragment MediaBrowserCompat$CustomActionResultReceiver;
    private LayoutInflater MediaBrowserCompat$ItemReceiver;

    public final int getCount() {
        return 4;
    }

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class TutorialItemHolder_ViewBinding implements Unbinder {
        private TutorialItemHolder MediaBrowserCompat$ItemReceiver;

        public TutorialItemHolder_ViewBinding(TutorialItemHolder tutorialItemHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = tutorialItemHolder;
            tutorialItemHolder.mBalanceButton = (CustomPreLoginMenuItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.menu_balance, "field 'mBalanceButton'", CustomPreLoginMenuItem.class);
            tutorialItemHolder.mPromptPayButton = (CustomPreLoginMenuItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.menu_prompt_pay, "field 'mPromptPayButton'", CustomPreLoginMenuItem.class);
            tutorialItemHolder.mTopUpButton = (CustomPreLoginMenuItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.menu_top_up, "field 'mTopUpButton'", CustomPreLoginMenuItem.class);
            tutorialItemHolder.mLoginButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_login, "field 'mLoginButton'", DefaultButton.class);
            tutorialItemHolder.mLoginButtonTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_login_text_view, "field 'mLoginButtonTextView'", TextView.class);
            tutorialItemHolder.mLoginButtonArrowImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_login_arrow_image_view, "field 'mLoginButtonArrowImageView'", ImageView.class);
            tutorialItemHolder.mBalanceArrowImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.menu_balance_arrow_image_view, "field 'mBalanceArrowImageView'", ImageView.class);
            tutorialItemHolder.mPromptPayArrowImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.menu_prompt_pay_arrow_image_view, "field 'mPromptPayArrowImageView'", ImageView.class);
            tutorialItemHolder.mTopUpArrowImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.menu_top_up_arrow_image_view, "field 'mTopUpArrowImageView'", ImageView.class);
            tutorialItemHolder.mBalanceDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.balance_description, "field 'mBalanceDescription'", TextView.class);
            tutorialItemHolder.mPromptPayDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.prompt_pay_description, "field 'mPromptPayDescription'", TextView.class);
            tutorialItemHolder.mTopUpDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.top_up_description, "field 'mTopUpDescription'", TextView.class);
            tutorialItemHolder.viewClickable = onStart.IconCompatParcelizer(view, R.id.view_clickable, "field 'viewClickable'");
        }

        public final void read() {
            TutorialItemHolder tutorialItemHolder = this.MediaBrowserCompat$ItemReceiver;
            if (tutorialItemHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                tutorialItemHolder.mBalanceButton = null;
                tutorialItemHolder.mPromptPayButton = null;
                tutorialItemHolder.mTopUpButton = null;
                tutorialItemHolder.mLoginButton = null;
                tutorialItemHolder.mLoginButtonTextView = null;
                tutorialItemHolder.mLoginButtonArrowImageView = null;
                tutorialItemHolder.mBalanceArrowImageView = null;
                tutorialItemHolder.mPromptPayArrowImageView = null;
                tutorialItemHolder.mTopUpArrowImageView = null;
                tutorialItemHolder.mBalanceDescription = null;
                tutorialItemHolder.mPromptPayDescription = null;
                tutorialItemHolder.mTopUpDescription = null;
                tutorialItemHolder.viewClickable = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public PreLoginTutorialViewPagerAdapter(Context context, FragmentBuilder_BindCreateGroupFragment fragmentBuilder_BindCreateGroupFragment) {
        this.MediaBrowserCompat$ItemReceiver = (LayoutInflater) context.getSystemService("layout_inflater");
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindCreateGroupFragment;
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        View inflate = this.MediaBrowserCompat$ItemReceiver.inflate(R.layout.f83982131493624, viewGroup, false);
        viewGroup.addView(new TutorialItemHolder(inflate, i).setHasDecor);
        return inflate;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((RelativeLayout) obj);
    }

    public class TutorialItemHolder extends RecyclerView.setContentView {
        @BindView
        ImageView mBalanceArrowImageView;
        @BindView
        CustomPreLoginMenuItem mBalanceButton;
        @BindView
        TextView mBalanceDescription;
        @BindView
        DefaultButton mLoginButton;
        @BindView
        ImageView mLoginButtonArrowImageView;
        @BindView
        TextView mLoginButtonTextView;
        @BindView
        ImageView mPromptPayArrowImageView;
        @BindView
        CustomPreLoginMenuItem mPromptPayButton;
        @BindView
        TextView mPromptPayDescription;
        @BindView
        ImageView mTopUpArrowImageView;
        @BindView
        CustomPreLoginMenuItem mTopUpButton;
        @BindView
        TextView mTopUpDescription;
        View setHasDecor;
        @BindView
        View viewClickable;

        TutorialItemHolder(View view, int i) {
            super(view);
            this.setHasDecor = view;
            ButterKnife.IconCompatParcelizer(this, view);
            if (i == 0) {
                this.mBalanceArrowImageView.setVisibility(0);
                this.mBalanceDescription.setVisibility(0);
                this.mBalanceButton.setVisibility(0);
            } else if (i == 1) {
                this.mPromptPayArrowImageView.setVisibility(0);
                this.mPromptPayDescription.setVisibility(0);
                this.mPromptPayButton.setVisibility(0);
            } else if (i == 2) {
                this.mTopUpArrowImageView.setVisibility(0);
                this.mTopUpDescription.setVisibility(0);
                this.mTopUpButton.setVisibility(0);
            } else if (i == 3) {
                this.mLoginButtonArrowImageView.setVisibility(0);
                this.mLoginButtonTextView.setVisibility(0);
                this.mLoginButton.setVisibility(0);
            }
            this.viewClickable.setOnClickListener(new getSecuritiesList(this));
        }
    }
}
