package com.scb.phone.view.custom.investment.onboarding;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.investment.onboarding.CustomDropdownAwareSpinner;
import java.util.ArrayList;
import java.util.List;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setLastBaselineToBottomHeight;

public class CustomSpinnerWithTitle extends LinearLayout {
    public boolean IconCompatParcelizer = false;
    /* access modifiers changed from: private */
    public int MediaBrowserCompat$CustomActionResultReceiver = R.color.f66402131099796;
    public List<String> MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public IconCompatParcelizer MediaBrowserCompat$MediaItem;
    private int MediaBrowserCompat$SearchResultReceiver = 0;
    /* access modifiers changed from: private */
    public boolean MediaDescriptionCompat = false;
    private int MediaMetadataCompat;
    private String MediaSessionCompat$QueueItem;
    private View.OnClickListener MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public String RatingCompat;
    @BindView
    public RelativeLayout containerSpinner;
    @BindView
    ImageView iconImage;
    @BindView
    ImageView imageSpinnerArrow;
    @BindView
    TextView labelTitle;
    private write read;
    @BindView
    public CustomDropdownAwareSpinner spinner;
    @BindView
    public TextView textViewDescription;
    private ArrayAdapter<String> write;

    public interface IconCompatParcelizer {
        void IconCompatParcelizer();

        void write();
    }

    public interface write {
        void IconCompatParcelizer();
    }

    public void setOnCustomSpinnerWithTitleCompletion(IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$MediaItem = iconCompatParcelizer;
    }

    public void setOnCustomSpinnerWithTitleCompletion(IconCompatParcelizer iconCompatParcelizer, write write2) {
        this.MediaBrowserCompat$MediaItem = iconCompatParcelizer;
        this.read = write2;
    }

