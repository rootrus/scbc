package com.scb.phone.view.activity.p038tc;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.investment.InvestmentDetailsActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C1290xf5767c6e;
import p040o.C5413sm;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getOversizeImage;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.sm$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.toLongArray;
import p040o.writeUInt64NoTag;

/* renamed from: com.scb.phone.view.activity.tc.MutualFundTermsAndConditionsActivity */
public final class MutualFundTermsAndConditionsActivity extends BaseActivityWithFragment implements C1290xf5767c6e, FragmentBuilder_BindCustomizeYourPageFragment {
    public static final IconCompatParcelizer MediaBrowserCompat$SearchResultReceiver = new IconCompatParcelizer((byte) 0);
    @HmlPinActivity
    public C5413sm mPresenter;

    public static final void MediaBrowserCompat$CustomActionResultReceiver(Context context, boolean z) {
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, MutualFundTermsAndConditionsActivity.class);
        intent.putExtra("EXTRA_SHOW_DISCOVER", z);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            context.startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final void MediaBrowserCompat$ItemReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, MutualFundTermsAndConditionsActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(context, intent);
    }

    /* renamed from: com.scb.phone.view.activity.tc.MutualFundTermsAndConditionsActivity$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Context context, Intent intent) {
            try {
                Intent read = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                context.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C5413sm smVar = this.mPresenter;
        if (smVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        smVar.MediaBrowserCompat$ItemReceiver(this);
        C5413sm smVar2 = this.mPresenter;
        if (smVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new C5413sm.IconCompatParcelizer(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(smVar2.IconCompatParcelizer, (String) null, "MUTUALFUND", (String) null, (String) null, true, false, (String) null, 72));
        if (smVar2.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(smVar2.RatingCompat);
        }
    }

    public final String au_() {
        String string = getString(R.string.tc_action_bar_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.tc_action_bar_title)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Intent intent = new Intent(this, InvestmentDetailsActivity.class);
        intent.putExtra("EXTRA_BYPASS_TERM_AND_CON", true);
        intent.putExtra("EXTRA_GO_TO_DISCOVER_TAB", intent.getBooleanExtra("EXTRA_SHOW_DISCOVER", false));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        TermsAndConditionsFragment.write write2 = TermsAndConditionsFragment.IconCompatParcelizer;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }

    /* renamed from: com.scb.phone.view.activity.tc.MutualFundTermsAndConditionsActivity$read */
    static final class read implements DialogInterface.OnClickListener {
        private /* synthetic */ MutualFundTermsAndConditionsActivity read;

        read(MutualFundTermsAndConditionsActivity mutualFundTermsAndConditionsActivity) {
            this.read = mutualFundTermsAndConditionsActivity;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C5413sm smVar = this.read.mPresenter;
            if (smVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
            }
            if (smVar.RatingCompat != null) {
                smVar.RatingCompat.AlertController$RecycleListView();
            }
            smVar.read.read("MUTUALFUND");
            smVar.read.IconCompatParcelizer(new sm$MediaBrowserCompat$CustomActionResultReceiver(smVar));
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "tag");
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.tc_agree_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.tc_agree_dialog_message);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.tc_agree_dialog_negative_button), C5715x13e4aeec.IconCompatParcelizer);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.tc_agree_dialog_positive_button), new read(this)).show();
    }

    /* renamed from: com.scb.phone.view.activity.tc.MutualFundTermsAndConditionsActivity$write */
    static final class write implements DialogInterface.OnClickListener {
        public static final write IconCompatParcelizer = new write();

        write() {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "tag");
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.tc_investment_decline_dialog_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.tc_investment_decline_dialog_message);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.tc_investment_decline_dialog_negative_button), write.IconCompatParcelizer);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.tc_investment_decline_dialog_positive_button), new C5714xc0a2f95d(this)).show();
    }

    public final void setContentView() {
        finish();
    }

    /* renamed from: r_ */
    public final void mo15276r_(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        if (this.RatingCompat && !TextUtils.isEmpty(str)) {
            write(this, R.id.root_activity, str, getOversizeImage.ERROR);
        }
    }
}
