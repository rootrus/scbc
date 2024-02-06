package com.scb.phone.view.fragment.ntb.fatca;

import android.view.View;
import androidx.appcompat.widget.AppCompatButton;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FatcaQuestionnaireFragment_ViewBinding extends BaseFragment_ViewBinding {
    private FatcaQuestionnaireFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public FatcaQuestionnaireFragment_ViewBinding(final FatcaQuestionnaireFragment fatcaQuestionnaireFragment, View view) {
        super(fatcaQuestionnaireFragment, view);
        this.MediaBrowserCompat$ItemReceiver = fatcaQuestionnaireFragment;
        fatcaQuestionnaireFragment.questionRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view_question, "field 'questionRecyclerView'", RecyclerView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.submit_button, "field 'submitButton' and method 'onSubmitButtonClick'");
        fatcaQuestionnaireFragment.submitButton = (AppCompatButton) onStart.write(IconCompatParcelizer, R.id.submit_button, "field 'submitButton'", AppCompatButton.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FatcaQuestionnaireFragment.this.onSubmitButtonClick();
            }
        });
    }

    public final void read() {
        FatcaQuestionnaireFragment fatcaQuestionnaireFragment = this.MediaBrowserCompat$ItemReceiver;
        if (fatcaQuestionnaireFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            fatcaQuestionnaireFragment.questionRecyclerView = null;
            fatcaQuestionnaireFragment.submitButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
