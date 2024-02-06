package p040o;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Map;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;

/* renamed from: o.BondSelectionActivity */
public class BondSelectionActivity {
    static final Integer IconCompatParcelizer = 3;
    static final Integer MediaBrowserCompat$CustomActionResultReceiver = 5;
    static final Integer MediaBrowserCompat$ItemReceiver = 0;
    private static final Float MediaBrowserCompat$MediaItem = Float.valueOf(0.5f);
    static final Integer MediaBrowserCompat$SearchResultReceiver = 4;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static BondSelectionActivity f3126x50fd9e4a;
    private static Integer MediaDescriptionCompat = 6;
    private static final setTextAppearance<Integer, Integer> MediaSessionCompat$Token;
    static final Integer read = 1;
    static final Integer write = 2;
    ArrayList<View> MediaMetadataCompat = new ArrayList<>();
    Map<String, View> RatingCompat = new setTextAppearance();

    static /* synthetic */ void read() {
    }

    static {
        setTextAppearance<Integer, Integer> settextappearance = new setTextAppearance<>();
        MediaSessionCompat$Token = settextappearance;
        settextappearance.put(1, Integer.valueOf(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_highlight_area_background));
        MediaSessionCompat$Token.put(7, Integer.valueOf(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_highlight_area_background_with_green_border));
        MediaSessionCompat$Token.put(9, Integer.valueOf(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_blue_border_for_interaction));
        MediaSessionCompat$Token.put(2, Integer.valueOf(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_highlight_tracked_element_background));
        MediaSessionCompat$Token.put(3, Integer.valueOf(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_highlight_element_green_border_fill));
        MediaSessionCompat$Token.put(4, Integer.valueOf(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_highlight_element_orange_border_fill));
        MediaSessionCompat$Token.put(5, Integer.valueOf(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_highlight_tracked_element_background));
        MediaSessionCompat$Token.put(6, Integer.valueOf(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_highlight_untracked_element_background));
        MediaSessionCompat$Token.put(8, Integer.valueOf(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_highlight_preview_mode_border));
        MediaSessionCompat$Token.put(10, Integer.valueOf(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.MediaDescriptionCompat.th_highlight_element_green_border));
    }

    public static BondSelectionActivity MediaBrowserCompat$CustomActionResultReceiver() {
        BondSelectionActivity bondSelectionActivity;
        synchronized (BondSelectionActivity.class) {
            if (f3126x50fd9e4a == null) {
                f3126x50fd9e4a = new BondSelectionActivity();
            }
            bondSelectionActivity = f3126x50fd9e4a;
        }
        return bondSelectionActivity;
    }

    private BondSelectionActivity() {
    }

    private static View MediaBrowserCompat$CustomActionResultReceiver(Activity activity, View view) {
        ViewGroup read2 = read(activity);
        if (read2 == null) {
            return view;
        }
        int[] iArr = new int[2];
        read2.getLocationOnScreen(iArr);
        if (!(iArr[0] == 0 && iArr[1] == 0)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int i = layoutParams.topMargin;
            layoutParams.leftMargin -= iArr[0];
            layoutParams.topMargin = i - iArr[1];
            view.setLayoutParams(layoutParams);
        }
        return view;
    }

    static void IconCompatParcelizer(Activity activity, View view) {
        ViewGroup read2 = read(activity);
        if (read2 != null) {
            read2.removeView(view);
        }
    }

    public static ViewGroup read(Activity activity) {
        if (activity == null) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        if (iArr[0] == 0 && iArr[1] == 0) {
            return viewGroup;
        }
        ViewGroup viewGroup2 = (ViewGroup) activity.findViewById(16908290).getRootView();
        int[] iArr2 = new int[2];
        viewGroup2.getLocationOnScreen(iArr2);
        while (true) {
            if (!((iArr2[0] == 0 && iArr2[1] == 0) || viewGroup2.getParent() == null || !(viewGroup2.getParent() instanceof ViewGroup))) {
                viewGroup2 = (ViewGroup) viewGroup2.getParent();
                iArr2 = new int[2];
                viewGroup2.getLocationOnScreen(iArr2);
            }
        }
        return viewGroup2;
    }

