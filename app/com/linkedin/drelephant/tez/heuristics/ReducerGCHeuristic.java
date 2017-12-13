package com.linkedin.drelephant.tez.heuristics;

import com.linkedin.drelephant.configurations.heuristic.HeuristicConfigurationData;
import com.linkedin.drelephant.tez.data.TezApplicationData;
import com.linkedin.drelephant.tez.data.TezTaskData;
import org.apache.log4j.Logger;


/**
 * Analyses garbage collection efficiency
 */
public class ReducerGCHeuristic extends GenericGCHeuristic {

    private static final Logger logger = Logger.getLogger(ReducerGCHeuristic.class);

    public ReducerGCHeuristic(HeuristicConfigurationData heuristicConfData) {
        super(heuristicConfData);
    }

    @Override
    protected TezTaskData[] getTasks(TezApplicationData data) {
        return data.getReduceTaskData();
    }

}
