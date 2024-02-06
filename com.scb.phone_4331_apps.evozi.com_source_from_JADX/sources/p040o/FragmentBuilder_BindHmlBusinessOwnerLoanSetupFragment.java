package p040o;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentController;
import android.os.Build;
import android.view.View;
import java.lang.reflect.Field;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindHmlBusinessOwnerLoanSetupFragment */
class FragmentBuilder_BindHmlBusinessOwnerLoanSetupFragment extends FragmentBuilder_BindHmlBusinessOwnerProgressFragment<Fragment> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ List IconCompatParcelizer(Object obj) {
        return MediaBrowserCompat$CustomActionResultReceiver((Fragment) obj);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ View write(Object obj) {
        return ((Fragment) obj).getView();
    }

    FragmentBuilder_BindHmlBusinessOwnerLoanSetupFragment(Activity activity, FragmentBuilder_BindHmlBusinessOwnerResubmissionFragment fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment) {
        super(activity, fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment);
    }

    /* access modifiers changed from: protected */
    public final List<Fragment> IconCompatParcelizer(Activity activity) {
        try {
            Class cls = activity.getClass();
            while (cls != Activity.class) {
                cls = cls.getSuperclass();
            }
            Field declaredField = cls.getDeclaredField("mFragments");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(activity);
            if (!"android.app.FragmentManagerImpl".equals(obj.getClass().getName()) && Build.VERSION.SDK_INT >= 23) {
                obj = ((FragmentController) obj).getFragmentManager();
            }
            Field declaredField2 = Class.forName("android.app.FragmentManagerImpl").getDeclaredField("mActive");
            declaredField2.setAccessible(true);
            return AlertController$RecycleListView.write(declaredField2.get(obj));
        } catch (ClassCastException unused) {
            new DeejungTransferMinFullReviewActivity();
            MyECouponActivity_ViewBinding.write(DeejungTransferMinFullReviewActivity.read(activity, 22));
            return null;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            StringBuilder sb = new StringBuilder();
            sb.append(FragmentBuilder_BindHmlBusinessOwnerLoanSetupFragment.class.getSimpleName());
            sb.append(" failed to get fragments list");
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }

    private static List<Fragment> MediaBrowserCompat$CustomActionResultReceiver(Fragment fragment) {
        try {
            Class cls = fragment.getClass();
            while (cls != Fragment.class) {
                cls = cls.getSuperclass();
            }
            Field declaredField = cls.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(fragment);
            if (obj == null) {
                return null;
            }
            Field declaredField2 = Class.forName("android.app.FragmentManagerImpl").getDeclaredField("mActive");
            declaredField2.setAccessible(true);
            return AlertController$RecycleListView.write(declaredField2.get(obj));
        } catch (Exception e) {
            e.printStackTrace();
            StringBuilder sb = new StringBuilder();
            sb.append(FragmentBuilder_BindHmlBusinessOwnerLoanSetupFragment.class.getSimpleName());
            sb.append(" failed to get nested fragments list");
            MyECouponActivity_ViewBinding.write(sb.toString());
            return null;
        }
    }
}
