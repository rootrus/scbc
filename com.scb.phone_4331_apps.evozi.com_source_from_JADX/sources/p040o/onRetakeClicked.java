package p040o;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.thunderhead.android.infrastructure.p057ui.views.TTFAppCompatRadioButton;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;

/* renamed from: o.onRetakeClicked */
public final class onRetakeClicked extends RecyclerView.setContentView {
    public final TTFAppCompatRadioButton AlertController$RecycleListView;
    private View Keep;

    public onRetakeClicked(View view) {
        super(view);
        this.AlertController$RecycleListView = (TTFAppCompatRadioButton) view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_view_list_item_checkable_radiobutton);
        this.Keep = view.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.th_divider);
        TTFAppCompatRadioButton tTFAppCompatRadioButton = this.AlertController$RecycleListView;
        int read = tTFAppCompatRadioButton.IconCompatParcelizer.read(CropDocumentActivity_ViewBinding.RIGHT);
        int i = (int) (((float) read) * 0.15f);
        View view2 = this.Keep;
        int paddingTop = view2.getPaddingTop();
        int paddingRight = this.Keep.getPaddingRight();
        int paddingBottom = this.Keep.getPaddingBottom();
        if (view2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) view2.getLayoutParams()).setMargins(read, paddingTop, paddingRight, paddingBottom);
            view2.requestLayout();
        }
        view2.setPadding(read, paddingTop, paddingRight, paddingBottom);
        TTFAppCompatRadioButton tTFAppCompatRadioButton2 = this.AlertController$RecycleListView;
        tTFAppCompatRadioButton2.setPadding(i, tTFAppCompatRadioButton2.getPaddingTop(), this.AlertController$RecycleListView.getPaddingRight(), this.AlertController$RecycleListView.getBottom());
    }
}