    public static View write(Activity activity) {
        return ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
    }

    public static int[] MediaBrowserCompat$ItemReceiver(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    static View MediaBrowserCompat$ItemReceiver(int i, Activity activity, int i2, int i3, int i4, int i5, int[] iArr) {
        View read2 = read(activity, i2, i3, i4, i5, iArr);
        read2.setAlpha(1.0f);
        Integer num = MediaSessionCompat$Token.get(Integer.valueOf(i));
        if (num != null) {
            read2.setBackgroundResource(num.intValue());
        }
        return read2;
    }

    /* access modifiers changed from: package-private */
    public final void write(Activity activity, String str, View view) {
        this.RatingCompat.put(str, view);
        this.MediaMetadataCompat.add(view);
        ViewGroup read2 = read(activity);
        if (read2 != null) {
            read2.addView(view);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(Activity activity) {
        for (int i = 0; i < this.MediaMetadataCompat.size(); i++) {
            View view = this.MediaMetadataCompat.get(i);
            ViewGroup read2 = read(activity);
            if (read2 != null) {
                read2.removeView(view);
            }
        }
        this.MediaMetadataCompat.clear();
        this.RatingCompat.clear();
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer() {
        for (int i = 0; i < this.MediaMetadataCompat.size(); i++) {
            this.MediaMetadataCompat.get(i).setVisibility(8);
        }
    }

    static View IconCompatParcelizer(int i, Activity activity, DeejungTransferLandingActivity deejungTransferLandingActivity, int[] iArr) {
        return MediaBrowserCompat$ItemReceiver(i, activity, deejungTransferLandingActivity.MediaBrowserCompat$SearchResultReceiver.write[0], deejungTransferLandingActivity.MediaBrowserCompat$SearchResultReceiver.write[1], deejungTransferLandingActivity.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer[0], deejungTransferLandingActivity.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer[1], iArr);
    }

    static int[] IconCompatParcelizer(Activity activity, int i, int i2) {
        View MediaBrowserCompat$CustomActionResultReceiver2 = AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(activity, ((ViewGroup) activity.findViewById(16908290)).getChildAt(0));
        ArrayList arrayList = new ArrayList();
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver2);
        }
        arrayList.add(((ViewGroup) activity.findViewById(16908290)).getChildAt(0));
        OnBoardingTutorialActivity MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver();
        int[] iArr = {EasycashNcbCaseModule.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2), EasycashNcbCaseModule.read(MediaBrowserCompat$ItemReceiver2)};
        int[] iArr2 = new int[MediaDescriptionCompat.intValue()];
        iArr2[MediaBrowserCompat$ItemReceiver.intValue()] = i;
        iArr2[read.intValue()] = iArr[1] - iArr[0];
        iArr2[write.intValue()] = i2;
        iArr2[IconCompatParcelizer.intValue()] = iArr[0];
        iArr2[MediaBrowserCompat$SearchResultReceiver.intValue()] = iArr[0];
        iArr2[MediaBrowserCompat$CustomActionResultReceiver.intValue()] = iArr[1];
        return iArr2;
    }

    static View read(Activity activity, int i, int i2, int i3, int i4, int[] iArr) {
        View inflate = LayoutInflater.from(AlertController$RecycleListView.MediaDescriptionCompat((Context) activity)).inflate(C6554xc460715d.th_element_highlight, (ViewGroup) null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        if (i4 >= iArr[0] && i4 + i2 <= iArr[1]) {
            layoutParams.height = i2;
        } else if (i4 < iArr[0]) {
            layoutParams.height = (i2 - iArr[0]) + i4;
            i4 = iArr[0];
        } else {
            layoutParams.height = iArr[1] - i4;
        }
        layoutParams.width = i;
        layoutParams.leftMargin = i3;
        layoutParams.topMargin = i4;
        inflate.setAlpha(MediaBrowserCompat$MediaItem.floatValue());
        inflate.setLayoutParams(layoutParams);
        return MediaBrowserCompat$CustomActionResultReceiver(activity, inflate);
    }
}
