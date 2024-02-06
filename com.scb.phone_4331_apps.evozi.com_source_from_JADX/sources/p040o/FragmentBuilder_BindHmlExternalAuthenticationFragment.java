package p040o;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AbsSpinner;
import android.widget.AdapterView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SpinnerAdapter;
import android.widget.TabHost;
import android.widget.TabWidget;
import androidx.appcompat.widget.ScrollingTabContainerView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.entitys.Trackers;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p040o.BankingAgentSuccessActivity_ViewBinding;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindHmlExternalAuthenticationFragment */
public class FragmentBuilder_BindHmlExternalAuthenticationFragment {
    private static FragmentBuilder_BindHmlExternalAuthenticationFragment MediaBrowserCompat$ItemReceiver;
    private setTextAppearance<String, HashSet<FragmentBuilder_BindHmlNTBLoanSetupFragment>> IconCompatParcelizer = new setTextAppearance<>();
    public setTextAppearance<String, DeejungTransferLandingActivity> MediaBrowserCompat$CustomActionResultReceiver = new setTextAppearance<>();
    public setTextAppearance<String, setTextAppearance<View, DeejungTransferLandingActivity>> read = new setTextAppearance<>();
    public setTextAppearance<String, setTextAppearance<String, DeejungTransferLandingActivity>> write = new setTextAppearance<>();

    FragmentBuilder_BindHmlExternalAuthenticationFragment() {
    }

    public static FragmentBuilder_BindHmlExternalAuthenticationFragment read() {
        FragmentBuilder_BindHmlExternalAuthenticationFragment fragmentBuilder_BindHmlExternalAuthenticationFragment;
        synchronized (FragmentBuilder_BindHmlExternalAuthenticationFragment.class) {
            if (MediaBrowserCompat$ItemReceiver == null) {
                MediaBrowserCompat$ItemReceiver = new FragmentBuilder_BindHmlExternalAuthenticationFragment();
            }
            fragmentBuilder_BindHmlExternalAuthenticationFragment = MediaBrowserCompat$ItemReceiver;
        }
        return fragmentBuilder_BindHmlExternalAuthenticationFragment;
    }

