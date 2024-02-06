package com.scb.phone.view.fragment.scheduledtransaction;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.scheduledtransaction.CalendarDialogActivity;
import com.scb.phone.view.custom.common.ScheduleDate;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.lang.reflect.Field;
import org.threeten.p041bp.OffsetDateTime;
import p040o.ActivityBuilder_ContributeQuestionnaireActivity;
import p040o.ActivityBuilder_ContributeRegistrationCountrySearchActivity;
import p040o.ActivityBuilder_ContributeRegistrationDeadCardActivity;
import p040o.ActivityBuilder_ContributeRegistrationFacialLandingActivity;
import p040o.ActivityBuilder_ContributeRegistrationLivenessCheckActivity;
import p040o.C1246xea60bf60;
import p040o.C6320x13c8ed9;
import p040o.CheckCaptureActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlaybackStateCompat;
import p040o.getImageTooDark;
import p040o.getRamUsed;
import p040o.onCheckBoxClick;
import p040o.setTapText;

public class ScheduleMonthlyFragment extends BaseFragment {
    private PlaybackStateCompat.CustomAction IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    private OffsetDateTime MediaBrowserCompat$MediaItem;
    private NumberPicker MediaDescriptionCompat;
    private OffsetDateTime MediaMetadataCompat;
    private getImageTooDark RatingCompat;
    @BindView
    ScheduleDate endDate;
    @BindView
    ScheduleDate everyDate;
    @BindView
    ScheduleDate startDate;

