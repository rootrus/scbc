package com.scb.phone.view.fragment.ntb.fillinformation;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FillInformationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private FillInformationFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public FillInformationFragment_ViewBinding(final FillInformationFragment fillInformationFragment, View view) {
        super(fillInformationFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = fillInformationFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.spinner_title, "field 'spinnerTitle' and method 'onSpinnerTouch'");
        fillInformationFragment.spinnerTitle = (Spinner) onStart.write(IconCompatParcelizer, R.id.spinner_title, "field 'spinnerTitle'", Spinner.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return FillInformationFragment.this.onSpinnerTouch(view, motionEvent);
            }
        });
        fillInformationFragment.textFirstName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_first_name, "field 'textFirstName'", TextView.class);
        fillInformationFragment.textMiddleName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_middle_name, "field 'textMiddleName'", TextView.class);
        fillInformationFragment.lbMiddleName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.label_middle_name, "field 'lbMiddleName'", TextView.class);
        fillInformationFragment.textLastName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_last_name, "field 'textLastName'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'buttonNext' and method 'onNextButtonClick'");
        fillInformationFragment.buttonNext = (Button) onStart.write(IconCompatParcelizer2, R.id.button_next, "field 'buttonNext'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FillInformationFragment.this.onNextButtonClick(view);
            }
        });
    }

    public final void read() {
        FillInformationFragment fillInformationFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fillInformationFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            fillInformationFragment.spinnerTitle = null;
            fillInformationFragment.textFirstName = null;
            fillInformationFragment.textMiddleName = null;
            fillInformationFragment.lbMiddleName = null;
            fillInformationFragment.textLastName = null;
            fillInformationFragment.buttonNext = null;
            this.write.setOnTouchListener((View.OnTouchListener) null);
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
