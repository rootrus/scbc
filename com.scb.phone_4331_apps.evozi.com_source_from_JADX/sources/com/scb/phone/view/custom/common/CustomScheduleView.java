package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import p040o.FragmentBuilder_BindBranchTabFragment;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.downloadFundSummaryPDF;

public class CustomScheduleView extends LinearLayout {
    private boolean IconCompatParcelizer;
    public FragmentBuilder_BindBranchTabFragment MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected ImageView calendarIcon;
    @BindView
    protected ImageView editButton;
    @BindView
    protected TextView effectiveTitle;
    @BindView
    protected ImageView nextArrow;
    @BindView
    protected TextView schedueleTypeLine1;
    @BindView
    protected TextView schedueleTypeLine2;
    @BindView
    protected TextView scheduleTypeTextView;
    @BindView
    protected TextView title;

    public CustomScheduleView(Context context) {
        this(context, (AttributeSet) null);
    }

    public CustomScheduleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomScheduleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.f84682131493695, this, true);
        ButterKnife.IconCompatParcelizer(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomScheduleView, 0, 0);
            try {
                this.IconCompatParcelizer = obtainStyledAttributes.getBoolean(0, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        if (this.IconCompatParcelizer) {
            this.calendarIcon.getLayoutParams().width = getResources().getDimensionPixelSize(R.dimen.f74452131165888);
            this.calendarIcon.getLayoutParams().height = getResources().getDimensionPixelSize(R.dimen.f74452131165888);
            read();
        }
        setOnClickListener(new downloadFundSummaryPDF(this));
    }

    public final void read() {
        this.title.setVisibility(8);
        this.effectiveTitle.setVisibility(8);
        this.scheduleTypeTextView.setText(R.string.schedule_setup_001);
        this.schedueleTypeLine1.setVisibility(8);
        this.schedueleTypeLine2.setVisibility(8);
        this.nextArrow.setVisibility(0);
        this.editButton.setVisibility(8);
    }

    public void setOnceDateForTransactions(String str, boolean z) {
        int i = 0;
        if (z) {
            this.title.setVisibility(0);
            this.effectiveTitle.setVisibility(8);
        } else {
            this.title.setVisibility(8);
            this.effectiveTitle.setVisibility(0);
        }
        this.scheduleTypeTextView.setText(R.string.topup_input_005);
        this.schedueleTypeLine1.setVisibility(0);
        this.schedueleTypeLine1.setText(str);
        this.schedueleTypeLine2.setVisibility(8);
        ImageView imageView = this.editButton;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        this.nextArrow.setVisibility(8);
    }

    public void setMonthlyDate(String str, String str2, boolean z) {
        int i = 0;
        if (z) {
            this.title.setVisibility(0);
            this.effectiveTitle.setVisibility(8);
        } else {
            this.title.setVisibility(8);
            this.effectiveTitle.setVisibility(0);
        }
        this.scheduleTypeTextView.setText(R.string.topup_input_006);
        this.schedueleTypeLine1.setText(str);
        this.schedueleTypeLine2.setText(str2);
        this.schedueleTypeLine1.setVisibility(0);
        this.schedueleTypeLine2.setVisibility(0);
        ImageView imageView = this.editButton;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        this.nextArrow.setVisibility(8);
    }

    public void setOnEditClickListener(FragmentBuilder_BindBranchTabFragment fragmentBuilder_BindBranchTabFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindBranchTabFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setScheduleView(p040o.getRamUsed r9, boolean r10) {
        /*
            r8 = this;
            android.content.Context r0 = r8.getContext()
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r1 = r9.IconCompatParcelizer
            int r2 = r1.hashCode()
            r3 = 0
            r4 = 1
            r5 = 77
            if (r2 == r5) goto L_0x0022
            r5 = 79
            if (r2 != r5) goto L_0x002c
            java.lang.String r2 = "O"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002c
            r1 = r3
            goto L_0x002d
        L_0x0022:
            java.lang.String r2 = "M"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002c
            r1 = r4
            goto L_0x002d
        L_0x002c:
            r1 = -1
        L_0x002d:
            if (r1 == 0) goto L_0x00b3
            if (r1 != r4) goto L_0x00bc
            java.lang.String r1 = r9.write
            if (r1 == 0) goto L_0x0038
            java.lang.String r1 = r9.write
            goto L_0x003a
        L_0x0038:
            java.lang.String r1 = "0"
        L_0x003a:
            int r1 = java.lang.Integer.parseInt(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r1)
            r2.<init>(r5)
            java.util.Locale r5 = p040o.onGetLayoutInflater.write()
            java.util.Locale r6 = new java.util.Locale
            java.lang.String r7 = "th"
            r6.<init>(r7)
            boolean r5 = r5.equals(r6)
            r6 = 2
            if (r5 != 0) goto L_0x0083
            r5 = 11
            if (r1 < r5) goto L_0x0065
            r5 = 13
            if (r1 > r5) goto L_0x0065
            r2.append(r7)
            goto L_0x0083
        L_0x0065:
            int r1 = r1 % 10
            if (r1 == r4) goto L_0x007e
            if (r1 == r6) goto L_0x0078
            r5 = 3
            if (r1 == r5) goto L_0x0072
            r2.append(r7)
            goto L_0x0083
        L_0x0072:
            java.lang.String r1 = "rd"
            r2.append(r1)
            goto L_0x0083
        L_0x0078:
            java.lang.String r1 = "nd"
            r2.append(r1)
            goto L_0x0083
        L_0x007e:
            java.lang.String r1 = "st"
            r2.append(r1)
        L_0x0083:
            android.content.res.Resources r1 = r8.getResources()
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r2
            r2 = 2131761312(0x7f1018a0, float:1.915367E38)
            java.lang.String r1 = r1.getString(r2, r5)
            java.lang.String r2 = r9.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r2 = p040o.CheckCaptureActivity.MediaBrowserCompat$ItemReceiver((android.content.res.Resources) r0, (java.lang.String) r2)
            java.lang.String r9 = r9.read
            java.lang.String r9 = p040o.CheckCaptureActivity.MediaBrowserCompat$ItemReceiver((android.content.res.Resources) r0, (java.lang.String) r9)
            android.content.res.Resources r0 = r8.getResources()
            java.lang.Object[] r5 = new java.lang.Object[r6]
            r5[r3] = r2
            r5[r4] = r9
            r9 = 2131761313(0x7f1018a1, float:1.9153671E38)
            java.lang.String r9 = r0.getString(r9, r5)
            r8.setMonthlyDate(r1, r9, r10)
            return
        L_0x00b3:
            java.lang.String r9 = r9.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r9 = p040o.CheckCaptureActivity.MediaBrowserCompat$ItemReceiver((android.content.res.Resources) r0, (java.lang.String) r9)
            r8.setOnceDateForTransactions(r9, r10)
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.custom.common.CustomScheduleView.setScheduleView(o.getRamUsed, boolean):void");
    }

    public void setScheduleView(String str, String str2) {
        this.title.setVisibility(0);
        this.title.setText(R.string.topup_input_003);
        this.effectiveTitle.setVisibility(8);
        this.scheduleTypeTextView.setText(str);
        this.schedueleTypeLine1.setVisibility(0);
        this.schedueleTypeLine1.setText(str2);
        this.schedueleTypeLine2.setVisibility(8);
        this.editButton.setVisibility(8);
        this.nextArrow.setVisibility(0);
    }
}
