package com.thunderhead.adminscreens;

import android.os.Bundle;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import p040o.C6554xc460715d;
import p040o.C6829x6026a3c7;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;

public class CreateTrackingCapturePointSuccessFragment extends Fragment {
    private AppCompatTextView IconCompatParcelizer;
    private AppCompatTextView MediaBrowserCompat$CustomActionResultReceiver;
    Spanned MediaBrowserCompat$ItemReceiver;
    private AppCompatButton read;
    String write;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C6554xc460715d.th_layout_admin_crud_success, (ViewGroup) null);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.MediaBrowserCompat$CustomActionResultReceiver = (AppCompatTextView) view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.title_text);
        this.IconCompatParcelizer = (AppCompatTextView) view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.message_text);
        AppCompatButton appCompatButton = (AppCompatButton) view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.close_button);
        this.read = appCompatButton;
        appCompatButton.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                CreateTrackingCapturePointSuccessFragment.this.getActivity().finish();
                FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver(C6829x6026a3c7.IconCompatParcelizer);
            }
        });
        this.MediaBrowserCompat$CustomActionResultReceiver.setText(this.write);
        this.IconCompatParcelizer.setText(this.MediaBrowserCompat$ItemReceiver);
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (z) {
            return AnimationUtils.makeInAnimation(getActivity(), false);
        }
        return AnimationUtils.makeOutAnimation(getActivity(), true);
    }
}
