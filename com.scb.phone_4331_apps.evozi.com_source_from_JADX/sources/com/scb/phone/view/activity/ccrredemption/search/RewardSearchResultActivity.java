package com.scb.phone.view.activity.ccrredemption.search;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import p040o.C4054b;
import p040o.intoSetBuilder;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public final class RewardSearchResultActivity extends BaseActivity implements C4054b.C40583.C13021 {
    public static final IconCompatParcelizer MediaMetadataCompat = new IconCompatParcelizer((byte) 0);
    @BindView
    public LinearLayout llSearchContainer;
    @BindView
    public LinearLayout llSearchItems;
    @BindView
    public TextView tvCardPoints;
    @BindView
    public TextView tvSearchBy;
    @BindView
    public TextView tvSearchItemsFound;
    @BindView
    public TextView tvTitle;

    public final void onCreate(Bundle bundle) {
        String str;
        String str2;
        String str3;
        super.onCreate(bundle);
        setContentView(R.layout.f79722131493197);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        Intent intent = getIntent();
        String str4 = null;
        intoSetBuilder intosetbuilder = intent != null ? (intoSetBuilder) intent.getParcelableExtra("com.scb.phone.presentation.view.activity.ccr_redemption.product.ProductListActivity.CATEGORY_DTO_EXTRA") : null;
        if (intosetbuilder != null) {
            str4 = intosetbuilder.MediaSessionCompat$Token;
        }
        TextView textView = this.tvCardPoints;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCardPoints");
        }
        boolean z = true;
        Object[] objArr = new Object[1];
        if (str4 == null) {
            str4 = "0";
        }
        objArr[0] = str4;
        textView.setText(getString(R.string.you_have_points, objArr));
        if (intosetbuilder != null) {
            if (intosetbuilder.MediaBrowserCompat$CustomActionResultReceiver == null || onGetStartedClick.IconCompatParcelizer(intosetbuilder.MediaBrowserCompat$CustomActionResultReceiver.intValue(), 0) < 0) {
                str2 = getString(R.string.ccr_search_all_category);
                str = "getString(R.string.ccr_search_all_category)";
            } else {
                str2 = intosetbuilder.MediaBrowserCompat$SearchResultReceiver;
                str = "dto.categoryName";
            }
            onGetStartedClick.IconCompatParcelizer((Object) str2, str);
            String str5 = intosetbuilder.ParcelableVolumeInfo;
            onGetStartedClick.IconCompatParcelizer((Object) str5, "it.searchKeyword");
            if (str5.length() != 0) {
                z = false;
            }
            if (z) {
                str3 = "";
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("> '");
                sb.append(intosetbuilder.ParcelableVolumeInfo);
                sb.append('\'');
                str3 = sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(' ');
            sb2.append(str3);
            String obj = sb2.toString();
            TextView textView2 = this.tvSearchBy;
            if (textView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSearchBy");
            }
            textView2.setText(obj);
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.ccr_search_result_title);
        TextView textView = this.tvCardPoints;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvCardPoints");
        }
        textView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f66092131099764));
        setTabContainer();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        LinearLayout linearLayout = this.llSearchItems;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llSearchItems");
        }
        linearLayout.setVisibility(0);
        TextView textView = this.tvSearchBy;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSearchBy");
        }
        textView.setVisibility(0);
        LinearLayout linearLayout2 = this.llSearchItems;
        if (linearLayout2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llSearchItems");
        }
        linearLayout2.setVisibility(0);
        TextView textView2 = this.tvSearchItemsFound;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSearchItemsFound");
        }
        textView2.setText(getString(R.string.ccr_search_item_found, new Object[]{String.valueOf(i)}));
    }

    public final void MediaSessionCompat$Token() {
        LinearLayout linearLayout = this.llSearchContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llSearchContainer");
        }
        linearLayout.setVisibility(8);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }
}
