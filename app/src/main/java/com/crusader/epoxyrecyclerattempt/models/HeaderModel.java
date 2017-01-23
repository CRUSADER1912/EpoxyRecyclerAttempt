package com.crusader.epoxyrecyclerattempt.models;

import android.support.annotation.StringRes;
import android.view.View;
import android.widget.TextView;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.crusader.epoxyrecyclerattempt.R;

public class HeaderModel extends EpoxyModelWithHolder<HeaderModel.HeaderHolder> {
    @EpoxyAttribute
    @StringRes
    int title;

    @Override
    protected int getDefaultLayout() {
        return R.layout.model_header;
    }

    @Override
    protected HeaderHolder createNewHolder() {
        return new HeaderHolder();
    }

    @Override
    public void bind(HeaderHolder holder) {
        holder.tvTitle.setText(title);
    }

//    @Override
//    public int getSpanSize(int totalSpanCount, int position, int itemCount) {
//        // We want the header to take up all spans so it fills the screen width
//        return totalSpanCount;
//    }

    static class HeaderHolder extends EpoxyHolder {
        TextView tvTitle;

        @Override
        protected void bindView(View itemView) {
            tvTitle = (TextView) itemView.findViewById(R.id.txt_title);
        }
    }
}
