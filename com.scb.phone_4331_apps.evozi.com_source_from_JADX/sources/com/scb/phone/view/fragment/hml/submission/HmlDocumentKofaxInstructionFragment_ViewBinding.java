package com.scb.phone.view.fragment.hml.submission;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlDocumentKofaxInstructionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlDocumentKofaxInstructionFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public HmlDocumentKofaxInstructionFragment_ViewBinding(final HmlDocumentKofaxInstructionFragment hmlDocumentKofaxInstructionFragment, View view) {
        super(hmlDocumentKofaxInstructionFragment, view);
        this.IconCompatParcelizer = hmlDocumentKofaxInstructionFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.iv_instruction_video, "field 'instructionVideoImage' and method 'onVideoImageClicked'");
        hmlDocumentKofaxInstructionFragment.instructionVideoImage = (ImageView) onStart.write(IconCompatParcelizer2, R.id.iv_instruction_video, "field 'instructionVideoImage'", ImageView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlDocumentKofaxInstructionFragment.this.onVideoImageClicked();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.button_next, "field 'nextButton' and method 'onNextButtonClicked'");
        hmlDocumentKofaxInstructionFragment.nextButton = (Button) onStart.write(IconCompatParcelizer3, R.id.button_next, "field 'nextButton'", Button.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlDocumentKofaxInstructionFragment.this.onNextButtonClicked();
            }
        });
    }

    public final void read() {
        HmlDocumentKofaxInstructionFragment hmlDocumentKofaxInstructionFragment = this.IconCompatParcelizer;
        if (hmlDocumentKofaxInstructionFragment != null) {
            this.IconCompatParcelizer = null;
            hmlDocumentKofaxInstructionFragment.instructionVideoImage = null;
            hmlDocumentKofaxInstructionFragment.nextButton = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
