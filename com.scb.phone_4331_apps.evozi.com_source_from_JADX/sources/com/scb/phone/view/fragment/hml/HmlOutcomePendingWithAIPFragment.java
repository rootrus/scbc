package com.scb.phone.view.fragment.hml;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.Iterables;
import p040o.PassportCaptureModule;
import p040o.getIdentifierUtf8Bytes;
import p040o.getPropertyInfo;
import p040o.getPropertyInfo$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getPropertyInfo$MediaBrowserCompat$ItemReceiver;
import p040o.listCompleteSessionFiles;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class HmlOutcomePendingWithAIPFragment extends HmlBaseOutcomeFragment implements PassportCaptureModule.C6974a {
    public static final read MediaBrowserCompat$CustomActionResultReceiver = new read((byte) 0);
    @BindView
    public TextView amount;
    @BindView
    public TextView dateText;
    @BindView
    public LinearLayout installmentsContainer;
    @HmlPinActivity
    public Iterables.C351911.C35201 itemFactory;
    @HmlPinActivity
    public getPropertyInfo presenter;
    @BindView
    public TextView repaymentAmount;
    @BindView
    public TextView repaymentTerm;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        listCompleteSessionFiles listcompletesessionfiles;
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88032131494030, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getPropertyInfo getpropertyinfo = this.presenter;
        if (getpropertyinfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getpropertyinfo.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (!(arguments == null || (listcompletesessionfiles = (listCompleteSessionFiles) arguments.getParcelable("HML_OUTCOME_PENDING_WITH_AIP_EXTRA")) == null)) {
            getPropertyInfo getpropertyinfo2 = this.presenter;
            if (getpropertyinfo2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.IconCompatParcelizer((Object) listcompletesessionfiles, "display");
            onGetStartedClick.write((Object) listcompletesessionfiles, "display");
            writeUInt64NoTag.IconCompatParcelizer getpropertyinfo_mediabrowsercompat_customactionresultreceiver = new getPropertyInfo$MediaBrowserCompat$CustomActionResultReceiver(listcompletesessionfiles);
            if (getpropertyinfo2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getpropertyinfo_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(getpropertyinfo2.RatingCompat);
            }
        }
        return inflate;
    }

    public final void onDestroy() {
        getPropertyInfo getpropertyinfo = this.presenter;
        if (getpropertyinfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getpropertyinfo.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(listCompleteSessionFiles listcompletesessionfiles) {
        onGetStartedClick.write((Object) listcompletesessionfiles, "display");
        TextView textView = this.dateText;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dateText");
        }
        textView.setText(listcompletesessionfiles.MediaBrowserCompat$CustomActionResultReceiver);
        TextView textView2 = this.dateText;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("dateText");
        }
        View view = textView2;
        CharSequence charSequence = listcompletesessionfiles.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = !(charSequence == null || GoodToKnowActivity.read(charSequence));
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(z ? 0 : 8);
        TextView textView3 = this.amount;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("amount");
        }
        textView3.setText(listcompletesessionfiles.MediaBrowserCompat$ItemReceiver);
        TextView textView4 = this.repaymentAmount;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentAmount");
        }
        textView4.setText(getString(R.string.hml_summary_request_amount_value, listcompletesessionfiles.MediaMetadataCompat, listcompletesessionfiles.MediaBrowserCompat$SearchResultReceiver));
        for (getIdentifierUtf8Bytes getidentifierutf8bytes : listcompletesessionfiles.IconCompatParcelizer) {
            LinearLayout linearLayout = this.installmentsContainer;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("installmentsContainer");
            }
            LayoutInflater from = LayoutInflater.from(getContext());
            LinearLayout linearLayout2 = this.installmentsContainer;
            if (linearLayout2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("installmentsContainer");
            }
            View inflate = from.inflate(R.layout.f90442131494271, linearLayout2, false);
            View findViewById = inflate.findViewById(R.id.tv_interestrate_title);
            onGetStartedClick.IconCompatParcelizer((Object) findViewById, "findViewById(R.id.tv_interestrate_title)");
            View findViewById2 = inflate.findViewById(R.id.tv_interestrate_value);
            onGetStartedClick.IconCompatParcelizer((Object) findViewById2, "findViewById(R.id.tv_interestrate_value)");
            ((TextView) findViewById).setText(getidentifierutf8bytes.MediaBrowserCompat$CustomActionResultReceiver);
            ((TextView) findViewById2).setText(getidentifierutf8bytes.read);
            linearLayout.addView(inflate);
            TextView textView5 = this.repaymentTerm;
            if (textView5 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("repaymentTerm");
            }
            textView5.setText(getString(R.string.two_words, listcompletesessionfiles.read, listcompletesessionfiles.write));
        }
    }

    public final void IconCompatParcelizer() {
        MediaBrowserCompat$ItemReceiver();
    }

    @OnClick
    public final void onButtonReturnHomeClicked(View view) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        getPropertyInfo getpropertyinfo = this.presenter;
        if (getpropertyinfo == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getPropertyInfo$MediaBrowserCompat$ItemReceiver.read;
        if (getpropertyinfo.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(getpropertyinfo.RatingCompat);
        }
    }

    @OnClick
    public final void onContactCallCenter(View view) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        aK_();
    }
}
