package com.scb.phone.view.fragment.registration.onboarding;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.BaseFragment;
import dagger.Lazy;
import p040o.ActivityBuilder_ContributeNationalIdActivity;
import p040o.ActivityBuilder_ContributeNdidIdpVerifyIdentityActivity;
import p040o.ActivityBuilder_ContributeNdidSelectIdpActivity;
import p040o.ActivityBuilder_ContributeNsipPartnerPaymentReviewActivity;
import p040o.AlertController$RecycleListView;
import p040o.C1246xea60bf60;
import p040o.C4951mE;
import p040o.C4952mJ;
import p040o.C4953mK;
import p040o.FragmentBuilder_BindContactInfoFragment;
import p040o.HmlPinActivity;
import p040o.JobService;
import p040o.KtaJsonCheck_MembersInjector;
import p040o.OnDeviceExtractionServer;
import p040o.PlaybackStateCompat;
import p040o.RttiJsonCheck_MembersInjector;
import p040o.createJobWithJsonDocuments;
import p040o.exceptionType;
import p040o.getFaceBottomPadding;
import p040o.getKernelIDDstOver;
import p040o.updateJsonDocuments;

public class RegistrationFingerprintFragment extends BaseFragment implements getFaceBottomPadding {
    public getKernelIDDstOver IconCompatParcelizer = new getKernelIDDstOver();
    public Dialog MediaBrowserCompat$CustomActionResultReceiver = null;
    private FragmentBuilder_BindContactInfoFragment MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public RttiJsonCheck_MembersInjector MediaMetadataCompat;
    @HmlPinActivity
    public Lazy<RttiJsonCheck_MembersInjector> biometricManagerLazy;
    @BindView
    Button leftButton;
    @HmlPinActivity
    public OnDeviceExtractionServer.C37082 presenter;
    @BindView
    Button rightButton;

