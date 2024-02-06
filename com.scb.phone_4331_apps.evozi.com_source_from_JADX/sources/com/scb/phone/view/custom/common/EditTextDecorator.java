package com.scb.phone.view.custom.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import p040o.FundSummaryService;
import p040o.ZHER2K$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getGifts;
import p040o.getNextTransition;
import p040o.getSharedElementEnterTransition;
import p040o.isSupportFragmentClass;
import p040o.onCheckBoxClick;
import p040o.setLastBaselineToBottomHeight;
import p040o.show;
import p040o.submitMobileNumberPersonalInfo;
import p040o.submitRegistrationsMaritalStatus;

public class EditTextDecorator extends LinearLayout {
    public EditText IconCompatParcelizer;
    TextView MediaBrowserCompat$CustomActionResultReceiver;
    public ImageView MediaBrowserCompat$ItemReceiver;
    private FrameLayout MediaBrowserCompat$MediaItem;
    public List<EditTextDecorator$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private TextWatcher f3074x50fd9e4a;
    private TextWatcher MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public int MediaMetadataCompat;
    private TextView MediaSessionCompat$ResultReceiverWrapper;
    private View.OnFocusChangeListener RatingCompat;
    public TextView read;
    public List<IconCompatParcelizer> write;

    public interface IconCompatParcelizer {
        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);
    }

    public static /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(String str) {
        return str != null;
    }

    /* access modifiers changed from: private */
    public String write(String str) {
        isSupportFragmentClass issupportfragmentclass;
        if (str.length() <= 0) {
            return null;
        }
        show show = new show(this.MediaBrowserCompat$SearchResultReceiver);
        show show2 = new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, new getGifts(str)));
        show show3 = new show(show2.write, new getNextTransition(show2.IconCompatParcelizer, submitMobileNumberPersonalInfo.IconCompatParcelizer));
        if (show3.IconCompatParcelizer.hasNext()) {
            issupportfragmentclass = isSupportFragmentClass.read(show3.IconCompatParcelizer.next());
        } else {
            issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
        }
        if (!(issupportfragmentclass.IconCompatParcelizer != null)) {
            return null;
        }
        T t = issupportfragmentclass.IconCompatParcelizer;
        if (t != null) {
            return (String) t;
        }
        throw new NoSuchElementException("No value present");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
        String write2 = write(str);
        if (write2 != null) {
            this.read.setText(write2);
            read(true);
            return;
        }
        this.read.setText("");
        read(false);
    }

    public EditTextDecorator(Context context) {
        this(context, (AttributeSet) null);
    }

    public EditTextDecorator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompat$SearchResultReceiver = new ArrayList();
        this.write = new ArrayList();
        this.MediaDescriptionCompat = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                EditTextDecorator.this.MediaBrowserCompat$ItemReceiver.setVisibility(editable.length() > 0 ? 0 : 8);
                for (IconCompatParcelizer iconCompatParcelizer : EditTextDecorator.this.write) {
                    EditTextDecorator editTextDecorator = EditTextDecorator.this;
                    iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(editTextDecorator.write(editTextDecorator.IconCompatParcelizer.getText().toString()) == null);
                }
                if (EditTextDecorator.this.MediaBrowserCompat$CustomActionResultReceiver.getVisibility() == 0) {
                    EditTextDecorator.this.MediaBrowserCompat$CustomActionResultReceiver.setText(EditTextDecorator.this.getContext().getString(R.string.text_counter, new Object[]{Integer.valueOf(editable.length()), Integer.valueOf(EditTextDecorator.this.MediaMetadataCompat)}));
                }
                EditTextDecorator editTextDecorator2 = EditTextDecorator.this;
                editTextDecorator2.MediaBrowserCompat$CustomActionResultReceiver(editTextDecorator2.IconCompatParcelizer.getText().toString());
            }
        };
        this.f3074x50fd9e4a = new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (editable.length() > 10) {
                    EditTextDecorator.this.IconCompatParcelizer.setText(EditTextDecorator.this.IconCompatParcelizer.getText().toString().substring(0, 10));
                    EditTextDecorator.this.IconCompatParcelizer.setSelection(editable.length() - 1);
                }
                EditTextDecorator.this.MediaBrowserCompat$ItemReceiver.setVisibility(editable.length() > 0 ? 0 : 8);
                for (IconCompatParcelizer iconCompatParcelizer : EditTextDecorator.this.write) {
                    EditTextDecorator editTextDecorator = EditTextDecorator.this;
                    iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(editTextDecorator.write(editTextDecorator.IconCompatParcelizer.getText().toString()) == null);
                }
                if (EditTextDecorator.this.MediaBrowserCompat$CustomActionResultReceiver.getVisibility() == 0) {
                    EditTextDecorator.this.MediaBrowserCompat$CustomActionResultReceiver.setText(EditTextDecorator.this.getContext().getString(R.string.text_counter, new Object[]{Integer.valueOf(editable.length()), Integer.valueOf(EditTextDecorator.this.MediaMetadataCompat)}));
                }
                EditTextDecorator editTextDecorator2 = EditTextDecorator.this;
                editTextDecorator2.MediaBrowserCompat$CustomActionResultReceiver(editTextDecorator2.IconCompatParcelizer.getText().toString());
            }
        };
        this.RatingCompat = new FundSummaryService(this);
        setOrientation(1);
        LayoutInflater.from(context).inflate(R.layout.f91372131494364, this);
        this.MediaSessionCompat$ResultReceiverWrapper = (TextView) findViewById(R.id.tv_label);
        this.MediaBrowserCompat$ItemReceiver = (ImageView) findViewById(R.id.iv_close);
        this.read = (TextView) findViewById(R.id.tv_error);
        this.MediaBrowserCompat$CustomActionResultReceiver = (TextView) findViewById(R.id.tv_counter);
        this.MediaBrowserCompat$MediaItem = (FrameLayout) findViewById(R.id.fl_et_container);
        if (isInEditMode()) {
            read(true);
            this.MediaBrowserCompat$ItemReceiver.setVisibility(0);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ZHER2K$MediaBrowserCompat$CustomActionResultReceiver.EditTextDecorator, 0, 0);
        try {
            String string = obtainStyledAttributes.getString(1);
            if (string != null) {
                this.MediaSessionCompat$ResultReceiverWrapper.setText(string);
            }
            String string2 = obtainStyledAttributes.getString(0);
            if (string2 != null) {
                this.read.setText(string2);
            }
            int integer = obtainStyledAttributes.getInteger(2, 0);
            this.MediaMetadataCompat = integer;
            if (integer > 0) {
                this.MediaBrowserCompat$CustomActionResultReceiver.setVisibility(0);
                this.MediaBrowserCompat$CustomActionResultReceiver.setText(getContext().getString(R.string.text_counter, new Object[]{0, Integer.valueOf(this.MediaMetadataCompat)}));
            }
        } catch (Exception e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
        obtainStyledAttributes.recycle();
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            this.IconCompatParcelizer = (EditText) view;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
            layoutParams2.gravity = 17;
            this.MediaBrowserCompat$MediaItem.addView(this.IconCompatParcelizer, 0, layoutParams2);
            this.IconCompatParcelizer.addTextChangedListener(this.MediaDescriptionCompat);
            this.IconCompatParcelizer.setOnFocusChangeListener(this.RatingCompat);
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener(new submitRegistrationsMaritalStatus(this));
            return;
        }
        super.addView(view, i, layoutParams);
    }

    private void read(boolean z) {
        this.read.setVisibility(z ? 0 : 8);
        this.IconCompatParcelizer.setBackgroundDrawable(setLastBaselineToBottomHeight.write(getContext(), z ? R.drawable.shape_red_reounded_reactangle_border : R.drawable.shape_gray_rounded_rectangle));
    }

    public void setLabelText(String str) {
        this.MediaSessionCompat$ResultReceiverWrapper.setText(str);
    }

    public void setErrorText(String str) {
        this.read.setText(str);
    }

    public void setPhoneNumberTextWatcher() {
        this.IconCompatParcelizer.addTextChangedListener(this.f3074x50fd9e4a);
    }
}
