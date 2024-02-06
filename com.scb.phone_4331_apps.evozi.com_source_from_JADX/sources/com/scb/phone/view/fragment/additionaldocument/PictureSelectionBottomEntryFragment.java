package com.scb.phone.view.fragment.additionaldocument;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.Set;
import p040o.createBinaryImageJson;

public class PictureSelectionBottomEntryFragment extends BottomSheetDialogFragment {
    private C5852xbeaee965 MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    LinearLayout linearLayoutSelectCancel;
    @BindView
    LinearLayout linearLayoutSelectFromFile;
    @BindView
    LinearLayout linearLayoutSelectGallery;
    @BindView
    LinearLayout linearLayoutSelectPhoto;

    public static PictureSelectionBottomEntryFragment MediaBrowserCompat$CustomActionResultReceiver(Set<createBinaryImageJson> set) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("UPLOAD_METHODS", new ArrayList(set));
        PictureSelectionBottomEntryFragment pictureSelectionBottomEntryFragment = new PictureSelectionBottomEntryFragment();
        pictureSelectionBottomEntryFragment.setArguments(bundle);
        return pictureSelectionBottomEntryFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85372131493764, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            ArrayList parcelableArrayList = arguments.getParcelableArrayList("UPLOAD_METHODS");
            int i = 0;
            this.linearLayoutSelectPhoto.setVisibility((parcelableArrayList == null || !parcelableArrayList.contains(createBinaryImageJson.TAKE_PHOTO)) ? 8 : 0);
            this.linearLayoutSelectGallery.setVisibility((parcelableArrayList == null || !parcelableArrayList.contains(createBinaryImageJson.UPLOAD_PHOTO)) ? 8 : 0);
            this.linearLayoutSelectFromFile.setVisibility((parcelableArrayList == null || !parcelableArrayList.contains(createBinaryImageJson.UPLOAD_PDF)) ? 8 : 0);
            LinearLayout linearLayout = this.linearLayoutSelectCancel;
            createBinaryImageJson createbinaryimagejson = createBinaryImageJson.CANCEL;
            if (parcelableArrayList == null || !parcelableArrayList.contains(createbinaryimagejson)) {
                i = 8;
            }
            linearLayout.setVisibility(i);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C5852xbeaee965) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (C5852xbeaee965) context;
        } else if (getParentFragment() instanceof C5852xbeaee965) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (C5852xbeaee965) getParentFragment();
        } else {
            throw new IllegalStateException("This context needs to implement the OnEntrySelectionListener contract");
        }
    }

    public void onDetach() {
        this.MediaBrowserCompat$CustomActionResultReceiver = null;
        super.onDetach();
    }

    @OnClick
    public void takePicture() {
        C5852xbeaee965 pictureSelectionBottomEntryFragment$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (pictureSelectionBottomEntryFragment$MediaBrowserCompat$ItemReceiver != null) {
            pictureSelectionBottomEntryFragment$MediaBrowserCompat$ItemReceiver.AppCompatActivity();
        }
    }

    @OnClick
    public void chooseFromGallery() {
        C5852xbeaee965 pictureSelectionBottomEntryFragment$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (pictureSelectionBottomEntryFragment$MediaBrowserCompat$ItemReceiver != null) {
            pictureSelectionBottomEntryFragment$MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView();
        }
    }

    @OnClick
    public void chooseFromPdfFile() {
        C5852xbeaee965 pictureSelectionBottomEntryFragment$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (pictureSelectionBottomEntryFragment$MediaBrowserCompat$ItemReceiver != null) {
            pictureSelectionBottomEntryFragment$MediaBrowserCompat$ItemReceiver.setContentView();
        }
    }

    @OnClick
    public void cancel() {
        dismiss();
    }
}
