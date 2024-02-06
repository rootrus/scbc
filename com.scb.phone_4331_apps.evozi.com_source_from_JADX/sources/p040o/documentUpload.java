package p040o;

import android.widget.CheckBox;
import com.scb.phone.view.fragment.customizeyourpages.CustomizeYourPageFragment;

/* renamed from: o.documentUpload */
public final /* synthetic */ class documentUpload implements FragmentBuilder_BindBilledDetailFragment {
    private final /* synthetic */ CustomizeYourPageFragment write;

    public /* synthetic */ documentUpload(CustomizeYourPageFragment customizeYourPageFragment) {
        this.write = customizeYourPageFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CustomizeYourPageFragment customizeYourPageFragment = this.write;
        buildUnexpectedTypeError buildunexpectedtypeerror = customizeYourPageFragment.customizeYourPagePresenter;
        getUnsafeInstance getunsafeinstance = new getUnsafeInstance(buildunexpectedtypeerror);
        if (buildunexpectedtypeerror.RatingCompat != null) {
            getunsafeinstance.IconCompatParcelizer(buildunexpectedtypeerror.RatingCompat);
        }
        CheckBox checkBox = customizeYourPageFragment.applyTheme.checkBox;
        checkBox.setChecked(!checkBox.isChecked());
    }
}
