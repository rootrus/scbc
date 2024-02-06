package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.mailingaddress.GoodToKnowActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.cardmanagement.StatementChannelLandingFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.chain;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public final class StatementChannelLandingActivity extends BaseActivity {
    private chain MediaBrowserCompat$SearchResultReceiver;
    private ArrayList<chain> MediaDescriptionCompat;

    public static final class IconCompatParcelizer {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final List<GoodToKnowActivity$MediaBrowserCompat$ItemReceiver> RatingCompat;
        public final String read;
        public final int write;

        private IconCompatParcelizer() {
        }

        public IconCompatParcelizer(String str, int i, String str2, String str3, String str4, List<GoodToKnowActivity$MediaBrowserCompat$ItemReceiver> list) {
            onGetStartedClick.write((Object) str, Name.MARK);
            onGetStartedClick.write((Object) str2, "code");
            onGetStartedClick.write((Object) str3, "descriptionTH");
            onGetStartedClick.write((Object) str4, "descriptionEN");
            onGetStartedClick.write((Object) list, "subCategory");
            this.IconCompatParcelizer = str;
            this.write = i;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.read = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = str4;
            this.RatingCompat = list;
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
            this.MediaBrowserCompat$SearchResultReceiver = extras != null ? (chain) extras.getParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY") : null;
            Bundle extras2 = intent.getExtras();
            if (extras2 != null) {
                arrayList2 = extras2.getParcelableArrayList("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY");
            }
            this.MediaDescriptionCompat = arrayList2;
        }
        m2838x50fd9e4a();
        super.setStackedBackground();
        setTabContainer();
        setTitle(R.string.menu_statement_channel);
        chain chain = this.MediaBrowserCompat$SearchResultReceiver;
        if (chain != null && (arrayList = this.MediaDescriptionCompat) != null) {
            StatementChannelLandingFragment.read read = StatementChannelLandingFragment.IconCompatParcelizer;
            onGetStartedClick.write((Object) chain, "ccd");
            onGetStartedClick.write((Object) arrayList, "ccdList");
            StatementChannelLandingFragment statementChannelLandingFragment = new StatementChannelLandingFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain);
            bundle2.putParcelableArrayList("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY", arrayList);
            statementChannelLandingFragment.setArguments(bundle2);
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, statementChannelLandingFragment).write();
        }
    }

    public final void setStackedBackground() {
        m2838x50fd9e4a();
        super.setStackedBackground();
        setTabContainer();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private final void m2838x50fd9e4a() {
        Toolbar toolbar = this.mToolbar;
        if (toolbar != null) {
            toolbar.setBackgroundResource(R.color.f71012131100257);
        }
        TextView textView = this.mActionBarTitle;
        if (textView != null) {
            textView.setTextColor(setLastBaselineToBottomHeight.read(this, R.color.f65622131099715));
        }
    }

    public static final Intent MediaBrowserCompat$CustomActionResultReceiver(Context context, chain chain, ArrayList<chain> arrayList) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) chain, "ccd");
        onGetStartedClick.write((Object) arrayList, "ccdList");
        Intent intent = new Intent(context, StatementChannelLandingActivity.class);
        intent.putExtra("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain);
        intent.putExtra("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY", arrayList);
        return intent;
    }
}
