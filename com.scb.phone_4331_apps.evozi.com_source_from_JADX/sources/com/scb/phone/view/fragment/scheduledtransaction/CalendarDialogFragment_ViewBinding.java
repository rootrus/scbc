package com.scb.phone.view.fragment.scheduledtransaction;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.prolificinteractive.materialcalendarview.MaterialCalendarView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CalendarDialogFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private CalendarDialogFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$SearchResultReceiver;
    private View write;

    public CalendarDialogFragment_ViewBinding(final CalendarDialogFragment calendarDialogFragment, View view) {
        super(calendarDialogFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = calendarDialogFragment;
        calendarDialogFragment.titleDialog = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_dialog_text_view, "field 'titleDialog'", TextView.class);
        calendarDialogFragment.startEndHeader = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.start_end_header, "field 'startEndHeader'", LinearLayout.class);
        calendarDialogFragment.startDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.start_date_text_view, "field 'startDate'", TextView.class);
        calendarDialogFragment.endDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.end_date_text_view, "field 'endDate'", TextView.class);
        calendarDialogFragment.divider = onStart.IconCompatParcelizer(view, R.id.divider_view, "field 'divider'");
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.left_arrow_image_view, "field 'leftArrow' and method 'onPreviousMonthArrowClicked'");
        calendarDialogFragment.leftArrow = (ImageView) onStart.write(IconCompatParcelizer2, R.id.left_arrow_image_view, "field 'leftArrow'", ImageView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CalendarDialogFragment.this.onPreviousMonthArrowClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.right_arrow_image_view, "field 'rightArrow' and method 'onNextMonthArrowClicked'");
        calendarDialogFragment.rightArrow = (ImageView) onStart.write(IconCompatParcelizer3, R.id.right_arrow_image_view, "field 'rightArrow'", ImageView.class);
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CalendarDialogFragment.this.onNextMonthArrowClicked();
            }
        });
        calendarDialogFragment.monthYear = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.month_year_text_view, "field 'monthYear'", TextView.class);
        calendarDialogFragment.calendar = (MaterialCalendarView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.calendar_view, "field 'calendar'", MaterialCalendarView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.ok_button, "field 'okButton' and method 'onOkButtonClicked'");
        calendarDialogFragment.okButton = (DefaultButton) onStart.write(IconCompatParcelizer4, R.id.ok_button, "field 'okButton'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CalendarDialogFragment.this.onOkButtonClicked();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.item_back_icon_relative_layout, "method 'onCloseClicked'");
        this.write = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CalendarDialogFragment.this.onCloseClicked();
            }
        });
    }

    public final void read() {
        CalendarDialogFragment calendarDialogFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (calendarDialogFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            calendarDialogFragment.titleDialog = null;
            calendarDialogFragment.startEndHeader = null;
            calendarDialogFragment.startDate = null;
            calendarDialogFragment.endDate = null;
            calendarDialogFragment.divider = null;
            calendarDialogFragment.leftArrow = null;
            calendarDialogFragment.rightArrow = null;
            calendarDialogFragment.monthYear = null;
            calendarDialogFragment.calendar = null;
            calendarDialogFragment.okButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
