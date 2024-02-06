package com.scb.phone.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.custom.webview.SCBWebView;
import com.thunderhead.android.aspects.WebViewAsp;
import kotlin.TypeCastException;
import okhttp3.Response;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.FragmentBuilder_BindEBillSubscriptionFragment;
import p040o.FragmentBuilder_BindEasycashLandingFragment;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.access$2300;
import p040o.getRightEdgeTearHeight;
import p040o.getSessionDeviceSize;
import p040o.getSessionDeviceSize$MediaBrowserCompat$MediaItem;
import p040o.getSessionDeviceSize$MediaBrowserCompat$SearchResultReceiver;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;

public final class TermsAndConditionsFragment extends BaseFragment implements getRightEdgeTearHeight, FragmentBuilder_BindEBillSubscriptionFragment {
    public static final write IconCompatParcelizer = new write((byte) 0);
    private Button MediaBrowserCompat$CustomActionResultReceiver;
    private Button MediaBrowserCompat$MediaItem;
    private FragmentBuilder_BindCustomizeYourPageFragment MediaBrowserCompat$SearchResultReceiver;
    private LinearLayout MediaDescriptionCompat;
    private SCBWebView MediaMetadataCompat;
    /* access modifiers changed from: private */
    public Response RatingCompat;
    @HmlPinActivity
    public getSessionDeviceSize presenter;

    public static final TermsAndConditionsFragment read(immediateFailedFuture immediatefailedfuture) {
        return write.MediaBrowserCompat$CustomActionResultReceiver(immediatefailedfuture);
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }

