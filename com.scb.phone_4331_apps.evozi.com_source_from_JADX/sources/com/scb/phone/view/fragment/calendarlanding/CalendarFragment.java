package com.scb.phone.view.fragment.calendarlanding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.prolificinteractive.materialcalendarview.CalendarMode;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.scb.phone.R;
import com.scb.phone.view.activity.calendar.CalendarLandingActivity;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import java.util.NoSuchElementException;
import org.threeten.p041bp.OffsetDateTime;
import p040o.C5183qi;
import p040o.CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory;
import p040o.HmlPinActivity;
import p040o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding;
import p040o.QuickAccountSelectAdapter$FooterHolder;
import p040o.buildCreateFirebaseInstallationRequestBody;
import p040o.getCarbonStripHeight;
import p040o.getDepositProduct;
import p040o.getDiskUsed;
import p040o.getETBCheckEligibility;
import p040o.getJsonBytes;
import p040o.getNextTransition;
import p040o.getOpenAccountProductDetail;
import p040o.getTag;
import p040o.isSupportFragmentClass;
import p040o.logBadConfigError;
import p040o.setCancelable;
import p040o.setDiskUsed;
import p040o.setUri;
import p040o.setUserLanguage;
import p040o.show;
import p040o.swapTiles;
import p040o.updateAccount;
import p040o.updateEmailProfile;

public class CalendarFragment extends BaseFragment implements getCarbonStripHeight, CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory.IconCompatParcelizer {
    public getDiskUsed IconCompatParcelizer;
    public CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory MediaBrowserCompat$CustomActionResultReceiver;
    public OffsetDateTime RatingCompat;
    @HmlPinActivity
    public C5183qi calendarDialogPresenter;
    @HmlPinActivity
    public logBadConfigError calendarPresenter;
    @BindView
    protected MaterialCalendarView calendarView;
    @BindView
    protected ImageView leftArrowImageView;
    @BindView
    protected TextView monthYear;
    @BindView
    protected ImageView rightArrowImageView;

    public final void IconCompatParcelizer(String str) {
    }

    public final void write(String str) {
    }

