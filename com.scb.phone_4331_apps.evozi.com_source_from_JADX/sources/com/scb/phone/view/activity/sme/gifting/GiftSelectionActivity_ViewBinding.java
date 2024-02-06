package com.scb.phone.view.activity.sme.gifting;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import com.scb.phone.view.custom.common.CustomTabLayout;
import p040o.onCreateDialog;
import p040o.onStart;
import p059me.relex.circleindicator.CircleIndicator;

public class GiftSelectionActivity_ViewBinding extends BaseActivity_ViewBinding {
    private GiftSelectionActivity MediaBrowserCompat$ItemReceiver;
    private View write;

    public GiftSelectionActivity_ViewBinding(final GiftSelectionActivity giftSelectionActivity, View view) {
        super(giftSelectionActivity, view);
        this.MediaBrowserCompat$ItemReceiver = giftSelectionActivity;
        giftSelectionActivity.tabLayout = (CustomTabLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gifts_selection_tabs, "field 'tabLayout'", CustomTabLayout.class);
        giftSelectionActivity.viewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gifts_selection_viewpager, "field 'viewPager'", ViewPager.class);
        giftSelectionActivity.rootView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_root, "field 'rootView'", RelativeLayout.class);
        giftSelectionActivity.giftTutorialContainer = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_tutorial_container, "field 'giftTutorialContainer'", LinearLayout.class);
        giftSelectionActivity.giftTutorialViewPager = (ViewPager) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_tutorial_view_pager, "field 'giftTutorialViewPager'", ViewPager.class);
        giftSelectionActivity.giftTutorialIndicator = (CircleIndicator) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_tutorial_indicator, "field 'giftTutorialIndicator'", CircleIndicator.class);
        giftSelectionActivity.blurBackgroundImageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.blur_background_image_view, "field 'blurBackgroundImageView'", ImageView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.skip_gift_tutorial_image_view, "method 'onCloseTutorial'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                GiftSelectionActivity.this.onCloseTutorial();
            }
        });
    }

    public final void read() {
        GiftSelectionActivity giftSelectionActivity = this.MediaBrowserCompat$ItemReceiver;
        if (giftSelectionActivity != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            giftSelectionActivity.tabLayout = null;
            giftSelectionActivity.viewPager = null;
            giftSelectionActivity.rootView = null;
            giftSelectionActivity.giftTutorialContainer = null;
            giftSelectionActivity.giftTutorialViewPager = null;
            giftSelectionActivity.giftTutorialIndicator = null;
            giftSelectionActivity.blurBackgroundImageView = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