    private static String read(View view) {
        String MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(view);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                String read2 = read(viewGroup.getChildAt(i));
                if (!"".equals(read2)) {
                    return read2;
                }
            }
        }
        return "";
    }

    public static boolean write(Activity activity, String str) {
        if (activity == null) {
            return false;
        }
        return read(activity.findViewById(16908290)).equals(str);
    }

    public static boolean MediaBrowserCompat$ItemReceiver(String str) {
        Activity AppCompatViewInflater = FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater();
        if (AppCompatViewInflater == null) {
            return false;
        }
        return read(AppCompatViewInflater.findViewById(16908290)).equals(str);
    }

    public final void write(String str, View view) {
        boolean z;
        if (view != null) {
            setTextAppearance settextappearance = new setTextAppearance();
            setTextAppearance settextappearance2 = new setTextAppearance();
            this.write.put(str, settextappearance);
            this.read.put(str, settextappearance2);
            MediaBrowserCompat$CustomActionResultReceiver(str, view, (setTextAppearance<String, DeejungTransferLandingActivity>) settextappearance, (setTextAppearance<View, DeejungTransferLandingActivity>) settextappearance2, this.MediaBrowserCompat$CustomActionResultReceiver);
            Activity AppCompatViewInflater = FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater();
            if (AppCompatViewInflater == null) {
                z = false;
            } else {
                z = read(AppCompatViewInflater.findViewById(16908290)).equals(str);
            }
            if (z) {
                read(str, view, (setTextAppearance<String, DeejungTransferLandingActivity>) settextappearance, (setTextAppearance<View, DeejungTransferLandingActivity>) settextappearance2);
            }
        }
    }

    public static boolean IconCompatParcelizer(String str, View view) {
        boolean z;
        if (view == null) {
            return false;
        }
        if (IconCompatParcelizer(view)) {
            return true;
        }
        Activity AppCompatViewInflater = FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater();
        if (AppCompatViewInflater == null) {
            z = false;
        } else {
            z = read(AppCompatViewInflater.findViewById(16908290)).equals(str);
        }
        if (z) {
            return IconCompatParcelizer(AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater(), view));
        }
        return false;
    }

    public final setTextAppearance<String, DeejungTransferLandingActivity> MediaBrowserCompat$CustomActionResultReceiver(String str, View view, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance, setTextAppearance<View, DeejungTransferLandingActivity> settextappearance2, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance3) {
        DeejungTransferLandingActivity deejungTransferLandingActivity = new DeejungTransferLandingActivity(view, str, str);
        deejungTransferLandingActivity.f3129x50fd9e4a = DeejungTransferMinFullConfirmationActivity_ViewBinding.read(view.getClass().getSimpleName());
        settextappearance3.put(str, deejungTransferLandingActivity);
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.equals(settextappearance3)) {
            this.MediaBrowserCompat$CustomActionResultReceiver.put(str, deejungTransferLandingActivity);
        }
        MediaBrowserCompat$CustomActionResultReceiver(str, deejungTransferLandingActivity, view, settextappearance, settextappearance2, false);
        return settextappearance;
    }

    public final DeejungTransferLandingActivity MediaBrowserCompat$CustomActionResultReceiver(String str, DeejungTransferLandingActivity deejungTransferLandingActivity, View view, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance, setTextAppearance<View, DeejungTransferLandingActivity> settextappearance2, boolean z) {
        String str2;
        String str3 = str;
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity;
        View view2 = view;
        setTextAppearance<String, DeejungTransferLandingActivity> settextappearance3 = settextappearance;
        setTextAppearance<View, DeejungTransferLandingActivity> settextappearance4 = settextappearance2;
        if ((z && FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(view) != null) || FragmentBuilder_BindHmlBusinessURLInfoFragment.write(view)) {
            return null;
        }
        int i = 0;
        String str4 = "";
        int i2 = 1;
        if (!(view2 instanceof ViewGroup)) {
            DeejungTransferLandingActivity deejungTransferLandingActivity3 = new DeejungTransferLandingActivity(view2, (String) null, str3);
            deejungTransferLandingActivity3.f3129x50fd9e4a = DeejungTransferMinFullConfirmationActivity_ViewBinding.read(view);
            if (deejungTransferLandingActivity2 == null) {
                deejungTransferLandingActivity3.ParcelableVolumeInfo = str3;
            } else {
                String MediaBrowserCompat$CustomActionResultReceiver2 = DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(view);
                if (MediaBrowserCompat$CustomActionResultReceiver2.equals(str4)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(deejungTransferLandingActivity2.ParcelableVolumeInfo);
                    sb.append("/");
                    sb.append(DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(view.getClass().getName()));
                    String obj = sb.toString();
                    while (true) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(obj);
                        sb2.append(i);
                        if (!settextappearance3.containsKey(sb2.toString())) {
                            break;
                        }
                        i++;
                    }
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(obj);
                    sb3.append(i);
                    str2 = sb3.toString();
                } else {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(deejungTransferLandingActivity2.ParcelableVolumeInfo);
                    sb4.append("/");
                    sb4.append(MediaBrowserCompat$CustomActionResultReceiver2);
                    String obj2 = sb4.toString();
                    while (true) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(obj2);
                        sb5.append(str4);
                        if (!settextappearance3.containsKey(sb5.toString())) {
                            break;
                        }
                        str4 = Integer.toString(i);
                        i++;
                    }
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(obj2);
                    sb6.append(str4);
                    str2 = sb6.toString();
                }
                deejungTransferLandingActivity3.ParcelableVolumeInfo = str2;
                deejungTransferLandingActivity2.read.add(deejungTransferLandingActivity3);
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb7 = new StringBuilder();
                sb7.append("Interaction ");
                sb7.append(str3);
                sb7.append(" has element:");
                sb7.append(str2);
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb7.toString());
                deejungTransferLandingActivity3.MediaSessionCompat$ResultReceiverWrapper = deejungTransferLandingActivity2;
                deejungTransferLandingActivity3.RatingCompat = deejungTransferLandingActivity2.RatingCompat;
            }
            settextappearance3.put(deejungTransferLandingActivity3.ParcelableVolumeInfo, deejungTransferLandingActivity3);
            if (settextappearance4 != null) {
                settextappearance4.put(deejungTransferLandingActivity3.IconCompatParcelizer, deejungTransferLandingActivity3);
            }
            return deejungTransferLandingActivity3;
        } else if (view2 instanceof AdapterView) {
            return read(str, deejungTransferLandingActivity, (AdapterView) view2, settextappearance, settextappearance2);
        } else if (view2 instanceof TabWidget) {
            return read(str, deejungTransferLandingActivity, (TabWidget) view2, settextappearance, settextappearance2);
        } else if (view2 instanceof TabLayout) {
            return MediaBrowserCompat$CustomActionResultReceiver(str, deejungTransferLandingActivity, (TabLayout) view2, settextappearance, settextappearance2);
        } else if (DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(view.getClass().getName()).equals("TabLayout$SlidingTabStrip")) {
            return IconCompatParcelizer(str, deejungTransferLandingActivity, (ViewGroup) view2, settextappearance, settextappearance2);
        } else if (DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(view.getClass().getName()).equals("TabLayout$TabView")) {
            return IconCompatParcelizer(str, deejungTransferLandingActivity2.MediaSessionCompat$ResultReceiverWrapper, (ViewGroup) deejungTransferLandingActivity2.IconCompatParcelizer, settextappearance, settextappearance2);
        } else if (view2 instanceof RecyclerView) {
            return write(str, deejungTransferLandingActivity, (RecyclerView) view2, settextappearance, settextappearance2);
        } else if (view.getClass().getName().endsWith("ScrollingTabContainerView")) {
            return MediaBrowserCompat$ItemReceiver(str, deejungTransferLandingActivity, (ViewGroup) view2, settextappearance, settextappearance2);
        } else {
            ViewGroup viewGroup = (ViewGroup) view2;
            String MediaBrowserCompat$CustomActionResultReceiver3 = DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(view);
            if (MediaBrowserCompat$CustomActionResultReceiver3.equals(str4)) {
                MediaBrowserCompat$CustomActionResultReceiver3 = DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(view.getClass().getName());
            }
            DeejungTransferLandingActivity deejungTransferLandingActivity4 = new DeejungTransferLandingActivity(view2, (String) null, str3);
            deejungTransferLandingActivity4.f3129x50fd9e4a = DeejungTransferMinFullConfirmationActivity_ViewBinding.read(view);
            if (deejungTransferLandingActivity2 == null) {
                deejungTransferLandingActivity4.ParcelableVolumeInfo = str3;
            } else {
                deejungTransferLandingActivity2.read.add(deejungTransferLandingActivity4);
                StringBuilder sb8 = new StringBuilder();
                sb8.append(deejungTransferLandingActivity2.ParcelableVolumeInfo);
                sb8.append("/");
                sb8.append(MediaBrowserCompat$CustomActionResultReceiver3);
                String obj3 = sb8.toString();
                if (deejungTransferLandingActivity2.MediaBrowserCompat$ItemReceiver(obj3)) {
                    while (true) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append(obj3);
                        sb9.append(i2);
                        if (!deejungTransferLandingActivity2.MediaBrowserCompat$ItemReceiver(sb9.toString())) {
                            break;
                        }
                        i2++;
                    }
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append(obj3);
                    sb10.append(Integer.toString(i2));
                    obj3 = sb10.toString();
                }
                deejungTransferLandingActivity4.ParcelableVolumeInfo = obj3;
                deejungTransferLandingActivity4.MediaSessionCompat$ResultReceiverWrapper = deejungTransferLandingActivity2;
                deejungTransferLandingActivity4.RatingCompat = deejungTransferLandingActivity2.RatingCompat;
            }
            settextappearance3.put(deejungTransferLandingActivity4.ParcelableVolumeInfo, deejungTransferLandingActivity4);
            settextappearance4.put(deejungTransferLandingActivity4.IconCompatParcelizer, deejungTransferLandingActivity4);
            int i3 = 0;
            while (i3 < viewGroup.getChildCount()) {
                String IconCompatParcelizer2 = MediaBrowserCompat$CustomActionResultReceiver3.equals(str4) ? DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(view.getClass().getName()) : MediaBrowserCompat$CustomActionResultReceiver3;
                MediaBrowserCompat$CustomActionResultReceiver(str, deejungTransferLandingActivity4, viewGroup.getChildAt(i3), settextappearance, settextappearance2, true);
                i3++;
                MediaBrowserCompat$CustomActionResultReceiver3 = IconCompatParcelizer2;
            }
            return deejungTransferLandingActivity4;
        }
    }

    private static boolean IconCompatParcelizer(View view) {
        if (view == null) {
            return false;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (IconCompatParcelizer(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
            return false;
        }
        ECouponSuccessfulActivity read2 = DeejungTransferMinFullConfirmationActivity_ViewBinding.read(view);
        if (read2.MediaBrowserCompat$CustomActionResultReceiver || read2.MediaBrowserCompat$ItemReceiver || read2.read) {
            return true;
        }
        return false;
    }

    private void read(String str, View view, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance, setTextAppearance<View, DeejungTransferLandingActivity> settextappearance2) {
        View MediaBrowserCompat$CustomActionResultReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater(), view);
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            DeejungTransferLandingActivity deejungTransferLandingActivity = this.MediaBrowserCompat$CustomActionResultReceiver.get(str);
            DeejungTransferLandingActivity MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(str, deejungTransferLandingActivity, MediaBrowserCompat$CustomActionResultReceiver2, settextappearance, settextappearance2, false);
            if (MediaBrowserCompat$CustomActionResultReceiver3 != null) {
                deejungTransferLandingActivity.MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$CustomActionResultReceiver3;
                deejungTransferLandingActivity.write = true;
            }
        }
    }

    public static boolean write(View view) {
        if ((view instanceof ViewPager) || (view instanceof AbsListView) || (view instanceof RecyclerView)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (write(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }

    private DeejungTransferLandingActivity MediaBrowserCompat$ItemReceiver(String str, DeejungTransferLandingActivity deejungTransferLandingActivity, ViewGroup viewGroup, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance, setTextAppearance<View, DeejungTransferLandingActivity> settextappearance2) {
        String str2 = str;
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity;
        setTextAppearance<String, DeejungTransferLandingActivity> settextappearance3 = settextappearance;
        setTextAppearance<View, DeejungTransferLandingActivity> settextappearance4 = settextappearance2;
        String MediaBrowserCompat$CustomActionResultReceiver2 = DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((View) viewGroup);
        if ("".equals(MediaBrowserCompat$CustomActionResultReceiver2)) {
            MediaBrowserCompat$CustomActionResultReceiver2 = DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(viewGroup.getClass().getName());
        }
        ViewGroup viewGroup2 = viewGroup;
        DeejungTransferLandingActivity deejungTransferLandingActivity3 = new DeejungTransferLandingActivity(viewGroup2, (String) null, str2);
        deejungTransferLandingActivity3.f3129x50fd9e4a = DeejungTransferMinFullConfirmationActivity_ViewBinding.read((View) viewGroup);
        if (deejungTransferLandingActivity2 == null) {
            deejungTransferLandingActivity3.ParcelableVolumeInfo = str2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(deejungTransferLandingActivity2.ParcelableVolumeInfo);
            sb.append("/");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2);
            deejungTransferLandingActivity3.ParcelableVolumeInfo = sb.toString();
            deejungTransferLandingActivity2.read.add(deejungTransferLandingActivity3);
            deejungTransferLandingActivity3.MediaSessionCompat$ResultReceiverWrapper = deejungTransferLandingActivity2;
        }
        settextappearance3.put(deejungTransferLandingActivity3.ParcelableVolumeInfo, deejungTransferLandingActivity3);
        settextappearance4.put(deejungTransferLandingActivity3.IconCompatParcelizer, deejungTransferLandingActivity3);
        if (viewGroup.getChildCount() == 0) {
            return deejungTransferLandingActivity3;
        }
        while (!viewGroup2.getChildAt(0).getClass().getName().contains("ScrollingTabContainerView$TabView")) {
            int hashCode = viewGroup2.hashCode();
            int i = 0;
            while (true) {
                if (i >= viewGroup2.getChildCount()) {
                    break;
                } else if (viewGroup2.getChildAt(i) instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) viewGroup2.getChildAt(i);
                    break;
                } else {
                    i++;
                }
            }
            if (hashCode == viewGroup2.hashCode()) {
                break;
            }
        }
        ViewGroup viewGroup3 = viewGroup2;
        for (int i2 = 0; i2 < viewGroup3.getChildCount(); i2++) {
            View childAt = viewGroup3.getChildAt(i2);
            if (childAt.getClass().getName().contains("ScrollingTabContainerView$TabView")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(deejungTransferLandingActivity3.ParcelableVolumeInfo);
                sb2.append("/");
                sb2.append(DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer("ScrollingTabContainerView$TabView"));
                sb2.append(i2);
                DeejungTransferLandingActivity deejungTransferLandingActivity4 = new DeejungTransferLandingActivity(childAt, sb2.toString(), str2);
                deejungTransferLandingActivity4.f3129x50fd9e4a = DeejungTransferMinFullConfirmationActivity_ViewBinding.read("ScrollingTabContainerView$TabView");
                deejungTransferLandingActivity4.RatingCompat = true;
                deejungTransferLandingActivity3.read.add(deejungTransferLandingActivity4);
                deejungTransferLandingActivity4.MediaSessionCompat$ResultReceiverWrapper = deejungTransferLandingActivity3;
                settextappearance3.put(deejungTransferLandingActivity4.ParcelableVolumeInfo, deejungTransferLandingActivity4);
                settextappearance4.put(deejungTransferLandingActivity4.IconCompatParcelizer, deejungTransferLandingActivity4);
                if (childAt instanceof ViewGroup) {
                    ViewGroup viewGroup4 = (ViewGroup) childAt;
                    int i3 = 0;
                    while (i3 < viewGroup4.getChildCount()) {
                        MediaBrowserCompat$CustomActionResultReceiver(str, deejungTransferLandingActivity4, viewGroup4.getChildAt(i3), settextappearance, settextappearance2, true);
                        i3++;
                        viewGroup4 = viewGroup4;
                        deejungTransferLandingActivity4 = deejungTransferLandingActivity4;
                    }
                }
            }
        }
        return deejungTransferLandingActivity3;
    }

    private DeejungTransferLandingActivity MediaBrowserCompat$CustomActionResultReceiver(String str, DeejungTransferLandingActivity deejungTransferLandingActivity, TabLayout tabLayout, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance, setTextAppearance<View, DeejungTransferLandingActivity> settextappearance2) {
        String MediaBrowserCompat$CustomActionResultReceiver2 = DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((View) tabLayout);
        if (MediaBrowserCompat$CustomActionResultReceiver2.isEmpty()) {
            MediaBrowserCompat$CustomActionResultReceiver2 = DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(tabLayout.getClass().getName());
        }
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = new DeejungTransferLandingActivity(tabLayout, (String) null, str);
        deejungTransferLandingActivity2.f3129x50fd9e4a = DeejungTransferMinFullConfirmationActivity_ViewBinding.read((View) tabLayout);
        if (deejungTransferLandingActivity == null) {
            deejungTransferLandingActivity2.ParcelableVolumeInfo = str;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(deejungTransferLandingActivity.ParcelableVolumeInfo);
            sb.append("/");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2);
            deejungTransferLandingActivity2.ParcelableVolumeInfo = sb.toString();
            deejungTransferLandingActivity.write(deejungTransferLandingActivity2.ParcelableVolumeInfo);
            deejungTransferLandingActivity.read.add(deejungTransferLandingActivity2);
            deejungTransferLandingActivity2.MediaSessionCompat$ResultReceiverWrapper = deejungTransferLandingActivity;
        }
        settextappearance.put(deejungTransferLandingActivity2.ParcelableVolumeInfo, deejungTransferLandingActivity2);
        settextappearance2.put(deejungTransferLandingActivity2.IconCompatParcelizer, deejungTransferLandingActivity2);
        IconCompatParcelizer(str, deejungTransferLandingActivity2, (ViewGroup) tabLayout.getChildAt(0), settextappearance, settextappearance2);
        return deejungTransferLandingActivity2;
    }

    /* access modifiers changed from: package-private */
    public final DeejungTransferLandingActivity read(String str, DeejungTransferLandingActivity deejungTransferLandingActivity, TabWidget tabWidget, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance, setTextAppearance<View, DeejungTransferLandingActivity> settextappearance2) {
        String str2 = str;
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity;
        TabWidget tabWidget2 = tabWidget;
        String MediaBrowserCompat$CustomActionResultReceiver2 = DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((View) tabWidget);
        if ("".equals(MediaBrowserCompat$CustomActionResultReceiver2)) {
            MediaBrowserCompat$CustomActionResultReceiver2 = DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(tabWidget.getClass().getName());
        }
        DeejungTransferLandingActivity deejungTransferLandingActivity3 = new DeejungTransferLandingActivity(tabWidget2, (String) null, str2);
        deejungTransferLandingActivity3.f3129x50fd9e4a = DeejungTransferMinFullConfirmationActivity_ViewBinding.read((View) tabWidget);
        if (deejungTransferLandingActivity2 == null) {
            deejungTransferLandingActivity3.ParcelableVolumeInfo = str2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(deejungTransferLandingActivity2.ParcelableVolumeInfo);
            sb.append("/");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2);
            deejungTransferLandingActivity3.ParcelableVolumeInfo = sb.toString();
            deejungTransferLandingActivity2.read.add(deejungTransferLandingActivity3);
            deejungTransferLandingActivity3.MediaSessionCompat$ResultReceiverWrapper = deejungTransferLandingActivity2;
        }
        settextappearance.put(deejungTransferLandingActivity3.ParcelableVolumeInfo, deejungTransferLandingActivity3);
        settextappearance2.put(deejungTransferLandingActivity3.IconCompatParcelizer, deejungTransferLandingActivity3);
        for (int i = 0; i < tabWidget.getChildCount(); i++) {
            MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity3, str, tabWidget2.getChildAt(i), i, settextappearance, settextappearance2, "TI", "TabItem");
        }
        return deejungTransferLandingActivity3;
    }

    private DeejungTransferLandingActivity read(String str, DeejungTransferLandingActivity deejungTransferLandingActivity, AdapterView adapterView, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance, setTextAppearance<View, DeejungTransferLandingActivity> settextappearance2) {
        FragmentBuilder_BindHmlNTBLoanSetupFragment MediaBrowserCompat$CustomActionResultReceiver2;
        String str2 = str;
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity;
        AdapterView adapterView2 = adapterView;
        setTextAppearance<String, DeejungTransferLandingActivity> settextappearance3 = settextappearance;
        boolean z = adapterView2 instanceof AbsListView;
        if (z) {
            ((AbsListView) adapterView2).smoothScrollBy(0, 0);
        }
        String MediaBrowserCompat$CustomActionResultReceiver3 = DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((View) adapterView);
        if ("".equals(MediaBrowserCompat$CustomActionResultReceiver3)) {
            MediaBrowserCompat$CustomActionResultReceiver3 = DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(adapterView.getClass().getName());
        }
        DeejungTransferLandingActivity deejungTransferLandingActivity3 = new DeejungTransferLandingActivity(adapterView2, (String) null, str2);
        deejungTransferLandingActivity3.f3129x50fd9e4a = DeejungTransferMinFullConfirmationActivity_ViewBinding.read((View) adapterView);
        if (deejungTransferLandingActivity2 == null) {
            deejungTransferLandingActivity3.ParcelableVolumeInfo = str2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(deejungTransferLandingActivity2.ParcelableVolumeInfo);
            sb.append("/");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver3);
            deejungTransferLandingActivity3.ParcelableVolumeInfo = sb.toString();
            deejungTransferLandingActivity2.read.add(deejungTransferLandingActivity3);
            deejungTransferLandingActivity3.MediaSessionCompat$ResultReceiverWrapper = deejungTransferLandingActivity2;
        }
        settextappearance3.put(deejungTransferLandingActivity3.ParcelableVolumeInfo, deejungTransferLandingActivity3);
        settextappearance2.put(deejungTransferLandingActivity3.IconCompatParcelizer, deejungTransferLandingActivity3);
        if (z && (MediaBrowserCompat$CustomActionResultReceiver2 = DeejungPlansActivity.MediaBrowserCompat$CustomActionResultReceiver((AbsListView) adapterView2, this, str2, deejungTransferLandingActivity3, settextappearance3)) != null) {
            MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver();
            HashSet hashSet = this.IconCompatParcelizer.get(str2);
            if (hashSet != null) {
                hashSet.add(MediaBrowserCompat$CustomActionResultReceiver2);
            }
        }
        if (adapterView2 instanceof ExpandableListView) {
            ExpandableListView expandableListView = (ExpandableListView) adapterView2;
            ExpandableListAdapter expandableListAdapter = expandableListView.getExpandableListAdapter();
            if (expandableListAdapter == null) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i2 < expandableListAdapter.getGroupCount()) {
                int i4 = i2;
                ExpandableListAdapter expandableListAdapter2 = expandableListAdapter;
                ExpandableListView expandableListView2 = expandableListView;
                MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity3, str, adapterView2.getChildAt(i), i3, settextappearance, settextappearance2, "LI", "ListItem");
                i3++;
                i++;
                if (expandableListView2.isGroupExpanded(i4)) {
                    int i5 = i;
                    for (int i6 = 0; i6 < expandableListAdapter2.getChildrenCount(i4); i6++) {
                        MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity3, str, adapterView2.getChildAt(i5), i3, settextappearance, settextappearance2, "LI", "ListItem");
                        i3++;
                        i5++;
                    }
                    i = i5;
                } else {
                    i3 += expandableListAdapter2.getChildrenCount(i4);
                }
                i2 = i4 + 1;
                expandableListAdapter = expandableListAdapter2;
                expandableListView = expandableListView2;
                String str3 = str;
            }
        } else if (adapterView2 instanceof AbsSpinner) {
            SpinnerAdapter adapter = ((AbsSpinner) adapterView2).getAdapter();
            if (adapter == null) {
                return null;
            }
            for (int i7 = 0; i7 < adapter.getCount(); i7++) {
                MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity3, str, adapterView2.getChildAt(i7), i7, settextappearance, settextappearance2, "LI", "ListItem");
            }
        } else {
            int firstVisiblePosition = adapterView.getFirstVisiblePosition();
            int count = adapterView.getCount();
            for (int i8 = 0; i8 <= count - 1; i8++) {
                MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity3, str, adapterView2.getChildAt(i8), i8 + firstVisiblePosition, settextappearance, settextappearance2, "LI", "ListItem");
            }
        }
        return deejungTransferLandingActivity3;
    }

    public final DeejungTransferLandingActivity MediaBrowserCompat$ItemReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity, String str, View view, int i, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance, setTextAppearance<View, DeejungTransferLandingActivity> settextappearance2, String str2, String str3) {
        setTextAppearance<View, DeejungTransferLandingActivity> settextappearance3;
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity;
        View view2 = view;
        if (view2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(deejungTransferLandingActivity2.ParcelableVolumeInfo);
        sb.append("/");
        sb.append(DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(str2));
        sb.append(i);
        DeejungTransferLandingActivity deejungTransferLandingActivity3 = new DeejungTransferLandingActivity(view2, sb.toString(), str);
        deejungTransferLandingActivity3.RatingCompat = true;
        deejungTransferLandingActivity3.f3129x50fd9e4a = DeejungTransferMinFullConfirmationActivity_ViewBinding.read(str3);
        deejungTransferLandingActivity2.read.add(deejungTransferLandingActivity3);
        deejungTransferLandingActivity3.MediaSessionCompat$ResultReceiverWrapper = deejungTransferLandingActivity2;
        settextappearance.put(deejungTransferLandingActivity3.ParcelableVolumeInfo, deejungTransferLandingActivity3);
        if (settextappearance2 == null) {
            settextappearance3 = this.read.get(deejungTransferLandingActivity2.MediaBrowserCompat$MediaItem);
        } else {
            settextappearance3 = settextappearance2;
        }
        if (settextappearance3 == null) {
            return deejungTransferLandingActivity3;
        }
        settextappearance3.put(deejungTransferLandingActivity3.IconCompatParcelizer, deejungTransferLandingActivity3);
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int i2 = 0;
            while (i2 < viewGroup.getChildCount()) {
                View childAt = viewGroup.getChildAt(i2);
                int i3 = i2;
                DeejungTransferLandingActivity MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver(str, deejungTransferLandingActivity3, childAt, settextappearance, settextappearance3, true);
                if ((childAt.getWidth() == view.getWidth() && childAt.getHeight() == view.getHeight()) && MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                    MediaBrowserCompat$CustomActionResultReceiver2.MediaDescriptionCompat = true;
                }
                i2 = i3 + 1;
            }
        } else {
            DeejungTransferLandingActivity MediaBrowserCompat$CustomActionResultReceiver3 = MediaBrowserCompat$CustomActionResultReceiver(str, deejungTransferLandingActivity3, view, settextappearance, settextappearance3, true);
            if (MediaBrowserCompat$CustomActionResultReceiver3 != null) {
                MediaBrowserCompat$CustomActionResultReceiver3.MediaDescriptionCompat = true;
            }
        }
        return deejungTransferLandingActivity3;
    }

    public final DeejungTransferLandingActivity read(DeejungTransferLandingActivity deejungTransferLandingActivity, DeejungTransferLandingActivity deejungTransferLandingActivity2, String str, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance) {
        IconCompatParcelizer(deejungTransferLandingActivity2);
        if (deejungTransferLandingActivity2 != null) {
            setTextAppearance settextappearance2 = this.read.get(deejungTransferLandingActivity2.MediaBrowserCompat$MediaItem);
            write(deejungTransferLandingActivity2);
            settextappearance.remove(deejungTransferLandingActivity2.ParcelableVolumeInfo);
            deejungTransferLandingActivity.read.remove(deejungTransferLandingActivity2);
            if (settextappearance2 != null) {
                settextappearance2.remove(deejungTransferLandingActivity2.IconCompatParcelizer);
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("Interaction ");
            sb.append(str);
            sb.append(" element removed: ");
            sb.append(deejungTransferLandingActivity2.ParcelableVolumeInfo);
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
        }
        return deejungTransferLandingActivity2;
    }

    public static DeejungTransferLandingActivity read(DeejungTransferLandingActivity deejungTransferLandingActivity, int i, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance) {
        StringBuilder sb = new StringBuilder();
        sb.append(deejungTransferLandingActivity.ParcelableVolumeInfo);
        sb.append("/");
        sb.append(DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer("LI"));
        sb.append(i);
        return settextappearance.get(sb.toString());
    }

    private DeejungTransferLandingActivity write(String str, DeejungTransferLandingActivity deejungTransferLandingActivity, RecyclerView recyclerView, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance, setTextAppearance<View, DeejungTransferLandingActivity> settextappearance2) {
        BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer iconCompatParcelizer;
        String str2 = str;
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity;
        RecyclerView recyclerView2 = recyclerView;
        recyclerView2.MediaBrowserCompat$ItemReceiver(0, 0);
        String MediaBrowserCompat$CustomActionResultReceiver2 = DeejungTransferMinFullConfirmationActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((View) recyclerView);
        if (MediaBrowserCompat$CustomActionResultReceiver2.equals("")) {
            MediaBrowserCompat$CustomActionResultReceiver2 = DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer(recyclerView.getClass().getName());
        }
        DeejungTransferLandingActivity deejungTransferLandingActivity3 = new DeejungTransferLandingActivity(recyclerView2, (String) null, str2);
        deejungTransferLandingActivity3.f3129x50fd9e4a = DeejungTransferMinFullConfirmationActivity_ViewBinding.read((View) recyclerView);
        if (deejungTransferLandingActivity2 == null) {
            deejungTransferLandingActivity3.ParcelableVolumeInfo = str2;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(deejungTransferLandingActivity2.ParcelableVolumeInfo);
            sb.append("/");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2);
            deejungTransferLandingActivity3.ParcelableVolumeInfo = sb.toString();
            deejungTransferLandingActivity2.read.add(deejungTransferLandingActivity3);
            deejungTransferLandingActivity3.MediaSessionCompat$ResultReceiverWrapper = deejungTransferLandingActivity2;
        }
        settextappearance.put(deejungTransferLandingActivity3.ParcelableVolumeInfo, deejungTransferLandingActivity3);
        settextappearance2.put(deejungTransferLandingActivity3.IconCompatParcelizer, deejungTransferLandingActivity3);
        onClickEditSelectedPurchases IconCompatParcelizer2 = BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer(recyclerView);
        if (IconCompatParcelizer2 == null) {
            IconCompatParcelizer2 = new onClickEditSelectedPurchases(str2, this);
            if (recyclerView2 != null) {
                Object tag = recyclerView2.getTag(BankingAgentSuccessActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver);
                if (tag == null) {
                    iconCompatParcelizer = new BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer((byte) 0);
                } else {
                    try {
                        iconCompatParcelizer = (BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer) tag;
                    } catch (ClassCastException unused) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error while trying to obtain view meta information: ");
                        sb2.append(tag.getClass().getName());
                        sb2.append(" can't be casted to ");
                        sb2.append(BankingAgentSuccessActivity_ViewBinding.IconCompatParcelizer.class.getSimpleName());
                        MyECouponActivity_ViewBinding.write(sb2.toString());
                    }
                }
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
                recyclerView2.setTag(BankingAgentSuccessActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer);
            }
        }
        IconCompatParcelizer2.read = true;
        HashSet hashSet = this.IconCompatParcelizer.get(str2);
        if (hashSet != null) {
            hashSet.add(IconCompatParcelizer2);
        }
        int read2 = RecyclerView.read(recyclerView2.getChildAt(0));
        int i = 0;
        for (int childCount = recyclerView.getChildCount() - 1; i <= childCount; childCount = childCount) {
            MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity3, str, recyclerView2.getChildAt(i), i + read2, settextappearance, settextappearance2, "LI", "ListItem");
            i++;
        }
        return deejungTransferLandingActivity3;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, View view) {
        if (this.MediaBrowserCompat$CustomActionResultReceiver.containsKey(str) && this.MediaBrowserCompat$CustomActionResultReceiver.get(str).IconCompatParcelizer == view) {
            this.write.remove(str);
            this.read.remove(str);
            HashSet remove = this.IconCompatParcelizer.remove(str);
            if (remove != null) {
                Iterator it = remove.iterator();
                while (it.hasNext()) {
                    ((FragmentBuilder_BindHmlNTBLoanSetupFragment) it.next()).IconCompatParcelizer();
                }
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(String str, BaseResponse baseResponse) {
        Trackers[] trackers;
        setTextAppearance settextappearance;
        if (baseResponse != null && str != null && this.write.containsKey(str) && (trackers = baseResponse.getTrackers()) != null && trackers.length != 0 && (settextappearance = this.write.get(str)) != null) {
            for (int i = 0; i < trackers.length; i++) {
                if (settextappearance.containsKey(trackers[i].getPath())) {
                    DeejungTransferLandingActivity deejungTransferLandingActivity = (DeejungTransferLandingActivity) settextappearance.get(trackers[i].getPath());
                    deejungTransferLandingActivity.MediaSessionCompat$Token = false;
                    onSaveClick.IconCompatParcelizer(deejungTransferLandingActivity.IconCompatParcelizer);
                }
            }
        }
    }

    static void read(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        MyQRCoachMarkActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity, FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater());
    }

    static boolean MediaBrowserCompat$CustomActionResultReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity, Trackers[] trackersArr) {
        if (trackersArr != null) {
            for (Trackers path : trackersArr) {
                String path2 = path.getPath();
                if (path2.endsWith("*")) {
                    path2 = path2.substring(0, path2.lastIndexOf(42));
                }
                if (deejungTransferLandingActivity.ParcelableVolumeInfo.startsWith(path2)) {
                    return false;
                }
            }
        }
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper;
        while (deejungTransferLandingActivity2 != null) {
            ECouponSuccessfulActivity eCouponSuccessfulActivity = deejungTransferLandingActivity2.f3129x50fd9e4a;
            deejungTransferLandingActivity2 = deejungTransferLandingActivity2.MediaSessionCompat$ResultReceiverWrapper;
            if (MediaBrowserCompat$CustomActionResultReceiver(eCouponSuccessfulActivity)) {
                return false;
            }
        }
        if (!deejungTransferLandingActivity.f3129x50fd9e4a.read) {
            ECouponSuccessfulActivity eCouponSuccessfulActivity2 = deejungTransferLandingActivity.f3129x50fd9e4a;
            if (!(eCouponSuccessfulActivity2.MediaBrowserCompat$ItemReceiver || eCouponSuccessfulActivity2.MediaBrowserCompat$CustomActionResultReceiver || eCouponSuccessfulActivity2.read)) {
                return false;
            }
        }
        if (!deejungTransferLandingActivity.ParcelableVolumeInfo.contains("*")) {
            return true;
        }
        return false;
    }

    static String MediaBrowserCompat$CustomActionResultReceiver(View view) {
        String MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(view);
        while (MediaBrowserCompat$CustomActionResultReceiver2 == null && view != null) {
            ViewParent parent = view.getParent();
            if (parent == null || !(parent instanceof ViewGroup)) {
                view = null;
            } else {
                view = (View) parent;
                MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(view);
            }
        }
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    private void read(String str, String str2) {
        if (this.write.containsKey(str2)) {
            DeejungTransferLandingActivity deejungTransferLandingActivity = (DeejungTransferLandingActivity) this.write.get(str2).get(str);
            this.write.get(str2).remove(str);
            if (deejungTransferLandingActivity != null) {
                this.read.get(str2).remove(deejungTransferLandingActivity.IconCompatParcelizer);
                if (deejungTransferLandingActivity.read != null) {
                    for (int i = 0; i < deejungTransferLandingActivity.read.size(); i++) {
                        read(deejungTransferLandingActivity.read.get(i).ParcelableVolumeInfo, str2);
                    }
                    deejungTransferLandingActivity.read.clear();
                }
            }
        }
    }

    static boolean MediaBrowserCompat$CustomActionResultReceiver(ECouponSuccessfulActivity eCouponSuccessfulActivity) {
        return eCouponSuccessfulActivity != null && (eCouponSuccessfulActivity.MediaMetadataCompat.equals("LV") || eCouponSuccessfulActivity.MediaMetadataCompat.equals("GV") || eCouponSuccessfulActivity.MediaMetadataCompat.equals("RV") || eCouponSuccessfulActivity.MediaMetadataCompat.equals("STCV") || eCouponSuccessfulActivity.MediaMetadataCompat.equals("TAL") || eCouponSuccessfulActivity.MediaMetadataCompat.equals("TH"));
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance) {
        if (deejungTransferLandingActivity != null) {
            settextappearance.put(deejungTransferLandingActivity.ParcelableVolumeInfo, deejungTransferLandingActivity);
            for (int i = 0; i < deejungTransferLandingActivity.read.size(); i++) {
                MediaBrowserCompat$CustomActionResultReceiver(deejungTransferLandingActivity.read.get(i), settextappearance);
            }
        }
    }

    public static DeejungTransferLandingActivity MediaBrowserCompat$ItemReceiver(String str, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (DeejungTransferMinFullConfirmationActivity_ViewBinding.write(str, deejungTransferLandingActivity.ParcelableVolumeInfo) || ECouponDetailActivity.MediaBrowserCompat$ItemReceiver(str).matcher(deejungTransferLandingActivity.ParcelableVolumeInfo).matches()) {
            return deejungTransferLandingActivity;
        }
        for (int i = 0; i < deejungTransferLandingActivity.read.size(); i++) {
            DeejungTransferLandingActivity MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(str, deejungTransferLandingActivity.read.get(i));
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                return MediaBrowserCompat$ItemReceiver2;
            }
        }
        return null;
    }

    static ArrayList<DeejungTransferLandingActivity> MediaBrowserCompat$CustomActionResultReceiver(String str, DeejungTransferLandingActivity deejungTransferLandingActivity, ArrayList<DeejungTransferLandingActivity> arrayList) {
        ArrayList arrayList2 = deejungTransferLandingActivity.read;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            DeejungTransferLandingActivity MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(str, (DeejungTransferLandingActivity) arrayList2.get(i));
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                arrayList.add(MediaBrowserCompat$ItemReceiver2);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public final DeejungTransferLandingActivity read(DeejungTransferLandingActivity deejungTransferLandingActivity, View view) {
        if (view == null) {
            return null;
        }
        if ((view == null || view.getParent() == null) ? false : deejungTransferLandingActivity.IconCompatParcelizer.equals(view.getParent())) {
            return deejungTransferLandingActivity;
        }
        for (int i = 0; i < deejungTransferLandingActivity.read.size(); i++) {
            if (read(deejungTransferLandingActivity.read.get(i), view) != null) {
                return deejungTransferLandingActivity.read.get(i);
            }
        }
        return null;
    }

    private DeejungTransferLandingActivity IconCompatParcelizer(String str, DeejungTransferLandingActivity deejungTransferLandingActivity, ViewGroup viewGroup, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance, setTextAppearance<View, DeejungTransferLandingActivity> settextappearance2) {
        DeejungTransferLandingActivity deejungTransferLandingActivity2;
        int i = 0;
        while (true) {
            if (i >= deejungTransferLandingActivity.read.size()) {
                deejungTransferLandingActivity2 = null;
                break;
            } else if (deejungTransferLandingActivity.read.get(i).IconCompatParcelizer == viewGroup) {
                deejungTransferLandingActivity2 = deejungTransferLandingActivity.read.get(i);
                deejungTransferLandingActivity2.read.clear();
                break;
            } else {
                i++;
            }
        }
        if (deejungTransferLandingActivity2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(deejungTransferLandingActivity.ParcelableVolumeInfo);
            sb.append("/");
            sb.append("STS");
            DeejungTransferLandingActivity deejungTransferLandingActivity3 = new DeejungTransferLandingActivity(viewGroup, sb.toString(), str);
            deejungTransferLandingActivity3.f3129x50fd9e4a = DeejungTransferMinFullConfirmationActivity_ViewBinding.read("SlidingTabStrip");
            deejungTransferLandingActivity.write(deejungTransferLandingActivity3.ParcelableVolumeInfo);
            deejungTransferLandingActivity.read.add(deejungTransferLandingActivity3);
            deejungTransferLandingActivity3.MediaSessionCompat$ResultReceiverWrapper = deejungTransferLandingActivity;
            settextappearance.put(deejungTransferLandingActivity3.ParcelableVolumeInfo, deejungTransferLandingActivity3);
            settextappearance2.put(deejungTransferLandingActivity3.IconCompatParcelizer, deejungTransferLandingActivity3);
            deejungTransferLandingActivity2 = deejungTransferLandingActivity3;
        }
        deejungTransferLandingActivity2.read.clear();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
            MediaBrowserCompat$ItemReceiver(str, deejungTransferLandingActivity2, (ViewGroup) viewGroup.getChildAt(i2), i2, settextappearance, settextappearance2);
        }
        return deejungTransferLandingActivity2;
    }

    private DeejungTransferLandingActivity MediaBrowserCompat$ItemReceiver(String str, DeejungTransferLandingActivity deejungTransferLandingActivity, ViewGroup viewGroup, int i, setTextAppearance<String, DeejungTransferLandingActivity> settextappearance, setTextAppearance<View, DeejungTransferLandingActivity> settextappearance2) {
        int i2;
        DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity;
        ViewGroup viewGroup2 = viewGroup;
        setTextAppearance<String, DeejungTransferLandingActivity> settextappearance3 = settextappearance;
        setTextAppearance<View, DeejungTransferLandingActivity> settextappearance4 = settextappearance2;
        int i3 = i;
        if (i3 == -1) {
            i2 = 0;
            while (true) {
                if (i2 >= ((ViewGroup) deejungTransferLandingActivity2.IconCompatParcelizer).getChildCount()) {
                    break;
                } else if (((ViewGroup) deejungTransferLandingActivity2.IconCompatParcelizer).getChildAt(i2) == viewGroup2) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        i2 = i3;
        StringBuilder sb = new StringBuilder();
        sb.append(deejungTransferLandingActivity2.ParcelableVolumeInfo);
        sb.append("/");
        sb.append(DeejungTransferMinFullConfirmationActivity_ViewBinding.IconCompatParcelizer("SupportTabItem"));
        sb.append(i2);
        String str2 = str;
        DeejungTransferLandingActivity deejungTransferLandingActivity3 = new DeejungTransferLandingActivity(viewGroup2, sb.toString(), str);
        deejungTransferLandingActivity3.RatingCompat = true;
        int i4 = 0;
        while (i4 < settextappearance.size()) {
            if (((String) settextappearance3.read[i4 << 1]).contains(deejungTransferLandingActivity3.ParcelableVolumeInfo)) {
                settextappearance3.write(i4);
                i4--;
            }
            i4++;
        }
        int i5 = 0;
        while (i5 < settextappearance2.size()) {
            if (((DeejungTransferLandingActivity) settextappearance4.read[(i5 << 1) + 1]).ParcelableVolumeInfo.contains(deejungTransferLandingActivity3.ParcelableVolumeInfo)) {
                settextappearance4.write(i5);
                i5--;
            }
            i5++;
        }
        deejungTransferLandingActivity3.write(deejungTransferLandingActivity3.ParcelableVolumeInfo);
        deejungTransferLandingActivity3.f3129x50fd9e4a = DeejungTransferMinFullConfirmationActivity_ViewBinding.read("SupportTabItem");
        deejungTransferLandingActivity2.read.add(deejungTransferLandingActivity3);
        deejungTransferLandingActivity3.MediaSessionCompat$ResultReceiverWrapper = deejungTransferLandingActivity2;
        settextappearance3.put(deejungTransferLandingActivity3.ParcelableVolumeInfo, deejungTransferLandingActivity3);
        settextappearance4.put(deejungTransferLandingActivity3.IconCompatParcelizer, deejungTransferLandingActivity3);
        for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
            MediaBrowserCompat$CustomActionResultReceiver(str, deejungTransferLandingActivity3, viewGroup2.getChildAt(i6), settextappearance, settextappearance2, true);
        }
        return deejungTransferLandingActivity3;
    }

    static void write(DeejungTransferLandingActivity deejungTransferLandingActivity, Captures[] capturesArr, Trackers trackers) {
        if (deejungTransferLandingActivity != null && capturesArr != null && trackers != null) {
            if (deejungTransferLandingActivity.f3129x50fd9e4a.MediaMetadataCompat.equals("LI") || deejungTransferLandingActivity.f3129x50fd9e4a.MediaMetadataCompat.equals("AMIV")) {
                DeejungTransferLandingActivity deejungTransferLandingActivity2 = deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper;
                if (deejungTransferLandingActivity2.f3129x50fd9e4a.MediaBrowserCompat$ItemReceiver) {
                    MyQRCoachMarkActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity2, FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater());
                }
            } else if (deejungTransferLandingActivity.f3129x50fd9e4a.MediaMetadataCompat.equals("STI")) {
                while (!(deejungTransferLandingActivity.IconCompatParcelizer instanceof TabLayout) && !(deejungTransferLandingActivity.IconCompatParcelizer instanceof ScrollingTabContainerView) && deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper != null) {
                    deejungTransferLandingActivity = deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper;
                }
                if ((deejungTransferLandingActivity.IconCompatParcelizer instanceof TabLayout) || (deejungTransferLandingActivity.IconCompatParcelizer instanceof ScrollingTabContainerView)) {
                    MyQRCoachMarkActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity, FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater());
                }
            } else if (deejungTransferLandingActivity.f3129x50fd9e4a.MediaMetadataCompat.equals("TI")) {
                while (!(deejungTransferLandingActivity.IconCompatParcelizer instanceof TabHost) && deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper != null) {
                    deejungTransferLandingActivity = deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper;
                }
                if ((deejungTransferLandingActivity.IconCompatParcelizer instanceof TabHost) && deejungTransferLandingActivity.f3129x50fd9e4a.MediaBrowserCompat$ItemReceiver) {
                    MyQRCoachMarkActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity, FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater());
                }
            } else {
                boolean z = false;
                if (((deejungTransferLandingActivity.IconCompatParcelizer instanceof RadioButton) || (deejungTransferLandingActivity.IconCompatParcelizer instanceof RadioGroup)) && capturesArr.length > 0) {
                    int i = 0;
                    while (true) {
                        if (i >= capturesArr.length) {
                            break;
                        } else if (capturesArr[i].getPath().equals(deejungTransferLandingActivity.ParcelableVolumeInfo)) {
                            z = true;
                            break;
                        } else {
                            i++;
                        }
                    }
                    if (!z && deejungTransferLandingActivity.f3129x50fd9e4a.MediaBrowserCompat$ItemReceiver) {
                        MyQRCoachMarkActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity, FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater());
                        return;
                    }
                    return;
                }
                if (deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper != null && deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper.f3129x50fd9e4a.MediaMetadataCompat.equals("LI")) {
                    View view = deejungTransferLandingActivity.IconCompatParcelizer;
                    View view2 = deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer;
                    if (view.getWidth() == view2.getWidth() && view.getHeight() == view2.getHeight()) {
                        z = true;
                    }
                    if (z) {
                        deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper.MediaSessionCompat$Token = true;
                        DeejungTransferLandingActivity deejungTransferLandingActivity3 = deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper.MediaSessionCompat$ResultReceiverWrapper;
                        if (deejungTransferLandingActivity3.f3129x50fd9e4a.MediaBrowserCompat$ItemReceiver) {
                            MyQRCoachMarkActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity3, FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater());
                        }
                        trackers.setPath(deejungTransferLandingActivity.MediaSessionCompat$ResultReceiverWrapper.ParcelableVolumeInfo);
                        return;
                    }
                }
                if (deejungTransferLandingActivity.f3129x50fd9e4a.MediaBrowserCompat$ItemReceiver) {
                    MyQRCoachMarkActivity.MediaBrowserCompat$ItemReceiver(deejungTransferLandingActivity, FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater());
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity != null && deejungTransferLandingActivity.read != null) {
            for (int i = 0; i < deejungTransferLandingActivity.read.size(); i++) {
                read(deejungTransferLandingActivity.read.get(i).ParcelableVolumeInfo, deejungTransferLandingActivity.MediaBrowserCompat$MediaItem);
            }
            deejungTransferLandingActivity.read.clear();
        }
    }

    private void IconCompatParcelizer(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity != null && deejungTransferLandingActivity.IconCompatParcelizer != null) {
            onSaveClick.IconCompatParcelizer(deejungTransferLandingActivity.IconCompatParcelizer);
            for (int i = 0; i < deejungTransferLandingActivity.read.size(); i++) {
                IconCompatParcelizer(deejungTransferLandingActivity.read.get(i));
            }
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        BaseResponse IconCompatParcelizer2;
        Trackers[] trackers;
        if (deejungTransferLandingActivity != null && (IconCompatParcelizer2 = FragmentBuilder_BindHmlIssuerLandingFragment.IconCompatParcelizer(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem)) != null && (trackers = IconCompatParcelizer2.getTrackers()) != null && trackers.length != 0) {
            for (Trackers path : trackers) {
                DeejungTransferLandingActivity MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(path.getPath(), deejungTransferLandingActivity);
                if (MediaBrowserCompat$ItemReceiver2 != null) {
                    if (MediaBrowserCompat$ItemReceiver2 == deejungTransferLandingActivity) {
                        MediaBrowserCompat$ItemReceiver2.MediaSessionCompat$Token = true;
                    } else if (MediaBrowserCompat$ItemReceiver2.f3129x50fd9e4a.MediaBrowserCompat$ItemReceiver) {
                        MyQRCoachMarkActivity.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2, FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater());
                    }
                }
            }
        }
    }
}
