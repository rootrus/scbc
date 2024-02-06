package p040o;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindHmlBusinessOwnerOutcomeApproveFragment */
final class FragmentBuilder_BindHmlBusinessOwnerOutcomeApproveFragment extends FragmentBuilder_BindHmlBusinessOwnerProgressFragment<Fragment> {
    /* access modifiers changed from: protected */
    public final /* synthetic */ View write(Object obj) {
        return ((Fragment) obj).getView();
    }

    FragmentBuilder_BindHmlBusinessOwnerOutcomeApproveFragment(Activity activity, FragmentBuilder_BindHmlBusinessOwnerResubmissionFragment fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment) {
        super(activity, fragmentBuilder_BindHmlBusinessOwnerResubmissionFragment);
    }

    private static List<Fragment> MediaBrowserCompat$CustomActionResultReceiver(setTitleMarginStart settitlemarginstart) {
        try {
            Method declaredMethod = Class.forName("o.setTitleMarginStart").getDeclaredMethod("getActiveFragments", new Class[0]);
            declaredMethod.setAccessible(true);
            return AlertController$RecycleListView.write(declaredMethod.invoke(settitlemarginstart, new Object[0]));
        } catch (NoSuchMethodException e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindLtfTabFragment.NO_SUCH_METHOD);
            return new ArrayList();
        } catch (ClassNotFoundException e2) {
            MyECouponActivity_ViewBinding.read(e2, FragmentBuilder_BindLtfTabFragment.CLASS_NOT_FOUND);
            return new ArrayList();
        } catch (IllegalAccessException e3) {
            MyECouponActivity_ViewBinding.read(e3, FragmentBuilder_BindLtfTabFragment.ILLEGAL_ACCESS);
            return new ArrayList();
        } catch (InvocationTargetException e4) {
            MyECouponActivity_ViewBinding.read(e4, FragmentBuilder_BindLtfTabFragment.INVOCATION_ERROR);
            return new ArrayList();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: MediaBrowserCompat$ItemReceiver */
    public List<Fragment> IconCompatParcelizer(Fragment fragment) {
        try {
            setTitleMarginStart write = write(fragment);
            if (write == null) {
                return null;
            }
            Field declaredField = Class.forName("o.setLayoutResource").getDeclaredField("mActive");
            declaredField.setAccessible(true);
            return AlertController$RecycleListView.write(declaredField.get(write));
        } catch (NoSuchFieldException unused) {
            setTitleMarginStart write2 = write(fragment);
            if (write2 == null) {
                return new ArrayList();
            }
            return MediaBrowserCompat$CustomActionResultReceiver(write2);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindLtfTabFragment.COULD_NOT_RETRIEVE_FRAGMENTS);
            return null;
        }
    }

    private static setTitleMarginStart write(Fragment fragment) {
        try {
            Class cls = fragment.getClass();
            while (cls != Fragment.class) {
                cls = cls.getSuperclass();
            }
            Field declaredField = cls.getDeclaredField("mChildFragmentManager");
            declaredField.setAccessible(true);
            return (setTitleMarginStart) declaredField.get(fragment);
        } catch (IllegalAccessException e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindLtfTabFragment.ILLEGAL_ACCESS);
            return null;
        } catch (NoSuchFieldException e2) {
            MyECouponActivity_ViewBinding.read(e2, FragmentBuilder_BindLtfTabFragment.NO_SUCH_FIELD);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final List<Fragment> IconCompatParcelizer(Activity activity) {
        try {
            Class cls = activity.getClass();
            while (cls != FragmentActivity.class && cls != null) {
                cls = cls.getSuperclass();
            }
            Field declaredField = cls.getDeclaredField("mFragments");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(activity);
            if (!"o.setLayoutResource".equals(obj.getClass().getName())) {
                obj = ((setTitleTextAppearance) obj).IconCompatParcelizer.write;
            }
            Field declaredField2 = Class.forName("o.setLayoutResource").getDeclaredField("mActive");
            declaredField2.setAccessible(true);
            return AlertController$RecycleListView.write(declaredField2.get(obj));
        } catch (ClassCastException e) {
            MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindLtfTabFragment.CLASS_CAST_ERROR);
            return new ArrayList();
        } catch (NoSuchFieldException unused) {
            if (activity instanceof FragmentActivity) {
                return MediaBrowserCompat$CustomActionResultReceiver(((FragmentActivity) activity).getSupportFragmentManager());
            }
            return new ArrayList();
        } catch (Exception e2) {
            MyECouponActivity_ViewBinding.read(e2, FragmentBuilder_BindLtfTabFragment.COULD_NOT_RETRIEVE_FRAGMENTS);
            return new ArrayList();
        }
    }
}
