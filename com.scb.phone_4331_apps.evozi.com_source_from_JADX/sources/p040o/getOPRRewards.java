package p040o;

import com.scb.phone.view.adapter.ccrredemption.CategoriesListAdapter;
import com.scb.phone.view.fragment.ccrredemption.categories.CategoriesListFragment;

/* renamed from: o.getOPRRewards */
public final class getOPRRewards implements MileageQuantitySelectionActivity<CategoriesListFragment> {
    public static void write(CategoriesListFragment categoriesListFragment, shouldSkipField shouldskipfield) {
        categoriesListFragment.categoryListPresenter = shouldskipfield;
    }

    public static void MediaBrowserCompat$ItemReceiver(CategoriesListFragment categoriesListFragment, CategoriesListAdapter categoriesListAdapter) {
        categoriesListFragment.categoriesListAdapter = categoriesListAdapter;
    }

    public static void write(CategoriesListFragment categoriesListFragment, setFieldNamingStrategy setfieldnamingstrategy) {
        categoriesListFragment.oprPresenter = setfieldnamingstrategy;
    }
}
