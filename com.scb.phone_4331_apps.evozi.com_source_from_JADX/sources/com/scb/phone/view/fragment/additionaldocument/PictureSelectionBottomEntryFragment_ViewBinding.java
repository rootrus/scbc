package com.scb.phone.view.fragment.additionaldocument;

import android.view.View;
import android.widget.LinearLayout;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class PictureSelectionBottomEntryFragment_ViewBinding implements Unbinder {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private PictureSelectionBottomEntryFragment write;

    public PictureSelectionBottomEntryFragment_ViewBinding(final PictureSelectionBottomEntryFragment pictureSelectionBottomEntryFragment, View view) {
        this.write = pictureSelectionBottomEntryFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.ll_layout_select_take_photo, "field 'linearLayoutSelectPhoto' and method 'takePicture'");
        pictureSelectionBottomEntryFragment.linearLayoutSelectPhoto = (LinearLayout) onStart.write(IconCompatParcelizer2, R.id.ll_layout_select_take_photo, "field 'linearLayoutSelectPhoto'", LinearLayout.class);
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PictureSelectionBottomEntryFragment.this.takePicture();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.ll_layout_select_choose_from_gallery, "field 'linearLayoutSelectGallery' and method 'chooseFromGallery'");
        pictureSelectionBottomEntryFragment.linearLayoutSelectGallery = (LinearLayout) onStart.write(IconCompatParcelizer3, R.id.ll_layout_select_choose_from_gallery, "field 'linearLayoutSelectGallery'", LinearLayout.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PictureSelectionBottomEntryFragment.this.chooseFromGallery();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.ll_layout_select_choose_from_file, "field 'linearLayoutSelectFromFile' and method 'chooseFromPdfFile'");
        pictureSelectionBottomEntryFragment.linearLayoutSelectFromFile = (LinearLayout) onStart.write(IconCompatParcelizer4, R.id.ll_layout_select_choose_from_file, "field 'linearLayoutSelectFromFile'", LinearLayout.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PictureSelectionBottomEntryFragment.this.chooseFromPdfFile();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.ll_layout_select_cancel, "field 'linearLayoutSelectCancel' and method 'cancel'");
        pictureSelectionBottomEntryFragment.linearLayoutSelectCancel = (LinearLayout) onStart.write(IconCompatParcelizer5, R.id.ll_layout_select_cancel, "field 'linearLayoutSelectCancel'", LinearLayout.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PictureSelectionBottomEntryFragment.this.cancel();
            }
        });
    }

    public final void read() {
        PictureSelectionBottomEntryFragment pictureSelectionBottomEntryFragment = this.write;
        if (pictureSelectionBottomEntryFragment != null) {
            this.write = null;
            pictureSelectionBottomEntryFragment.linearLayoutSelectPhoto = null;
            pictureSelectionBottomEntryFragment.linearLayoutSelectGallery = null;
            pictureSelectionBottomEntryFragment.linearLayoutSelectFromFile = null;
            pictureSelectionBottomEntryFragment.linearLayoutSelectCancel = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
