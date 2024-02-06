package com.scb.phone.view.custom.login;

import android.view.View;
import android.widget.Button;
import butterknife.Unbinder;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class CustomKeypad_ViewBinding implements Unbinder {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private CustomKeypad MediaBrowserCompat$ItemReceiver;
    private View MediaBrowserCompat$MediaItem;
    private View MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private View f5441x50fd9e4a;
    private View MediaDescriptionCompat;
    private View MediaMetadataCompat;
    private View MediaSessionCompat$QueueItem;
    private View MediaSessionCompat$ResultReceiverWrapper;
    private View RatingCompat;
    private View write;

    public CustomKeypad_ViewBinding(CustomKeypad customKeypad, View view) {
        final CustomKeypad customKeypad2 = customKeypad;
        View view2 = view;
        this.MediaBrowserCompat$ItemReceiver = customKeypad2;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view2, R.id.button_0, "method 'onNumberClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomKeypad.this.onNumberClick((Button) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onNumberClick", Button.class));
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view2, R.id.button_1, "method 'onNumberClick'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomKeypad.this.onNumberClick((Button) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onNumberClick", Button.class));
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view2, R.id.button_2, "method 'onNumberClick'");
        this.write = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomKeypad.this.onNumberClick((Button) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onNumberClick", Button.class));
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view2, R.id.button_3, "method 'onNumberClick'");
        this.MediaMetadataCompat = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomKeypad.this.onNumberClick((Button) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onNumberClick", Button.class));
            }
        });
        View IconCompatParcelizer6 = onStart.IconCompatParcelizer(view2, R.id.button_4, "method 'onNumberClick'");
        this.MediaBrowserCompat$MediaItem = IconCompatParcelizer6;
        IconCompatParcelizer6.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomKeypad.this.onNumberClick((Button) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onNumberClick", Button.class));
            }
        });
        View IconCompatParcelizer7 = onStart.IconCompatParcelizer(view2, R.id.button_5, "method 'onNumberClick'");
        this.RatingCompat = IconCompatParcelizer7;
        IconCompatParcelizer7.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomKeypad.this.onNumberClick((Button) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onNumberClick", Button.class));
            }
        });
        View IconCompatParcelizer8 = onStart.IconCompatParcelizer(view2, R.id.button_6, "method 'onNumberClick'");
        this.MediaBrowserCompat$SearchResultReceiver = IconCompatParcelizer8;
        IconCompatParcelizer8.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomKeypad.this.onNumberClick((Button) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onNumberClick", Button.class));
            }
        });
        View IconCompatParcelizer9 = onStart.IconCompatParcelizer(view2, R.id.button_7, "method 'onNumberClick'");
        this.MediaDescriptionCompat = IconCompatParcelizer9;
        IconCompatParcelizer9.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomKeypad.this.onNumberClick((Button) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onNumberClick", Button.class));
            }
        });
        View IconCompatParcelizer10 = onStart.IconCompatParcelizer(view2, R.id.button_8, "method 'onNumberClick'");
        this.f5441x50fd9e4a = IconCompatParcelizer10;
        IconCompatParcelizer10.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomKeypad.this.onNumberClick((Button) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onNumberClick", Button.class));
            }
        });
        View IconCompatParcelizer11 = onStart.IconCompatParcelizer(view2, R.id.button_9, "method 'onNumberClick'");
        this.MediaSessionCompat$QueueItem = IconCompatParcelizer11;
        IconCompatParcelizer11.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomKeypad.this.onNumberClick((Button) onStart.MediaBrowserCompat$CustomActionResultReceiver((Object) view, "doClick", "onNumberClick", Button.class));
            }
        });
        View IconCompatParcelizer12 = onStart.IconCompatParcelizer(view2, R.id.button_delete, "method 'onDelete'");
        this.MediaSessionCompat$ResultReceiverWrapper = IconCompatParcelizer12;
        IconCompatParcelizer12.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CustomKeypad.this.onDelete();
            }
        });
        customKeypad2.lines = onStart.write(onStart.IconCompatParcelizer(view2, R.id.vertical_line_1, "field 'lines'"), onStart.IconCompatParcelizer(view2, R.id.vertical_line_2, "field 'lines'"), onStart.IconCompatParcelizer(view2, R.id.vertical_line_3, "field 'lines'"), onStart.IconCompatParcelizer(view2, R.id.vertical_line_4, "field 'lines'"), onStart.IconCompatParcelizer(view2, R.id.vertical_line_5, "field 'lines'"), onStart.IconCompatParcelizer(view2, R.id.vertical_line_6, "field 'lines'"), onStart.IconCompatParcelizer(view2, R.id.vertical_line_7, "field 'lines'"), onStart.IconCompatParcelizer(view2, R.id.vertical_line_8, "field 'lines'"), onStart.IconCompatParcelizer(view2, R.id.horizontal_line_1, "field 'lines'"), onStart.IconCompatParcelizer(view2, R.id.horizontal_line_2, "field 'lines'"), onStart.IconCompatParcelizer(view2, R.id.horizontal_line_3, "field 'lines'"));
        customKeypad2.buttons = onStart.write(onStart.IconCompatParcelizer(view2, R.id.button_0, "field 'buttons'"), onStart.IconCompatParcelizer(view2, R.id.button_1, "field 'buttons'"), onStart.IconCompatParcelizer(view2, R.id.button_2, "field 'buttons'"), onStart.IconCompatParcelizer(view2, R.id.button_3, "field 'buttons'"), onStart.IconCompatParcelizer(view2, R.id.button_4, "field 'buttons'"), onStart.IconCompatParcelizer(view2, R.id.button_5, "field 'buttons'"), onStart.IconCompatParcelizer(view2, R.id.button_6, "field 'buttons'"), onStart.IconCompatParcelizer(view2, R.id.button_7, "field 'buttons'"), onStart.IconCompatParcelizer(view2, R.id.button_8, "field 'buttons'"), onStart.IconCompatParcelizer(view2, R.id.button_9, "field 'buttons'"), onStart.IconCompatParcelizer(view2, R.id.button_delete, "field 'buttons'"));
    }

    public final void read() {
        CustomKeypad customKeypad = this.MediaBrowserCompat$ItemReceiver;
        if (customKeypad != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            customKeypad.lines = null;
            customKeypad.buttons = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompat$MediaItem.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$MediaItem = null;
            this.RatingCompat.setOnClickListener((View.OnClickListener) null);
            this.RatingCompat = null;
            this.MediaBrowserCompat$SearchResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.f5441x50fd9e4a.setOnClickListener((View.OnClickListener) null);
            this.f5441x50fd9e4a = null;
            this.MediaSessionCompat$QueueItem.setOnClickListener((View.OnClickListener) null);
            this.MediaSessionCompat$QueueItem = null;
            this.MediaSessionCompat$ResultReceiverWrapper.setOnClickListener((View.OnClickListener) null);
            this.MediaSessionCompat$ResultReceiverWrapper = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
