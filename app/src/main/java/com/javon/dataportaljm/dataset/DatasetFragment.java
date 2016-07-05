package com.javon.dataportaljm.dataset;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.javon.dataportaljm.R;
import com.javon.dataportaljm.models.Dataset;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Javon Davis
 */
public class DatasetFragment extends Fragment {

    @BindView(R.id.datasetRecyclerView) RecyclerView datasetList;

    public static DatasetFragment newInstance()
    {
        DatasetFragment datasetFragment = new DatasetFragment();

        //add arguements here
        return datasetFragment;
    }

    public DatasetFragment() {

        if(getArguments() != null)
        {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dataset, container, false);
        ButterKnife.bind(this, view);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        datasetList.setLayoutManager(mLayoutManager);

        ArrayList<Dataset> datasets = new ArrayList<>();

        String dummyShort = getResources().getString(R.string.dummy_text_short);
        String dummyLong = getResources().getString(R.string.dummy_text_long);

        datasets.add(new Dataset(dummyShort, dummyLong));
        datasets.add(new Dataset(dummyShort, dummyLong));

        datasetList.setAdapter(new DatasetListAdapter(datasets));
        return view;
    }
}
