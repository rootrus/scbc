package p040o;

import android.content.SharedPreferences;
import com.scb.phone.view.fragment.demo.ntb.NTBLifestyleLandingFragment;
import java.io.File;

/* renamed from: o.getBusinessInfoStoreDetails */
public final class getBusinessInfoStoreDetails implements MileageQuantitySelectionActivity<NTBLifestyleLandingFragment> {
    public static void read(NTBLifestyleLandingFragment nTBLifestyleLandingFragment, File file) {
        nTBLifestyleLandingFragment.fileDir = file;
    }

    public static void read(NTBLifestyleLandingFragment nTBLifestyleLandingFragment, nativeConfigureFromFile nativeconfigurefromfile) {
        nTBLifestyleLandingFragment.landingPresenter = nativeconfigurefromfile;
    }

    public static void IconCompatParcelizer(NTBLifestyleLandingFragment nTBLifestyleLandingFragment, SharedPreferences sharedPreferences) {
        nTBLifestyleLandingFragment.sharedPreferences = sharedPreferences;
    }
}
