package me.jingbin.byrecyclerview.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

import java.util.List;

import me.jingbin.byrecyclerview.R;
import me.jingbin.byrecyclerview.bean.DataItemBean;
import me.jingbin.byrecyclerview.databinding.ItemHomeBinding;
import me.jingbin.library.adapter.BaseRecyclerViewAdapter;
import me.jingbin.library.adapter.BaseRecyclerViewHolder;

/**
 * @author jingbin
 */
public class DataAdapter extends BaseRecyclerViewAdapter<DataItemBean> {

    public DataAdapter() {
    }

    public DataAdapter(List<DataItemBean> data) {
        super(data);
    }

    @NonNull
    @Override
    public BaseRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(parent, R.layout.item_home);
    }

    private class ViewHolder extends BaseRecyclerViewHolder<DataItemBean, ItemHomeBinding> {
        ViewHolder(ViewGroup viewGroup, int layoutId) {
            super(viewGroup, layoutId);
        }

        @Override
        public void onBindViewHolder(DataItemBean bean, final int position) {
            binding.tvText.setText(bean.getTitle());
        }
    }
}