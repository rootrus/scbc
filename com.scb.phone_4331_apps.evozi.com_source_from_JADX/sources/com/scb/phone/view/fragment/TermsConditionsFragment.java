package com.scb.phone.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.webview.SCBWebView;
import p040o.FragmentBuilder_BindCreditLimitFragment;
import p040o.HmlPinActivity;
import p040o.access$2300;
import p040o.computeRawVarint64Size;
import p040o.computeSInt32Size;
import p040o.computeTagSize;
import p040o.computeUInt32Size;
import p040o.getIdManager;
import p040o.getSessionOSSize;
import p040o.getTopEdgeTearWidth;
import p040o.onCheckBoxClick;
import p040o.refreshBuffer;
import p040o.writeRawVarint32;

public class TermsConditionsFragment extends BaseFragment implements getTopEdgeTearWidth {
    private FragmentBuilder_BindCreditLimitFragment IconCompatParcelizer;
    @BindView
    Button buttonAccept;
    @BindView
    Button buttonDecline;
    @BindView
    LinearLayout buttonsLayout;
    @HmlPinActivity
    public getSessionOSSize presenter;
    @BindView
    SCBWebView webView;

    /* access modifiers changed from: protected */
    public String IconCompatParcelizer() {
        return "css/consent_style.css";
    }

    public static Fragment IconCompatParcelizer(getIdManager getidmanager) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("EASYCASH_TERMS_CONDITIONS", getidmanager);
        TermsConditionsFragment termsConditionsFragment = new TermsConditionsFragment();
        termsConditionsFragment.setArguments(bundle);
        return termsConditionsFragment;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f85442131493771, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (!(getArguments() == null || getArguments().getParcelable("EASYCASH_TERMS_CONDITIONS") == null)) {
            getIdManager getidmanager = (getIdManager) getArguments().getParcelable("EASYCASH_TERMS_CONDITIONS");
            getSessionOSSize getsessionossize = this.presenter;
            if (getidmanager == null || getidmanager.MediaBrowserCompat$CustomActionResultReceiver == null) {
                writeRawVarint32 writerawvarint32 = writeRawVarint32.write;
                if (getsessionossize.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    writerawvarint32.IconCompatParcelizer(getsessionossize.RatingCompat);
                }
            } else {
                if (getidmanager.MediaDescriptionCompat != null) {
                    getsessionossize.read = getidmanager.MediaDescriptionCompat;
                }
                computeRawVarint64Size computerawvarint64size = new computeRawVarint64Size(getidmanager);
                if (getsessionossize.RatingCompat != null) {
                    computerawvarint64size.IconCompatParcelizer(getsessionossize.RatingCompat);
                }
                computeUInt32Size computeuint32size = new computeUInt32Size(getidmanager);
                if (getsessionossize.RatingCompat != null) {
                    computeuint32size.IconCompatParcelizer(getsessionossize.RatingCompat);
                }
                if (getidmanager.write && getidmanager.MediaBrowserCompat$ItemReceiver) {
                    computeSInt32Size computesint32size = new computeSInt32Size(getidmanager);
                    if (getsessionossize.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        computesint32size.IconCompatParcelizer(getsessionossize.RatingCompat);
                    }
                }
            }
        }
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.presenter.MediaBrowserCompat$ItemReceiver(R.string.error_generic_resource, access$2300.write.NAVIGATE_BACK);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCreditLimitFragment) {
            this.IconCompatParcelizer = (FragmentBuilder_BindCreditLimitFragment) context;
        } else {
            onCheckBoxClick.write("LoanTermsCond").write(new ClassCastException("context isn't instanceof TermsConditionsCallback"), "onAttach: ", new Object[0]);
        }
    }

    public final void read() {
        FragmentBuilder_BindCreditLimitFragment fragmentBuilder_BindCreditLimitFragment = this.IconCompatParcelizer;
        if (fragmentBuilder_BindCreditLimitFragment != null) {
            fragmentBuilder_BindCreditLimitFragment.MediaSessionCompat$QueueItem();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        FragmentBuilder_BindCreditLimitFragment fragmentBuilder_BindCreditLimitFragment = this.IconCompatParcelizer;
        if (fragmentBuilder_BindCreditLimitFragment != null) {
            fragmentBuilder_BindCreditLimitFragment.MediaSessionCompat$ResultReceiverWrapper();
        }
    }

    public final void write(boolean z) {
        this.buttonsLayout.setVisibility(z ? 0 : 8);
    }

    @OnClick
    public void acceptTermsConditions() {
        getSessionOSSize getsessionossize = this.presenter;
        boolean z = true;
        if (getsessionossize.read != null) {
            refreshBuffer refreshbuffer = new refreshBuffer(getsessionossize);
            if (getsessionossize.RatingCompat == null) {
                z = false;
            }
            if (z) {
                refreshbuffer.IconCompatParcelizer(getsessionossize.RatingCompat);
                return;
            }
            return;
        }
        writeRawVarint32 writerawvarint32 = writeRawVarint32.write;
        if (getsessionossize.RatingCompat == null) {
            z = false;
        }
        if (z) {
            writerawvarint32.IconCompatParcelizer(getsessionossize.RatingCompat);
        }
    }

    @OnClick
    public void declineTermsConditions() {
        getSessionOSSize getsessionossize = this.presenter;
        boolean z = true;
        if (getsessionossize.read != null) {
            computeTagSize computetagsize = new computeTagSize(getsessionossize);
            if (getsessionossize.RatingCompat == null) {
                z = false;
            }
            if (z) {
                computetagsize.IconCompatParcelizer(getsessionossize.RatingCompat);
                return;
            }
            return;
        }
        writeRawVarint32 writerawvarint32 = writeRawVarint32.write;
        if (getsessionossize.RatingCompat == null) {
            z = false;
        }
        if (z) {
            writerawvarint32.IconCompatParcelizer(getsessionossize.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(getIdManager getidmanager) {
        this.buttonAccept.setText(getidmanager.read);
        this.buttonDecline.setText(getidmanager.IconCompatParcelizer);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.presenter.onDestroy();
    }

    public final void write(getIdManager getidmanager) {
        String str = getidmanager.MediaBrowserCompat$CustomActionResultReceiver;
        this.webView.setWebViewBackgroundColor(R.color.f70982131100254);
        this.webView.write(str, IconCompatParcelizer());
    }
}
