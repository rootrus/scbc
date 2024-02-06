package com.scb.phone.view.activity.cardmanagement;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivityWithFragment;
import com.scb.phone.view.activity.creditcard.CreditCardDetailActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.C4645x8c821cad;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.IExtractorListener;
import p040o.IExtractorListener$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.chain;
import p040o.getRightEyeOpenProbability;
import p040o.getRightEyeOpenProbability$MediaBrowserCompat$ItemReceiver;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.onMessageTriggered;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class TermAndConditionStatementChannelActivity extends BaseActivityWithFragment implements IExtractorListener, FragmentBuilder_BindCustomizeYourPageFragment {
    public static final read MediaDescriptionCompat = new read((byte) 0);
    private String MediaBrowserCompat$MediaItem;
    private chain MediaBrowserCompat$SearchResultReceiver;
    private String MediaMetadataCompat;
    private ArrayList<String> MediaSessionCompat$ResultReceiverWrapper;
    private ArrayList<chain> MediaSessionCompat$Token;
    @HmlPinActivity
    public getRightEyeOpenProbability presenter;
    private String setHasDecor;

    static final class write implements DialogInterface.OnClickListener {
        write(IExtractorListener$MediaBrowserCompat$CustomActionResultReceiver iExtractorListener$MediaBrowserCompat$CustomActionResultReceiver) {
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }

        public static Intent MediaBrowserCompat$ItemReceiver(Context context, String str, chain chain, ArrayList<chain> arrayList, String str2, String str3, String str4, ArrayList<String> arrayList2) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "type");
            onGetStartedClick.write((Object) chain, "ccd");
            onGetStartedClick.write((Object) arrayList, "ccdList");
            onGetStartedClick.write((Object) str2, "channel");
            onGetStartedClick.write((Object) str3, "address");
            onGetStartedClick.write((Object) str4, "maskCard");
            onGetStartedClick.write((Object) arrayList2, "tempSelectCard");
            Intent intent = new Intent(context, TermAndConditionStatementChannelActivity.class);
            intent.putExtra("EXTRA_MASK_CARD_KEY", str4);
            intent.putExtra("EXTRA_CHANNEL_KEY", str2);
            intent.putExtra("EXTRA_ADDRESS_KEY", str3);
            intent.putExtra("EXTRA_TYPE_FOR_TERM_AND_CONDITION", str);
            intent.putExtra("EXTRA_CREDIT_CARD_DISPLAY_KEY", chain);
            intent.putExtra("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY", arrayList);
            intent.putExtra("EXTRA_TEMP_SELECT_CARD_KEY", arrayList2);
            return intent;
        }
    }

    public final void onStart() {
        super.onStart();
        Intent intent = getIntent();
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("EXTRA_CREDIT_CARD_DISPLAY_KEY");
            onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "it.getParcelableExtra(EX…_CREDIT_CARD_DISPLAY_KEY)");
            this.MediaBrowserCompat$SearchResultReceiver = (chain) parcelableExtra;
            ArrayList<chain> parcelableArrayListExtra = intent.getParcelableArrayListExtra("EXTRA_CREDIT_CARD_DISPLAY_LIST_KEY");
            onGetStartedClick.IconCompatParcelizer((Object) parcelableArrayListExtra, "it.getParcelableArrayLis…IT_CARD_DISPLAY_LIST_KEY)");
            this.MediaSessionCompat$Token = parcelableArrayListExtra;
            String stringExtra = intent.getStringExtra("EXTRA_TYPE_FOR_TERM_AND_CONDITION");
            onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "it.getStringExtra(EXTRA_…E_FOR_TERM_AND_CONDITION)");
            this.setHasDecor = stringExtra;
            String stringExtra2 = intent.getStringExtra("EXTRA_ADDRESS_KEY");
            onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "it.getStringExtra(EXTRA_ADDRESS_KEY)");
            this.MediaBrowserCompat$MediaItem = stringExtra2;
            String stringExtra3 = intent.getStringExtra("EXTRA_CHANNEL_KEY");
            onGetStartedClick.IconCompatParcelizer((Object) stringExtra3, "it.getStringExtra(EXTRA_CHANNEL_KEY)");
            this.MediaMetadataCompat = stringExtra3;
            onGetStartedClick.IconCompatParcelizer((Object) intent.getStringExtra("EXTRA_MASK_CARD_KEY"), "it.getStringExtra(EXTRA_MASK_CARD_KEY)");
            ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("EXTRA_TEMP_SELECT_CARD_KEY");
            onGetStartedClick.IconCompatParcelizer((Object) stringArrayListExtra, "it.getStringArrayListExt…TRA_TEMP_SELECT_CARD_KEY)");
            this.MediaSessionCompat$ResultReceiverWrapper = stringArrayListExtra;
        }
        getRightEyeOpenProbability getrighteyeopenprobability = this.presenter;
        if (getrighteyeopenprobability == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getrighteyeopenprobability.MediaBrowserCompat$ItemReceiver(this);
        getRightEyeOpenProbability getrighteyeopenprobability2 = this.presenter;
        if (getrighteyeopenprobability2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str = this.setHasDecor;
        if (str == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("type");
        }
        onGetStartedClick.write((Object) str, "type");
        boolean z = true;
        writeUInt64NoTag.IconCompatParcelizer read2 = new getRightEyeOpenProbability.read(getrighteyeopenprobability2, str, true);
        if (getrighteyeopenprobability2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            read2.IconCompatParcelizer(getrighteyeopenprobability2.RatingCompat);
        }
    }

    public final String au_() {
        String string = getString(R.string.terms_and_conditions_title);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.terms_and_conditions_title)");
        return string;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final Fragment mo13702x50fd9e4a() {
        return new Fragment();
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "display");
        TermsAndConditionsFragment.write write2 = TermsAndConditionsFragment.IconCompatParcelizer;
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture)).write();
    }

    public final void IconCompatParcelizer(String str) {
        getRightEyeOpenProbability getrighteyeopenprobability = this.presenter;
        if (getrighteyeopenprobability == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getRightEyeOpenProbability.write.IconCompatParcelizer;
        if (getrighteyeopenprobability.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getrighteyeopenprobability.RatingCompat);
        }
    }

    public final void write(String str) {
        getRightEyeOpenProbability getrighteyeopenprobability = this.presenter;
        if (getrighteyeopenprobability == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getRightEyeOpenProbability$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        if (getrighteyeopenprobability.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getrighteyeopenprobability.RatingCompat);
        }
    }

    public final void setContentView() {
        finish();
    }

    public final void read(onMessageTriggered onmessagetriggered) {
        onGetStartedClick.write((Object) onmessagetriggered, "display");
        C5568x677a96a statementChannelSuccessfulActivity$MediaBrowserCompat$CustomActionResultReceiver = StatementChannelSuccessfulActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, StatementChannelSuccessfulActivity.class);
        intent.putExtra("EXTRA_CHANGE_CHANNEL_SUCCESS_DISPLAY_KEY", onmessagetriggered);
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

    public final void MediaBrowserCompat$ItemReceiver(IExtractorListener.read read2) {
        onGetStartedClick.write((Object) read2, "callback");
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.accept_terms_and_conditions);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.accept_terms_and_conditions_desc);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), new C5570x6d5855af(read2));
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ccr_btn_accerpt), new C5569xcdde0ee0(read2)).show();
    }

    static final class IconCompatParcelizer implements DialogInterface.OnClickListener {
        private /* synthetic */ IExtractorListener$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;

        IconCompatParcelizer(IExtractorListener$MediaBrowserCompat$CustomActionResultReceiver iExtractorListener$MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer = iExtractorListener$MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver();
        }
    }

    public final void IconCompatParcelizer(IExtractorListener$MediaBrowserCompat$CustomActionResultReceiver iExtractorListener$MediaBrowserCompat$CustomActionResultReceiver) {
        onGetStartedClick.write((Object) iExtractorListener$MediaBrowserCompat$CustomActionResultReceiver, "callback");
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer2.read.getString(R.string.decline_terms_and_conditions);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.decline_terms_and_conditions_desc);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), new write(iExtractorListener$MediaBrowserCompat$CustomActionResultReceiver));
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ccr_btn_decline), new IconCompatParcelizer(iExtractorListener$MediaBrowserCompat$CustomActionResultReceiver)).show();
    }

    public final void MediaBrowserCompat$ItemReceiver(IExtractorListener$MediaBrowserCompat$CustomActionResultReceiver iExtractorListener$MediaBrowserCompat$CustomActionResultReceiver) {
        onGetStartedClick.write((Object) iExtractorListener$MediaBrowserCompat$CustomActionResultReceiver, "callback");
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer((Context) this);
        IconCompatParcelizer2.setCancelable(false);
        String string = IconCompatParcelizer2.read.getString(R.string.unable_to_proceed_error_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer2.mTitleTextView.setVisibility(0);
            IconCompatParcelizer2.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer2.read.getString(R.string.ccr_we_cannot_process_your_request_at_the_moment);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer2.mTextTextView.setVisibility(0);
            IconCompatParcelizer2.mTextTextView.setText(string2);
        }
        IconCompatParcelizer2.IconCompatParcelizer(IconCompatParcelizer2.read.getString(R.string.ok), new C5571x94204781(iExtractorListener$MediaBrowserCompat$CustomActionResultReceiver)).show();
    }

    public final void write() {
        getRightEyeOpenProbability getrighteyeopenprobability = this.presenter;
        if (getrighteyeopenprobability == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        chain chain = this.MediaBrowserCompat$SearchResultReceiver;
        if (chain == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplay");
        }
        String str = chain.MediaDescriptionCompat;
        onGetStartedClick.IconCompatParcelizer((Object) str, "creditCardDisplay.cardRefNo");
        String str2 = this.MediaMetadataCompat;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("channel");
        }
        String str3 = this.MediaBrowserCompat$MediaItem;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("address");
        }
        ArrayList<String> arrayList = this.MediaSessionCompat$ResultReceiverWrapper;
        if (arrayList == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tempSelectCard");
        }
        List list = arrayList;
        ArrayList<chain> arrayList2 = this.MediaSessionCompat$Token;
        if (arrayList2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("creditCardDisplayList");
        }
        List list2 = arrayList2;
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "channel");
        onGetStartedClick.write((Object) str3, "address");
        onGetStartedClick.write((Object) list, "tempSelectCard");
        onGetStartedClick.write((Object) list2, "ccdList");
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new getRightEyeOpenProbability.IconCompatParcelizer(getrighteyeopenprobability, str, str2, str3, list, list2);
        if (getrighteyeopenprobability.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getrighteyeopenprobability.RatingCompat);
        }
    }

    public final void read() {
        getRightEyeOpenProbability getrighteyeopenprobability = this.presenter;
        if (getrighteyeopenprobability == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4645x8c821cad.MediaBrowserCompat$ItemReceiver;
        if (getrighteyeopenprobability.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getrighteyeopenprobability.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent(this, CreditCardDetailActivity.class);
        intent.setFlags(603979776);
        finish();
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
    }

    public final void IconCompatParcelizer() {
        this.scbAnalytics.write("change_stmt_channel_termsandcon", new ZSYR2K[0]);
    }
}
