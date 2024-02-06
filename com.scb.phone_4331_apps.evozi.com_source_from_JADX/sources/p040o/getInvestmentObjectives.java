package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.fragment.ccrredemption.product.ProductListFragment;

/* renamed from: o.getInvestmentObjectives */
public final /* synthetic */ class getInvestmentObjectives implements Runnable {
    private final /* synthetic */ ProductListFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getInvestmentObjectives(ProductListFragment productListFragment) {
        this.MediaBrowserCompat$ItemReceiver = productListFragment;
    }

    public final void run() {
        int i;
        ProductListFragment productListFragment = this.MediaBrowserCompat$ItemReceiver;
        RecyclerView recyclerView = productListFragment.rcvProductList;
        RecyclerView recyclerView2 = productListFragment.rcvProductList;
        View childAt = recyclerView2.getChildAt(recyclerView2.AppCompatActivity.MediaSessionCompat$ResultReceiverWrapper() - 2);
        int i2 = 0;
        if (childAt != null) {
            i = childAt.getHeight();
        } else {
            i = 0;
        }
        RecyclerView recyclerView3 = productListFragment.rcvProductList;
        View childAt2 = recyclerView3.getChildAt(recyclerView3.AppCompatActivity.MediaSessionCompat$ResultReceiverWrapper() - 2);
        if (childAt2 != null) {
            i2 = childAt2.getHeight();
        }
        recyclerView.scrollBy(i, i2);
    }
}