    private static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((ScheduleMonthlyFragment) fragment).startActivityForResult(intent, 1);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private static final /* synthetic */ void read(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((ScheduleMonthlyFragment) fragment).startActivityForResult(intent, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89742131494201, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaMetadataCompat = this.RatingCompat.read().MediaBrowserCompat$ItemReceiver.plusDays(1);
        this.startDate.setLabel(getString(R.string.schedule_setup_007));
        this.startDate.setDateField(this.RatingCompat.read().MediaBrowserCompat$CustomActionResultReceiver);
        this.startDate.setOnSelectDateListener(new C6320x13c8ed9(this));
        this.endDate.setLabel(getString(R.string.schedule_setup_008));
        this.endDate.setOnSelectDateListener(new ActivityBuilder_ContributeRegistrationCountrySearchActivity(this));
        this.everyDate.setLabel(getString(R.string.schedule_setup_010));
        this.everyDate.setOnMakePaymentEveryListener(new ActivityBuilder_ContributeQuestionnaireActivity(this));
        this.everyDate.setCalendarButtonVisible(8);
        this.everyDate.setDateFieldVisible(8);
        this.everyDate.setArrowIconVisible(0);
        this.everyDate.setPaymentFieldVisible(0);
        return inflate;
    }

    public final void write(int i) {
        if (!this.MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = true;
            OffsetDateTime offsetDateTime = this.RatingCompat.read().RatingCompat;
            OffsetDateTime offsetDateTime2 = this.RatingCompat.read().read;
            OffsetDateTime offsetDateTime3 = this.RatingCompat.read().MediaBrowserCompat$ItemReceiver;
            if (i == 1) {
                Intent read = CalendarDialogActivity.read(getContext(), 1, this.MediaMetadataCompat, (OffsetDateTime) null, offsetDateTime, offsetDateTime2, offsetDateTime3);
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                MediaBrowserCompat$ItemReceiver(this, read);
            } else if (i == 2) {
                Intent read2 = CalendarDialogActivity.read(getContext(), 2, this.MediaMetadataCompat, this.MediaBrowserCompat$MediaItem, offsetDateTime, offsetDateTime2, offsetDateTime3);
                AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                read(this, read2);
            }
        }
    }

    public final void write() {
        if (this.MediaDescriptionCompat != null) {
            if (!this.endDate.dateField.getText().toString().isEmpty()) {
                this.RatingCompat.read(true);
                this.RatingCompat.write(new getRamUsed("M", this.MediaMetadataCompat.toString(), this.MediaBrowserCompat$MediaItem.toString(), String.valueOf(this.MediaDescriptionCompat.getValue())), "M");
            }
            this.everyDate.setPaymentField(String.valueOf(this.MediaDescriptionCompat.getValue()));
            PlaybackStateCompat.CustomAction customAction = this.IconCompatParcelizer;
            if (customAction != null) {
                customAction.dismiss();
            }
        }
    }

    private static void write(NumberPicker numberPicker) {
        for (Field field : NumberPicker.class.getDeclaredFields()) {
            if (field.getName().equals("mSelectionDivider")) {
                field.setAccessible(true);
                try {
                    field.set(numberPicker, new ColorDrawable(-3355444));
                } catch (Resources.NotFoundException | IllegalAccessException | IllegalArgumentException e) {
                    onCheckBoxClick.IconCompatParcelizer(e);
                }
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.MediaBrowserCompat$CustomActionResultReceiver = false;
        if (i2 != -1) {
            return;
        }
        if (i == 1) {
            this.MediaMetadataCompat = (OffsetDateTime) intent.getSerializableExtra("com.scb.phone.EXTRA_DATE");
            ScheduleDate scheduleDate = this.startDate;
            Context requireContext = requireContext();
            scheduleDate.setDateField(CheckCaptureActivity.read(requireContext.getResources(), "dd MMM yyyy", this.MediaMetadataCompat));
            this.endDate.setDateField("");
            this.MediaBrowserCompat$MediaItem = null;
            this.everyDate.setPaymentField("");
            this.RatingCompat.read(false);
        } else if (i == 2) {
            this.MediaBrowserCompat$MediaItem = (OffsetDateTime) intent.getSerializableExtra("com.scb.phone.EXTRA_DATE");
            ScheduleDate scheduleDate2 = this.endDate;
            Context requireContext2 = requireContext();
            scheduleDate2.setDateField(CheckCaptureActivity.read(requireContext2.getResources(), "dd MMM yyyy", this.MediaBrowserCompat$MediaItem));
            this.everyDate.setPaymentField("");
            this.RatingCompat.read(false);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (this.RatingCompat != null) {
            return;
        }
        if (context instanceof getImageTooDark) {
            this.RatingCompat = (getImageTooDark) context;
        } else if (getParentFragment() instanceof getImageTooDark) {
            this.RatingCompat = (getImageTooDark) getParentFragment();
        } else {
            throw new ClassCastException();
        }
    }

    public void onDetach() {
        super.onDetach();
        this.RatingCompat = null;
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(ScheduleMonthlyFragment scheduleMonthlyFragment) {
        C1246xea60bf60 playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver = new C1246xea60bf60(scheduleMonthlyFragment.requireContext());
        View inflate = LayoutInflater.from(scheduleMonthlyFragment.getContext()).inflate(R.layout.f90742131494301, (ViewGroup) null);
        View findViewById = inflate.findViewById(R.id.view_clickable_left);
        View findViewById2 = inflate.findViewById(R.id.view_clickable_right);
        scheduleMonthlyFragment.MediaDescriptionCompat = (NumberPicker) inflate.findViewById(R.id.number_picker);
        TextView textView = new TextView(scheduleMonthlyFragment.getContext());
        textView.setText(scheduleMonthlyFragment.getString(R.string.schedule_setup_011));
        textView.setPadding(0, 40, 0, 16);
        textView.setGravity(17);
        textView.setTextColor(-16777216);
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.read = textView;
        NumberPicker numberPicker = scheduleMonthlyFragment.MediaDescriptionCompat;
        numberPicker.setMinValue(1);
        numberPicker.setMaxValue(31);
        numberPicker.setWrapSelectorWheel(true);
        numberPicker.setDescendantFocusability(393216);
        numberPicker.setOnClickListener(new ActivityBuilder_ContributeRegistrationDeadCardActivity(scheduleMonthlyFragment));
        write(numberPicker);
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.MediaSessionCompat$QueueItem = inflate;
        scheduleMonthlyFragment.IconCompatParcelizer = playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.write();
        findViewById.setOnClickListener(new ActivityBuilder_ContributeRegistrationFacialLandingActivity(scheduleMonthlyFragment));
        findViewById2.setOnClickListener(new ActivityBuilder_ContributeRegistrationLivenessCheckActivity(scheduleMonthlyFragment));
        scheduleMonthlyFragment.IconCompatParcelizer.show();
    }
}
