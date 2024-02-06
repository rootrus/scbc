package com.scb.phone.view.fragment.easycash;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.view.custom.easycash.CustomEasycashCommonSuccessView;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.dropBreadcrumb;
import p040o.setCrashlyticsOriginEventListener;

public class EasycashScreenShotFragment extends BaseFragment {
    private CustomEasycashCommonSuccessView MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    TextView dateTimeTextView;
    @BindView
    TextView descriptionText;
    @BindView
    TextView loanAppIdTextView;
    @BindView
    TextView refIdTextView;
    @BindView
    FrameLayout successCommonView;
    @BindView
    TextView titleSuccessTextView;

    public final void write(List<dropBreadcrumb> list, setCrashlyticsOriginEventListener setcrashlyticsorigineventlistener, View view, Context context, boolean z, int i) {
        ButterKnife.IconCompatParcelizer(this, view);
        this.titleSuccessTextView.setText(setcrashlyticsorigineventlistener.MediaMetadataCompat);
        String str = setcrashlyticsorigineventlistener.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = 0;
        if (!(str == null || str.length() == 0)) {
            this.descriptionText.setText(setcrashlyticsorigineventlistener.MediaBrowserCompat$CustomActionResultReceiver);
            this.descriptionText.setVisibility(0);
        }
        String str2 = setcrashlyticsorigineventlistener.write;
        if (!(str2 == null || str2.length() == 0)) {
            this.refIdTextView.setText(setcrashlyticsorigineventlistener.write);
        }
        String str3 = setcrashlyticsorigineventlistener.MediaBrowserCompat$ItemReceiver;
        if (!(str3 == null || str3.length() == 0)) {
            this.loanAppIdTextView.setText(setcrashlyticsorigineventlistener.MediaBrowserCompat$ItemReceiver);
        }
        String str4 = setcrashlyticsorigineventlistener.IconCompatParcelizer;
        if (!(str4 == null || str4.length() == 0)) {
            this.dateTimeTextView.setText(setcrashlyticsorigineventlistener.IconCompatParcelizer);
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = new CustomEasycashCommonSuccessView(context);
        while (i2 < list.size()) {
            i2++;
            this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(list.get(i2), i2, z, i);
        }
        this.successCommonView.addView(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
