package com.scb.phone.view.activity.calendar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.calendarlanding.CalendarFragment;
import com.scb.phone.view.fragment.calendarlanding.ScheduleListFragment;
import java.util.List;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory;
import p040o.buildCreateFirebaseInstallationRequestBody;
import p040o.getDiskUsed;
import p040o.getJsonBytes;
import p040o.getJsonBytes$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.logBadConfigError;
import p040o.logBadConfigError$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setResponseCode;
import p040o.setUri;

public class CalendarLandingActivity extends BaseActivity implements CheckCaptureModule_GetIExceptionResponseDeserializerRttiFactory {
    public CalendarFragment MediaBrowserCompat$MediaItem;
    public ScheduleListFragment MediaBrowserCompat$SearchResultReceiver;
    @BindView
    public LinearLayout emptyScheduleMessageContainer;
    @BindView
    public LinearLayout fragmentContainer;

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76922131492917);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.more_option_001));
        setTabContainer();
        this.MediaBrowserCompat$SearchResultReceiver = (ScheduleListFragment) getSupportFragmentManager().findFragmentById(R.id.schedule_list_fragment);
        this.MediaBrowserCompat$MediaItem = (CalendarFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_calendar_landing);
        getDiskUsed getdiskused = (getDiskUsed) getIntent().getParcelableExtra("SCHEDULE_DATA");
        boolean z = false;
        if (getdiskused == null || getdiskused.IconCompatParcelizer == null || getdiskused.IconCompatParcelizer.isEmpty()) {
            this.emptyScheduleMessageContainer.setVisibility(0);
            this.fragmentContainer.setVisibility(8);
            return;
        }
        ScheduleListFragment scheduleListFragment = this.MediaBrowserCompat$SearchResultReceiver;
        List<CalendarDay> list = getdiskused.IconCompatParcelizer;
        getJsonBytes getjsonbytes = scheduleListFragment.scheduleListPresenter;
        getjsonbytes.read.clear();
        getjsonbytes.read.addAll(list);
        CalendarFragment calendarFragment = this.MediaBrowserCompat$MediaItem;
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

    public final void setStackedBackground() {
        super.setStackedBackground();
        MediaSessionCompat$QueueItem(getString(R.string.more_option_001));
        setTabContainer();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CalendarDay calendarDay) {
        ScheduleListFragment scheduleListFragment = this.MediaBrowserCompat$SearchResultReceiver;
        scheduleListFragment.MediaBrowserCompat$CustomActionResultReceiver();
        getJsonBytes getjsonbytes = scheduleListFragment.scheduleListPresenter;
        getjsonbytes.MediaBrowserCompat$CustomActionResultReceiver();
        boolean z = true;
        if (getjsonbytes.RatingCompat != null) {
            getjsonbytes.RatingCompat.ay_();
        }
        if (getjsonbytes.read.contains(calendarDay)) {
            if (getjsonbytes.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getjsonbytes.RatingCompat.Keep();
            }
            getjsonbytes.MediaBrowserCompat$SearchResultReceiver.read();
            getjsonbytes.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new getJsonBytes$MediaBrowserCompat$CustomActionResultReceiver(getjsonbytes, (byte) 0));
            getjsonbytes.write = calendarDay;
        } else {
            setResponseCode setresponsecode = setResponseCode.read;
            if (getjsonbytes.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setresponsecode.IconCompatParcelizer(getjsonbytes.RatingCompat);
            }
        }
        scheduleListFragment.MediaBrowserCompat$ItemReceiver(calendarDay);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.MediaBrowserCompat$SearchResultReceiver.read();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 200 && i2 == 201) {
            logBadConfigError logbadconfigerror = this.MediaBrowserCompat$MediaItem.calendarPresenter;
            if (logbadconfigerror.RatingCompat != null) {
                logbadconfigerror.RatingCompat.AlertController$RecycleListView();
            }
            logbadconfigerror.IconCompatParcelizer.IconCompatParcelizer();
            logbadconfigerror.IconCompatParcelizer.IconCompatParcelizer(new logBadConfigError$MediaBrowserCompat$CustomActionResultReceiver(logbadconfigerror, (byte) 0));
            this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
