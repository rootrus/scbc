package com.scb.phone.view.fragment.calendarlanding;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.prolificinteractive.materialcalendarview.CalendarDay;
import com.scb.phone.R;
import com.scb.phone.view.activity.calendar.CalendarLandingActivity;
import com.scb.phone.view.activity.scheduledtransaction.ScheduleBulkTransferActivity;
import com.scb.phone.view.activity.scheduledtransaction.ScheduleTransactionActivity;
import com.scb.phone.view.adapter.scheduledtransaction.ScheduleListAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import java.util.List;
import org.bouncycastle.asn1.x509.DisplayText;
import org.threeten.p041bp.OffsetDateTime;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Device;
import p040o.C6381x4d1a9e14;
import p040o.CheckCaptureActivity;
import p040o.FirebaseInstallationServiceClient;
import p040o.HmlPinActivity;
import p040o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding;
import p040o.MyECouponActivity_ViewBinding;
import p040o.QuickAccountSelectAdapter$FooterHolder;
import p040o.SimpleTimeLimiter;
import p040o.availableFirebaseOptions;
import p040o.getJsonBytes;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class ScheduleListFragment extends BaseFragment implements C6381x4d1a9e14 {
    private ScheduleListAdapter IconCompatParcelizer;
    @BindView
    protected LinearLayout emptyListMessageContainer;
    @BindView
    protected LinearLayout errorMessageContainer;
    @BindView
    protected LinearLayout listContainer;
    @BindView
    protected RecyclerView recyclerView;
    @HmlPinActivity
    public getJsonBytes scheduleListPresenter;
    @BindView
    protected TextView selectedDateTextView;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89732131494200, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        getContext();
        this.recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        ScheduleListAdapter scheduleListAdapter = new ScheduleListAdapter();
        this.IconCompatParcelizer = scheduleListAdapter;
        scheduleListAdapter.write = this;
        this.recyclerView.setAdapter(this.IconCompatParcelizer);
        this.scheduleListPresenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(CalendarDay calendarDay) {
        if (calendarDay != null) {
            this.selectedDateTextView.setText(CheckCaptureActivity.read(getContext().getResources(), "dd MMM yyyy", OffsetDateTime.ofInstant(QuickAccountSelectAdapter$FooterHolder.toInstant(calendarDay.getCalendar()), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok"))));
        }
    }

    public final void IconCompatParcelizer(List<AutoValue_CrashlyticsReport_Session_Event_Device.Builder> list) {
        this.listContainer.setVisibility(0);
        ScheduleListAdapter scheduleListAdapter = this.IconCompatParcelizer;
        scheduleListAdapter.MediaBrowserCompat$ItemReceiver.clear();
        scheduleListAdapter.MediaBrowserCompat$ItemReceiver.addAll(list);
        this.IconCompatParcelizer.IconCompatParcelizer.write();
        MediaBrowserCompat$ItemReceiver((CalendarDay) null);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_Session_Event_Device.Builder builder) {
        getJsonBytes getjsonbytes = this.scheduleListPresenter;
        String stackedBackground = setStackedBackground();
        if (builder.MediaBrowserCompat$CustomActionResultReceiver != null && builder.ParcelableVolumeInfo != null) {
            boolean z = false;
            if (getjsonbytes.RatingCompat != null) {
                getjsonbytes.RatingCompat.AlertController$RecycleListView();
            }
            String str = builder.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
            char c = 65535;
            switch (str.hashCode()) {
                case -562462675:
                    if (str.equals("BULKXFER")) {
                        c = 3;
                        break;
                    }
                    break;
                case -68698650:
                    if (str.equals("PAYMENT")) {
                        c = 2;
                        break;
                    }
                    break;
                case 80008848:
                    if (str.equals("TOPUP")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2063509483:
                    if (str.equals("TRANSFER")) {
                        c = 0;
                        break;
                    }
                    break;
            }
            if (c == 0) {
                getjsonbytes.MediaDescriptionCompat.write(stackedBackground);
                getjsonbytes.MediaDescriptionCompat.IconCompatParcelizer(new getJsonBytes.write(builder));
            } else if (c == 1) {
                availableFirebaseOptions availablefirebaseoptions = new availableFirebaseOptions(getjsonbytes, builder);
                if (getjsonbytes.RatingCompat != null) {
                    availablefirebaseoptions.IconCompatParcelizer(getjsonbytes.RatingCompat);
                }
                if (getjsonbytes.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getjsonbytes.RatingCompat.aj_();
                }
            } else if (c == 2) {
                FirebaseInstallationServiceClient firebaseInstallationServiceClient = new FirebaseInstallationServiceClient(getjsonbytes, builder);
                if (getjsonbytes.RatingCompat != null) {
                    firebaseInstallationServiceClient.IconCompatParcelizer(getjsonbytes.RatingCompat);
                }
                if (getjsonbytes.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    getjsonbytes.RatingCompat.aj_();
                }
            } else if (c == 3) {
                getjsonbytes.MediaDescriptionCompat.write(stackedBackground);
                getjsonbytes.MediaDescriptionCompat.IconCompatParcelizer(new getJsonBytes.IconCompatParcelizer(builder));
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        CalendarLandingActivity calendarLandingActivity = (CalendarLandingActivity) getActivity();
        Intent intent = new Intent(calendarLandingActivity, ScheduleTransactionActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(calendarLandingActivity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(calendarLandingActivity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            calendarLandingActivity.startActivityForResult(read, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(SimpleTimeLimiter simpleTimeLimiter) {
        CalendarLandingActivity calendarLandingActivity = (CalendarLandingActivity) getActivity();
        Intent intent = new Intent(calendarLandingActivity, ScheduleBulkTransferActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW_DISPLAY", simpleTimeLimiter);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(calendarLandingActivity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(calendarLandingActivity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            calendarLandingActivity.startActivityForResult(read, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read() {
        this.emptyListMessageContainer.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.listContainer.setVisibility(8);
        this.emptyListMessageContainer.setVisibility(8);
        this.errorMessageContainer.setVisibility(8);
    }

    public final void write() {
        this.listContainer.setVisibility(8);
        this.emptyListMessageContainer.setVisibility(8);
        this.errorMessageContainer.setVisibility(8);
        this.errorMessageContainer.setVisibility(0);
    }
}