    public static RegistrationFingerprintFragment MediaBrowserCompat$SearchResultReceiver() {
        Bundle bundle = new Bundle();
        RegistrationFingerprintFragment registrationFingerprintFragment = new RegistrationFingerprintFragment();
        registrationFingerprintFragment.setArguments(bundle);
        return registrationFingerprintFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindContactInfoFragment) {
            this.MediaDescriptionCompat = (FragmentBuilder_BindContactInfoFragment) context;
        }
    }

    public void onResume() {
        super.onResume();
        OnDeviceExtractionServer.C37082 r0 = this.presenter;
        updateJsonDocuments updatejsondocuments = updateJsonDocuments.MediaBrowserCompat$ItemReceiver;
        if (r0.RatingCompat != null) {
            updatejsondocuments.IconCompatParcelizer(r0.RatingCompat);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89322131494159, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.rightButton.setOnClickListener(new ActivityBuilder_ContributeNsipPartnerPaymentReviewActivity(this));
        this.leftButton.setOnClickListener(new ActivityBuilder_ContributeNdidSelectIdpActivity(this));
        getKernelIDDstOver getkerneliddstover = this.IconCompatParcelizer;
        if (getActivity() != null) {
            getkerneliddstover.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "registration_set_fingerprint");
        }
        return inflate;
    }

    public final void read() {
        Dialog dialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (dialog != null) {
            dialog.dismiss();
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
    }

    public final void RatingCompat() {
        if (Build.VERSION.SDK_INT >= 23) {
            RttiJsonCheck_MembersInjector rttiJsonCheck_MembersInjector = this.biometricManagerLazy.get();
            this.MediaMetadataCompat = rttiJsonCheck_MembersInjector;
            if (rttiJsonCheck_MembersInjector.write()) {
                this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(new KtaJsonCheck_MembersInjector() {
                    public final void IconCompatParcelizer() {
                    }

                    public final void MediaDescriptionCompat() {
                        if (RegistrationFingerprintFragment.this.getContext() != null) {
                            OnDeviceExtractionServer.C37082 r0 = RegistrationFingerprintFragment.this.presenter;
                            boolean z = true;
                            r0.write.read.write(true);
                            C4952mJ mJVar = C4952mJ.IconCompatParcelizer;
                            if (r0.RatingCompat != null) {
                                mJVar.IconCompatParcelizer(r0.RatingCompat);
                            }
                            exceptionType exceptiontype = exceptionType.IconCompatParcelizer;
                            if (r0.RatingCompat == null) {
                                z = false;
                            }
                            if (z) {
                                exceptiontype.IconCompatParcelizer(r0.RatingCompat);
                            }
                        }
                    }

                    public final void MediaBrowserCompat$ItemReceiver() {
                        OnDeviceExtractionServer.C37082 r0 = RegistrationFingerprintFragment.this.presenter;
                        JobService jobService = JobService.write;
                        if (r0.RatingCompat != null) {
                            jobService.IconCompatParcelizer(r0.RatingCompat);
                        }
                    }

                    public final void write() {
                        OnDeviceExtractionServer.C37082 r0 = RegistrationFingerprintFragment.this.presenter;
                        C4953mK mKVar = C4953mK.write;
                        if (r0.RatingCompat != null) {
                            mKVar.IconCompatParcelizer(r0.RatingCompat);
                        }
                    }

                    public final void read() {
                        RegistrationFingerprintFragment.this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver();
                        OnDeviceExtractionServer.C37082 r0 = RegistrationFingerprintFragment.this.presenter;
                        JobService jobService = JobService.write;
                        if (r0.RatingCompat != null) {
                            jobService.IconCompatParcelizer(r0.RatingCompat);
                        }
                    }

                    public final void MediaBrowserCompat$CustomActionResultReceiver() {
                        RegistrationFingerprintFragment registrationFingerprintFragment = RegistrationFingerprintFragment.this;
                        ActivityBuilder_ContributeNationalIdActivity activityBuilder_ContributeNationalIdActivity = new ActivityBuilder_ContributeNationalIdActivity(registrationFingerprintFragment);
                        StringBuilder sb = new StringBuilder();
                        sb.append(registrationFingerprintFragment.getString(R.string.fingerprint_dialog_title));
                        sb.append(" \"");
                        sb.append(registrationFingerprintFragment.getString(R.string.app_name));
                        sb.append("\"");
                        String obj = sb.toString();
                        Dialog dialog = registrationFingerprintFragment.MediaBrowserCompat$CustomActionResultReceiver;
                        if (dialog != null) {
                            dialog.dismiss();
                            registrationFingerprintFragment.MediaBrowserCompat$CustomActionResultReceiver = null;
                        }
                        if (registrationFingerprintFragment.getActivity() != null) {
                            View inflate = registrationFingerprintFragment.getLayoutInflater().inflate(R.layout.f85352131493762, (ViewGroup) null);
                            ((TextView) inflate.findViewById(R.id.tv_fp_title)).setText(obj);
                            ((Button) inflate.findViewById(R.id.btn_fp_cancel)).setOnClickListener(new ActivityBuilder_ContributeNdidIdpVerifyIdentityActivity(activityBuilder_ContributeNationalIdActivity));
                            C1246xea60bf60 playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver = new C1246xea60bf60(registrationFingerprintFragment.getActivity());
                            playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.write = true;
                            playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.MediaSessionCompat$QueueItem = inflate;
                            PlaybackStateCompat.CustomAction write = playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.write();
                            registrationFingerprintFragment.MediaBrowserCompat$CustomActionResultReceiver = write;
                            write.show();
                        }
                    }
                });
                return;
            }
            OnDeviceExtractionServer.C37082 r0 = this.presenter;
            createJobWithJsonDocuments createjobwithjsondocuments = createJobWithJsonDocuments.read;
            if (r0.RatingCompat != null) {
                createjobwithjsondocuments.IconCompatParcelizer(r0.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        RttiJsonCheck_MembersInjector rttiJsonCheck_MembersInjector = this.MediaMetadataCompat;
        if (rttiJsonCheck_MembersInjector != null) {
            rttiJsonCheck_MembersInjector.IconCompatParcelizer();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentBuilder_BindContactInfoFragment fragmentBuilder_BindContactInfoFragment = this.MediaDescriptionCompat;
        if (fragmentBuilder_BindContactInfoFragment != null) {
            fragmentBuilder_BindContactInfoFragment.IconCompatParcelizer("RegistrationFingerprintFragment");
        }
    }

    public final void IconCompatParcelizer() {
        Dialog dialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (dialog != null && !dialog.isShowing()) {
            OnDeviceExtractionServer.C37082 r0 = this.presenter;
            C4951mE mEVar = C4951mE.MediaBrowserCompat$ItemReceiver;
            if (r0.RatingCompat != null) {
                mEVar.IconCompatParcelizer(r0.RatingCompat);
            }
        }
    }

    public final void write() {
        Dialog dialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (dialog != null) {
            dialog.dismiss();
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
        }
        if (getActivity() != null) {
            AlertController$RecycleListView.write((Activity) getActivity(), (int) R.id.root, (int) R.drawable.ic_check_circle_white_24dp, getString(R.string.fingerprint_setting_error), (int) R.color.f66062131099761);
        }
    }
}
