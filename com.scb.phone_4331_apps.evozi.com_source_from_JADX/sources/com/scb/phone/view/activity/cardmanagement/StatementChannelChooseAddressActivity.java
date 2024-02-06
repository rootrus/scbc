package com.scb.phone.view.activity.cardmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.cardmanagement.C5871x29f73915;
import com.scb.phone.view.fragment.cardmanagement.StatementChannelChooseAddressFragment;
import java.util.ArrayList;
import p040o.chain;
import p040o.createId;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public final class StatementChannelChooseAddressActivity extends BaseActivity {
    public static final write MediaMetadataCompat = new write((byte) 0);
    private String MediaBrowserCompat$MediaItem;
    private chain MediaBrowserCompat$SearchResultReceiver;
    private ArrayList<chain> MediaDescriptionCompat;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        ArrayList<chain> arrayList;
        super.onCreate(bundle);
        setContentView(R.layout.f79992131493224);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            ArrayList<chain> arrayList2 = null;
            this.MediaBrowserCompat$MediaItem = extras != null ? extras.getString("EXTRA_CHANNEL_KEY") : null;
            Bundle extras2 = intent.getExtras();
            this.MediaBrowserCompat$SearchResultReceiver = extras2 != null ? (chain) extras2.getParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY") : null;
            Bundle extras3 = intent.getExtras();
            if (extras3 != null) {
                arrayList2 = extras3.getParcelableArrayList("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY");
            }
            this.MediaDescriptionCompat = arrayList2;
        }
        m2837x50fd9e4a();
        super.setStackedBackground();
        setTabContainer();
        setTitle(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) createId.EMAIL.name()) ? R.string.ccr_select_email_address : R.string.menu_statement_channel);
        chain chain = this.MediaBrowserCompat$SearchResultReceiver;
        if (chain != null && (arrayList = this.MediaDescriptionCompat) != null) {
            C5871x29f73915 statementChannelChooseAddressFragment$MediaBrowserCompat$ItemReceiver = StatementChannelChooseAddressFragment.IconCompatParcelizer;
            String str = this.MediaBrowserCompat$MediaItem;
            onGetStartedClick.write((Object) chain, "ccd");
            onGetStartedClick.write((Object) arrayList, "ccdList");
            StatementChannelChooseAddressFragment statementChannelChooseAddressFragment = new StatementChannelChooseAddressFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain);
            bundle2.putParcelableArrayList("EXTRA_CREDIT_CARD_DISPLAY_KEY_LIST", arrayList);
            bundle2.putString("EXTRA_CHANNEL_KEY", str);
            bundle2.putString("EXTRA_ADDRESS_KEY", "");
            statementChannelChooseAddressFragment.setArguments(bundle2);
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, statementChannelChooseAddressFragment).write();
        }
    }

    public final void setStackedBackground() {
        m2837x50fd9e4a();
        super.setStackedBackground();
        setTabContainer();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final void m2837x50fd9e4a() {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setBackgroundResource(R.color.f71012131100257);
        }
        TextView textView = this.mActionBarTitle;
        if (textView != null) {
            textView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f65622131099715));
        }
    }
}
