package com.scb.phone.view.activity.ntb.touchpoint;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ntb.selectaccount.SelectAccountFragment;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.onGetStartedClick;

public final class TouchPointSelectAccountActivity extends BaseTouchPointBreadcrumbActivity implements FragmentBuilder_BindChangeChannelStatementReviewFragment.read {
    public static final write MediaMetadataCompat = new write((byte) 0);
    private SelectAccountFragment MediaBrowserCompat$MediaItem;

    public final /* synthetic */ void IconCompatParcelizer(String str) {
    }

    public final /* synthetic */ void an_() {
    }

    public final /* synthetic */ void ao_() {
    }

    public final /* synthetic */ void ap_() {
    }

    /* renamed from: m_ */
    public final /* synthetic */ void mo34015m_(String str) {
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f80142131493239);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.auto_touchpoints_select_account);
        setTabContainer();
        SelectAccountFragment IconCompatParcelizer = SelectAccountFragment.IconCompatParcelizer();
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "SelectAccountFragment.newInstance(true)");
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((AppCompatActivity) this, (Fragment) IconCompatParcelizer, (int) R.id.fm_layout_container);
    }

    public final void onBackPressed() {
        SelectAccountFragment selectAccountFragment = this.MediaBrowserCompat$MediaItem;
        if (selectAccountFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSelectAccountFragment");
        }
        if (selectAccountFragment.getChildFragmentManager().write() == 0) {
            selectAccountFragment.MediaBrowserCompat$ItemReceiver();
            return;
        }
        selectAccountFragment.getChildFragmentManager().RatingCompat();
        selectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver.ao_();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || 16908332 != menuItem.getItemId()) {
            return super.onOptionsItemSelected(menuItem);
        }
        SelectAccountFragment selectAccountFragment = this.MediaBrowserCompat$MediaItem;
        if (selectAccountFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mSelectAccountFragment");
        }
        if (selectAccountFragment.getChildFragmentManager().write() == 0) {
            selectAccountFragment.MediaBrowserCompat$ItemReceiver();
            return true;
        }
        selectAccountFragment.getChildFragmentManager().RatingCompat();
        selectAccountFragment.MediaBrowserCompat$CustomActionResultReceiver.ao_();
        return true;
    }

    /* access modifiers changed from: protected */
    public final C5677x8060c4c1 MediaSessionCompat$ResultReceiverWrapper() {
        return C5677x8060c4c1.SELECT_ACCOUNT;
    }
}