    public final void write(OffsetDateTime offsetDateTime) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85942131493821, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            this.IconCompatParcelizer = (getDiskUsed) getActivity().getIntent().getParcelableExtra("SCHEDULE_DATA");
        }
        getDiskUsed getdiskused = this.IconCompatParcelizer;
        if (!(getdiskused == null || getdiskused.IconCompatParcelizer == null)) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
        this.calendarPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$CustomActionResultReceiver = (CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory) getActivity();
        return inflate;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver() {
        isSupportFragmentClass issupportfragmentclass;
        CalendarDay calendarDay;
        OffsetDateTime offsetDateTime = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
        OffsetDateTime offsetDateTime2 = null;
        if (offsetDateTime != null) {
            show show = new show(this.IconCompatParcelizer.IconCompatParcelizer);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new setUserLanguage(offsetDateTime)));
            show show3 = new show(show2.write, new getTag(show2.IconCompatParcelizer, setCancelable.write(updateAccount.MediaBrowserCompat$CustomActionResultReceiver)));
            if (show3.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show3.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            if (issupportfragmentclass.IconCompatParcelizer != null) {
                T t = issupportfragmentclass.IconCompatParcelizer;
                if (t != null) {
                    calendarDay = (CalendarDay) t;
                } else {
                    throw new NoSuchElementException("No value present");
                }
            } else {
                calendarDay = null;
            }
            if (calendarDay != null) {
                offsetDateTime2 = OffsetDateTime.ofInstant(QuickAccountSelectAdapter$FooterHolder.toInstant(calendarDay.getCalendar()), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok"));
            }
        }
        if (offsetDateTime2 == null) {
            offsetDateTime2 = offsetDateTime;
        }
        this.RatingCompat = offsetDateTime2;
        OffsetDateTime offsetDateTime3 = this.IconCompatParcelizer.RatingCompat;
        OffsetDateTime offsetDateTime4 = this.IconCompatParcelizer.read;
        this.calendarDialogPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.calendarDialogPresenter.IconCompatParcelizer(2, offsetDateTime, this.RatingCompat, offsetDateTime3, offsetDateTime4, false, (OffsetDateTime) null);
    }

    public static /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(OffsetDateTime offsetDateTime, CalendarDay calendarDay) {
        return calendarDay.getMonth() + 1 == offsetDateTime.getMonthValue() && calendarDay.getYear() == offsetDateTime.getYear();
    }

    public final void MediaBrowserCompat$ItemReceiver(setDiskUsed setdiskused) {
        getDepositProduct getdepositproduct = new getDepositProduct(getResources(), this.IconCompatParcelizer.IconCompatParcelizer);
        this.calendarView.state().edit().setFirstDayOfWeek(setdiskused.RatingCompat).setMinimumDate(setdiskused.MediaBrowserCompat$SearchResultReceiver).setMaximumDate(setdiskused.MediaBrowserCompat$MediaItem).setCalendarDisplayMode(CalendarMode.MONTHS).commit();
        this.calendarView.setDynamicHeightEnabled(true);
        this.calendarView.setTopbarVisible(false);
        this.calendarView.setOnMonthChangedListener(new swapTiles(this));
        this.calendarView.setOnDateChangedListener(new updateEmailProfile(this));
        this.calendarView.clearSelection();
        this.calendarView.removeDecorators();
        this.calendarView.addDecorator(new getETBCheckEligibility(setdiskused.IconCompatParcelizer, setdiskused.MediaBrowserCompat$CustomActionResultReceiver));
        this.calendarView.addDecorator(new getOpenAccountProductDetail(getResources(), setdiskused.ParcelableVolumeInfo, false));
        this.calendarView.addDecorator(getdepositproduct);
        this.calendarView.setCurrentDate(setdiskused.MediaDescriptionCompat);
        this.calendarView.setDateSelected(setdiskused.MediaDescriptionCompat, true);
    }

    public final void read(String str) {
        this.monthYear.setText(str);
    }

    public final void write(boolean z) {
        this.leftArrowImageView.setVisibility(z ? 0 : 4);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.rightArrowImageView.setVisibility(z ? 0 : 4);
    }

    @OnClick
    public void onPreviousMonthArrowClicked() {
        this.calendarView.goToPrevious();
    }

    @OnClick
    public void onNextMonthArrowClicked() {
        this.calendarView.goToNext();
    }

    public final void IconCompatParcelizer(getDiskUsed getdiskused) {
        this.IconCompatParcelizer = getdiskused;
        if (getActivity() != null) {
            boolean z = false;
            if (getdiskused == null || getdiskused.IconCompatParcelizer == null || getdiskused.IconCompatParcelizer.size() == 0) {
                CalendarLandingActivity calendarLandingActivity = (CalendarLandingActivity) getActivity();
                calendarLandingActivity.emptyScheduleMessageContainer.setVisibility(0);
                calendarLandingActivity.fragmentContainer.setVisibility(8);
                return;
            }
            MediaBrowserCompat$CustomActionResultReceiver();
            CalendarLandingActivity calendarLandingActivity2 = (CalendarLandingActivity) getActivity();
            List<CalendarDay> list = getdiskused.IconCompatParcelizer;
            getJsonBytes getjsonbytes = calendarLandingActivity2.MediaBrowserCompat$SearchResultReceiver.scheduleListPresenter;
            getjsonbytes.read.clear();
            getjsonbytes.read.addAll(list);
            CalendarFragment calendarFragment = calendarLandingActivity2.MediaBrowserCompat$MediaItem;
            logBadConfigError logbadconfigerror = calendarFragment.calendarPresenter;
            OffsetDateTime offsetDateTime = calendarFragment.RatingCompat;
            if (calendarFragment.IconCompatParcelizer.IconCompatParcelizer == null || offsetDateTime == null) {
                buildCreateFirebaseInstallationRequestBody buildcreatefirebaseinstallationrequestbody = buildCreateFirebaseInstallationRequestBody.IconCompatParcelizer;
                if (logbadconfigerror.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    buildcreatefirebaseinstallationrequestbody.IconCompatParcelizer(logbadconfigerror.RatingCompat);
                    return;
                }
                return;
            }
            setUri seturi = new setUri(logbadconfigerror, offsetDateTime);
            if (logbadconfigerror.RatingCompat != null) {
                z = true;
            }
            if (z) {
                seturi.IconCompatParcelizer(logbadconfigerror.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer() {
        if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public final void read(CalendarDay calendarDay) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(calendarDay);
    }

    public final void read() {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver();
    }

    public void onDestroy() {
        this.calendarPresenter.MediaBrowserCompat$ItemReceiver();
        super.onDestroy();
    }
}
