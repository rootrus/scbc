package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.cardmanagement.ChangeChannelStatementApplyAllFragment;
import com.scb.phone.view.fragment.cardmanagement.ChangeChannelStatementReviewFragment;
import com.scb.phone.view.fragment.cardmanagement.EditAddressStatementChannelFragment;
import java.util.ArrayList;
import kotlin.TypeCastException;
import p040o.C7186kH;
import p040o.chain;
import p040o.createId;
import p040o.onGetStartedClick;
import p040o.setLastBaselineToBottomHeight;

public final class StatementChannelCommonActivity extends BaseActivity {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);
    private String MediaBrowserCompat$MediaItem;
    private String MediaDescriptionCompat;
    private chain MediaMetadataCompat;
    private ArrayList<chain> MediaSessionCompat$ResultReceiverWrapper;
    private String MediaSessionCompat$Token;
    private C5567x38c86bfb PlaybackStateCompat$CustomAction;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static Intent IconCompatParcelizer(Context context, chain chain, ArrayList<chain> arrayList, String str, String str2) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) chain, "ccd");
            onGetStartedClick.write((Object) arrayList, "ccdList");
            onGetStartedClick.write((Object) str, "channel");
            onGetStartedClick.write((Object) str2, "address");
            Intent intent = new Intent(context, StatementChannelCommonActivity.class);
            intent.putExtra("EXTRA_CHANNEL_KEY", str);
            intent.putExtra("EXTRA_ADDRESS_KEY", str2);
            intent.putExtra("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain);
            intent.putExtra("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY", arrayList);
            intent.putExtra("EXTRA_PAGE_TYPE_KEY", C5567x38c86bfb.REVIEW_PAGE);
            return intent;
        }
    }

    public final void onCreate(Bundle bundle) {
        Integer num;
        ArrayList<chain> arrayList;
        ArrayList<chain> arrayList2;
        super.onCreate(bundle);
        setContentView(R.layout.f79992131493224);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (intent != null) {
            Bundle extras = intent.getExtras();
            ArrayList<chain> arrayList3 = null;
            Object obj = extras != null ? extras.get("EXTRA_PAGE_TYPE_KEY") : null;
            if (obj != null) {
                this.PlaybackStateCompat$CustomAction = (C5567x38c86bfb) obj;
                Bundle extras2 = intent.getExtras();
                this.MediaBrowserCompat$MediaItem = extras2 != null ? extras2.getString("EXTRA_CHANNEL_KEY") : null;
                Bundle extras3 = intent.getExtras();
                this.MediaDescriptionCompat = extras3 != null ? extras3.getString("EXTRA_ADDRESS_KEY") : null;
                Bundle extras4 = intent.getExtras();
                this.MediaSessionCompat$Token = extras4 != null ? extras4.getString("EXTRA_MASK_CARD_KEY") : null;
                Bundle extras5 = intent.getExtras();
                this.MediaMetadataCompat = extras5 != null ? (chain) extras5.getParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY") : null;
                Bundle extras6 = intent.getExtras();
                if (extras6 != null) {
                    arrayList3 = extras6.getParcelableArrayList("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY");
                }
                this.MediaSessionCompat$ResultReceiverWrapper = arrayList3;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.view.activity.cardmanagement.StatementChannelCommonActivity.PageType");
            }
        }
        MediaSessionCompat$Token();
        super.setStackedBackground();
        setTabContainer();
        C5567x38c86bfb statementChannelCommonActivity$MediaBrowserCompat$CustomActionResultReceiver = this.PlaybackStateCompat$CustomAction;
        if (statementChannelCommonActivity$MediaBrowserCompat$CustomActionResultReceiver != null) {
            int i = C7186kH.MediaBrowserCompat$CustomActionResultReceiver[statementChannelCommonActivity$MediaBrowserCompat$CustomActionResultReceiver.ordinal()];
            if (i == 1) {
                String str = this.MediaBrowserCompat$MediaItem;
                if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) createId.EMAIL.name())) {
                    num = Integer.valueOf(R.string.menu_receive_paper_email);
                } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) createId.PAPER.name())) {
                    num = Integer.valueOf(R.string.menu_receive_paper_statement);
                } else {
                    num = Integer.valueOf(R.string.menu_statement_channel);
                }
                if (num != null) {
                    setTitle(num.intValue());
                }
                chain chain = this.MediaMetadataCompat;
                if (chain != null && (arrayList = this.MediaSessionCompat$ResultReceiverWrapper) != null) {
                    String str2 = this.MediaBrowserCompat$MediaItem;
                    String str3 = this.MediaDescriptionCompat;
                    ChangeChannelStatementReviewFragment.write write2 = ChangeChannelStatementReviewFragment.MediaBrowserCompat$CustomActionResultReceiver;
                    onGetStartedClick.write((Object) chain, "ccd");
                    onGetStartedClick.write((Object) arrayList, "ccdList");
                    ChangeChannelStatementReviewFragment changeChannelStatementReviewFragment = new ChangeChannelStatementReviewFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("EXTRA_CHANNEL_KEY", str2);
                    bundle2.putString("EXTRA_ADDRESS_KEY", str3);
                    bundle2.putParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain);
                    bundle2.putParcelableArrayList("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY", arrayList);
                    changeChannelStatementReviewFragment.setArguments(bundle2);
                    getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, changeChannelStatementReviewFragment).write();
                }
            } else if (i == 2) {
                setTitle(R.string.menu_change_address);
                EditAddressStatementChannelFragment.write write3 = EditAddressStatementChannelFragment.IconCompatParcelizer;
                getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, new EditAddressStatementChannelFragment()).write();
            } else if (i == 3) {
                setTitle(R.string.menu_receive_paper_email);
                chain chain2 = this.MediaMetadataCompat;
                if (chain2 != null && (arrayList2 = this.MediaSessionCompat$ResultReceiverWrapper) != null) {
                    String str4 = this.MediaBrowserCompat$MediaItem;
                    String str5 = this.MediaDescriptionCompat;
                    String str6 = this.MediaSessionCompat$Token;
                    ChangeChannelStatementApplyAllFragment.write write4 = ChangeChannelStatementApplyAllFragment.MediaBrowserCompat$CustomActionResultReceiver;
                    onGetStartedClick.write((Object) chain2, "ccd");
                    onGetStartedClick.write((Object) arrayList2, "ccdList");
                    ChangeChannelStatementApplyAllFragment changeChannelStatementApplyAllFragment = new ChangeChannelStatementApplyAllFragment();
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("EXTRA_CHANNEL_KEY", str4);
                    bundle3.putString("EXTRA_ADDRESS_KEY", str5);
                    bundle3.putString("EXTRA_MASK_CARD_KEY", str6);
                    bundle3.putParcelable("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain2);
                    bundle3.putParcelableArrayList("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY", arrayList2);
                    changeChannelStatementApplyAllFragment.setArguments(bundle3);
                    getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.frame_container, changeChannelStatementApplyAllFragment).write();
                }
            }
        }
    }

    public final void setStackedBackground() {
        MediaSessionCompat$Token();
        super.setStackedBackground();
        setTabContainer();
    }

    private final void MediaSessionCompat$Token() {
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
