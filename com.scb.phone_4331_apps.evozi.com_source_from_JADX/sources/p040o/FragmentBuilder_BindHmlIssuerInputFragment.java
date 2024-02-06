package p040o;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.entitys.Trackers;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindHmlIssuerInputFragment */
public final class FragmentBuilder_BindHmlIssuerInputFragment implements FragmentBuilder_BindHmlETBBusinessInformationFragment, OnBoardingTutorialActivity_ViewBinding {
    boolean IconCompatParcelizer;
    FragmentBuilder_BindHmlCompanyNameFragment MediaBrowserCompat$CustomActionResultReceiver;
    boolean MediaBrowserCompat$ItemReceiver;
    boolean MediaBrowserCompat$MediaItem;
    String MediaBrowserCompat$SearchResultReceiver;
    public clickSaveSlip MediaDescriptionCompat;
    boolean MediaMetadataCompat;
    private FragmentBuilder_BindJuristicOnboardingLandingFragment.read MediaSessionCompat$QueueItem;
    Map<String, BaseResponse> MediaSessionCompat$ResultReceiverWrapper;
    boolean RatingCompat;
    setTextAppearance<String, View> read;
    FragmentBuilder_BindHmlExternalAuthenticationFragment write;

    FragmentBuilder_BindHmlIssuerInputFragment(FragmentBuilder_BindHmlCompanyNameFragment fragmentBuilder_BindHmlCompanyNameFragment) {
        this(fragmentBuilder_BindHmlCompanyNameFragment, FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView());
    }

    private FragmentBuilder_BindHmlIssuerInputFragment(FragmentBuilder_BindHmlCompanyNameFragment fragmentBuilder_BindHmlCompanyNameFragment, FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        this.read = new setTextAppearance<>();
        this.MediaSessionCompat$ResultReceiverWrapper = new HashMap();
        this.write = FragmentBuilder_BindHmlExternalAuthenticationFragment.read();
        this.MediaDescriptionCompat = new clickSaveSlip();
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindHmlCompanyNameFragment;
        this.MediaSessionCompat$QueueItem = HomeActivity.write(fragmentBuilder_BindJuristicOnboardingLandingFragment, new FragmentBuilder_BindGiftSelectionFragment(this));
    }

