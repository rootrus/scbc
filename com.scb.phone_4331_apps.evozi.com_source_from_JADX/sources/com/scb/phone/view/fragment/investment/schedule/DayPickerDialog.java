package com.scb.phone.view.fragment.investment.schedule;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import java.lang.reflect.Field;
import p040o.ActivityBuilder_ContributeCcSofReviewActivity;
import p040o.ActivityBuilder_ContributeCcSofSuccessActivity;
import p040o.ActivityBuilder_ContributeCheckEligibilityActivity;
import p040o.finishInitSynchronously;
import p040o.onCheckBoxClick;

public class DayPickerDialog extends DialogFragment {
    public DayPickerDialog$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;
    @BindView
    View clickableLeft;
    @BindView
    View clickableRight;
    @BindView
    public NumberPicker numberPicker;
    private finishInitSynchronously read;
    @BindView
    TextView title;

    public static DayPickerDialog IconCompatParcelizer(finishInitSynchronously finishinitsynchronously) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("Display", finishinitsynchronously);
        DayPickerDialog dayPickerDialog = new DayPickerDialog();
        dayPickerDialog.setArguments(bundle);
        return dayPickerDialog;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(1, R.style.f96022131820821);
        this.read = (finishInitSynchronously) getArguments().getParcelable("Display");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85342131493761, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.numberPicker.setMinValue(this.read.write);
        this.numberPicker.setMaxValue(this.read.read);
        if (this.read.IconCompatParcelizer != null) {
            this.numberPicker.setDisplayedValues(this.read.IconCompatParcelizer);
        }
        if (!TextUtils.isEmpty(this.read.MediaBrowserCompat$CustomActionResultReceiver)) {
            this.title.setText(this.read.MediaBrowserCompat$CustomActionResultReceiver);
        }
        this.numberPicker.setWrapSelectorWheel(true);
        this.numberPicker.setDescendantFocusability(393216);
        this.numberPicker.setOnClickListener(new ActivityBuilder_ContributeCcSofSuccessActivity(this));
        for (Field field : NumberPicker.class.getDeclaredFields()) {
            if (field.getName().equals("mSelectionDivider")) {
                field.setAccessible(true);
                try {
                    field.set(this.numberPicker, new ColorDrawable(-3355444));
                } catch (Resources.NotFoundException | IllegalAccessException | IllegalArgumentException e) {
                    onCheckBoxClick.IconCompatParcelizer(e);
                }
            }
        }
        this.clickableLeft.setOnClickListener(new ActivityBuilder_ContributeCheckEligibilityActivity(this));
        this.clickableRight.setOnClickListener(new ActivityBuilder_ContributeCcSofReviewActivity(this));
        return inflate;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof DayPickerDialog$MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$ItemReceiver = (DayPickerDialog$MediaBrowserCompat$CustomActionResultReceiver) context;
        } else if (getParentFragment() instanceof DayPickerDialog$MediaBrowserCompat$CustomActionResultReceiver) {
            this.MediaBrowserCompat$ItemReceiver = (DayPickerDialog$MediaBrowserCompat$CustomActionResultReceiver) getParentFragment();
        } else {
            throw new ClassCastException();
        }
    }
}
