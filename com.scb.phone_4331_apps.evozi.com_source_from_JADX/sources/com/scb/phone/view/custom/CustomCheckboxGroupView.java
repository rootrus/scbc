package com.scb.phone.view.custom;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import java.util.Collections;
import p040o.EasycashCardInfoRepositoryModule;
import p040o.getNextTransition;
import p040o.isSupportFragmentClass;
import p040o.lambda$publish$0;
import p040o.setBadgeHidesWhenActive;
import p040o.setInActiveColor;
import p040o.setLastBaselineToBottomHeight;
import p040o.show;
import p040o.validateMortgageEligibility;
import p040o.verifyMortgageFeatures;

public class CustomCheckboxGroupView extends ConstraintLayout {
    public C5792xf293d63d IconCompatParcelizer;
    public boolean MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    RecyclerView childrenContainer;
    @BindView
    public Group childrenGroup;
    @BindView
    CustomCheckboxView mainCheckbox;
    @BindView
    TextView title;
    private EasycashCardInfoRepositoryModule write;

    public CustomCheckboxGroupView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public CustomCheckboxGroupView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CustomCheckboxGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.f81242131493350, this, true);
        ButterKnife.IconCompatParcelizer(this);
        RecyclerView recyclerView = this.childrenContainer;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        EasycashCardInfoRepositoryModule easycashCardInfoRepositoryModule = new EasycashCardInfoRepositoryModule(Collections.emptyList());
        this.write = easycashCardInfoRepositoryModule;
        this.childrenContainer.setAdapter(easycashCardInfoRepositoryModule);
        p040o.Group group = new p040o.Group(getContext());
        Drawable write2 = setLastBaselineToBottomHeight.write(getContext(), R.drawable.rv_divider);
        if (write2 == null) {
            return;
        }
        if (write2 != null) {
            group.MediaBrowserCompat$CustomActionResultReceiver = write2;
            this.childrenContainer.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.RatingCompat) group);
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public void setData(lambda$publish$0 lambda_publish_0) {
        this.title.setText(lambda_publish_0.read);
        this.mainCheckbox.setData(lambda_publish_0.MediaBrowserCompat$CustomActionResultReceiver);
        this.mainCheckbox.setListener(new verifyMortgageFeatures(this, lambda_publish_0));
        if (this.MediaBrowserCompat$CustomActionResultReceiver && !lambda_publish_0.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer) {
            this.childrenGroup.setVisibility(8);
        }
        this.write.MediaBrowserCompat$ItemReceiver = lambda_publish_0.IconCompatParcelizer;
        this.write.IconCompatParcelizer.write();
        this.write.read = new validateMortgageEligibility(this, lambda_publish_0);
    }

    public void setChecked(boolean z) {
        setChecked((String) null, z);
    }

    public void setChecked(String str, boolean z) {
        isSupportFragmentClass issupportfragmentclass;
        if (str != null) {
            EasycashCardInfoRepositoryModule easycashCardInfoRepositoryModule = this.write;
            show show = new show(easycashCardInfoRepositoryModule.MediaBrowserCompat$ItemReceiver);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, new setInActiveColor(str)));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            setBadgeHidesWhenActive setbadgehideswhenactive = new setBadgeHidesWhenActive(easycashCardInfoRepositoryModule, z);
            T t = issupportfragmentclass.IconCompatParcelizer;
            if (t != null) {
                setbadgehideswhenactive.MediaBrowserCompat$ItemReceiver(t);
                return;
            }
            return;
        }
        this.mainCheckbox.setChecked(z);
    }

    public void setListener(C5792xf293d63d customCheckboxGroupView$MediaBrowserCompat$CustomActionResultReceiver) {
        this.IconCompatParcelizer = customCheckboxGroupView$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void setHideChildrenWhenUnchecked(boolean z) {
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
    }
}
