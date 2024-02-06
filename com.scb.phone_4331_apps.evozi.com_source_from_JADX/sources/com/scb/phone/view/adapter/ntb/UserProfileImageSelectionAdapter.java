package com.scb.phone.view.adapter.ntb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p040o.onActivityCreated;
import p040o.onStart;

public final class UserProfileImageSelectionAdapter extends onActivityCreated {
    public List<String> MediaBrowserCompat$CustomActionResultReceiver;
    private Map<String, Integer> MediaBrowserCompat$ItemReceiver;

    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }

    public class ItemViewHolder_ViewBinding implements Unbinder {
        private ItemViewHolder MediaBrowserCompat$ItemReceiver;

        public ItemViewHolder_ViewBinding(ItemViewHolder itemViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = itemViewHolder;
            itemViewHolder.imageAvatar = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_avatar, "field 'imageAvatar'", ImageView.class);
        }

        public final void read() {
            ItemViewHolder itemViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (itemViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                itemViewHolder.imageAvatar = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public UserProfileImageSelectionAdapter(Map<String, Integer> map) {
        this.MediaBrowserCompat$ItemReceiver = map;
        this.MediaBrowserCompat$CustomActionResultReceiver = Arrays.asList(map.keySet().toArray(new String[map.size()]));
    }

    public final int getCount() {
        Map<String, Integer> map = this.MediaBrowserCompat$ItemReceiver;
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        String str = null;
        ItemViewHolder itemViewHolder = new ItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83472131493573, (ViewGroup) null));
        ImageView imageView = itemViewHolder.imageAvatar;
        Map<String, Integer> map = this.MediaBrowserCompat$ItemReceiver;
        List<String> list = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (list != null) {
            str = list.get(i);
        }
        imageView.setImageResource(map.get(str).intValue());
        View view = itemViewHolder.Keep;
        viewGroup.addView(view, 0);
        return view;
    }

    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    static class ItemViewHolder extends RecyclerView.setContentView {
        View Keep;
        @BindView
        ImageView imageAvatar;

        ItemViewHolder(View view) {
            super(view);
            this.Keep = view;
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