        public static TermsAndConditionsFragment MediaBrowserCompat$CustomActionResultReceiver(immediateFailedFuture immediatefailedfuture) {
            onGetStartedClick.write((Object) immediatefailedfuture, "termsAndConsInfoDisplay");
            Bundle bundle = new Bundle();
            bundle.putParcelable("EASYCASH_TERMS_CONDITIONS", immediatefailedfuture);
            TermsAndConditionsFragment termsAndConditionsFragment = new TermsAndConditionsFragment();
            termsAndConditionsFragment.setArguments(bundle);
            return termsAndConditionsFragment;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f85442131493771, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        immediateFailedFuture immediatefailedfuture;
        boolean z;
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(R.id.button_accept);
        onGetStartedClick.IconCompatParcelizer((Object) findViewById, "view.findViewById(R.id.button_accept)");
        this.MediaBrowserCompat$CustomActionResultReceiver = (Button) findViewById;
        View findViewById2 = view.findViewById(R.id.button_decline);
        onGetStartedClick.IconCompatParcelizer((Object) findViewById2, "view.findViewById(R.id.button_decline)");
        this.MediaBrowserCompat$MediaItem = (Button) findViewById2;
        View findViewById3 = view.findViewById(R.id.bottom_buttons);
        onGetStartedClick.IconCompatParcelizer((Object) findViewById3, "view.findViewById(R.id.bottom_buttons)");
        this.MediaDescriptionCompat = (LinearLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.webview);
        onGetStartedClick.IconCompatParcelizer((Object) findViewById4, "view.findViewById(R.id.webview)");
        this.MediaMetadataCompat = (SCBWebView) findViewById4;
        Button button = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonAccept");
        }
        button.setOnClickListener(new IconCompatParcelizer(this));
        Button button2 = this.MediaBrowserCompat$MediaItem;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonDecline");
        }
        button2.setOnClickListener(new TermsAndConditionsFragment$MediaBrowserCompat$ItemReceiver(this));
        Button button3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (button3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonAccept");
        }
        button3.setText(R.string.accept_radio);
        Button button4 = this.MediaBrowserCompat$MediaItem;
        if (button4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonDecline");
        }
        button4.setText(R.string.decline_radio);
        getSessionDeviceSize getsessiondevicesize = this.presenter;
        if (getsessiondevicesize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getsessiondevicesize.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null && (immediatefailedfuture = (immediateFailedFuture) arguments.getParcelable("EASYCASH_TERMS_CONDITIONS")) != null) {
            getSessionDeviceSize getsessiondevicesize2 = this.presenter;
            if (getsessiondevicesize2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            boolean z2 = true;
            if (immediatefailedfuture == null) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getSessionDeviceSize.IconCompatParcelizer.write;
                if (getsessiondevicesize2.RatingCompat == null) {
                    z2 = false;
                }
                if (z2) {
                    iconCompatParcelizer.IconCompatParcelizer(getsessiondevicesize2.RatingCompat);
                }
            } else if (immediatefailedfuture.MediaDescriptionCompat == null && immediatefailedfuture.MediaMetadataCompat == null && immediatefailedfuture.write == null) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = getSessionDeviceSize.MediaDescriptionCompat.write;
                if (getsessiondevicesize2.RatingCompat == null) {
                    z2 = false;
                }
                if (z2) {
                    iconCompatParcelizer2.IconCompatParcelizer(getsessiondevicesize2.RatingCompat);
                }
            } else {
                String str = immediatefailedfuture.MediaDescriptionCompat;
                if (str != null) {
                    if (str != null) {
                        if (GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str).toString().length() == 0) {
                            z = false;
                        } else {
                            CharSequence write2 = getsessiondevicesize2.write(str);
                            z = !(write2 == null || write2.length() == 0);
                        }
                        if (!z) {
                            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer3 = getSessionDeviceSize$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver;
                            if (getsessiondevicesize2.RatingCompat == null) {
                                z2 = false;
                            }
                            if (z2) {
                                iconCompatParcelizer3.IconCompatParcelizer(getsessiondevicesize2.RatingCompat);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                }
                getsessiondevicesize2.IconCompatParcelizer = immediatefailedfuture;
                writeUInt64NoTag.IconCompatParcelizer getsessiondevicesize_mediabrowsercompat_mediaitem = new getSessionDeviceSize$MediaBrowserCompat$MediaItem(getsessiondevicesize2);
                if (getsessiondevicesize2.RatingCompat == null) {
                    z2 = false;
                }
                if (z2) {
                    getsessiondevicesize_mediabrowsercompat_mediaitem.IconCompatParcelizer(getsessiondevicesize2.RatingCompat);
                }
            }
        }
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ TermsAndConditionsFragment read;

        IconCompatParcelizer(TermsAndConditionsFragment termsAndConditionsFragment) {
            this.read = termsAndConditionsFragment;
        }

        public final void onClick(View view) {
            getSessionDeviceSize getsessiondevicesize = this.read.presenter;
            if (getsessiondevicesize == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer write = new getSessionDeviceSize.write(getsessiondevicesize);
            if (getsessiondevicesize.RatingCompat != null) {
                write.IconCompatParcelizer(getsessiondevicesize.RatingCompat);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onAttach(android.content.Context r3) {
        /*
            r2 = this;
            super.onAttach(r3)
            androidx.fragment.app.Fragment r0 = r2.getParentFragment()
            boolean r1 = r3 instanceof p040o.FragmentBuilder_BindCustomizeYourPageFragment
            if (r1 != 0) goto L_0x0012
            boolean r3 = r0 instanceof p040o.FragmentBuilder_BindCustomizeYourPageFragment
            if (r3 == 0) goto L_0x0011
            r3 = r0
            goto L_0x0012
        L_0x0011:
            r3 = 0
        L_0x0012:
            o.FragmentBuilder_BindCustomizeYourPageFragment r3 = (p040o.FragmentBuilder_BindCustomizeYourPageFragment) r3
            r2.MediaBrowserCompat$SearchResultReceiver = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.TermsAndConditionsFragment.onAttach(android.content.Context):void");
    }

    public final void onDetach() {
        this.MediaBrowserCompat$SearchResultReceiver = null;
        super.onDetach();
    }

    public final void write() {
        getSessionDeviceSize getsessiondevicesize = this.presenter;
        if (getsessiondevicesize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getsessiondevicesize.MediaBrowserCompat$ItemReceiver(R.string.error_generic_resource, access$2300.write.NAVIGATE_BACK);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "htmlData");
        AlertController$RecycleListView();
        C5845x5eaa0ec5 termsAndConditionsFragment$MediaBrowserCompat$CustomActionResultReceiver = new C5845x5eaa0ec5(this);
        SCBWebView sCBWebView = this.MediaMetadataCompat;
        if (sCBWebView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("webView");
        }
        sCBWebView.setWebViewBackgroundColor(R.color.f70982131100254);
        sCBWebView.setWebViewClient(termsAndConditionsFragment$MediaBrowserCompat$CustomActionResultReceiver);
        sCBWebView.setAdvanceWebView(new read());
        getSessionDeviceSize getsessiondevicesize = this.presenter;
        if (getsessiondevicesize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String MediaBrowserCompat$ItemReceiver = getsessiondevicesize.MediaBrowserCompat$ItemReceiver();
        getSessionDeviceSize getsessiondevicesize2 = this.presenter;
        if (getsessiondevicesize2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getsessiondevicesize2.write()) {
            sCBWebView.write(MediaBrowserCompat$ItemReceiver, "css/consent_style.css");
        } else if (MediaBrowserCompat$ItemReceiver != null) {
            WebViewAsp.aspectOf();
            SCBWebView.MediaBrowserCompat$ItemReceiver(sCBWebView, MediaBrowserCompat$ItemReceiver);
        }
    }

    public static final class read implements FragmentBuilder_BindEasycashLandingFragment {
        public final /* synthetic */ Integer ar_() {
            return null;
        }

        read() {
        }

        /* renamed from: O_ */
        public final Boolean mo14724O_() {
            return Boolean.TRUE;
        }
    }

    public final void IconCompatParcelizer(String str) {
        FragmentBuilder_BindCustomizeYourPageFragment fragmentBuilder_BindCustomizeYourPageFragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (fragmentBuilder_BindCustomizeYourPageFragment != null) {
            fragmentBuilder_BindCustomizeYourPageFragment.write(str);
        }
    }

    public final void write(String str) {
        FragmentBuilder_BindCustomizeYourPageFragment fragmentBuilder_BindCustomizeYourPageFragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (fragmentBuilder_BindCustomizeYourPageFragment != null) {
            fragmentBuilder_BindCustomizeYourPageFragment.IconCompatParcelizer(str);
        }
    }

    public final void read(boolean z) {
        LinearLayout linearLayout = this.MediaDescriptionCompat;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonsLayout");
        }
        View view = linearLayout;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(z ? 0 : 8);
    }

    public final void MediaBrowserCompat$ItemReceiver(immediateFailedFuture immediatefailedfuture) {
        onGetStartedClick.write((Object) immediatefailedfuture, "infoDisplay");
        Button button = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonAccept");
        }
        button.setText(immediatefailedfuture.MediaBrowserCompat$MediaItem);
        Button button2 = this.MediaBrowserCompat$MediaItem;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonDecline");
        }
        button2.setText(immediatefailedfuture.IconCompatParcelizer);
    }

    public final void onDestroyView() {
        Button button = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonAccept");
        }
        button.setOnClickListener((View.OnClickListener) null);
        Button button2 = this.MediaBrowserCompat$MediaItem;
        if (button2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonDecline");
        }
        button2.setOnClickListener((View.OnClickListener) null);
        super.onDestroyView();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        FragmentBuilder_BindCustomizeYourPageFragment fragmentBuilder_BindCustomizeYourPageFragment = this.MediaBrowserCompat$SearchResultReceiver;
        if (fragmentBuilder_BindCustomizeYourPageFragment != null) {
            fragmentBuilder_BindCustomizeYourPageFragment.setContentView();
        }
    }

    public final void MediaSessionCompat$QueueItem() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public static final /* synthetic */ void read(TermsAndConditionsFragment termsAndConditionsFragment, boolean z) {
        getSessionDeviceSize getsessiondevicesize = termsAndConditionsFragment.presenter;
        if (getsessiondevicesize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        immediateFailedFuture immediatefailedfuture = getsessiondevicesize.IconCompatParcelizer;
        if (immediatefailedfuture == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTermsAndConsInfoDisplay");
        }
        if (immediatefailedfuture.MediaBrowserCompat$ItemReceiver) {
            Button button = termsAndConditionsFragment.MediaBrowserCompat$CustomActionResultReceiver;
            if (button == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonAccept");
            }
            button.setEnabled(z);
            Button button2 = termsAndConditionsFragment.MediaBrowserCompat$MediaItem;
            if (button2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("buttonDecline");
            }
            button2.setEnabled(z);
        }
    }

    public static final /* synthetic */ void write(TermsAndConditionsFragment termsAndConditionsFragment, String str) {
        if (str != null) {
            getSessionDeviceSize getsessiondevicesize = termsAndConditionsFragment.presenter;
            if (getsessiondevicesize == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            if (GoodToKnowActivity.read(str, getsessiondevicesize.MediaBrowserCompat$ItemReceiver(), false)) {
                getSessionDeviceSize getsessiondevicesize2 = termsAndConditionsFragment.presenter;
                if (getsessiondevicesize2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                getsessiondevicesize2.IconCompatParcelizer();
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007e, code lost:
        r7 = r7.body();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.webkit.WebResourceResponse read(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "th"
            o.getSessionDeviceSize r1 = r6.presenter
            java.lang.String r2 = "presenter"
            if (r1 != 0) goto L_0x000b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x000b:
            java.lang.String r1 = r1.MediaBrowserCompat$ItemReceiver()
            r3 = 0
            boolean r1 = p040o.GoodToKnowActivity.read(r7, r1, r3)
            r3 = 0
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0018:
            okhttp3.OkHttpClient r1 = new okhttp3.OkHttpClient     // Catch:{ Exception -> 0x009c }
            r1.<init>()     // Catch:{ Exception -> 0x009c }
            okhttp3.Request$Builder r4 = new okhttp3.Request$Builder     // Catch:{ Exception -> 0x009c }
            r4.<init>()     // Catch:{ Exception -> 0x009c }
            if (r7 == 0) goto L_0x0094
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ Exception -> 0x009c }
            java.lang.CharSequence r7 = p040o.GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(r7)     // Catch:{ Exception -> 0x009c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x009c }
            okhttp3.Request$Builder r7 = r4.url((java.lang.String) r7)     // Catch:{ Exception -> 0x009c }
            androidx.fragment.app.FragmentActivity r4 = r6.getActivity()     // Catch:{ Exception -> 0x009c }
            boolean r4 = r4 instanceof com.scb.phone.view.activity.PreLoadCheckActivity     // Catch:{ Exception -> 0x009c }
            if (r4 == 0) goto L_0x0045
            androidx.fragment.app.FragmentActivity r4 = r6.getActivity()     // Catch:{ Exception -> 0x009c }
            com.scb.phone.view.activity.PreLoadCheckActivity r4 = (com.scb.phone.view.activity.PreLoadCheckActivity) r4     // Catch:{ Exception -> 0x009c }
            o.zzmd$zzm$zzb$zza r4 = r4.setTitleOptional()     // Catch:{ Exception -> 0x009c }
            goto L_0x0046
        L_0x0045:
            r4 = r3
        L_0x0046:
            if (r4 == 0) goto L_0x004c
            java.lang.String r4 = r4.mode     // Catch:{ Exception -> 0x009c }
            if (r4 != 0) goto L_0x0050
        L_0x004c:
            o.zzmd$zzm$zzb$zza r4 = p040o.zzmd.zzm.zzb.zza.INDIVIDUAL     // Catch:{ Exception -> 0x009c }
            java.lang.String r4 = r4.mode     // Catch:{ Exception -> 0x009c }
        L_0x0050:
            java.lang.String r5 = "userMode"
            okhttp3.Request$Builder r7 = r7.addHeader(r5, r4)     // Catch:{ Exception -> 0x009c }
            o.getSessionDeviceSize r4 = r6.presenter     // Catch:{ Exception -> 0x009c }
            if (r4 != 0) goto L_0x005d
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)     // Catch:{ Exception -> 0x009c }
        L_0x005d:
            java.lang.String r2 = "Accept-Language"
            android.content.SharedPreferences r4 = r4.read     // Catch:{ Exception -> 0x009c }
            java.lang.String r5 = "com.scb.phone.pref.key.LANGUAGE"
            java.lang.String r4 = r4.getString(r5, r0)     // Catch:{ Exception -> 0x009c }
            if (r4 == 0) goto L_0x006a
            r0 = r4
        L_0x006a:
            okhttp3.Request$Builder r7 = r7.addHeader(r2, r0)     // Catch:{ Exception -> 0x009c }
            okhttp3.Request r7 = r7.build()     // Catch:{ Exception -> 0x009c }
            okhttp3.Call r7 = r1.newCall(r7)     // Catch:{ Exception -> 0x009c }
            okhttp3.Response r7 = r7.execute()     // Catch:{ Exception -> 0x009c }
            r6.RatingCompat = r7     // Catch:{ Exception -> 0x009c }
            if (r7 == 0) goto L_0x0089
            okhttp3.ResponseBody r7 = r7.body()     // Catch:{ Exception -> 0x009c }
            if (r7 == 0) goto L_0x0089
            java.io.InputStream r7 = r7.byteStream()     // Catch:{ Exception -> 0x009c }
            goto L_0x008a
        L_0x0089:
            r7 = r3
        L_0x008a:
            android.webkit.WebResourceResponse r0 = new android.webkit.WebResourceResponse     // Catch:{ Exception -> 0x009c }
            java.lang.String r1 = "text/html"
            java.lang.String r2 = "utf-8"
            r0.<init>(r1, r2, r7)     // Catch:{ Exception -> 0x009c }
            return r0
        L_0x0094:
            kotlin.TypeCastException r7 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x009c }
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.CharSequence"
            r7.<init>(r0)     // Catch:{ Exception -> 0x009c }
            throw r7     // Catch:{ Exception -> 0x009c }
        L_0x009c:
            r7 = move-exception
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            p040o.onCheckBoxClick.IconCompatParcelizer(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.TermsAndConditionsFragment.read(java.lang.String):android.webkit.WebResourceResponse");
    }
}
