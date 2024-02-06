package com.scb.phone.view.fragment.scheduledtransaction;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.CalendarMode;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import org.threeten.p041bp.OffsetDateTime;
import p040o.ActivityBuilder_ContributeQrToPayOtpActivity;
import p040o.ActivityBuilder_ContributeRegistrationCardDetailActivity;
import p040o.C10074na;
import p040o.C5183qi;
import p040o.ContentFrameLayout;
import p040o.HmlPinActivity;
import p040o.closeAccountVerification;
import p040o.getCarbonStripHeight;
import p040o.getETBCProductInfo;
import p040o.getETBCheckEligibility;
import p040o.getOpenAccountProductDetail;
import p040o.setDiskUsed;

public class CalendarDialogFragment extends BaseFragment implements getCarbonStripHeight {
    @BindView
    protected MaterialCalendarView calendar;
    @HmlPinActivity
    public C5183qi calendarDialogPresenter;
    @BindView
    protected View divider;
    @BindView
    protected TextView endDate;
    @BindView
    protected ImageView leftArrow;
    @BindView
    protected TextView monthYear;
    @BindView
    protected DefaultButton okButton;
    @BindView
    protected ImageView rightArrow;
    @BindView
    protected TextView startDate;
    @BindView
    protected LinearLayout startEndHeader;
    @BindView
    protected TextView titleDialog;

