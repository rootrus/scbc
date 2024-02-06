package com.scb.phone.view.activity;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.roughike.bottombar.BottomBar;
import com.scb.phone.R;
import com.scb.phone.view.custom.KnockKnockView;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class HomeActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private HomeActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public HomeActivity_ViewBinding(final HomeActivity homeActivity, View view) {
        super(homeActivity, view);
        this.MediaBrowserCompat$ItemReceiver = homeActivity;
        homeActivity.mBottomNavigationView = (BottomBar) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bottom_nav, "field 'mBottomNavigationView'", BottomBar.class);
        homeActivity.mRootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_root, "field 'mRootView'", RelativeLayout.class);
        homeActivity.mRemoveTileLayout = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remove_tile_relative_layout, "field 'mRemoveTileLayout'", RelativeLayout.class);
        homeActivity.mTrashImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.trash_image_view, "field 'mTrashImageView'", ImageView.class);
        homeActivity.mRemoveTileTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remove_tile_text_view, "field 'mRemoveTileTextView'", TextView.class);
        homeActivity.mFragmentContainer = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.fragment_container_home, "field 'mFragmentContainer'", FrameLayout.class);
        homeActivity.mLifestyleTutorialContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.lifestyle_tutorial_container, "field 'mLifestyleTutorialContainer'", LinearLayout.class);
        homeActivity.mLifestyleTutorialViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.lifestyle_tutorial_view_pager, "field 'mLifestyleTutorialViewPager'", ViewPager.class);
        homeActivity.mLifestyleTutorialIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.lifestyle_tutorial_indicator, "field 'mLifestyleTutorialIndicator'", CircleIndicator.class);
        homeActivity.mBlurBackgroundImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.blur_background_image_view, "field 'mBlurBackgroundImageView'", ImageView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.tutorial_view, "field 'moneyOutTutorial' and method 'closeMoneyOutTutorial'");
        homeActivity.moneyOutTutorial = (FrameLayout) onStart.write(IconCompatParcelizer2, R.id.tutorial_view, "field 'moneyOutTutorial'", FrameLayout.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HomeActivity.this.closeMoneyOutTutorial();
            }
        });
        homeActivity.knockView = (KnockKnockView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.knockKnock, "field 'knockView'", KnockKnockView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.fast_pay_setting_coachmark, "field 'fastPaySettingCoachmarkImage' and method 'onFastPaySettingCoachmarkClicked'");
        homeActivity.fastPaySettingCoachmarkImage = (ImageView) onStart.write(IconCompatParcelizer3, R.id.fast_pay_setting_coachmark, "field 'fastPaySettingCoachmarkImage'", ImageView.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HomeActivity.this.onFastPaySettingCoachmarkClicked();
            }
        });
        homeActivity.ivJuristicCoachMark = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_juristic_coach_mark, "field 'ivJuristicCoachMark'", ImageView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.skip_lifestyle_tutorial_image_view, "method 'closeTutorial'");
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HomeActivity.this.closeTutorial();
            }
        });
    }

    public final void read() {
        HomeActivity homeActivity = this.MediaBrowserCompat$ItemReceiver;
        if (homeActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            homeActivity.mBottomNavigationView = null;
            homeActivity.mRootView = null;
            homeActivity.mRemoveTileLayout = null;
            homeActivity.mTrashImageView = null;
            homeActivity.mRemoveTileTextView = null;
            homeActivity.mFragmentContainer = null;
            homeActivity.mLifestyleTutorialContainer = null;
            homeActivity.mLifestyleTutorialViewPager = null;
            homeActivity.mLifestyleTutorialIndicator = null;
            homeActivity.mBlurBackgroundImageView = null;
            homeActivity.moneyOutTutorial = null;
            homeActivity.knockView = null;
            homeActivity.fastPaySettingCoachmarkImage = null;
            homeActivity.ivJuristicCoachMark = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
