package com.javon.dataportaljm.dataset;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.javon.dataportaljm.R;
import com.javon.dataportaljm.models.Dataset;

import java.util.ArrayList;

/**
 * @author Javon Davis
 *         Created by Javon Davis on 28/06/2016.
 */

public class DatasetListAdapter extends RecyclerView.Adapter<DatasetViewHolder> {

    private ArrayList<Dataset> mDatasets;

    public DatasetListAdapter(ArrayList<Dataset> datasets)
    {
        this.mDatasets = datasets;
    }

    @Override
    public DatasetViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_dataset, parent, false);
        return new DatasetViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DatasetViewHolder holder, int position) {
        Dataset dataset = mDatasets.get(position);

        holder.titleView.setText(dataset.getName());
        holder.shortDescriptionView.setText(dataset.getShortDescription());
    }

    @Override
    public int getItemCount() {
        return mDatasets.size();
    }
}
