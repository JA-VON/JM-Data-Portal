package com.javon.dataportaljm.dataset;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.javon.dataportaljm.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Javon Davis
 *         Created by Javon Davis on 28/06/2016.
 */

public class DatasetViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.titleView) public TextView titleView;
    @BindView(R.id.shortDescriptionView) public TextView shortDescriptionView;

    public DatasetViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
}