    public static CalendarDialogFragment read(int i, OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, OffsetDateTime offsetDateTime3, OffsetDateTime offsetDateTime4, boolean z, OffsetDateTime offsetDateTime5) {
        Bundle bundle = new Bundle();
        CalendarDialogFragment calendarDialogFragment = new CalendarDialogFragment();
        bundle.putInt("com.scb.phone.EXTRA_MODE", i);
        bundle.putSerializable("com.scb.phone.EXTRA_DATE", offsetDateTime);
        bundle.putSerializable("com.scb.phone.EXTRA_SELECT_DATE", offsetDateTime2);
        bundle.putSerializable("com.scb.phone.EXTRA_STARTDATE", offsetDateTime3);
        bundle.putSerializable("com.scb.phone.EXTRA_ENDDATE", offsetDateTime4);
        bundle.putSerializable("com.scb.phone.EXTRA_DISABLED_WEEKENDS", Boolean.valueOf(z));
        bundle.putSerializable("com.scb.phone.EXTRA_CURRENTDATE", offsetDateTime5);
        calendarDialogFragment.setArguments(bundle);
        return calendarDialogFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85932131493820, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        int i = getArguments() != null ? getArguments().getInt("com.scb.phone.EXTRA_MODE", 0) : 0;
        OffsetDateTime offsetDateTime = getArguments() != null ? (OffsetDateTime) getArguments().getSerializable("com.scb.phone.EXTRA_DATE") : null;
        OffsetDateTime offsetDateTime2 = getArguments() != null ? (OffsetDateTime) getArguments().getSerializable("com.scb.phone.EXTRA_SELECT_DATE") : null;
        OffsetDateTime offsetDateTime3 = getArguments() != null ? (OffsetDateTime) getArguments().getSerializable("com.scb.phone.EXTRA_STARTDATE") : null;
        OffsetDateTime offsetDateTime4 = getArguments() != null ? (OffsetDateTime) getArguments().getSerializable("com.scb.phone.EXTRA_ENDDATE") : null;
        if (getArguments() != null && getArguments().getBoolean("com.scb.phone.EXTRA_DISABLED_WEEKENDS")) {
            z = true;
        }
        boolean z2 = z;
        OffsetDateTime offsetDateTime5 = getArguments() != null ? (OffsetDateTime) getArguments().getSerializable("com.scb.phone.EXTRA_CURRENTDATE") : null;
        this.calendarDialogPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.calendarDialogPresenter.IconCompatParcelizer(i, offsetDateTime, offsetDateTime2, offsetDateTime3, offsetDateTime4, z2, offsetDateTime5);
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(setDiskUsed setdiskused) {
        this.titleDialog.setText(setdiskused.f2938x50fd9e4a);
        int i = 8;
        this.startEndHeader.setVisibility(setdiskused.MediaSessionCompat$Token ? 0 : 8);
        this.startDate.setText(setdiskused.MediaSessionCompat$QueueItem);
        this.endDate.setText(setdiskused.MediaMetadataCompat);
        this.endDate.setTextColor(ContentFrameLayout.write(getResources(), setdiskused.MediaSessionCompat$ResultReceiverWrapper, (Resources.Theme) null));
        View view = this.divider;
        if (setdiskused.MediaSessionCompat$Token) {
            i = 0;
        }
        view.setVisibility(i);
        this.calendar.state().edit().setFirstDayOfWeek(setdiskused.RatingCompat).setMinimumDate(setdiskused.MediaBrowserCompat$SearchResultReceiver).setMaximumDate(setdiskused.MediaBrowserCompat$MediaItem).setCalendarDisplayMode(CalendarMode.MONTHS).commit();
        this.calendar.clearSelection();
        this.calendar.removeDecorators();
        this.calendar.setTopbarVisible(false);
        this.calendar.setOnMonthChangedListener(new ActivityBuilder_ContributeRegistrationCardDetailActivity(this));
        this.calendar.setOnDateChangedListener(new ActivityBuilder_ContributeQrToPayOtpActivity(this, setdiskused));
        this.calendar.addDecorator(new getETBCheckEligibility(setdiskused.IconCompatParcelizer, setdiskused.MediaBrowserCompat$CustomActionResultReceiver));
        this.calendar.addDecorator(new getOpenAccountProductDetail(getResources(), setdiskused.read, true));
        if (setdiskused.MediaBrowserCompat$ItemReceiver) {
            this.calendar.addDecorator(new closeAccountVerification());
        }
        if (setdiskused.ParcelableVolumeInfo != null) {
            this.calendar.addDecorator(new getETBCProductInfo(getResources(), setdiskused.ParcelableVolumeInfo));
        }
        if (setdiskused.MediaDescriptionCompat != null) {
            this.calendar.setCurrentDate(setdiskused.MediaDescriptionCompat);
            this.calendar.setDateSelected(setdiskused.MediaDescriptionCompat, true);
            this.okButton.setButtonEnabled(true);
            return;
        }
        this.okButton.setButtonEnabled(false);
    }

    public final void read(String str) {
        this.monthYear.setText(str);
    }

    public final void IconCompatParcelizer(String str) {
        this.startDate.setText(str);
    }

    public final void write(String str) {
        this.endDate.setTextColor(ContentFrameLayout.write(getResources(), R.color.f66092131099764, (Resources.Theme) null));
        this.endDate.setText(str);
    }

    public final void write(boolean z) {
        this.leftArrow.setVisibility(z ? 0 : 4);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.rightArrow.setVisibility(z ? 0 : 4);
    }

    public final void write(OffsetDateTime offsetDateTime) {
        Intent intent = new Intent();
        intent.putExtra("com.scb.phone.EXTRA_DATE", offsetDateTime);
        requireActivity().setResult(-1, intent);
        requireActivity().finish();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onPreviousMonthArrowClicked() {
        this.calendar.goToPrevious();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onNextMonthArrowClicked() {
        this.calendar.goToNext();
    }

    @OnClick
    public void onCloseClicked() {
        requireActivity().setResult(0);
        requireActivity().finish();
    }

    public void onDestroy() {
        super.onDestroy();
        this.calendarDialogPresenter.onDestroy();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onOkButtonClicked() {
        C5183qi qiVar = this.calendarDialogPresenter;
        C10074na naVar = new C10074na(qiVar, this.calendar.getSelectedDate());
        if (qiVar.RatingCompat != null) {
            naVar.IconCompatParcelizer(qiVar.RatingCompat);
        }
    }

    public final /* synthetic */ void read(setDiskUsed setdiskused, CalendarDay calendarDay) {
        if (!setdiskused.read.equals(calendarDay)) {
            this.calendarDialogPresenter.IconCompatParcelizer(calendarDay);
            this.okButton.setButtonEnabled(true);
        }
    }
}
