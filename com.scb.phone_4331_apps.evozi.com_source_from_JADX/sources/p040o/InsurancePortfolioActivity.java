package p040o;

import java.lang.reflect.Method;

/* renamed from: o.InsurancePortfolioActivity */
public final class InsurancePortfolioActivity {
    public static final InsurancePortfolioActivity IconCompatParcelizer = new InsurancePortfolioActivity();
    public static final InsurancePortfolioActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver = new InsurancePortfolioActivity$MediaBrowserCompat$ItemReceiver((Method) null, (Method) null, (Method) null);
    public static InsurancePortfolioActivity$MediaBrowserCompat$ItemReceiver read;

    private InsurancePortfolioActivity() {
    }

    public static InsurancePortfolioActivity$MediaBrowserCompat$ItemReceiver write(HmlNTBCropDocumentActivity hmlNTBCropDocumentActivity) {
        try {
            InsurancePortfolioActivity$MediaBrowserCompat$ItemReceiver insurancePortfolioActivity$MediaBrowserCompat$ItemReceiver = new InsurancePortfolioActivity$MediaBrowserCompat$ItemReceiver(Class.class.getDeclaredMethod("getModule", new Class[0]), hmlNTBCropDocumentActivity.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), hmlNTBCropDocumentActivity.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            read = insurancePortfolioActivity$MediaBrowserCompat$ItemReceiver;
            return insurancePortfolioActivity$MediaBrowserCompat$ItemReceiver;
        } catch (Exception unused) {
            InsurancePortfolioActivity$MediaBrowserCompat$ItemReceiver insurancePortfolioActivity$MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver;
            read = insurancePortfolioActivity$MediaBrowserCompat$ItemReceiver2;
            return insurancePortfolioActivity$MediaBrowserCompat$ItemReceiver2;
        }
    }
}
