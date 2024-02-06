package com.scb.phone.view.fragment.investment.scbs;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.AlignmentSpan;
import android.text.style.BulletSpan;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountConsentActivity;
import com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingConsentActivity;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.HmlPinActivity;
import p040o.PassportParameters;
import p040o.getPitch;
import p040o.getPitch$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getPitch$MediaBrowserCompat$ItemReceiver;
import p040o.writeUInt64NoTag;

public class AddAccountInfoFragment extends BaseFragment implements PassportParameters {
    private int IconCompatParcelizer = 0;
    @BindView
    protected ImageView addIcon;
    @BindView
    protected Button buttonAdd;
    @BindView
    protected Button buttonOpenAccount;
    @BindView
    protected ImageView emptyIcon;
    @HmlPinActivity
    public getPitch presenter;
    @BindView
    protected TextView textBody;

    public static AddAccountInfoFragment IconCompatParcelizer(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("EXTRA_FLOW_TYPE", i);
        AddAccountInfoFragment addAccountInfoFragment = new AddAccountInfoFragment();
        addAccountInfoFragment.setArguments(bundle);
        return addAccountInfoFragment;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [o.onLevelness] */
    /* JADX WARNING: type inference failed for: r2v4, types: [o.onLevelness] */
    /* JADX WARNING: type inference failed for: r2v7, types: [o.onLevelness] */
    /* JADX WARNING: type inference failed for: r2v9, types: [o.onLevelness] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r4, android.view.ViewGroup r5, android.os.Bundle r6) {
        /*
            r3 = this;
            r6 = 0
            r0 = 2131493786(0x7f0c039a, float:1.8611062E38)
            android.view.View r4 = r4.inflate(r0, r5, r6)
            butterknife.ButterKnife.IconCompatParcelizer(r3, r4)
            android.os.Bundle r5 = r3.getArguments()
            if (r5 == 0) goto L_0x001d
            android.os.Bundle r5 = r3.getArguments()
            java.lang.String r0 = "EXTRA_FLOW_TYPE"
            int r5 = r5.getInt(r0, r6)
            r3.IconCompatParcelizer = r5
        L_0x001d:
            o.getPitch r5 = r3.presenter
            r5.MediaBrowserCompat$ItemReceiver(r3)
            o.getPitch r5 = r3.presenter
            int r0 = r3.IconCompatParcelizer
            r1 = 1
            if (r0 == r1) goto L_0x0080
            r2 = 2
            if (r0 == r2) goto L_0x0065
            r2 = 3
            if (r0 == r2) goto L_0x004a
            o.getPitch$MediaBrowserCompat$MediaItem r0 = p040o.getPitch$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x003b
            o.onLevelness r2 = new o.onLevelness
            r2.<init>(r0)
            r0 = r2
        L_0x003b:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r2 = r5.RatingCompat
            if (r2 == 0) goto L_0x0042
            r6 = r1
        L_0x0042:
            if (r6 == 0) goto L_0x009a
            T r5 = r5.RatingCompat
            r0.IconCompatParcelizer(r5)
            goto L_0x009a
        L_0x004a:
            o.getPitch$MediaDescriptionCompat r0 = p040o.getPitch.MediaDescriptionCompat.read
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x0056
            o.onLevelness r2 = new o.onLevelness
            r2.<init>(r0)
            r0 = r2
        L_0x0056:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r2 = r5.RatingCompat
            if (r2 == 0) goto L_0x005d
            r6 = r1
        L_0x005d:
            if (r6 == 0) goto L_0x009a
            T r5 = r5.RatingCompat
            r0.IconCompatParcelizer(r5)
            goto L_0x009a
        L_0x0065:
            o.getPitch$MediaBrowserCompat$SearchResultReceiver r0 = p040o.getPitch$MediaBrowserCompat$SearchResultReceiver.read
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x0071
            o.onLevelness r2 = new o.onLevelness
            r2.<init>(r0)
            r0 = r2
        L_0x0071:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r2 = r5.RatingCompat
            if (r2 == 0) goto L_0x0078
            r6 = r1
        L_0x0078:
            if (r6 == 0) goto L_0x009a
            T r5 = r5.RatingCompat
            r0.IconCompatParcelizer(r5)
            goto L_0x009a
        L_0x0080:
            o.getPitch$MediaMetadataCompat r0 = p040o.getPitch.MediaMetadataCompat.write
            o.FundFactSheetActivity r0 = (p040o.FundFactSheetActivity) r0
            if (r0 == 0) goto L_0x008c
            o.onLevelness r2 = new o.onLevelness
            r2.<init>(r0)
            r0 = r2
        L_0x008c:
            o.writeUInt64NoTag$IconCompatParcelizer r0 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r0
            T r2 = r5.RatingCompat
            if (r2 == 0) goto L_0x0093
            r6 = r1
        L_0x0093:
            if (r6 == 0) goto L_0x009a
            T r5 = r5.RatingCompat
            r0.IconCompatParcelizer(r5)
        L_0x009a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.scbs.AddAccountInfoFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    @OnClick
    public void onAddButtonClicked() {
        getPitch getpitch = this.presenter;
        int i = this.IconCompatParcelizer;
        boolean z = true;
        if (i == 2 || i == 3) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getPitch.IconCompatParcelizer.read;
            if (getpitch.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getpitch.RatingCompat);
            }
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getPitch.read.MediaBrowserCompat$ItemReceiver;
        if (getpitch.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer2.IconCompatParcelizer(getpitch.RatingCompat);
        }
    }

    @OnClick
    public void onOpenButtonClicked() {
        getPitch getpitch = this.presenter;
        int i = this.IconCompatParcelizer;
        boolean z = true;
        if (i == 2 || i == 3) {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getPitch$MediaBrowserCompat$CustomActionResultReceiver.write;
            if (getpitch.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(getpitch.RatingCompat);
            }
        } else {
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getPitch$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            if (getpitch.RatingCompat != null) {
                iconCompatParcelizer2.IconCompatParcelizer(getpitch.RatingCompat);
            }
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = getPitch.write.MediaBrowserCompat$ItemReceiver;
        if (getpitch.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer3.IconCompatParcelizer(getpitch.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        AddAccountConsentActivity.IconCompatParcelizer(getContext());
    }

    public final void IconCompatParcelizer() {
        ScbsOnboardingConsentActivity.read(getContext());
    }

    public final void write(String str) {
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_(str);
        }
    }

    public final void read() {
        this.emptyIcon.setImageResource(R.drawable.empty_state_icon);
        Drawable drawable = this.emptyIcon.getDrawable();
        getResources();
        drawable.setColorFilter(-9031231, PorterDuff.Mode.SRC_IN);
        String string = getString(R.string.auto_robo_advisor_open_scbs_account_topic);
        String string2 = getString(R.string.auto_robo_advisor_open_scbs_account_stop_1);
        String string3 = getString(R.string.auto_robo_advisor_open_scbs_account_stop_2);
        String string4 = getString(R.string.robo_body_text_format_open, string, string2, string3, getString(R.string.auto_robo_advisor_open_scbs_account_stop_3));
        int indexOf = string4.indexOf(string2);
        int length = string2.length();
        int indexOf2 = string4.indexOf(string3);
        int length2 = string3.length();
        SpannableString spannableString = new SpannableString(string4);
        spannableString.setSpan(new AlignmentSpan.Standard(Layout.Alignment.ALIGN_CENTER), 0, string.length(), 33);
        getResources();
        spannableString.setSpan(new BulletSpan(30), indexOf, length + indexOf, 18);
        spannableString.setSpan(new BulletSpan(30), indexOf2, length2 + indexOf2, 18);
        this.textBody.setText(spannableString);
        this.buttonOpenAccount.setText(getString(R.string.auto_robo_advisor_open_scbs_button_open));
        this.buttonAdd.setText(getString(R.string.auto_robo_advisor_open_scbs_button_add));
        this.addIcon.setImageResource(R.drawable.ic_add_button);
    }

    public final void write() {
        this.emptyIcon.setImageResource(R.drawable.empty_state_icon);
        Drawable drawable = this.emptyIcon.getDrawable();
        getResources();
        drawable.setColorFilter(-9031231, PorterDuff.Mode.SRC_IN);
        this.textBody.setText(getString(R.string.robo_body_text_format_add, getString(R.string.auto_robo_advisor_add_scbs_account_stop_1), getString(R.string.auto_robo_advisor_add_scbs_account_stop_2), getString(R.string.auto_robo_advisor_add_scbs_account_stop_3)));
        this.textBody.setTextAlignment(4);
        this.buttonOpenAccount.setText(getString(R.string.auto_robo_advisor_open_scbs_button_open));
        this.buttonAdd.setVisibility(8);
        this.addIcon.setVisibility(8);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.textBody.setText(R.string.add_account_info_body);
        this.textBody.setTextAlignment(4);
        this.buttonOpenAccount.setVisibility(0);
        this.buttonAdd.setVisibility(0);
        this.addIcon.setVisibility(0);
    }

    public final void MediaBrowserCompat$MediaItem() {
        this.textBody.setText(R.string.add_account_info_body);
        this.textBody.setTextAlignment(4);
        this.buttonOpenAccount.setVisibility(0);
        this.buttonAdd.setVisibility(8);
        this.addIcon.setVisibility(8);
    }
}
