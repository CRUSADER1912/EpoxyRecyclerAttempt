package com.crusader.epoxyrecyclerattempt.models;

import android.support.annotation.StringRes;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyHolder;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.crusader.epoxyrecyclerattempt.R;
import com.crusader.epoxyrecyclerattempt.models.ButtonModel.ButtonHolder;

/**
 * This model class gives an example of how to use a view holder pattern with your models.
 */
public class ButtonModel extends EpoxyModelWithHolder<ButtonHolder> {
    @EpoxyAttribute
    @StringRes
    int text;
    @EpoxyAttribute
    OnClickListener clickListener;

    @Override
    protected int getDefaultLayout() {
        return R.layout.model_button;
    }

//    @Override
//    public int getSpanSize(int totalSpanCount, int position, int itemCount) {
//        return totalSpanCount;
//    }

    @Override
    public void bind(ButtonHolder holder) {
        holder.button.setText(text);
        holder.button.setOnClickListener(clickListener);
    }

    @Override
    protected ButtonHolder createNewHolder() {
        return new ButtonHolder();
    }

    static class ButtonHolder extends EpoxyHolder {
        Button button;

        @Override
        protected void bindView(View itemView) {
            button = (Button) itemView.findViewById(R.id.button);
        }
    }
}
