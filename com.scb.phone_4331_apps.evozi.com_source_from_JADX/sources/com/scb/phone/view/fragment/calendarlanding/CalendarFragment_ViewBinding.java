package com.scb.phone.view.fragment.calendarlanding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CalendarFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CalendarFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public CalendarFragment_ViewBinding(final CalendarFragment calendarFragment, View view) {
        super(calendarFragment, view);
        this.IconCompatParcelizer = calendarFragment;
        calendarFragment.calendarView = (MaterialCalendarView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.calendar_landing_view, "field 'calendarView'", MaterialCalendarView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.left_arrow_image_view, "field 'leftArrowImageView' and method 'onPreviousMonthArrowClicked'");
        calendarFragment.leftArrowImageView = (ImageView) onStart.write(IconCompatParcelizer2, R.id.left_arrow_image_view, "field 'leftArrowImageView'", ImageView.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CalendarFragment.this.onPreviousMonthArrowClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.right_arrow_image_view, "field 'rightArrowImageView' and method 'onNextMonthArrowClicked'");
        calendarFragment.rightArrowImageView = (ImageView) onStart.write(IconCompatParcelizer3, R.id.right_arrow_image_view, "field 'rightArrowImageView'", ImageView.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CalendarFragment.this.onNextMonthArrowClicked();
            }
        });
        calendarFragment.monthYear = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.month_year_text_view, "field 'monthYear'", TextView.class);
    }

    public final void read() {
        CalendarFragment calendarFragment = this.IconCompatParcelizer;
        if (calendarFragment != null) {
            this.IconCompatParcelizer = null;
            calendarFragment.calendarView = null;
            calendarFragment.leftArrowImageView = null;
            calendarFragment.rightArrowImageView = null;
            calendarFragment.monthYear = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