    public final void IconCompatParcelizer(String str, View view) {
        if (!FragmentBuilder_BindHmlBusinessURLInfoFragment.write(view)) {
            boolean containsKey = this.read.containsKey(str);
            this.read.put(str, view);
            if (!containsKey) {
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.write;
                StringBuilder sb = new StringBuilder();
                sb.append("Interaction ");
                sb.append(str);
                sb.append(" appears on screen");
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                if (this.MediaBrowserCompat$CustomActionResultReceiver != null && ((this.MediaMetadataCompat || this.MediaBrowserCompat$MediaItem) && !this.IconCompatParcelizer && AlertController$RecycleListView.write(FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater(), (List<View>) read()).contains(str) && (!this.MediaBrowserCompat$MediaItem || !this.RatingCompat))) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(str);
                }
                if (this.MediaBrowserCompat$ItemReceiver) {
                    this.write.write(str, view);
                }
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, View view) {
        this.read.keySet().remove(str);
        this.read.remove(str);
        BaseResponse baseResponse = this.MediaSessionCompat$ResultReceiverWrapper.get(str);
        if (baseResponse != null) {
            this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(str, baseResponse.getCaptures(), this.write.write.get(str));
            this.write.write(str, baseResponse);
        }
        this.MediaSessionCompat$ResultReceiverWrapper.remove(str);
        this.write.MediaBrowserCompat$CustomActionResultReceiver(str, view);
        if (FragmentBuilder_BindHmlIssuerLandingFragment.setCheckable() != null) {
            ((FragmentBuilder_BindHmlETBSuccessFragment) FragmentBuilder_BindHmlIssuerLandingFragment.setCheckable()).MediaBrowserCompat$ItemReceiver(str);
        }
    }

    public final void write() {
        Iterator it = new ArrayList(this.read.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            MediaBrowserCompat$ItemReceiver(str, this.read.get(str));
        }
        this.read.clear();
        this.MediaSessionCompat$ResultReceiverWrapper.clear();
    }

    public final Set<String> MediaBrowserCompat$CustomActionResultReceiver() {
        return new LinkedHashSet(this.read.keySet());
    }

    public final List<View> MediaBrowserCompat$ItemReceiver() {
        return new ArrayList(this.read.values());
    }

    public final void write(String str, BaseResponse baseResponse) {
        DeejungTransferLandingActivity deejungTransferLandingActivity;
        boolean z;
        DeejungTransferLandingActivity deejungTransferLandingActivity2;
        if (this.read.keySet().contains(str)) {
            this.MediaSessionCompat$ResultReceiverWrapper.remove(str);
            this.MediaSessionCompat$ResultReceiverWrapper.put(str, baseResponse);
            if ((baseResponse.getCaptures() != null && baseResponse.getCaptures().length > 0) || (baseResponse.getTrackers() != null && baseResponse.getTrackers().length > 0)) {
                this.write.write(str, this.read.get(str));
                FragmentBuilder_BindHmlExternalAuthenticationFragment fragmentBuilder_BindHmlExternalAuthenticationFragment = this.write;
                if (!(baseResponse == null || str == null || !fragmentBuilder_BindHmlExternalAuthenticationFragment.write.containsKey(str))) {
                    Trackers[] trackers = baseResponse.getTrackers();
                    Captures[] captures = baseResponse.getCaptures();
                    setTextAppearance settextappearance = fragmentBuilder_BindHmlExternalAuthenticationFragment.write.get(str);
                    if (settextappearance != null) {
                        if (!(captures == null || captures.length == 0)) {
                            HashSet<DeejungTransferLandingActivity> hashSet = new HashSet<>();
                            int length = captures.length;
                            for (int i = 0; i < length; i++) {
                                Captures captures2 = captures[i];
                                String path = captures2.getPath();
                                if (captures2.isRepeating()) {
                                    deejungTransferLandingActivity = (DeejungTransferLandingActivity) settextappearance.get(ECouponDetailActivity.IconCompatParcelizer(path));
                                } else {
                                    deejungTransferLandingActivity = (DeejungTransferLandingActivity) settextappearance.get(captures[i].getPath());
                                }
                                if (deejungTransferLandingActivity != null) {
                                    View view = deejungTransferLandingActivity.IconCompatParcelizer;
                                    if (view != null && (view instanceof Button)) {
                                        z = !(view instanceof CompoundButton);
                                    } else {
                                        z = false;
                                    }
                                    if (z) {
                                        MyQRCoachMarkActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity, FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater());
                                    } else {
                                        while (true) {
                                            if (deejungTransferLandingActivity == null) {
                                                break;
                                            }
                                            ECouponSuccessfulActivity eCouponSuccessfulActivity = deejungTransferLandingActivity.f3129x50fd9e4a;
                                            if (eCouponSuccessfulActivity == null) {
                                                deejungTransferLandingActivity2 = deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper;
                                            } else if (FragmentBuilder_BindHmlExternalAuthenticationFragment.MediaBrowserCompat$CustomActionResultReceiver(eCouponSuccessfulActivity)) {
                                                hashSet.add(deejungTransferLandingActivity);
                                                break;
                                            } else if (eCouponSuccessfulActivity.MediaMetadataCompat.equals("TI")) {
                                                FragmentBuilder_BindHmlExternalAuthenticationFragment.write(deejungTransferLandingActivity, captures, (Trackers) null);
                                                break;
                                            } else if (!FragmentBuilder_BindHmlExternalAuthenticationFragment.MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity, trackers)) {
                                                deejungTransferLandingActivity2 = deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper;
                                            } else if (deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper == null || !deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper.f3129x50fd9e4a.MediaBrowserCompat$ItemReceiver || !(deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer instanceof ViewGroup)) {
                                                hashSet.add(deejungTransferLandingActivity);
                                            } else {
                                                hashSet.add(deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper);
                                            }
                                        }
                                    }
                                }
                            }
                            for (DeejungTransferLandingActivity read2 : hashSet) {
                                FragmentBuilder_BindHmlExternalAuthenticationFragment.read(read2);
                            }
                        }
                        if (!(trackers == null || trackers.length == 0)) {
                            for (int i2 = 0; i2 < trackers.length; i2++) {
                                if (trackers[i2].isRepeating()) {
                                    DeejungTransferLandingActivity deejungTransferLandingActivity3 = (DeejungTransferLandingActivity) settextappearance.get(ECouponDetailActivity.IconCompatParcelizer(trackers[i2].getPath()));
                                    if (deejungTransferLandingActivity3 != null) {
                                        ArrayList<DeejungTransferLandingActivity> MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindHmlExternalAuthenticationFragment.MediaBrowserCompat$CustomActionResultReceiver(trackers[i2].getPath(), deejungTransferLandingActivity3, new ArrayList());
                                        for (int i3 = 0; i3 < MediaBrowserCompat$CustomActionResultReceiver2.size(); i3++) {
                                            DeejungTransferLandingActivity deejungTransferLandingActivity4 = MediaBrowserCompat$CustomActionResultReceiver2.get(i3);
                                            deejungTransferLandingActivity4.MediaSessionCompat$Token = true;
                                            FragmentBuilder_BindHmlExternalAuthenticationFragment.write(deejungTransferLandingActivity4, captures, trackers[i2]);
                                        }
                                    }
                                } else if (settextappearance.containsKey(trackers[i2].getPath())) {
                                    DeejungTransferLandingActivity deejungTransferLandingActivity5 = (DeejungTransferLandingActivity) settextappearance.get(trackers[i2].getPath());
                                    deejungTransferLandingActivity5.MediaSessionCompat$Token = true;
                                    FragmentBuilder_BindHmlExternalAuthenticationFragment.write(deejungTransferLandingActivity5, captures, trackers[i2]);
                                }
                            }
                        }
                    }
                }
            }
            clickSaveSlip clicksaveslip = this.MediaDescriptionCompat;
            Captures[] captures3 = baseResponse.getCaptures();
            FragmentBuilder_BindHmlExternalAuthenticationFragment fragmentBuilder_BindHmlExternalAuthenticationFragment2 = this.write;
            clicksaveslip.write.MediaBrowserCompat$CustomActionResultReceiver.remove(str);
            clicksaveslip.IconCompatParcelizer(str, captures3, fragmentBuilder_BindHmlExternalAuthenticationFragment2.write.get(str));
        }
    }

    public final BaseResponse MediaBrowserCompat$CustomActionResultReceiver(String str) {
        return this.MediaSessionCompat$ResultReceiverWrapper.get(str);
    }

    public final void disconnect() {
        FragmentBuilder_BindJuristicOnboardingLandingFragment.read read2 = this.MediaSessionCompat$QueueItem;
        if (read2 != null) {
            read2.read();
            this.MediaSessionCompat$QueueItem = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final ArrayList<View> read() {
        ArrayList<View> arrayList = new ArrayList<>();
        for (Map.Entry<String, View> value : this.read.entrySet()) {
            arrayList.add(value.getValue());
        }
        return arrayList;
    }
}
