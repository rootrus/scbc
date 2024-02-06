package com.scb.phone.view.fragment.investment.schedule;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import androidx.fragment.app.Fragment;
import androidx.gridlayout.widget.GridLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.BubbleSelector;
import com.scb.phone.view.custom.common.ScheduleDate;
import java.util.TreeMap;
import p040o.ActivityBuilder_ContributeChequeAnnouncementActivity;
import p040o.ActivityBuilder_ContributeChubbPaymentSuccessActivity;
import p040o.ActivityBuilder_ContributeChubbReviewActivity;
import p040o.CardView;
import p040o.CheckCaptureExperience_MembersInjector;
import p040o.CrashlyticsCore;
import p040o.HmlPinActivity;
import p040o.finishInitSynchronously;
import p040o.finishInitSynchronously$MediaBrowserCompat$ItemReceiver;
import p040o.getImageWidth;
import p040o.isAnimationTutorEnable;
import p040o.isDiagnosticsViewEnabled;
import p040o.isProximityOn;

public class SetupScheduleMonthlyFragment extends BaseSetupScheduleFragment implements getImageWidth.IconCompatParcelizer.C10788IconCompatParcelizer, DayPickerDialog$MediaBrowserCompat$CustomActionResultReceiver {
    private CompoundButton.OnCheckedChangeListener MediaBrowserCompat$CustomActionResultReceiver = new ActivityBuilder_ContributeChubbReviewActivity(this);
    @BindView
    ScheduleDate dateSelector;
    @BindView
    GridLayout grid;
    @HmlPinActivity
    public isAnimationTutorEnable presenter;
    @BindView
    CheckBox selectAllCheckBox;

    /* access modifiers changed from: package-private */
    public final String write() {
        return "M";
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89902131494217, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        isAnimationTutorEnable isanimationtutorenable = this.presenter;
        CrashlyticsCore.C32494 IconCompatParcelizer = this.IconCompatParcelizer.IconCompatParcelizer();
        isanimationtutorenable.MediaBrowserCompat$ItemReceiver = new TreeMap();
        isDiagnosticsViewEnabled isdiagnosticsviewenabled = isDiagnosticsViewEnabled.write;
        if (isanimationtutorenable.RatingCompat != null) {
            z = true;
        }
        if (z) {
            isdiagnosticsviewenabled.IconCompatParcelizer(isanimationtutorenable.RatingCompat);
        }
        isanimationtutorenable.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.IconCompatParcelizer.write);
        return inflate;
    }

    public final void IconCompatParcelizer() {
        this.dateSelector.setLabel(getString(R.string.setup_schedule_monthly_purchase_every_label));
        this.dateSelector.setOnMakePaymentEveryListener(new ActivityBuilder_ContributeChubbPaymentSuccessActivity(this));
        this.dateSelector.setCalendarButtonVisible(8);
        this.dateSelector.setDateFieldVisible(8);
        this.dateSelector.setArrowIconVisible(0);
        this.dateSelector.setPaymentFieldVisible(0);
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            if (this.grid.getChildAt(i) instanceof BubbleSelector) {
                BubbleSelector bubbleSelector = (BubbleSelector) this.grid.getChildAt(i);
                this.presenter.write(bubbleSelector.write, false);
                bubbleSelector.MediaBrowserCompat$ItemReceiver = new ActivityBuilder_ContributeChequeAnnouncementActivity(this);
            }
        }
        this.selectAllCheckBox.setOnCheckedChangeListener(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void write(boolean z) {
        this.selectAllCheckBox.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.selectAllCheckBox.setChecked(z);
        this.selectAllCheckBox.setOnCheckedChangeListener(this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void IconCompatParcelizer(boolean z) {
        for (int i = 0; i < this.grid.getChildCount(); i++) {
            if (this.grid.getChildAt(i) instanceof BubbleSelector) {
                ((BubbleSelector) this.grid.getChildAt(i)).setSelected(z);
            }
        }
    }

    public final void read(isProximityOn isproximityon) {
        super.read(isproximityon);
    }

    public final void IconCompatParcelizer(String str) {
        this.dateSelector.setPaymentField(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        isAnimationTutorEnable isanimationtutorenable = this.presenter;
        String valueOf = String.valueOf(i);
        isanimationtutorenable.read = valueOf;
        CheckCaptureExperience_MembersInjector checkCaptureExperience_MembersInjector = new CheckCaptureExperience_MembersInjector(valueOf);
        if (isanimationtutorenable.RatingCompat != null) {
            checkCaptureExperience_MembersInjector.IconCompatParcelizer(isanimationtutorenable.RatingCompat);
        }
        isanimationtutorenable.write();
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }

    public static /* synthetic */ void read(SetupScheduleMonthlyFragment setupScheduleMonthlyFragment) {
        CardView read = setupScheduleMonthlyFragment.getChildFragmentManager().read();
        Fragment findFragmentByTag = setupScheduleMonthlyFragment.getFragmentManager().findFragmentByTag("dialog");
        if (findFragmentByTag != null) {
            read.write(findFragmentByTag);
        }
        read.MediaBrowserCompat$CustomActionResultReceiver((String) null);
        finishInitSynchronously$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$CustomActionResultReceiver2 = finishInitSynchronously.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = 1;
        MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver = 26;
        DayPickerDialog.IconCompatParcelizer(new finishInitSynchronously(MediaBrowserCompat$CustomActionResultReceiver2, (byte) 0)).show(read, "dialog");
    }
}