    public CustomSpinnerWithTitle(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.f84892131493716, this, true);
        ButterKnife.IconCompatParcelizer(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.CustomSpinnerWithTitle, 0, 0);
        this.MediaSessionCompat$QueueItem = obtainStyledAttributes.getString(3);
        this.RatingCompat = obtainStyledAttributes.getString(1);
        this.MediaMetadataCompat = obtainStyledAttributes.getResourceId(2, 0);
        obtainStyledAttributes.recycle();
        this.MediaBrowserCompat$ItemReceiver = new ArrayList();
        setHint(this.RatingCompat);
        setTitle(this.MediaSessionCompat$QueueItem);
        int i = this.MediaMetadataCompat;
        if (i != 0) {
            this.iconImage.setImageResource(i);
            this.iconImage.setVisibility(0);
        }
    }

    public CustomSpinnerWithTitle(Context context) {
        super(context);
    }

    public CustomSpinnerWithTitle(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setItems(List<String> list, boolean z, boolean z2) {
        IconCompatParcelizer();
        this.MediaBrowserCompat$ItemReceiver.clear();
        this.MediaBrowserCompat$ItemReceiver.addAll(list);
        if (z) {
            this.MediaBrowserCompat$ItemReceiver.add(0, this.RatingCompat);
        }
        this.IconCompatParcelizer = z2;
        this.write.notifyDataSetChanged();
    }

    public void setDropDownLayout(int i) {
        this.MediaBrowserCompat$SearchResultReceiver = i;
        IconCompatParcelizer();
    }

    public void setItemsWithPlaceholder(List<String> list, boolean z, boolean z2) {
        setItems(list, z, true);
        if (z2) {
            this.spinner.performClick();
        }
    }

    public void setItemsWithPlaceholder(List<String> list, boolean z) {
        setItemsWithPlaceholder(list, z, true);
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        if (TextUtils.isEmpty(this.RatingCompat) || this.spinner.getSelectedItemPosition() != 0) {
            return String.valueOf(this.spinner.getSelectedItem());
        }
        return null;
    }

    public void setMandatory(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    public void setSelectionIndex(int i) {
        this.spinner.setSelection(i);
    }

    @OnClick
    public void onClickSpinnerContainer() {
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$MediaItem;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.write();
        }
    }

    @OnClick
    public void onClickArrow() {
        if (this.read == null || !this.MediaBrowserCompat$ItemReceiver.isEmpty()) {
            this.spinner.performClick();
        } else {
            this.read.IconCompatParcelizer();
        }
    }

    @OnClick
    public void onIconClick(View view) {
        View.OnClickListener onClickListener = this.MediaSessionCompat$ResultReceiverWrapper;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    private void IconCompatParcelizer() {
        if (this.MediaBrowserCompat$SearchResultReceiver == 0) {
            this.MediaBrowserCompat$SearchResultReceiver = R.layout.f84812131493708;
        }
        if (this.MediaBrowserCompat$ItemReceiver == null) {
            this.MediaBrowserCompat$ItemReceiver = new ArrayList();
        }
        if (this.write == null) {
            C58355 r0 = new ArrayAdapter<String>(getContext(), this.MediaBrowserCompat$SearchResultReceiver, this.MediaBrowserCompat$ItemReceiver) {
                public final boolean isEnabled(int i) {
                    return !CustomSpinnerWithTitle.this.MediaDescriptionCompat || i > 0;
                }

                public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
                    View dropDownView = super.getDropDownView(i, view, viewGroup);
                    TextView textView = (TextView) dropDownView;
                    if (i != 0 || TextUtils.isEmpty(CustomSpinnerWithTitle.this.RatingCompat)) {
                        textView.setTextColor(setLastBaselineToBottomHeight.IconCompatParcelizer(getContext(), R.color.f67522131099908));
                    } else {
                        textView.setTextColor(CustomSpinnerWithTitle.this.getResources().getColor(CustomSpinnerWithTitle.this.MediaBrowserCompat$CustomActionResultReceiver));
                    }
                    return dropDownView;
                }

                public final View getView(int i, View view, ViewGroup viewGroup) {
                    View view2 = super.getView(i, view, viewGroup);
                    TextView textView = (TextView) view2;
                    if (i != 0 || (CustomSpinnerWithTitle.this.IconCompatParcelizer && TextUtils.isEmpty(CustomSpinnerWithTitle.this.RatingCompat))) {
                        textView.setTextColor(setLastBaselineToBottomHeight.IconCompatParcelizer(getContext(), R.color.f67522131099908));
                    } else {
                        textView.setTextColor(CustomSpinnerWithTitle.this.getResources().getColor(CustomSpinnerWithTitle.this.MediaBrowserCompat$CustomActionResultReceiver));
                    }
                    if (textView.getPaddingLeft() == textView.getPaddingRight()) {
                        textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), CustomSpinnerWithTitle.this.imageSpinnerArrow.getMeasuredWidth(), textView.getPaddingBottom());
                    }
                    return view2;
                }
            };
            this.write = r0;
            r0.setDropDownViewResource(R.layout.f84812131493708);
            this.spinner.setAdapter(this.write);
            this.spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                    CustomSpinnerWithTitle.this.textViewDescription.setVisibility(8);
                    if (CustomSpinnerWithTitle.this.MediaBrowserCompat$MediaItem != null) {
                        CustomSpinnerWithTitle.this.MediaBrowserCompat$MediaItem.IconCompatParcelizer();
                    }
                }

                public final void onNothingSelected(AdapterView<?> adapterView) {
                    CustomSpinnerWithTitle.this.textViewDescription.setVisibility(0);
                }
            });
        }
    }

    public void setHint(String str) {
        this.RatingCompat = str;
        this.textViewDescription.setHint(str);
    }

    public void setDropDownWidth(int i) {
        if (i > 0) {
            this.spinner.setDropDownWidth(i);
        }
    }

    public void setTitle(String str) {
        this.labelTitle.setVisibility(str == null ? 8 : 0);
        this.labelTitle.setText(str);
    }

    public void setHintTextColor(int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.textViewDescription.setHintTextColor(setLastBaselineToBottomHeight.read(getContext(), this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public void setEnabled(boolean z) {
        this.spinner.setEnabled(z);
        this.imageSpinnerArrow.setEnabled(z);
    }

    public void setForegroundFontEnabled(boolean z) {
        this.labelTitle.setTextColor(setLastBaselineToBottomHeight.read(getContext(), z ? R.color.f66092131099764 : R.color.f66182131099773));
        setEnabled(z);
    }

    public void setSpinnerBackground(Boolean bool) {
        if (bool.booleanValue()) {
            this.containerSpinner.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.shape_red_reounded_reactangle_border));
        } else {
            this.containerSpinner.setBackground(setLastBaselineToBottomHeight.write(getContext(), R.drawable.bg_spinner));
        }
    }

    public void setIconListener(View.OnClickListener onClickListener) {
        this.MediaSessionCompat$ResultReceiverWrapper = onClickListener;
    }

    public void setDisabledText(String str) {
        setHint(str);
        setEnabled(false);
    }

    public void setSpinnerEventsListener(CustomDropdownAwareSpinner.read read2) {
        this.spinner.setSpinnerEventsListener(read2);
    }
}
